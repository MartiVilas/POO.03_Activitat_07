package models

import org.intellij.lang.annotations.Identifier
import utilities.*
import java.awt.Color

class Lampada {

    private var ences:Boolean = false
    private var color:String = ""
    private var intensitat:Int = 1
    private val colorsValids = listOf("Blanc","Groc", "Vermell", "Verd")
    private var identificador:Int=0

    constructor(ences: Boolean){
        this.ences=ences
    }
    constructor(ences:Boolean,color: String, intensitat:Int, identificador:Int){
        this.ences=ences
        this.color=color
        this.intensitat=intensitat
        this.identificador=identificador
    }
    fun setEnces(ences:Boolean){
        this.ences=ences
    }
    fun getEnces():Boolean{
        return this.ences
    }
    fun setColor(color:String){
        this.color=color
    }
    fun getColor():String{
        return this.color
    }
    fun setIntensitat(intensitat: Int){
        this.intensitat=intensitat
    }
    fun getIntenstiat():Int{
        return this.intensitat
    }

    fun setIdentificador(identificador: Int){
        this.identificador=identificador
    }

    fun getIdentidicador():Int{
        return this.identificador
    }

    override fun toString(): String {
        return  "Encès: $ences\n"+
                "Color: $color\n" +
                "Intensitat: $intensitat\n" +
                "Identificador: $identificador"
    }

    fun apagarLampada(){
        if (getEnces()){
            setEnces(false)
            setIntensitat(0)
        }
        println("Lampada apagada")
        return println(toString())
    }

    fun encenLampada(){
        if (!getEnces()){
            setEnces(true)
            setIntensitat(1)
        }
        println("${YELLOW_BRIGHT}Lampada encesa${RESET}")
        println()
        return println(toString())

    }
    fun posarIdentificador(){
        if (getEnces()) {
            when (getIdentidicador()) {
                1 -> println("habitació")
                2 -> println("Cuina")
                3 -> println("Menjador")
                4 -> println("Garatge")
                else -> {
                    print("No es un identificador vàlid")
                }
            }
        }
        return println(toString())
    }

    fun posarColor() {
        val colorIntroduit = llegirWord("Introdueix el color de la làmpada: Blanc, Vermell, Verd o Groc", "Cal introduir un color.")

        color = when (colorIntroduit.toLowerCase()) {
            "blanc" -> "${WHITE}$colorIntroduit${RESET}"
            "vermell" -> "${RED}$colorIntroduit${RESET}"
            "verd" -> "${GREEN}$colorIntroduit${RESET}"
            "groc" -> "${YELLOW}$colorIntroduit${RESET}"
            in colorsValids -> colorIntroduit
            else -> {
                println("${RED_BOLD}Error: Color no vàlid. S'usarà el color per defecte: Blanc.${RESET}")
                "Blanc"
            }
        }
        return println(toString())
    }

    fun pujarIntensitat(){
        if(getEnces()){
            this.intensitat++
            println(this)
        }else{
            println("$identificador - Lampada apagada")
        }
    }

}



