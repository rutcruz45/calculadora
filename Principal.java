class Principal {

    public static void main(String[] args) {

        System.out.println("Bienvenido a la calculadora");
        Calculadora objeto1 = new Calculadora();
        Calculadora objeto2 = new Calculadora();

        objeto1.suma(3, 5);

        System.out.println(objeto1.suma(6, 5));
        System.out.println(objeto1.resta(4, 5));
        System.out.println(objeto1.multi(5, 2));
        System.out.println(objeto1.division(4, 2));

    }
}