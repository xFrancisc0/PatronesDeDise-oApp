package Factory;

public class PagoPaypal implements IPago{
    
    @Override
    public void crearPago(){
        System.out.println("Se ha creado un pago tipo Paypal");
    }
}
