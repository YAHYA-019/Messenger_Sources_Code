package X;

import com.facebook.msys.mcf.MsysError;

/* loaded from: J05.class */
public final class J05 implements Runnable {
    public static final String __redex_internal_original_name = "ArmadilloMediaDownloader$streamingDownload$1$3$callback$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ JMA A01;
    public final /* synthetic */ MsysError A02;

    public J05(JMA jma, MsysError msysError, int i) {
        this.A01 = jma;
        this.A02 = msysError;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JMA jma = this.A01;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("streaming download media error: ");
        MsysError msysError = this.A02;
        RuntimeException A0T = AnonymousClass001.A0T(AnonymousClass001.A0a(msysError, A0k));
        int i = this.A00;
        Hwj hwj = Hwj.A00;
        jma.Bxn(msysError != null ? GjL.A00(msysError) : null, A0T, i);
    }
}
