package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.EnumSet;

/* renamed from: X.48z, reason: invalid class name */
/* loaded from: 48z.class */
public final class C48z {
    public final Context A00;
    public final FbUserSession A01;
    public final C00i A02;
    public final 2TR A03;
    public final C48w A04;

    public C48z(Context context, FbUserSession fbUserSession) {
        int A01;
        2TP r306;
        C48w c48w = (C48w) 1Bi.A03(32921);
        this.A04 = c48w;
        1BQ r0 = new 1BQ(66655);
        this.A02 = r0;
        this.A00 = context;
        this.A01 = fbUserSession;
        1Bi.A03(17024);
        if (((1fF) r0.get()).A06()) {
            1fF r02 = (1fF) r0.get();
            if (1fF.A01(r02, 1fF.A00(r02).AZk(36324204869733886L))) {
                A01 = c48w.A01();
                r306 = 2TP.A04;
                2TQ r03 = new 2TQ(EnumSet.of(r306), A01);
                2TR r04 = (2TR) 1Bn.A0A(17025);
                r04.A03 = r03;
                this.A03 = r04;
            }
        }
        if (((1fF) r0.get()).A06()) {
            1fF.A00((1fF) r0.get()).AZk(36324204869668349L);
        }
        A01 = c48w.A01();
        r306 = 2TP.A0E;
        2TQ r032 = new 2TQ(EnumSet.of(r306), A01);
        2TR r042 = (2TR) 1Bn.A0A(17025);
        r042.A03 = r032;
        this.A03 = r042;
    }
}
