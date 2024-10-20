package X;

import java.nio.ByteBuffer;

/* loaded from: Lpm.class */
public final class Lpm implements Runnable {
    public static final String __redex_internal_original_name = "IOLinkPipeline$send$1";
    public final /* synthetic */ LBM A00;
    public final /* synthetic */ ByteBuffer A01;
    public final /* synthetic */ ByteBuffer A02;

    public Lpm(LBM lbm, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.A00 = lbm;
        this.A01 = byteBuffer;
        this.A02 = byteBuffer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LBM lbm = this.A00;
        ByteBuffer byteBuffer = this.A01;
        LBM.A00(lbm, byteBuffer, false);
        ByteBuffer byteBuffer2 = this.A02;
        LBM.A00(lbm, byteBuffer2, !AnonymousClass001.A1P(lbm.A08.A02.get()));
        Rae rae = lbm.A07;
        rae.A02(byteBuffer);
        rae.A02(byteBuffer2);
    }
}
