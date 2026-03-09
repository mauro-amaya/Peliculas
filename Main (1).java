//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Pelicula p1 = new Pelicula("Gandhi", "Richard Attenborough", Pelicula.tipoGenero.DRAMA,191,1982,8.1);
    Pelicula p2 = new Pelicula("Thor","Kenneth Branagh", Pelicula.tipoGenero.ACCION,115,2011,7.0);

    p2.mostrarDatos();
    System.out.println(p2.Peliculaepica());
    System.out.println(p2.calcularCalificacion());
    System.out.println(p2.similar(p1));

}
