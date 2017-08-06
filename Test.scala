class Student(i:Int,n:String,g:String,a:Int){
  var id : Int = i
  var name : String = n
  var gender : String = g
  var age : Int = a

  def display(){
    println(id + "  " + name + "  " + gender + "  " + age)
  }
}

object Test {
  def main(args:Array[String]) = {
    var stu = new Array[Student](100)
    var n = 0
    for( n <- 0 until 100){
      var id = n + 1
      var nameint = 99 + (new util.Random).nextInt(900)
      var name = nameint.toString
      var gen = (new util.Random).nextInt(2)
      var gender : String = ""
      if (gen == 0){
        gender = "male  "
      }
      else{
        gender = "famile"
      }
      var age = 15 + (new util.Random).nextInt(6)
      stu(n) = new Student(id,name,gender,age)
      stu(n).display()
    }
  }
}
