/*
UNIANDES PUYO
Sistema de facturación 2016 
Octavo Semestre
BraYan MaFla
23/05/2016
 */
package Entidades;

/**
 *
 * @author BraYan
 */
public class clsProducto {
    private int _id;
    private String _nombre;
    private String _descripcion;
    private int _stock;
    private float _pvp;
    private float _pcp;
    private float _siniva;

    public clsProducto() {
    }

    public clsProducto(int _id, String _nombre, String _descripcion, int _stock, float _pvp, float _pcp, float _siniva) {
        this._id = _id;
        this._nombre = _nombre;
        this._descripcion = _descripcion;
        this._stock = _stock;
        this._pvp = _pvp;
        this._pcp = _pcp;
        this._siniva = _siniva;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String Descripcion() {
        return _descripcion;
    }

    public void Descripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public int Stock() {
        return _stock;
    }

    public void Stock(int _stock) {
        this._stock = _stock;
    }

    public float Pvp() {
        return _pvp;
    }

    public void Pvp(float _pvp) {
        this._pvp = _pvp;
    }

    public float Pcp() {
        return _pcp;
    }

    public void Pcp(float _pcp) {
        this._pcp = _pcp;
    }

    public float Siniva() {
        return _siniva;
    }

    public void Siniva(float _siniva) {
        this._siniva = _siniva;
    }

   
            
    
}
