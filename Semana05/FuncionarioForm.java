import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

// Modelo Funcionario
class Funcionario {
    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }
}

// Modelo da Tabela
class FuncionarioTableModel extends AbstractTableModel {
    private final String[] colunas = {"Nome", "Departamento", "Salário"};
    private final List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
        fireTableRowsInserted(funcionarios.size() - 1, funcionarios.size() - 1);
    }

    @Override
    public int getRowCount() {
        return funcionarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario f = funcionarios.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> f.getNome();
            case 1 -> f.getDepartamento();
            case 2 -> f.getSalario();
            default -> null;
        };
    }
}

// Interface Gráfica
public class FuncionarioForm extends JFrame {
    private final JTextField txtNome = new JTextField(15);
    private final JTextField txtDepartamento = new JTextField(15);
    private final JTextField txtSalario = new JTextField(10);
    private final FuncionarioTableModel tableModel = new FuncionarioTableModel();

    public FuncionarioForm() {
        super("Cadastro de Funcionários");

        setLayout(new BorderLayout());

        // Painel de entrada
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(txtNome);

        inputPanel.add(new JLabel("Departamento:"));
        inputPanel.add(txtDepartamento);

        inputPanel.add(new JLabel("Salário:"));
        inputPanel.add(txtSalario);

        JButton btnAdicionar = new JButton("Adicionar");
        inputPanel.add(btnAdicionar);

        add(inputPanel, BorderLayout.NORTH);

        // Tabela
        JTable tabela = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane, BorderLayout.CENTER);

        // Ação do botão
        btnAdicionar.addActionListener(e -> adicionarFuncionario());

        // Configuração da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void adicionarFuncionario() {
        try {
            String nome = txtNome.getText();
            String departamento = txtDepartamento.getText();
            double salario = Double.parseDouble(txtSalario.getText());

            Funcionario f = new Funcionario(nome, departamento, salario);
            tableModel.adicionarFuncionario(f);

            // Limpar os campos
            txtNome.setText("");
            txtDepartamento.setText("");
            txtSalario.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Salário inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FuncionarioForm::new);
    }
}
