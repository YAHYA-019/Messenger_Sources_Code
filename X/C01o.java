package X;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.01o, reason: invalid class name */
/* loaded from: 01o.class */
public abstract class C01o extends C01p {
    public IntentFilter A00;
    public Collection A01;
    public final 0QO A02;

    public C01o(C02l c02l, C02l c02l2, C02l c02l3) {
        0QO r0 = new 0QO(3);
        this.A02 = r0;
        r0.put("android.net.wifi.supplicant.CONNECTION_CHANGE", c02l);
        r0.put("android.net.wifi.STATE_CHANGE", c02l2);
        r0.put("android.net.conn.CONNECTIVITY_CHANGE", c02l3);
    }

    public C01o(C02l c02l, C02l c02l2, C02l c02l3, C02l c02l4, C02l c02l5) {
        0QO r0 = new 0QO(5);
        this.A02 = r0;
        r0.put("com.facebook.instantexperiences.payment.ACTION_SHIPPING_ADDRESS_UPDATED", c02l);
        r0.put("com.facebook.instantexperiences.payment.ACTION_SHIPPING_OPTION_UPDATED", c02l2);
        r0.put("com.facebook.instantexperiences.payment.ACTION_CHARGE_REQUEST", c02l3);
        r0.put("intent_messenger_checkout_canceled", c02l4);
        r0.put("intent_messenger_checkout_ended", c02l5);
    }

    public C01o(C02l c02l, C02l c02l2, C02l c02l3, C02l c02l4, String str, String str2, String str3, String str4) {
        0QO r0 = new 0QO(4);
        this.A02 = r0;
        C01p.A00(str);
        r0.put(str, c02l);
        C01p.A00(str2);
        r0.put(str2, c02l2);
        C01p.A00(str3);
        r0.put(str3, c02l3);
        C01p.A00(str4);
        r0.put(str4, c02l4);
    }

    public C01o(C02l c02l, C02l c02l2, String str, String str2) {
        0QO r0 = new 0QO(2);
        this.A02 = r0;
        C01p.A00(c02l);
        r0.put(str, c02l);
        C01p.A00(c02l2);
        r0.put(str2, c02l2);
    }

    public C01o(C02l c02l, String str) {
        0QO r0 = new 0QO(1);
        this.A02 = r0;
        C01p.A00(str);
        C01p.A00(c02l);
        r0.put(str, c02l);
    }

    public C01o(Iterator it) {
        C01p.A00(it);
        this.A02 = new 0QO(0);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.A02.put(entry.getKey(), entry.getValue()) != null) {
                throw AnonymousClass001.A0L(0Pz.A0j("action ", AnonymousClass001.A0j(entry), " found more than once in action map"));
            }
        }
        if (this.A02.isEmpty()) {
            throw AnonymousClass001.A0L("Must include an entry for at least one action");
        }
    }

    @Override // X.C01p
    public final C02l A03(Context context, String str) {
        C02l c02l;
        synchronized (this) {
            c02l = (C02l) this.A02.get(str);
        }
        return c02l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r0.contains(r302) == false) goto L11;
     */
    @Override // X.C01p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A08(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            java.util.Collection r0 = r0.A01     // Catch: java.lang.Throwable -> L24
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r303
            r1 = r302
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L24
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L1f
        L1a:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L1f:
            r0 = r301
            monitor-exit(r0)
            r0 = r305
            return r0
        L24:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01o.A08(java.lang.String):boolean");
    }
}
