open class ComissionEmployee(id : Int = 0, name : String = " ") : SalaryEmployee(id, name), IPayrollCalculator
{
    override fun calculate_payroll(): Number
    {
        return 20000
    }
    init
    {
        this.name = name
        this.id = id
    }
}