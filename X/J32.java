package X;

import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

/* loaded from: J32.class */
public final class J32 implements Runnable {
    public static final String __redex_internal_original_name = "PaymentsIdvProtocol$2";
    public final /* synthetic */ C11684xK A00;
    public final /* synthetic */ FcL A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ String A04;

    public J32(C11684xK c11684xK, FcL fcL, SettableFuture settableFuture, File file, String str) {
        this.A01 = fcL;
        this.A03 = file;
        this.A04 = str;
        this.A00 = c11684xK;
        this.A02 = settableFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.A00.A01(new HkU(new ICY(EPR.A0V)), new IE4(this.A03, this.A04), new LVv(this, 2));
        } catch (5DD e) {
            this.A02.setException(e);
        }
    }
}
