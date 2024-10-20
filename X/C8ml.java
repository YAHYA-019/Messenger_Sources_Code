package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8ml, reason: invalid class name */
/* loaded from: 8ml.class */
public final class C8ml extends C1rj {
    public static final ImmutableList A09 = ImmutableList.of();
    public 9Z4 A00;
    public 9Z5 A01;
    public 9SK A02;
    public C2p1 A03;
    public MigColorScheme A04;
    public C2fr A05;
    public ImmutableList A06;
    public boolean A07;
    public boolean A08;

    public C8ml() {
        super("M4ThreadContextBanner");
        this.A06 = A09;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A06, Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), this.A01, this.A02, this.A00, this.A05, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cp c2cp;
        C2p1 c2p1 = this.A03;
        C2fr c2fr = this.A05;
        MigColorScheme migColorScheme = this.A04;
        boolean z = this.A08;
        ImmutableList immutableList = this.A06;
        9Z4 r0 = this.A00;
        boolean z2 = this.A07;
        C1u2 A0I = 4YV.A0I();
        boolean A0B = 1JF.A0B(c2p1.toString());
        int A00 = (A0B ? 2RH.A05 : 2RH.A06).A00();
        2cM A0i = 7zM.A0i(r302);
        C1ro c1ro = C1ro.CENTER;
        A0i.A2g(c1ro);
        if (A0B) {
            7zO.A1F(A0i, 2RH.A03);
        }
        A0i.A12(A00);
        2RH r02 = 2RH.A06;
        7zO.A1K(A0i, r02);
        boolean A1T = AnonymousClass001.A1T(r0);
        C2pz A002 = C2px.A00(r302);
        A002.A2X(C2q0.A00);
        A002.A2Z(c2fr);
        A002.A2Y(migColorScheme);
        Drawable drawable = null;
        7zN.A1D(A002, r302, C8ml.class, "M4ThreadContextBanner", -1115756780);
        A002.A2N(A1T);
        Resources A0E = 4YU.A0E(r302);
        int i = 2131958845;
        if (c2fr.Azi() > 1) {
            i = 2131958846;
        }
        A002.A2S(A0E.getString(i));
        A002.A0F("android.widget.ImageView");
        A0i.A2e(A002.A2W());
        if (!A0B) {
            if (z) {
                C2cq A0u = 7zM.A0u(A0I.A08(C1u3.A0j, -16089857), r302, 0);
                4YU.A1N(A0u, 2RH.A07);
                A0u.A0l(20.0f);
                A0u.A0z(20.0f);
                c2cp = A0u.A2W();
            } else {
                c2cp = null;
            }
            if (z2) {
                drawable = A0I.A08(C1u3.A3M, migColorScheme.AUz());
            }
            C1rq A01 = C1rg.A01(r302, null, 0);
            A01.A2h(c1ro);
            4YU.A1N(A01, 2RH.A04);
            7zO.A1K(A01, r02);
            2zX r03 = new 2zX(r302, new C2p9());
            r03.A2Y(c2p1);
            r03.A2Z(2KE.A07);
            r03.A2X(migColorScheme.B4i());
            C2p9 c2p9 = r03.A01;
            c2p9.A00 = 3;
            c2p9.A03 = 2KG.A01;
            7zO.A1J(r03, 2RH.A05);
            c2p9.A02 = drawable;
            A01.A2f(r03.A2W());
            A01.A2f(c2cp);
            7zN.A1D(A01, r302, C8ml.class, "M4ThreadContextBanner", -89929996);
            A01.A1q(1LI.A09(r302, C8ml.class, "M4ThreadContextBanner", 1612457944));
            A01.A2M(true);
            7zL.A1I(A0i, A01);
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                A0i.A2e((1LI) it.next());
            }
        }
        return A0i.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1115756780:
                1Is r0 = r302.A00.A01;
                View view = ((3xC) obj).A00;
                9Z4 r02 = ((C8ml) r0).A00;
                if (r02 == null) {
                    return null;
                }
                r02.A00(view);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -89929996:
                1Is r03 = r302.A00.A01;
                View view2 = ((3xC) obj).A00;
                9Z5 r04 = ((C8ml) r03).A01;
                if (r04 == null) {
                    return null;
                }
                r04.A00(view2);
                return null;
            case 1612457944:
                1Is r05 = r302.A00.A01;
                View view3 = ((C03173xD) obj).A00;
                9SK r06 = ((C8ml) r05).A02;
                boolean z = false;
                if (r06 != null) {
                    11T.A0F(view3, 0);
                    FbUserSession fbUserSession = r06.A02;
                    Context context = r06.A00;
                    06Z r07 = r06.A01;
                    ThreadKey threadKey = r06.A03;
                    C6hc.A00(C2sa.A00, (C6hc) 1Bu.A06(context, 65862), threadKey).A01(new Cjn(context, view3, r07, fbUserSession, fbUserSession, threadKey, 1));
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return null;
        }
    }
}
