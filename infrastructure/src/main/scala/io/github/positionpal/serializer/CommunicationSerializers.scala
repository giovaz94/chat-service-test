package io.github.positionpal.serializer

import io.bullet.borer.Codec
import io.bullet.borer.derivation.ArrayBasedCodecs.{deriveAllCodecs, deriveCodec}
import io.github.positionpal.borer.ModelCodecs
import io.github.positionpal.client.ClientCommunications.{CommunicationProtocol, CommunicationType}

trait CommunicationSerializers extends ModelCodecs:
  given communicationTypeCodec: Codec[CommunicationType] = deriveCodec[CommunicationType]
  given communicationProtocolCodec: Codec[CommunicationProtocol] = deriveAllCodecs[CommunicationProtocol]

object CommunicationSerializersImporter extends CommunicationSerializers
