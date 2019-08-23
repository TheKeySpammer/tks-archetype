# Maven Archetype for a quickstart project.

This archetype creates a project with <a href="https://junit.org/junit5/docs/current/user-guide/">Junit-Jupiter</a> testing engine. 
It packages project in jar with runtime dependencies and App.java as starting point.

## Installation

In root folder of the project run.
```mvn install```

If you don't have <a href="https://maven.apache.org/">Maven</a> installed follow <a href="https://maven.apache.org/install.html">this</a> guide to install.

## Usage

To create a new project: 
```mvn archetype:generate -DarchetypeGroupId=com.tks -DarchetypeArtifactId=tks-archetype -DgroupId=<your-group-id> -DartifactId=<your-artifact-id>```

