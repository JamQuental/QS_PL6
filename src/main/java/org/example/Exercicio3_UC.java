package org.example;

public class Exercicio3_UC {
    String nomeUC;
    Exercicio3_Nota[] notas;
    int totalAlunos;
    int count;

    public Exercicio3_UC(String nomeUC, int totalAlunos) {
        this.nomeUC = nomeUC;
        this.totalAlunos = totalAlunos;
        notas = new Exercicio3_Nota[totalAlunos];
        count = 0;
    }

    public void insereNotaUC(int numAluno, int nota){
        Exercicio3_Nota newN = new Exercicio3_Nota(numAluno, nota);
        notas[count++] = newN;
    }
    public int pesquisaAluno(int numAluno){
        for(int i = 0; i < count; i++){
            if(notas[i].getNumAluno() == numAluno) {
                return notas[i].getNota();
            }
        }
        return -1;
    }
    public int media(){
        int media = 0;
        for(int i = 0; i < count; i++){
            media += notas[i].getNota();
        }
        media = media/count;
        return media;
    }
    public boolean aprovado(int numAluno){
        for(int i=0; i<count; i++){
            if(notas[i].getNumAluno() == numAluno){
                if(notas[i].getNota() > 9.5){
                    return true;
                }
            }
        }
        return false;
    }

    public String getNomeUC() {
        return nomeUC;
    }

    public Exercicio3_Nota[] getNotas() {
        return notas;
    }

    public int getTotalAlunos() {
        return totalAlunos;
    }

    public int getCount() {
        return count;
    }
}
