package Prototype;

public class ComputadorBuilder implements ComputadorBuilderInterface{
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
    
    public ComputadorBuilderInterface setMarca(String Marca){
        this.Marca = Marca;
        return this;
    }
    public ComputadorBuilderInterface setModelo(String Modelo){
        this.Modelo = Modelo;
        return this;
    }
    public ComputadorBuilderInterface setTipoDisco(String TipoDisco){
        this.TipoDisco = TipoDisco;
        return this;
    }
    public ComputadorBuilderInterface setTamanoDisco(String TamanoDisco){
        this.TamanoDisco = TamanoDisco;
        return this;
    }
    public ComputadorBuilderInterface setTipoRAM(String TipoRAM){
        this.TipoRAM = TipoRAM;
        return this;
    }
    public ComputadorBuilderInterface setTamanoRAM(String TamanoRAM){
        this.TamanoRAM = TamanoRAM;
        return this;
    }
    public ComputadorBuilderInterface setTipoCPU(String TipoCPU){
        this.TipoCPU = TipoCPU;
        return this;
    }
    public ComputadorBuilderInterface setModeloCPU(String ModeloCPU){
        this.ModeloCPU = ModeloCPU;
        return this;
    }
    public ComputadorBuilderInterface setNumeroNucleos(String NumeroNucleos){
        this.NumeroNucleos = NumeroNucleos;
        return this;
    }
    public ComputadorBuilderInterface setGHerciosPorNucleo(String GHerciosPorNucleo){
        this.GHerciosPorNucleo = GHerciosPorNucleo;
        return this;
    }
    public ComputadorBuilderInterface setTipoGPU(String TipoGPU){
        this.TipoGPU = TipoGPU;
        return this;
    }
    public ComputadorBuilderInterface setModeloGPU(String ModeloGPU){
        this.ModeloGPU = ModeloGPU;
        return this;
    }
    public ComputadorBuilderInterface setNumeroNucleosCuda(String NumeroNucleosCuda){
        this.NumeroNucleosCuda = NumeroNucleosCuda;
        return this;
    }

    public Computador build(){
        return new Computador(Marca, Modelo);
    }
    
}
