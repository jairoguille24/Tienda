

public class Producto
{
    private String nombre;
    private Tipo tipo;
    private double valorUnitario;
    private Integer cantidadBodega;
    private Integer cantidadMinima;
    private Integer cantidadUnidadesVendidas;
    
    
    public enum Tipo
    {
        PAPELERIA,
        SUPERMERCADO,
        DROGUERIA
    }
    
    private final static double IVA_PAPELERIA=0.16;
    private final static double IVA_SUPERMERCADO=0.04;
    private final static double IVA_DROGUERIA=0.12;
    
    
 public Producto( Tipo pTipo, String pNombre, double pValorUnitario, Integer pCantidadBodega, Integer pCantidadMinima)
    {
        this.tipo = pTipo;
        this.nombre = pNombre;
        this.valorUnitario = pValorUnitario;
        this.cantidadBodega = pCantidadBodega;
        this.cantidadMinima = pCantidadMinima;
        this.cantidadUnidadesVendidas = 0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(Integer cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public Integer getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(Integer cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public Integer getCantidadUnidadesVendidas() {
        return cantidadUnidadesVendidas;
    }

    public void setCantidadUnidadesVendidas(Integer cantidadUnidadesVendidas) {
        this.cantidadUnidadesVendidas = cantidadUnidadesVendidas;
    }
    
    public double CalcularPrecioFinal(){
    
    
     return valorUnitario + valorUnitario*getIVA();
    
    
    
    }
    
    public double getIVA( )
    {
        double iva = 0;
        switch( tipo )
        {
            case PAPELERIA:
            {
                iva += IVA_PAPELERIA;
                break;
            }
            case SUPERMERCADO:
            {
                iva += IVA_SUPERMERCADO;
                break;
            }
            case DROGUERIA:
            {
                iva += IVA_DROGUERIA;
                break;
            }

        }

        return iva;
    }

    
    public Integer Vender(Integer pCantidad ){
    
      int cantidadVendida=0;
      
      if(pCantidad > cantidadBodega){
        
          cantidadVendida = cantidadBodega;
          cantidadBodega = 0;
         
        } else{
         cantidadBodega -= pCantidad;
         cantidadVendida = pCantidad;
        
        }
    
       return cantidadVendida;
         
     }
     
    
    public void abastecer( Integer pCantidad ){
        cantidadBodega += pCantidad;
    }
    
    
    public boolean puedeAbastecer( ){
    
        boolean respuesta = false;
        if( cantidadBodega < cantidadMinima )
        {
            respuesta = true;
        }
        return respuesta;
    }
    
    
}
