package X;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.LinkedHashSet;

/* renamed from: X.4Jd, reason: invalid class name */
/* loaded from: 4Jd.class */
public abstract class C4Jd {
    public Object A00;
    public final Context A01;
    public final Object A02;
    public final LinkedHashSet A03;
    public final C4Ii A04;

    public C4Jd(Context context, C4Ii c4Ii) {
        this.A04 = c4Ii;
        Context applicationContext = context.getApplicationContext();
        11T.A0A(applicationContext);
        this.A01 = applicationContext;
        this.A02 = new Object();
        this.A03 = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012d, code lost:
    
        if (r0 <= 0.15f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017f, code lost:
    
        if (r0 != 5) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A00() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Jd.A00():java.lang.Object");
    }

    public void A01() {
        if (!(this instanceof C4Jf)) {
            C4Jc c4Jc = (C4Jc) this;
            4IS.A00().A02(C4Sc.A00, 0Pz.A0W(c4Jc.getClass().getSimpleName(), ": registering receiver"));
            c4Jc.A01.registerReceiver(c4Jc.A00, c4Jc.A04());
            return;
        }
        C4Jf c4Jf = (C4Jf) this;
        try {
            4IS.A00().A02(C4Ug.A00, "Registering network callback");
            ConnectivityManager connectivityManager = c4Jf.A00;
            C4Jg c4Jg = c4Jf.A01;
            11T.A0H(connectivityManager, c4Jg);
            connectivityManager.registerDefaultNetworkCallback(c4Jg);
        } catch (IllegalArgumentException | SecurityException e) {
            4IS.A00();
            android.util.Log.e(C4Ug.A00, "Received exception while registering network callback", e);
        }
    }

    public void A02() {
        if (!(this instanceof C4Jf)) {
            C4Jc c4Jc = (C4Jc) this;
            4IS.A00().A02(C4Sc.A00, 0Pz.A0W(c4Jc.getClass().getSimpleName(), ": unregistering receiver"));
            c4Jc.A01.unregisterReceiver(c4Jc.A00);
            return;
        }
        C4Jf c4Jf = (C4Jf) this;
        try {
            4IS.A00().A02(C4Ug.A00, "Unregistering network callback");
            ConnectivityManager connectivityManager = c4Jf.A00;
            C4Jg c4Jg = c4Jf.A01;
            11T.A0H(connectivityManager, c4Jg);
            connectivityManager.unregisterNetworkCallback(c4Jg);
        } catch (IllegalArgumentException | SecurityException e) {
            4IS.A00();
            android.util.Log.e(C4Ug.A00, "Received exception while unregistering network callback", e);
        }
    }

    public final void A03(Object obj) {
        synchronized (this.A02) {
            Object obj2 = this.A00;
            if (obj2 == null || !obj2.equals(obj)) {
                this.A00 = obj;
                ((C4Ih) this.A04).A02.execute(new AEK(this, 0QD.A0V(this.A03)));
            }
        }
    }
}
