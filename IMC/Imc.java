import java.util.Scanner;

class Imc { 
    public static void main(String args[]) {
    
        Scanner lerTeclado = new Scanner(System.in); 
        System.out.println("Informe o seu nome:");
        String nome = lerTeclado.nextLine();
        System.out.println("Informe a sua altura:");
        Double altura = lerTeclado.nextDouble();
        System.out.println("Informe o seu peso:");
        Double peso = lerTeclado.nextDouble();
        System.out.println("Informe o seu gênero:");
        char genero = lerTeclado.next().charAt(0);
        lerTeclado.close();

        double Imc = peso / (Math.pow(altura, 2));
        System.out.println("Seu IMC é: " + Imc); 

       if (genero == 'M' || genero == 'm'){
            if(Imc >= 40 ){
                System.out.println("Obesidade Mórbida");
            }
            if((Imc >= 30) && (Imc <= 39.9)){
                System.out.println("Obesidade Moderada");
            }
            if((Imc >= 25) && (Imc <= 29.9)){
                System.out.println("Obesidade Leve");
            }
            if((Imc >= 20) && (Imc <= 24.9)){
                System.out.println("Normal");
            } else {
                System.out.println("Abaixo Normal");
            }
       }
       if (genero == 'F' || genero == 'f' || genero == 'N' || genero == 'n'){
            if(Imc >= 39 ){
                System.out.println("Obesidade Mórbida");
            }
            if((Imc >= 29) && (Imc <= 38.9)){
                System.out.println("Obesidade Moderada");
            }
            if((Imc >= 24) && (Imc <= 28.9)){
                System.out.println("Obesidade Leve");
            }
            if((Imc >= 19) && (Imc <= 23.9)){
                System.out.println("Normal");
            } else {
                System.out.println("Abaixo Normal");
            }
        }    
    }    
}