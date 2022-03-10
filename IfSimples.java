import java.util.Scanner;
public class IfSimples{
    public static void main(String[] args) {
        //variável referência
        Scanner leitor;
        //isso constrói um objeto do tipo Scanner
        //new é semelhante ao malloc da linguagem C
        //temos em funcionamento o Garbage Collector
        leitor = new Scanner (System.in);
        double nota;
        System.out.printf ("Digite a sua nota\n");
        nota = leitor.nextDouble();
        if (nota >= 6){
            System.out.println ("Parabéns"); 
            System.out.println ("Aprovado");
        }
        leitor.close();

    }
}