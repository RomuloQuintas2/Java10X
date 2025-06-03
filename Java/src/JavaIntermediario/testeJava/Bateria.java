package testeJava;

public class Bateria {

    public static int getBatery(int eventos[], int bateria) {

        for (int evento : eventos) {

            bateria += evento;

            if (bateria >= 100) {
                bateria = 100;
            } else if (bateria <= 0) {
                bateria = 0;
            }
        }
        return bateria;
    }

    public static void main(String[] args) {
        int bateria = 50;
        int[] eventos = {10, -20, 61, -15};
        int bateriaSainda = getBatery(eventos, bateria);
        System.out.println("saida: "+bateriaSainda+"%");
    }
}
