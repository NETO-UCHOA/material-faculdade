
public class Produto {

    //Atributos (caracteristicas)
    private String nome;
    private double preco;
    private String codigo;

    //Metodos (ações, comprotamentos)
    //criar uma função
    public void exibirDetalhes(){
        System.out.println(nome);
        System.out.println(codigo);
        System.out.println(preco);


    }
    //metodo construtor
    public Produto(){}

    public Produto(String nome){
        this.nome = nome;
    }
    //criado com o botão direito do mouse "source Action / Criar construtores"

    public Produto(String nome, double preco, String codigo){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    //metodo get e set

        public void setNome(String nome){

        this.nome = nome;

    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome(){

        return nome;
    }


}