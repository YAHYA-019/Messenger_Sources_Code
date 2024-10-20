package androidx.work.impl.diagnostics;

import X.0FI;
import X.4IS;
import X.4IU;
import X.JRa;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;

/* loaded from: DiagnosticsReceiver.class */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String A00 = 4IS.A01("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(-568300422);
        if (intent == null) {
            i = 1846912412;
        } else {
            4IS A002 = 4IS.A00();
            String str = A00;
            A002.A02(str, "Requesting diagnostics");
            try {
                4IU.A00(context).A02(Collections.singletonList(new JRa(DiagnosticsWorker.class).A00()));
            } catch (IllegalStateException e) {
                4IS.A00();
                Log.e(str, "WorkManager is not initialized", e);
            }
            i = 1341755024;
        }
        0FI.A0D(i, A01, intent);
    }
}
