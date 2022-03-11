fun main()
{
    val vehicle1 = Vehicle()
    vehicle1.print()

    val vehicle2 : IVehicle = Boat()
    vehicle2.print()

    val vehicle3 : IVehicle = Car()
    vehicle3.print()

    val vehicle4 : IVehicle = Amphicar()
    vehicle4.print()
}

//The problem in the code is called Diamond Problem when one class has two children which then have a child.
//As multiple inheritance is not possible in Kotlin, Interfaces had to be made which are then Implemented by the child class.