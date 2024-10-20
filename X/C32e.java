package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.32e, reason: invalid class name */
/* loaded from: 32e.class */
public final class C32e extends BroadcastReceiver {
    public 31I A00;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        NetworkInfo activeNetworkInfo;
        int A01 = 0FI.A01(-98332995);
        31I r0 = this.A00;
        if (r0 == null) {
            i = -767938924;
        } else {
            C1bL c1bL = r0.A00.A02;
            C1bL.A01(c1bL);
            ConnectivityManager connectivityManager = (ConnectivityManager) c1bL.A00.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                i = -446118876;
            } else {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    android.util.Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                FirebaseInstanceId.A04(this.A00, 0L);
                C1bL c1bL2 = this.A00.A00.A02;
                C1bL.A01(c1bL2);
                c1bL2.A00.unregisterReceiver(this);
                this.A00 = null;
                i = -400368065;
            }
        }
        0FI.A0D(i, A01, intent);
    }
}
