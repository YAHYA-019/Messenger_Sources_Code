package X;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

/* loaded from: J52.class */
public final class J52 implements Callable {
    public final int A00;
    public final int A01;
    public final Hk3 A02;
    public final ByteArrayOutputStream A03;

    public J52(Hk3 hk3, ByteArrayOutputStream byteArrayOutputStream, int i, int i2) {
        this.A02 = hk3;
        this.A03 = byteArrayOutputStream;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        Hk3 hk3 = this.A02;
        ByteArrayOutputStream byteArrayOutputStream = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        String str = hk3.A08;
        if (str == null) {
            return I2n.A00(AnonymousClass001.A0L("transcodeImageV2: missing inputFilePath"));
        }
        return hk3.A04.A05(hk3.A05, byteArrayOutputStream, str, hk3.A09, i, i2);
    }
}
