package models

import org.intellij.lang.annotations.Identifier
import java.awt.Color

class Lampada {

    private var ences:Boolean = false
    private var color:String = "Blanc"
    private var intensitat:Int = 1
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

}