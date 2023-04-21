import java.util.Arrays

fun main() {
drinks(9)
    drinks(5)
    guests(8)
    guests(15)
    oddNumbers()
    printNumbers()


    var sortedCars = cars.sortedBy { car -> car.make }
    println(sortedCars)
    var descendingSortedCars = cars.sortedByDescending { car -> car.model }
    println(descendingSortedCars)

    var adults = people.filter { person -> person.age >= 18 }
    println(adults)

    sum()
    age()
     var d=substract(10,20)
    println(d)
    var m=multiplication(2,90)
    println(m)
    girl()
    person()
    personTalk()
    messages()
    africa()
    var p=products(32,4)
    println(p)
    numbersA()
    students(2)

}
//control flow
fun drinks(name:Int) {
    when (name) {
        in 0..5 -> println("Glass of milk")
        in 7..14 -> println("A bottle of fanta")
        else -> println("A bottle of coca cola")
    }
}
fun guests(guest: Int){
    if( guest in 0..5){
       println("Glass of milk")
    }
    else if (guest in 7..14){
        println("A bottle of fanta")
    }
    else{
        println("A bottle of coca cola")
    }
}

fun oddNumbers(){
    for (num in 1..100)
    if(num % 2!=0){
        println(num)
    }
    else{
        println("other number")
    }

}
fun printNumbers(){
    for (nums in 1..100){
        if(nums % 3==0 && nums % 5==0){
            println("FizzBuzz")
        }
        else if (nums % 3==0){
            println("Fizz")
        }
        else if (nums % 5==0){
            println("Buzz")
        }
        else{
            println("number")
        }
    }
}

//list
data class Car(var make: String, var model: String)
var cars = listOf(
    Car("Toyota","Prado"),
    Car("Mazda", "Atenza"),
    Car("Subaru", "Legacy"),
    Car("Jeep", "Wrangler")
)


data class Person(var name: String, var age: Int)
var people =
    listOf(
        Person("Jane", 14),
        Person("Paul", 32),
        Person("Adrian", 16),
        Person("Muthoni", 25)
    )

fun sum(){
    var num2=20
    var num3=20
    var add=num2+num3
    println(add)
}
fun age(){
    var age=21
    age++
    println(age)
}
fun substract(num1:Int,num4:Int):Int{
    var differnce=num1+num4
    return differnce
}
fun multiplication(num5:Int,num6:Int){
    var product=num5*num6
}

fun girl(){
    var greet="Hello "
    var name="Ada "
    var message=greet + name
    println(message)
}
fun person(){
    var sms="My name is "
    var name="Angeth"
    var realMessage=sms+""+name
    println(realMessage)
}
fun personTalk(){
    var country="Kenya"
    var city="Nairobi"
    var personCity="$city is the capital city of $country"
    println(personCity)
}
fun messages(){
    var message1="Angeth is a South Sudanese"
    var message2="John is a Kenyan"
    if (message1===message2){
        println(true)
    }
    else{
        println(false)
    }
}
fun africa(){
    var africanPeople="Angeth is born in Kenya and she is a Ugandan"
    println(africanPeople.replace("Ugandan","South Sudanese "))
}
fun products(num8:Int,num9:Int):Int{
    var product1=num8*num9
    return product1
}
fun numbersA(){
    var numArray = arrayOf(10,14,32,6,43,2,75,8)
    var sortedNums = numArray.sortedArray()
    println(Arrays.toString(sortedNums))
}

fun students(student:Int){
    when (student){
        in 18..20-> println("Come to code")
        in 20..25-> println("You can do best")
        else-> println("go to class")
    }
}
fun fizzbuzz(){
    for (numbers in 0..100){
    if (numbers % 3===0 && numbers % 5===0){
        println("fizzBuzz")
    }
        else if (numbers % 3===0){
            println("fizz")
        }
        else if (numbers % 5===0){
            println("buzz")
        }
        else{
            println("other")
        }
}
}