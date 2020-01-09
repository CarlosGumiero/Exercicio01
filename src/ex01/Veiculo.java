package ex01;

public class Veiculo 
{
	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private float Km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int Velocidade;
	private double Preco;

	public Veiculo(String mar, String mod, String pla, String cor, float km, boolean ligado, int comb, int vel, double prec)
	{
		this.setMarca(mar);
		this.setModelo(mod);
		this.setPlaca(pla);
		this.setCor(cor);
		this.setKm(km);
		this.setLigado(ligado);
		this.setLitrosCombustivel(comb);
		this.setVelocidade(0);
		this.setPreco(prec);
		
		/*
		this.Marca = "Fiat";
		this.Modelo = "Prisma";
		this.Placa = "kkj6666";
		this.Cor = "Preto";
		this.Km = 0;
		this.isLigado = false;
		this.litrosCombustivel = 50;
		this.Velocidade = 0;
		this.Preco = 40000;*/
	}
	
	public void status()
	{
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Km: " + this.getKm());
		System.out.println("Está ligado: " + this.isLigado());
		System.out.println("Combustivel (litros): " + this.getLitrosCombustivel());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Preço: " + this.getPreco());
	}
	
	void ligar()
	{
		if(isLigado)
		{
			System.out.println("O carro já está ligado!");
		}
		else
		{
			System.out.println("O carro ligou.");
			this.isLigado = true;
		}
	}
	
	void desligar()
	{
		if(!isLigado)
		{
			System.out.println("O carro já está desligado!");
		}
		else
		{
			System.out.println("O carro desligou.");
			isLigado = false;
		}
	}
	
	void acelerar()
	{
		if(!isLigado)
			System.out.println("O carro está desligado.");
		else if(this.litrosCombustivel > 0)
		{
			this.Velocidade += 20;
			this.litrosCombustivel -= 1; 
			System.out.println("O carro está em " + this.Velocidade + " KM por hora.");
			System.out.println("O carro tem " + this.litrosCombustivel + " litros de combustível");
		}
		else
		{
			System.out.println("O carro etá sem combustível!");
			this.isLigado = false;
			this.Velocidade = 0;
		}
	}
	
	void frear()
	{
		if(this.isLigado && this.Velocidade > 0)
		{
			if(this.Velocidade < 10)
			{
				this.Velocidade = 0;
				System.out.println("O carro está parado.");
			}
			else
			{
				this.Velocidade -= 10;
				System.out.println("A velocidade do carro é de " + this.Velocidade + " KM por hora.");
			}
		}
		else
		{
			System.out.println("O carro está parado.");
		}
	}
	
	public void abastecer(int qtdLitros)
	{
		int dif = 0;
		if(this.litrosCombustivel + qtdLitros > 100)
		{
			dif = 100 - this.litrosCombustivel;
			this.litrosCombustivel = 100;
			System.out.println("Você tentou abastecer " + qtdLitros + " litros, porém você abasteceu apenas " + dif + " litros, pois seu tanque encheu, agora você tem " + this.litrosCombustivel + " litros.");
		}
		else
		{
			litrosCombustivel += qtdLitros;
			System.out.println("Você abasteceu " + qtdLitros + " litros, seu tanque agora tem " + litrosCombustivel + " litros.");
		}
	}
	
	public void pintar(String corNova)
	{
		this.Cor = corNova;
		System.out.println("Você pintou seu carro com a cor " + this.Cor + ".");
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public float getKm() {
		return Km;
	}

	public void setKm(float km) {
		Km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}
	
	
}