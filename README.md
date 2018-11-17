# java8

## Lambda Expression:
Java8 introduce a new feature called functional interface. Where an interface can only have a single abstract method but it can have many default methods. So the implementation of this functional interface using java8 is called lambda experience. It would reduce a lots of boiler plate code and no need to write any interfaceImpl class.

## Predicate:
Predicate is another new feature of lambda function. Like mathematical predicate it takes an input and produce a boolean result. A typical example of predicate is Java8 stream filter.

## Consumer, Supplier, operator:
All are new features of lambda expression. Consumer takes input but don't return any output. i.e. it takes a variable as a input at lambda expression and print the input. Supplier on the other hand don't take any input but produce an output And Operator receive and return same value.

## Java 8 Streams: 
Java 8 streams are basically a generalization of lists: they are sequences of objects; the difference is in how you use them.

Suppose, for example that you have a list of Person objects, and you want to make a list of all the pets belonging to people over 35 years old. In Java 7, you would do it like this:

List List<Pet> pets = new ArrayList<>(); 
for (Person p : people)  {
    if (p.getAge() > 35) {
		pets.add(p.getPet());
    } 
}
In Java8, you can do this:

List<Pet> pets = people.stream()
    . filter((p) -> p.getAge() > 35)
    . map(Person::getPet)
    . collect(Collectors.toList());   
    
    