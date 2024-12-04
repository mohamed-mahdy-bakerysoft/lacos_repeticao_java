public class Main {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50};

        for (int i = 0; i <= 4; i++) {
            System.out.println("Valor da posição " + i + " usando FOR: " + vetor[i]);
        }

        int j = 0;
        while(j <= 4) {
            System.out.println("Valor da posição " + j + " usando WHILE: " + vetor[j]);
            j++;
        }

        int n = 0;
        do {
            System.out.println("Valor da posição " + n + " usando DO WHILE: " + vetor[n]);
            n++;
        } while (n <= 4);
    }
}