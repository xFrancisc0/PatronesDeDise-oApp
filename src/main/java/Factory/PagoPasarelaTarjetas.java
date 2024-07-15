package Factory;

public class PagoPasarelaTarjetas implements IPago{
    
    @Override
    public void crearPago(){
        System.out.println("Se ha creado un pago tipo Pasarela de Tarjetas de debito o Crédito");
    }
}
