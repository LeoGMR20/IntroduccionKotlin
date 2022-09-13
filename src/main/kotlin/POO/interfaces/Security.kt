package POO.interfaces

//las interface pueden simular una herencia múltiple
//varios programadores usan este trucop para tener
//este comportamiento que noes permitido en varios lenguajes

interface Security {
    abstract var redButton: Boolean

    abstract fun enableMovement()

    open fun xd(){
        println("xd")
    }
}