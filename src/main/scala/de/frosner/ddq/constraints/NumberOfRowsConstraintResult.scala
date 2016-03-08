package de.frosner.ddq.constraints

case class NumberOfRowsConstraintResult(constraint: NumberOfRowsConstraint,
                                        actual: Long,
                                        status: ConstraintStatus) extends ConstraintResult[NumberOfRowsConstraint] {

  val message: String = {
    val expected = constraint.expected
    status match {
      case ConstraintSuccess => s"The number of rows satisfies $expected."
      case ConstraintFailure => s"The actual number of rows $actual does not satisfy $expected."
    }
  }

}