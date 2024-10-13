import java.util.*
data class Produto(val cod : Int, var nome : String, var valor : Double, var tipo : String)
val scanner = Scanner(System.`in`)
val listaDeProdutos = ArrayList<Produto>()

    fun cadastrarProduto(){

        print("Digite o codigo do produto:")
        val codigo = scanner.nextInt()
        scanner.nextLine()
        print("Digite o nome do produto:")
        var nome = scanner.nextLine()

        print("Digite o valor do produto:")
        var valor = scanner.nextDouble()
        scanner.nextLine()

        print("Digite o tipo do produto:")
        var tipo = scanner.nextLine()

        println("\nProduto cadastrado!\n")

        val produto = Produto(codigo, nome, valor, tipo)
        listaDeProdutos.add(produto)

    }

    fun verLista(){
        if (listaDeProdutos.isEmpty()) {
            println("Nenhum produto cadastrado.\n")
        }else{
                for (produto in listaDeProdutos) {
                    println("Código: ${produto.cod}, Nome: ${produto.nome}, Valor: R$ ${produto.valor}, Tipo: ${produto.tipo}")
                }
            }
        }

    fun alterarProduto() {
        println("Digite o codigo do produto que voce quer alterar: ")
        val codigo = scanner.nextInt()

        val produto = listaDeProdutos.find { it.cod == codigo }

        if (produto != null) {
            println("Produto encontrado: $produto")

            print("Digite o novo nome (ou pressione Enter para manter o atual: ${produto.nome}): ")
            val novoNome = readLine()
            if (!novoNome.isNullOrBlank()) {
                produto.nome = novoNome

            }

            print("Digite o novo valor(ou pressione Enter para manter o atual: ${produto.valor}): ")
            val novoValor = readLine()
            if (!novoValor.isNullOrBlank()) {
                produto.valor = novoValor.toDouble()

            }

            print("Digite o novo tipo(ou pressione Enter para manter o atual: ${produto.tipo}): ")
            val novoTipo = readLine()
            if (!novoTipo.isNullOrBlank()) {
                produto.tipo = novoTipo

            }

            println("Produto alterado com sucesso: $produto")
        } else {
            println("Produto nao encontrado!\n")
        }
    }

    fun excluirProduto(listaDeProdutos:MutableList<Produto>){

        println("Digite o codigo do produto: ")
        val codigo = scanner.nextInt()
        val produto = listaDeProdutos.find { it.cod == codigo }

        if (produto != null) {
            listaDeProdutos.remove(produto)
            println("Produto excluido!")
        }else{
            println("Produto nao encontrado!\n")
        }
    }










