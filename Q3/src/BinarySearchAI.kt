class BinarySearchAI(name : String = " ") : NaiveAI(name)
{
    override fun next(): Int
    {
        println("Next of Binary Search AI called")
        return 1
    }

}