import java.util.Scanner;

public class CalculadoraIRPF {
    public static void main(String[] args) {
        int init = 0;

   while(init < 1) {
       System.out.println("\n\nQual o seu salario?");
       System.out.println("Digite 0 Para sair do sistema.");
       Scanner input = new Scanner(System.in);
       double salario = input.nextDouble();
       double descontoGov = 564.80;
       double ResultadoFin = salario - descontoGov;
       double aliquota1 = 2259.21;
       double aliquota2 = 2826.65;
       double aliquota3 = 3751.05;
       double aliquota4 = 4664.68;
       double aliquota5 = 4664.68;

       if (salario <= 0){
           System.out.println("Saindo do sistema...");
           break;
       }

       if (ResultadoFin < aliquota1) {
           double baseDeCalculo = ResultadoFin;
           double CalculoFinal = baseDeCalculo - aliquota1;
           double CalculoFinalIR = CalculoFinal;
           System.out.println("Você é isento a pagar o imposto de renda!\n\n");
       }

       if (ResultadoFin > aliquota1 && ResultadoFin < aliquota2) {
           double baseDeCalculo = ResultadoFin;
           double CalculoFinalIR = (baseDeCalculo - aliquota1) * 0.075;
           System.out.println("Você tem que pagar de imposto de renda: " + CalculoFinalIR);
       }


       if (ResultadoFin > aliquota2 && ResultadoFin < aliquota3) {
           double baseDeCalculo = ResultadoFin;
           double CalculoFinalIR = (baseDeCalculo - aliquota2) * 0.15;
           System.out.println("Você tem que pagar de imposto de renda: " + CalculoFinalIR);
       }


       if (ResultadoFin > aliquota2 && ResultadoFin < aliquota3) {
           double baseDeCalculo = ResultadoFin;
           double CalculoFinalIR = (baseDeCalculo - aliquota3) * 0.225;
           System.out.println("Você tem que pagar de imposto de renda: " + CalculoFinalIR);
       }


       if (ResultadoFin > aliquota3) {
           double baseDeCalculo = ResultadoFin;
           double CalculoFinalIR = (baseDeCalculo - aliquota4) * 0.275;
           System.out.println("Você tem que pagar de imposto de renda: " + CalculoFinalIR);
       }


     }
   }
}