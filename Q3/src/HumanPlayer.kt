class HumanPlayer(name : String = " ") : Player(name)
{
    override fun next(): Int
    {
        println("Next of Human Playr called")
        return 1
    }
}