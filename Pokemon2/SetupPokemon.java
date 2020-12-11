/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thae
 */
public class SetupPokemon{
	public static int cantidadPokemones = 9;
	public static int cantidadPartidas = 10;
	public static int cantidadCombates = 10;
	public static int cantidadAtaques = 3;
	public static int ps_max = 10;
	public static int ataque = 10;
	public static int defensa = 10;
	public static int velocidad = 10;
	public static String [] nombres = {"Pikachu","Squirtle","Bulbasaur","Charmander","Eevee","Machop","Cubone","Gastly","Seel"};
	public static String [][] ataques = 
        {
            {"Impactrueno","Látigo","Gruñido"}, //Pikachu
            {"Látigo","Placaje","Burbuja"},  //Squirtle
            {"Placaje","Gruñido","Drenadoras"},   //Bulbasaur
            {"Arañazo","Gruñido","Ascuas"},       //Charmander
            {"Gruñido","Látigo","Placaje"},      //Eevee
            {"Golpe kárate","Patada baja","Malicioso"},  //Machop
            {"Hueso palo","Látigo","Golpe cabeza"},       //Cubone
            {"Rencor","Lenguetazo","Rayo confuso"},      //Gastly
            {"Golpe cabeza","Gruñido","Viento hielo"}   //Seel
            };  
        
        
	//public static final String [][] valores = {{10,0,0,5,0,2,0,0,2},{5,0,2,...},...} ?;

    public static int getPs_max() {
        return ps_max;
    }

    public static void setPs_max(int ps_max) {
        SetupPokemon.ps_max = ps_max;
    }

    public static int getAtaque() {
        return ataque;
    }

    public static void setAtaque(int ataque) {
        SetupPokemon.ataque = ataque;
    }

    public static int getDefensa() {
        return defensa;
    }

    public static void setDefensa(int defensa) {
        SetupPokemon.defensa = defensa;
    }

    public static int getVelocidad() {
        return velocidad;
    }

    public static void setVelocidad(int velocidad) {
        SetupPokemon.velocidad = velocidad;
    }
}