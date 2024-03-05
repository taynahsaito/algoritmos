public class Teste {
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(10);
        System.out.println("ultima posicao depois de instanciar: " + v1.getUltimaPos());
        // getUltimaPos();
        v1.setUltimaPos(27);
        System.out.println("ultima posicao depois do 27: " + v1.getUltimaPos());
        // getUltimaPos();

        //isso retorna como string automaticamente:
        System.out.println(v1);

        // if (v1.add(12)){
        //     System.out.println("Elemento inserido com sucesso");
        // }
        // else{
        //     System.out.println("O vetor esta cheio");
        // }
        
        for (int n=0; n<100; n++){
            v1.add(n);
            System.out.println("capacidade atual: " + v1.getV().length); 
        }
        
        System.out.println("\n\n");

        while (!v1.estaVazio()) { //while not v1.estaVszio
            v1.remove();
            System.out.println("capacidade atual: " + v1.getV().length); //quando chamamos o metodo getV, temos como retorno a ref na memoria do vetor v
        }
    }
    //classe pai do java é o object

    //polimorfismo dinamico: quando vc muda os parametros, resolvido em tempo de execução, por isso é dinamico.
    //polimorfismo estatico: é resolvido em tempo de compilação, temos a sobrescrita
    //polimorfismo parametrico: parametrico generico, defino na hora que instancio o objeto


}
