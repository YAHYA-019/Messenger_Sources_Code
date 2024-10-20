package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* renamed from: X.49x, reason: invalid class name */
/* loaded from: 49x.class */
public final class C49x {
    public final Context A00;
    public final String A01;

    public C49x(Context context, String str) {
        this.A00 = context.getApplicationContext();
        this.A01 = str;
    }

    public void A00(07S r302) {
        07S.A00(r302, this.A01, "tier");
        07S.A00(r302, Double.valueOf(C1j0.A00(System.currentTimeMillis())), "sent_time");
        Context context = this.A00;
        String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            networkOperatorName = "n/a";
        }
        07S.A00(r302, networkOperatorName, "carrier");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        07S.A00(r302, activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : "none", "conn");
    }
}
