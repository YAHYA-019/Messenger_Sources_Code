package X;

import java.io.File;

/* loaded from: J3o.class */
public final class J3o implements Runnable {
    public static final String __redex_internal_original_name = "LargeLogUploadProxyImpl$uploadFile$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GxL A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public J3o(GxL gxL, File file, String str, String str2, String str3, int i, int i2) {
        this.A02 = gxL;
        this.A06 = str;
        this.A03 = file;
        this.A00 = i;
        this.A05 = str2;
        this.A01 = i2;
        this.A04 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GxL gxL = this.A02;
        String str = this.A06;
        File file = this.A03;
        int i = this.A00;
        GxL.A00(gxL, file, str, this.A05, this.A04, i, this.A01);
    }
}
