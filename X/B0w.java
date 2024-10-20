package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.rtc.incall.impl.coplay.views.CoplayNonJoinerView;
import java.util.List;

/* loaded from: B0w.class */
public final class B0w extends C1rj {
    public static final CallerContext A09 = CallerContext.A0C("CoplayNonJoinerView", "CoplayNonJoinerView");
    public FbUserSession A00;
    public 2JX A01;
    public C1706Aqc A02;
    public ELM A03;
    public E1r A04;
    public CoplayNonJoinerView A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    public B0w() {
        super("CoplayNonJoinerViewLayout");
    }

    public static final void A00(FbUserSession fbUserSession, 1Iw r302, CNQ cnq, FFo fFo, C1706Aqc c1706Aqc, CNU cnu, E1r e1r) {
        2JX A0u;
        2JX A1a;
        if (c1706Aqc == null || (A0u = c1706Aqc.A0u()) == null || (A1a = A0u.A1a()) == null || !A1a.getBooleanValue(1103879431) || !FFo.A00(fFo).AZk(36313905541553358L)) {
            e1r.A0d();
        } else {
            ((ExP) 1Hv.A02(7zL.A0A(r302), 68373)).A0A = new J9s(e1r, 21);
            CLZ.A01(BOh.A0J, fbUserSession, r302, cnq, c1706Aqc, cnu);
        }
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, this.A00, this.A01, this.A06, this.A05, this.A04, Boolean.valueOf(this.A07), Boolean.valueOf(this.A08)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x06e7, code lost:
    
        if (r318 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01b2, code lost:
    
        if (r318 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0783  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 2329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0w.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        C6J A03;
        BOh bOh;
        switch (r302.A01) {
            case -1204045344:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                FbUserSession fbUserSession = ((B0w) r02).A00;
                11T.A0H(r03, fbUserSession);
                A03 = ((CNQ) 7zQ.A12(r03, 85227)).A03(fbUserSession);
                A03.A01 = BOX.A0B;
                bOh = BOh.A0F;
                A03.A00 = bOh;
                A03.A00();
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -566368371:
                1Iv r04 = r302.A00;
                1Is r05 = r04.A01;
                1Iw r06 = r04.A00;
                FbUserSession fbUserSession2 = ((B0w) r05).A00;
                11T.A0H(r06, fbUserSession2);
                A03 = ((CNQ) 7zQ.A12(r06, 85227)).A03(fbUserSession2);
                A03.A01 = BOX.A0B;
                bOh = BOh.A0A;
                A03.A00 = bOh;
                A03.A00();
                return null;
            case 936280750:
                1Iv r07 = r302.A00;
                1Is r08 = r07.A01;
                1Iw r09 = r07.A00;
                FbUserSession fbUserSession3 = ((B0w) r08).A00;
                11T.A0H(r09, fbUserSession3);
                A03 = ((CNQ) 7zQ.A12(r09, 85227)).A03(fbUserSession3);
                A03.A01 = BOX.A0B;
                A03.A00();
                return null;
            case 974949319:
                1Iv r010 = r302.A00;
                1Is r011 = r010.A01;
                1Iw r012 = r010.A00;
                Object[] objArr = r302.A03;
                C1706Aqc c1706Aqc = (C1706Aqc) objArr[0];
                CNU cnu = (CNU) objArr[1];
                FFo fFo = (FFo) objArr[2];
                B0w b0w = (B0w) r011;
                E1r e1r = b0w.A04;
                boolean z = b0w.A08;
                boolean z2 = b0w.A07;
                boolean A1W = 1BL.A1W(r012, e1r);
                1BL.A1G(cnu, fFo);
                Context context = r012.A0D;
                CNQ cnq = (CNQ) 7zN.A0k(context, 85227);
                FbUserSession A01 = 1Fw.A01(context);
                if (z2) {
                    if (r012.A02 != null) {
                        r012.A0G(7zS.A0N(Boolean.valueOf(A1W)), 7zK.A00(451));
                    }
                } else if (z) {
                    9CB.A00(context, new BFi(A01, r012, cnq, fFo, c1706Aqc, cnu, e1r), 0S2.A0C);
                } else {
                    A00(A01, r012, cnq, fFo, c1706Aqc, cnu, e1r);
                }
                A03 = cnq.A02(BOk.A01, A01);
                A03.A01 = BOX.A0B;
                bOh = BOh.A0J;
                A03.A00 = bOh;
                A03.A00();
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((B1W) r303).A00 = false;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
