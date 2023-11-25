package projeto;

public class Loja {

    private int id;
    private String nome;

    private Doces[] doce = new Doces[5];
    private DocesAzedos[] docesAzedo = new DocesAzedos[5];

    private Chocolates[] chocolate = new Chocolates[5];

    public Loja(Doces[] doce, Chocolates[] chocolate, DocesAzedos[] docesAzedo){
        for (int i = 0; i < doce.length; i++) {
            doce[i] = doce[i];
        }
        for (int i = 0; i < chocolate.length; i++) {
            chocolate[i] = chocolate[i];
        }
        for (int i = 0; i < docesAzedo.length; i++) {
            docesAzedo[i] = docesAzedo[i];
        }
    }

    //getts e setts
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Doces[] getDoce() {
        return doce;
    }

    public void setDoce(Doces[] doce) {
        this.doce = doce;
    }

    public DocesAzedos[] getDocesAzedo() {
        return docesAzedo;
    }

    public void setDocesAzedo(DocesAzedos[] docesAzedo) {
        this.docesAzedo = docesAzedo;
    }

    public Chocolates[] getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolates[] chocolate) {
        this.chocolate = chocolate;
    }
}
