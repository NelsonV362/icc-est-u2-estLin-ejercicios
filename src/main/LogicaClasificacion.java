package main;

import java.util.*;

public class LogicaClasificacion {

    public String invertirCadena(String texto) {
        Stack<Character> pila = new Stack<>();
     for (char c : texto.toCharArray()) {    pila.push(c);
        }

         StringBuilder invertido = new StringBuilder();
           while (!pila.isEmpty()) {
         invertido.append(pila.pop());
     }

        return invertido.toString();
    }
    public boolean validarSimbolos(String expresion) {
     Stack<Character> pila = new Stack<>();
              Map<Character, Character> mapa = Map.of(
            ')', '(',
          ']', '[',
        '}', '{'
        );

        for (char c : expresion.toCharArray()) {
            if (mapa.containsValue(c)) {
                pila.push(c); 
          } else if (mapa.containsKey(c)) {
              if (pila.isEmpty() || pila.pop() != mapa.get(c)) {
                    return false;
       }
                }
        }

        return pila.isEmpty(); 
    }

    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> auxiliar = new Stack<>();

        while (!pila.isEmpty()) {
int temp = pila.pop();
                while (!auxiliar.isEmpty() && auxiliar.peek() > temp) {
                pila.push(auxiliar.pop());
              }
            auxiliar.push(temp);
        }

       List<Integer> resultado = new ArrayList<>();
            while (!auxiliar.isEmpty()) {
    resultado.add(0, auxiliar.pop()); 
}

        return resultado;
    }
 public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {
        LinkedList<Integer> pares = new LinkedList<>();
     LinkedList<Integer> impares = new LinkedList<>();

        for (int num : original) {
            if (num % 2 == 0) {
                   pares.add(num);
               } else {
                impares.add(num);
      }
        }
        pares.addAll(impares);
        return pares;
    }
}
