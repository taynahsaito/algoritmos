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
}
