package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: G9r.class */
public final class G9r extends C00q implements C00m {
    public static final G9r A00 = new G9r();

    public G9r() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        String A04 = ((1Oe) 1Bi.A03(16617)).A04(C1fe.A08);
        if (A04 == null) {
            A04 = ConstantsKt.CAMERA_ID_FRONT;
        }
        return A04;
    }
}
