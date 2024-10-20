package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.publicchats.mca.MailboxPublicChatsJNI;
import com.facebook.pushnotifications.mca.MailboxPushNotificationsJNI;
import com.facebook.qpdebugger.mca.MailboxQPDebuggerJNI;
import com.facebook.ranking.mca.MailboxRankingJNI;
import com.facebook.replyreminder.mca.MailboxReplyReminderJNI;
import com.facebook.rtc.mca.MailboxRTCJNI;
import com.facebook.search.mca.MailboxSearchJNI;
import com.facebook.searchaibots.mca.MailboxSearchAiBotsJNI;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;
import com.facebook.sharedalbum.mca.MailboxSharedAlbumJNI;
import com.facebook.sharing.mca.MailboxSharingJNI;
import com.facebook.shim.mca.MailboxShimJNI;
import com.facebook.status.mca.MailboxStatusJNI;
import com.facebook.stella.mca.MailboxStellaJNI;
import com.facebook.stellacutover.mca.MailboxStellaCutoverJNI;
import com.facebook.stellagroupthreads.mca.MailboxStellaGroupThreadsJNI;
import com.facebook.stories.mca.MailboxStoriesJNI;
import com.facebook.tam.mca.MailboxTamJNI;
import com.facebook.thread.mca.MailboxThreadJNI;
import com.facebook.threadbans.mca.MailboxThreadBansJNI;
import com.facebook.threadlist.mca.MailboxThreadListJNI;
import com.facebook.threadmembers.mca.MailboxThreadMembersJNI;
import com.facebook.userprefsbool.mca.MailboxUserPrefsBoolJNI;

/* loaded from: Czl.class */
public final class Czl implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public Czl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Czl A00(Object obj, int i) {
        return new Czl(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        Object obj;
        switch (this.A00) {
            case 0:
                return MailboxPublicChatsJNI.dispatchDasmOJOO(1, ((Czf) this.A01).A01, mailbox, sqliteHolder);
            case 1:
                Cy0 cy0 = (Cy0) this.A01;
                return MailboxPublicChatsJNI.dispatchDasmOJOOO(2, cy0.A01, cy0.A04, mailbox, sqliteHolder);
            case 2:
                CyD cyD = (CyD) this.A01;
                return MailboxPublicChatsJNI.dispatchDasmOJOOOO(3, cyD.A01, cyD.A05, null, mailbox, sqliteHolder);
            case 3:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(5, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 4:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(6, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 5:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(7, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 6:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(8, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 7:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(9, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 8:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(10, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 9:
                return MailboxPushNotificationsJNI.dispatchDasmOJOO(12, ((Czf) this.A01).A01, mailbox, sqliteHolder);
            case 10:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(13, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 11:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(14, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 12:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(16, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 13:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(17, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case 14:
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxPushNotificationsJNI.dispatchCqlOO(1, sqliteHolder);
                if (cQLResultSet != null) {
                    obj = new 1qX(cQLResultSet);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 15:
                CzV czV = (CzV) this.A01;
                return MailboxPushNotificationsJNI.dispatchDasmOIJOO(0, czV.A01, czV.A02, mailbox, sqliteHolder);
            case 16:
                return MailboxPushNotificationsJNI.dispatchDasmOIOO(1, ((Cxo) this.A01).A01, mailbox, sqliteHolder);
            case 17:
                return MailboxQPDebuggerJNI.dispatchCqlOJO(2, ((Czf) this.A01).A01, sqliteHolder);
            case 18:
                Cxt cxt = (Cxt) this.A01;
                return MailboxRankingJNI.dispatchDasmOIOOOOOOOOO(0, cxt.A00, null, null, null, null, null, cxt.A03, cxt.A04, mailbox, sqliteHolder);
            case 19:
                Cyc cyc = (Cyc) this.A01;
                return MailboxRankingJNI.dispatchDasmOOOOOOO(2, cyc.A04, cyc.A05, cyc.A06, null, mailbox, sqliteHolder);
            case 20:
                CyV cyV = (CyV) this.A01;
                Object[] objArr = (Object[]) MailboxReplyReminderJNI.dispatchCqlOIJJOO(2, cyV.A01, cyV.A03, cyV.A02, cyV.A06, sqliteHolder);
                return new CDZ((Number) objArr[2], (String) objArr[0], (String) objArr[1]);
            case 21:
                obj = MailboxReplyReminderJNI.dispatchCqlOJO(3, 86400L, sqliteHolder);
                return 7zL.A0s(obj);
            case 22:
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxRTCJNI.dispatchCqlOJO(1, ((Czh) this.A01).A01, sqliteHolder);
                if (cQLResultSet2 != null) {
                    obj = new 1qX(cQLResultSet2);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 23:
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxRTCJNI.dispatchCqlOJO(2, ((Cxl) this.A01).A01, sqliteHolder);
                if (cQLResultSet3 != null) {
                    obj = new 1qX(cQLResultSet3);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 24:
                return MailboxRTCJNI.dispatchDasmOJOO(0, ((Czh) this.A01).A01, mailbox, sqliteHolder);
            case 25:
                CQLResultSet cQLResultSet4 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOO(11, sqliteHolder);
                if (cQLResultSet4 != null) {
                    obj = new 1qX(cQLResultSet4);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 26:
                CQLResultSet cQLResultSet5 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOZ(12, ((Czi) this.A01).A02, sqliteHolder, false);
                if (cQLResultSet5 != null) {
                    obj = new 1qX(cQLResultSet5);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 27:
                Cyc cyc2 = (Cyc) this.A01;
                CQLResultSet cQLResultSet6 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOOO(15, cyc2.A05, cyc2.A04, cyc2.A06, sqliteHolder);
                if (cQLResultSet6 != null) {
                    obj = new 1qX(cQLResultSet6);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 28:
                CQLResultSet cQLResultSet7 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOO(22, ((Cxq) this.A01).A03, sqliteHolder);
                if (cQLResultSet7 != null) {
                    obj = new 1qX(cQLResultSet7);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 29:
                Cyb cyb = (Cyb) this.A01;
                CQLResultSet cQLResultSet8 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOIOOO(26, cyb.A01, cyb.A06, cyb.A05, sqliteHolder);
                if (cQLResultSet8 != null) {
                    obj = new 1qX(cQLResultSet8);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 30:
                Cy2 cy2 = (Cy2) this.A01;
                CQLResultSet cQLResultSet9 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOO(27, cy2.A04, cy2.A03, sqliteHolder);
                if (cQLResultSet9 != null) {
                    obj = new 1qX(cQLResultSet9);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 31:
                return MailboxSearchJNI.dispatchCqlOO(1, sqliteHolder);
            case 32:
                CQLResultSet cQLResultSet10 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOO(45, null, sqliteHolder);
                if (cQLResultSet10 != null) {
                    obj = new 1qX(cQLResultSet10);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 33:
                CQLResultSet cQLResultSet11 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOO(47, ((Czg) this.A01).A03, sqliteHolder);
                if (cQLResultSet11 != null) {
                    obj = new 1qX(cQLResultSet11);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 34:
                return MailboxSearchJNI.dispatchCqlOOO(48, mailbox, sqliteHolder);
            case 35:
                CQLResultSet cQLResultSet12 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOO(50, sqliteHolder);
                if (cQLResultSet12 != null) {
                    obj = new 1qX(cQLResultSet12);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 36:
                return MailboxSearchJNI.dispatchCqlOO(4, sqliteHolder);
            case 37:
                return MailboxSearchJNI.dispatchCqlOO(68, sqliteHolder);
            case 38:
                CQLResultSet cQLResultSet13 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOZZZ(70, ((Czi) this.A01).A03, sqliteHolder, false, true, false);
                if (cQLResultSet13 != null) {
                    obj = new 1qX(cQLResultSet13);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 39:
                return MailboxSearchJNI.dispatchDasmOOO(3, mailbox, sqliteHolder);
            case 40:
                return MailboxSearchJNI.dispatchDasmOIOO(4, ((Cxw) this.A01).A01, mailbox, sqliteHolder);
            case 41:
                Cy1 cy1 = (Cy1) this.A01;
                CQLResultSet cQLResultSet14 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOZ(7, cy1.A03, sqliteHolder, cy1.A04);
                if (cQLResultSet14 != null) {
                    obj = new 1qX(cQLResultSet14);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 42:
                Cyb cyb2 = (Cyb) this.A01;
                return MailboxSearchJNI.dispatchDasmOIOOOO(15, cyb2.A01, cyb2.A06, cyb2.A03, mailbox, sqliteHolder);
            case 43:
                CQLResultSet cQLResultSet15 = (CQLResultSet) MailboxSearchAiBotsJNI.dispatchCqlOIO(0, ((Cxo) this.A01).A01, sqliteHolder);
                if (cQLResultSet15 != null) {
                    obj = new 1qX(cQLResultSet15);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                CQLResultSet cQLResultSet16 = (CQLResultSet) MailboxSearchAiBotsJNI.dispatchCqlOIO(1, ((Cxo) this.A01).A01, sqliteHolder);
                if (cQLResultSet16 != null) {
                    obj = new 1qX(cQLResultSet16);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                Czb czb = (Czb) this.A01;
                return MailboxSearchAiBotsJNI.dispatchDasmOIOOO(0, czb.A01, czb.A05, mailbox, sqliteHolder);
            case 46:
                Czh czh = (Czh) this.A01;
                CQLResultSet cQLResultSet17 = (CQLResultSet) MailboxSecureMessageJNI.dispatchCqlOJOOO(1, czh.A01, czh.A03, null, sqliteHolder);
                if (cQLResultSet17 != null) {
                    obj = new 1qX(cQLResultSet17);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.ON_START_END /* 47 */:
                CQLResultSet cQLResultSet18 = (CQLResultSet) MailboxSecureMessageJNI.dispatchCqlOOO(2, ((Cxq) this.A01).A03, sqliteHolder);
                if (cQLResultSet18 != null) {
                    obj = new 1qX(cQLResultSet18);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.QUEUED /* 48 */:
                Czh czh2 = (Czh) this.A01;
                CQLResultSet cQLResultSet19 = (CQLResultSet) MailboxSecureMessageJNI.dispatchCqlOJOO(3, czh2.A01, czh2.A03, sqliteHolder);
                if (cQLResultSet19 != null) {
                    obj = new 1qX(cQLResultSet19);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.IN_PROGRESS /* 49 */:
                CQLResultSet cQLResultSet20 = (CQLResultSet) MailboxSecureMessageJNI.dispatchCqlOJO(4, ((Czf) this.A01).A01, sqliteHolder);
                if (cQLResultSet20 != null) {
                    obj = new 1qX(cQLResultSet20);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 50:
                CzZ czZ = (CzZ) this.A01;
                return MailboxSharedAlbumJNI.dispatchDasmOJJOOO(1, czZ.A02, czZ.A01, czZ.A04, mailbox, sqliteHolder);
            case ActionId.UNKNOWN /* 51 */:
                CzZ czZ2 = (CzZ) this.A01;
                obj = MailboxSharedAlbumJNI.dispatchDasmOJJOOOO(6, czZ2.A01, czZ2.A02, "", czZ2.A04, mailbox, sqliteHolder);
                return 7zL.A0s(obj);
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                CzX czX = (CzX) this.A01;
                return MailboxSharingJNI.dispatchDasmOIOOO(2, czX.A01, czX.A04, mailbox, sqliteHolder);
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return MailboxSharingJNI.dispatchDasmOIOOO(3, ((CzW) this.A01).A01, null, mailbox, sqliteHolder);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                CQLResultSet cQLResultSet21 = (CQLResultSet) MailboxSharingJNI.dispatchCqlOOO(5, ((Czg) this.A01).A03, sqliteHolder);
                if (cQLResultSet21 != null) {
                    obj = new 1qX(cQLResultSet21);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                CzX czX2 = (CzX) this.A01;
                return MailboxSharingJNI.dispatchDasmOIOOO(0, czX2.A01, czX2.A04, mailbox, sqliteHolder);
            case ActionId.QUEUEING_FAIL /* 56 */:
                CyF cyF = (CyF) this.A01;
                obj = MailboxShimJNI.dispatchCqlOJOOO(0, cyF.A01, cyF.A04, cyF.A05, sqliteHolder);
                return 7zL.A0s(obj);
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                CyK cyK = (CyK) this.A01;
                Object[] objArr2 = (Object[]) MailboxShimJNI.dispatchCqlOOOOZZZ(40, cyK.A03, cyK.A02, sqliteHolder, cyK.A04, false, cyK.A05);
                return new CCt((String) objArr2[1], (Number) objArr2[0]);
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                obj = MailboxShimJNI.dispatchCqlOIOZ(41, 0, sqliteHolder, true);
                return 7zL.A0s(obj);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                CzY czY = (CzY) this.A01;
                CQLResultSet cQLResultSet22 = (CQLResultSet) MailboxStatusJNI.dispatchCqlOJJJJO(21, czY.A01, czY.A03, czY.A02, 58, sqliteHolder);
                if (cQLResultSet22 != null) {
                    obj = new 1qX(cQLResultSet22);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                Cyn cyn = (Cyn) this.A01;
                return MailboxStatusJNI.dispatchDasmOIOOOOOO(0, cyn.A01, cyn.A06, cyn.A08, cyn.A07, cyn.A04, mailbox, sqliteHolder);
            case ActionId.COUNTER /* 61 */:
                Cza cza = (Cza) this.A01;
                return MailboxStatusJNI.dispatchDasmOIJOOO(4, cza.A01, cza.A02, cza.A05, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                CQLResultSet cQLResultSet23 = (CQLResultSet) MailboxStellaJNI.dispatchCqlOJO(2, ((Czf) this.A01).A01, sqliteHolder);
                if (cQLResultSet23 != null) {
                    obj = new 1qX(cQLResultSet23);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 63:
                CQLResultSet cQLResultSet24 = (CQLResultSet) MailboxStellaCutoverJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet24 != null) {
                    obj = new 1qX(cQLResultSet24);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case 64:
                CQLResultSet cQLResultSet25 = (CQLResultSet) MailboxStellaCutoverJNI.dispatchCqlOO(1, sqliteHolder);
                if (cQLResultSet25 != null) {
                    obj = new 1qX(cQLResultSet25);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                CQLResultSet cQLResultSet26 = (CQLResultSet) MailboxStellaGroupThreadsJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet26 != null) {
                    obj = new 1qX(cQLResultSet26);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                CzU czU = (CzU) this.A01;
                return MailboxStoriesJNI.dispatchDasmOJJOO(3, czU.A01, czU.A02, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return MailboxStoriesJNI.dispatchDasmOOOZ(5, mailbox, sqliteHolder, ((Cxp) this.A01).A03);
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                CQLResultSet cQLResultSet27 = (CQLResultSet) MailboxStoriesJNI.dispatchCqlOIOO(7, ((Cxo) this.A01).A01, null, sqliteHolder);
                if (cQLResultSet27 != null) {
                    obj = new 1qX(cQLResultSet27);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                CyA cyA = (CyA) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(11, cyA.A02, cyA.A05, sqliteHolder);
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                CyA cyA2 = (CyA) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(12, cyA2.A02, cyA2.A05, sqliteHolder);
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                Cy8 cy8 = (Cy8) this.A01;
                return MailboxTamJNI.dispatchCqlOIJO(13, cy8.A01, cy8.A03, sqliteHolder);
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                Cy8 cy82 = (Cy8) this.A01;
                obj = MailboxTamJNI.dispatchCqlOIJO(21, cy82.A01, cy82.A03, sqliteHolder);
                return 7zL.A0s(obj);
            case ActionId.INTENT_MAPPED /* 73 */:
                CyS cyS = (CyS) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(22, cyS.A02, cyS.A06, sqliteHolder);
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                Cy8 cy83 = (Cy8) this.A01;
                return MailboxTamJNI.dispatchCqlOIJO(23, cy83.A01, cy83.A03, sqliteHolder);
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                Cza cza2 = (Cza) this.A01;
                return MailboxTamJNI.dispatchCqlOJOOZ(24, cza2.A02, cza2.A05, sqliteHolder, false);
            case ActionId.ACTIVITY_STARTED /* 76 */:
                Cy9 cy9 = (Cy9) this.A01;
                return MailboxTamJNI.dispatchCqlOJOZ(27, cy9.A02, sqliteHolder, cy9.A05);
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                return MailboxTamJNI.dispatchCqlOJO(30, ((CyA) this.A01).A02, sqliteHolder);
            case ActionId.FRAGMENT_CREATED /* 78 */:
                Cy8 cy84 = (Cy8) this.A01;
                return MailboxTamJNI.dispatchCqlOIJO(2, cy84.A02, cy84.A03, sqliteHolder);
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                return MailboxTamJNI.dispatchCqlOOZ(40, sqliteHolder, ((Cxy) this.A01).A04);
            case 80:
                return MailboxTamJNI.dispatchCqlOJO(42, ((CzV) this.A01).A02, sqliteHolder);
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                CQLResultSet cQLResultSet28 = (CQLResultSet) MailboxTamJNI.dispatchCqlOO(44, sqliteHolder);
                if (cQLResultSet28 != null) {
                    obj = new 1qX(cQLResultSet28);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                CyZ cyZ = (CyZ) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(45, cyZ.A02, cyZ.A06, sqliteHolder);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                CyZ cyZ2 = (CyZ) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(47, cyZ2.A02, cyZ2.A06, sqliteHolder);
            case ActionId.MARKER_SWAPPED /* 84 */:
                obj = MailboxTamJNI.dispatchCqlOJO(50, ((CzV) this.A01).A02, sqliteHolder);
                return 7zL.A0s(obj);
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                return MailboxTamJNI.dispatchCqlOO(51, sqliteHolder);
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                obj = MailboxTamJNI.dispatchCqlOJO(4, ((CyA) this.A01).A02, sqliteHolder);
                return 7zL.A0s(obj);
            case ActionId.ERROR /* 87 */:
                obj = MailboxTamJNI.dispatchCqlOO(59, sqliteHolder);
                return 7zL.A0s(obj);
            case ActionId.METHOD_INVOKE /* 88 */:
                CQLResultSet cQLResultSet29 = (CQLResultSet) MailboxTamJNI.dispatchCqlOOOO(60, ((Cxu) this.A01).A04, null, sqliteHolder);
                if (cQLResultSet29 != null) {
                    obj = new 1qX(cQLResultSet29);
                    return 7zL.A0s(obj);
                }
                obj = null;
                return 7zL.A0s(obj);
            case ActionId.FINALLY /* 89 */:
                return MailboxTamJNI.dispatchCqlOO(64, sqliteHolder);
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                Cy9 cy92 = (Cy9) this.A01;
                return MailboxTamJNI.dispatchCqlOJOZ(65, cy92.A02, sqliteHolder, cy92.A05);
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                obj = MailboxTamJNI.dispatchCqlOO(70, sqliteHolder);
                return 7zL.A0s(obj);
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                Cza cza3 = (Cza) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(73, cza3.A02, cza3.A05, sqliteHolder);
            case ActionId.ANIMATION_END /* 93 */:
                Cza cza4 = (Cza) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(75, cza4.A02, cza4.A05, sqliteHolder);
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                return MailboxTamJNI.dispatchCqlOJO(78, ((CzV) this.A01).A02, sqliteHolder);
            case ActionId.MAIN_COMPLETE /* 95 */:
                return MailboxThreadJNI.dispatchDasmOJOO(0, ((Czf) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.INTERRUPTED /* 96 */:
                CzZ czZ3 = (CzZ) this.A01;
                return MailboxThreadBansJNI.dispatchDasmOJJOO(0, czZ3.A02, czZ3.A01, mailbox, sqliteHolder);
            case ActionId.NETWORK_FAILED /* 97 */:
                CzZ czZ4 = (CzZ) this.A01;
                return MailboxThreadBansJNI.dispatchDasmOJJOO(2, czZ4.A02, czZ4.A01, mailbox, sqliteHolder);
            case ActionId.NETWORK_RESPONSE /* 98 */:
                obj = MailboxThreadListJNI.dispatchCqlOO(0, sqliteHolder);
                return 7zL.A0s(obj);
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                CyD cyD2 = (CyD) this.A01;
                return MailboxThreadMembersJNI.dispatchDasmOJOOO(0, cyD2.A01, cyD2.A05, mailbox, sqliteHolder);
            default:
                Cy1 cy12 = (Cy1) this.A01;
                return MailboxUserPrefsBoolJNI.dispatchDasmOOOOZ(0, cy12.A03, mailbox, sqliteHolder, cy12.A04);
        }
    }
}
