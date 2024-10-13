package main;

import pessoas.Aluno;
import utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Aluno
        Aluno aluno = new Aluno("Gabriel Alesiunas", "48109301819", 58.0, 1.71, 8.5, 95.0);

        // Testando a verificação de CPF
        System.out.println("CPF válido? " + FuncoesUteis.verificarCpf(aluno.getCpf()));

        // Testando o cálculo de IMC com a tabela
        String resultadoIMC = FuncoesUteis.calcularIMC(aluno.getPeso(), aluno.getAltura());
        System.out.println("Resultado do IMC: " + resultadoIMC);

        // Testando a avaliação do aluno
        String resultadoAluno = FuncoesUteis.avaliarAluno(aluno.getNota(), aluno.getPercentualPresenca());
        System.out.println("Resultado do aluno: " + resultadoAluno);
    }
}
