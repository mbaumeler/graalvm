javac *.java
jar cfe runnable.jar Main *.class
/home/matthias/Development/vt/quarkus/tools/graalvm-ce-19.2.1/bin/native-image -jar runnable.jar --no-fallback -H:ReflectionConfigurationFiles=config.json executable
