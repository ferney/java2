import java.util.*;

public class OperacionesConConjuntos {
    public static void main(String[] args) {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // Unión de conjuntos
        Set<Integer> union = new HashSet<>(conjuntoA);
        union.addAll(conjuntoB);
        System.out.println("Unión: " + union);

        // Intersección de conjuntos
        Set<Integer> interseccion = new HashSet<>(conjuntoA);
        interseccion.retainAll(conjuntoB);
        System.out.println("Intersección: " + interseccion);

        // Diferencia de conjuntos (A - B)
        Set<Integer> diferencia = new HashSet<>(conjuntoA);
        diferencia.removeAll(conjuntoB);
        System.out.println("Diferencia (A - B): " + diferencia);

        // Complemento de conjunto A con respecto al conjunto universal U
        Set<Integer> conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Set<Integer> complemento = new HashSet<>(conjuntoUniversal);
        complemento.removeAll(conjuntoA);
        System.out.println("Complemento de A: " + complemento);

        // Pertenece a (verificar si un elemento está en un conjunto)
        int elemento = 3;
        boolean perteneceA = conjuntoA.contains(elemento);
        System.out.println("¿" + elemento + " pertenece a A? " + perteneceA);

        // No pertenece a (verificar si un elemento no está en un conjunto)
        int elemento2 = 9;
        boolean noPerteneceA = !conjuntoA.contains(elemento2);
        System.out.println("¿" + elemento2 + " no pertenece a A? " + noPerteneceA);

        // Subconjunto o igual (A ⊆ B)
        boolean esSubconjuntoOIgual = conjuntoA.containsAll(conjuntoB);
        System.out.println("A es subconjunto o igual a B: " + esSubconjuntoOIgual);

        // Subconjunto propio (A ⊂ B)
        boolean esSubconjuntoPropio = conjuntoA.containsAll(conjuntoB) && !conjuntoA.equals(conjuntoB);
        System.out.println("A es subconjunto propio de B: " + esSubconjuntoPropio);

        // Conjunto universal (U) en este caso es conjuntoUniversal
        System.out.println("Conjunto Universal: " + conjuntoUniversal);
    }
}

