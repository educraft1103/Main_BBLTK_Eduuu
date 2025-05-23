//CLASSE PARA CRIAR ADM.
public class ADM {
     private String nome;
    private int cadastro;
    private String email;
    private String cargo;
    
    //CONSTRUTOR
    public ADM(String nome, int cadastro, String email, String cargo){
        this.nome = nome;
        this.cadastro = cadastro;
        this.email = email;
        this.cargo = cargo;
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
    public String geTcargo()
    {
        return cargo;
    }
}

