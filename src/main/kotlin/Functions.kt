fun main() {
    val user = setUser( name= "pei", hobby= "playing guitar", age= 16 )
    println(user)
}

fun setUser(name: String,hobby: String, age: Int) = "My name is $name, i like $hobby and I,m $age years old"