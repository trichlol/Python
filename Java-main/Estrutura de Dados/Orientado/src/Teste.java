public class Teste {
    public static void main(String args[]){

        ListaDeInteiros lista1 = new ListaDeInteiros(5);
        
        try{
            lista1.adicionaFinal(1000);
            lista1.adicionaFinal(501);
            System.out.println(lista1.toString());
            lista1.adicionaFinal(76);
            lista1.adicionaFinal(88);
            lista1.adicionaFinal(775);
            System.out.println(lista1.toString());
            int x = lista1.removeFinal();
            System.out.println("Elemento Removido " + x);
            System.out.println(lista1.toString());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}