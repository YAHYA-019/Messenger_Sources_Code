package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.video.common.playerorigin.PlayerOrigin;

/* renamed from: X.8ih, reason: invalid class name */
/* loaded from: 8ih.class */
public final class C8ih extends 2Kb {
    public final ThreadKey A00;
    public final 6TN A01;
    public final PlayerOrigin A02;
    public final GRD A03;
    public final 6TI A04;
    public final 6U2 A05;
    public final C6ce A06;
    public final GRX A07;

    public C8ih(ThreadKey threadKey, 6TN r303, PlayerOrigin playerOrigin, GRD grd, 6TI r306, 6U2 r307, C6ce c6ce, GRX grx) {
        this.A03 = grd;
        this.A02 = playerOrigin;
        this.A01 = r303;
        this.A04 = r306;
        this.A05 = r307;
        this.A07 = grx;
        this.A06 = c6ce;
        this.A00 = threadKey;
    }

    public C2lt A0s(2lX r302) {
        11T.A0F(r302, 0);
        return new C2lt(null, new A2e(this.A04), 7zQ.A0r(r302, 7zQ.A0s(A2U.A00, false), AVD.A01(this, 41)));
    }
}
