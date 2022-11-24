import org.example.Exercicio3_Nota;
import org.example.Exercicio3_UC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteUC {

    private Exercicio3_UC ex3UC;

    @BeforeEach
    public void setup(){
        ex3UC = new Exercicio3_UC("UCteste", 10 );
    }


    @ParameterizedTest
    @CsvSource(value = {"123, 10", "124, 8", "125, 20", "126, 15"})
    public void testInserirNota(int nrAluno, int nota){
        ex3UC.insereNotaUC(nrAluno, nota);
        Exercicio3_Nota[] notas = ex3UC.getNotas();
        int count = ex3UC.getCount() -1;
        boolean isInserido = notas[count].getNumAluno() == nrAluno && notas[count].getNota() == nota;
        assertTrue(isInserido);
    }

    @ParameterizedTest
    @CsvSource(value ={"123, 10", "124, 8", "125, 20", "126, 15", "129, 15"})
    public void testPesquisarAluno(int nrAluno, int nota){
        ex3UC.insereNotaUC(nrAluno, nota);
        int notaTeste = ex3UC.pesquisaAluno(nrAluno);
        assertEquals(notaTeste, nota);
    }

    @ParameterizedTest
    @CsvSource(value={"10,15,20", "11,12,13", "14,15,16", "8,10,12"})
    public void testeMedia(int nota1, int nota2, int nota3){
        ex3UC.insereNotaUC(123, nota1);
        ex3UC.insereNotaUC(124, nota2);
        ex3UC.insereNotaUC(125, nota3);
        int media = (nota1+nota2+nota3)/3;
        int mediaTeste = ex3UC.media();
        assertEquals(media, mediaTeste);
    }

    @ParameterizedTest
    @CsvSource(value={"123, 10, true", "124, 8, false", "125, 20, true", "126, 15, true", "129, 15, true"})
    public void calculaAprovacao(int nrAluno, int nota, boolean aprovacao){
        ex3UC.insereNotaUC(nrAluno, nota);
        boolean aprovacaoTeste = ex3UC.aprovado(nrAluno);
        assertEquals(aprovacaoTeste, aprovacao);
    }


}
