import akka.actor.typed.ActorSystem

object App {
  def main(args: Array[String]): Unit = {
    println(msg)
    ActorSystem[Nothing](Supervisor(), "my-system")
  }

  def msg = "I was compiled by Scala 3. :)"
}
