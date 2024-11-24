package com.example.inote.ui.utils

import android.content.Context
import android.content.SharedPreferences

class AppSittings {

    private lateinit var fileInApp: SharedPreferences
    /*Мы говорим, что переменная fileInApp будет хранить объект, который реализует интерфейс SharedPreferences.
     Однако, мы еще не знаем точно, как именно это будет реализовано. Реализация происходит внутри системы Android, когда мы вызываем метод getSharedPreferences().
     Этот метод создает объект, который реализует интерфейс SharedPreferences, и мы можем работать с ним, как с обычным объектом этого типа.*/


    fun helper(context: Context) {
        fileInApp = context.getSharedPreferences("sittings", Context.MODE_PRIVATE)
        //“Эй, контекст, покажи мне хранилище данных с именем sittings,(и присвой его к "fileInApp")
        // и я хочу, чтобы это хранилище было доступно только для нашего приложения(Context.MODE_PRIVATE).
        // А само хранилище уже создается на запуске приложений в классе App : com.example.inote.ui.App
    }

    var isOnBoardShown: Boolean

        // так мы перезаписывая Getter
        // он говорит вытащи нам из хранилища данные вот ключ "isOnBoardShown" , false это дефолтное значение
        get() = fileInApp.getBoolean("isOnBoardShown", false)


        // так сеттер(какое-нибудь значение нашем случае True или False) = value
        // зайди в хранилище и измени(edit())    под ключом  "isOnBoardShown" значение на value(True или False)
        set(value) = fileInApp.edit().putBoolean("isOnBoardShown", value).apply()
}