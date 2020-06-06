import java.security.Signature;
import java.util.Random;

public class Pessoa implements Observer{
    private String name;
    private String signatureType;
    private boolean Leave = false;
    private Random gerador = new Random();

    //Constructor
    public Pessoa(String name, String signatureType)
    {
        this.name = name;
        this.signatureType =  signatureType;
    }

    //Update
    @Override
    public void update(String e) {
        System.out.println(e);
        //0.1
        Leave =  gerador.nextDouble() >= 0.9;
    }

    public String getSignatureType()
    {
        return signatureType;
    }

    public boolean Leave()
    {
        return this.Leave;
    }
}