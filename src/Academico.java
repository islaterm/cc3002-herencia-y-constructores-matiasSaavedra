public class Academico extends Persona {
    protected String paper;
    protected int horas = 7;
    public Academico(String _nombre, String _ocupacion, int _edad) {
        super(_nombre, _ocupacion, _edad);
    }

    public void setPaper(String _paper){
        this.paper = _paper;
    }
    public void publicarPaper(){

        System.out.println(this.paper);
    }

    @Override
    public String hacerLoSuyo(){
        return "HAGO CUARENTENA Y APRENDO ZUN";

    }
}
