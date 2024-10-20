package X;

import android.content.Context;
import com.facebook.common.executors.annotations.ForUiThread;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: I7q.class */
public final class I7q {
    public static final ImmutableMap A0E;
    public 1RN A00;
    public 1RN A01;
    public 2eS A02;
    public 79U A03;
    public RHE A04;
    public ListenableFuture A05;
    public C2a2 A06 = null;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final 1CO A0A;
    public final Hew A0B;
    public final HxR A0C;
    public final Executor A0D;

    static {
        ImmutableMap.Builder A0c = 1BK.A0c();
        HBG hbg = HBG.A01;
        HB7 hb7 = HB7.A01;
        GOo.A1O(A0c, hb7, hbg);
        GOo.A1O(A0c, HB7.A04, HBG.A08);
        GOo.A1O(A0c, hb7, HBG.A06);
        GOo.A1O(A0c, hb7, HBG.A04);
        GOo.A1O(A0c, hb7, HBG.A07);
        A0E = AbG.A10(A0c, HBG.A02, ImmutableList.of((Object) HB7.A02));
    }

    public I7q() {
        Context A00 = FbInjector.A00();
        HxR hxR = (HxR) 1Bn.A0F(A00, HxR.class, (Class) null);
        Executor executor = (Executor) 1Bi.A05(Executor.class, ForUiThread.class);
        1CO r0 = (1CO) 1Bi.A05(1CO.class, (Class) null);
        this.A0C = hxR;
        this.A0D = executor;
        this.A0A = r0;
        this.A0B = (Hew) 1Bn.A0F(A00, Hew.class, (Class) null);
        this.A07 = 1Bn.A06(A00, I5H.class, (Class) null);
        this.A09 = 1Bn.A06(A00, IQW.class, (Class) null);
        this.A08 = 1Bn.A06(A00, 4fE.class, (Class) null);
    }

    public static void A00(I7q i7q) {
        ((1EH) 1Br.A0B(((I5H) i7q.A07.get()).A05)).AEI();
        1RN r0 = i7q.A01;
        if (r0 != null) {
            r0.dispose();
            i7q.A01 = null;
        }
        ListenableFuture listenableFuture = i7q.A05;
        if (listenableFuture == null || listenableFuture.isCancelled() || i7q.A05.isDone()) {
            return;
        }
        i7q.A05.cancel(true);
    }
}
