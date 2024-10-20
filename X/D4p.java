package X;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.lifecycle.MutableLiveData;
import com.facebook.acra.constants.ActionId;
import com.facebook.advancedcryptotransport.model.PeerDevice;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messaging.graph.plugins.sharecontact.xmactahandler.viewprofilectahandler.ShareContactViewProfileCtaHandler;
import com.facebook.messaging.invites.InviteLinkActivity;
import com.facebook.messaging.media.send.MediaMessageFactory;
import com.facebook.messaging.neue.contactpicker.broadcastsection.ContactPickerBroadcastSection;
import com.facebook.messaging.neue.contactpicker.loader.serverside.NeueContactPickerRemoteThreadsLoader;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.user.model.User;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* loaded from: D4p.class */
public final class D4p implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public D4p(PeerDevice peerDevice, AfZ afZ, int i) {
        this.A00 = i;
        if (47 - i != 0) {
            this.A01 = peerDevice;
            this.A02 = afZ;
        } else {
            this.A02 = afZ;
            this.A01 = peerDevice;
        }
    }

    public D4p(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static D4p A00(Object obj, Object obj2, int i) {
        return new D4p(obj, obj2, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v90, types: [X.BwC, java.lang.Object] */
    public void onFailure(Throwable th) {
        Context context;
        int i;
        B2c b2c;
        AtomicBoolean atomicBoolean;
        QuickPerformanceLogger A0e;
        int i2;
        Object obj;
        C2iw c2iw;
        SettableFuture settableFuture;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                ((Function1) this.A01).invoke(AnonymousClass001.A0Z(th, "Network error: ", AnonymousClass001.A0k()));
                return;
            case 1:
            case 4:
                b2c = (B2c) this.A01;
                AbI.A0Q(b2c).A0R(false);
                atomicBoolean = b2c.A0K;
                AbM.A1M(b2c, atomicBoolean);
                return;
            case 2:
                B2c.A08((C00i) this.A02, (B2c) this.A01);
                return;
            case 3:
                b2c = (B2c) this.A01;
                AbI.A0Q(b2c).A0A(BMG.A0h);
                atomicBoolean = b2c.A0L;
                AbM.A1M(b2c, atomicBoolean);
                return;
            case 5:
                CPg cPg = (CPg) this.A01;
                DJV.A00(cPg);
                AbM.A0P(cPg).A0M(BMG.A1X, th.getMessage(), cPg.A0C);
                return;
            case 6:
                DJV.A00((CPg) this.A01);
                return;
            case 7:
                CbN cbN = (CbN) this.A01;
                CallerContext callerContext = CbN.A08;
                AbF.A0V(cbN.A01).A0H(BMG.A3U, (String) null);
                return;
            case 8:
            case 11:
            case ActionId.IN_PROGRESS /* 49 */:
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                return;
            case 9:
                11T.A0F(th, 0);
                str = "AdvancedCryptoSessionRepository";
                str2 = "Failed to inject SecureMessageOverWAMailbox";
                0fH.A0r(str, str2, th);
                return;
            case 10:
                throw AnonymousClass001.A0N("should not reached");
            case 12:
                str = "SuggestedReplyConfigFetcher";
                str2 = "Failed to fetch suggested reply config";
                0fH.A0r(str, str2, th);
                return;
            case 13:
                0fH.A0j("CommunityBlockMemberConsistencyService", 0Pz.A0j("Failed to update ", AnonymousClass001.A03(this.A02) != 0 ? "UNBLOCK" : "BLOCK", " state"));
                return;
            case 14:
            case 15:
            case 16:
                C1x1 A0O = 7zP.A0O(((C5d) this.A02).A04);
                MutableLiveData mutableLiveData = (MutableLiveData) this.A01;
                ?? obj2 = new Object();
                ((BwC) obj2).A05 = false;
                ((BwC) obj2).A04 = true;
                AbH.A1N(mutableLiveData, A0O, (BwC) obj2);
                return;
            case 17:
            case 18:
                RL6 rl6 = (RL6) this.A02;
                7zP.A0e(rl6.A02.A00).markerEnd(rl6.A00, rl6.A01, (short) 3);
                return;
            case 19:
                A0e = 7zP.A0e(((AmI) this.A02).A0A);
                i2 = 1072839188;
                A0e.markerEnd(i2, (short) 3);
                CfG.A01(this.A01);
                return;
            case 20:
                A0e = 7zP.A0e(((C1553Al8) this.A02).A07);
                i2 = 1072839062;
                A0e.markerEnd(i2, (short) 3);
                CfG.A01(this.A01);
                return;
            case 21:
                str = "ThreadContextItemFetcher";
                str2 = "Can't fetch context items";
                0fH.A0r(str, str2, th);
                return;
            case 22:
                11T.A0F(th, 0);
                7zL.A1T(this.A01, th);
                return;
            case 23:
            case 24:
                ((1K9) this.A02).onFailure(th);
                return;
            case 25:
                ShareContactViewProfileCtaHandler.A00((ShareContactViewProfileCtaHandler) this.A02, (User) this.A01);
                return;
            case 26:
                0fH.A0o("ReportChatToGroupAdminMutator", "Report chat to fb group admin mutation fail.");
                C3u c3u = (C3u) ((BsW) this.A01).A02.get();
                Context context2 = (Context) this.A02;
                c3u.A00(context2, context2.getString(2131956686));
                return;
            case 27:
                0fH.A0o("ReportMessageToGroupAdminMutator", "Report message to fb group admin mutation fail.");
                context = (Context) this.A02;
                i = 2131956686;
                Toast.makeText(context, i, 1).show();
                return;
            case 28:
                CfG.A01(this.A02);
                AmK.A0A(((C5L) this.A01).A02.A00);
                return;
            case 29:
                ((DH1) this.A02).BxV();
                return;
            case 30:
                B7E b7e = ((Bfv) this.A02).A00;
                if (b7e.getContext() == null || b7e.A06.A0V.A0w()) {
                    return;
                }
                context = b7e.getContext();
                i = 2131957336;
                Toast.makeText(context, i, 1).show();
                return;
            case 31:
                11T.A0F(th, 0);
                0fH.A0s("MessengerInternalPresenceDebugActivity", "statusFetcher.fetchStatuses() failed", th);
                return;
            case 32:
                InviteLinkActivity inviteLinkActivity = (InviteLinkActivity) this.A01;
                AbM.A0k(((Intent) this.A02).getExtras(), "com.facebook.orca.notify.SECURE_VIEW", 603979776).BXk(inviteLinkActivity, 4YU.A0F("fb-messenger://threads"));
                inviteLinkActivity.finish();
                return;
            case 33:
                obj = this.A02;
                settableFuture = (1FX) obj;
                settableFuture.setException(th);
                return;
            case 34:
                ((1FX) this.A02).setException(ServiceException.A00(th));
                return;
            case 35:
            case 36:
                ((5fS) this.A02).onError(th);
                return;
            case 37:
                ((4fF) 1Br.A0B(((C3w) this.A02).A01)).A0G();
                1FX r0 = (1FX) this.A01;
                if (th == null) {
                    th = AbF.A1D("Error in graph service fetch");
                }
                r0.setException(th);
                return;
            case 38:
                11T.A0F(th, 0);
                MediaMessageFactory.A02((5Pz) this.A01, (MediaMessageFactory) this.A02, th);
                return;
            case 39:
                0fH.A0o(7zK.A00(201), "Failed to fetch hidden threads");
                return;
            case 40:
                2Pg r02 = (2Pg) this.A02;
                1G2 r03 = 1NK.A2b;
                2Pg.A05(r02.A0R(), r02, r03, 2Pg.A0E(r02, r03, true));
                return;
            case 41:
                Preconditions.checkState(false, "should not reached");
                throw 0Q8.createAndThrow();
            case 42:
            case 43:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
            case 46:
            case ActionId.ON_START_END /* 47 */:
            default:
                11T.A0F(th, 0);
                str = "SecurityAlertsViewModel";
                str2 = "Failed to inject SecureMessageOverWAMailbox";
                0fH.A0r(str, str2, th);
                return;
            case ActionId.QUEUED /* 48 */:
                11T.A0F(th, 0);
                str = "SecurityAlertsViewModel";
                str2 = "Failed to remove peer device";
                0fH.A0r(str, str2, th);
                return;
            case 50:
                0fH.A14("ProfileBadgeMessageRequestSummaryLoggerConditionalWorker", "Error with message request summary logger", new Object[]{th.getMessage()});
                return;
            case ActionId.UNKNOWN /* 51 */:
                Cbk cbk = (Cbk) this.A01;
                cbk.A02.D0v(Cbk.__redex_internal_original_name, "Failed to fetch PaymentEligibleContacts");
                2TV r04 = cbk.A00;
                if (r04 != null) {
                    r04.C47((Object) null, th);
                    return;
                }
                return;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                BxY bxY = (BxY) this.A01;
                bxY.A05.put(((ContactPickerBroadcastSection) this.A02).A01, ImmutableList.of());
                C00i c00i = bxY.A01;
                1BK.A09(c00i).D0v("BroadcastSectionsLoaderHandler", "Null rows results from loader");
                1BK.A09(c00i).softReport("BroadcastSectionsLoaderHandler", th);
                return;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                ((NeueContactPickerRemoteThreadsLoader) this.A01).A03.D1t(this.A02);
                return;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                D9B d9b = (D9B) this.A01;
                B7E b7e2 = d9b.A01;
                CIz cIz = d9b.A00;
                CfG.A01(this.A02);
                cIz.A04(ServiceException.A00(th));
                b7e2.A06.A0A = false;
                return;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                B7E b7e3 = (B7E) this.A01;
                Executor A1D = AbJ.A1D();
                A1D.execute(new D9B((CIz) 7zO.A0l(b7e3, 83458), b7e3, A1D));
                return;
            case ActionId.QUEUEING_FAIL /* 56 */:
                0fH.A0u("omni_picker", "Failed to fetch user from UserCache", th);
                C1557Alb.A0L((C1557Alb) this.A01, (User) this.A02);
                return;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                C5w c5w = (C5w) this.A02;
                AbN.A0Z(c5w.A05).A0A(c5w.A00, (Intent) this.A01);
                return;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                c2iw = (C2iw) ((66W) this.A02).A00;
                c2iw.getClass();
                B0z.A01(c2iw, null);
                return;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                4zI.A03.A02("Rooms2LiveHostHelper", "Could not fetch event target", th, AnonymousClass001.A1Z());
                ((CJA) this.A02).A03(BLd.A06);
                return;
            case ActionId.COUNTER /* 61 */:
                ((CJA) ((C00i) this.A02).get()).A06(true);
                return;
            case 63:
                c2iw = (C2iw) ((66W) this.A02).A00;
                B0z.A01(c2iw, null);
                return;
            case 64:
                0fH.A0z("VideoChatLinkStateSubscription", "Error on getting current state for link [%s]", th, new Object[]{((Bw9) this.A01).A04});
                return;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                ((C1a) this.A01).A00(C0ty.A00);
                return;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                11T.A0F(th, 0);
                obj = this.A01;
                settableFuture = (1FX) obj;
                settableFuture.setException(th);
                return;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                0fH.A0k("ThreadsFetcher", AnonymousClass001.A0Z(th, "msysShimLookupService.getThreadsForParticipantsAsync() failed: ", 7zO.A0x(th, 0)));
                1Br.A04(((CtH) this.A02).A03).D0v("ThreadsFetcher", "fail to retrieve tlc threadsummary");
                AbM.A1R(this.A01);
                return;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                ((1FX) this.A02).set(1BK.A0d());
                return;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                CMM.A01((Bhl) this.A02, (CMM) this.A01, 0S2.A00, th);
                return;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                ((RhC) this.A02).A06(th.getMessage());
                return;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                settableFuture = ((D4h) this.A01).A04;
                settableFuture.setException(th);
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x3173, code lost:
    
        if (r311.A00 == com.facebook.graphql.enums.GraphQLWorkForeignEntityType.FOREIGN) goto L864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x3191, code lost:
    
        if (r311.A00 == com.facebook.graphql.enums.GraphQLWorkForeignEntityType.LIMITED) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x3194, code lost:
    
        r365 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x3197, code lost:
    
        r0 = X.1BK.A0B(r0, X.2JX.class, 1090197788, -1905121802);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x31b0, code lost:
    
        if (r0 == null) goto L874;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x31b3, code lost:
    
        r369 = r0.A0r(1472962390);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x31c1, code lost:
    
        r332 = new com.facebook.user.model.WorkUserInfo(null, r366, r369, r367, r365);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x31e5, code lost:
    
        r369 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x317e, code lost:
    
        if (r311 != null) goto L866;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:787:0x18e6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x1185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x1a29 A[LOOP:15: B:794:0x1a1b->B:796:0x1a29, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v2473, types: [androidx.fragment.app.Fragment, X.Alb] */
    /* JADX WARN: Type inference failed for: r0v3304, types: [X.BwC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v472, types: [X.B2c, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v749, types: [androidx.fragment.app.Fragment, X.Al8] */
    /* JADX WARN: Type inference failed for: r0v964, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r334v6 */
    /* JADX WARN: Type inference failed for: r334v7 */
    /* JADX WARN: Type inference failed for: r334v8, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 14784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4p.onSuccess(java.lang.Object):void");
    }
}
