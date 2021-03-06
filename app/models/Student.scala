package models

import play.api.db.slick.Config.driver.simple._

case class PersonalDataS(id: Option[Int],
                     ismi: String,
                     familiyasi: String,
                     otasining_ismi: String,
                     tugulgan_sana: String,
                     guruhi: String,
                     elektron_pochtasi: String,
                     tel: String)
class PersonalDataTableS(tag: Tag) extends Table[PersonalDataS](tag, "Students") {

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def ismi = column[String]("ismi", O.Default(""))

  def familiyasi = column[String]("familiyasi", O.Default(""))

  def otasining_ismi = column[String]("otasining_ismi", O.Default(""))

  def tugulgan_sana = column[String]("tugulgan_sana", O.Default(""))

  def guruhi = column[String]("guruhi", O.Default(""))

  def elektron_pochtasi = column[String]("email", O.Default(""))

  def tel = column[String]("tel", O.Default(""))

  def * = (id.?, ismi, familiyasi , otasining_ismi,tugulgan_sana,guruhi, elektron_pochtasi, tel) <>(PersonalDataS.tupled,PersonalDataS.unapply _)

}

