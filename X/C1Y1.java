package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.1Y1, reason: invalid class name */
/* loaded from: 1Y1.class */
public final class C1Y1 {
    public 1Y5 A00;
    public Integer A01;
    public final 1BP A03 = FbInjector.A00;
    public final C0et A02 = (C0et) 1Bi.A03(83604);

    public final Integer A00() {
        Integer num;
        synchronized (this) {
            Integer num2 = this.A01;
            if (num2 == null) {
                Context context = FbInjector.A03;
                11T.A0A(context);
                C0t9 A01 = 0Zi.A01(context);
                String str = this.A02 == C0et.A0C ? A01.A26 : A01.A25;
                C0t9.A00(str);
                try {
                    if (str.equals("MQTT_SUBSCRIPTION")) {
                        num2 = 0S2.A00;
                    } else if (str.equals("RS_MQTT")) {
                        num2 = 0S2.A01;
                    } else if (str.equals("RS_DGW")) {
                        num2 = 0S2.A0C;
                    } else {
                        if (!str.equals("MSYS")) {
                            throw new IllegalArgumentException(str);
                        }
                        num2 = 0S2.A0N;
                    }
                } catch (IllegalArgumentException e) {
                    0fH.A0s("PresenceTransportSelection", "Invalid value of presence transport from QE. Selecting MQTT_SUBSCRIPTION", e);
                    num2 = 0S2.A00;
                } catch (NullPointerException e2) {
                    0fH.A0s("PresenceTransportSelection", "Invalid value of presence transport from QE. Selecting MQTT_SUBSCRIPTION", e2);
                    num2 = 0S2.A00;
                }
                this.A01 = num2;
            }
            11T.A0D(num2);
            0fH.A0h(3H4.A00(num2), "PresenceTransportSelection", "Transport chosen for presence consumption is %s");
            num = this.A01;
        }
        return num;
    }
}
