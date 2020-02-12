#!/bin/bash
set -e

mkdir -p target
javac -d target src/*.java
jar cfe target/runnable.jar Main -C target .
$GRAALVM_HOME/bin/native-image -jar target/runnable.jar --no-fallback -H:ReflectionConfigurationFiles=src/config.json target/executable
