import java.util.Random;

public class MeuVetor {
    private double[] v;
    private int ultimaPos;

    public MeuVetor (int capacidade) {
        v = new double[capacidade];
        ultimaPos = -1;
    }

    //métodos de acesso
    public int getUltimaPos(){
        return ultimaPos;
    }

    //[] significa que é um vetor.
    public double[] getV(){
        return v;
    }
    
    //métodos modificadores
    public void setUltimaPos(int pos){
        if (pos >= 0 && pos < v.length) {
            ultimaPos = pos;
        }
        else {
            ultimaPos = v.length - 1;
        }
    }
    public boolean estaCheio () {
        if (ultimaPos == v.length - 1)
            return true;
        else //o else não é necessário, pois se a condição do if nao for verdadeira, vai direto para o outro return
            return false;

        //todo esse código de if else pode ser substituido por:
        //return ultimaPos == v.length - 1;
    }

    // neste caso, o vetor está fixo:
    // public boolean add (int elemento) {
    //     if (estaCheio())
    //         return false;
    //     ultimaPos++;
    //     v[ultimaPos]= elemento;
    //     return true;
    // }

    // sobrecarga é uma forma de polimorfismo parmetrico, sobrecarga é só parametro.

    public boolean estaVazio() {
        if (ultimaPos == -1)
            return true;
        return false;
    }

    //JVM cuida da memória (tamanho dos vetores)

    public void resetVetor(){
        ultimaPos =-1;
    }

    //método para adicionar elemento no vetor - precisa estar preparado para receber um inteiro e um double (sobrecarga no bloco de baixo)
    public void add (int elemento){
        if (estaCheio()){
            redimensiona(v.length * 2);
        }
        v[++ultimaPos] = elemento; //pré incremento = resolve o ++ primeiro
    }

    //sobrecarga de método:
    public void add(double elemento){
        if (estaCheio()){
            redimensiona(v.length*2);
        }
        v[++ultimaPos] = elemento;
    }

    //metodo para remover elemento/espaço do vetor
    public double remove () {
        if (estaVazio()) return 0; //não faz nada
        double aux = v[ultimaPos--]; 
        if (v.length>= 10 && ultimaPos <= v.length/4) { //se for menor que 10, nao conseguimos redimensionar mais, pois há o numero 0
            redimensiona(v.length/2);
        }
        return aux; //retorna o elemento tirado da ultima posição
    }

    //método para redimensionar o vetor para uma nova capacidade
    private void redimensiona (int novaCapacidade) {
        double[] temp = new double[novaCapacidade];
        for (int i=0; i<=ultimaPos; i++){
            temp[i] = v[i]; //a cada posicao i, receber o v na posição i
        }
        v = temp;
    }


    @Override //aviso para o desenvolvedor que não pode mexer na assinatura (public String toString()) do método, o conteudo do metodo pode ser mudado
    public String toString() {
        String s = ""; //criamos a string pois precisamos devolvê-la depois
        if (estaVazio()){
            s = s + "esta vazio";
        }
        else {
            for (int i=0; i<=ultimaPos; i++){
                s = s + String.format("%.0f ", v[i]); //%.0f = quantos digitos forem necessarios, com 0 casas decimais
            }
        }
        s = s + "\n";
        return s;
    }

    //os inteiros estão contido nos reais, mas os reais não estão contidos nos inteiros. -> o comando math.random cria um valor double, se definirmos o vetor como um inteiro, dará um erro 
    public void preencheVetor() {
        Random r = new Random();
        for (int i=0; i<v.length; i++){
            add(r.nextInt(v.length*10)+1); //os metodos da classe random não são estáticos, então precisamos instânciá-los
        }
    }
}