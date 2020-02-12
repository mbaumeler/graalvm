#!/bin/bash
set -e

mkdir -p target
javac -d target src/*.java
jar cfe target/runnable.jar Main -C src countries.txt -C target .
$GRAALVM_HOME/bin/native-image --initialize-at-build-time -jar target/runnable.jar --no-fallback target/executable 
