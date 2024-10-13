import java.util.*
    fun main () {

        val carrinho = Carrinho()
        val venda = Venda()
        do {
            print("1.Cadastrar produto\n2.Alterar produto\n3.Ver lista de produtos\n4.Excluir produto \n5.Adicionar produtos no carrinho\n6.Realizar venda\n7.Sair\n")
            var x = readLine()!!.toInt()



            when (x) {
                1 -> cadastrarProduto()
                2 -> alterarProduto()
                3 -> verLista()
                4 -> excluirProduto(listaDeProdutos)
                5 -> carrinho.addNoCarrinho()
                6 -> venda.realizarVenda(carrinho.carrinho,carrinho.valorTotal)
                7 -> print("Programa encerrado.")
                else -> print("Opcao invalida")
            }
        } while (x != 7)
    }
