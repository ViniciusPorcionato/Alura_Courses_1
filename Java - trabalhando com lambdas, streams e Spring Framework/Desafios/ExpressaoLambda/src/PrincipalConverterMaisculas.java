public class PrincipalConverterMaisculas {
    public static void main(String[] args) {
        ConversorMaiusculas convertor = texto -> texto.toUpperCase();

        String resultado = convertor.converter("hello");
        System.out.println(resultado);
    }
}
