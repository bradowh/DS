import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;


// Classe modelo
class Aluno {
    private int id;
    private String nome;
    private String email;
    private String curso;
    private String genero;
    private boolean receberEmail;
    private boolean receberNotificacao;
    private String rua;
    private String cidade;

    // Getters e Setters

    public int getId(){
        return id;

    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isReceberEmail() {
        return receberEmail;
    }

    public void setReceberEmail(boolean receberEmail) {
        this.receberEmail = receberEmail;
    }

    public boolean isReceberNotificacao() {
        return receberNotificacao;
    }

    public void setReceberNotificacao(boolean receberNotificacao) {
        this.receberNotificacao = receberNotificacao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}

// Classe principal

public class JanelaPrincipal extends JFrame {
    private JTextField campoNome, campoEmail, campoRua, campoCidade;
    private JComboBox<String> comboCurso;
    private JCheckBox checkEmail, checkNotificacao;
    private JRadioButton radioMasc, radioFem;
    private JButton btnCadastrar, btnLimpar;


    private JTable tabela;
    private DefaultTableModel modeloTabela;


    public JanelaPrincipal() {
        setTitle("Sistema de Cadastro de Alunos");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Menu
        JMenuBar barra = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem itemSair = new JMenuItem("Sair");
        itemSair.addActionListener(e -> System.exit(0));
        menuArquivo.add(itemSair);

        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuItem itemSobre = new JMenuItem("Sobre");
        itemSobre.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Sistema de Cadastro de Alunos\nCRUD Completo\nVersão 2.0"));
        menuAjuda.add(itemSobre);

        barra.add(menuArquivo);
        barra.add(menuAjuda);
        setJMenuBar(barra);

        // Abas
        JTabbedPane abas = new JTabbedPane();

        // Painel Cadastro
        JPanel painelCadastro = new JPanel(new GridLayout(7, 2));
        painelCadastro.add(new JLabel("Nome:"));
        campoNome = new JTextField(20);
        painelCadastro.add(campoNome);

        painelCadastro.add(new JLabel("Email:"));
        campoEmail = new JTextField(20);
        painelCadastro.add(campoEmail);

        painelCadastro.add(new JLabel("Curso:"));
        String[] cursos = {"Java", "Python", "C#", "JavaScript"};
        comboCurso = new JComboBox<>(cursos);
        painelCadastro.add(comboCurso);

        painelCadastro.add(new JLabel("Gênero:"));
        JPanel painelGenero = new JPanel();
        radioMasc = new JRadioButton("Masculino");
        radioFem = new JRadioButton("Feminino");
        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(radioMasc);
        grupoGenero.add(radioFem);
        painelGenero.add(radioMasc);
        painelGenero.add(radioFem);
        painelCadastro.add(painelGenero);

        checkEmail = new JCheckBox("Receber emails");
        checkNotificacao = new JCheckBox("Ativar notificações");
        painelCadastro.add(checkEmail);
        painelCadastro.add(checkNotificacao);

        painelCadastro.add(new JLabel("Rua:"));
        campoRua = new JTextField(20);
        painelCadastro.add(campoRua);

        painelCadastro.add(new JLabel("Cidade:"));
        campoCidade = new JTextField(20);
        painelCadastro.add(campoCidade);

        JPanel painelBotoes = new JPanel();
        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnLimpar);

        JPanel painelCadastroCompleto = new JPanel(new BorderLayout());
        painelCadastroCompleto.add(painelCadastro, BorderLayout.CENTER);
        painelCadastroCompleto.add(painelBotoes, BorderLayout.SOUTH);

        abas.add("Cadastro", painelCadastroCompleto);

        // Painel Lista
        modeloTabela = new DefaultTableModel(new Object[]{"ID", "Nome", "Email", "Curso", "Cidade"}, 0);
        tabela = new JTable(modeloTabela);
        JButton btnAtualizar = new JButton("Atualizar");
        JButton btnExcluir = new JButton("Excluir");
        JPanel painelListaBotoes = new JPanel();
        painelListaBotoes.add(btnAtualizar);
        painelListaBotoes.add(btnExcluir);

        JPanel painelLista = new JPanel(new BorderLayout());
        painelLista.add(new JScrollPane(tabela), BorderLayout.CENTER);
        painelLista.add(painelListaBotoes, BorderLayout.SOUTH);
        abas.add("Lista de Alunos", painelLista);

        // Ações
        btnCadastrar.addActionListener(e -> cadastrarAluno());
        btnLimpar.addActionListener(e -> limparCampos());
        btnAtualizar.addActionListener(e -> atualizarAluno());
        btnExcluir.addActionListener(e -> excluirAluno());
        getContentPane().add(abas);
        carregarTabela();
        setVisible(true);
    }

    private void cadastrarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText());
        aluno.setEmail(campoEmail.getText());
        aluno.setCurso((String) comboCurso.getSelectedItem());
        aluno.setGenero(radioMasc.isSelected() ? "Masculino" : "Feminino");
        aluno.setReceberEmail(checkEmail.isSelected());
        aluno.setReceberNotificacao(checkNotificacao.isSelected());
        aluno.setRua(campoRua.getText());
        aluno.setCidade(campoCidade.getText());
        new AlunoDAO().salvar(aluno);
        carregarTabela();
        limparCampos();
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
    }

    private void carregarTabela() {
        modeloTabela.setRowCount(0);
        List<Aluno> lista = new AlunoDAO().listar();
        for (Aluno a : lista) {
            modeloTabela.addRow(new Object[]{a.getId(), a.getNome(), a.getEmail(), a.getCurso(), a.getCidade()});
        }
    }

    private void atualizarAluno() {
        int linha = tabela.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um aluno para atualizar.");
            return;
        }
        int id = (int) tabela.getValueAt(linha, 0);
        String novoNome = JOptionPane.showInputDialog("Novo nome:", tabela.getValueAt(linha, 1));
        String novoEmail = JOptionPane.showInputDialog("Novo email:", tabela.getValueAt(linha, 2));
        Aluno aluno = new Aluno();
        aluno.setId(id);
        aluno.setNome(novoNome);
        aluno.setEmail(novoEmail);
        aluno.setCurso((String) tabela.getValueAt(linha, 3));
        aluno.setCidade((String) tabela.getValueAt(linha, 4));
        new AlunoDAO().atualizar(aluno);
        carregarTabela();
        JOptionPane.showMessageDialog(this, "Aluno atualizado com sucesso!");
    }

    private void excluirAluno() {
        int linha = tabela.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um aluno para excluir.");
            return;
        }
        int id = (int) tabela.getValueAt(linha, 0);
        new AlunoDAO().excluir(id);
        carregarTabela();
        JOptionPane.showMessageDialog(this, "Aluno excluído com sucesso!");
    }

    private void limparCampos() {
        campoNome.setText("");
        campoEmail.setText("");
        campoRua.setText("");
        campoCidade.setText("");
        comboCurso.setSelectedIndex(0);
        radioMasc.setSelected(false);
        radioFem.setSelected(false);
        checkEmail.setSelected(false);
        checkNotificacao.setSelected(false);
    }

    public static void main(String[] args) {
        new JanelaPrincipal();
    }
}




