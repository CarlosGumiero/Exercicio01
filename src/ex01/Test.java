package ex01;

public class Test 
{
	public static void main (String[] args)
	{
		Veiculo carro1;
		carro1 = new Veiculo("Toyota", "Etios", "RGB1100", "Vermelho", 1000, false, 50, 0, 50000);
		
		carro1.status();
		
		/*carro1.setMarca("Toyota");
		carro1.setModelo("Etios");
		carro1.setPlaca("RGB1100");
		carro1.setCor("Vermelho");
		carro1.setKm(1000);
		carro1.setLigado(true);
		carro1.setLitrosCombustivel(50);
		carro1.setVelocidade(50);
		carro1.setPreco(50000);
		System.out.println("O carro já está ligado!");*/
		
		carro1.abastecer(200);
		carro1.pintar("verde");
		carro1.desligar();
		carro1.ligar();
		carro1.acelerar();
		carro1.frear();
	}
}