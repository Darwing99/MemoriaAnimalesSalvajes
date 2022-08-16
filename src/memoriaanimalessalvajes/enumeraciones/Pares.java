
package memoriaanimalessalvajes.enumeraciones;


public enum Pares {
    SEIS(6),
    OCHO(8),
    DIEZ(10),
    DOCE(12);
    private final int numPar; 

    private Pares(int numPar) {
        this.numPar = numPar;
    }

    public int getNumPar() {
        return numPar;
    }
    
    
}
