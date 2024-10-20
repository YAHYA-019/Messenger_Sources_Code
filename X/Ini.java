package X;

import android.content.res.Resources;
import android.graphics.Color;
import androidx.fragment.app.Fragment;
import com.bloks.components.bkcomponentsvideo.subtitle.BKBloksSubtitlePlugin;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mantle.logger.MantleLogger;
import com.facebook.messaging.media.mediapicker.dialog.PickMediaDialogFragment;
import com.facebook.messaging.media.viewer.fragment.MediaViewFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.neue.nux.profilepic.PartialNuxCameraFragment;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: Ini.class */
public final class Ini implements 1K9 {
    public final int A00;
    public final Object A01;

    public Ini(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static final int A00(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('#');
        String substring = str.substring(6);
        11T.A0A(substring);
        A0k.append(substring);
        return Color.parseColor(AnonymousClass001.A0d(7zM.A1C(0, 6, str), A0k));
    }

    public static Ini A01(Object obj, int i) {
        return new Ini(obj, i);
    }

    public static void A02(ListenableFuture listenableFuture, Object obj, int i) {
        1Kd.A0E(new Ini(obj, i), listenableFuture);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v308, types: [X.IoC, java.lang.Object] */
    public void onFailure(Throwable th) {
        Fragment fragment;
        String str;
        String str2;
        MediaViewFragment mediaViewFragment;
        C01s A09;
        String str3;
        String str4;
        String str5;
        Hip hip;
        Resources resources;
        int i;
        C01s A092;
        String str6;
        String str7;
        0DR r305;
        0DV r304;
        String str8;
        String str9;
        boolean z;
        switch (this.A00) {
            case 0:
                if (th instanceof CancellationException) {
                    return;
                }
                ((BKBloksSubtitlePlugin) this.A01).A0q(null);
                return;
            case 1:
                IPI ipi = (IPI) this.A01;
                ipi.A05.setException(th.getMessage());
                ipi.A08 = false;
                return;
            case 2:
                11T.A0F(th, 0);
                Hyq hyq = (Hyq) this.A01;
                Hyq.A00(hyq);
                hyq.A01.onFailure(th);
                return;
            case 3:
            case 4:
            case 19:
            case 22:
            case 34:
            case 36:
            case 37:
            case 38:
            case 39:
            case 41:
            case ActionId.UNKNOWN /* 51 */:
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
            default:
                return;
            case 5:
                IRw iRw = (IRw) this.A01;
                IoC ioC = (HZu) 1Br.A0B(((IRq) 1Br.A0B(iRw.A08)).A00);
                synchronized (ioC) {
                    try {
                        z = ((HZu) ioC).A00;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z) {
                    0fH.A0r("LivingRoomVideoStateObservable", "subscription failure", th);
                    IRx iRx = iRw.A05;
                    if (iRx.A07 != null) {
                        ioC = iRx.A08;
                        if (ioC != null) {
                            synchronized (ioC) {
                                ioC.A00 = null;
                            }
                        }
                        Ipf ipf = new Ipf(iRx);
                        ?? obj = new Object();
                        ((IoC) obj).A00 = ipf;
                        iRx.A08 = obj;
                        1Br.A0C(iRx.A04);
                        IoC ioC2 = iRx.A08;
                        if (ioC2 != null) {
                            7zP.A0N(iRx.A02).CY3(ioC2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                0fH.A0r("InlineReplyFragment", "Failed to copy media resource into local storage", th);
                fragment = (0D2) this.A01;
                C2121Dea c2121Dea = new C2121Dea(fragment.getContext());
                c2121Dea.A06(2131967616);
                c2121Dea.A05(2131967614);
                c2121Dea.A0E(IGS.A00(this, 0), 2131967615);
                c2121Dea.A0C(false);
                c2121Dea.A04();
                fragment.A0p();
                return;
            case 7:
                0fH.A0r("InlineReplyFragment", "Failed to add metadata to media resources", th);
                fragment = (0D2) this.A01;
                fragment.A0p();
                return;
            case 8:
                IDp iDp = (IDp) this.A01;
                iDp.A08.A01.A3R("acp_start_error");
                IDp.A00(iDp);
                iDp.A03 = null;
                IDp.A03(iDp, 0S2.A1G);
                IDp.A02(iDp);
                IDp.A03(iDp, 0S2.A01);
                return;
            case 9:
                str = "ManageMessagesFragmentPresenter";
                str2 = "Failed to get user from repository";
                0fH.A0u(str, str2, th);
                return;
            case 10:
                MantleLogger.log(HB3.A02, "runMantleWithConfigStr callback onFailure.");
                0fH.A0s("OdmlTaskMantleInitializer", "runMantleWithConfigStr callback onFailure.", th);
                return;
            case 11:
                11T.A0F(th, 0);
                ((1FX) this.A01).setException(th);
                return;
            case 12:
                11T.A0F(th, 0);
                GP5.A02(GOp.A0K(((IDT) this.A01).A08), "error_living_room", "end", th.toString(), null, null);
                return;
            case 13:
                0fH.A0z("EphemeralMediaViewerPhotoController", "Failed to get FbDraweeControllerBuilder from ImagePipelineWrapper. attachment fbid = ", th, new Object[]{((J0D) this.A01).A02.A02()});
                return;
            case 14:
                PickMediaDialogFragment.A07((PickMediaDialogFragment) this.A01);
                return;
            case 15:
                11T.A0F(th, 0);
                0fH.A0H(Hzu.class, "Failed to add meta data to media preview", th);
                Hzu.A00((Hzu) this.A01);
                return;
            case 16:
                mediaViewFragment = (MediaViewFragment) this.A01;
                A09 = 1BK.A09(mediaViewFragment.A11);
                str3 = "MediaViewFragment";
                str4 = "Could not save photo to storage for sharing";
                A09.softReport(str3, str4, th);
                GOo.A1K(AbF.A0v(mediaViewFragment.A1H), 2131956581);
                return;
            case 17:
                mediaViewFragment = (MediaViewFragment) this.A01;
                A09 = 1BK.A09(mediaViewFragment.A11);
                str3 = "MediaViewFragment";
                str4 = "Could not save video to storage for sharing";
                A09.softReport(str3, str4, th);
                GOo.A1K(AbF.A0v(mediaViewFragment.A1H), 2131956581);
                return;
            case 18:
                str5 = "com.facebook.messaging.montage.composer.CanvasOverlayWritingPrompt";
                0fH.A0k(str5, 1BJ.A00(733));
                return;
            case 20:
                hip = (Hip) this.A01;
                resources = hip.A02;
                i = 2131960644;
                AbstractC2327GOs.A0r(hip.A04, resources.getString(i));
                return;
            case 21:
                hip = (Hip) this.A01;
                resources = hip.A02;
                i = 2131960646;
                AbstractC2327GOs.A0r(hip.A04, resources.getString(i));
                return;
            case 23:
                11T.A0F(th, 0);
                0fH.A0r(4tA.A03, 1BJ.A00(721), th);
                return;
            case 24:
                0fH.A0r(C2403Gc5.__redex_internal_original_name, AbE.A00(279), th);
                IUq iUq = (IUq) this.A01;
                C2403Gc5 c2403Gc5 = (C2403Gc5) iUq.A01;
                ThreadKey threadKey = (ThreadKey) iUq.A02;
                JIa jIa = c2403Gc5.A05;
                if (jIa != null) {
                    jIa.CA1(threadKey);
                    return;
                }
                return;
            case 25:
                GoX goX = (GoX) this.A01;
                CallerContext callerContext = GoX.A0A;
                goX.A04.BrD(th);
                return;
            case 26:
                GoX goX2 = (GoX) this.A01;
                CallerContext callerContext2 = GoX.A0A;
                goX2.A03.CnF(-1);
                return;
            case 27:
                JIb jIb = ((Hpp) this.A01).A00;
                if (jIb != null) {
                    jIb.CFL();
                    return;
                }
                return;
            case 28:
                1BK.A09(((HgA) this.A01).A02).D0v("MontageInstagramStoryReplyHelper", 0Pz.A1B("Failed to mark read stories by GraphQL request. ", th));
                return;
            case 29:
                0fH.A0H(PartialNuxCameraFragment.class, "Error saving picture to file", th);
                A092 = 1BK.A09(((PartialNuxCameraFragment) this.A01).A0V);
                str6 = "partial_nux_camera_error_saving_file";
                str7 = "Probably not enough space to make a temp file";
                A092.softReport(str6, str7, th);
                return;
            case 30:
                str5 = "TextLayerPresenter";
                0fH.A0k(str5, 1BJ.A00(733));
                return;
            case 31:
            case 32:
                IER.A02((IER) this.A01);
                return;
            case 33:
                0fH.A0q("FastMessageReactionsPanelView", "Initializing Keyframes Cache failed.", th);
                return;
            case 35:
                11T.A0F(th, 0);
                4zI.A03.A02("RosterSheetPresenter", "Failed to get audio levels for conference call participants", th, new Object[0]);
                GpY gpY = (GpY) this.A01;
                ImmutableMap immutableMap = RegularImmutableMap.A03;
                11T.A0A(immutableMap);
                GpY.A09(gpY, immutableMap);
                return;
            case 40:
                ((HqH) this.A01).A02.get();
                return;
            case 42:
                I8o i8o = (I8o) this.A01;
                1Br.A0C(i8o.A02);
                JIj jIj = i8o.A0A;
                jIj.BOA("load_link_progress_fragment", 0S2.A01);
                jIj.finish();
                return;
            case 43:
                AbstractC2326GOr.A0U(th).A06("OrcaRsysSdk", "Failed to start a call via SDK", new Object[]{th});
                return;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                AbstractC2326GOr.A0U(th).A06("OrcaRsysSdk", "Failed to start session via SDK", new Object[]{th});
                r305 = (0DR) this.A01;
                r304 = null;
                r305.resumeWith(r304);
                return;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                0fH.A14("DeltaPageHMPSStateHandler", "fetchHMPSStatus onFailure: %s", 7zO.A1a(th));
                return;
            case 46:
                C2489Gek c2489Gek = (C2489Gek) this.A01;
                c2489Gek.A03.setException(th);
                C4Dk c4Dk = c2489Gek.A02;
                1G2 r0 = C4Dk.A0c;
                A092 = 1BK.A09(c4Dk.A0C);
                str6 = AbstractC00603o4.A00(374);
                str7 = "handleIntentImpl failed";
                A092.softReport(str6, str7, th);
                return;
            case ActionId.ON_START_END /* 47 */:
                11T.A0F(th, 0);
                4zI.A03.A06("CryptoFetchThreadImpl", "Failed to convert thread id to threadpk", new Object[0]);
                throw new RuntimeException("Error while getting thread for participants", th);
            case ActionId.QUEUED /* 48 */:
                JOY.A03((IRF) this.A01).ARr("accept_call_with_video_permission_declined_failure");
                return;
            case ActionId.IN_PROGRESS /* 49 */:
                11T.A0F(th, 0);
                r305 = (0DR) this.A01;
                r304 = new 0DV(th);
                r305.resumeWith(r304);
                return;
            case 50:
                ((Function1) this.A01).invoke(1BK.A0d());
                return;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                11T.A0F(th, 0);
                str8 = "FavoriteStickerGridPageViews";
                str9 = "Fetching favorites failed";
                0fH.A0v(str8, str9, th);
                return;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                11T.A0F(th, 0);
                str8 = "GeneratedStickerGridPageViews";
                str9 = "Fetching user generated stickers failed";
                0fH.A0v(str8, str9, th);
                return;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                str = "BlurThreadTileView";
                str2 = "Problem when blurring background image";
                0fH.A0u(str, str2, th);
                return;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 6712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ini.onSuccess(java.lang.Object):void");
    }
}
