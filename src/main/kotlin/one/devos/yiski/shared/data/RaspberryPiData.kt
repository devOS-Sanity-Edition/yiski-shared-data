package one.devos.yiski.shared.data

import kotlinx.serialization.Serializable

@Serializable
data class RaspberryPiData(
    val raspberryPiSOC: RaspberryPiSOC,
    val raspberryPiModel: RaspberryPiModel,
    val raspberryPiBootloaderRevision: RaspberryPiBootloaderRevision,
    val raspberryPiBootloaderDate: RaspberryPiBootloaderDate
) {
    @Serializable
    data class RaspberryPiSOC(
        val hex: Int,
        val socModel: String
    )

    @Serializable
    data class RaspberryPiModel(
        val piModel: String
    )

    @Serializable
    data class RaspberryPiBootloaderRevision(
        val piRevision: String
    )

    @Serializable
    data class RaspberryPiBootloaderDate(
        val piBootloaderDate: String
    )
}