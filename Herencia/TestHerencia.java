public class TestHerencia {

    public static void main (String [ ] Args) {

        Gerente gerente1 = new Gerente ("Juan", "Valle Mitla", 33, "Gerente Ventas");

        gerente1.setSueldo(20000);
        gerente1.setCategoria("Ejecutiva");
        gerente1.mostrar();}

} //Cierre de la clase