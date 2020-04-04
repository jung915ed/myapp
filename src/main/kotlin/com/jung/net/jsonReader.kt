package com.jung.net

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url =
        URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
    //kotlin read url data
    println(url.readText())

    //kotlin url connection
    /*with(url.openConnection() as HttpURLConnection){
        //val br = BufferedReader(InputStreamReader(inputStream))
        val br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }
        */

    /*
        var line = br.readLine()
        val json = StringBuffer()
        while (line != null) {
            json.append(line)
            line = br.readLine()
        }
        println(json.toString())
    }*/
    //val con = url.openConnection() as HttpURLConnection

}
