import java.util.Arrays;


public class Conjunto extends Conjuntos{

    int tamanio;
    int contador;
    int[] conj;

    public Conjunto (int tamanio){
        super();
        this.tamanio = tamanio;
        conj = new int[tamanio];
        contador = 0;
        System.out.println("Conjunto creado correctamente");
    }
    public void agregar(int elemento){
    if(!pertenece(elemento))
        if(contador < tamanio){
            conj[contador] = elemento;
            contador++;
            System.out.println("elemento agregado");
        }else{
            System.out.println("Este conjunto ya se encuentra lleno");
        }
    else {
            System.out.println("Este elemento no pertenece al conjunto");
        }
    }

    public boolean pertenece (int elemento){
        for(int i = 0; i < contador; i++){
            if(elemento == conj[i]) {
                return true;
            }
        }
        return false;
    }

    public void eliminar (int elemento) {
        int pos = -1;
        for (int i = 0; i < contador; i++) {
            if (elemento == conj[i]) {
                pos = i;
                break;
            }
        }
        if(pos != -1) {
            for (int i = pos; i < contador -1; i++) {
                conj[i] = conj[i + 1];
            }
            conj[contador - 1] = 0;
            System.out.println("Elemento eliminado");
        }
    }
    public void imprimir () {
            System.out.println("Los elementos de este conjunto son = ");
            for(int i = 0; i < contador; i++){
                System.out.println(" " + conj[i] + ",");
            }

    }
    public void vaciar() {
        contador = 0;
        conj = new int[tamanio];
        System.out.println("El conjunto se ha vacioado con exito");
    }

    public void vacio(){
        if(contador == 0){
            System.out.println("El conjunto esta vacio");

        } else {
            System.out.println("El conjunto no esta vacio");
        }


    }
}
