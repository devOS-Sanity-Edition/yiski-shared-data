package one.devos.yiski.shared.data

import kotlinx.serialization.Serializable

@Serializable
data class HardwareData(
    val cpuInfo: CPUData,
    val memoryInfo: MemoryData,
    val storageInfo: StorageData,
    val gpuInfo: GPUData
) {
    @Serializable
    data class CPUData(
        val cpuName: String,
        val cpuFrequency: String,
        val cpuUsed: Int,
    )

    @Serializable
    data class MemoryData(
        val memoryTotal: Int,
        val memoryUsed: Int
    )

    @Serializable
    data class StorageData(
        val storageMountPoint: String,
        val storageTotal: Int,
        val storageUsed: Int,
        val storageFSType: String
    )

    @Serializable
    data class GPUData(
        val gpuName: String,
        val gpuVRAMTotal: Int,
        val gpuVRAMUsed: Int,
    )
}