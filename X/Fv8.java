package X;

import android.content.Context;
import androidx.lifecycle.LiveData;

/* loaded from: Fv8.class */
public final class Fv8 implements GIy {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public Fv8(Context context, GIy gIy, FEq fEq, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = context;
        this.A04 = str;
        this.A03 = fEq;
        if (i != 0) {
            this.A05 = str2;
            this.A02 = gIy;
        } else {
            this.A02 = gIy;
            this.A05 = str2;
        }
    }

    @Override // X.GIy
    public void CEX(Boolean bool, Integer num, Throwable th) {
        ((GIy) this.A02).CEX(bool, num, th);
    }

    @Override // X.GIy
    public void CEY(String str) {
        LiveData liveData;
        int i;
        if (this.A00 != 0) {
            String str2 = this.A04;
            FEq fEq = (FEq) this.A03;
            F8v f8v = C06014fk.A0B().A04;
            11T.A0A(f8v);
            liveData = f8v.A02(fEq, str2);
            i = 2;
        } else {
            F8v f8v2 = C06014fk.A0B().A04;
            11T.A0A(f8v2);
            String str3 = this.A04;
            FEq fEq2 = (FEq) this.A03;
            F4T f4t = f8v2.A02;
            FYl fYl = new FYl(f8v2, fEq2, str3, 3);
            F60 f60 = f8v2.A01;
            4YV.A1N(f4t, f60);
            11T.A0F(fEq2, 3);
            EHA eha = new EHA(fYl, f60, f4t, fEq2);
            FH8.A02(eha);
            liveData = ((FH8) eha).A03;
            F8v.A00(liveData, f60);
            i = 1;
        }
        FJC.A09(liveData, new FZ3(str, this, i));
    }
}
