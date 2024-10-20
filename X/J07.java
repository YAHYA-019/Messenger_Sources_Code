package X;

import java.io.ByteArrayInputStream;

/* loaded from: J07.class */
public final class J07 implements Runnable {
    public static final String __redex_internal_original_name = "EncryptedMediaNetworkFetcher$performInMemoryDownloadValidation$1$onMediaDownloadValidation$2$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC06954if A01;
    public final /* synthetic */ byte[] A02;

    public J07(InterfaceC06954if interfaceC06954if, byte[] bArr, int i) {
        this.A02 = bArr;
        this.A01 = interfaceC06954if;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.CHK(new ByteArrayInputStream(this.A02), this.A00);
    }
}
