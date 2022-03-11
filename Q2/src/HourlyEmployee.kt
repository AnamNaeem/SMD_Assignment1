class HourlyEmployee(id : Int = 0, name : String = " ") : Employee(id, name), IPayrollCalculator
{
    override fun calculate_payroll(): Number
    {
        return 30000
    }
    init
    {
        this.name = name
        this.id = id
    }
}