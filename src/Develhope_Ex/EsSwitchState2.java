package Develhope_Ex;

public class EsSwitchState2 {
    public static void main(String[] args) {
        opChar('l');
    }

    public static void opChar(char opCh) {
        switch (opCh) {
            case '+':
                System.out.println("Addizione");
                break;
            case '-':
                System.out.println("Sottrazione");
                break;
            case '/':
                System.out.println("Divisione");
                break;
            case '*':
                System.out.println("Moltiplicazione");
                break;
            default:
                System.out.println("Inserire un char per operazione algebrica (+, -, *, /)");
        }
    }
}
