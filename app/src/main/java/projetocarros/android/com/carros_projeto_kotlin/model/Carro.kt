package projetocarros.android.com.carros_projeto_kotlin.model

import android.graphics.Bitmap

class Carro(
    val modelo : String,
    val ano : Int,
    val marca: Marca,
    val motor : Motor,
    val preco : Float,
    val acessorio : List<Acessorio>,
    val image : Bitmap

)
{
    fun gerarAcessoriosFormatado() :String{
        var aux = StringBuilder();
        aux.append("${acessorio.nome} (${acessorio.preco})");

        return aux.trimEnd().trimEnd(',').toString();
    }


}
