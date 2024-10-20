package X;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzs;
import java.util.concurrent.Callable;

/* loaded from: Ltc.class */
public final /* synthetic */ class Ltc implements Callable {
    public final /* synthetic */ Ke3 A00;
    public final /* synthetic */ MEn A01;
    public final /* synthetic */ LDG A02;

    public /* synthetic */ Ltc(Ke3 ke3, MEn mEn, LDG ldg) {
        this.A02 = ldg;
        this.A00 = ke3;
        this.A01 = mEn;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LDG ldg = this.A02;
        Ke3 ke3 = this.A00;
        MEn mEn = this.A01;
        try {
            zzs zzsVar = ldg.A0K;
            String packageName = ldg.A01.getPackageName();
            String str = ke3.A00;
            String str2 = ldg.A0G;
            Bundle A05 = 1BK.A05();
            A05.putString("playBillingLibraryVersion", str2);
            Bundle DCb = zzsVar.DCb(A05, packageName, str, 9);
            int A02 = LEC.A02(DCb, "BillingClient");
            String A07 = LEC.A07(DCb, "BillingClient");
            L1w l1w = KdR.A0J;
            mEn.BhP(L1w.A00(A07, A02));
            return null;
        } catch (Exception e) {
            LEC.A0B("BillingClient", "Error acknowledge purchase!", e);
            MLk mLk = ldg.A02;
            L1w l1w2 = KdR.A0D;
            JQx.A1C(l1w2, mLk, 28, 3);
            mEn.BhP(l1w2);
            return null;
        }
    }
}
