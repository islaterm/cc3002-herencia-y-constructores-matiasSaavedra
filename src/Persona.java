public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;
    protected int horas = 8;
    public Persona(String _nombre, String _ocupacion, int _edad){
        this.nombre = _nombre;
        this.ocupacion = _ocupacion;
        this.edad = _edad;

    }
    public void comer() {

        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {

        System.out.println("zZzZzZzZ");
    }

    public void dormir(int _horas) {

        String cantidad_de_zetas = "z".repeat(_horas);
        System.out.println(cantidad_de_zetas);
    }

    public String hacerLoSuyo() {

        return "HAGO CUARENTENA";
    }
}
