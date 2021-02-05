package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  Supporter.city //What does this print ? 
  //It print "Paris"
  Supporter.support //What does this print and why ? How to fix it ? 
  //It print "Ici c'est null !" because support was evaluated before city could be set with "Paris".
  //we could change val by def 
}
