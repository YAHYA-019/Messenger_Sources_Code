package X;

import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.IOException;

/* loaded from: J29.class */
public final class J29 implements Runnable {
    public static final String __redex_internal_original_name = "InstantGamesFileUploadHelper$uploadFile$1";
    public final /* synthetic */ C11684xK A00;
    public final /* synthetic */ SettableFuture A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ String A03;

    public J29(C11684xK c11684xK, SettableFuture settableFuture, File file, String str) {
        this.A02 = file;
        this.A03 = str;
        this.A00 = c11684xK;
        this.A01 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            String canonicalPath = this.A02.getCanonicalPath();
            11T.A0A(canonicalPath);
            str = C5f6.A00(canonicalPath);
        } catch (IOException unused) {
            str = null;
        }
        File file = this.A02;
        if (str == null) {
            str = "text/plain";
        }
        try {
            this.A00.A01(new HkU(new ICY(EPR.A0V)), new IE4(file, str, this.A03), new LVv(this.A01, 3));
        } catch (5DD e) {
            this.A01.setException(e);
        }
    }
}
