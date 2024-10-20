package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.Arrays;

/* renamed from: X.Gl3, reason: case insensitive filesystem */
/* loaded from: Gl3.class */
public final class C2685Gl3 extends C1rj {
    public PlayerOrigin A00;
    public 6UF A01;
    public 6TI A02;

    public C2685Gl3() {
        super("MontageViewerGrootComponent");
    }

    public final Object[] A0k() {
        return new Object[]{null, this.A00, this.A01, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        PlayerOrigin playerOrigin = this.A00;
        6UF r0 = this.A01;
        6TI r02 = this.A02;
        Object A03 = 1Hv.A03(r302.A0D, IhY.class, (Class) null);
        GR6 A00 = GR5.A00(r302);
        A00.A2a(new GR2());
        A00.A2Z(playerOrigin);
        A00.A2c(false);
        GR5 gr5 = A00.A01;
        gr5.A0N = true;
        gr5.A0D = r0;
        gr5.A0H = null;
        gr5.A0J = Arrays.asList((6cX) A03);
        A00.A2Y(6TN.A09);
        A00.A2b(r02);
        A00.A2X((float) r02.A00);
        return A00.A2W();
    }
}
