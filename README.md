# Java-Assignments
----------------------------Inheritance and polimorphism----------------------------------------

Implement the Point, Circle and Cylinder
classes and exercise the
inheritance features taught in the lectures. You should implement those three classes using
inheritance, with Shape being an abstract class. You should pay special attention to reusing
code from the class you inherit from so that you introduce the derived class with the minimal
amount of code. Having implemented those classes, you should write a ShapeTest program that gets 2, 3 or 4
arguments from the user and creates a Point, Circle or Cylinder accordingly. The user should
be able to create as many of these shapes and s/he wants. When the user finishes with passing
relevant input, the program should print the created objects out to the standard output using
the getName(), toString(), getArea() and getVolume() methods, in a similar fashion to the
polymorphic behaviour test program in the notes. The program should also deal gracefully
with incorrect number of arguments and incorrect type of arguments through checks and
exceptions

--------------------------Mean and Variance-------------------------------------------------------

Calculate the mean and variance of a series of floating point
numbers. It should first receive from the standard input the number of floating point numbers
to follow and then those numbers in a loop. The class you will write to implement this should
have reusable methods to calculate the mean, variance and also to receive/store a series of
floating point numbers from an input stream in general. As such, the “signature” of those
methods should be the following:
double calculateMean (double[] arguments)
double calculateVariance (double[] arguments)
double[] getArguments (int nargs, Scanner inputStream)
These methods should be public so that they are reusable by other programs and also static
since they only operate on their arguments and not on any instance variables. In fact, the class
MeanAndVariance you will implement should have only static methods, so it is the type of
class for which we never instantiate an object using the new operator. Make this class/program robust to wrong or incorrect input by
using exceptions and performing the right checks e.g. nargs >= 2. The program should
terminate by first printing the numbers for which it has calculated the mean and variance and
then the actual mean and variance.


---------------------------------Virtual Dice throwing program-----------------------------------

This program should emulate virtual dice throwing. It should receive as arguments the
number of sides of the virtual dice (should be >= 2) and the number of times to be thrown
which should be a multiple of the number of sides, you should check for this and make sure it
is the case. The program should then throw the dice and print out the number of times each
side occurred. Given than random numbers will be used, you should be able to see that the
higher the number of throws, the closer the results will be towards approximately equal
occurrence of all sides (same probability). The program should deal gracefully with incorrect
number and type of arguments through checks and exceptions. You will need to get the
arguments in infinite loops “e.g. while (true)”, continuing with “continue;” when an argument
is wrong and finally breaking the loop with “break;” when the arguments have been correctly
received – see also Moodle announcement “second week’s programming task”. 

# Assignment-2
In this exercise you are going to design, implement and test an ordered linked
list based on the generic List class introduced in the notes. The purpose of this exercise is to
understand in detail the use of inheritance through generic methods that are provided in
superclasses and can be used in diverse subclasses, resulting in reusability and extensibility. In
this specific case, a generic insert method will be added to class OrderedList (demonstrating
reusability) and then it could be used by specific subclasses, e.g. IntegerList, StringList, etc.,
by introducing type-specific compare methods (demonstrating extensibility).

The class List introduced in the notes supports linked list functionality in terms of inserting
and retrieving elements to/from the front and back of the list only. But in some applications,
e.g. time-driven simulation of a real system, elements need to be inserted in the list keeping it
ordered, e.g. representing the time when an event will happen. In such a use of an ordered
linked list, elements are only retrieved from the front of the list, e.g. as time advances and the
first item in the list becomes the “current event”.
So the first part of this exercise is to create an abstract class OrderedList class by extending
List and adding the following three methods:
protected abstract int compare(Object obj1, Object obj2);
public void insert (Object newData) { /* to impl */ }
public Boolean remove (Object remData) { /* to impl */ }

The compare method does not know what types of objects to compare, as such it is abstract
making also OrderedList an abstract class. The insert method should use compare to insert a
new object in the list while keeping the list in order. The algorithm for doing this should be as
follows. In order to insert an element in-between two others, we need to have a reference to
the first one and check through this if the element to insert is smaller than the second one, in
which case it should be inserted in-between the two. So we need to “walk-though” the list and
check where to insert the new element. But before we start this “walk”, we need to make sure
that the list has at least one element after which the new one should be added. The remove
method is easier to implement as it should simply “walk” through the list to find the element,
if it exists, and remove it

Having now implemented OrderedList, you should implement a subclass IntegerOrdList
which should simply redefine the compare method. The redefined compare method should
also be protected and should now assume that the two objects are of type Integer, so the
arguments of type Object should be “casted back” to Integer, for example ((Integer)
obj1).intValue() returns the actual integer value in argument obj1. A negative result should
mean obj1<obj2, zero should mean obj1=obj2 and a positive result should mean obj1>obj2.
You should also provide constructors which should initialise the list name.
Note that by implementing the IntegerOrdList through inheritance, we have the problem that
the List insertAtFront and insertAtBack methods can still be used while they shouldn’t. You
should redefine them in OrderedList to do nothing and print a relevant error message.

Having finished with the IntegerOrdList, you should also implement a StringOrdList which
should be a “ten minute job” given that all the work is effectively done by OrderedList and
you have already implemented IntegerOrdList which is very similar (only the 1-line compare
method will be different).
Having implemented the IntegerOrdList and StringOrdList classes, you should write an
OrderedListTest program that should demonstrate that these classes work correctly. This
should be done by getting a series of numbers or strings from the standard input, inserting
them and printing the list when required. It should also support removal of an element the user
specifies. You should also implement a small menu to guide the user through activities to
enter numbers/strings, print the list, remove a number/string, etc. The menu should allow
adding/removing numbers to the same list in successive sessions e.g. add three numbers and
print it, then remove a number and print it, add more numbers and print it, etc.
