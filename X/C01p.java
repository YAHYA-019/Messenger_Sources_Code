package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.01p, reason: invalid class name */
/* loaded from: 01p.class */
public abstract class C01p extends BroadcastReceiver implements C01q {
    public C08b A00;
    public C02m A01 = C02m.A00;
    public String A02;

    public static void A00(Object obj) {
        if (obj == null) {
            throw AnonymousClass001.A0Q("Object is null!");
        }
    }

    public abstract C02l A03(Context context, String str);

    public Object A04(C02l c02l) {
        return c02l;
    }

    public String A05() {
        return "SecureBroadcastReceiver";
    }

    public void A06(Context context, String str) {
        String A05 = A05();
        android.util.Log.e(A05, 0Pz.A0v("Rejected the intent for the receiver because it was not registered: ", str, ":", A05));
    }

    public boolean A07(Context context, Intent intent) {
        C08b c08b = this.A00;
        boolean z = true;
        if (c08b != null && c08b.A0D(this, context, intent, null) == null) {
            z = false;
        }
        return z;
    }

    public abstract boolean A08(String str);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        boolean A00;
        int A01 = 0FI.A01(-1544703797);
        String str = this.A02;
        if (str == null) {
            str = 0Pz.A0j(context.getPackageName(), "/", getClass().getName());
            this.A02 = str;
        }
        A00(str);
        String action = intent.getAction();
        if (action == null) {
            android.util.Log.e(A05(), "action is null for SecureBroadcastReceiver");
            i = -1553093352;
        } else {
            C02l A03 = A03(context, action);
            if (A03 != null) {
                if (C09h.A03().A04(context, intent, A04(A03))) {
                    synchronized (this) {
                        A00 = this.A01.A00(context, intent, null, this);
                    }
                    if (A00 && A07(context, intent)) {
                        C09m.A00.A00(intent, str, null, "allow");
                        A03.CFb(context, intent, this);
                    } else {
                        C09m.A00.A00(intent, str, null, "deny");
                        i = 1800194351;
                    }
                } else {
                    C09m.A00.A00(intent, str, null, "deny");
                    i = -975594931;
                }
            } else if (!A08(action)) {
                C09m.A00.A00(intent, str, null, "deny");
                A06(context, action);
            }
            i = -1140512073;
        }
        0FI.A0D(i, A01, intent);
    }
}
