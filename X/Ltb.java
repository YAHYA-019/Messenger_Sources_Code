package X;

import java.util.concurrent.Callable;

/* loaded from: Ltb.class */
public final /* synthetic */ class Ltb implements Callable {
    public final /* synthetic */ LDG A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ Ltb(LDG ldg, String str, String str2) {
        this.A00 = ldg;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LDG ldg = this.A00;
        return ldg.A0K.DCp(ldg.A01.getPackageName(), this.A01, this.A02, null, 3);
    }
}
