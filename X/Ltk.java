package X;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: Ltk.class */
public final /* synthetic */ class Ltk implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ LDG A02;
    public final /* synthetic */ KlM A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ Ltk(Bundle bundle, LDG ldg, KlM klM, String str, String str2, int i) {
        this.A02 = ldg;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = klM;
        this.A01 = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LDG ldg = this.A02;
        int i = this.A00;
        String str = this.A04;
        String str2 = this.A05;
        return ldg.A0K.DCw(this.A01, ldg.A01.getPackageName(), str, str2, null, i);
    }
}
