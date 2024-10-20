package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.ArrayList;

/* renamed from: X.Glc, reason: case insensitive filesystem */
/* loaded from: Glc.class */
public final class C2690Glc extends C1rj {
    public static final PlayerOrigin A06 = new PlayerOrigin(6TL.A16, "inbox_ads");
    public IPf A00;
    public Evu A01;
    public MigColorScheme A02;
    public 6TI A03;
    public boolean A04;
    public boolean A05;

    public C2690Glc() {
        super("InboxAdsGrootVideoPlayerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, null, Boolean.valueOf(this.A04), this.A03, this.A01, Boolean.valueOf(this.A05), this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A02;
        6TI r0 = this.A03;
        IPf iPf = this.A00;
        boolean z = this.A04;
        Object A02 = 1Hv.A02(r302.A0D, 67322);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1H(migColorScheme.Awo());
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(A02);
        H0v h0v = new H0v();
        synchronized (iPf) {
            iPf.A05 = h0v;
        }
        6TN r02 = 6TN.A0F;
        GR6 A00 = GR5.A00(r302);
        A00.A2Z(A06);
        A00.A01.A0J = A0s;
        A00.A2a(h0v);
        A00.A2Y(r02);
        A00.A2c(z);
        A00.A2b(r0);
        A00.A1u(1LI.A0C(r302, C2690Glc.class, "InboxAdsGrootVideoPlayerComponent", new Object[]{C5ba.A0R}, 474447108));
        A00.A2X((float) r0.A00);
        A012.A2d(A00);
        A012.A0R();
        A01.A2d(A012);
        A01.A0R();
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 474447108) {
            return null;
        }
        1Is r0 = r302.A00.A01;
        Object obj2 = r302.A03[0];
        float f = ((2lD) obj).A00;
        C2690Glc c2690Glc = (C2690Glc) r0;
        IPf iPf = c2690Glc.A00;
        boolean z = c2690Glc.A05;
        Evu evu = c2690Glc.A01;
        synchronized (iPf) {
            double d = f;
            iPf.A00 = d;
            if (d > 50.0d) {
                iPf.A01(C52j.A09);
            } else {
                iPf.A00(C52j.A09);
            }
        }
        if (f < 100.0f || evu == null) {
            return null;
        }
        if (!z) {
            evu.A00(obj2.toString());
        }
        evu.A01(obj2.toString());
        return null;
    }
}
