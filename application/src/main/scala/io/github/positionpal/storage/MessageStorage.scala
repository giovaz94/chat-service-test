package io.github.positionpal.storage

import scala.concurrent.Future

import io.github.positionpal.client.ClientID
import io.github.positionpal.message.ChatMessageADT.Message

trait MessageStorage:

  /** Retrieve the last n messages that where persisted inside a Group
    * @param groupID identifier of the group
    * @param n number of messages that should be retrieved
    * @return a [[Future]] with a [[Seq]] of the last n messages of the group
    */
  def getLastMessages(groupID: String)(n: Int): Future[Seq[Message[ClientID, String]]]
