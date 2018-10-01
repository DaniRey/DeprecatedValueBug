trait B {
  @deprecated(
    """
      |b
      |"""".stripMargin, "DepecatedValueBug")
  val b: String = "b"
}
