package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* loaded from: Cwo.class */
public final class Cwo implements AnonymousClass553 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Cwo(Bgo bgo, String str, int i) {
        this.A00 = i;
        this.A01 = bgo;
        this.A02 = str;
    }

    @Override // X.AnonymousClass553
    public void onClick(View view) {
        IRF irf;
        ImmutableList A0e;
        Integer num;
        int i = this.A00;
        Bgo bgo = (Bgo) this.A01;
        if (i != 0) {
            if (bgo != null) {
                String str = this.A02;
                11T.A0F(str, 0);
                B7k b7k = bgo.A00.A01;
                if (b7k != null) {
                    1BY r0 = b7k.A00.A00;
                    irf = (IRF) 1Lm.A07(AbK.A0D(r0), r0, 99979);
                    A0e = 7zN.A0e(str);
                    num = 0S2.A00;
                    irf.A0n(num, "join_requests_drawer", A0e);
                    return;
                }
                AbF.A1H();
                throw 0Q8.createAndThrow();
            }
            return;
        }
        if (bgo != null) {
            String str2 = this.A02;
            11T.A0F(str2, 0);
            AyI ayI = bgo.A00;
            FbUserSession A01 = 1Fw.A01(ayI.getContext());
            B7k b7k2 = ayI.A01;
            if (b7k2 != null) {
                11T.A0F(A01, 0);
                irf = (IRF) 4YU.A0o(A01, b7k2.A00, 99979);
                A0e = 7zN.A0e(str2);
                num = 0S2.A01;
                irf.A0n(num, "join_requests_drawer", A0e);
                return;
            }
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
    }
}
