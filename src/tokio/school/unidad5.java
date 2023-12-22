package tokio.school;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class unidad5 {
    public static void main(String[]args){
        // forma tradicional
//        SimpleIntarface si = new SimpleIntarface() {
//            @Override
//            public void FuncionPrueba() {
//                System.out.println("hola ");
//            }
//        };
//        si.FuncionPrueba();
//        si.Mostrar();
        SimpleIntarface si1 = (t1) -> System.out.println("hola " + t1);

        si1.FuncionPrueba("Gian");
        si1.Mostrar();

        Calculadora suma = (n1, n2) -> (n1 + n2);
        Calculadora resta = (n1, n2) -> (n1 - n2);
        Calculadora multiplicacion = ( n1 , n2) -> (n1*n2);
        Calculadora division = ((n1, n2) -> (n1/n2));
        System.out.println(suma.Operacion(5,5));
        System.out.println(resta.Operacion(5,5));
        System.out.println(multiplicacion.Operacion(5,5));
        System.out.println(division.Operacion(5,5));
        List<Calculadora> operaciones = new ArrayList<>();
        operaciones.add(suma);
        operaciones.add(resta);
        operaciones.add(division);
        operaciones.add(multiplicacion);

        System.out.println();
        for (Calculadora cal:operaciones) {
            System.out.println(cal.Operacion(6,3));
        }
        Function<List<Calculadora>, Integer> tamanyo = ops -> ops.size();
        System.out.println("tamanio " + tamanyo.apply(operaciones));

        Function<Integer,Void> repetir = n ->{
            for (int i = 0; i < n; i++) {
                System.out.println("hola " + i);

            }
            return null;
        };
        repetir.apply(5);

        // ()->{};
    }
}
