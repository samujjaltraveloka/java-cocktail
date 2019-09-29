
 1. Functional Programming
    * Lambda Calculus : Formal system in mathematical logic for expressing computation based on function abstraction and application using variable binding and substitution
    * Functions as first class citizens
    * Anonymous functions
    * vs OOP
    
 2. Why Functional Programming
    * No state change, same output for every input
    * Fits naturally with concurrency and parallelism
    * Frameworks like Apache Spark and Akka find Scala as more natural compared to Java
    * Declarative code is more concise and readable
    * Whats the downside with Java OOP: Sometimes we need to implement only behaviour and not with an object abstraction resulting in wrapping all the behaviour in a class requiring boiler place verbose code.
    
 3. Types
    * Functions
    * Higher Order Functions
    * First Order Functions
    * First class Functions
    * Monad
    
 4. Functional Interfaces
    * Takes Java from an OOP to Functional Programming paradigm
    * Lambda expressions only work with functional interfaces. So that means that anywhere a function interface is expected, we can use a lambda expression (also method references can be used).
    
 5. Lambda Expressions
    * Lambda expressions are the realization of functional programming principles
    * Lambda expressions are used to express a function directly in code without the need of object-oriented wrappers
    * Lambdas can replace anonymous classes
    * Lambda expressions can be used in code wherever a functional interface is expected
    * Since lambdas follow the semantics of a function, as in a functional programming language, they get all the parallelism and concurrency advantages that could be drawn from immmutable, consistent functions.
    
 6. Method Reference
 
 7. Stream(Java Monad, Collection was supercharged in Java 8 to support streams)
    * Process data in declarative statements instead of imperative 
    * Allows filter-map-reduce pattern to collections
    * Stream Sources
        - Collection.Stream()
        - Stream.of(T)
        - Stream.of(T[])
        - Stream.empty()
        - IntStream.range(lower, upper)
        - IntStream.rangeClosed(lower, upper)
    * Zero or more intermediate operations
        - filter<Predicate<T>>
        - map(Function<T, U>)
        - flatMap(Function<T, Stream<U>>)
        - distinct()
        - sorted()
        - Sorted(Comparator<T>)
        - limit(long)
        - skip(long)
        
    * Single Terminal Operation
        - forEach(Consumer<T>)
        - toArray()
        - reduce()
        - collect()
        - min(Comparator<T>)
        - max(Comparator<T>)
        - count()
        - findFirst()
        - findAny()
        - {any,all,none}Match(Predicate<T>) 
 
 8. Interface Extension Methods - Behaviour inheritance
 
 9. Optional
 
 
  
 