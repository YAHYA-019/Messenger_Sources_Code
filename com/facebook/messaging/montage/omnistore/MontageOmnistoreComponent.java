package com.facebook.messaging.montage.omnistore;

import X.0S2;
import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1Fv;
import X.1GU;
import X.1QB;
import X.1Qc;
import X.2ZF;
import X.3qS;
import X.3rM;
import X.BKZ;
import X.C00i;
import X.C00j;
import X.C01213qU;
import X.C3o5;
import X.C3qh;
import X.CAk;
import X.H8S;
import X.InterfaceC01203qT;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.omnistore.MontageOmnistoreCacheUpdater;
import com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent;
import com.facebook.omnistore.Collection;
import com.facebook.omnistore.CollectionName;
import com.facebook.omnistore.Delta;
import com.facebook.omnistore.IndexedFields;
import com.facebook.omnistore.Omnistore;
import com.facebook.omnistore.QueueIdentifier;
import com.facebook.omnistore.module.OmnistoreComponent;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: MontageOmnistoreComponent.class */
public final class MontageOmnistoreComponent implements OmnistoreComponent {
    public long A00;
    public CollectionName A01;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;
    public final InterfaceC01203qT A0E;
    public final C00i A06 = new 1BQ(16511);
    public final C00i A04 = FbInjector.A00;
    public final C00i A0D = new 1BQ(67918);
    public final C00i A0C = new 1BV(85181);
    public final C00i A09 = new 1BV(32787);
    public final C00i A05 = new 1BQ(65837);
    public final C00i A03 = new 1BQ(16458);
    public final C00i A07 = new 1BQ(16385);
    public final C00i A02 = new 1BQ(66351);
    public final C00i A08 = new 1BQ(32807);

    public MontageOmnistoreComponent() {
        3qS r0 = new 3qS(this);
        this.A0E = r0;
        this.A0B = new AtomicBoolean(false);
        this.A0A = new AtomicBoolean(false);
        this.A00 = 0L;
        C01213qU c01213qU = (C01213qU) 1Bi.A03(67917);
        synchronized (c01213qU) {
            c01213qU.A00.add(r0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r304 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent r301) {
        /*
            r0 = r301
            X.00i r0 = r0.A0D
            java.lang.Object r0 = r0.get()
            X.2Kj r0 = (X.2Kj) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A00()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L44
            r0 = r301
            X.00i r0 = r0.A08
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.3rM r0 = (X.3rM) r0
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            r0 = 0
            r304 = r0
            r0 = r301
            com.facebook.omnistore.Collection r0 = r0.A01     // Catch: java.lang.Throwable -> L35
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3c
            goto L3a
        L35:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        L3a:
            r0 = 1
            r304 = r0
        L3c:
            r0 = r301
            monitor-exit(r0)
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L48
        L44:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L48:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent.A00(com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent):boolean");
    }

    public IndexedFields BOY(String str, String str2, ByteBuffer byteBuffer) {
        try {
            this.A0C.get();
            return CAk.A00(byteBuffer);
        } catch (Exception e) {
            1BK.A09(this.A06).softReport("com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent", "indexObject", e);
            return new IndexedFields();
        }
    }

    public void BtA(List list) {
        MontageOmnistoreCacheUpdater montageOmnistoreCacheUpdater;
        try {
            MontageOmnistoreDeltaHandler montageOmnistoreDeltaHandler = (MontageOmnistoreDeltaHandler) C3o5.A0N(this.A02, 85183);
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Delta delta = (Delta) it.next();
                if (delta.getType() == 2) {
                    montageOmnistoreCacheUpdater = montageOmnistoreDeltaHandler.A01;
                    String primaryKey = delta.getPrimaryKey();
                    synchronized (montageOmnistoreCacheUpdater) {
                        try {
                            montageOmnistoreCacheUpdater.A00.add(primaryKey);
                        } catch (Throwable th) {
                            MontageOmnistoreCacheUpdater montageOmnistoreCacheUpdater2 = montageOmnistoreCacheUpdater;
                            throw th;
                        }
                    }
                } else if (delta.getType() == 1) {
                    H8S A02 = H8S.A02(delta.getBlob());
                    boolean A0D = A02.A0E().A0D();
                    BKZ A0E = A02.A0E();
                    hashSet.add(A0D ? A0E.A0C() : A0E.A0B());
                    String A0G = A02.A0G();
                    A0G.getClass();
                    if (montageOmnistoreDeltaHandler.A02.A02(A0G) == null) {
                        hashSet2.add(A02);
                    }
                }
            }
            montageOmnistoreCacheUpdater = montageOmnistoreDeltaHandler.A01;
            synchronized (montageOmnistoreCacheUpdater) {
                montageOmnistoreCacheUpdater.A02.addAll(hashSet);
            }
            synchronized (montageOmnistoreCacheUpdater) {
                montageOmnistoreCacheUpdater.A01.addAll(hashSet2);
            }
            if (montageOmnistoreDeltaHandler.A00) {
                return;
            }
            MontageOmnistoreDeltaHandler.A00(montageOmnistoreDeltaHandler);
        } catch (Exception e) {
            1BK.A09(this.A06).softReport("com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent", "onDeltasReceived", e);
        }
    }

    public void CLx(int i) {
        0fH.A0g(Integer.valueOf(i), "com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent", "onSnapshotStateChanged %s");
    }

    @Override // com.facebook.omnistore.module.OmnistoreComponent
    public String getCollectionLabel() {
        return "messenger_montage_v2";
    }

    @Override // com.facebook.omnistore.module.OmnistoreComponent
    public void onCollectionAvailable(Collection collection) {
        int i;
        0fH.A0j("com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent", "Montage omnistore collection available");
        C00j.A05("MontageOmnistoreComponent:onCollectionAvailable", -1479465674);
        try {
            if (collection == null) {
                1BK.A09(this.A06).D0v("com.facebook.messaging.montage.omnistore.MontageOmnistoreComponent", "Null collection on onCollectionAvailable");
                i = -1362490704;
            } else {
                C00i c00i = this.A08;
                boolean z = (3rM) c00i.get();
                synchronized (z) {
                    boolean z2 = false;
                    try {
                        if (z.A01 != null) {
                            z2 = true;
                        }
                    } finally {
                        boolean z3 = z;
                    }
                }
                z = (3rM) c00i.get();
                synchronized (z) {
                    z.A01 = collection;
                }
                if (z) {
                    i = -96398313;
                } else {
                    if (this.A0A.compareAndSet(false, true)) {
                        C00i c00i2 = this.A02;
                        final 2ZF r0 = (2ZF) C3o5.A0N(c00i2, 17038);
                        final MontageOmnistoreCacheUpdater montageOmnistoreCacheUpdater = (MontageOmnistoreCacheUpdater) C3o5.A0N(c00i2, 85182);
                        Runnable runnable = new Runnable() { // from class: X.D99
                            public static final String __redex_internal_original_name = "MontageOmnistoreComponent$$ExternalSyntheticLambda1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2;
                                MontageOmnistoreComponent montageOmnistoreComponent = this;
                                2ZF r02 = r0;
                                MontageOmnistoreCacheUpdater montageOmnistoreCacheUpdater2 = montageOmnistoreCacheUpdater;
                                C00j.A05("MontageOmnistoreComponent:onCollectionAvailable:load", -1713533252);
                                try {
                                    try {
                                        0fH.A0j(AbstractC00603o4.A00(52), "Loading stories");
                                        r02.A01();
                                        ImmutableList A02 = montageOmnistoreCacheUpdater2.A0C.A02(0S2.A00);
                                        ((2ZF) montageOmnistoreCacheUpdater2.A07.get()).A01();
                                        ImmutableList.Builder A0h = 4YU.A0h();
                                        1Du it = A02.iterator();
                                        while (it.hasNext()) {
                                            A0h.m11011add((Object) Long.valueOf(MontageOmnistoreCacheUpdater.A00(montageOmnistoreCacheUpdater2, (C8H) it.next()).A00));
                                        }
                                        montageOmnistoreCacheUpdater2.A0D.A00 = 0S2.A01;
                                        ((C2j0) montageOmnistoreCacheUpdater2.A06.get()).A01(new Object());
                                        r02.A01();
                                        montageOmnistoreComponent.A0A.set(false);
                                        i2 = -1311995005;
                                    } catch (Exception e) {
                                        1BK.A09(montageOmnistoreComponent.A06).softReport(AbstractC00603o4.A00(52), AbstractC00603o4.A00(573), e);
                                        r02.A01();
                                        montageOmnistoreComponent.A0A.set(false);
                                        i2 = 848401526;
                                    }
                                    C00j.A01(i2);
                                } catch (Throwable th) {
                                    montageOmnistoreComponent.A0A.set(false);
                                    C00j.A01(1266134670);
                                    throw th;
                                }
                            }
                        };
                        long j = 3;
                        long j2 = ((1GU) this.A03.get()).BWu() ? 2 : 3;
                        if (C3o5.A0F(this.A07).AZk(36322731695818552L) || j2 != j) {
                            1QB r02 = (1QB) 1Bn.A0A(65841);
                            1Qc r03 = (1Qc) this.A05.get();
                            r02.A02(runnable);
                            r02.A04("MontageOmnistoreLoadAllStories");
                            r02.A03("Foreground");
                            r03.A03(r02.A01(), 1BJ.A00(ActionId.MESSENGER_THREAD_LIST_DISPLAYED));
                        } else {
                            runnable.run();
                        }
                    }
                    i = -2086113617;
                }
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(1748627688);
            throw th;
        }
    }

    @Override // com.facebook.omnistore.module.OmnistoreComponent
    public void onCollectionInvalidated() {
        3rM r0 = (3rM) this.A08.get();
        synchronized (r0) {
            r0.A01 = null;
        }
    }

    public void onDeltaClusterEnded(int i, QueueIdentifier queueIdentifier) {
        MontageOmnistoreDeltaHandler montageOmnistoreDeltaHandler = (MontageOmnistoreDeltaHandler) C3o5.A0N(this.A02, 85183);
        montageOmnistoreDeltaHandler.A00 = false;
        MontageOmnistoreDeltaHandler.A00(montageOmnistoreDeltaHandler);
    }

    public void onDeltaClusterStarted(int i, long j, QueueIdentifier queueIdentifier) {
        ((MontageOmnistoreDeltaHandler) C3o5.A0N(this.A02, 85183)).A00 = true;
    }

    @Override // com.facebook.omnistore.module.OmnistoreComponent
    public C3qh provideSubscriptionInfo(Omnistore omnistore) {
        CollectionName.Builder createCollectionNameBuilder = omnistore.createCollectionNameBuilder(getCollectionLabel());
        createCollectionNameBuilder.addSegment(((1Fv) this.A02.get()).A04().A05);
        createCollectionNameBuilder.addDeviceId();
        CollectionName build = createCollectionNameBuilder.build();
        this.A01 = build;
        Integer num = 0S2.A01;
        build.getClass();
        return new C3qh(build, num);
    }
}
