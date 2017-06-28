package projetocarros.android.com.carros_projeto_kotlin.custom

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import java.util.*

fun Float.getPrecoHumam() = String.format(Locale.GERMAN,"%,.2f");

fun String.bold() : SpannableStringBuilder{
    val aux = SpannableStringBuilder();
    aux.setSpan(
        StyleSpan(Typeface.BOLD),
        0,
        this.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    return aux;
}
