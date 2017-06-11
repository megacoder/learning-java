JAVA	=${JAVA_HOME}/bin/java
JAVAC	=${JAVA_HOME}/bin/javac

all:	HelloJava

clean:
	${RM} *.class

distclean clobber: clean
	${RM} HelloJava

HelloJava: HelloJava.java
	${JAVAC} $<
