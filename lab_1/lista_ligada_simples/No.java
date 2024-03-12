//listas linkadas (linked lists)
public class No{
    private int info;
    //definição recursiva de tipo:
    private No proximo; //cada nó aponta para o próximo

    public No (int info) {
        setInfo(info);
        proximo = null; //só por clareza
    }

    public int getInfo(){
        return info;
    }

    public No getProximo(){
        return proximo;
    }

    public void setInfo(int info){
        this.info = info;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString(){
        return "|" + info + "|->";
    }
}