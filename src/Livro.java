public class Livro {

    private String Titulo;
    private String Descricao;
    private  String isbn;
    private  boolean Capadura;
    public void setTitulo(String titulo){
        this.Titulo = titulo;
    }
    public void setDescricao(String descricao){
        this.Descricao = descricao;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public String getTitulo() {
        return Titulo;
    }
}
