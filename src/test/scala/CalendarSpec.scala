import org.scalatest._
import flatspec._
import matchers._

class CalendarSpec extends AnyFlatSpec with should.Matchers {

  val calendar = new Calendar

  val firstMeeting = Meeting("lunch", Time(12, 0), Time(13, 0))

  it should "add meeting into calendar" in {
    calendar.addMeeting(firstMeeting)
  }
}