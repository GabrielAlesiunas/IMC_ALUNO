package pessoas;

// Classe aluno
public class Aluno extends Pessoa {
	//Atributos da classe aluno com herança da classe Pessoa
    private double nota;
    private double percentualPresenca;

    //Construtor da classe aluno
    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
        super(nome, cpf, peso, altura);
        this.nota = nota;
        this.percentualPresenca = percentualPresenca;
    }

    // Getters e Setters
    public double getNota() { return nota; }
    public double getPercentualPresenca() { return percentualPresenca; }

    public void setNota(double nota) { 
    	this.nota = nota; 
    	}
    
    public void setPercentualPresenca(double percentualPresenca) { 
    	this.percentualPresenca = percentualPresenca; 
    	}
}
