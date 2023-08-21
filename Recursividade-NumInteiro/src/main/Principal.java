package main;

public class Principal {
	
	public static void main(String args[]) {
		int n = 987654; // Substitua pelo número que você deseja contar os dígitos
        int digitCount = NumInt(n);
        System.out.println("O número de dígitos em " + n + " é: " + digitCount);
	}
	
	public static int NumInt (int n) {
		// Caso base: se o número for menor que 10, ele tem um dígito
		if (n < 10) {
            return 1;
        }
        // Caso recursivo: incrementa 1 e chama a função para o quociente da divisão por 10
        return 1 + NumInt (n / 10);
        }
	
}
