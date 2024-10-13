package pessoas;

// Classe Pessoa
public class Pessoa {
	//Atributos da classe Pessoa
    private String nome;
    private String cpf;
    private double peso;
    private double altura;

  //Construtor da classe Pessoa
    public Pessoa(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setAltura(double altura) { this.altura = altura; }
}
