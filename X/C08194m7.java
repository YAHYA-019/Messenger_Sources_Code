package X;

import android.app.Activity;
import android.view.ViewTreeObserver;
import android.view.Window;

/* renamed from: X.4m7, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4m7.class */
public final class C08194m7 implements 1Xc {
    public final C00i A02 = new 1BQ(16385);
    public final C00i A01 = new 1BQ(16616);
    public final C4m8 A00 = new C4m8();

    public String BB2() {
        return "EnableAnrTimer";
    }

    public void init() {
        int i;
        Window window;
        int A03 = 0FI.A03(559931411);
        C00i c00i = this.A02;
        if (((2yD) c00i.get()).AZk(36314244840496933L)) {
            long Auy = 1BK.A0N(c00i).Auy(36595719817464587L);
            if (Auy > 1024) {
                Auy = 1024;
            }
            AnonymousClass001.A07().post(new Lpg(1BK.A0N(c00i).Auy(36595719817530124L), (int) Auy, 1BK.A0N(c00i).AZk(36314244840693542L)));
            if (1BK.A0N(c00i).AZk(36314244840890151L)) {
                Activity A08 = ((1Od) this.A01.get()).A08();
                if (A08 != null && (window = A08.getWindow()) != null) {
                    ViewTreeObserver viewTreeObserver = window.getDecorView().getViewTreeObserver();
                    C4m8 c4m8 = this.A00;
                    viewTreeObserver.removeOnPreDrawListener(c4m8);
                    viewTreeObserver.addOnPreDrawListener(c4m8);
                }
                AnonymousClass001.A07().post(new It1(this));
            }
            i = -1171003337;
        } else {
            i = -1427194588;
        }
        0FI.A09(i, A03);
    }
}
