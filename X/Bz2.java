package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* loaded from: Bz2.class */
public final class Bz2 {
    public Bhu A00;
    public ImmutableList.Builder A01;
    public Future A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final DHX A09;
    public final DJZ A0A;
    public final C6r A0B;
    public final ListenableFuture A0C;
    public final ListenableFuture A0D;
    public final ListenableFuture A0E;
    public final ListenableFuture A0F;
    public final ListenableFuture A0G;
    public final 1BP A0H;

    public Bz2(FbUserSession fbUserSession, DHX dhx, DJZ djz, C6r c6r, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4) {
        1BK.A1K(listenableFuture, 3, listenableFuture2);
        this.A0B = c6r;
        this.A09 = dhx;
        this.A0F = listenableFuture;
        this.A0G = listenableFuture2;
        this.A0C = listenableFuture3;
        this.A0E = listenableFuture4;
        this.A0A = djz;
        this.A03 = fbUserSession;
        this.A0H = FbInjector.A00;
        this.A04 = AbG.A0I();
        this.A07 = 1Bq.A00(16443);
        this.A05 = 1Bq.A00(83165);
        this.A08 = AbG.A0T();
        this.A06 = 1Bq.A00(83794);
        1FV Cyh = dhx.Cyh();
        11T.A0A(Cyh);
        this.A0D = Cyh;
        this.A01 = ImmutableList.builder();
    }
}
