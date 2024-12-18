public class Main {
    public static void main(String[] args) {
        // Crear instancias de NoGenericMethods con los valores en cualquier orden
        NoGenericMethods ngm1 = new NoGenericMethods("primero", "segundo", "tercero");
        NoGenericMethods ngm2 = new NoGenericMethods("tercero", "primero", "segundo");
        NoGenericMethods ngm3 = new NoGenericMethods("segundo", "tercero", "primero");

        // Imprimir los objetos
        System.out.println(ngm1);
        System.out.println(ngm2);
        System.out.println(ngm3);
    }
}
