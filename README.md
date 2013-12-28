JSON serialization test
===

Participants:
* [Groovy](http://groovy.codehaus.org/) ([JsonOutput](http://groovy.codehaus.org/gapi/groovy/json/JsonOutput.html))
* [Jackson](http://wiki.fasterxml.com/JacksonRelease20)
* [Gson](https://code.google.com/p/google-gson/)
* GroovyJava (JsonOutput rewritten to Java)
* GroovyJavaWithoutRecursion (JsonOutput rewritten to Java without recursion)

Results
---

	Benchmark                                            Mode Thr     Count  Sec         Mean   Mean error    Units
	o.b.j.Test.complexTestGroovy                        thrpt   1        20    1      991.981       12.725    ops/s
	o.b.j.Test.complexTestGroovyJava                    thrpt   1        20    1     2549.993       28.527    ops/s
	o.b.j.Test.complexTestGroovyJavaWithoutRecursion    thrpt   1        20    1     2233.074       78.201    ops/s
	o.b.j.Test.complexTestGson                          thrpt   1        20    1     5099.543      104.108    ops/s
	o.b.j.Test.complexTestJackson                       thrpt   1        20    1    12168.617      298.710    ops/s
	o.b.j.Test.mediumTestGroovy                         thrpt   1        20    1    10786.671      256.090    ops/s
	o.b.j.Test.mediumTestGroovyJava                     thrpt   1        20    1    69296.676     1704.828    ops/s
	o.b.j.Test.mediumTestGroovyJavaWithoutRecursion     thrpt   1        20    1    50972.672      699.862    ops/s
	o.b.j.Test.mediumTestGson                           thrpt   1        20    1    95269.984     1426.431    ops/s
	o.b.j.Test.mediumTestJackson                        thrpt   1        20    1   165929.238     2106.969    ops/s
	o.b.j.Test.simpleTestGroovy                         thrpt   1        20    1    60917.283      728.287    ops/s
	o.b.j.Test.simpleTestGroovyJava                     thrpt   1        20    1    70273.187     1513.372    ops/s
	o.b.j.Test.simpleTestGroovyJavaWithoutRecursion     thrpt   1        20    1    51727.987     1066.752    ops/s
	o.b.j.Test.simpleTestGson                           thrpt   1        20    1   393817.200     4769.662    ops/s
	o.b.j.Test.simpleTestJackson                        thrpt   1        20    1   521774.452    16102.207    ops/s

Testing environment: Ubuntu 13.10 (64-Bit), Oracle Java HotSpot 64-bit 1.7.0_45

Build and Run
---

	gradle clean; gradle shadow; java -Xmx1024m -jar target/libs/microbenchmarks.jar ".*Test.*" -f 1
