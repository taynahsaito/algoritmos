public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();


        // System.out.println("lista foi construida\n" + lista);
        // for (int i=1;i<6;i++){
        //     lista.insereInicio(i*10);
        //     System.out.println(lista);
        // }
        for (int i=1;i<6;i++){
            lista.insereFim(i*10 + 5);
            System.out.println(lista);
        }
        if (!lista.estaVazia()){
            System.out.println(lista.removeInicio() + " foi removido do inicio");
            System.out.println(lista);
        }
        else{
            System.out.println(lista);
        }
        if (!lista.estaVazia()){
            System.out.println(lista.removeFim() + " foi removido do fim");
            System.out.println(lista);
        }
        else{
            System.out.println(lista);
        }
        // while (!lista.estaVazia()) {
        //     System.out.println(lista.removeInicio() + " saiu do inicio");
        //     System.out.println(lista);
        // }
        while (!lista.estaVazia()) {
            System.out.println(lista.removeFim() + " saiu do fim");
            System.out.println(lista);
        }
    }
}
