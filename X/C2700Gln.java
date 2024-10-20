package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.video.common.playerorigin.PlayerOrigin;

/* renamed from: X.Gln, reason: case insensitive filesystem */
/* loaded from: Gln.class */
public final class C2700Gln extends C1rj {
    public static final 6TM A0A = 6TM.A05;
    public FbUserSession A00;
    public H9X A01;
    public MigColorScheme A02;
    public 6TM A03;
    public 6TN A04;
    public PlayerOrigin A05;
    public GRD A06;
    public 6TI A07;
    public 6U2 A08;
    public C6ce A09;

    public C2700Gln() {
        super("CowatchAdPlayerComponent");
        this.A03 = A0A;
    }

    public static void A00(1UG r301, Hdt hdt, String str, String str2) {
        r301.A7R("action", str);
        0DA r0 = new 0DA();
        r0.A07("client_token", "");
        r0.A06("position", Long.valueOf(-1));
        r301.A7T(r0, "ad");
        r301.A7R("media_id", str2);
        r301.A7R("local_call_id", ((I5Y) hdt.A00.get()).A04());
        r301.BZL();
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, null, this.A03, this.A02, this.A08, this.A00, this.A09, this.A05, this.A04, this.A07, this.A06};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00a4, code lost:
    
        if (r0 == null) goto L6;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2700Gln.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1C(1Iw r302) {
        C1en c1en;
        C2712Glz c2712Glz = (C2712Glz) 4YU.A0P(r302);
        6TN r0 = this.A04;
        GRS grs = c2712Glz.A02;
        GRD grd = c2712Glz.A04;
        1gM r02 = c2712Glz.A00;
        1Bn.A0A(115794);
        1Bn.A0A(115904);
        Hql A00 = HvP.A00();
        if (A00 != null) {
            6U2 A0o = grs.A0o();
            A0o.getClass();
            11T.A0F(grd, 1);
            A00.A06 = A0o;
            A00.A03 = grd;
            QUp qUp = A00.A02;
            if (qUp != null) {
                A0o.A06(qUp);
            }
            Hdt hdt = (Hdt) 1Br.A0B(A00.A0G);
            String str = A00.A09;
            1UG A08 = 1BK.A08(1BK.A07(hdt.A01), "ls_cowatch_ad");
            if (A08.isSampled()) {
                A00(A08, hdt, "ad_player_created", str);
            }
        }
        if (r0 != 6TN.A09 || (c1en = (C1en) AnonymousClass016.A00(r302.A0D, C1en.class)) == null) {
            return;
        }
        c1en.A5D(r02);
    }

    @Override // X.C1rj
    public void A1D(1Iw r302) {
        C1en c1en;
        C2712Glz c2712Glz = (C2712Glz) 4YU.A0P(r302);
        6TN r0 = this.A04;
        1gM r02 = c2712Glz.A00;
        1Bn.A0A(115794);
        1Bn.A0A(115904);
        Hql A00 = HvP.A00();
        if (A00 != null) {
            DKE.A0K(A00.A0F).removeCallbacks(A00.A0I);
            Hdt hdt = (Hdt) 1Br.A0B(A00.A0G);
            String str = A00.A09;
            1UG A08 = 1BK.A08(1BK.A07(hdt.A01), "ls_cowatch_ad");
            if (A08.isSampled()) {
                A00(A08, hdt, "ad_player_destroyed", str);
            }
        }
        if (r0 != 6TN.A09 || (c1en = (C1en) AnonymousClass016.A00(r302.A0D, C1en.class)) == null) {
            return;
        }
        c1en.Cdt(r02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Throwable, java.lang.Object, com.facebook.auth.usersession.FbUserSession] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1N(X.1Iw r302, X.2Yv r303) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2700Gln.A1N(X.1Iw, X.2Yv):void");
    }

    @Override // X.C1rj
    public boolean A1R() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
