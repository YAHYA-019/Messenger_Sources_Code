package X;

import java.io.File;

/* renamed from: X.0if, reason: invalid class name */
/* loaded from: 0if.class */
public final /* synthetic */ class C0if implements Runnable {
    public static final String __redex_internal_original_name = "NativeAppDeathEarlyDetector$$ExternalSyntheticLambda2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 0iI A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ File A03;

    public /* synthetic */ C0if(0iI r302, File file, File file2, int i) {
        this.A01 = r302;
        this.A00 = i;
        this.A02 = file;
        this.A03 = file2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        0iI.A00(this.A01, this.A02, this.A03, this.A00);
    }
}
