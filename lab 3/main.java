class Main{
	public static void main(String argvs[]){
		Figura[] f = new Figura[10];
		boolean check;
		for(int i = 0; i<10; i++){
			if(i%2 == 0){
				f[i]= new Quadrado(5f,5f,4f);
				f[i].mover(5.0f,5.0f);
			}
			else{
				f[i]= new Circulo(4f,2f);
			    f[i].mover(5.0f,5.0f);
			}
		}
		Figura g;
//teste -----------------------------------------------------------
		Quadrado c;
		c =  new Quadrado(5f,5f,2f);
		c.mover(5.0f,5.0f);
		System.out.println(c.desenhar("Vermelho"));
// -----------------------------------------------------------------
		
		for(int i = 0; i<10; i++){
				if((f[i] instanceof Colorida)){
					System.out.println(f[i].calculaArea());
				}
		}
		
	}
}
