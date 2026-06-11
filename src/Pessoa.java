public class Pessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome , int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa: " + this.getNome() + " idade " + this.getIdade() + "(";
    }
}
