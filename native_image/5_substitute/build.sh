#!/bin/bash
set -e
$GRAALVM_HOME/bin/javac -classpath .:$GRAALVM_HOME/jre/lib/svm/builder/svm.jar *.java 
jar cfe runnable.jar Main *.class
$GRAALVM_HOME/bin/native-image -jar runnable.jar --no-fallback executable 
