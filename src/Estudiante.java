public class Estudiante extends Persona {
    protected int horas = 6;

    public Estudiante(String _nombre, String _ocupacion, int _edad) {
        super(_nombre, _ocupacion, _edad);
    }
    @Override
    public void comer() {

        System.out.println("Ñom Ñom completito de gorbea");
    }

    @Override
    public String hacerLoSuyo(){
        return "HAGO CUARENTENA Y VEO ANIME";

    }
}