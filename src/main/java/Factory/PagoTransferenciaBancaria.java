package Factory;

public class PagoTransferenciaBancaria implements IPago{
    
    @Override
    public void crearPago(){
        System.out.println("Se ha creado un pago tipo Transferencia Bancaria.");
    }
}
