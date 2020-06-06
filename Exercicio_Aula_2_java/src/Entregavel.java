import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Random;

public class Entregavel implements Subject{
    private String conteudo;
    private List <Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void informObserver(Calendar myDate) {
        List <Observer> aux = new ArrayList<>();

        int dayOfWeek = myDate.get (Calendar.DAY_OF_WEEK);
        boolean Weekend = ((dayOfWeek == Calendar.SATURDAY) || (dayOfWeek == Calendar.SUNDAY));
        boolean Monday = dayOfWeek >= Calendar.MONDAY;

        for(Observer o : observers)
        {
            String sigType = ((Pessoa)o).getSignatureType();

            if(sigType.equals("weekend") && Weekend){ o.update(conteudo); }
            else if(sigType.equals("weekly") && Monday) { o.update(conteudo); }
            else if(sigType.equals("daily")) { o.update(conteudo); }

            //Verificação de assinatura
            if(!((Pessoa)o).Leave())
            {
                aux.add(o);
            }}
        observers.clear();
        observers.addAll(aux);
    }
   

    public void iniciar()
    {
        System.out.println("Iniciando processamento...\n");

        Calendar myDate = Calendar.getInstance();

        while(true)
        {
            if(!observers.isEmpty()) {
            	
                this.conteudo = getSaltString();
                informObserver(myDate);
                myDate.add(Calendar.DAY_OF_YEAR, 1);
            }
            else
            {
                System.out.println("\nFalimos!!! :(\n");
                break;
            }
        }
    }
    
    
    String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}