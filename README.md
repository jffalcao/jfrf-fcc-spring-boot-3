# jfrf-fcc-spring-boot-3
FCC Spring Boot 3 Tutorial - from Dan Vega

### Tools
- Java 17
- Spring Framework: https://spring.io/
- httpie on Powershell


### Tutorial Refrences
- Youtube FCC-Spring-Boot-3: https://youtu.be/31KTdfRH6nY?si=gZ_Iv_NcKuuwrml0
    -  (0:19:25) Module 2: Create your project
- Github: https://github.com/danvega/fcc-spring-boot-3
- Spring Academy: https://spring.academy/
- VS Code: https://code.visualstudio.com/docs/java/java-spring-boot




### Setup on Windows 11

- Install git from web
- Install last version of OpenJDK
- Clone personal project

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

```Powershell
# test Git
git --version

# test java
java --version

# clone project
git clone https://github.com/jffalcao/jfrf-fcc-spring-boot-3.git

```

- Install httpie
```Powershell
# Prerequisite Python
pip install httpie
```

### Uselful commands
```Powershell
# List java processes 
jps

# kill process general taskkill /PID <PID> /F
# Example Kill process # 9124
taskkill /PID 9124 /F
```







