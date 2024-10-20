package X;

import android.view.GestureDetector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.video.common.playerorigin.PlayerOrigin;

/* renamed from: X.8c2, reason: invalid class name */
/* loaded from: 8c2.class */
public final class C8c2 extends 1LH {
    public final GestureDetector A00;
    public final ThreadKey A01;
    public final PlayerOrigin A02;
    public final 6UF A03;
    public final 6TI A04;
    public final boolean A05;

    public C8c2(GestureDetector gestureDetector, ThreadKey threadKey, PlayerOrigin playerOrigin, 6UF r305, 6TI r306, boolean z) {
        11T.A0F(playerOrigin, 3);
        this.A01 = threadKey;
        this.A05 = z;
        this.A02 = playerOrigin;
        this.A04 = r306;
        this.A00 = gestureDetector;
        this.A03 = r305;
    }

    public 1LI A0s(C2k5 c2k5) {
        1Iw A0X = 7zL.A0X(c2k5);
        GR6 A00 = GR5.A00(A0X);
        A00.A2a(92Q.A01);
        A00.A2Z(this.A02);
        A00.A2c(false);
        GR5 gr5 = A00.A01;
        gr5.A0N = true;
        gr5.A0S = true;
        gr5.A0J = 11T.A03(new A3h(7zL.A0A(A0X), this.A01, this.A05));
        A00.A2Y(6TN.A09);
        6TI r0 = this.A04;
        A00.A2b(r0);
        gr5.A0D = this.A03;
        A00.A2X((float) r0.A00);
        A00.A1s(7zO.A0U(AVD.A01(this, 40)));
        return A00.A2W();
    }
}
