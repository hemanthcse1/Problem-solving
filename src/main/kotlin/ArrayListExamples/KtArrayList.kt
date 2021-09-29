package ArrayListExamples


fun main(){

    var employeeList: ArrayList<EmpUser> = arrayListOf()

    employeeList.add(EmpUser("Hemanth","Kumar",121))
    employeeList.add(EmpUser("Anil","Kumar",122))
    employeeList.add(EmpUser("Tejas","Kumar",123))
    employeeList.add(EmpUser("Kiran","Kumar",124))
    employeeList.add(EmpUser("aadharsh","N",125))

    employeeList.forEach { EmpUser -> println(EmpUser.firstName) }



}