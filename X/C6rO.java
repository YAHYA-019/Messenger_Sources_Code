package X;

import com.facebook.messaging.msys.thread.componentcreator.threadview.initparams.ThreadViewDisableProfileImgParamsMetadata;

/* renamed from: X.6rO, reason: invalid class name */
/* loaded from: 6rO.class */
public final class C6rO extends 6rM {
    public final 1Br A00;
    public final C01i A01;
    public final C01i A02;
    public final C01i A03;
    public final boolean A04;

    public C6rO(6vO r302, C6rN c6rN, 6tF r304, C6qv c6qv, 6O9 r306, boolean z) {
        super(r302, c6rN, r304, c6qv, r306);
        boolean z2;
        1Br A00 = 1Bq.A00(66409);
        this.A00 = A00;
        1qI r0 = (1qI) A00.A00.get();
        C6qv c6qv2 = ((6rM) this).A0T;
        if (r0.A0T(String.valueOf(c6qv2.BF7().A0s()))) {
            z2 = true;
        } else {
            ThreadViewDisableProfileImgParamsMetadata threadViewDisableProfileImgParamsMetadata = (ThreadViewDisableProfileImgParamsMetadata) c6qv2.BF6().A00(ThreadViewDisableProfileImgParamsMetadata.A01);
            z2 = threadViewDisableProfileImgParamsMetadata != null ? threadViewDisableProfileImgParamsMetadata.A00 : false;
        }
        this.A04 = z2;
        C03i c03i = C03i.A03;
        this.A01 = C01g.A00(c03i, new 83E(0, this, c6rN, z));
        this.A02 = C01g.A00(c03i, new 83A(r304, this, 16));
        this.A03 = C01g.A00(c03i, C7x5.A00);
    }
}
