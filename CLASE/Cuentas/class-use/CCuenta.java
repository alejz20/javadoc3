package Cuentas;
/* 
 * @author Ale
 * @version 4.22.0 eclipse
 * 
 * 
 * */
    public class CCuenta { // Contructores
 
    private String nombre;
   	private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() {
    }
    
    /*
	  * 
	  * 
	  * @param nombre  \\ Nombre de cuenta declarado como nom
	  * @param cuenta  \\ La cuenta declarado como cue
	  * @param saldo   \\ Saldo de cuenta sal
	  *  
	  *  */
        public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    

	 
    public double estado()
    {
        return saldo;
    }
    /* 
     * @return saldo \\ Nos devuelve el contenido de saldo
     * 
     *
     * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad; 
    }
    /*
	  * 
	  * 
	  * @exception cantidad \\ Metodo ingresar, es saldo mas cantidad
	  *  */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    /*
	  * 
	  * 
	  * @exception cantidad  \\ Metodo retirar saldo
	  *  */
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

    /*
	  *  \\ Los constructores
	  * 
	  * @param nombre, cuenta, saldo, tipoInteres  \\ Getter y setters
	  * 
	  *
	  *  */
}
