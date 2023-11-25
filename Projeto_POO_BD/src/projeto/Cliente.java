package projeto;

public class Cliente {

    //atributos
    private int iD;
    private String nome;
    private String telefone;

   //construtor
    public Cliente(int iD, String nome, String telefone) {
        this.iD = iD;
        this.nome = nome;
        this.telefone = telefone;
    }

    //getts e setts
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
