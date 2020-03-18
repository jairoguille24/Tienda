 
 

 


public class Tienda

{ 
   private Producto producto1;
   private Producto producto2;
   private Producto producto3;
   private Producto producto4;
   private double dineroenCaja;
   
   
   
   public Tienda(){
     
    
        producto1 = new Producto( Tipo.PAPELERIA, producto1.getNombre(), producto1.getValorUnitario(), producto1.getCantidadBodega() , producto1.getCantidadMinima());
        producto2 = new Producto( Tipo.DROGUERIA, producto2.getNombre(), producto2.getValorUnitario(), producto2.getCantidadBodega() , producto2.getCantidadMinima());
        producto3 = new Producto( Tipo.PAPELERIA, producto3.getNombre(), producto3.getValorUnitario(), producto3.getCantidadBodega() , producto3.getCantidadMinima());
        producto4 = new Producto( Tipo.SUPERMERCADO, producto4.getNombre(), producto4.getValorUnitario(), producto4.getCantidadBodega() , producto4.getCantidadMinima());
        dineroEnCaja = 0;
    
    }
  
   public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public Producto getProducto4() {
        return producto4;
    }

    public void setProducto4(Producto producto4) {
        this.producto4 = producto4;
    }

    public double getDineroEnCaja() {
        return dineroenCaja;
    }

    public void setDineroEnCaja(double dineroenCaja) {
        this.dineroenCaja = dineroenCaja;
    }

    
    public Producto Producto( String pNombre )
    {
        Producto buscado = null;

        if( producto1.getNombre( ).equals( pNombre ) )
        {
            buscado = producto1;
        }
        else if( producto2.getNombre( ).equals( pNombre ) )
        {
            buscado = producto2;
        }
        else if( producto3.getNombre( ).equals( pNombre ) )
        {
            buscado = producto3;
        }
        else if( producto4.getNombre( ).equals( pNombre ) )
        {
            buscado = producto4;
        }

        return buscado;

    }
    
    public double PromedioVentas( )
    {
        double respuesta = 0.0;
        double totalUnidadesVendidas = producto1.getCantidadUnidadesVendidas( ) + producto2.getCantidadUnidadesVendidas( ) + producto3.getCantidadUnidadesVendidas( ) + producto4.getCantidadUnidadesVendidas( );
        if( totalUnidadesVendidas > 0 )
        {
            respuesta = dineroenCaja / totalUnidadesVendidas;
        }
        return respuesta;
    }
    
    
    public Producto ProductoMasVendido( )
    {
        int venta1 = producto1.getCantidadUnidadesVendidas( );
        int venta2 = producto2.getCantidadUnidadesVendidas( );
        int venta3 = producto3.getCantidadUnidadesVendidas( );
        int venta4 = producto4.getCantidadUnidadesVendidas( );

        Producto masVendido = null;
        int mayorCantidad = 0;

        if( venta1 > mayorCantidad )
        {
            masVendido = producto1;
            mayorCantidad = venta1;
        }
        if( venta2 > mayorCantidad )
        {
            masVendido = producto2;
            mayorCantidad = venta2;
        }
        if( venta3 > mayorCantidad )
        {
            masVendido = producto3;
            mayorCantidad = venta2;
        }
        if( venta4 > mayorCantidad )
        {
            masVendido = producto4;
        }

        return masVendido;
    }
    
    public Producto darProductoMenosVendido( )
    {
        int venta1 = producto1.getCantidadUnidadesVendidas( );
        int venta2 = producto2.getCantidadUnidadesVendidas( );
        int venta3 = producto3.getCantidadUnidadesVendidas( );
        int venta4 = producto4.getCantidadUnidadesVendidas( );

        Producto menosVendido = null;

        if( venta1 > 0 || venta2 > 0 || venta3 > 0 || venta4 > 0 )
        {
            if( venta1 <= venta2 && venta1 <= venta3 && venta1 <= venta4 )
            {
                menosVendido = producto1;
            }
            else if( venta2 <= venta1 && venta2 <= venta3 && venta2 <= venta4 )
            {
                menosVendido = producto2;
            }
            else if( venta3 <= venta2 && venta3 <= venta1 && venta3 <= venta4 )
            {
                menosVendido = producto3;
            }
            else
            {
                menosVendido = producto4;
            }
        }

        return menosVendido;
    }
    
    
    
    public Integer venderProducto( String pNombreProducto, Integer pCantidad )
    {
        int cantidadVendida = 0;
        Producto producto = Producto( pNombreProducto );
        cantidadVendida = Producto.Vender( pCantidad );
        dineroenCaja += cantidadVendida * producto.CalcularPrecioFinal();

        return cantidadVendida;
    }
    
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    
    public String metodo2( )
    {
        return "Respuesta 2";
    }
}
    
    
