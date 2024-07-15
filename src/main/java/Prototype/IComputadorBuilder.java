package Prototype;

public interface IComputadorBuilder {
    IComputadorBuilder setMarca(String Marca);
    IComputadorBuilder setModelo(String Modelo);
    IComputadorBuilder setTipoDisco(String TipoDisco);
    IComputadorBuilder setTamanoDisco(String TamanoDisco);
    IComputadorBuilder setTipoRAM(String TipoRAM);
    IComputadorBuilder setTamanoRAM(String TamanoRAM);
    IComputadorBuilder setTipoCPU(String TipoCPU);
    IComputadorBuilder setModeloCPU(String ModeloCPU);
    IComputadorBuilder setNumeroNucleos(String NumeroNucleos);
    IComputadorBuilder setGHerciosPorNucleo(String GHerciosPorNucleo);
    IComputadorBuilder setTipoGPU(String TipoGPU);
    IComputadorBuilder setModeloGPU(String ModeloGPU);
    IComputadorBuilder setNumeroNucleosCuda(String NumeroNucleosCuda);
}
