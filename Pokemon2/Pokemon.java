/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thae
 */
public class Pokemon{
        private int lvl=1;
        private int xp=0;
	private int id;
	private String nombre;
	private boolean capturado;
	private boolean visto;
	private int ps_max;
	private int ps;
	private int ataque;
	private Ataque [] ataques = new Ataque[SetupPokemon.cantidadAtaques];
        private Combate combate;

	Pokemon(int id, String nombre, String [] listaAtaques){
		int valor=6;
                this.lvl=lvl;
                this.xp=xp;
		this.id = id;
		this.nombre = nombre;
		this.ps_max = SetupPokemon.ps_max;
		this.ps = this.ps_max;
		this.ataque = SetupPokemon.ataque;
		this.capturado = false;
		this.visto = false;
		for(int i=0;i<SetupPokemon.cantidadAtaques;i++){
			this.ataques[i] = new Ataque(listaAtaques[i],i+1,valor-(i+1),valor/2-i);
		}
	}

        public int getLvl() {
            return lvl;
        }

        public void setLvl(int lvl) {
            this.lvl = lvl;
        }

        public int getXp() {
            return xp;
        }

        public void setXp(int xp) {
            this.xp = xp;
        }
        
        
        public void aumentaExp()
        {   
            this.setXp(getXp()+50);
            System.out.println("Has ganado 50 EXP");
            
        }
        
        public void subeLvl()
        {
            if(this.getXp()==100)
            {
                this.lvl=this.lvl+1;
                this.xp=0;
                this.ps_max=this.ps_max+5;
                this.ataque=this.ataque+2;
                System.out.println(this.getNombre()+" subió a lvl "+this.lvl);
                System.out.println("PS +5 \nAtaque +2");
            }
            
            
            
        }
        
        
        
	public void setCapturado(){
		this.capturado = true;
	}
	public void setVisto(){
		this.visto = true;
	}
	public String getNombre(){
		return this.nombre;
	}
	public boolean getCapturado(){
		return this.capturado;
	}
	public int getId(){
		return this.id;
	}
	public void recibirAtaque(Ataque ataque){
		this.ps -= ataque.getDano();
	}
	public Ataque [] getAtaques(){
		return ataques;
	}
	public int getPs(){
		return ps;
	}
	public void restaurar(){
		this.ps = this.ps_max;
	}
}
