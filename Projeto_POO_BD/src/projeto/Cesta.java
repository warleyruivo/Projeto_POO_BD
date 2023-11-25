package projeto;

public class Cesta{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //métodos
    public void addCestaDoces(Doces doces){
        System.out.println("Adicionando doce "+doces.getNome());
    }

    public void addCestaDocesAzedos(DocesAzedos docesAzedos){
        System.out.println("Adicionando doce azedo "+docesAzedos.getNome());
    }

    public void addCestaChocolates(Chocolates chocolates){
        System.out.println("Adicionando chocolate "+chocolates.getNome());
    }
}
