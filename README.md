# ScalaSbt

## Compile & Package the project
`sbt compile package`

```scala
LM-SJC-11001988:ScalaSbt mayangupta$ sbt compile package
[info] Updated file /Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/project/build.properties: set sbt.version to 1.1.6
[info] Loading settings from idea.sbt ...
[info] Loading global plugins from /Users/mayangupta/.sbt/1.0/plugins
[info] Loading project definition from /Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/project
[info] Updating ProjectRef(uri("file:/Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/project/"), "scalasbt-build")...
[info] Done updating.
[info] Loading settings from built.sbt ...
[info] Set current project to scalademo (in build file:/Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] Updating ...
[info] Done updating.
[info] Compiling 3 Scala sources to /Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/target/scala-2.11/classes ...
[info] Done compiling.
[success] Total time: 6 s, completed Oct 27, 2018 2:31:34 PM
[warn] Multiple main classes detected.  Run 'show discoveredMainClasses' to see the list
[info] Packaging /Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/target/scala-2.11/scalademo_2.11-1.1.jar ...
[info] Done packaging.
[success] Total time: 0 s, completed Oct 27, 2018 2:31:34 PM
```

## Run the project

### Option 1
`sbt "runMain com.scala.example.ExampleHello"`
```scala
LM-SJC-11001988:ScalaSbt mayangupta$ sbt "runMain com.scala.example.ExampleHello"
[info] Loading settings from idea.sbt ...
[info] Loading global plugins from /Users/mayangupta/.sbt/1.0/plugins
[info] Loading project definition from /Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/project
[info] Loading settings from built.sbt ...
[info] Set current project to scalademo (in build file:/Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/)
[warn] Multiple main classes detected.  Run 'show discoveredMainClasses' to see the list
[info] Running com.scala.example.ExampleHello 
Hello Scala
[success] Total time: 1 s, completed Oct 27, 2018 2:34:15 PM
```

### Option 2
`sbt run`
```scala
LM-SJC-11001988:ScalaSbt mayangupta$ sbt run
[info] Loading settings from idea.sbt ...
[info] Loading global plugins from /Users/mayangupta/.sbt/1.0/plugins
[info] Loading project definition from /Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/project
[info] Loading settings from built.sbt ...
[info] Set current project to scalademo (in build file:/Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/)
[warn] Multiple main classes detected.  Run 'show discoveredMainClasses' to see the list

Multiple main classes detected, select one to run:

 [1] com.scala.example.ExampleClass
 [2] com.scala.example.ExampleFileRead
 [3] com.scala.example.ExampleHello
[info] Packaging /Users/mayangupta/Desktop/1.Project/eclipse_oxy/hadoop/ScalaSbt/target/scala-2.11/scalademo_2.11-1.1.jar ...
[info] Done packaging.

Enter number: 3

[info] Running com.scala.example.ExampleHello 
Hello Scala
[success] Total time: 10 s, completed Oct 27, 2018 2:32:42 PM
```

### Option 3
`$SPARK_HOME/bin/spark-submit \
  --class "com.scala.example.ExampleHello" \
  --master local[4] \
  target/scala-2.11/scalasbt_2.11-1.1.jar
`

```scala
LM-SJC-11001988:ScalaSbt mayangupta$ $SPARK_HOME/bin/spark-submit \
>   --class "com.scala.example.ExampleHello" \
>   --master local[4] \
>   target/scala-2.11/scalasbt_2.11-1.1.jar
2018-10-27 17:04:39 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
Hello Scala
2018-10-27 17:04:39 INFO  ShutdownHookManager:54 - Shutdown hook called
2018-10-27 17:04:39 INFO  ShutdownHookManager:54 - Deleting directory /private/var/folders/q2/b5s7h1y90kg5cjkdm8xrnnkr394zc2/T/spark-25d59fe4-a7f7-41e0-b094-257559872184
```

## Author
Mayank Gupta
