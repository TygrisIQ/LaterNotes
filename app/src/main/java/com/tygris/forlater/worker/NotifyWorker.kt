package com.tygris.forlater.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class NotifyWorker(context: Context, params: WorkerParameters): Worker(context,params) {

    override fun doWork(): Result {
        TODO("Not yet implemented")
    }


}