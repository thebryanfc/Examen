public class Main {

    public static void main(String[] args) {

        // Crear una nueva televisión
        Tv tele = new Tv(null, null, null);

        // Recibir una televisión y asignar valores a los atributos
        String fecha = "2023-03-20";
        String dano = "Pantalla rota";
        String dueno = "Juan Perez";
        tele.recibirTv(fecha, dano, dueno);

        // Imprimir los valores de los atributos
        System.out.println("Televisión recibida:");
        System.out.println("Fecha: " + tele.getFecha());
        System.out.println("Daño: " + tele.getDano());
        System.out.println("Dueño: " + tele.getDueno());

        // Entregar la televisión y establecer los valores de los atributos en null
        tele.entregarTv();

        // Imprimir los valores de los atributos después de entregar la televisión
        System.out.println("Televisión entregada:");
        System.out.println("Fecha: " + tele.getFecha());
        System.out.println("Daño reparado: " + tele.getDano());
        System.out.println("Recibe: " + tele.getDueno());
    }
}
