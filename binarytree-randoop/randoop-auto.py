import os
import sys

# IMPORTANT: The script must be ran in project directory
# as it uses the pom.xml from the current working directory.
# If test files already exist in the src\test\java\york\eecs\bt
# directory, they are silently replaced.

# The script produces 4 log files in case it needs to be debugged,
# one for the output of mvn clean, one for compile,
# one for generating tests and one when running the tests
os.system('mvn clean > python_clean_log.txt')

os.system('mvn compile > python_compile_log.txt')

os.system('java -classpath %cd%/target/classes;%cd%/randoop-lib/randoop-all-4.2.1.jar randoop.main.Main gentests --testclass=york.eecs.bt.BinaryTree --output-limit=500 > python_gentest_log.txt')

os.system('del *.class')

with open('ErrorTest0.java', 'r') as file:
    data = file.read()
    file.close
with open('ErrorTest0.java', 'w') as file:
    file.write("package york.eecs.bt;\n\n")
    file.write(data)
    file.close

with open('RegressionTest0.java', 'r') as file:
    data = file.read()
    file.close
with open('RegressionTest0.java', 'w') as file:
    file.write("package york.eecs.bt;\n\n")
    file.write(data)
    file.close

    
os.replace('ErrorTest0.java', 'src/test/java/york/eecs/bt/ErrorTest0.java')
os.replace('RegressionTest0.java', 'src/test/java/york/eecs/bt/RegressionTest0.java')

os.system('mvn test -Dtest=york.eecs.bt.RegressionTest0 > python_runtest_log.txt')
