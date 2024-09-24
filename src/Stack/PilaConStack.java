package Stack;
import java.util.Stack;

public class PilaConStack {
        Stack<String> stack = new Stack<>();

            private int cima;

            public void push (String elemento) {
                if (estaLlena()) {
                    System.out.println("Error: La pila está llena.");
                    return;
                }
                cima++;
                stack.push(String.valueOf(elemento));
                System.out.println("Recordatorio \"" + elemento + "\" agregado.");
            }

            public String pop() {
                if (estaVacia()) {
                    System.out.println("Error: La pila está vacía.");
                    return null;
                }
                String elemento = stack.pop();
                cima--;
                System.out.println("Recordatorio '" + elemento + "' Eliminado.");
                return elemento;
            }

            public String peek() {
                if (estaVacia()) {
                    System.out.println("Error: La pila está vacía.");
                    return null;
                }
                System.out.println("Ultimo recordatorio: " + stack.peek());
                return stack.peek();
            }

            public boolean estaVacia() {
                return cima == -1;
            }

            public boolean estaLlena() {
                return cima == stack.capacity() - 1;
            }

            public void mostrarPila() {
                if (estaVacia()) {
                    System.out.println("La pila está vacía.");
                    return;
                }
                System.out.print("Tus Recordatorios: ");
                while (!stack.isEmpty())
                    System.out.print(stack.pop() + "-");
                System.out.println();
            }
    }

