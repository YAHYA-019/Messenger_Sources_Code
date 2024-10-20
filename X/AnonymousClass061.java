package X;

import android.content.Context;
import android.os.BatteryManager;

/* renamed from: X.061, reason: invalid class name */
/* loaded from: 061.class */
public final class AnonymousClass061 implements 0gG {
    public Context A00;

    public static BatteryManager A00(Context context) {
        return (BatteryManager) context.getSystemService("batterymanager");
    }

    public static void A01(BatteryManager batteryManager, C0qh c0qh) {
        C0qh.A01(C0g6.A1N, c0qh, batteryManager.getIntProperty(4));
        C0qh.A01(C0g6.A1O, c0qh, batteryManager.getIntProperty(1));
        C0qh.A01(C0g6.A1P, c0qh, batteryManager.getIntProperty(3));
        C0qh.A01(C0g6.A1Q, c0qh, batteryManager.getIntProperty(2));
        c0qh.A04(C0g6.A1R, Long.valueOf(batteryManager.getLongProperty(5)));
    }

    public static void A02(BatteryManager batteryManager, C0qh c0qh) {
        C0qh.A01(C0g6.A1S, c0qh, batteryManager.getIntProperty(6));
    }

    public Integer Ayh() {
        return 0S2.A13;
    }

    public /* synthetic */ boolean BN1(Integer num) {
        return false;
    }

    public void CXo(C0qh c0qh, C0gq c0gq) {
        BatteryManager A00 = A00(this.A00);
        if (A00 != null) {
            A01(A00, c0qh);
            A02(A00, c0qh);
        }
    }
}
