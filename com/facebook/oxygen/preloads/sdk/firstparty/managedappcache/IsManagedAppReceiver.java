package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.0FI;
import X.C3o5;
import X.DKB;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: IsManagedAppReceiver.class */
public class IsManagedAppReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(-149583057);
        if (intent == null) {
            i = 2081470689;
        } else {
            String action = intent.getAction();
            if (action.equals(DKB.A00(345))) {
                Log.d("IsManagedAppReceiver", "onReceive");
                C3o5.A0D(context, IsManagedAppCacheJobService.class).setAction(action);
                ((JobScheduler) context.getApplicationContext().getSystemService("jobscheduler")).enqueue(new JobInfo.Builder(1517668458, new ComponentName(context, (Class<?>) IsManagedAppCacheJobService.class)).setOverrideDeadline(0L).build(), new JobWorkItem(intent));
                i = -1954695994;
            } else {
                i = -877942130;
            }
        }
        0FI.A0D(i, A01, intent);
    }
}
