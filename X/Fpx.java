package X;

import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;
import java.lang.ref.WeakReference;

/* loaded from: Fpx.class */
public final class Fpx implements GJd {
    public final /* synthetic */ FI3 A00;

    public Fpx(FI3 fi3) {
        this.A00 = fi3;
    }

    @Override // X.GJd
    public void ANg() {
        WeakReference weakReference = this.A00.A0D;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        boolean A0E = DKF.A0g(weakReference).A0E();
        QuicksilverWebviewService A0g = DKF.A0g(weakReference);
        if (A0E) {
            if (A0g.A08 == null || !((FFo) A0g.A18.get()).A0D) {
                return;
            }
            A0g.A08.dismiss();
            A0g.A08 = null;
            return;
        }
        C00i c00i = A0g.A0H;
        if (c00i != null && c00i.get() != null) {
            ((FHy) A0g.A0H.get()).A02 = null;
        }
        F9N f9n = A0g.A0f;
        if (f9n != null) {
            f9n.A01();
        }
        EzV ezV = A0g.A0a;
        if (ezV != null) {
            ezV.A00();
        }
        C00i c00i2 = A0g.A1C;
        FI3.A02("Exception when trying to close overlay dialog activity", DKF.A0f(c00i2).A08);
        FI3.A02("Exception when trying to close overlay dialog activity", DKF.A0f(c00i2).A06);
        DKF.A0f(c00i2).A09();
    }

    @Override // X.GJd
    public void BrV(ENe eNe, String str, String str2) {
        WeakReference weakReference = this.A00.A0D;
        if (weakReference == null || weakReference.get() == null || DKF.A0g(weakReference).A0E()) {
            return;
        }
        QuicksilverWebviewService A0g = DKF.A0g(weakReference);
        ((FHy) A0g.A0H.get()).A04(1BL.A0F());
        DKG.A0q(A0g).A0A(eNe);
        A0g.A0Y.A06(str2);
    }

    @Override // X.GJd
    public void C0A(String str, String str2, String str3) {
        FI3 fi3 = this.A00;
        FI3.A03(fi3.A06);
        WeakReference weakReference = fi3.A0D;
        if (weakReference == null || weakReference.get() == null || DKF.A0g(weakReference).A0E()) {
            return;
        }
        DKF.A0g(weakReference).A0D(str, str2, str3);
    }
}
