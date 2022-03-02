fun main(args: Array<String>) {

    val ing01 = Ingresso(12f)
    val ing02 = Ingresso(17f)
    val ing03 = Ingresso(12f)
    val ing04 = Ingresso(9f)
    val ing05 = Ingresso(12f)
    val ing06 = Ingresso(15f)
    val ing07 = Ingresso(17f)
    val ing08 = Ingresso(17f)
    val ing09 = Ingresso(12f)
    val ing10 = Ingresso(9f)

    var ingressos = mutableListOf<Ingresso>(ing01,ing02,ing03,ing04,ing05,ing06,ing07,ing08,ing09,ing10)
    val contIng = ingressos.size -1

    val ass01 = Assento(true)
    val ass02 = Assento(false)
    val ass03 = Assento(true)
    val ass04 = Assento(true)
    val ass05 = Assento(true)
    val ass06 = Assento(false)
    val ass07 = Assento(true)
    val ass08 = Assento(true)
    val ass09 = Assento(true)
    val ass10 = Assento(true)

    var assentos = mutableListOf<Assento>(ass01,ass02,ass03,ass04,ass05,ass06,ass07,ass08,ass09,ass10)
    val contAss = assentos.size -1

    val cli1 = Cliente("Marcos",TipoCliente.comum,12f,ing01,ass01)
    val cli2 = Cliente("José",TipoCliente.estudante,16f,ing02,ass02)
    val cli3 = Cliente("Agatha",TipoCliente.professor,20f,ing03,ass03)
    val cli4 = Cliente("Tatiane",TipoCliente.comum,9f,ing04,ass04)
    val cli5 = Cliente("Paulo",TipoCliente.estudante,20f,ing05,ass05)
    val cli6 = Cliente("Leonardo",TipoCliente.professor,24f,ing06,ass06)
    val cli7 = Cliente("Ana",TipoCliente.comum,3f,ing07,ass07)
    val cli8 = Cliente("Bryan",TipoCliente.idoso,5f,ing08,ass08)
    val cli9 = Cliente("Aline",TipoCliente.idoso,15f,ing09,ass09)
    val cli10 = Cliente("Renata",TipoCliente.comum,17f,ing10,ass10)

    var clientes = mutableListOf<Cliente>(cli1,cli2,cli3,cli4,cli5,cli6,cli7,cli8,cli9,cli10)
    val contCli = clientes.size -1

////////CÁCULO DE DESCONTOS

    for(Cliente in clientes){
        if(Cliente.tipoCliente == TipoCliente.estudante){
            Cliente.ingresso.preco = (Cliente.ingresso.preco*0.97f)
            println("")
            System.out.printf("%s é estudante, preço do ingresso reduzido para %.2fR$",Cliente.nome,Cliente.ingresso.preco)
            println("")
        } else if(Cliente.tipoCliente == TipoCliente.professor){
            Cliente.ingresso.preco = (Cliente.ingresso.preco*0.95f)
            println("")
            System.out.printf("%s é professor(a), preço do ingresso reduzido para %.2fR$",Cliente.nome,Cliente.ingresso.preco)
            println("")
        } else if(Cliente.tipoCliente == TipoCliente.idoso){
            Cliente.ingresso.preco = (Cliente.ingresso.preco*0.90f)
            println("")
            System.out.printf("%s é idoso(a), preço do ingresso reduzido para %.2fR$",Cliente.nome,Cliente.ingresso.preco)
            println("")
        }


    }

////////VALIDAR ASSENTOS

    for(Cliente in clientes){
        if(Cliente.assento.disponivel == false){
            println("Assento indisponível para ${Cliente.nome}!")
            println("--")
        } else if (Cliente.assento.disponivel == true)
            println("Assento Reservado Para ${Cliente.nome}.")
        println("--")
    }

////////VENDA DE INGRESSOS
////////CANCELAMENTO DE VENDAS

    for(Cliente in clientes){
        if(Cliente.dinheiro < Cliente.ingresso.preco){
            println("${Cliente.nome} Não pode pagar pelo ingresso. Venda cancelada!")
            println("--")
        } else if (Cliente.dinheiro >= Cliente.ingresso.preco)
            println("Ingresso vendido para ${Cliente.nome}.")
        println("--")
    }


}






