package X;

import com.facebook.rsys.call.gen.CallModel;

/* loaded from: C34.class */
public final class C34 {
    public final 1Br A00;
    public final 1De A01;

    public C34(1De r302) {
        this.A01 = r302;
        this.A00 = 7zM.A0h(r302, 16428);
    }

    public final boolean A00() {
        CallModel A02 = GS1.A02(((2JN) 4YU.A0n(1Br.A03(this.A00), this.A01, 33088)).A01());
        if (A02 != null) {
            return A02.inviteRequestedVideo;
        }
        4zI.A03.A05("IncomingCallButtonsPresenter", "Null CallModel while incoming call buttons are visible", new Object[0]);
        return false;
    }
}
