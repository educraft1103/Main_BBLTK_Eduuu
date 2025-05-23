public class Book {
    private String titulo;
    private String ID;
    private String autor;
    private int ano;
    private boolean disponibilidade;
    
    //CONSTRUTOR
    public Book(String titulo, String ID, String autor, int ano){
          this.titulo = titulo;
          this.ID = ID;
          this.autor = autor;
          this.ano = ano;
          this.disponibilidade = true;      
    }
    //GETTERS
    public String geTtitulo()
    {
        return titulo;
    }
    public int geTID()
    {
        return ID;
    }
    public String geTautor()
    {
        return autor;
    }
    public int geTano()
    {
        return ano;
    }
    public boolean isDisponibilidade()
    {
        return disponibilidade;
    }
    
    //SETTER
    public void setDisponivel(boolean disponivel){
        this.disponibilidade = disponivel;
    }
    
    //METODO EXIBIR
    public void exibir(){
        System.out.println("O livro de nome" +titulo+ "de ID" +ID+ "do autor" +autor+ "publicado" +ano+ "esta aqui!" +disponibilidade);
    }
}

