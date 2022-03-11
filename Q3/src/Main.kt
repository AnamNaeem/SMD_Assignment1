fun main()
{
    var player1 = Player("Player 1")
    player1.next()

    var player2 = HumanPlayer("Player 2")
    player2.next()

    var player3 = NaiveAI("Player 3")
    player3.next()

    var player4 = BinarySearchAI("Player 4")
    player4.next()

    var player5 = SuperAI("Player 5")
    player5.next()

    var game = Game(0,0,0,false)
    game.Game(player5)
    game.run()
    game.hasWon()


}