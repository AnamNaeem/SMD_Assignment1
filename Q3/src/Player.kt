open class Player(name : String = " ") : Protocol
{
    private var name : String
    override fun next() : Int
    {
      println("Next of player called ")
      return 1
    }
    init
    {
        this.name = name
    }
}