public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("1984", "George Orwell");
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println();
        biblioteca.mostrarCatalogo();

        biblioteca.buscarPorAutor("Gabriel García Márquez");
        System.out.println();
        biblioteca.buscarPorAutor("George Orwell");

        System.out.println("\nBuscando libros de un autor que no está en el catálogo:");
        biblioteca.buscarPorAutor("J.K. Rowling");
    }
}
