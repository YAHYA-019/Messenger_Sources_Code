package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.executor.OfflineMutationsManager;
import com.facebook.mantle.logger.MantleLogger;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.messaging.montage.viewer.replystatus.MontageViewerReplyStatusView;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.messaging.threadview.attachment.image.ThreadViewImageAttachmentView;
import com.facebook.native_bridge.NativeDataPromise;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback;
import com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;
import com.facebook.stickers.model.Sticker;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.Arrays;

/* loaded from: Inf.class */
public final class Inf implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Inf(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static Inf A00(Object obj, Object obj2, int i) {
        return new Inf(obj, obj2, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        Class cls;
        IQ1 iq1;
        int i;
        long j;
        int A0V;
        StickerGridView stickerGridView;
        switch (this.A00) {
            case 0:
                ((NativeDataPromise) this.A02).setException(th.toString());
                return;
            case 1:
                11T.A0F(th, 0);
                ((1K9) this.A01).onFailure(th);
                return;
            case 2:
                OfflineMutationsManager offlineMutationsManager = (OfflineMutationsManager) this.A01;
                offlineMutationsManager.A0A.set(false);
                ((C49f) this.A02).C2v(7zM.A1b(offlineMutationsManager.A06.A02()));
                0fH.A0L(OfflineMutationsManager.class, "Unexpected failure during retry", th);
                return;
            case 3:
                11T.A0F(th, 0);
                ((1FX) this.A01).set(new 8Lq((String) null, "Fail", GOo.A10("SmartReply runMantleWithConfigStr callback onFailure: %s", Arrays.copyOf(7zO.A1a(th), 1)), C0ty.A00, 1));
                MantleLogger.log(HB3.A02, "SmartReply runMantleWithConfigStr callback onFailure.");
                0fH.A0s("MantleSmartReplies", "SmartReply runMantleWithConfigStr callback onFailure.", th);
                return;
            case 4:
                0fH.A0s("OdmlTaskPpmlInitializer", "Failed to load PyTorch native libraries!", th);
                return;
            case 5:
            case 6:
            case 24:
            case 25:
            case 28:
            case 39:
            default:
                return;
            case 7:
                11T.A0F(th, 0);
                0fH.A0N(HqU.class, "Failed to get response for thread: %s", th, 1BK.A1Z(((ThreadKey) this.A01).A0r()));
                return;
            case 8:
                ((JIP) this.A02).onFailure(th);
                return;
            case 9:
                1BK.A09(((Hsg) this.A01).A01).softReport("failed_video_length_retrieval", "Failed to get meta data for video", th);
                return;
            case 10:
            case 11:
                ((MIN) this.A02).D2v();
                return;
            case 12:
                0fH.A0p("SharedMediaLoader", 7zK.A00(ActionId.DISPLAYED), th);
                return;
            case 13:
                11T.A0F(th, 0);
                CallerContext callerContext = H5u.A0J;
                0fH.A0z(H5u.__redex_internal_original_name, "Failed to get FbDraweeControllerBuilder from ImagePipelineWrapper. Image=%s", th, new Object[]{((MediaMessageItem) this.A01).AqA()});
                QuickPerformanceLogger quickPerformanceLogger = ((H5u) this.A02).A0G;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerEnd(872953662, (short) 3);
                    return;
                }
                return;
            case 14:
                0fH.A0r("MontageArchiveDeletionMutationHelper", " delete failed ", th);
                AbstractC2326GOr.A1I(AbF.A0v(((Hfw) this.A01).A02), 2131960450);
                return;
            case 15:
                iq1 = (IQ1) this.A01;
                i = 2131960636;
                CallerContext callerContext2 = IQ1.A1m;
                AbG.A0B(iq1.A0N).CY3(new IwJ(iq1, i));
                return;
            case 16:
                iq1 = ((IDk) this.A01).A00;
                i = 2131960635;
                CallerContext callerContext22 = IQ1.A1m;
                AbG.A0B(iq1.A0N).CY3(new IwJ(iq1, i));
                return;
            case 17:
                0fH.A0r("MontageComposerController", "Failed to retrieve bitmap from uri", th);
                iq1 = ((IDk) this.A01).A00;
                i = 2131960615;
                CallerContext callerContext222 = IQ1.A1m;
                AbG.A0B(iq1.A0N).CY3(new IwJ(iq1, i));
                return;
            case 18:
                ((H51) this.A02).A0V(HAR.A06);
                return;
            case 19:
                Hy7 hy7 = (Hy7) this.A02;
                Hy7.A00(hy7.A00, hy7, (EffectItem) this.A01, false);
                return;
            case 20:
                IWQ iwq = (IWQ) this.A02;
                FbUserSession fbUserSession = iwq.A02;
                EffectItem effectItem = (EffectItem) this.A01;
                IWQ.A00(iwq).setVisibility(0);
                ((C2778Gnv) 1Lm.A05(iwq.A01, fbUserSession, 115493)).A06(null, new IW1(iwq, 1), effectItem, false);
                return;
            case 21:
                IWi.A04((IWi) this.A02);
                2EU.A04((2EU) this.A01);
                return;
            case 22:
                11T.A0F(th, 0);
                1Br.A04(((Hg0) this.A02).A01).D0v("MentionUntagGraphQLHelper", 0Pz.A1B("Failed to untag self from mention story. ", th));
                return;
            case 23:
                MontageViewerFragment montageViewerFragment = (MontageViewerFragment) this.A01;
                ((MontageViewerReplyStatusView) montageViewerFragment.A0T.A01()).A0E();
                GOo.A1K(AbF.A0v(montageViewerFragment.A1B), 2131967253);
                return;
            case 26:
                0fH.A0r("MontageCardConverter", "Error querying feedback overlay for self montage buckket", th);
                return;
            case 27:
                ((HmO) this.A02).A00(th);
                return;
            case 29:
                11T.A0F(th, 0);
                JNp jNp = (IYQ) this.A02;
                ((IYQ) jNp).A01 = 0S2.A00;
                ((JIe) this.A01).Bui(jNp, th);
                return;
            case 30:
                11T.A0F(th, 0);
                IF3 if3 = (IF3) this.A02;
                IF3.A00(if3).A02("camera_start_failure", th.toString());
                HV2 hv2 = if3.A01;
                if (hv2 == null) {
                    11T.A0L("stateUpdateDelegate");
                    throw 0Q8.createAndThrow();
                }
                hv2.A00.A0D(th);
                return;
            case 31:
                CP1 cp1 = (CP1) this.A01;
                GOn.A0t(cp1.A0B).A0G(false);
                ((IFc) cp1.A04.get()).A0H(((VideoChatLink) this.A02).A0T, th.getMessage());
                return;
            case 32:
                11T.A0F(th, 0);
                4zJ r0 = 4zI.A03;
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Could not load thread tile for user ");
                r0.A03("AudioParticipantRsysPresenter", AnonymousClass001.A0a(((8Lr) this.A01).A00, A0k), th, new Object[0]);
                return;
            case 33:
                11T.A0F(th, 0);
                4zI.A03.A02("LiveVideoStoreImpl", "Could not create video", th, new Object[0]);
                Gxd gxd = (Gxd) this.A02;
                ((CJA) 1Br.A0B(gxd.A09)).A03(BLd.A02);
                IFc.A06(AbM.A0b(gxd.A0C), "live_video_create_fail");
                LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback = (LiveVideoBroadcastLifecycleCallback) this.A01;
                if (liveVideoBroadcastLifecycleCallback != null) {
                    liveVideoBroadcastLifecycleCallback.roomsBroadcastCreated(false);
                }
                gxd.A01 = null;
                return;
            case 34:
                11T.A0F(th, 0);
                4zI.A03.A02("LiveVideoStoreImpl", "Could not start broadcast", th, new Object[0]);
                Gxd gxd2 = (Gxd) this.A02;
                ((CJA) 1Br.A0B(gxd2.A09)).A03(BLd.A0A);
                IFc.A06(AbM.A0b(gxd2.A0C), "live_stream_start_fail");
                LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback2 = (LiveVideoBroadcastLifecycleCallback) this.A01;
                if (liveVideoBroadcastLifecycleCallback2 != null) {
                    liveVideoBroadcastLifecycleCallback2.roomsBroadcastStarted(false);
                }
                gxd2.A03 = null;
                return;
            case 35:
                CallerContext callerContext3 = ThreadViewImageAttachmentView.A0S;
                cls = ThreadViewImageAttachmentView.class;
                0fH.A0K(cls, "Thumbnail generation failure", th);
                return;
            case 36:
                cls = Hno.class;
                0fH.A0K(cls, "Thumbnail generation failure", th);
                return;
            case 37:
                11T.A0F(th, 0);
                4zI.A03.A06("CryptoFetchThreadImpl", "Failed to fetch threads for participants from MsysCryptoLookup.getThreadsForParticipants", new Object[0]);
                throw new RuntimeException("Error while getting thread for participants", th);
            case 38:
                11T.A0F(th, 0);
                0fH.A0v("GeneratedStickerSearchFragment", "Fetching user generated animated sticker failed", th);
                GeneratedStickerSearchFragment generatedStickerSearchFragment = (GeneratedStickerSearchFragment) this.A02;
                StickerGridView stickerGridView2 = generatedStickerSearchFragment.A0B;
                if (stickerGridView2 == null || (A0V = stickerGridView2.A0V(((Sticker) this.A01).A0F)) < 0 || (stickerGridView = generatedStickerSearchFragment.A0B) == null) {
                    return;
                }
                stickerGridView.A0a(A0V, false);
                return;
            case 40:
                ((Hs5) this.A02).A00();
                return;
            case 41:
                IhA ihA = (JGd) this.A02;
                IFE ife = ihA.A00;
                ife.A09 = DKD.A11();
                IFE.A05(ife, ihA.A02);
                return;
            case 42:
                GQM gqm = (GQM) this.A01;
                GPs gPs = gqm.A01;
                1UG A08 = 1BK.A08(1BK.A07(gPs.A0U), "video_cdn_url_refresh_error");
                if (A08.isSampled()) {
                    PlayerOrigin B3c = gPs.B3c();
                    try {
                        j = Long.parseLong(gPs.A0D);
                    } catch (NumberFormatException unused) {
                        j = 0;
                    }
                    GOp.A1O(A08, j);
                    A08.A7R("reason", th.getMessage());
                    GPs.A01(A08, B3c, gPs, "video_url", GQM.A02(gqm));
                }
                gPs.A0C = null;
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:451:0x14c5, code lost:
    
        if (r0.screenShareAvailability != 0) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x1512, code lost:
    
        if (X.GOp.A0V(r0.A04).A06 != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x157a, code lost:
    
        if (r303 != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x157f, code lost:
    
        if (r342 == false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x163f, code lost:
    
        if (r0 != 4) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x1728, code lost:
    
        if (r303 == false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x1965, code lost:
    
        if (r0.A00 == false) goto L392;
     */
    /* JADX WARN: Type inference failed for: r0v1998, types: [java.lang.Object, X.Hff] */
    /* JADX WARN: Type inference failed for: r0v2170, types: [com.facebook.drawee.view.DraweeView, com.facebook.drawee.fbpipeline.FbDraweeView] */
    /* JADX WARN: Type inference failed for: r0v396, types: [com.facebook.messaging.montage.util.colors.MontageBackgroundColor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 9091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Inf.onSuccess(java.lang.Object):void");
    }
}
