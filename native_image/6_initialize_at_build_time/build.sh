#!/bin/bash
set -e
javac *.java
jar cfe runnable.jar Main *.class countries.txt
$GRAALVM_HOME/bin/native-image --initialize-at-build-time -jar runnable.jar --no-fallback executable 
