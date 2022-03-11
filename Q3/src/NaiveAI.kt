open class NaiveAI(name : String = " ") : Player(name)
{
    override fun next(): Int
    {
        println("Next of Naive AI called")
        return 1
    }
}