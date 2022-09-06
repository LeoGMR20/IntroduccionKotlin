package POO.enums

//algunas veces puedes apoyer cada valor
//con algun o algunos atributos que sirvan para reforzar el criterio
//Enum class puede contener constructores no vacíos
enum class ColorCategories(
    val hexCode: String
) {
    WHITE("#FFFFFF"),
    BLACK("#000000"),
    RED("#FF0000"),
    GREEN("#008000"),
    YELLOW("#FFFF00"),
    BLUE("#0000FF")
}