public class TesteDeslocamento {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(10);
        for (int i = 10; i <= 50; i+=10) {// i +=0 -> insere de 10 em 10 (20, 40, 50)
            v1.add(i);
            System.out.println(v1);
       }
       
       v1.add(100, 37);
       System.out.println(v1);

       v1.add(200, 2);
       System.out.println(v1);

       System.out.println(v1.remove(3) + " saiu da posicao 3");

       for (int i = 1; i <= 4; i++){
        v1.add(5, 2*i);
       }
       System.out.println(v1);
       
       v1.remove(5.0);
       System.out.println(v1);
    }
}