package projeto;

public class Doces {

    //atribuições
    private String nome;
    private int id;
    private float preco;

    //Construtor
    public Doces(String nome, int id, float preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    //métodos
    public void mostraInfos(){
        System.out.println("Nome: "+getNome());
        System.out.println("Preço: "+getPreco());
    }

    //getts e setts
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
