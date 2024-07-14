package Prototype;

public class Computador {
    private String Marca;
    private String Modelo;
    private String TipoDisco;
    private String TamanoDisco;
    private String TipoRAM;
    private String TamanoRAM;
    private String TipoCPU;
    private String ModeloCPU;
    private String NumeroNucleos;
    private String GHerciosPorNucleo;
    private String TipoGPU;
    private String ModeloGPU;
    private String NumeroNucleosCuda;
    
    Computador(String Marca, String Modelo){
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    
    public String getMarca(){
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public String getTipoDisco(){
        return TipoDisco;
    }
    public String getTamanoDisco(){
        return TamanoDisco;
    }
    public String getTipoRAM(){
        return TipoRAM;
    }
    public String getTamanoRAM(){
        return TamanoRAM;
    }
    public String getTipoCPU(){
        return TipoCPU;
    }
    public String getModeloCPU(){
        return ModeloCPU;
    }
    public String getNumeroNucleos(){
        return NumeroNucleos;
    }
    public String getGHerciosPorNucleo(){
        return GHerciosPorNucleo;
    }
    public String getTipoGPU(){
        return TipoGPU;
    }
    public String getModeloGPU(){
        return ModeloGPU;
    }
    public String getNumeroNucleosCuda(){
        return NumeroNucleosCuda;
    }
    
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public void setTipoDisco(String TipoDisco){
        this.TipoDisco = TipoDisco;
    }
    public void setTamanoDisco(String TamanoDisco){
        this.TamanoDisco = TamanoDisco;
    }
    public void setTipoRAM(String TipoRAM){
        this.TipoRAM = TipoRAM;
    }
    public void setTamanoRAM(String TamanoRAM){
        this.TamanoRAM = TamanoRAM;
    }
    public void setTipoCPU(String TipoCPU){
        this.TipoCPU = TipoCPU;
    }
    public void setModeloCPU(String ModeloCPU){
        this.ModeloCPU = ModeloCPU;
    }
    public void setNumeroNucleos(String NumeroNucleos){
        this.NumeroNucleos = NumeroNucleos;
    }
    public void setGHerciosPorNucleo(String GHerciosPorNucleo){
        this.GHerciosPorNucleo = GHerciosPorNucleo;
    }
    public void setTipoGPU(String TipoGPU){
        this.TipoGPU = TipoGPU;
    }
    public void setModeloGPU(String ModeloGPU){
        this.ModeloGPU = ModeloGPU;
    }
    public void setNumeroNucleosCuda(String NumeroNucleosCuda){
        this.NumeroNucleosCuda = NumeroNucleosCuda;
    }
    
    public Computador clone(){
        Computador Computadorclon = new Computador(this.Marca, this.Modelo);
        
        Computadorclon.TipoDisco = this.TipoDisco;
        Computadorclon.TamanoDisco = this.TamanoDisco;
        Computadorclon.TipoRAM = this.TipoRAM;
        Computadorclon.TamanoRAM = this.TamanoRAM;  
        Computadorclon.TipoCPU = this.TipoCPU;  
        Computadorclon.ModeloCPU = this.ModeloCPU;
        Computadorclon.NumeroNucleos = this.NumeroNucleos;
        Computadorclon.GHerciosPorNucleo = this.GHerciosPorNucleo;
        Computadorclon.TipoGPU = this.TipoGPU;
        Computadorclon.ModeloGPU = this.ModeloGPU;
        Computadorclon.NumeroNucleosCuda = this.NumeroNucleosCuda;
        
        return Computadorclon;
    }
}
