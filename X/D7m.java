package X;

import kotlin.jvm.functions.Function1;

/* loaded from: D7m.class */
public final class D7m implements Runnable {
    public static final String __redex_internal_original_name = "ThreadAuthenticationLauncher$getLockedStatus$1$onCompletion$1";
    public final /* synthetic */ BEw A00;
    public final /* synthetic */ Function1 A01;

    public D7m(BEw bEw, Function1 function1) {
        this.A00 = bEw;
        this.A01 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BEw bEw = this.A00;
        this.A01.invoke(bEw != null ? ((1qX) bEw).mResultSet.getNullableInteger(0, 70) : null);
    }
}
