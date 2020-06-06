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
    	
    	
    	
    	////Jos� e Jo�o (Assinantes do Estad�o)
        ArrayList<String> assinaturasEstadao = new ArrayList<>();
        assinaturasEstadao.add("di�riamente");
        assinaturasEstadao.add("finais de semana");

        Editora estadao =  new Editora("Estad�o", assinaturasEstadao);
        estadao.novoAssinante(new Pessoa("Jos�","di�riamente"));
        estadao.novoAssinante(new Pessoa("Joao", "finais de semana"));
        estadao.iniciar();


    }
}