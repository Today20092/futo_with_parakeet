package org.futo.voiceinput.parakeet

import android.content.Context

interface SpeechBackend {
    suspend fun load(context: Context)
    suspend fun transcribe(samples: FloatArray): String
    suspend fun close()
}
