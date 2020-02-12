#!/bin/bash

mkdir -p target
javac -d target src/*.java
jar cfe target/runnable.jar HelloWorld -C target .
$GRAALVM_HOME/bin/native-image -jar target/runnable.jar target/executable

