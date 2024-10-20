package com.facebook.inspiration.composer.sprouts.framework.ranking;

import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1ED;
import X.1GU;
import X.1hM;
import X.2JX;
import X.2Jf;
import X.2Jh;
import X.4YU;
import X.4fF;
import X.7hZ;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zP;
import X.AnonymousClass001;
import X.AnonymousClass047;
import X.C00i;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C03r;
import X.DKC;
import X.DKb;
import X.ENc;
import X.ERo;
import X.F7T;
import X.FFp;
import X.FwJ;
import X.G02;
import X.G03;
import X.G6l;
import com.facebook.stash.core.Stash;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: InspirationSproutSurfaceDiskStorage.class */
public final class InspirationSproutSurfaceDiskStorage {
    public Stash A00;
    public ImmutableList A01;
    public 1ED A02;
    public final 1Br A04 = 7zM.A0Q();
    public final 1Br A03 = 1BK.A0C();
    public final C01i A06 = C01g.A00(C03i.A02, new DKb(this, 14));
    public final AtomicBoolean A05 = 7zO.A15();

    public static final Stash A00(InspirationSproutSurfaceDiskStorage inspirationSproutSurfaceDiskStorage) {
        Stash stash = inspirationSproutSurfaceDiskStorage.A00;
        if (stash == null) {
            synchronized (inspirationSproutSurfaceDiskStorage) {
                if (!((F7T) 1Bn.A0A(98330)).A01()) {
                    throw new IllegalArgumentException();
                }
                stash = ((2Jh) 1Bi.A03(16967)).A03(1072552487);
            }
            inspirationSproutSurfaceDiskStorage.A00 = stash;
        }
        11T.A0I(stash, "null cannot be cast to non-null type com.facebook.stash.core.Stash");
        return stash;
    }

    public static final ImmutableList A01(String str) {
        ENc eNc;
        if (str.length() == 0) {
            return null;
        }
        List A19 = 4YU.A19(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A19.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (11T.A0O(A0i, "TEXT_BACKGROUND")) {
                eNc = ENc.A0A;
            } else if (11T.A0O(A0i, "TRENDING_MUSIC")) {
                eNc = ENc.A08;
            } else {
                try {
                    eNc = ENc.valueOf(A0i);
                } catch (IllegalArgumentException unused) {
                }
                if (eNc != null) {
                }
            }
            A0s.add(eNc);
        }
        return ImmutableList.copyOf((Collection) A0s);
    }

    public static final 1ED A02(InspirationSproutSurfaceDiskStorage inspirationSproutSurfaceDiskStorage) {
        1ED r302 = inspirationSproutSurfaceDiskStorage.A02;
        if (r302 == null) {
            if (!((F7T) 1Bn.A0A(98330)).A01()) {
                throw new IllegalArgumentException();
            }
            r302 = (1ED) 1Bu.A00(16487).get();
            inspirationSproutSurfaceDiskStorage.A02 = r302;
        }
        11T.A0I(r302, "null cannot be cast to non-null type com.google.common.util.concurrent.ListeningExecutorService");
        return r302;
    }

    public static final String A03(InspirationSproutSurfaceDiskStorage inspirationSproutSurfaceDiskStorage, String str) {
        String str2;
        synchronized (inspirationSproutSurfaceDiskStorage) {
            str2 = null;
            try {
                byte[] readResourceToMemory = A00(inspirationSproutSurfaceDiskStorage).readResourceToMemory(str);
                if (readResourceToMemory != null) {
                    new String(readResourceToMemory, C03r.A05);
                }
            } catch (IOException e) {
                AnonymousClass047 A04 = ((FFp) 1Bi.A03(98513)).A04("inspiration_sprouts_secondary_storage_read_failed", "InspirationSproutSurfaceDiskStorage", (String) null, (String) null);
                A04.Cmr(e);
                A04.report();
            }
        }
        return str2;
    }

    public static final void A04(InspirationSproutSurfaceDiskStorage inspirationSproutSurfaceDiskStorage) {
        if (!A07(inspirationSproutSurfaceDiskStorage) && inspirationSproutSurfaceDiskStorage.A06()) {
            inspirationSproutSurfaceDiskStorage.A05.set(false);
            return;
        }
        ((4fF) 1Bn.A0A(68126)).A0I(7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "RankedHomebaseSproutsQuery", (String) null, "fbandroid", -1592846730, 0, 3763449420L, 3763449420L, false, true)), FwJ.A00(inspirationSproutSurfaceDiskStorage, new Object(), 12), "InspirationSproutSurfaceDiskStorage_subscription_key", (Executor) 1Bi.A03(16457));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r302 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A05(com.facebook.inspiration.composer.sprouts.framework.ranking.InspirationSproutSurfaceDiskStorage r301) {
        /*
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1e
            r0 = r301
            java.lang.String r1 = "homebase_ranking_info"
            java.lang.String r0 = A03(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L35
            r0 = r303
            com.google.common.collect.ImmutableList r0 = A01(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L35
        L1e:
            r0 = r301
            boolean r0 = r0.A06()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L35
            r0 = r301
            r1 = r302
            r0.A01 = r1
            r0 = r301
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A05
            r1 = 0
            r0.set(r1)
            return
        L35:
            r0 = r301
            A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.inspiration.composer.sprouts.framework.ranking.InspirationSproutSurfaceDiskStorage.A05(com.facebook.inspiration.composer.sprouts.framework.ranking.InspirationSproutSurfaceDiskStorage):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        if ((X.7zR.A0G().now() - r302) >= (A07(r301) ? X.1Br.A07(r301.A03).Av9(X.1GD.A07, 36604275392059973L) * 1000 : 86400000)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A06() {
        /*
            r301 = this;
            r0 = -1
            long r0 = (long) r0
            r302 = r0
            java.lang.String r0 = "homebase_ranking_time"
            r304 = r0
            r0 = r301
            r1 = r304
            java.lang.String r0 = A03(r0, r1)     // Catch: java.lang.NumberFormatException -> L87
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L77
            r0 = r304
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L87
            r302 = r0
        L16:
            r0 = -1
            long r0 = (long) r0
            r305 = r0
            r0 = r302
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L77
            r0 = r301
            boolean r0 = A07(r0)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L7f
            r0 = r301
            X.1Br r0 = r0.A03
            X.2yD r0 = X.1Br.A07(r0)
            r308 = r0
            r0 = 36604275392059973(0x820b6500011a45, double:3.2120293793005426E-306)
            r305 = r0
            X.1GD r0 = X.1GD.A07
            r304 = r0
            r0 = r308
            r1 = r304
            r2 = r305
            long r0 = r0.Av9(r1, r2)
            r309 = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            r311 = r0
            r0 = r309
            r1 = r311
            long r0 = r0 * r1
            r309 = r0
        L5a:
            X.0dp r0 = X.7zR.A0G()
            r304 = r0
            r0 = r304
            long r0 = r0.now()
            r1 = r302
            long r0 = r0 - r1
            r313 = r0
            r0 = r313
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r315 = r0
            r0 = 1
            r307 = r0
            r0 = r315
            if (r0 < 0) goto L7c
        L77:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
        L7c:
            r0 = r307
            return r0
        L7f:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r309 = r0
            goto L5a
        L87:
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.inspiration.composer.sprouts.framework.ranking.InspirationSproutSurfaceDiskStorage.A06():boolean");
    }

    public static final boolean A07(InspirationSproutSurfaceDiskStorage inspirationSproutSurfaceDiskStorage) {
        return 1Br.A07(inspirationSproutSurfaceDiskStorage.A03).AZk(36322800415295467L);
    }

    public final void A08() {
        1ED A02;
        Runnable g03;
        if (((F7T) 1Bn.A0A(98330)).A01()) {
            if (A07(this)) {
                AtomicBoolean atomicBoolean = this.A05;
                if (atomicBoolean.get()) {
                    return;
                }
                if (this.A01 != null && A06()) {
                    return;
                }
                atomicBoolean.set(true);
                if (!7zP.A0N(this.A04).BWu()) {
                    A05(this);
                    return;
                } else {
                    A02 = A02(this);
                    g03 = new G02(this);
                }
            } else {
                if (this.A01 != null) {
                    return;
                }
                if (!7zP.A0N(this.A04).BWu()) {
                    String A03 = A03(this, "homebase_ranking_info");
                    this.A01 = A03 == null ? null : A01(A03);
                    A04(this);
                    return;
                }
                A02 = A02(this);
                g03 = new G03(this);
            }
            A02.D3B(g03);
        }
    }

    public final void A09(String str, String str2) {
        11T.A0F(str2, 1);
        C00i c00i = this.A04.A00;
        if (((1GU) c00i.get()).BWu()) {
            try {
                11T.A0D(A02(this).D3C(new G6l(this, str, str2, 0)));
                return;
            } catch (ERo e) {
                new 7hZ(e);
                return;
            }
        }
        try {
            if (!A07(this)) {
                str = "homebase_ranking_info";
            }
            ((1GU) c00i.get()).AAq();
            A00(this).write(str, DKC.A1a(str2, C03r.A05));
            11T.A0A(1hM.A01);
        } catch (ERo e2) {
            new 7hZ(e2);
        }
    }
}
