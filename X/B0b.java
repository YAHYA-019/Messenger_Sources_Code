package X;

import com.facebook.forker.Process;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* loaded from: B0b.class */
public final class B0b extends C1rj {
    public DFs A00;
    public MigColorScheme A01;
    public String A02;
    public String A03;
    public static final int A05 = 2KV.A07.textSizeSp;
    public static final int A04 = 2RH.A06.A00();
    public static final MigColorScheme A06 = LightColorScheme.A00();

    public B0b() {
        super("BroadcastFlowCaptionComposerComponent");
        this.A01 = A06;
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A02, 1BK.A0d(), this.A03};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        B1m b1m = (B1m) 4YU.A0P(r302);
        DFs dFs = this.A00;
        String str = this.A02;
        MigColorScheme migColorScheme = this.A01;
        String str2 = b1m.A01;
        int i = b1m.A00;
        DuQ A00 = Dzj.A00(r302, 0);
        A00.A1C(A04);
        A00.A01.A0V = str2;
        int B4i = migColorScheme.B4i();
        Dzj dzj = A00.A01;
        dzj.A0F = B4i;
        dzj.A08 = 16385;
        A00.A2W(A05);
        A00.A01.A06 = migColorScheme.B36();
        A00.A1H(0);
        Dzj dzj2 = A00.A01;
        dzj2.A0D = i;
        dzj2.A0W = 0S2.A0N;
        A00.A1l(dFs instanceof CtF ? 1LI.A09(r302, B0b.class, "BroadcastFlowCaptionComposerComponent", -1974694341) : null);
        A00.A01.A0P = 1LI.A04(r302, B0b.class, "BroadcastFlowCaptionComposerComponent");
        A00.A01.A0O = 1LI.A09(r302, B0b.class, "BroadcastFlowCaptionComposerComponent", 435584735);
        1BQ A02 = 1BQ.A02(66655);
        if (1fF.A00((1fF) A02.get()).AZk(36325222777704929L) && str != null && !str.isEmpty()) {
            A00.A01.A0T = str;
        }
        2cM A0f = AbH.A0f(r302, 0);
        A0f.A2d(A00);
        A0f.A1v(1LI.A05(r302, B0b.class, "BroadcastFlowCaptionComposerComponent"));
        if (1fF.A00((1fF) A02.get()).AZk(36325222777704929L)) {
            A0f.A0l(42.0f);
            AbF.A1R(A0f, 2RH.A05, C26z.BOTTOM);
            C26z c26z = C26z.START;
            2RH r0 = 2RH.A03;
            AbF.A1R(A0f, r0, c26z);
            AbF.A1R(A0f, r0, C26z.END);
        }
        return A0f.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        String str;
        switch (r302.A01) {
            case -1974694341:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                boolean z = ((C5r6) obj).A01;
                DJZ djz = ((B0b) r02).A00;
                CPV cpv = (CPV) 1Lo.A06(C54z.A00(r03), 84148);
                CNc cNc = djz.Ay1().A0G;
                if (!cNc.A0E || !z || (str = cNc.A08) == null) {
                    return null;
                }
                C5k c5k = new C5k();
                c5k.A00 = BOf.A04;
                c5k.A02 = BOd.A06;
                CNc.A00(c5k, cpv, cNc, str);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 378110312:
                1Iv r04 = r302.A00;
                1Is r05 = r04.A01;
                1Iw r06 = r04.A00;
                String str2 = ((C9Mz) obj).A01;
                DFs dFs = ((B0b) r05).A00;
                if (r06.A02 != null) {
                    4YV.A1F(r06, str2, Process.WAIT_RESULT_STOPPED);
                }
                dFs.BnA(str2);
                return null;
            case 435584735:
                1Iw r07 = r302.A00.A00;
                int i = ((7Se) obj).A01;
                if (r07.A02 == null) {
                    return null;
                }
                4YV.A1F(r07, Integer.valueOf(i), (-1) << (-1));
                return null;
            case 1803022739:
                7zP.A0e(((3QF) 1Hv.A02(r302.A00.A00.A0D, 84139)).A02).markerPoint(21430273, "caption_composer_rendered");
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1m b1m = (B1m) r303;
        String str = this.A03;
        Integer valueOf = Integer.valueOf(7zQ.A05(str));
        if (str != null) {
            b1m.A01 = str;
        }
        if (valueOf != null) {
            b1m.A00 = valueOf.intValue();
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
