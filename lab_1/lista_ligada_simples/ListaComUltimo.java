public class ListaComUltimo extends Lista {
    private No ultimo;
    //construtor padrão
    public No getUltimo(){
        return ultimo;
    }
    @Override
    public void insereFim (int i){
        No novo = new No(i);
        if (estaVazia()){
            setPrimeiro(novo);
        }
        ultimo = novo;
    }
    //exercicio: implementar os outros metodos (insereInicio, removeInicio, removeFim)
    @Override
    public int removeFim(){
        int info = ultimo.getInfo();
        if (super.getPrimeiro() == ultimo){
            setPrimeiro(null);
            ultimo = null;
        }
        else{
            No temp = super.getPrimeiro();
            while (temp.getProximo() != ultimo) {
                temp = temp.getProximo();
            }
            temp.setProximo(null);
        }
        return info;
    }
}
