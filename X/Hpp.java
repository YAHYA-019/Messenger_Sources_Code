package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.List;

/* loaded from: Hpp.class */
public final class Hpp {
    public JIb A00;
    public String A01;
    public Context A02;
    public 1BY A03;
    public final C00i A04 = 7zN.A0D(619);
    public final C00i A05;

    public Hpp(Context context, 1BO r303) {
        this.A03 = 7zL.A0Q(r303);
        this.A05 = 7zL.A0R(context, 620);
        this.A02 = context;
    }

    public void A00(String str, List list) {
        this.A01 = str;
        if (list == null || list.isEmpty()) {
            return;
        }
        C1F6 A0P = AbF.A0P(this.A05);
        Ini A01 = Ini.A01(this, 27);
        String str2 = this.A01;
        Context A012 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            C1602Amj c1602Amj = new C1602Amj(A0P, A01, str2);
            1Bn.A0K();
            FbInjector.A04(A012);
            c1602Amj.A01(new List[]{list});
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A012);
            throw th;
        }
    }
}
