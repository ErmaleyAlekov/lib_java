JFLAGS = -g
JC = javac
S = ./libft/
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java
CLASSES = $Sft.java $Stest.java

all: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) $S*.class
	$(RM) $s*.class

