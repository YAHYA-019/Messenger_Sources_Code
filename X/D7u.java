package X;

import com.google.common.collect.ImmutableList;

/* loaded from: D7u.class */
public final class D7u implements Runnable {
    public static final String __redex_internal_original_name = "DeleteThreadsHelper$3";
    public final /* synthetic */ C5P A00;
    public final /* synthetic */ ImmutableList A01;

    public D7u(C5P c5p, ImmutableList immutableList) {
        this.A00 = c5p;
        this.A01 = immutableList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((DIG) this.A00.A01.get()).AMd(this.A01);
    }
}
