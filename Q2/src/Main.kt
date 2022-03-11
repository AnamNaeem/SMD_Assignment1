fun main()
{
    var e = SalaryEmployee()
    println(e.calculate_payroll())

    var e1 = ComissionEmployee()
    println(e1.calculate_payroll())

    var e2 = HourlyEmployee()
    println(e2.calculate_payroll())

    //payroll of salary employee is set as 50K, comission employee as 20K and hourly employee as 30K
}