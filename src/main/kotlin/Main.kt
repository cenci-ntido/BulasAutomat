// Suponho que você tenha uma classe chamada 'Aluno' com métodos 'print' e 'estudar'

fun main() {
    var loop = true
    var aluno = Aluno()

    while (loop) {
        println("Escolha 1 para implementar e 2 para estudar")
        val escolha = readLine()?.toIntOrNull() // Converte a entrada para Int ou null

        when (escolha) {
            1 -> {
                aluno.print() // Supondo que você tenha uma instância chamada 'aluno'
                loop = false
            }
            2 -> {
                aluno.estudar() // Supondo que você tenha uma instância chamada 'aluno'
                loop = false
            }
            else -> println("Digite uma opção válida!")
        }
    }
}
