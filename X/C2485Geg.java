package X;

import android.location.Location;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Geg, reason: case insensitive filesystem */
/* loaded from: Geg.class */
public final class C2485Geg extends 1RM {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C2485Geg(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        if (this.A00 == 0) {
            ((C6hy) ((F5o) this.A01).A02.get()).A00(this.A03, this.A02, true);
            return;
        }
        L5D l5d = (L5D) obj;
        IPo iPo = (IPo) this.A01;
        String str = this.A03;
        String str2 = this.A02;
        CallerContext callerContext = IPo.A06;
        5iG A0h = DKF.A0h(iPo.A02);
        Qnw qnw = Qnw.A02;
        A0h.A04(new C3273Joe(iPo, l5d, str, 1), iPo.A03.ARy(new Location(l5d.A00), null, str, null, str2), qnw);
    }

    public void A03(Throwable th) {
        if (this.A00 != 0) {
            IPo iPo = (IPo) this.A01;
            CallerContext callerContext = IPo.A06;
            Hlz hlz = iPo.A01;
            if (hlz != null) {
                hlz.A00(this.A03);
            }
        }
    }
}
