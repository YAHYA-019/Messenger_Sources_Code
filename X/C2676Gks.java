package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;

/* renamed from: X.Gks, reason: case insensitive filesystem */
/* loaded from: Gks.class */
public final class C2676Gks extends 1LH {
    public final PlayerOrigin A00;
    public final 6TI A01;
    public final 6TJ A02;
    public final boolean A03 = true;
    public final boolean A04;

    public C2676Gks(PlayerOrigin playerOrigin, 6TI r303, 6TJ r304, boolean z) {
        this.A01 = r303;
        this.A00 = playerOrigin;
        this.A04 = z;
        this.A02 = r304;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        H10 h10 = new H10(1);
        h10.A04(C52j.A09, this.A04);
        ((GR2) h10).A07 = this.A03;
        GR6 A00 = GR5.A00(c2k5.A05);
        A00.A0z(1.0f);
        A00.A0j(0.0f);
        A00.A0l(1.0f);
        A00.A2a(h10);
        A00.A2Z(this.A00);
        GR5 gr5 = A00.A01;
        gr5.A0N = true;
        gr5.A0S = true;
        gr5.A0R = true;
        A00.A2Y(6TN.A0I);
        A00.A2X(1.0f);
        6TI r0 = this.A01;
        A00.A2b(r0);
        gr5.A01 = r0.A03.A09;
        gr5.A0G = this.A02;
        return A00.A2W();
    }
}
