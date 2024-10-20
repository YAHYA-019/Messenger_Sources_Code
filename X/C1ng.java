package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ng, reason: invalid class name */
/* loaded from: 1ng.class */
public final class C1ng implements C1nh {
    @Override // X.C1nh
    public void BsN(String str, byte[] bArr) {
        0fH.A0j("MqttXplatAnalytics", "Report bytes read");
        C0Ai.A03.A00(true);
        0BN.A02.A00(bArr.length, false);
    }

    @Override // X.C1nh
    public void C7n(Integer num) {
        String str;
        11T.A0F(num, 0);
        switch (num.intValue()) {
            case 0:
                str = "START_SERVICE";
                break;
            case 1:
                str = "CONNECTION_LOST";
                break;
            case 2:
                str = AnonymousClass000.A00(73);
                break;
            case 3:
                str = "FORCE_KICK";
                break;
            case 4:
                str = "EXIT_DOZE_MODE";
                break;
            default:
                str = "CONFIG_CHANGED";
                break;
        }
        0fH.A0j("MqttXplatAnalytics", 0Pz.A0W("Report mqtt connecting ", str));
        C04O A00 = C04N.A00();
        List list = A00.A01;
        synchronized (list) {
            A00.A00 = false;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((04P) it.next()).C7r(str);
            }
        }
    }

    @Override // X.C1nh
    public void C7o(String str) {
        0fH.A0j("MqttXplatAnalytics", 0Pz.A0W("Report mqtt disconnected ", str));
        C04O A00 = C04N.A00();
        List<04P> list = A00.A01;
        synchronized (list) {
            for (04P r0 : list) {
                if (A00.A00) {
                    r0.C7t(str);
                } else {
                    r0.C7q("unknown");
                }
            }
            A00.A00 = false;
        }
    }
}
