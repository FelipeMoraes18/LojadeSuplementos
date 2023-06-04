package principal.interno;
public class CadastroCliente {
  
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    
    public CadastroCliente(String nome, String cpf, String email, String telefone) {
      this.nome = nome;
      this.cpf = cpf;
      this.email = email;
      this.telefone = telefone;
    }
    
    public String getNome() {
      return nome;
    }
    
    public String getCpf() {
      return cpf;
    }
    
    public String getEmail() {
      return email;
    }
    
    public String getTelefone() {
      return telefone;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }
  
    public void comprarProduto(ProdutoSuplemento produto, int quantidade) {
  }

 }
    
  