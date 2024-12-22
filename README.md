# jfrf-fcc-spring-boot-3
FCC Spring Boot 3 Tutorial - from Dan Vega

- Java 17


### Setup on Windows 11

- Install git from web
- Install last version of OpenJDK

```Powershell
# Download zip from https://jdk.java.net/23/

cd .\Downloads\
unzip .\openjdk-23.0.1_windows-x64_bin.zip
Get-FileHash -Path .\openjdk-23.0.1_windows-x64_bin.zip -Algorithm SHA256

#   Algorithm       Hash                                                                   Path
#   ---------       ----                                                                   ----
#   SHA256          AEF21AC9784CD3CDEDAE1126FBA91C496633E47BD251F8550FA8E2FC79288732       ...

mv .\openjdk-23.0.1_windows-x64_bin.zip C:\wspace\
cd C:\wspace\
Expand-Archive -Path .\openjdk-23.0.1_windows-x64_bin.zip -DestinationPath .
```

- Set JAVA_HOME (System) to C:\wspace\jdk-23.0.1
- Modify PATH (System) add %JAVA_HOME%\bin
- Move to firt entry in PATH






