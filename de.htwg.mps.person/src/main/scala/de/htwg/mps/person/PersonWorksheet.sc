package de.htwg.mps.person

object PersonWorksheet {
  1+2                                             //> res0: Int(3) = 3
  
  val peter = new Person("Peter", new Date(2008,7,4))
                                                  //> peter  : de.htwg.mps.person.Person = Person(Peter,2008-7-4)
  peter.age                                       //> res1: Int = 7
  peter.age(new Date (2012,1,1))                  //> res2: Int = 3
  val paul = Person("Paul", new Date(1995,12,31)) //> paul  : de.htwg.mps.person.Person = Person(Paul,1995-12-31)
  val mary = Person("Mary", new Date(1965, 1,1))  //> mary  : de.htwg.mps.person.Person = Person(Mary,1965-1-1)
  mary.age                                        //> res3: Int = 50
  mary.age( Date(1966,1,1))                       //> res4: Int = 1
  mary.age( Date(1965,12,31))                     //> res5: Int = 0
  
  
  
  
   def greeting(p: Person) = p match {
    case kid if (kid.age <= 12) => "Hello " + kid.name
    case teen if (teen.age < 20) => "Hey " + teen.name
    case twen if (twen.age < 30) => "Hi " + twen.name
    case adult if (adult.age < 60) => "Welcome " + adult.name
    case _ => "Welcome " + p.name
  }                                               //> greeting: (p: de.htwg.mps.person.Person)String
  
  val list = List(peter, paul, mary)              //> list  : List[de.htwg.mps.person.Person] = List(Person(Peter,2008-7-4), Perso
                                                  //| n(Paul,1995-12-31), Person(Mary,1965-1-1))
  list.foreach(p => println(greeting(p)))         //> Hello Peter
                                                  //| Hey Paul
                                                  //| Welcome Mary
}