package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2dk, reason: invalid class name */
/* loaded from: 2dk.class */
public final class C2dk {
    public C2df A00;
    public final Context A01;
    public final List A02;
    public final 1I7 A03;

    public C2dk() {
        Context A00 = FbInjector.A00();
        this.A01 = A00;
        this.A03 = (1I7) 1Hv.A02(A00, 65728);
        this.A02 = new ArrayList(1);
        this.A00 = new C2df((C2dg) C1Y6.A00(A00, "com_facebook_messaging_sms_plugins_interfaces_statechecker_SmsStateCheckerInterfaceSpec", "All", new Object[0]));
    }
}
