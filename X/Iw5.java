package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Iw5.class */
public final class Iw5 implements Runnable {
    public static final String __redex_internal_original_name = "CommunityMentionsSearchController$2$1";
    public final /* synthetic */ J3i A00;
    public final /* synthetic */ ImmutableList A01;

    public Iw5(J3i j3i, ImmutableList immutableList) {
        this.A00 = j3i;
        this.A01 = immutableList;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean A1N;
        J3i j3i = this.A00;
        ListenableFuture listenableFuture = j3i.A04;
        6SI r0 = j3i.A01;
        if (listenableFuture == r0.A00) {
            6SH r02 = r0.A07;
            ImmutableList immutableList = this.A01;
            6SC r03 = r02.A00;
            C00i c00i = r03.A0X;
            AbI.A1N(c00i);
            r03.A0G(immutableList);
            AbI.A1N(c00i);
            GWS A01 = 6SC.A01(r03);
            synchronized (r03) {
                A1N = AnonymousClass001.A1N(A01.A03.size());
            }
            r02.A00(A1N);
            r0.A00 = null;
        }
    }
}
