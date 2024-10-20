package X;

import com.facebook.accountsyncedfields.mca.MailboxAccountSyncedFieldsJNI;
import com.facebook.acra.constants.ActionId;
import com.facebook.advancedcryptostaging.mca.MailboxAdvancedCryptoStagingJNI;
import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.aibots.mca.MailboxAIBotsJNI;
import com.facebook.attachments.mca.MailboxAttachmentsJNI;
import com.facebook.avatarartifacto.mca.MailboxAvatarArtifactoJNI;
import com.facebook.avatarsinfo.mca.MailboxAvatarsInfoJNI;
import com.facebook.broadcastflow.mca.MailboxBroadcastFlowJNI;
import com.facebook.businessinbox.mca.MailboxBusinessInboxJNI;
import com.facebook.colorfiltersettings.mca.MailboxColorFilterSettingsJNI;
import com.facebook.community.mca.MailboxCommunityJNI;
import com.facebook.communitymessagingpresence.mca.MailboxCommunityMessagingPresenceJNI;
import com.facebook.communitymessagingsearch.mca.MailboxCommunityMessagingSearchJNI;
import com.facebook.composermenu.mca.MailboxComposerMenuJNI;
import com.facebook.cutover.mca.MailboxCutoverJNI;
import com.facebook.cutoverinternal.mca.MailboxCutoverInternalJNI;
import com.facebook.e2eexmareceiverfetch.mca.MailboxE2EEXmaReceiverFetchJNI;
import com.facebook.filteredthreadsranges.mca.MailboxFilteredThreadsRangesJNI;
import com.facebook.forwardratelimit.mca.MailboxForwardRateLimitJNI;
import com.facebook.frx.mca.MailboxFRXJNI;
import com.facebook.gamesbotthread.mca.MailboxGamesBotThreadJNI;
import com.facebook.grouplinks.mca.MailboxGroupLinksJNI;
import com.facebook.groupthread.mca.MailboxGroupThreadJNI;
import com.facebook.ignoremessages.mca.MailboxIgnoreMessagesJNI;
import com.facebook.inboxfolders.mca.MailboxInboxFoldersJNI;
import com.facebook.integrityblock.mca.MailboxIntegrityBlockJNI;
import com.facebook.magicwords.mca.MailboxMagicWordsJNI;
import com.facebook.mediareceiverfetch.mca.MailboxMediaReceiverFetchJNI;
import com.facebook.memberrequests.mca.MailboxMemberRequestsJNI;
import com.facebook.messagerequest.mca.MailboxMessageRequestJNI;
import com.facebook.messagerequestssdk.mca.MailboxMessageRequestsSDKJNI;
import com.facebook.messengershoppingcartstatus.mca.MailboxMessengerShoppingCartStatusJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.notificationsettings.mca.MailboxNotificationSettingsJNI;
import com.facebook.orca.mca.MailboxOrcaJNI;
import com.facebook.orcacontactlist.mca.MailboxOrcaContactListJNI;
import com.facebook.parentthreadutil.mca.MailboxParentThreadUtilJNI;
import com.facebook.payments.mca.MailboxPaymentsJNI;
import com.facebook.pinnedthreads.mca.MailboxPinnedThreadsJNI;
import com.facebook.polls.mca.MailboxPollsJNI;
import com.facebook.proactivewarningsnoncore.mca.MailboxProactiveWarningsNonCoreJNI;
import com.facebook.profilesheet.mca.MailboxProfileSheetJNI;
import com.facebook.publicchats.mca.MailboxPublicChatsJNI;

/* loaded from: Czm.class */
public final class Czm implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public Czm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static long A00(Czm czm) {
        return ((Czh) czm.A01).A01;
    }

    public static long A01(Czm czm) {
        return ((Czf) czm.A01).A01;
    }

    public static Czm A02(Object obj, int i) {
        return new Czm(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        Object dispatchCqlOJOO;
        switch (this.A00) {
            case 0:
                return MailboxAccountSyncedFieldsJNI.dispatchDasmOOO(0, mailbox, sqliteHolder);
            case 1:
                CyD cyD = (CyD) this.A01;
                dispatchCqlOJOO = MailboxAdvancedCryptoStagingJNI.dispatchCqlOJOO(0, cyD.A01, cyD.A05, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 2:
                CzV czV = (CzV) this.A01;
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxAdvancedCryptoTransportJNI.dispatchCqlOIIJO(11, 3, czV.A01, czV.A02, sqliteHolder);
                if (cQLResultSet != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 3:
                dispatchCqlOJOO = MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJO(14, 3, ((Czf) this.A01).A01, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 4:
                Czh czh = (Czh) this.A01;
                return MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJOO(15, 3, czh.A01, czh.A03, sqliteHolder);
            case 5:
                Czh czh2 = (Czh) this.A01;
                dispatchCqlOJOO = MailboxAdvancedCryptoTransportJNI.dispatchCqlOJOO(3, czh2.A01, czh2.A03, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 6:
                dispatchCqlOJOO = MailboxAIBotsJNI.dispatchCqlOJO(1, A01(this), sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 7:
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxAIBotsJNI.dispatchCqlOJOZ(0, ((Cxl) this.A01).A01, sqliteHolder, true);
                if (cQLResultSet2 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet2);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 8:
                CzV czV2 = (CzV) this.A01;
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxAIBotsJNI.dispatchCqlOIJO(3, czV2.A01, czV2.A02, sqliteHolder);
                if (cQLResultSet3 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet3);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 9:
                CQLResultSet cQLResultSet4 = (CQLResultSet) MailboxAttachmentsJNI.dispatchCqlOIO(0, ((Cxw) this.A01).A01, sqliteHolder);
                if (cQLResultSet4 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet4);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 10:
                CyU cyU = (CyU) this.A01;
                dispatchCqlOJOO = MailboxAvatarArtifactoJNI.dispatchDasmOOOOOO(0, cyU.A06, cyU.A04, cyU.A05, mailbox, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 11:
                CyG cyG = (CyG) this.A01;
                dispatchCqlOJOO = MailboxAvatarArtifactoJNI.dispatchDasmOOOOOO(3, 1BJ.A00(1616), cyG.A05, cyG.A04, mailbox, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 12:
                CQLResultSet cQLResultSet5 = (CQLResultSet) MailboxAvatarsInfoJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet5 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet5);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 13:
                return MailboxAvatarsInfoJNI.dispatchDasmOOO(0, mailbox, sqliteHolder);
            case 14:
                return MailboxAvatarsInfoJNI.dispatchDasmOIOO(1, ((Cxo) this.A01).A01, mailbox, sqliteHolder);
            case 15:
                dispatchCqlOJOO = MailboxBroadcastFlowJNI.dispatchCqlOOO(0, ((Cxq) this.A01).A03, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 16:
                CyG cyG2 = (CyG) this.A01;
                return MailboxBusinessInboxJNI.dispatchDasmOOOOOO(0, cyG2.A05, cyG2.A04, cyG2.A03, mailbox, sqliteHolder);
            case 17:
                return MailboxBusinessInboxJNI.dispatchDasmOJOO(6, A01(this), mailbox, sqliteHolder);
            case 18:
                return MailboxBusinessInboxJNI.dispatchDasmOJOO(7, A01(this), mailbox, sqliteHolder);
            case 19:
                return MailboxBusinessInboxJNI.dispatchDasmOOO(8, mailbox, sqliteHolder);
            case 20:
                CyB cyB = (CyB) this.A01;
                return MailboxBusinessInboxJNI.dispatchDasmOJOOO(9, cyB.A01, cyB.A05, mailbox, sqliteHolder);
            case 21:
                CQLResultSet cQLResultSet6 = (CQLResultSet) MailboxBusinessInboxJNI.dispatchCqlOO(1, sqliteHolder);
                if (cQLResultSet6 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet6);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 22:
                CQLResultSet cQLResultSet7 = (CQLResultSet) MailboxBusinessInboxJNI.dispatchCqlOJO(2, A00(this), sqliteHolder);
                if (cQLResultSet7 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet7);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 23:
                CQLResultSet cQLResultSet8 = (CQLResultSet) MailboxBusinessInboxJNI.dispatchCqlOO(6, sqliteHolder);
                if (cQLResultSet8 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet8);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 24:
                CQLResultSet cQLResultSet9 = (CQLResultSet) MailboxColorFilterSettingsJNI.dispatchCqlOJO(0, ((Cxl) this.A01).A01, sqliteHolder);
                if (cQLResultSet9 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet9);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 25:
                return MailboxColorFilterSettingsJNI.dispatchDasmOIOO(0, ((Cxo) this.A01).A01, mailbox, sqliteHolder);
            case 26:
                CyV cyV = (CyV) this.A01;
                CQLResultSet cQLResultSet10 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOIJJO(8, cyV.A01, cyV.A02, cyV.A03, sqliteHolder);
                if (cQLResultSet10 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet10);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 27:
                return MailboxCommunityJNI.dispatchDasmOOO(12, mailbox, sqliteHolder);
            case 28:
                Cy0 cy0 = (Cy0) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOO(14, cy0.A01, cy0.A04, mailbox, sqliteHolder);
            case 29:
                CQLResultSet cQLResultSet11 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(9, A00(this), sqliteHolder);
                if (cQLResultSet11 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet11);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 30:
                return MailboxCommunityJNI.dispatchDasmOJOO(21, A01(this), mailbox, sqliteHolder);
            case 31:
                return MailboxCommunityJNI.dispatchDasmOJOO(23, A01(this), mailbox, sqliteHolder);
            case 32:
                return MailboxCommunityJNI.dispatchDasmOJOO(31, A00(this), mailbox, sqliteHolder);
            case 33:
                CyB cyB2 = (CyB) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOO(36, cyB2.A01, cyB2.A03, mailbox, sqliteHolder);
            case 34:
                CzY czY = (CzY) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJJOO(37, czY.A01, czY.A03, czY.A02, mailbox, sqliteHolder);
            case 35:
                CyM cyM = (CyM) this.A01;
                dispatchCqlOJOO = MailboxCommunityJNI.dispatchDasmOIJJOOOO(38, cyM.A00, cyM.A01, cyM.A02, cyM.A06, null, mailbox, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 36:
                return MailboxCommunityJNI.dispatchDasmOJOO(43, A01(this), mailbox, sqliteHolder);
            case 37:
                CzZ czZ = (CzZ) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOO(44, czZ.A01, czZ.A02, mailbox, sqliteHolder);
            case 38:
                Czh czh3 = (Czh) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOO(45, czh3.A01, czh3.A03, mailbox, sqliteHolder);
            case 39:
                return MailboxCommunityJNI.dispatchDasmOJOO(47, A00(this), mailbox, sqliteHolder);
            case 40:
                CyB cyB3 = (CyB) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOOOO(49, cyB3.A01, cyB3.A05, cyB3.A04, null, mailbox, sqliteHolder);
            case 41:
                CyV cyV2 = (CyV) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJJOO(54, cyV2.A01, cyV2.A02, cyV2.A03, mailbox, sqliteHolder);
            case 42:
                return MailboxCommunityJNI.dispatchDasmOJOO(56, A01(this), mailbox, sqliteHolder);
            case 43:
                return MailboxCommunityJNI.dispatchDasmOJOO(57, A01(this), mailbox, sqliteHolder);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return MailboxCommunityJNI.dispatchDasmOJOO(59, A00(this), mailbox, sqliteHolder);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                RsV rsV = (RsV) this.A01;
                dispatchCqlOJOO = MailboxCommunityJNI.dispatchDasmOJJOO(64, rsV.A00, rsV.A01, mailbox, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 46:
                Rsi rsi = (Rsi) this.A01;
                Object[] objArr = (Object[]) MailboxCommunityJNI.dispatchDasmOIJJOOOOOOOOOOOOOZ(68, rsi.A00, rsi.A02, rsi.A01, rsi.A0E, rsi.A0A, rsi.A09, rsi.A06, rsi.A0B, rsi.A0D, null, rsi.A07, rsi.A0C, rsi.A05, rsi.A08, mailbox, sqliteHolder, false);
                return new CCV((Number) objArr[0], (Number) objArr[1]);
            case ActionId.ON_START_END /* 47 */:
                return MailboxCommunityJNI.dispatchDasmOJOO(69, A01(this), mailbox, sqliteHolder);
            case ActionId.QUEUED /* 48 */:
                RsW rsW = (RsW) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOO(70, rsW.A01, rsW.A00, mailbox, sqliteHolder);
            case ActionId.IN_PROGRESS /* 49 */:
                CQLResultSet cQLResultSet12 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(14, A00(this), sqliteHolder);
                if (cQLResultSet12 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet12);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 50:
                CzY czY2 = (CzY) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJJJOO(71, 0, czY2.A01, czY2.A03, czY2.A02, mailbox, sqliteHolder);
            case ActionId.UNKNOWN /* 51 */:
                Rsf rsf = (Rsf) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJJOOOOOO(73, rsf.A00, rsf.A01, rsf.A02, rsf.A06, rsf.A05, rsf.A07, rsf.A08, mailbox, sqliteHolder);
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                RsZ rsZ = (RsZ) this.A01;
                return MailboxCommunityJNI.dispatchDasmOOOOOO(75, rsZ.A03, rsZ.A04, rsZ.A02, mailbox, sqliteHolder);
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                CyZ cyZ = (CyZ) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOOOO(81, cyZ.A01, cyZ.A02, null, cyZ.A06, mailbox, sqliteHolder);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                CyV cyV3 = (CyV) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJJOO(82, cyV3.A01, cyV3.A02, cyV3.A03, mailbox, sqliteHolder);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                CyE cyE = (CyE) this.A01;
                return MailboxCommunityJNI.dispatchDasmOOOOOO(83, cyE.A05, cyE.A02, cyE.A04, mailbox, sqliteHolder);
            case ActionId.QUEUEING_FAIL /* 56 */:
                return MailboxCommunityJNI.dispatchDasmOJOOOO(84, A00(this), null, null, mailbox, sqliteHolder);
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                Cyh cyh = (Cyh) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOOO(85, cyh.A01, cyh.A02, cyh.A07, mailbox, sqliteHolder);
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                CyW cyW = (CyW) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOOO(87, cyW.A01, cyW.A02, cyW.A04, mailbox, sqliteHolder);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                CyX cyX = (CyX) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOOO(89, cyX.A01, cyX.A02, cyX.A06, mailbox, sqliteHolder);
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                return MailboxCommunityJNI.dispatchDasmOJOO(93, A00(this), mailbox, sqliteHolder);
            case ActionId.COUNTER /* 61 */:
                Rsc rsc = (Rsc) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOOOO(95, rsc.A00, rsc.A01, rsc.A06, rsc.A05, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                CyB cyB4 = (CyB) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOO(96, cyB4.A01, cyB4.A04, mailbox, sqliteHolder);
            case 63:
                Cya cya = (Cya) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOOOO(97, cya.A01, cya.A05, cya.A04, cya.A06, mailbox, sqliteHolder);
            case 64:
                Cya cya2 = (Cya) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOOOO(99, cya2.A01, cya2.A05, cya2.A04, cya2.A06, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                CyX cyX2 = (CyX) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOOO(100, cyX2.A01, cyX2.A02, cyX2.A06, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                CQLResultSet cQLResultSet13 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOOO(17, ((Czg) this.A01).A02, sqliteHolder);
                if (cQLResultSet13 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet13);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                CyF cyF = (CyF) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOOO(ActionId.LEGACY_MARKER, cyF.A01, cyF.A04, cyF.A05, mailbox, sqliteHolder);
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                return MailboxCommunityJNI.dispatchDasmOJOO(ActionId.ACTION_BAR_COMPLETE, A00(this), mailbox, sqliteHolder);
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                CyW cyW2 = (CyW) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOOO(ActionId.ABORTED, cyW2.A01, cyW2.A02, cyW2.A05, mailbox, sqliteHolder);
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                return MailboxCommunityJNI.dispatchDasmOJOO(ActionId.RTMP_PACKET_RECEIVED, A01(this), mailbox, sqliteHolder);
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                Rsa rsa = (Rsa) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOOO(ActionId.RTMP_CONNECTION_REQUESTED, rsa.A00, rsa.A01, rsa.A04, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                CzU czU = (CzU) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOOOO(ActionId.RTMP_CONNECTION_RELEASE, czU.A01, czU.A02, null, null, mailbox, sqliteHolder);
            case ActionId.INTENT_MAPPED /* 73 */:
                CQLResultSet cQLResultSet14 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet14 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet14);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                CQLResultSet cQLResultSet15 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(18, A01(this), sqliteHolder);
                if (cQLResultSet15 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet15);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                Cy0 cy02 = (Cy0) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOO(ActionId.NEW_START_FOUND, cy02.A01, cy02.A04, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_STARTED /* 76 */:
                CzU czU2 = (CzU) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOO(ActionId.TIMEOUT, czU2.A01, czU2.A02, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                Cy0 cy03 = (Cy0) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOO(ActionId.CONTROLLER_INITIATED, cy03.A01, cy03.A04, mailbox, sqliteHolder);
            case ActionId.FRAGMENT_CREATED /* 78 */:
                CzV czV3 = (CzV) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOOO(ActionId.RTMP_STREAM_PREPARED, czV3.A01, czV3.A02, null, mailbox, sqliteHolder);
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                RsX rsX = (RsX) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOO(ActionId.VIDEO_PLAYING, rsX.A00, rsX.A01, mailbox, sqliteHolder);
            case 80:
                CyA cyA = (CyA) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOO(ActionId.RTMP_CONNECTION_FAILED, cyA.A01, cyA.A02, mailbox, sqliteHolder);
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                Rsb rsb = (Rsb) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJJOOO(ActionId.RTMP_CONNECTION_INTERCEPTED, rsb.A00, rsb.A01, rsb.A02, rsb.A05, mailbox, sqliteHolder);
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                CyY cyY = (CyY) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOOO(ActionId.VIEW_DID_LOAD_BEGIN, cyY.A01, cyY.A03, cyY.A05, mailbox, sqliteHolder);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                return MailboxCommunityJNI.dispatchDasmOOO(ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES, mailbox, sqliteHolder);
            case ActionId.MARKER_SWAPPED /* 84 */:
                Rsd rsd = (Rsd) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOOOO(127, rsd.A00, rsd.A04, rsd.A05, rsd.A06, mailbox, sqliteHolder);
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                CzU czU3 = (CzU) this.A01;
                CQLResultSet cQLResultSet16 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJJO(24, czU3.A01, czU3.A02, sqliteHolder);
                if (cQLResultSet16 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet16);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                CQLResultSet cQLResultSet17 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(25, A00(this), sqliteHolder);
                if (cQLResultSet17 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet17);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.ERROR /* 87 */:
                CQLResultSet cQLResultSet18 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(27, A01(this), sqliteHolder);
                if (cQLResultSet18 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet18);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.METHOD_INVOKE /* 88 */:
                CQLResultSet cQLResultSet19 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(30, A00(this), sqliteHolder);
                if (cQLResultSet19 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet19);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.FINALLY /* 89 */:
                CzV czV4 = (CzV) this.A01;
                CQLResultSet cQLResultSet20 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOIJO(32, czV4.A01, czV4.A02, sqliteHolder);
                if (cQLResultSet20 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet20);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                CQLResultSet cQLResultSet21 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(42, A00(this), sqliteHolder);
                if (cQLResultSet21 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet21);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                CQLResultSet cQLResultSet22 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(43, A00(this), sqliteHolder);
                if (cQLResultSet22 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet22);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                CQLResultSet cQLResultSet23 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOIO(4, (-1) >>> 1, sqliteHolder);
                if (cQLResultSet23 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet23);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.ANIMATION_END /* 93 */:
                return MailboxCommunityJNI.dispatchCqlOO(51, sqliteHolder);
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                return MailboxCommunityJNI.dispatchCqlOO(52, sqliteHolder);
            case ActionId.MAIN_COMPLETE /* 95 */:
                CQLResultSet cQLResultSet24 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOIJO(5, 3, ((Czh) this.A01).A01, sqliteHolder);
                if (cQLResultSet24 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet24);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.INTERRUPTED /* 96 */:
                CQLResultSet cQLResultSet25 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOO(6, sqliteHolder);
                if (cQLResultSet25 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet25);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.NETWORK_FAILED /* 97 */:
                return MailboxCommunityJNI.dispatchDasmOJOOOO(0, ((RsY) this.A01).A00, null, null, mailbox, sqliteHolder);
            case ActionId.NETWORK_RESPONSE /* 98 */:
                CQLResultSet cQLResultSet26 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(7, A00(this), sqliteHolder);
                if (cQLResultSet26 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet26);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                CyA cyA2 = (CyA) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOO(1, cyA2.A01, cyA2.A02, mailbox, sqliteHolder);
            case 100:
                Cy4 cy4 = (Cy4) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIIJOO(2, cy4.A01, cy4.A00, cy4.A02, mailbox, sqliteHolder);
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                Cyh cyh2 = (Cyh) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOOO(3, cyh2.A01, cyh2.A02, cyh2.A07, mailbox, sqliteHolder);
            case ActionId.DATA_LOAD_START /* 102 */:
                return MailboxCommunityJNI.dispatchDasmOJOO(4, A01(this), mailbox, sqliteHolder);
            case ActionId.LEGACY_MARKER /* 103 */:
                return MailboxCommunityJNI.dispatchDasmOJOO(5, A01(this), mailbox, sqliteHolder);
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                CzZ czZ2 = (CzZ) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOO(7, czZ2.A01, czZ2.A02, mailbox, sqliteHolder);
            case ActionId.ABORTED /* 105 */:
                CzZ czZ3 = (CzZ) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJJOO(8, 1, czZ3.A01, czZ3.A02, mailbox, sqliteHolder);
            case ActionId.QUERY_READY /* 106 */:
                CyX cyX3 = (CyX) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOOO(9, cyX3.A01, cyX3.A02, cyX3.A06, mailbox, sqliteHolder);
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                CQLResultSet cQLResultSet27 = (CQLResultSet) MailboxCommunityMessagingPresenceJNI.dispatchCqlOOO(0, ((Czi) this.A01).A04, sqliteHolder);
                if (cQLResultSet27 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet27);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 108:
                CQLResultSet cQLResultSet28 = (CQLResultSet) MailboxCommunityMessagingPresenceJNI.dispatchCqlOOO(1, ((Czi) this.A01).A02, sqliteHolder);
                if (cQLResultSet28 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet28);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                CQLResultSet cQLResultSet29 = (CQLResultSet) MailboxCommunityMessagingPresenceJNI.dispatchCqlOOO(2, ((Czi) this.A01).A02, sqliteHolder);
                if (cQLResultSet29 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet29);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                return MailboxCommunityMessagingPresenceJNI.dispatchDasmOOOO(0, ((Czi) this.A01).A04, mailbox, sqliteHolder);
            case ActionId.NEW_START_FOUND /* 111 */:
                return MailboxCommunityMessagingPresenceJNI.dispatchDasmOOOO(1, ((Cxj) this.A01).A02, mailbox, sqliteHolder);
            case ActionId.MISSED_EVENT /* 112 */:
                CyV cyV4 = (CyV) this.A01;
                return MailboxCommunityMessagingPresenceJNI.dispatchDasmOIJJOO(2, cyV4.A01, cyV4.A03, cyV4.A02, mailbox, sqliteHolder);
            case ActionId.TIMEOUT /* 113 */:
                CQLResultSet cQLResultSet30 = (CQLResultSet) MailboxCommunityMessagingSearchJNI.dispatchCqlOJO(0, A01(this), sqliteHolder);
                if (cQLResultSet30 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet30);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                return MailboxCommunityMessagingSearchJNI.dispatchCqlOO(1, sqliteHolder);
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                CQLResultSet cQLResultSet31 = (CQLResultSet) MailboxCommunityMessagingSearchJNI.dispatchCqlOIO(2, ((Cxo) this.A01).A01, sqliteHolder);
                if (cQLResultSet31 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet31);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.VIDEO_PLAYING /* 116 */:
                return MailboxCommunityMessagingSearchJNI.dispatchCqlOO(3, sqliteHolder);
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                return MailboxCommunityMessagingSearchJNI.dispatchCqlOIO(4, ((CzW) this.A01).A01, sqliteHolder);
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                Cye cye = (Cye) this.A01;
                CQLResultSet cQLResultSet32 = (CQLResultSet) MailboxCommunityMessagingSearchJNI.dispatchCqlOIIOZZZZ(5, cye.A00, cye.A01, sqliteHolder, cye.A06, cye.A07, cye.A04, cye.A05);
                if (cQLResultSet32 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet32);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                CyC cyC = (CyC) this.A01;
                return MailboxCommunityMessagingSearchJNI.dispatchDasmOOOOO(0, cyC.A02, cyC.A05, mailbox, sqliteHolder);
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                return MailboxComposerMenuJNI.dispatchDasmOJOO(0, A01(this), mailbox, sqliteHolder);
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                dispatchCqlOJOO = MailboxCutoverJNI.dispatchCqlOOO(8, ((Cxq) this.A01).A03, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.CARD_DATA_LOADED /* 122 */:
                dispatchCqlOJOO = MailboxCutoverJNI.dispatchCqlOJO(6, A01(this), sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                return MailboxCutoverInternalJNI.dispatchCqlOJO(0, A01(this), sqliteHolder);
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                CyD cyD2 = (CyD) this.A01;
                return MailboxE2EEXmaReceiverFetchJNI.dispatchDasmOJOOO(0, cyD2.A01, cyD2.A05, mailbox, sqliteHolder);
            case 125:
                CzV czV5 = (CzV) this.A01;
                CQLResultSet cQLResultSet33 = (CQLResultSet) MailboxFilteredThreadsRangesJNI.dispatchCqlOIJO(0, czV5.A01, czV5.A02, sqliteHolder);
                if (cQLResultSet33 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet33);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                return MailboxFilteredThreadsRangesJNI.dispatchDasmOJOO(0, A01(this), mailbox, sqliteHolder);
            case 127:
                dispatchCqlOJOO = MailboxForwardRateLimitJNI.dispatchCqlOIO(0, ((Cxo) this.A01).A01, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case 128:
                return MailboxForwardRateLimitJNI.dispatchCqlOIO(1, ((Cxo) this.A01).A01, sqliteHolder);
            case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
                CQLResultSet cQLResultSet34 = (CQLResultSet) MailboxFRXJNI.dispatchCqlOIJO(0, 100, ((Czf) this.A01).A01, sqliteHolder);
                if (cQLResultSet34 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet34);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.APP_DID_FINISH_LAUNCHING /* 130 */:
                CzV czV6 = (CzV) this.A01;
                return MailboxGamesBotThreadJNI.dispatchDasmOIJOO(1, czV6.A01, czV6.A02, mailbox, sqliteHolder);
            case ActionId.APP_DID_BECOME_ACTIVE /* 131 */:
                CQLResultSet cQLResultSet35 = (CQLResultSet) MailboxGroupLinksJNI.dispatchCqlOOO(0, ((Cxq) this.A01).A03, sqliteHolder);
                if (cQLResultSet35 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet35);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                return MailboxGroupLinksJNI.dispatchDasmOJOO(0, A00(this), mailbox, sqliteHolder);
            case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
                return MailboxGroupLinksJNI.dispatchDasmOJOO(1, A00(this), mailbox, sqliteHolder);
            case ActionId.APP_MAIN /* 134 */:
                CyN cyN = (CyN) this.A01;
                return MailboxGroupLinksJNI.dispatchDasmOOOOOOO(2, cyN.A06, cyN.A05, cyN.A04, cyN.A03, mailbox, sqliteHolder);
            case ActionId.MQTT_CONNECTING /* 135 */:
                Cy5 cy5 = (Cy5) this.A01;
                return MailboxGroupLinksJNI.dispatchDasmOIJOOOOOOOZ(3, cy5.A00, 0L, cy5.A05, cy5.A04, null, null, null, mailbox, sqliteHolder, false);
            case ActionId.MQTT_CONNECTED /* 136 */:
                return MailboxGroupLinksJNI.dispatchDasmOJOO(4, A00(this), mailbox, sqliteHolder);
            case ActionId.MQTT_DISCONNECTED /* 137 */:
                CyA cyA3 = (CyA) this.A01;
                return MailboxGroupLinksJNI.dispatchDasmOIJOO(5, cyA3.A01, cyA3.A02, mailbox, sqliteHolder);
            case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
                dispatchCqlOJOO = MailboxGroupThreadJNI.dispatchCqlOJO(0, A01(this), sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.APP_FIRST_VIEW_CONTROLLER /* 139 */:
                CyD cyD3 = (CyD) this.A01;
                return MailboxIgnoreMessagesJNI.dispatchDasmOJOOO(0, cyD3.A01, cyD3.A05, mailbox, sqliteHolder);
            case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                return MailboxInboxFoldersJNI.dispatchDasmOOO(0, mailbox, sqliteHolder);
            case ActionId.MESSENGER_THREAD_LIST_DISPLAYED /* 141 */:
                dispatchCqlOJOO = MailboxIntegrityBlockJNI.dispatchCqlOJO(0, A00(this), sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.PREV_ACTIVITY_PAUSE /* 142 */:
                dispatchCqlOJOO = MailboxIntegrityBlockJNI.dispatchCqlOJO(2, A00(this), sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.ACTIVITY_RESUME /* 143 */:
                CQLResultSet cQLResultSet36 = (CQLResultSet) MailboxMagicWordsJNI.dispatchCqlOJO(0, A01(this), sqliteHolder);
                if (cQLResultSet36 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet36);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.ACTIVITY_START /* 144 */:
                CyB cyB5 = (CyB) this.A01;
                return MailboxMagicWordsJNI.dispatchDasmOJOOOO(0, cyB5.A01, cyB5.A04, cyB5.A05, mailbox, sqliteHolder);
            case ActionId.BEGIN_START_ACTIVITY /* 145 */:
                return MailboxMediaReceiverFetchJNI.dispatchCqlOOO(2, ((Cxq) this.A01).A03, sqliteHolder);
            case ActionId.END_START_ACTIVITY /* 146 */:
                return MailboxMediaReceiverFetchJNI.dispatchCqlOOO(3, ((Cxq) this.A01).A03, sqliteHolder);
            case ActionId.FILE_SYSTEM_FAIL /* 147 */:
                CyD cyD4 = (CyD) this.A01;
                return MailboxMediaReceiverFetchJNI.dispatchDasmOJOOO(0, cyD4.A01, cyD4.A05, mailbox, sqliteHolder);
            case ActionId.FORMAT_ERROR /* 148 */:
                dispatchCqlOJOO = MailboxMemberRequestsJNI.dispatchCqlOOO(0, ((Czg) this.A01).A03, sqliteHolder);
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.PRIVACY_VIOLATION /* 149 */:
                CQLResultSet cQLResultSet37 = (CQLResultSet) MailboxMemberRequestsJNI.dispatchCqlOOO(1, ((Cxn) this.A01).A03, sqliteHolder);
                if (cQLResultSet37 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet37);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case 150:
                return MailboxMessageRequestJNI.dispatchDasmOIOO(1, ((Cxm) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                return MailboxMessageRequestsSDKJNI.dispatchCqlOO(0, sqliteHolder);
            case ActionId.APPLY_OPTIMISTICS /* 152 */:
                CzV czV7 = (CzV) this.A01;
                return MailboxMessageRequestsSDKJNI.dispatchCqlOIJO(1, czV7.A01, czV7.A02, sqliteHolder);
            case ActionId.APPLY_FINISHED_LIST /* 153 */:
                CQLResultSet cQLResultSet38 = (CQLResultSet) MailboxMessengerShoppingCartStatusJNI.dispatchCqlOJO(0, A01(this), sqliteHolder);
                if (cQLResultSet38 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet38);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                CQLResultSet cQLResultSet39 = (CQLResultSet) MailboxNotificationSettingsJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet39 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet39);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                CQLResultSet cQLResultSet40 = (CQLResultSet) MailboxOrcaJNI.dispatchCqlOOO(10, ((CzW) this.A01).A04, sqliteHolder);
                if (cQLResultSet40 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet40);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
                CQLResultSet cQLResultSet41 = (CQLResultSet) MailboxOrcaContactListJNI.dispatchCqlOOO(0, ((Czg) this.A01).A02, sqliteHolder);
                if (cQLResultSet41 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet41);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.WAIT_FOR_BLOCKERS /* 157 */:
                return MailboxParentThreadUtilJNI.dispatchCqlOIOZ(0, ((C1251Abt) this.A01).A01, sqliteHolder, true);
            case ActionId.NOTIFY_SUBSCRIBERS /* 158 */:
                CQLResultSet cQLResultSet42 = (CQLResultSet) MailboxPaymentsJNI.dispatchCqlOJO(1, A01(this), sqliteHolder);
                if (cQLResultSet42 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet42);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.FAIL_FILE_TOO_LARGE /* 159 */:
                CzZ czZ4 = (CzZ) this.A01;
                return MailboxPinnedThreadsJNI.dispatchDasmOJJOO(0, czZ4.A02, czZ4.A01, mailbox, sqliteHolder);
            case ActionId.OFFLINE /* 160 */:
                return MailboxPinnedThreadsJNI.dispatchDasmOJOO(1, A00(this), mailbox, sqliteHolder);
            case ActionId.ASNYC_FAILED /* 161 */:
                Cyh cyh3 = (Cyh) this.A01;
                return MailboxPollsJNI.dispatchDasmOJJOOOO(2, cyh3.A02, cyh3.A01, cyh3.A04, cyh3.A06, mailbox, sqliteHolder);
            case ActionId.ASYNC_FAIL /* 162 */:
                CQLResultSet cQLResultSet43 = (CQLResultSet) MailboxProactiveWarningsNonCoreJNI.dispatchCqlOJO(1, A01(this), sqliteHolder);
                if (cQLResultSet43 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet43);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.ON_ATTACH_FRAGMENT /* 163 */:
                CzY czY3 = (CzY) this.A01;
                return MailboxProfileSheetJNI.dispatchDasmOJJJOO(0, czY3.A01, czY3.A02, czY3.A03, mailbox, sqliteHolder);
            case ActionId.VIEW_DID_APPEAR_BEGIN /* 164 */:
                Cy0 cy04 = (Cy0) this.A01;
                return MailboxPublicChatsJNI.dispatchDasmOJOOO(6, cy04.A01, cy04.A04, mailbox, sqliteHolder);
            case ActionId.DISPLAYED /* 165 */:
                CyR cyR = (CyR) this.A01;
                return MailboxPublicChatsJNI.dispatchDasmOIOOOOO(7, cyR.A00, cyR.A04, cyR.A06, cyR.A05, mailbox, sqliteHolder);
            case ActionId.DISPLAYED_ON_SCREEN /* 166 */:
                CzV czV8 = (CzV) this.A01;
                CQLResultSet cQLResultSet44 = (CQLResultSet) MailboxPublicChatsJNI.dispatchCqlOIJO(1, czV8.A01, czV8.A02, sqliteHolder);
                if (cQLResultSet44 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet44);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.ASYNC_ACTION_SUCCESS /* 167 */:
                CzV czV9 = (CzV) this.A01;
                CQLResultSet cQLResultSet45 = (CQLResultSet) MailboxPublicChatsJNI.dispatchCqlOIJO(2, czV9.A01, czV9.A02, sqliteHolder);
                if (cQLResultSet45 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet45);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            case ActionId.ASYNC_ACTION_FAIL /* 168 */:
                CQLResultSet cQLResultSet46 = (CQLResultSet) MailboxPublicChatsJNI.dispatchCqlOJO(3, A01(this), sqliteHolder);
                if (cQLResultSet46 != null) {
                    dispatchCqlOJOO = new 1qX(cQLResultSet46);
                    return 7zL.A0s(dispatchCqlOJOO);
                }
                dispatchCqlOJOO = null;
                return 7zL.A0s(dispatchCqlOJOO);
            default:
                Cza cza = (Cza) this.A01;
                return MailboxPublicChatsJNI.dispatchDasmOIJOOOO(0, cza.A01, cza.A02, cza.A05, "", mailbox, sqliteHolder);
        }
    }
}
