@echo off
set workspace=E:\Users\carlos\workspace\bei.chu.ecp1.miw.upm.es
set PATH=%PATH%E:\Program Files\apache-maven-3.3.3\bin;E:\Program Files\Java\jdk1.8.0_60\bin
set JAVA_HOME=E:\Program Files\Java\jdk1.8.0_60
set M2_HOME=E:\Program Files\apache-maven-3.3.3
::Realiza un clean y test en el perfil develop y un package en el perfil preproduction
echo ----------------------------------------
echo %workspace%
::Me cambio a mi directorio
E:
cd %workspace%
echo ============ mvn clean test (profile: develop) =======================================================
echo .
call mvn -ff clean test
echo ----------------------------------------
echo ============ mvn -Dmaven.test.skip=true package -Denvironment.type=preproduction =======================================================
call mvn -Dmaven.test.skip=true package -Denviroment.type=preproduction
pause
exit