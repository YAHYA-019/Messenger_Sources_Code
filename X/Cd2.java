package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.broadcastflowremainingblendedsectionloader.BroadcastFlowRemainingBlendedSectionLoader;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.groupcreation.GroupCreationSectionsLoader;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.hoistedthreads.BroadcastFlowHoistedThreadsSectionLoader;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.igconnections.BroadcastFlowInstagramConnectionsLoader;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.morewaystoshare.hoisted.BroadcastFlowHoistedMoreWaysToShareSectionsLoader;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.recentssectionloader.BroadcastFlowRecentsSectionLoader;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cd2.class */
public final class Cd2 implements DGb {
    public BroadcastFlowRemainingBlendedSectionLoader A00;
    public GroupCreationSectionsLoader A01;
    public BroadcastFlowHoistedThreadsSectionLoader A02;
    public BroadcastFlowInstagramConnectionsLoader A03;
    public BroadcastFlowHoistedMoreWaysToShareSectionsLoader A04;
    public BroadcastFlowRecentsSectionLoader A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public BroadcastFlowBlendedSectionLoader A0D;
    public Object A0E;
    public final Context A0F;
    public final FbUserSession A0G;
    public final 1YC A0H = 1YC.A03;
    public final BMK A0I;
    public final DHX A0J;
    public final DJZ A0K;
    public final C6r A0L;
    public final ImmutableList.Builder A0M;
    public final ImmutableList.Builder A0N;
    public final ListenableFuture A0O;
    public final ListenableFuture A0P;
    public final ListenableFuture A0Q;
    public final Set A0R;
    public final boolean A0S;
    public final boolean A0T;

    public Cd2(Context context, FbUserSession fbUserSession, BMK bmk, DHX dhx, DJZ djz, C6r c6r, ImmutableList.Builder builder, ImmutableList.Builder builder2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, Set set, boolean z, boolean z2) {
        this.A0F = context;
        this.A0J = dhx;
        this.A0K = djz;
        this.A0G = fbUserSession;
        this.A0R = set;
        this.A0I = bmk;
        this.A0P = listenableFuture;
        this.A0Q = listenableFuture2;
        this.A0O = listenableFuture3;
        this.A0T = z;
        this.A0S = z2;
        this.A0N = builder;
        this.A0M = builder2;
        this.A0L = c6r;
    }

    private boolean A00() {
        boolean A00;
        Object obj;
        if (this.A0E == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0H;
            r0.A0B("com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "messaging.sharing.broadcastflow.mutation.loader.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.interfaces.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.SharingBroadcastflowMutationLoaderSectionsKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    if (BZb.A00 == i) {
                        Boolean bool = BZb.A01;
                        if (bool != null) {
                            A00 = bool.booleanValue();
                            if (A00 || !BWQ.A00(this.A0T)) {
                                obj = C1Y6.A03;
                            } else {
                                DJZ djz = this.A0K;
                                FbUserSession fbUserSession = this.A0G;
                                Set set = this.A0R;
                                this.A0D = new BroadcastFlowBlendedSectionLoader(this.A0F, fbUserSession, djz, this.A0L, this.A0N, this.A0M, set, this.A0S);
                                obj = C1Y6.A02;
                            }
                            this.A0E = obj;
                            r0.A07("messaging.sharing.broadcastflow.mutation.loader.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A00 = BZb.A00(r0, atomicInteger, i);
                    if (A00) {
                    }
                    obj = C1Y6.A03;
                    this.A0E = obj;
                    r0.A07("messaging.sharing.broadcastflow.mutation.loader.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A0E = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.sharing.broadcastflow.mutation.loader.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", andIncrement, 1BL.A1U(this.A0E));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.sharing.broadcastflow.mutation.loader.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", andIncrement, 1BL.A1U(this.A0E));
                throw th;
            }
        }
        return 1BK.A1U(this.A0E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0295 A[Catch: Exception -> 0x0304, all -> 0x0317, TRY_ENTER, TRY_LEAVE, TryCatch #25 {Exception -> 0x0304, blocks: (B:107:0x0257, B:108:0x025c, B:111:0x0268, B:114:0x0272, B:119:0x02f3, B:124:0x0295, B:125:0x029b, B:126:0x02a1, B:127:0x02a7, B:128:0x02ad, B:129:0x02b3, B:130:0x02b9, B:132:0x02e2, B:133:0x02e8, B:134:0x02ed, B:134:0x02ed, B:137:0x027f), top: B:106:0x0257, outer: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x041d A[Catch: Exception -> 0x049c, all -> 0x04af, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x049c, blocks: (B:173:0x03df, B:174:0x03e4, B:177:0x03f0, B:180:0x03fa, B:185:0x048b, B:190:0x041d, B:191:0x0423, B:192:0x0429, B:193:0x042f, B:194:0x0435, B:195:0x043b, B:197:0x045b, B:200:0x0467, B:201:0x046d, B:203:0x047a, B:204:0x0480, B:205:0x0485, B:205:0x0485, B:208:0x0407), top: B:172:0x03df, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0777 A[Catch: Exception -> 0x0826, all -> 0x0839, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0826, blocks: (B:313:0x0743, B:314:0x0748, B:317:0x0754, B:320:0x075e, B:323:0x0777, B:324:0x077d, B:325:0x0783, B:326:0x0789, B:327:0x078f, B:329:0x079b, B:331:0x07a4, B:347:0x080f, B:349:0x0815, B:357:0x07fc, B:358:0x0803, B:362:0x076b), top: B:312:0x0743, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0a47 A[Catch: Exception -> 0x0ad6, all -> 0x0ae9, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0ad6, blocks: (B:443:0x0a13, B:444:0x0a18, B:447:0x0a24, B:450:0x0a2e, B:453:0x0a47, B:454:0x0a4d, B:459:0x0a67, B:460:0x0a6d, B:461:0x0a73, B:462:0x0a79, B:463:0x0a7f, B:464:0x0a85, B:465:0x0a8b, B:467:0x0ab4, B:468:0x0aba, B:469:0x0abf, B:469:0x0abf, B:472:0x0ac5, B:479:0x0a3b), top: B:442:0x0a13, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0bf9 A[Catch: Exception -> 0x0cb8, all -> 0x0ccb, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0cb8, blocks: (B:515:0x0bc5, B:516:0x0bca, B:519:0x0bd6, B:522:0x0be0, B:525:0x0bf9, B:526:0x0bff, B:533:0x0c2a, B:534:0x0c31, B:537:0x0c3d, B:539:0x0c47, B:540:0x0c4d, B:541:0x0c53, B:542:0x0c59, B:543:0x0c5f, B:544:0x0c65, B:545:0x0c6b, B:547:0x0c96, B:548:0x0c9c, B:549:0x0ca1, B:549:0x0ca1, B:552:0x0ca7, B:559:0x0c22, B:563:0x0bed), top: B:514:0x0bc5, outer: #18 }] */
    /* JADX WARN: Type inference failed for: r309v1 */
    /* JADX WARN: Type inference failed for: r309v2 */
    /* JADX WARN: Type inference failed for: r309v66, types: [java.lang.String] */
    @Override // X.DGb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A7H() {
        /*
            Method dump skipped, instructions count: 3778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd2.A7H():void");
    }

    @Override // X.DGb
    public void D1u(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0H;
        r0.A08("com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.interfaces.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "startLoadMore", andIncrement);
        Exception e = null;
        try {
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "messaging.sharing.broadcastflow.mutation.loader.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.interfaces.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", andIncrement2, "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.SharingBroadcastflowMutationLoaderSectionsKillSwitch", "startLoadMore");
                try {
                    try {
                        this.A0D.A01();
                        r0.A09("messaging.sharing.broadcastflow.mutation.loader.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "startLoadMore", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.sharing.broadcastflow.mutation.loader.sections.broadcastflowblendingsectionloader.BroadcastFlowBlendedSectionLoader", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "startLoadMore", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "startLoadMore", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "startLoadMore", andIncrement);
            throw th2;
        }
    }
}
