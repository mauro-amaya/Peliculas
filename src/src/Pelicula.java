public class Pelicula {
    private String nombre;
    private String director;
    enum tipoGenero{ACCION, COMEDIA, DRAMA, SUSPENSO}
    tipoGenero  genero;
    private int duracion;
    private int anio;
    private double calificacion;

    public Pelicula(String nombre, String director, tipoGenero genero, int duracion, int anio, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.anio = anio;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDirector() {
        return director;
    }
    public tipoGenero getGenero() {
        return genero;
    }
    public int getDuracion() {
        return duracion;
    }
    public int getAnio() {
        return anio;
    }
    public double getCalificacion() {
        return calificacion;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setDirector(String director) {
        this.director = director;
    }
    private void setGenero(tipoGenero genero) {
        this.genero = genero;
    }
    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    private void setAnio(int anio) {
        this.anio = anio;
    }
    private void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarDatos(){
        System.out.println("Datos de la pelicula");
        System.out.println("Nombre:" + nombre);
        System.out.println("Director:" + director);
        System.out.println("Genero:" + genero);
        System.out.println("Duracion:" + duracion + " minutos");
        System.out.println("Anio:" + anio);
        System.out.println("Calificacion:" + calificacion);
    }

    public boolean Peliculaepica(){
        if(duracion >= 180){
            return true;
        }else{
            return false;
        }
    }

    public String calcularCalificacion(){
        if(calificacion >= 0 && calificacion <= 2){
            return "Muy mala ;(";
        } if(calificacion > 2 && calificacion <= 5){
            return "Mala :(";
        } if(calificacion > 5 && calificacion <= 7){
            return "Regular :/";
        }
        if(calificacion > 7 && calificacion <= 8){
            return "Buena :)";
        }
        if(calificacion > 8 && calificacion <= 10){
            return "Excelente :D";
        }
        return "Opcion valida no disponible";
    }

    public boolean similar(Pelicula p){
        return(genero == p.getGenero() && calificacion == p.getCalificacion());
    }

}
