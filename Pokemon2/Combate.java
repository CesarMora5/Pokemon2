/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thae
 */
import java.math.*;
import java.io.*;


public class Combate{
	private Pokemon player1;
	private Pokemon player2;
	private int indexRival;
	BufferedReader buffer;

	Combate(Pokemon player1, Pokedex pokedexGral){
		buffer = new BufferedReader(new InputStreamReader(System.in));
		this.player1 = player1;
		indexRival = (int)Math.round(Math.random()*10);
		this.player2 = pokedexGral.getPokemon(indexRival);
	}

	public void ataque(Pokemon player1,Pokemon player2){
		int op;
		try{
			System.out.println(player1.getNombre()+", El ataque será: ");
			System.out.println("1.-"+player1.getAtaques()[0].getNombre());
			System.out.println("2.-"+player1.getAtaques()[1].getNombre());
			System.out.println("3.-"+player1.getAtaques()[2].getNombre());
			op = Integer.parseInt(buffer.readLine());

			player2.recibirAtaque(player1.getAtaques()[op-1]);
			System.out.println("\n\n********************************************************\n");
			System.out.println(player2.getNombre()+" tu nivel de Puntos de Salud es "+player2.getPs());
			System.out.println("\n********************************************************\n\n");
		}catch(IOException e){
			System.out.println("Error de lectura desde el teclado...");
		}
	}
        
        
        public void ataqueAlProta(Pokemon player2, Pokemon player1)
        {
            int random=(int)Math.floor(Math.random()*3+1);
            player1.recibirAtaque(player2.getAtaques()[random-1]);
            System.out.println(player2.getNombre()+" enemigo usó "+player2.getAtaques()[random-1].getNombre() );
            System.out.println("\n********************************************************\n\n");
            System.out.println(player1.getNombre()+" tu nivel de Puntos de Salud es "+player1.getPs());
        }

	public int combatir(){
		int out=0;
		boolean sigue=true;
		while(sigue){
			ataque(player1,player2);
			if(revisarTriunfo(player2)){
				System.out.println("\n\n********************************************************\n\n");
				System.out.println("Felicitaciones...¡¡Haz ganado la partida!! :D ");
				System.out.println("\n\n********************************************************\n\n");
				out = indexRival;
				player1.restaurar();
				player2.restaurar();
                                player1.aumentaExp();
                                player1.subeLvl();
                                
				break;
			} 
			ataqueAlProta(player2,player1);
			if(revisarTriunfo(player1)){
				System.out.println("\n\n********************************************************\n\n");
				System.out.println("Tu pokemon se ha debilitado...¡¡Haz perdido la partida!!  :(  ");
				System.out.println("\n\n********************************************************\n\n");
				out = -1;
				player1.restaurar();
				player2.restaurar();
				break;
			}
		}
		return out;
	}

	public boolean revisarTriunfo(Pokemon player){
		if(player.getPs()<=0) return true;
		else return false;
	}

}