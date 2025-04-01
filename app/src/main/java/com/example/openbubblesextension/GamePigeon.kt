package com.example.openbubblesextension

import org.json.JSONObject

class GamePigeon(dataUrl: String) {
    private val cryption: Cryption = Cryption()
    public val data: JSONObject = cryption.parseDataUrlToJson(dataUrl)
    private val game = data.getString("game")
    fun main() {
        println(data.toString())
    }

    fun data(): JSONObject {
        return data
    }

}