import java.util.ArrayList;
import java.util.Arrays;

public class PontoInicial {
    public static void main(String[] args)
    {
        
        //Maria (Assinante de Marie Claire)
        ArrayList<String> assinaturasMC = new ArrayList<>();
        assinaturasMC.add("semanal");

        Editora marieClaire = new Editora("Marie Claire", assinaturasMC);
        marieClaire.novoAssinante(new Pessoa("Maria", "semanal"));
        marieClaire.iniciar();
    	
    	
    	
    	////José e João (Assinantes do Estadão)
        ArrayList<String> assinaturasEstadao = new ArrayList<>();
        assinaturasEstadao.add("diáriamente");
        assinaturasEstadao.add("finais de semana");

        Editora estadao =  new Editora("Estadão", assinaturasEstadao);
        estadao.novoAssinante(new Pessoa("José","diáriamente"));
        estadao.novoAssinante(new Pessoa("Joao", "finais de semana"));
        estadao.iniciar();


    }
}