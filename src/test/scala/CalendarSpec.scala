import org.scalatest._
import flatspec._
import matchers._

class CalendarSpec extends AnyFlatSpec with should.Matchers {

  val calendar = new Calendar

  val firstMeeting = Meeting("lunch", Time(12, 0), Time(13, 0))
  val secondMeetings = Meeting("sprint-review", Time(10, 0), Time(12, 0))

  val meetings = calendar.meetings += firstMeeting += secondMeetings

  it should "add meeting into calendar" in {
    calendar.addMeeting(firstMeeting)
  }

  it should "remove meeting from calendar" in {
    calendar.removeMeeting(firstMeeting)
  }

  it should "print number of meetings in calendar" in {
    meetings.size shouldBe 2
  }
}