package POO.gettersetter

fun main() {
    //a nivel de constructor primario a parte de inicializar atributos
    //ya configuran el getter y el setter
    //val usuario = Usuario("abs@gmail.com","123456")
    val usuario = Usuario()
    usuario.email = "ABC@mail.com" //Setter -> parametro value = "ABC@mail.com"
    usuario.password = "abE4#678"
    println(usuario.email) //Getter
    println(usuario.password)

    val usuarioRegistrado = UsuarioRegistrado()
    usuarioRegistrado.usuario = usuario

    //val aux = "abE4#678"
    //println(aux.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@\$%^&*-]).{8}\$".toRegex()))
}