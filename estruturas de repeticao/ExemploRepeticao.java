import java.util.Random;

public class ExemploRepeticao{

    public static void main(String[] args) {
        Random gerador = new Random();
        double nota1, nota2;
        //inicialização (incluindo, a declaração)
        //teste de continuidade
        //incremento
        for( int totalAlunos = 1; totalAlunos <=5 ; totalAlunos++) { // int dentro só do for // totalAlunos +=2 de dois em dois
            nota1 = gerador.nextDouble() *10;
            nota2 = gerador.nextDouble() *10;
            System.out.println(
                String.format("Média: %.2f",  (nota1 + nota2) /2)
            );
        }
        int totalAlunos =1;
        while(totalAlunos <= 5){
            nota1 = gerador.nextDouble() *10;
            nota2 = gerador.nextDouble() *10;
            System.out.println(
                String.format("Média: %.2f",  (nota1 + nota2) /2)
            );
            totalAlunos++; // + = 2;
        }
        ////repetição controlada por contador
        //int totalAlunos = 1;
        ////içamento
        ////hoist
        //while (totalAlunos <= 5){
        //    //[0.0, 1.0)
        //    nota1 = gerador.nextDouble() * 10;
        //    nota2 = gerador.nextDouble() * 10;
        //    double resultado = (nota1 + nota2) / 2;
        //    System.out.printf("Média: %.2f\n", resultado);

        //  ++totalAlunos;

        //  //totalAluno++;
        //  //totalAluno += 1;
        //  //totalAlunos = totalAlunos + 1 ;
        //}
        System.out.println("Até mais");
    }
}