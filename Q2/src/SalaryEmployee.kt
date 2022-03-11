open class SalaryEmployee(id : Int = 0, name : String = " ") : Employee(id, name), IPayrollCalculator
{
    override fun calculate_payroll(): Number
    {
        return 50000
    }
    init
    {
         this.name = name
         this.id = id
    }
}