import java.util.*

class Venda{
    val scanner = Scanner(System.`in`)

    fun realizarVenda(carrinho: List<Produto>,valorTotal:Double){

        println("Valor total da compra: R$ $valorTotal")
        println("Qual será o método de pagamento?\n1. Cartão\n2. Dinheiro\n3. Pix: ")
        val pagamento = scanner.nextInt()

        when (pagamento) {

            1 -> {
                println("Informe o tipo de cartão:\n1. Crédito\n2. Débito")
                val tipoCartao = scanner.nextInt()
                println("Informe o número do cartão:")
                val numeroCartao = scanner.next()
                println("Informe a data de validade (MM/AA):")
                val validade = scanner.next()
                println("Informe o código de segurança (CVV):")
                val cvv = scanner.next()
            }

            2 -> {
                println("Informe o valor pago:")
                val valorPago = scanner.nextDouble()

                if (valorPago < valorTotal) {
                    println("Valor pago insuficiente. O total é R$ $valorTotal.")
                } else {
                    val troco = valorPago - valorTotal
                    println("Pagamento realizado com sucesso! Troco: R$ $troco.")
                }
            }
            3 -> {

                println("Código para pagamento via Pix:")
                val codigoPix = "PIX123456"
                println(codigoPix)
                println("Pagamento via Pix realizado com sucesso!")
            }



        }
    }
}