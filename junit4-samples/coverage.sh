#!/usr/bin/env

mvn cobertura:help
mvn clean cobertura:cobertura
mvn clean test jacoco:prepare-agent jacoco:report


# offline instrument
mvn clean test
mvn jacoco:restore-instrumented-classes
mvn jacoco:report
