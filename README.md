# Logic tasks

### Technologies used:
+ Java 8
+ Maven 
+ Checkstyle plugin

##### Running the application with IDE
1) *Download and install* the [JDK](https://www.oracle.com/java/technologies/javase-downloads.html, "Download JDK") <br>
2) *Download and install* the [IDE Intellij Idea](https://www.jetbrains.com/ru-ru/idea/download/#section=windows, "Download IDE") <br>
3) Clone this project
4) Add Run/Debug Configurations or File -> Invalidate Caches / Restart ...
4) Run a project

### 1 Task «Brackets»
**Task description** - src/main/java/one/Brackets.java <br>
**Path to tests** - src/test/java/one/BracketsTest.java <br>
### 2 «Graph»
**Task description** - src/main/java/two/Main.java <br>
To test the task, you must run the main method in the src/main/java/two/ Main.java class <br>
The console will open.

##### List of commands:
[ac] - add a city to the graph <br>
[an] - add a path between cities with distance. Example [an Lvov/Kyiv 15000] <br>
[f] - find a given number of shortest paths between cities. Example [f Lvov/Kyiv 1000] <br>
[h] - help <br>
[lc] - list of cities in the column <br>
[q] - exit <br>

Initial data that are in the graph:

           Lvov -- 534 --- Kyiv ------ 468 ----- Kharkiv
            /                  \                      \
         277,5                476,6                   321,9
          /                      \                      \
      Uzhgorod ----- 1281,4 ---- Dnepr --- 455,5 --- Luhansk
          \                        \                    /
          394                      261,5             168,2
            \                        \                /
           Ternopil ----- 758 ---- Kherson -- 546 -- Donetsk
              \
              683
                \
              Odessa
### 3 «Factorial»
**Task description** - src/main/java/three/Factorial.java <br>
**Path to test** - src/test/java/three/FactorialTest.java <br>