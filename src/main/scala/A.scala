trait A {
  @deprecated(
    """
      |a
    """.stripMargin, "DepecatedValueBug")
  val a: String = "a"
}