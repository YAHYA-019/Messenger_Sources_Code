package X;

import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.XplatServiceDelegate;

/* renamed from: X.3fm, reason: invalid class name */
/* loaded from: 3fm.class */
public final class C3fm implements Runnable {
    public static final String __redex_internal_original_name = "XplatServiceDelegate$notifyConfigChanged$1";
    public final /* synthetic */ XplatServiceDelegate A00;

    public C3fm(XplatServiceDelegate xplatServiceDelegate) {
        this.A00 = xplatServiceDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XplatServiceDelegate xplatServiceDelegate = this.A00;
        ConnectionConfig A0L = xplatServiceDelegate.A0L(false);
        C1li c1li = XplatServiceDelegate.A04;
        boolean A00 = 1nI.A00(A0L, c1li.A00);
        StringBuilder A0k = AnonymousClass001.A0k();
        if (A00) {
            A0k.append("Skipping config changed because new config ");
            A0k.append(A0L);
            A0k.append(" is same as old ");
            0fH.A0l("MqttXplatService", AnonymousClass001.A0a(c1li.A00, A0k));
            return;
        }
        A0k.append("Config changed to ");
        A0k.append(A0L);
        A0k.append(" from ");
        0fH.A0n("MqttXplatService", AnonymousClass001.A0a(c1li.A00, A0k));
        c1li.A00 = A0L;
        XplatServiceDelegate.A00(xplatServiceDelegate);
        XplatServiceDelegate.A01.A01(new C1lq(A0L, xplatServiceDelegate));
    }
}
