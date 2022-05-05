public class Main {
    public static void main(String[] args) {
        suma (1, 2, 3);
        Coche coche1 = new Coche();
        coche1.numeroDePuertas = 1;
        System.out.println("El numero de puertas es " + coche1.numeroDePuertas);
    }
    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
    }

    static class Coche {
        int numeroDePuertas;
        public void sumarPuertas(){
            this.numeroDePuertas++;
        }

    }
}


