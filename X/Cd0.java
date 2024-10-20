package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.hoistedthreads.BroadcastFlowHoistedThreadsSectionLoader;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* loaded from: Cd0.class */
public final class Cd0 implements DGb {
    public BroadcastFlowHoistedThreadsSectionLoader A00;
    public Object A01;
    public final Context A02;
    public final 1YC A03 = 1YC.A03;
    public final DHX A04;
    public final DJZ A05;
    public final C6r A06;
    public final ImmutableList.Builder A07;
    public final Set A08;
    public final FbUserSession A09;
    public final ImmutableList.Builder A0A;
    public final ListenableFuture A0B;
    public final ListenableFuture A0C;
    public final ListenableFuture A0D;

    public Cd0(Context context, FbUserSession fbUserSession, DHX dhx, DJZ djz, C6r c6r, ImmutableList.Builder builder, ImmutableList.Builder builder2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, Set set) {
        this.A02 = context;
        this.A04 = dhx;
        this.A05 = djz;
        this.A09 = fbUserSession;
        this.A08 = set;
        this.A0C = listenableFuture;
        this.A0D = listenableFuture2;
        this.A0B = listenableFuture3;
        this.A07 = builder;
        this.A0A = builder2;
        this.A06 = c6r;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[Catch: Exception -> 0x010d, all -> 0x0126, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x010d, blocks: (B:11:0x0069, B:12:0x006e, B:15:0x007a, B:18:0x0084, B:21:0x009d, B:23:0x00a7, B:24:0x00ad, B:25:0x00b3, B:26:0x00b9, B:27:0x00bf, B:28:0x00c5, B:30:0x00de, B:31:0x00e4, B:32:0x00e9, B:32:0x00e9, B:35:0x00f7, B:36:0x00fc, B:42:0x00f1, B:44:0x0091), top: B:10:0x0069, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1 A[Catch: Exception -> 0x010d, all -> 0x0126, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x010d, blocks: (B:11:0x0069, B:12:0x006e, B:15:0x007a, B:18:0x0084, B:21:0x009d, B:23:0x00a7, B:24:0x00ad, B:25:0x00b3, B:26:0x00b9, B:27:0x00bf, B:28:0x00c5, B:30:0x00de, B:31:0x00e4, B:32:0x00e9, B:32:0x00e9, B:35:0x00f7, B:36:0x00fc, B:42:0x00f1, B:44:0x0091), top: B:10:0x0069, outer: #3 }] */
    @Override // X.DGb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A7H() {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cd0.A7H():void");
    }

    @Override // X.DGb
    public void D1u(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A03;
        r0.A08("com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.interfaces.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "startLoadMore", A00);
        r0.A06("messaging.sharing.broadcastflow.mutation.loader.sectionsloader.BroadcastFlowSectionsLoaderInterfaceSpec", "startLoadMore", A00);
    }
}
