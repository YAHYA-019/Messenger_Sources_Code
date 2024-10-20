package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3dz, reason: invalid class name */
/* loaded from: 3dz.class */
public final class C3dz implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public C3dz(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj;
        this.A04 = str;
        this.A05 = z;
        this.A02 = obj3;
    }

    public void onFailure(Throwable th) {
        if (this.A00 != 0) {
            ((2BV) this.A01).A07((1QE) this.A03, (45G) this.A02, this.A04, th, this.A05);
            return;
        }
        3NK r0 = (3NK) this.A01;
        String str = this.A04;
        boolean z = this.A05;
        45G r02 = (45G) this.A02;
        C00i c00i = r0.A02;
        ((2BV) c00i.get()).A07(1QE.A01, r02, str, th, z);
        ((2BV) c00i.get()).A07(1QE.A02, r02, str, th, z);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 == 0) {
            C3Q2 c3q2 = (C3Q2) obj;
            3NK r0 = (3NK) this.A01;
            FbUserSession fbUserSession = (FbUserSession) this.A03;
            String str = this.A04;
            boolean z = this.A05;
            45G r02 = (45G) this.A02;
            C00i c00i = r0.A02;
            ((2BV) c00i.get()).A04(fbUserSession, c3q2.A00, 1QE.A01, r02, str, z);
            ((2BV) c00i.get()).A04(fbUserSession, c3q2.A01, 1QE.A02, r02, str, z);
        }
    }
}
