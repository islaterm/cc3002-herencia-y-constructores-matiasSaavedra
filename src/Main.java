public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Matías S", "Estudiante", 24);
        System.out.println(estudiante.nombre);
        estudiante.comer();
        estudiante.dormir(estudiante.horas);
        System.out.println(estudiante.hacerLoSuyo());

        Persona persona = new Persona("Persona x", "ocupacion x", 33);
        System.out.println(persona.nombre);
        persona.comer();
        persona.dormir();
        System.out.println(persona.hacerLoSuyo());

        Academico academico = new Academico("Alex", "Profesor DCC", 38);
        System.out.println(academico.nombre);
        academico.setPaper("Análisis dinámico sobre la relatividad del espíritu humano");
        academico.publicarPaper();
        academico.comer();
        academico.dormir(academico.horas);
    }
}
