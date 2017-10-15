package practica001;

public final class Constante {
    /**
     * Valores posibles para identificar los signos de un numero
     */
    public enum SignoValor {
        Error,
        Positivo,
        Cero,
        Negativo;
    }

    /**
     * Clase destinada a contener los valores que usara las clases del Package
     */
    public final class Valores{
        /**
         * Valor inicial por defecto
         */
        public static final int Zero = 0;

        /**
         * Valor tentativo de Uno
         */
        public static final float Uno = 1;

        /**
         * Valor tentativo de menos uno
         */
        public static final float MenosUno = -1;

        /**
         * Equivale al numero tres
         */
        public static final float Tres = 3;
    }

    /**
     * Mensaje de error del package
     */
    public final class MensajeError{
        /**
         * Mensaje de error ante un argumento errado
         */
        public static final String TrianguloArgumentoError = "El valor ingresado es errado.";
    }
}
