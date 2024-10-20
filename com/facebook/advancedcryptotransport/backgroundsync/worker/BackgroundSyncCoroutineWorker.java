package com.facebook.advancedcryptotransport.backgroundsync.worker;

import X.1BL;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.RemoteCoroutineWorker;

/* loaded from: BackgroundSyncCoroutineWorker.class */
public final class BackgroundSyncCoroutineWorker extends RemoteCoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundSyncCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        1BL.A1F(context, workerParameters);
    }
}
