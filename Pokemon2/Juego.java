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

public class Juego{
	private Pokedex pokedexGral;
	private Partida [] partidas;
	private int contadorPartidas;
        private Mapa mapa;

	private BufferedReader buffer;

	Juego(){
		this.pokedexGral = new Pokedex();
		this.partidas = new Partida[SetupPokemon.cantidadPartidas]; 
		this.contadorPartidas = 0;
	}
	public void jugar(){
		this.partidas[this.contadorPartidas]= new Partida(pokedexGral);
	}

}