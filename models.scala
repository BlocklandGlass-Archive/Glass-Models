package blocklandglass.models

import nina._
import nina.impl.play.mysql._

object User extends Table("users") with PrimaryKey[Long] {
	val blid = col[Long]("blid")
	val password = col[String]("password")

	val pk = blid
}

object WrapperAccountMapping extends Table("wrappers") with PrimaryKey[Long] {
	val id = col[Long]("id")
	val pubkey = col[String]("pubkey")
	val blid = col[Long]("blid")

	val pk = id
}