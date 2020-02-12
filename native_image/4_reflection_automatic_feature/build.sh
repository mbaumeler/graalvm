#!/bin/bash
set -e

mkdir -p target
$GRAALVM_HOME/bin/javac -d target -classpath .:$GRAALVM_HOME/jre/lib/svm/builder/svm.jar src/*.java
jar cfe target/runnable.jar Main -C target .
$GRAALVM_HOME/bin/native-image -jar target/runnable.jar --no-fallback target/executable 
