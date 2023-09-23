import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int parametroUm = scanner.nextInt(); //Recebe o primeiro número

        System.out.print("Digite o segundo numero inteiro: ");
        int parametroDois = scanner.nextInt(); //Recebe o segundo número

        try{
            contar(parametroUm, parametroDois); //chama o método "contar" para fazer a validação dos parâmetros e realizar a contagem dos números
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //Faz a validação se o parametroUm é maior que o parametroDois
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            //Caso nao haja exceções, imprime os números com base na variável "contagem"
            int contagem = parametroDois - parametroUm;
            for(int numero = 0; numero < contagem; numero++){
                System.out.println("Imprimindo o numero " + (numero + 1));
            }
        }
    }
}
