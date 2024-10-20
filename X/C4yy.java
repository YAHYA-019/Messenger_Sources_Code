package X;

import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* renamed from: X.4yy, reason: invalid class name */
/* loaded from: 4yy.class */
public final class C4yy {
    public static final C4yy A06 = new C4yy();
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;

    public C4yy() {
        this.A03 = HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT;
        this.A01 = 655360;
        this.A00 = 30.0f;
        this.A02 = 10;
        this.A04 = -1;
        this.A05 = false;
    }

    public C4yy(float f, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = i;
        this.A01 = i2;
        this.A00 = f;
        this.A02 = i3;
        this.A04 = i4;
        this.A05 = z;
    }
}
