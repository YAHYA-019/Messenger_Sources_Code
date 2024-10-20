package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.08m, reason: invalid class name */
/* loaded from: 08m.class */
public abstract class C08m extends BroadcastReceiver implements C01q {
    public C08b A00;

    public abstract Object A00(String str);

    public String A01(Context context) {
        return 0Pz.A0Y(context.getPackageName(), getClass().getName(), '/');
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C08b c08b;
        int A01 = 0FI.A01(-1791394330);
        String action = intent.getAction();
        boolean z = false;
        if (action != null) {
            if (C09h.A03().A04(context, intent, A00(action)) && (c08b = this.A00) != null && c08b.A0D(this, context, intent, null) != null) {
                z = true;
            }
        }
        C09n c09n = C09m.A00;
        String A012 = A01(context);
        if (z) {
            c09n.A00(intent, A012, null, "allow");
            0FI.A0D(1434617652, A01, intent);
        } else {
            c09n.A00(intent, A012, null, "deny");
            SecurityException securityException = new SecurityException("The received intent failed one or more security checks, so no further action is allowed.");
            0FI.A0D(2092530903, A01, intent);
            throw securityException;
        }
    }
}
