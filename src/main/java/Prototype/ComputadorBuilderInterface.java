package Prototype;

public interface ComputadorBuilderInterface {
    ComputadorBuilderInterface setMarca(String Marca);
    ComputadorBuilderInterface setModelo(String Modelo);
    ComputadorBuilderInterface setTipoDisco(String TipoDisco);
    ComputadorBuilderInterface setTamanoDisco(String TamanoDisco);
    ComputadorBuilderInterface setTipoRAM(String TipoRAM);
    ComputadorBuilderInterface setTamanoRAM(String TamanoRAM);
    ComputadorBuilderInterface setTipoCPU(String TipoCPU);
    ComputadorBuilderInterface setModeloCPU(String ModeloCPU);
    ComputadorBuilderInterface setNumeroNucleos(String NumeroNucleos);
    ComputadorBuilderInterface setGHerciosPorNucleo(String GHerciosPorNucleo);
    ComputadorBuilderInterface setTipoGPU(String TipoGPU);
    ComputadorBuilderInterface setModeloGPU(String ModeloGPU);
    ComputadorBuilderInterface setNumeroNucleosCuda(String NumeroNucleosCuda);
}
