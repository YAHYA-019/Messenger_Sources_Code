package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.hoistedthreads.BroadcastFlowHoistedThreadsSectionLoader;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.igconnections.BroadcastFlowInstagramConnectionsLoader;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.morewaystoshare.hoisted.BroadcastFlowHoistedMoreWaysToShareSectionsLoader;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* loaded from: Cd1.class */
public final class Cd1 implements DGb {
    public C1v5 A00;
    public Bmk A01;
    public Bxi A02;
    public BroadcastFlowHoistedThreadsSectionLoader A03;
    public BroadcastFlowInstagramConnectionsLoader A04;
    public BroadcastFlowHoistedMoreWaysToShareSectionsLoader A05;
    public C7E A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public boolean A0C;
    public final Context A0D;
    public final FbUserSession A0E;
    public final 1YC A0F = 1YC.A03;
    public final DHX A0G;
    public final DJZ A0H;
    public final C6r A0I;
    public final ImmutableList.Builder A0J;
    public final ListenableFuture A0K;
    public final ListenableFuture A0L;
    public final ListenableFuture A0M;
    public final Set A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final ImmutableList.Builder A0Q;

    public Cd1(Context context, FbUserSession fbUserSession, DHX dhx, DJZ djz, C6r c6r, ImmutableList.Builder builder, ImmutableList.Builder builder2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, Set set, boolean z, boolean z2) {
        this.A0D = context;
        this.A0G = dhx;
        this.A0H = djz;
        this.A0E = fbUserSession;
        this.A0N = set;
        this.A0L = listenableFuture;
        this.A0M = listenableFuture2;
        this.A0K = listenableFuture3;
        this.A0P = z;
        this.A0O = z2;
        this.A0J = builder;
        this.A0Q = builder2;
        this.A0I = c6r;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A0C) {
                if (this.A0D == null) {
                    throw AnonymousClass001.A0Q("The context passed in the BroadcastFlowSectionsLoaderInterface.newBuilder() is null.\nIf you have other questions, please post it to group Android Messenger Modularity.");
                }
                this.A00 = C1v5.A01;
                this.A0C = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x06aa, code lost:
    
        if (r0.isEmpty() != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x09dd, code lost:
    
        if (r0.A0C != false) goto L446;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a6 A[Catch: Exception -> 0x0315, all -> 0x0329, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0315, blocks: (B:103:0x0242, B:107:0x024f, B:110:0x025b, B:115:0x0304, B:120:0x02a6, B:121:0x02ac, B:122:0x02b2, B:123:0x02b8, B:124:0x02be, B:125:0x02c4, B:127:0x02d4, B:130:0x02e0, B:131:0x02e6, B:133:0x02f3, B:134:0x02f9, B:135:0x02fe, B:135:0x02fe, B:137:0x0265, B:138:0x026a, B:141:0x0276, B:144:0x0280, B:146:0x0290), top: B:102:0x0242, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0478 A[Catch: Exception -> 0x04cd, all -> 0x04e1, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x04cd, blocks: (B:185:0x041e, B:189:0x042b, B:192:0x0437, B:195:0x0478, B:196:0x047e, B:198:0x0486, B:200:0x049a, B:201:0x04a3, B:202:0x04aa, B:205:0x04b6, B:207:0x04bc, B:213:0x0441, B:214:0x0446, B:217:0x0452, B:220:0x045c, B:222:0x046c), top: B:184:0x041e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df A[Catch: Exception -> 0x0143, all -> 0x015c, TRY_ENTER, TRY_LEAVE, TryCatch #21 {Exception -> 0x0143, blocks: (B:15:0x0085, B:19:0x0092, B:22:0x009e, B:25:0x00df, B:26:0x00e5, B:27:0x00eb, B:28:0x00f1, B:29:0x00f7, B:30:0x00fd, B:31:0x0103, B:33:0x0114, B:34:0x011a, B:35:0x011f, B:35:0x011f, B:38:0x012d, B:39:0x0132, B:45:0x0127, B:46:0x00a8, B:47:0x00ad, B:50:0x00b9, B:53:0x00c3, B:55:0x00d3), top: B:14:0x0085, outer: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07f8 A[Catch: Exception -> 0x081c, all -> 0x0830, TRY_ENTER, TRY_LEAVE, TryCatch #15 {Exception -> 0x081c, blocks: (B:351:0x0794, B:355:0x07a1, B:358:0x07ad, B:363:0x080b, B:368:0x07f8, B:371:0x0805, B:372:0x07b7, B:373:0x07bc, B:376:0x07c8, B:379:0x07d2, B:381:0x07e2), top: B:350:0x0794, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127 A[Catch: Exception -> 0x0143, all -> 0x015c, TRY_ENTER, TRY_LEAVE, TryCatch #21 {Exception -> 0x0143, blocks: (B:15:0x0085, B:19:0x0092, B:22:0x009e, B:25:0x00df, B:26:0x00e5, B:27:0x00eb, B:28:0x00f1, B:29:0x00f7, B:30:0x00fd, B:31:0x0103, B:33:0x0114, B:34:0x011a, B:35:0x011f, B:35:0x011f, B:38:0x012d, B:39:0x0132, B:45:0x0127, B:46:0x00a8, B:47:0x00ad, B:50:0x00b9, B:53:0x00c3, B:55:0x00d3), top: B:14:0x0085, outer: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0c26 A[Catch: Exception -> 0x0c9d, all -> 0x0cb1, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x0c9d, blocks: (B:549:0x0bcc, B:553:0x0bd9, B:556:0x0be5, B:559:0x0c26, B:560:0x0c2c, B:565:0x0c46, B:566:0x0c4c, B:567:0x0c52, B:568:0x0c58, B:569:0x0c5e, B:570:0x0c64, B:571:0x0c6a, B:573:0x0c7b, B:574:0x0c81, B:575:0x0c86, B:575:0x0c86, B:578:0x0c8c, B:584:0x0bef, B:585:0x0bf4, B:588:0x0c00, B:591:0x0c0a, B:593:0x0c1a), top: B:548:0x0bcc, outer: #12 }] */
    /* JADX WARN: Type inference failed for: r0v683, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r316v14 */
    /* JADX WARN: Type inference failed for: r316v16 */
    /* JADX WARN: Type inference failed for: r316v29 */
    /* JADX WARN: Type inference failed for: r316v30 */
    /* JADX WARN: Type inference failed for: r316v31 */
    /* JADX WARN: Type inference failed for: r324v25, types: [boolean] */
    @Override // X.DGb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A7H() {
        /*
            Method dump skipped, instructions count: 3510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd1.A7H():void");
    }

    @Override // X.DGb
    public void D1u(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0F;
        r0.A08("com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.interfaces.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "startLoadMore", A00);
        try {
            A00();
        } finally {
            r0.A06("messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "startLoadMore", A00);
        }
    }
}
