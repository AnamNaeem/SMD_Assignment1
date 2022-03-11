class Game( snum : Int = 0, high : Int = 0, low : Int = 0, win_flag : Boolean = false)
{
    private var secret_number : Int
    private var high : Int
    private var low : Int
    private var win_flag : Boolean
    private lateinit var player : Player

    init
    {
        this.high=high
        this.low=low
        this.secret_number=snum
        this.win_flag=win_flag
    }
    fun Game(player : Player)
    {
        this.player=player
    }
    fun run()
    {
        println("Game is running")
    }
    fun hasWon() : Boolean
    {
        println("Checking who has won")
        return win_flag
    }
}