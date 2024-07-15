package Prototype;

public class ComputadorBuilder implements IComputadorBuilder{
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
    
    public ComputadorBuilder(){
        
    }
    
    public IComputadorBuilder setMarca(String Marca){
        this.Marca = Marca;
        return this;
    }
    public IComputadorBuilder setModelo(String Modelo){
        this.Modelo = Modelo;
        return this;
    }
    public IComputadorBuilder setTipoDisco(String TipoDisco){
        this.TipoDisco = TipoDisco;
        return this;
    }
    public IComputadorBuilder setTamanoDisco(String TamanoDisco){
        this.TamanoDisco = TamanoDisco;
        return this;
    }
    public IComputadorBuilder setTipoRAM(String TipoRAM){
        this.TipoRAM = TipoRAM;
        return this;
    }
    public IComputadorBuilder setTamanoRAM(String TamanoRAM){
        this.TamanoRAM = TamanoRAM;
        return this;
    }
    public IComputadorBuilder setTipoCPU(String TipoCPU){
        this.TipoCPU = TipoCPU;
        return this;
    }
    public IComputadorBuilder setModeloCPU(String ModeloCPU){
        this.ModeloCPU = ModeloCPU;
        return this;
    }
    public IComputadorBuilder setNumeroNucleos(String NumeroNucleos){
        this.NumeroNucleos = NumeroNucleos;
        return this;
    }
    public IComputadorBuilder setGHerciosPorNucleo(String GHerciosPorNucleo){
        this.GHerciosPorNucleo = GHerciosPorNucleo;
        return this;
    }
    public IComputadorBuilder setTipoGPU(String TipoGPU){
        this.TipoGPU = TipoGPU;
        return this;
    }
    public IComputadorBuilder setModeloGPU(String ModeloGPU){
        this.ModeloGPU = ModeloGPU;
        return this;
    }
    public IComputadorBuilder setNumeroNucleosCuda(String NumeroNucleosCuda){
        this.NumeroNucleosCuda = NumeroNucleosCuda;
        return this;
    }

    public Computador build(){
        return new Computador(Marca, Modelo);
    }
    
}
