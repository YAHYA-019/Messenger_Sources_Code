package X;

import java.io.File;

/* renamed from: X.3hv, reason: invalid class name */
/* loaded from: 3hv.class */
public final class C3hv implements Runnable {
    public static final String __redex_internal_original_name = "BackgroundUploadServiceImpl$3";
    public final /* synthetic */ C0lt A00;
    public final /* synthetic */ 1R1 A01;
    public final /* synthetic */ File A02;

    public C3hv(C0lt c0lt, 1R1 r303, File file) {
        this.A01 = r303;
        this.A00 = c0lt;
        this.A02 = file;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.CT0(this.A02);
    }
}
