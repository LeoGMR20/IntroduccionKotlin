package POO.gettersetter
//Em kotlin los getter y setter
//son implicitos por defecto
/*
Getter y Setter manueales los pueden trabajar cuando
no usan atributos en el constructor principal
apliquenlos par utilizar una logica adicional al momento de asignar o recibit valores para esos
atributos.
Cuando los configuras manuealmento estos van inmediatamente despues de la denominacion de la variable
o atributo
Tanto Getter como Setter utilizan dentro de sus procesos una especie de contenedor o campo
que es el que finalmente va a retornar o es el que va a asignar a la variable o atributo
(Field)
*/
//*****Registro de inicio de sesión de usuario*****
/*
Un usuario puede registrarse con el email y contraseña
para el email se necesita validar:
1) que al menos el email sea valodo conteniendo un @ en su estructura
2) que si el usuario introduce letras amyusculas lo volvamos todo a minusculas
Para el password se necesita validar:
1) el password debe ser de una longitud de 8 caracteres.
2) el password debe contener al menos un caracter numerico
3) el password debe contener al menos una mayuscula y una minuscula
4) el password deve contener al menos un caracter especial
*/
class Usuario {
    //Atributos
    //value = valor que estas asignando al atributo
    var esValido = true
    var mensajeError = ""
    var email: String = ""
        set(value) {
            field = if (value.contains("@")) value.lowercase() else {
                esValido = false
                ""
            }
        }
    var password: String = ""
        set(value) {
            field = if (value.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@\$%^&*-]).{8}\$".toRegex())) value else { //Si tiene los mismos caracteres
                esValido = false
                mensajeError = "Tu password no cumple con la solicitud mínima..."
                ""
            }
        }
        get() {return "*".repeat(field.length)}
}