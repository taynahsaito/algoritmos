public class Lista {
    private No primeiro;

    //construtor padrão
    public No getPrimeiro(){ //devolve uma ref de nó
        return primeiro;
    }
    public void setPrimeiro(No primeiro){
        this.primeiro = primeiro;
    }

    //estamos trabalhando com referencia, faz sentido usar null
    public boolean estaVazia(){
        return primeiro == null;
    }
    
    public void insereInicio(int i){
        No novo = new No(i);
        if (!estaVazia()){
            primeiro = novo;
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

    //para iterar uma lista não pode mexer no primeiro elemento, pois ele tem os endereços dos próximos (cada um deles guarda o endereço do proximo na variavel de referencia)
    @Override
    public String toString(){
        String s = "lista: ";
        if(estaVazia()){
            s += "vazia";
        }
        else{
            //a variavel aux recebe a copia do endereço do primeiro elemento:
            No aux = primeiro;
            while (aux != null){//varre a lista até o final
                s = s + aux;
                aux = aux .getProximo();
            }
            s = s + "\\";
        }
        //promessa do toString:
        return s;
    }
    public void insereFim(int i){
        No novo = new No(i);
        if(estaVazia()){
            primeiro = novo;
        }
        else{
            No aux = primeiro; //ref de nó
            while(aux.getProximo() != null){
                aux = aux.getProximo(); //posicionando ao ultimo elemento
            }
            aux.setProximo(novo); //altera o proximo e recebe o novo elemento criado
        }
    }
    public int removeInicio(){
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return temp;
    }
    public int removeFim(){
        //caso especial: um elemento só
        int temp;
        if (primeiro.getProximo() == null){
            temp = primeiro.getInfo();
            primeiro = null;
        }
        else{
            //percorrer ate encontrar o ultimo
            No aux = primeiro;
            while (aux.getProximo().getProximo() != null) {
                aux = aux.getProximo();
            }
            temp = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return temp;
    }
}
