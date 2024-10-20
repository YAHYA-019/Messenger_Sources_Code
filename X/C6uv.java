package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.fb.fragment.LoggingConfiguration;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6uv, reason: invalid class name */
/* loaded from: 6uv.class */
public final class C6uv implements C6uw {
    public ViewGroup A00;
    public LithoView A01;
    public boolean A02;
    public final FbUserSession A03;
    public final 1pK A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Iw A09;
    public final ThreadKey A0A;
    public final 5TY A0B;
    public final C6s4 A0C;
    public final C2on A0D;

    public C6uv(FbUserSession fbUserSession, 1pK r303, 1Iw r304, ThreadKey threadKey, 5TY r306, C6s4 c6s4, C2on c2on) {
        11T.A0F(r303, 3);
        this.A09 = r304;
        this.A0C = c6s4;
        this.A04 = r303;
        this.A0B = r306;
        this.A0D = c2on;
        this.A0A = threadKey;
        this.A03 = fbUserSession;
        this.A02 = true;
        this.A08 = 1Bq.A00(16385);
        this.A07 = 1Bu.A00(50177);
        this.A06 = 1Bu.A00(148170);
        this.A05 = 1Bu.A00(959);
    }

    @Override // X.C6uw
    public void A7s() {
        if (this.A02) {
            C00j.A05("ThreadViewBannerCreator.createView", 1154336867);
            try {
                C00i c00i = this.A07.A00;
                6tW r0 = (6tW) c00i.get();
                1pK r02 = this.A04;
                1Iw r03 = this.A09;
                r0.A03(r03.A0D, r02, r03, LoggingConfiguration.A00("ThreadViewBannerCreator").A00(), this.A0B);
                C00i c00i2 = this.A08.A00;
                if (((1CO) c00i2.get()).AZk(36325549194564418L) || ((1CO) c00i2.get()).AZk(36322319382037897L)) {
                    C00i c00i3 = this.A06.A00;
                    ((C7oo) c00i3.get()).A00 = true;
                    ((6tZ) ((6tW) c00i.get()).A00.get()).A07 = (C7oo) c00i3.get();
                }
                6tW r04 = (6tW) c00i.get();
                C2on c2on = this.A0D;
                C6s4 c6s4 = this.A0C;
                82O r05 = (82O) this.A05.A00.get();
                String A0u = this.A0A.A0u();
                FbUserSession fbUserSession = this.A03;
                Context A01 = FbInjector.A01();
                FbInjector.A04(r05.B92().Aqm());
                1Bn.A0M(r05);
                try {
                    11T.A0F(A0u, 1);
                    1Br A012 = 1Lm.A01(fbUserSession, 68746);
                    11T.A0B(Bundle.EMPTY);
                    this.A01 = r04.A00(new 7I7(c6s4, c2on, ((C5jm) A012.A00.get()).A00(A0u).A02));
                    C00j.A01(-1290486823);
                    ViewGroup viewGroup = this.A00;
                    if (viewGroup != null) {
                        viewGroup.addView(this.A01, 0);
                    }
                } finally {
                    1Bn.A0K();
                    FbInjector.A04(A01);
                }
            } catch (Throwable th) {
                C00j.A01(1956474019);
                throw th;
            }
        }
    }
}
