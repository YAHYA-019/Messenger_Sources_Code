package X;

import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* loaded from: Id9.class */
public final class Id9 implements JG4 {
    public final int A00;
    public final Object A01;

    public Id9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JG4
    public void CAR(int i, int i2, int i3, int i4, boolean z) {
        switch (this.A00) {
            case 0:
                ((C2423Gck) this.A01).A00 = i4 + i3;
                return;
            case 1:
                C2426Gcn c2426Gcn = (C2426Gcn) this.A01;
                c2426Gcn.A03 = i;
                c2426Gcn.A01 = i2;
                c2426Gcn.A02 = i3;
                c2426Gcn.A00 = ((((i4 + 45) + HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH) / 90) % 4) * 90;
                return;
            case 2:
                Gti gti = (Gti) this.A01;
                gti.A03 = i;
                gti.A01 = i2;
                gti.A02 = i3;
                gti.A00 = i4;
                return;
            default:
                Gtn gtn = (Gtn) this.A01;
                gtn.A03 = i;
                gtn.A01 = i2;
                gtn.A02 = i4;
                return;
        }
    }
}
