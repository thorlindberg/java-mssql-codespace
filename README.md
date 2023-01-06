# Java Mssql Codespace
### File structure
```
.
├── .devcontainer
│   ├── Dockerfile
│   ├── devcontainer.json
│   ├── docker-compose.yml
│   └── mssql
│       ├── installSQLtools.sh
│       └── postCreateCommand.sh
├── README.md
├── infrastructure
│   └── createAzureSQLServer.sh
└── sample
    ├── com
    │   └── thorlindberg
    │       └── sample
    │           └── nbactions.xml
    ├── pom.xml
    ├── src
    │   └── main
    │       └── java
    │           └── com
    │               └── thorlindberg
    │                   └── sample
    │                       └── Main.java
    └── target
        ├── classes
        │   └── com
        │       └── thorlindberg
        │           └── sample
        │               └── Main.class
        ├── maven-archiver
        │   └── pom.properties
        ├── maven-status
        │   └── maven-compiler-plugin
        │       └── compile
        │           └── default-compile
        │               ├── createdFiles.lst
        │               └── inputFiles.lst
        └── sample-1.0-SNAPSHOT.jar

23 directories, 15 files
```
