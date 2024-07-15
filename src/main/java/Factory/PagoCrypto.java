package Factory;

public class PagoCrypto implements IPago{
    
    @Override
    public void crearPago(){
        System.out.println("Se ha creado un pago tipo Cryptomonedas");
    }
}
