package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.BitSet;

/* renamed from: X.92d, reason: invalid class name */
/* loaded from: 92d.class */
public final class C92d extends 6cZ {
    public static final MigColorScheme A00 = LightColorScheme.A00();

    public 1LI A04(1Iw r302, 6TN r303, PlayerOrigin playerOrigin, GRD grd, 6UR r306, 6TI r307, 6U2 r308, C6ce c6ce, GRX grx) {
        11T.A0F(r302, 0);
        7zT.A1U(r307, r308, grx);
        11T.A0F(playerOrigin, 7);
        QC7 qc7 = new QC7(r302, new QL0());
        MigColorScheme migColorScheme = A00;
        1LI r0 = qc7.A01;
        ((QL0) r0).A00 = migColorScheme;
        BitSet bitSet = qc7.A02;
        bitSet.set(0);
        ((QL0) r0).A01 = playerOrigin;
        bitSet.set(1);
        ((QL0) r0).A02 = r308;
        bitSet.set(2);
        ((QL0) r0).A04 = r307.A03();
        bitSet.set(3);
        ((QL0) r0).A03 = grx;
        bitSet.set(4);
        C1rs.A04(bitSet, qc7.A03);
        qc7.A0J();
        return r0;
    }

    public Integer AWj() {
        return 0S2.A0u;
    }

    public String AuU() {
        return "CoWatchVideoPreviewDescriptor";
    }

    public boolean BUW(6TN r302, PlayerOrigin playerOrigin, GRD grd, 6TI r305) {
        return true;
    }
}
