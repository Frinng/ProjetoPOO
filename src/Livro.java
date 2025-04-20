public class Livro {

    private String Titulo;
    private String Descricao;
    private  String isbn;
    private  boolean Capadura;
    public void setTitulo(String titulo, String isbn, String descricao){
        this.Titulo = titulo;
        this.Descricao = descricao;
        this.isbn = isbn;
    }
    public String getTitulo() {
        return Titulo;
    }
}
