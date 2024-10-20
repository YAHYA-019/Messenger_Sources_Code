package X;

import android.graphics.drawable.Drawable;
import com.facebook.video.common.playerorigin.PlayerOrigin;

/* renamed from: X.8la, reason: invalid class name */
/* loaded from: 8la.class */
public final class C8la extends C1rj {
    public PlayerOrigin A00;
    public 6U2 A01;
    public GRX A02;
    public String A03;

    public C8la() {
        super("VideoMutePluginComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, this.A03, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z = 4YU.A0P(r302).A00;
        String A0C = r302.A0C();
        9aZ r0 = new 9aZ(A0C);
        Drawable A0E = 7zL.A0E(r302, r0, A0C, 0);
        if (A0E == null) {
            float f = 0.0f / 0.0f;
            A0E = ((C1uu) 1Bi.A03(66388)).A01(2132345186, -1);
            r302.A0I(r0, A0E, A0C, 0);
        }
        String A0C2 = r302.A0C();
        9aY r02 = new 9aY(A0C2);
        Drawable A0E2 = 7zL.A0E(r302, r02, A0C2, 1);
        if (A0E2 == null) {
            float f2 = 0.0f / 0.0f;
            A0E2 = ((C1uu) 1Bi.A03(66388)).A01(2132345192, -1);
            r302.A0I(r02, A0E2, A0C2, 1);
        }
        if (A0E == null || A0E2 == null) {
            return null;
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0K();
        7zO.A1D(A01);
        7zN.A1D(A01, r302, C8la.class, "VideoMutePluginComponent", -2146468131);
        A01.A0l(44.0f);
        A01.A0z(44.0f);
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A1I(2132411607);
        A00.A0L();
        if (z) {
            A0E = A0E2;
        }
        A00.A2a(A0E);
        A00.A0l(24.0f);
        A00.A0z(24.0f);
        A00.A1D(4.0f);
        A00.A1J(2131967914);
        7zN.A1B(A01, A00);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -2146468131) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        C8la c8la = (C8la) r02;
        6U2 r04 = c8la.A01;
        GRX grx = c8la.A02;
        String str = c8la.A03;
        PlayerOrigin playerOrigin = c8la.A00;
        7zT.A1S(r03, r04, grx);
        11T.A0F(playerOrigin, 4);
        boolean z = !grx.A0A(playerOrigin, str);
        r04.A06(new 6U6(C52j.A2Z, z));
        if (r03.A02 == null) {
            return null;
        }
        r03.A0G(7zS.A0N(Boolean.valueOf(z)), "updateState:VideoMutePluginComponent.updateInternalMuteState");
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        GRX grx = this.A02;
        String str = this.A03;
        PlayerOrigin playerOrigin = this.A00;
        1BK.A1K(grx, 2, playerOrigin);
        ((8pH) r303).A00 = grx.A0A(playerOrigin, str);
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
