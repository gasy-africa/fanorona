## sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).

### :x: Issues while migrating

#### :round_pushpin: Binary Literals

https://contributors.scala-lang.org/t/pre-sip-support-binary-integer-literals/3559/6

#### :round_pushpin: Continuations (i.e Coroutine)

https://stackoverflow.com/questions/715758/coroutine-vs-continuation-vs-generator

https://stackoverflow.com/questions/21880107/scala-switch-which-continue-matching-next-cases-after-successful-match

https://github.com/scala/scala-continuations/issues/37

https://www.researchgate.net/publication/23751565_Best_Play_in_Fanorona_Leads_to_Draw

