public class programaPrincipal

public class void main(String args[]){

    Scanner input = new Scanner (System.in);

    System.out.println("[1] - SOMA, [2] - SUBTRAÇÃO, [3] - MULTIPLICAÇÃO, [4] - DIVISÃO, [5] - SAIR ")

    int opcao = input.nextInt();

    Calculadora cal = new Calculadora();
    double n1, n2;
    while(opção !=5)
    {
        if (opcao ==1){
            System.out.println("Informe o primeiro numero: ");
            n1 = input.nextDouble();
            System.out.println("Informe o segundo numero: ");
            n2 = input.nextDouble();
            cal.setNumeros(n1, n2);
            System.out.println("Soma = " +cal.Soma());
        }

        else if (opcao ==2){
            System.out.println("Informe o primeiro numero: ");
            n1 = input.nextDouble();
            System.out.println("Informe o segundo numero: ");
            n2 = input.nextDouble();
            cal.setNumeros(n1, n2);
            System.out.println("Subtração = " -cal.Subtração());
        }

        else if (opcao ==3){
            System.out.println("Informe o primeiro numero: ");
            n1 = input.nextDouble();
            System.out.println("Informe o segundo numero: ");
            n2 = input.nextDouble();
            cal.setNumeros(n1, n2);
            System.out.println("Multiplicação = " *cal.Multiplicação());
        }

        else if (opcao ==4){
            System.out.println("Informe o primeiro numero: ");
            n1 = input.nextDouble();
            System.out.println("Informe o segundo numero: ");
            n2 = input.nextDouble();
            cal.setNumeros(n1, n2);
            System.out.println("Divisão = " /cal.Divisão());
        }

        System.out.println("[1] - SOMA, [2] - SUBTRAÇÃO, [3] - MULTIPLICAÇÃO, [4] - DIVISÃO, [5] - SAIR ")

        int opcao = input.nextInt();
    }

    System.out.println("Obrigado por utilizar minha calculadora.")




}