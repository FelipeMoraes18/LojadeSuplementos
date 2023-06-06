package principal.interno;

public class CadastroClienteBuilder {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public CadastroClienteBuilder() {
    }

    public CadastroClienteBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public CadastroClienteBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public CadastroClienteBuilder email(String email) {
        this.email = email;
        return this;
    }

    public CadastroClienteBuilder telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public CadastroCliente build() {
        return new CadastroCliente(nome, cpf, email, telefone);
    }
}

