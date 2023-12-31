import java.time.LocalDate;

public class Ecomerce {
    public static void main(String[] args) {
        //criação do objetos "livro" do tipo "produto"
        Produto livro = new Produto();

        //atribuir valor aos atributos de "livro"
        livro.setNome("Livro Java Web");
        livro.setCodigo("1234abc-xvz");
        livro.setPreco (39,9);

        //Acessando os valors dos atributos de "livro"

        livro.exibirDetalhes();

        Usuario usuario = new Usuario(null, null, null, null, null);

        usuario.setNome("neto");
        usuario.setDatadenascimento(LocalDate.of(1977, 5, 14));

        usuario.exibirDetalhes();








    }




}
