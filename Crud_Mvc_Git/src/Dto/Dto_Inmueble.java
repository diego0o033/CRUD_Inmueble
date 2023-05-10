
package Dto;

/**
 *
 * @author diego vargas
 */
 /*Defino las propiedades del objeto, junto a los metodos getter y setter para poder modificar/obtener las propiedades del objeto Dto**/
public class Dto_Inmueble 
{
    private int tipo_inmueble;
    private int tipo_moneda;
    private String codigo_inmueble;
    private String localidad;
    private double valor;
    private String direccion;
    private int m2;
    private int cantidad_ambientes;
    private int altura;
    
   public int get_Tipo_Inmueble() 
   {
       return tipo_inmueble;
   }
    
   public void set_Tipo_Inmueble(int tipo_inmueble)
   {
       this.tipo_inmueble= tipo_inmueble;
   }

   public int get_Tipo_Moneda()
   {
       return tipo_moneda;
   } 
   
   public void setTipo_Moneda(int tipo_moneda) 
   {
        this.tipo_moneda = tipo_moneda;
   }
   
   public String getCodigo_Inmueble()
   {
       return codigo_inmueble;
   }
   public void set_Codigo_Inmueble(String codigo_inmueble)
   {
       this.codigo_inmueble= codigo_inmueble;
   }
   
   public String getLocalidad()
   {
       return localidad;
   }
   public void set_Localidad(String localidad)
   {
       this.localidad=localidad;
   }
   
   public double get_Valor()
   {
       return valor;
   }
   public void set_Valor(double valor)
   {
       this.valor=valor;
   }
   
   public String get_Direccion()
   {
       return direccion;
   }
   public void set_Direccion(String direccion)
   {
       this.direccion=direccion;
   }

   public int get_M2()
   {
       return m2;
   }
   public void set_M2(int m2)
   {
       this.m2=m2;
   }

   public int get_Cantidad_Ambientes()
   {
       return cantidad_ambientes;
   }
   public void set_Cantidad_Ambientes(int cantidad_ambientes)
   {
       this.cantidad_ambientes=cantidad_ambientes;
   }

   public int get_Altura()
   {
       return altura;
   }
   public void set_Altura(int altura)
   {
       this.altura=altura;
   }
}
