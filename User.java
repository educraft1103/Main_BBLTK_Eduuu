public class User {
    private String nome;
    private int cadastro;
    private String email;
    
    //CONSTRUTOR
    public User(String nome, int cadastro, String email){
        this.nome = nome;
        this.cadastro = cadastro;
        this.email = email;
    }
    
    //GETTER
    public String geTnome()
    {
        return nome;  
    }
    public int geTcadastro()
    {
        return cadastro;
    }
    public String geTemail()
    {
        return email;
    }    
}

