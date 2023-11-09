import java.time.LocalDate;

public class Produto {
    // Atributos
    private int id;
    private int codigo;
    private String nome;
    private String descricao;
    private String fornecedor;
    private LocalDate dataDeCadastro;

    // Construtor
    public Produto(int id, int codigo, String nome, String descricao, String fornecedor, LocalDate dataDeCadastro) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.dataDeCadastro = dataDeCadastro;
    }

    // Métodos de acesso (getters e setters)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
}