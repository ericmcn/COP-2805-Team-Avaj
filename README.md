# Team Avaj
## File Search Application Project

### Team Members
* Kevin Kirkfield
* Add your name here
* Add your name here
* Add your name here

### Setup

#### Prerequisites
This project is set up to use Maven. If you do not have Maven installed, you can grab it from https://maven.apache.org/download.cgi.
1. Extract the contents to a directory of your choosing.
2. Inside the extracted directory there is a bin directory. Add the path to the __bin__ directory to the __PATH__ environment variable.  
_E.g. C:\Program Files (x86)\Maven\apache-maven-3.3.9\bin_
3. Maven needs to be able to find the JDK. Create a new environment variable called __JAVA_HOME__ and set it to the __path of the installed JDK__.  
_E.g. C:\Program Files\Java\jdk1.8.0_72_

#### Eclpise
The __.project__ file is included for Eclipse. It has all the configuration settings already set up. The files in the __.settings__ directory include build settings to configure Eclipse to use Maven.

#### NetBeans
1. Click the __File__ menu in the top left.
2. Click __New Project__.
3. Select __Maven__ as the category.
4. Select __Project with Existing POM__.
5. Click __Next__ and then __Finish__.
6. Select the directory for your local copy of this project.
7. Click __Open Project__.

### Project Structure
__src\main\java\cop2805\avaj__  
Contains application source code.  
__src\main\java\cop2805\avaj\controllers__  
Contains source code for controllers.  
__src\main\java\cop2805\avaj\models__  
Contains source code for models.  
__src\main\java\cop2805\avaj\views__  
Contains source code for views.  
__src\main\resources__  
Contains images or any other resources the application needs to run.  
__src\test\java__  
Contains the source code for JUnit tests.  
__src\test\resources__  
Contains any resources the tests need to run.

### Building the Project
Eclipse will automatically build the project by default. You can disable this under the __Project__ menu in Eclipse. You can run the project through the __Run__ menu in Eclipse. You can build and run the project through the __Run__ menu in NetBeans. You can also build the project through Maven using `mvn compile` on the command line from the project working directory.

### Project Branches
The __master__ branch is for final working code that has been tested and passed code review. The __develop__ branch is for code that someone wants to be reviewed. Each group member should have their own __personal branch__ with their changes on the GitHub repo. This will show you did something, even if the changes don't get merged into the final application.
