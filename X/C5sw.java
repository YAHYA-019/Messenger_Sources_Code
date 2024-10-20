package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5sw, reason: invalid class name */
/* loaded from: 5sw.class */
public final class C5sw implements 5kK {
    public static final C5sw A00 = new Object();

    public /* bridge */ /* synthetic */ C5fq A4p(C5pu c5pu, 4lD r303, InterfaceC07894l7 interfaceC07894l7, Capabilities capabilities, C5to c5to, int i, int i2) {
        11T.A0F(r303, 0);
        C5w4 c5w4 = null;
        if (C5u4.A01(r303, i)) {
            String Ax2 = r303.Ax2(i);
            11T.A0A(Ax2);
            boolean z = false;
            11T.A0F("typing_indicator:", 1);
            if (Ax2.startsWith("typing_indicator:")) {
                c5w4 = new C5w4();
                if (((1qX) r303).mResultSet.getLong(i, 76) > System.currentTimeMillis()) {
                    z = true;
                }
                c5w4.A03 = z;
            }
        }
        return c5w4;
    }
}
