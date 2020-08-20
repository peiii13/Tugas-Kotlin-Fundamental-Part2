
fun main() {
    val panjang = "8"
    val lebar = 14.6
    val tinggi = 10
    val volume = Double
    hitungVolume(8.0, 14.6, 10.0)
}
fun hitungVolume(p : Double, l : Double, t : Double){
    val v = p * l * t
    println(" Volume dari balok yang mempunyai panjang $p, lebar $l, tinggi $t, adalah $v")
}