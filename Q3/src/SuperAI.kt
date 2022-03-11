class SuperAI(name : String = " ") : NaiveAI(name)
{
    override fun next(): Int
    {
        println("Next of Super AI called")
        return 1
    }

}