package Factory;

public class PagoFactory{
    public PagoFactory(){
        
    }
    
    public IPago crearPago(EnumPago tipoPago){
        IPago instance = null;
        switch(tipoPago){
            case CRYPTO -> instance = new PagoCrypto();
            case PASARELA -> instance = new PagoPasarelaTarjetas();
            case PAYPAL -> instance = new PagoPaypal();
            case TRANSFERENCIA -> instance = new PagoTransferenciaBancaria();
        }
        return instance;
    }  
}
