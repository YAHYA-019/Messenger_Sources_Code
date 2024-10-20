package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Cbf.class */
public final class Cbf implements CallerContextable {
    public static final CallerContext A0C = CallerContext.A0A(Cbf.class, "unknown", "new_broadcast_flow");
    public static final String __redex_internal_original_name = "RecentThreadsLoader";
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A03;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A09;
    public final 1Br A0A;
    public final CHT A0B;
    public final 1Br A07 = AbG.A0U();
    public final 1Br A08 = AbG.A0T();
    public final 1Br A04 = 1Bq.A00(66265);
    public final 1Br A02 = AbG.A0J();

    public Cbf(Context context, FbUserSession fbUserSession) {
        this.A00 = context;
        this.A09 = 1Bu.A01(context, 17151);
        this.A05 = 1Bu.A01(context, 83542);
        this.A0A = 1Bu.A01(context, 83546);
        this.A03 = 1Bu.A01(context, 83796);
        this.A06 = 1Bu.A01(context, 16676);
        1Bu.A06(context, 83543);
        this.A0B = new CHT(context, fbUserSession);
        this.A01 = fbUserSession;
    }

    public static final SettableFuture A00(Cbf cbf, int i, boolean z, boolean z2) {
        SettableFuture A0j = 4YU.A0j();
        1Tc r0 = (1Tc) 1Br.A0B(cbf.A06);
        1F9 r02 = 1F9.A0I;
        1Hb r03 = 1Hb.A02;
        HashSet A03 = 1Tc.A03((1TC) null, r02, r03, r0);
        if (A03.size() == 1 && A03.contains(1U0.A02)) {
            A01(cbf, ((1UL) 1Lm.A05(cbf.A00, cbf.A01, 16682)).A02(r02, r03, 1GC.A00()).A07.A01, A0j, i, z, z2);
            return A0j;
        }
        2Ur A0J = ((C2xd) 1Br.A0B(cbf.A09)).A0J(cbf.A01);
        A0J.CmR(new Cbz(cbf, A0j, i, z, z2));
        A0J.A06 = new Cu1(A0J, A0j, new AtomicBoolean(false));
        A0J.A09(r02);
        A0J.A0A(2fC.A00(A0C, r03, false, false, false));
        return A0j;
    }

    public static final void A01(Cbf cbf, ImmutableList immutableList, SettableFuture settableFuture, int i, boolean z, boolean z2) {
        CHT cht = cbf.A0B;
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            ThreadSummary A0j = AbF.A0j(it);
            if (cht.A01(A0j)) {
                builder.m11011add((Object) A0j);
            }
        }
        ImmutableList A01 = 1Fj.A01(builder);
        if (z2) {
            A01 = D3Y.A00(cht, A01, 27);
            11T.A0A(A01);
        }
        if (z) {
            ImmutableList.Builder builder2 = ImmutableList.builder();
            1Du it2 = A01.iterator();
            while (it2.hasNext()) {
                ThreadSummary A0j2 = AbF.A0j(it2);
                if (!ThreadKey.A0S(A0j2.A0n)) {
                    builder2.m11011add((Object) A0j2);
                }
            }
            A01 = 1Fj.A01(builder2);
        }
        if (CCJ.A00(1Br.A0B(cbf.A03))) {
            if (!A01.isEmpty()) {
                if (A01.size() > i && i != -1) {
                    A01 = A01.subList(0, i);
                    11T.A0A(A01);
                }
            }
            A01 = ImmutableList.of();
            11T.A0A(A01);
        } else {
            if (!A01.isEmpty()) {
                ImmutableList.Builder builder3 = ImmutableList.builder();
                1Du it3 = A01.iterator();
                while (it3.hasNext()) {
                    ThreadSummary A0j3 = AbF.A0j(it3);
                    if (i == 0) {
                        break;
                    }
                    ThreadKey threadKey = A0j3.A0n;
                    if (threadKey != null && threadKey.A1F()) {
                        builder3.m11011add((Object) A0j3);
                        i--;
                    }
                }
                A01 = builder3.build();
                11T.A0A(A01);
            }
            A01 = ImmutableList.of();
            11T.A0A(A01);
        }
        ImmutableList.Builder builder4 = ImmutableList.builder();
        1Du it4 = A01.iterator();
        while (it4.hasNext()) {
            builder4.m11011add((Object) new Csv(BOi.A0B, AbF.A0j(it4), "recents"));
        }
        AbG.A1V(builder4, settableFuture);
    }
}
