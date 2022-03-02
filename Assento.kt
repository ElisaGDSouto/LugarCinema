class Assento(
    var disponivel:Boolean
)
{
    private var assentos = mutableListOf<Assento>()
    val cont = assentos.size - 1

////////MOSTRAR ASSENTOS DISPONÍVEIS

    fun checkDisponivel(disponivel:Boolean) =
        assentos.filter { a -> a.disponivel == true }

}