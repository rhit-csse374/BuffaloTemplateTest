This is a java repository designed to work with Maven.

To build this on a windows system you must have both a
recent java and maven installed.  One easy way to do this
is with a package manager like chocolatey.

Go here to install it: https://chocolatey.org/install

Then as an administrator in Powershell do this:

    choco install openjdk
    choco install maven

Run the scripts it wants you to run.

Once you do that, restart visual studio code and open
a powershell terminal.  If you do, you should be able
to type:

    mvn test

Or

    mvn compile
    java -cp target/classes com.example.App

To run it as an application