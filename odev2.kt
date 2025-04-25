package com.example.day


// fahrenhieta dönüştürme
fun fahrenhiet ( c: Double) {
    var c= c*1.8+32
    println(c)
}

// dikdörtgenin çevresi

fun dık4gen (k1: Int, k2: Int, k3: Int, k4: Int) {

    var cevre= k1+k2+k3+k4
    println(cevre)
}

//faktoriyel
fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) { //
        sonuc = sonuc *  i
    }
    return sonuc
}
// a sayısı
fun aHarfiSayisiniBul(kelime: String): Int {
    var aSayisi = 0
    for (harf in kelime) {
        if (harf == 'a' || harf == 'A') {
            aSayisi++
        }
    }
    return aSayisi
}
// iç açı
fun icAciToplaminiHesapla(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// maaş
fun maasHesapla(gunSayisi: Int): Int {
    val toplamSaat = gunSayisi * 8
    val normalSaat = if (toplamSaat > 160) 160 else toplamSaat
    val mesaiSaat = if (toplamSaat > 160) toplamSaat - 160 else 0

    val normalUcret = normalSaat * 10
    val mesaiUcreti = mesaiSaat * 20

    return normalUcret + mesaiUcreti
}

 // internet

fun internetUcretiHesapla(kullanilanKota: Int): Int {
    val sabitUcret = 100
    return if (kullanilanKota <= 50) {
        sabitUcret
    } else {
        val asimMiktari = kullanilanKota - 50
        sabitUcret + (asimMiktari * 4)
    }
}

fun main() {


    fahrenhiet(10.2) //fahrenhiet
    dık4gen(4,5,4,5) // dikdörgen

    //    faktoriyel

    val sayi = 5
    val sonuc = faktoriyel(sayi)
    println("$sayi! = $sonuc")


    val girilenKelime = "Afyonkarahisar"
    val sonuca = aHarfiSayisiniBul(girilenKelime)
    println("Kelime içinde $sonuca adet 'a' harfi var.")


    // iç açılar toplamı
    val kenarSayisi = 5
    val icAciToplami = icAciToplaminiHesapla(kenarSayisi)
    println("$kenarSayisi kenarlı bir çokgenin iç açılar toplamı: $icAciToplami derece")

    val gunSayisi = 25
    val maas = maasHesapla(gunSayisi)
    println("$gunSayisi gün çalışmanın maaşı: $maas TL")

    val kota = 65
    val ucret = internetUcretiHesapla(kota)
    println("$kota GB kullanım için toplam ücret: $ucret TL")
}




