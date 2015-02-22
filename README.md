mvn dependency:tree -Dverbose
mvn package
mvn exec:java -Dexec.mainClass="org.zeta.experiments.select.Main" -q

https://code.google.com/p/sbvj/
Papers:
* https://www.cs.cmu.edu/~dga/papers/zhou-sea2013.pdf
* http://vigna.di.unimi.it/ftp/papers/Broadword.pdf
