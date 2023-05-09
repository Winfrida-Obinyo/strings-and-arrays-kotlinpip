fun main() {
    var numbers =(arrayOfNumbers (arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)))
    println(numbers)
    val sortedPersons = persons.sortedByDescending { it.age }
    println(sortedPersons)
    val names = getNames("Alice", "Bob", "Charlie")
    println(names)

    val cars = (getAverageMileage(listOf(
        Car("ABC123", 10000.0),
        Car("DEF456", 20000.0),
        Car("GHI789", 15000.0)
    )))
    println(cars)




}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order.
fun arrayOfNumbers(numbers: Array<Int>) {

    println(" ${numbers[1] + numbers[4]}")
//prints out the index of 158
    val index = numbers.indexOf(158)
    if (index != -1) {
        println("Index of 158: $index")
    } else {
        println("158 not found in the array")
    }
//    prints out the elements in ascending order
    val sortedNumbers = numbers.sorted()
    println("Elements in ascending order: $sortedNumbers")
}
//. Given a list of Person objects, each with the attributes, name, age, height, and weight. Sort the list in order of descending age
data class Person(val name: String, val age: Int, val height: Int, val weight: Int)
val persons = listOf(
    Person("Alice", 25, 170, 60),
    Person("Bob", 30, 180, 75),
    Person("Charlie", 20, 165, 55),
    Person("Dave", 35, 175, 70)
)
//Create a function that takes in 3 names and returns a string array containing all 3 names.
fun getNames(name1: String, name2: String, name3: String): Array<String> {
    return arrayOf(name1, name2, name3)
}
//rite a function that takes in a list of Car objects each with a registration and
// mileage attribute and returns the average mileage of all the vehicles in the list
data class Car(val registration: String, val mileage: Double)
fun getAverageMileage(cars: List<Car>): Double {
    val totalMileage = cars.fold(0.0) { sum, car -> sum + car.mileage }
    return totalMileage / cars.size
}




