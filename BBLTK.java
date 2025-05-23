//O IMPORT DO ARRAY 
import java.util.ArrayList;
//CLASSE DA BIBLIOTECA
public class BBLTK {
    //CRIANDO LISTAS DE ARMAZENAMENTO
    ArrayList<Book> livro = new ArrayList<Book>();
    ArrayList<ADM> adiministrador = new ArrayList<ADM>();
    ArrayList<User> usuario = new ArrayList<User>();
    
    //METODOS PARA BUSCAR LIVROS POR ID
    public void cadatrarLivro(Book novoBook){
        for(Book livro : livro){
            if(livro.geTID()==novoBook.geTID());
            System.out.println("ERRO! Esse ISBN já está cadastrado.");
            return;
        }
    }

   