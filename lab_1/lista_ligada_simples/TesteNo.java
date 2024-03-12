public class TesteNo {
    public static void main(String[] args) {
        //duas variáveis de referência para alocação de memória (no1, no2):
        No no1 = new No(10);
        No no2 = new No(20); 
        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);

        no1.setProximo(no2);
        System.out.println("\ne agora?\n" + no1.getProximo());

        no2.setProximo(no2);
        System.out.println("\ne agora?\n" + no2.getProximo());

    }
}
