package com.generation;

import java.util.Scanner;

/**
 * Este programa permite jugar una partida de Piedra, Papel o Tijeras entre dos jugadores.
 * Los jugadores introducen sus elecciones como piedra, papel o tijeras (cadenas de texto) 
 * y el programa determina el ganador
 * basándose en las reglas del juego.
 */
public class PiedraPapelTijeras {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la elección del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String jugador1 = scanner.nextLine().trim().toLowerCase();
        
        // Solicitar la elección del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String jugador2 = scanner.nextLine().trim().toLowerCase();
        
        // Cerrar el scanner
        scanner.close();
        
        // Determinar el ganador
        String resultado = determinarGanador(jugador1, jugador2);
        
        // Imprimir el resultado
        System.out.println(resultado);
    }
    
    /**
     * Determina el ganador del juego basado en las elecciones de los jugadores.
     * @param j1 Elección del jugador 1.
     * @param j2 Elección del jugador 2.
     * @return Mensaje indicando el resultado del juego.
     */
    private static String determinarGanador(String j1, String j2) {
        if (j1.equals(j2)) {
            return "Empate";
        }
        
        switch (j1) {
            case "piedra":
                if (j2.equals("tijeras")) {
                    return "Gana el jugador 1";
                }
                break;
            case "papel":
                if (j2.equals("piedra")) {
                    return "Gana el jugador 1";
                }
                break;
            case "tijeras":
                if (j2.equals("papel")) {
                    return "Gana el jugador 1";
                }
                break;
            default:
                return "Entrada inválida";
        }
        
        return "Gana el jugador 2";
    }
}
