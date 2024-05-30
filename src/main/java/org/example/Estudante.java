package org.example;

public class Estudante {

    private Integer idade;
    private Double nota;

    public Estudante(Integer idade, Double nota) {
        this.idade = idade;
        this.nota = nota;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return
                "idade=" + idade +
                ", nota=" + nota
                ;
    }
}
