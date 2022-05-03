package entidades;

/**
 * @author Jonathan Rivera
 */

//Esta clase optiene y guarda todos los datos solicitados

public class Articulo {

    private String categoriaArticulo;
    private int idArticulo;
    private String nombArticulo;
    private double costoArticulo;
    private String marcaArticulo;
    private String ubicacionArticulo;
    private int cantidadArticulo;

    public int getCantidadArticulo() {
        return cantidadArticulo;
    }

    public void setCantidadArticulo(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }

    public String getUbicacionArticulo() {
        return ubicacionArticulo;
    }

    public void setUbicacionArticulo(String ubicacionArticulo) {
        this.ubicacionArticulo = ubicacionArticulo;
    }
    
    public String getCategoriaArticulo() {
        return categoriaArticulo;
    }

    public void setCategoriaArticulo(String categoriaArticulo) {
        this.categoriaArticulo = categoriaArticulo;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombArticulo() {
        return nombArticulo;
    }

    public void setNombArticulo(String nombArticulo) {
        this.nombArticulo = nombArticulo;
    }

    public double getCostoArticulo() {
        return costoArticulo;
    }

    public void setCostoArticulo(double costoArticulo) {
        this.costoArticulo = costoArticulo;
    }

    public String getMarcaArticulo() {
        return marcaArticulo;
    }

    public void setMarcaArticulo(String marcaArticulo) {
        this.marcaArticulo = marcaArticulo;
    }
}
