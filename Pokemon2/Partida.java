/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thae
 */
import java.io.*;
public class Partida{
	private BufferedReader buffer;
	private Personaje jugador;
	private Combate [] combates;
	private int combateActual;
	private Pokedex pokedexGral;
        private Mapa mapa;


	Partida(Pokedex pokedexGral){
		buffer = new BufferedReader(new InputStreamReader(System.in));
		combates = new Combate[SetupPokemon.cantidadCombates];
		combateActual = 0;
		this.pokedexGral = pokedexGral;
		crearUsuario(pokedexGral);
		menu();
	}

	private void crearUsuario(Pokedex pokedexGral){
		String nombre;
		String usuario;
		try{
			System.out.println("\n\n********************************************************\n");
			System.out.println("    POKEMON FUNDAMENTOS DE LENGUAJES DE PROGRAMACIÓN");
			System.out.println("\n********************************************************\n\n");
			System.out.println("            Ingrese su nombre: \n            ");
			nombre = buffer.readLine();
			System.out.println("            Ingrese un nombre de usuario: \n            ");
			usuario = buffer.readLine();

			this.jugador = new Personaje(1,nombre,usuario,pokedexGral);	
		}catch(IOException e){
			System.out.println("Error de lectura desde el teclado...");
		}
	}
                public void crearMapa() throws IOException
        {
                String lugar1="Paine";
                String lugar2="Pueblo Paleta";
                String lugar3="Ciudad Lavanda";
                String lugar4="Ciudad Celeste";
                String lugar5="Ciudad azul";
                String lugar6="Ciudad Verde";
                String lugar7="Ciudad Plateada";
                mapa=new Mapa(lugar1, lugar2,lugar3,lugar4,lugar5,lugar6,lugar7);
        }
	public void menu(){
		int op=0;
		System.out.println("Comienza el juego...");
		try{
			do{
			
			System.out.println("\n\n********************************************************\n\n");
			System.out.println("Selecciona la acción que quieres realizar: ");
			System.out.println("1.- Escoger lugar para combatir. ");
			System.out.println("2.- Ver Pokedex. ");
			System.out.println("3.- Terminar Juego. ");
			op = Integer.parseInt(buffer.readLine());
			System.out.println("\n\n********************************************************\n\n");
			switch(op){
				case 1: 	crearMapa();
                                                crearCombate();
						System.out.println("\n\n********************************************************\n\n");
						break;
				case 2:         mostrarPokedex();
						buffer.readLine();
						System.out.println("\n\n********************************************************\n\n");
						break;
				case 3: 	System.out.println("El juego ha terminado,  gracias por jugar PokemonFLP!!!");
						System.out.println("\n\n********************************************************\n\n\n\n\n\n\n\n\n\n");
						break;
			}

			}while(op!=3);
			//System.out.println("1.- Combate. ");

		}catch(IOException e){
			System.out.println("Error de lectura desde el teclado...");
		}

	}
	public void crearCombate(){
		int n=SetupPokemon.cantidadPokemones;
		Pokemon aux;
		System.out.println("\n\n********************************************************\n\n");
		System.out.println("Equipo Pokemon");
		System.out.println("======= ========\n");
		for(int i=0;i<n;i++){
			aux = jugador.getPokedex().getPokemon(i);
			if(aux.getCapturado())
				System.out.println((i+1)+".- "+aux.getNombre());
		}
		
		int op=-1;
		boolean flag=false;
		do{
			if(flag) System.out.println("Ingrese una opción válida...");
			System.out.println("Elije tu pokemon para la batalla....");
			try{
				op = Integer.parseInt(buffer.readLine());
				flag=true;
			}catch(IOException e){
				System.out.println("Error de lectura desde el teclado...");
			}
		}while((op<0)||(op>n));
		System.out.println("\n\n********************************************************\n\n");
		System.out.println("Su pokemon para el combate es "+ jugador.getPokedex().getPokemon(op-1).getNombre());
		System.out.println("\n\n********************************************************\n\n");
		combates[combateActual] = new Combate(jugador.getPokedex().getPokemon(op-1), pokedexGral);
		int rival = combates[combateActual].combatir();
		if (rival > -1){
			jugador.getPokedex().capturarPokemon(rival);
			System.out.println("Haz capturado un nuevo pokemon!!!");
		}
		combateActual+=1;
	}

	public void mostrarPokedex(){
		this.jugador.listarPokedexPersonal();
	}
	
}