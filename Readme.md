**Inherits conflicting members bug, caused by @deprecated and .stripMargin**

Running it:compile will cause

sbt:DeprecatedValueBug> it:compile
[info] Updating ...
[info] Done updating.
[info] Compiling 2 Scala sources to ....\DeprecatedValueBug\target\scala-2.10\classes ...
[info] Done compiling.
[info] Compiling 1 Scala source to ....\DeprecatedValueBug\target\scala-2.10\it-classes ...
[error] .....\DeprecatedValueBug\src\it\scala\Use.scala:1:7: class Use inherits conflicting members:
[error]   value x in trait A of type String  and
[error]   value x in trait B of type String
[error] (Note: this can be resolved by declaring an override in class Use.)
[error] class Use extends A with B {
[error]       ^
[error] one error found
[error] (IntegrationTest / compileIncremental) Compilation failed
[error] Total time: 1 s, completed 01.10.2018 23:11:52
