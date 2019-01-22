# last-man-standing

# Simulation problem statement
There are N people standing in a circle. Lets assign them numbers 0 ... N-1. To begin with,
Person 0 has a sword. He kill the person next to him (1) and passes the sword to the next alive
person (2). That person again kills the person next to him and passes the sword to the next alive
person. This process continues till there is only one person alive.
Write a program that runs this simulation for a give value of N. In each iteration, the program
should print “Person x killed y” where x is the number of the person who had the sword for that
iteration and y is the person who got killed.
Finally, the program should print the index of the last person alive.
Notes:
● To test the correctness: For N = 1000, the last alive person is 976 and for N = 10, the last
alive person is 4.
● Allowed languages: Golang, Ruby, Python, Java, NodeJS
● Code will be evaluated on the basis of completeness of implementation as per
functional requirements
● Having unit tests will be a bonus
● Code should be submitted with instructions on how to setup and execute

# How to execute the unit tests:
● Clone the repository in your machine
● Navigate to the project directory
● Execute the following command in terminal
  ./gradlew build
  
# Test Reports:
● For results, navigate to the following path from terminal
  /build/reports/tests/test
● Enter the follwing command in terminal
  open index.html

# To execute the code with a certain input:
● Enter the following command
  gradlew -Pargs="10,20,45,78" run
  The inputs can be passed as a comma separated string without any blankspaces.
