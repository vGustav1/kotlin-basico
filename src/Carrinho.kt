import java.util.*

class Carrinho() {

    val carrinho = mutableListOf<Produto>()
    val scanner = Scanner(System.`in`)
    var valorTotal : Double = 0.0

    fun addNoCarrinho() {

        while (true) {
            print("Digite o codigo do produto que deseja comprar:")
            val codProduto = scanner.nextInt()
            val produto = listaDeProdutos.find { it.cod == codProduto }

            if (produto != null) {
                println("Digite a quantidade:")
                val quantidade = scanner.nextInt()

                for (i in 1..quantidade) {
                    carrinho.add(produto)
                }

                valorTotal += produto.valor * quantidade
                println("${quantidade}x ${produto.nome} adicionado(s) ao carrinho. Valor total: R$ $valorTotal")
            } else {
                println("Produto nao encontrado")
            }
            print("Deseja adicionar mais produtos ao carrinho? (s/n): ")
            if (scanner.next().equals("n", ignoreCase = true)) {
                break
            }
        }
        println("Compra finalizada. Valor total: R$ $valorTotal")
    }
}