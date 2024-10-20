package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback;
import com.facebook.rsys.livevideo.gen.LiveVideoModel;
import com.facebook.rsys.livevideo.gen.LiveVideoStore;
import com.facebook.rsys.livevideo.gen.LiveVideoStoreHandler;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* loaded from: Gxd.class */
public final class Gxd extends LiveVideoStore {
    public LiveVideoStoreHandler A00;
    public ListenableFuture A01;
    public ListenableFuture A02;
    public ListenableFuture A03;
    public final Context A04;
    public final 1De A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final FbUserSession A0E;

    public Gxd(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A0D = 1Bu.A03(r0, 16428);
        this.A04 = 7zQ.A0I(r0);
        this.A08 = 1Bu.A03(r0, 116268);
        this.A06 = 7zM.A0R();
        FbUserSession A03 = 1Br.A03(this.A0D);
        this.A0E = A03;
        this.A0C = 1Lm.A03(A03, r0, 67965);
        this.A0A = 1Bq.A00(68474);
        this.A09 = 1Lm.A03(A03, r0, 84219);
        this.A07 = 1Lm.A03(A03, r0, 84176);
        this.A0B = GOn.A0g(A03, r0);
    }

    @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
    public void cancelCreatedNotStartedBroadcast(String str, String str2, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a8  */
    @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void createBroadcast(java.lang.String r302, java.lang.String r303, int r304, int r305, java.lang.String r306, java.util.ArrayList r307, java.lang.String r308, java.lang.String r309, java.util.ArrayList r310, com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback r311, boolean r312) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gxd.createBroadcast(java.lang.String, java.lang.String, int, int, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.util.ArrayList, com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback, boolean):void");
    }

    @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
    public void endBroadcast(String str, String str2, String str3, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback) {
        LiveVideoModel liveVideoModel = (LiveVideoModel) GOo.A0p(LiveVideoModel.CONVERTER, GOq.A0p(this.A0B));
        if (liveVideoModel != null) {
            Long l = liveVideoModel.broadcastId;
            String str4 = liveVideoModel.videoId;
            if (l != null && str4 != null) {
                Hs1 hs1 = (Hs1) 1Br.A0B(this.A0A);
                synchronized (hs1) {
                    C7z0 c7z0 = hs1.A00;
                    if (c7z0 != null) {
                        c7z0.BYH(AbE.A00(475));
                        hs1.A00 = null;
                    }
                    C47r A02 = ((C47j) 1Br.A0B(hs1.A02)).A02(59708352);
                    hs1.A00 = A02;
                    if (A02.BU8(true)) {
                        C7z0 c7z02 = hs1.A00;
                        if (c7z02 != null) {
                            c7z02.A6Y("end_broadcast");
                        }
                    }
                }
                GraphQlQueryParamSet A0M = 7zL.A0M();
                4YV.A1A(4YU.A0J(GraphQlCallInput.A02, str4, TraceFieldType.VideoId), A0M, "data");
                5Dh A00 = 5Dh.A00(A0M, new C01643sd(C2574Ghn.class, "Rooms2LiveStreamEndMutation", null, "data", "fbandroid", 1722347, 192, 1170648238L, 1170648238L, false, true));
                ((CJA) 1Br.A0B(this.A09)).A03(BLd.A04);
                ListenableFuture A0z = AbK.A0z(1VX.A04(this.A04, AbK.A0D(this.A05.A00)), A00, 251839919177629L);
                this.A02 = A0z;
                1Br.A0D(this.A06, new InK(liveVideoBroadcastLifecycleCallback, this, str4, 0), A0z);
                return;
            }
        }
        ListenableFuture listenableFuture = this.A01;
        if (listenableFuture != null && listenableFuture.isDone()) {
            listenableFuture.cancel(true);
        }
        ListenableFuture listenableFuture2 = this.A03;
        if (listenableFuture2 != null && listenableFuture2.isDone()) {
            listenableFuture2.cancel(true);
        }
        LiveVideoStoreHandler liveVideoStoreHandler = this.A00;
        if (liveVideoStoreHandler != null) {
            liveVideoStoreHandler.roomsBroadcastDataLoaded(0L, null, 0, null, null);
        }
        this.A01 = null;
        this.A03 = null;
        1Br r0 = this.A09;
        ((CJA) 1Br.A0B(r0)).A03(BLd.A08);
        I5k.A00(GOp.A0X(this.A07));
        ((CJA) 1Br.A0B(r0)).A05(true);
        Hs1 hs12 = (Hs1) 1Br.A0B(this.A0A);
        synchronized (hs12) {
            C7z0 c7z03 = hs12.A01;
            if (c7z03 != null) {
                c7z03.BYH("cancel_from_ui");
                hs12.A01 = null;
            }
        }
    }

    @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
    public void setHandler(LiveVideoStoreHandler liveVideoStoreHandler) {
        11T.A0F(liveVideoStoreHandler, 0);
        this.A00 = liveVideoStoreHandler;
    }

    @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
    public void startBroadcast(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, boolean z, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback) {
        11T.A0G(str2, 1, arrayList);
        LiveVideoModel liveVideoModel = (LiveVideoModel) GOo.A0p(LiveVideoModel.CONVERTER, GOq.A0p(this.A0B));
        String str4 = liveVideoModel != null ? liveVideoModel.videoId : null;
        GraphQlQueryParamSet A0M = 7zL.A0M();
        DgU dgU = new DgU(25);
        dgU.A09("server_info_data", str2);
        dgU.A09(TraceFieldType.VideoId, str4);
        dgU.A0A("participant_ids", arrayList);
        dgU.A06("use_state_sync_for_layout", true);
        A0M.A01(dgU, "data");
        ListenableFuture A0z = AbK.A0z(1VX.A04(this.A04, AbK.A0D(this.A05.A00)), 5Dh.A00(A0M, new C01643sd(C2573Ghm.class, "Rooms2LiveStartMutation", null, "data", "fbandroid", -1298177039, 192, 1189004526L, 1189004526L, false, true)), 251839919177629L);
        this.A03 = A0z;
        1Br.A0D(this.A06, Inf.A00(this, liveVideoBroadcastLifecycleCallback, 34), A0z);
    }

    @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
    public void startObservingLiveStreamMetadata(String str) {
    }

    @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
    public void startObservingRoomBroadcast(String str) {
    }

    @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
    public void stopObservingLiveStreamMetadata() {
    }

    @Override // com.facebook.rsys.livevideo.gen.LiveVideoStore
    public void stopObservingRoomBroadcast() {
    }
}
