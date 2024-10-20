package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.attachments.mca.MailboxAttachmentsJNI;
import com.facebook.avatarartifacto.mca.MailboxAvatarArtifactoJNI;
import com.facebook.avataraudiomessagesinfo.mca.MailboxAvatarAudioMessagesInfoJNI;
import com.facebook.avataraudiomessagesv3.mca.MailboxAvatarAudioMessagesV3JNI;
import com.facebook.clientnotifications.mca.MailboxClientNotificationsJNI;
import com.facebook.community.mca.MailboxCommunityJNI;
import com.facebook.composer.mca.MailboxComposerJNI;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.cuckoo.mca.MailboxCuckooJNI;
import com.facebook.fts.mca.MailboxFTSJNI;
import com.facebook.gif.mca.MailboxGIFJNI;
import com.facebook.graph.mca.MailboxGraphJNI;
import com.facebook.jewelnotification.mca.MailboxJewelNotificationJNI;
import com.facebook.locationsharing.mca.MailboxLocationSharingJNI;
import com.facebook.markinboxseen.mca.MailboxMarkInboxSeenJNI;
import com.facebook.mediareceiverfetch.mca.MailboxMediaReceiverFetchJNI;
import com.facebook.messagelist.mca.MailboxMessageListJNI;
import com.facebook.messengersafetyinterventionplatform.mca.MailboxMessengerSafetyInterventionPlatformJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.notificationutils.mca.MailboxNotificationUtilsJNI;
import com.facebook.orca.mca.MailboxOrcaJNI;
import com.facebook.orcacontactlist.mca.MailboxOrcaContactListJNI;
import com.facebook.payments.mca.MailboxPaymentsJNI;
import com.facebook.presence.mca.MailboxPresenceJNI;
import com.facebook.qp.mca.MailboxQPJNI;
import com.facebook.reactionv2.mca.MailboxReactionV2JNI;
import com.facebook.replyreminder.mca.MailboxReplyReminderJNI;
import com.facebook.search.mca.MailboxSearchJNI;
import com.facebook.shim.mca.MailboxShimJNI;
import com.facebook.status.mca.MailboxStatusJNI;
import com.facebook.sticker.mca.MailboxStickerJNI;
import com.facebook.stickerpicker.mca.MailboxStickerPickerJNI;
import com.facebook.stories.mca.MailboxStoriesJNI;
import com.facebook.tam.mca.MailboxTamJNI;
import java.util.List;

/* loaded from: Ic0.class */
public final class Ic0 implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public Ic0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Ic0 A00(Object obj, int i) {
        return new Ic0(obj, i);
    }

    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        Object dispatchCqlOJO;
        switch (this.A00) {
            case 0:
                dispatchCqlOJO = MailboxAdvancedCryptoTransportJNI.dispatchCqlOJO(10, ((Iao) this.A01).A01, sqliteHolder);
                return new MailboxNullable(dispatchCqlOJO);
            case 1:
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxAdvancedCryptoTransportJNI.dispatchCqlOJO(0, ((Ibu) this.A01).A01, sqliteHolder);
                if (cQLResultSet != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 2:
                Object[] objArr = (Object[]) MailboxAdvancedCryptoTransportJNI.dispatchCqlOO(1, sqliteHolder);
                return new Hy1((Boolean) objArr[0], (Number) objArr[1]);
            case 3:
                dispatchCqlOJO = MailboxAdvancedCryptoTransportJNI.dispatchCqlOJO(7, ((Ibu) this.A01).A01, sqliteHolder);
                return new MailboxNullable(dispatchCqlOJO);
            case 4:
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxAttachmentsJNI.dispatchCqlOOO(2, ((Iar) this.A01).A03, sqliteHolder);
                if (cQLResultSet2 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet2);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 5:
                IbJ ibJ = (IbJ) this.A01;
                dispatchCqlOJO = MailboxAvatarArtifactoJNI.dispatchDasmOOOOO(1, ibJ.A05, ibJ.A04, mailbox, sqliteHolder);
                return new MailboxNullable(dispatchCqlOJO);
            case 6:
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxAvatarAudioMessagesInfoJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet3 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet3);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 7:
                CQLResultSet cQLResultSet4 = (CQLResultSet) MailboxAvatarAudioMessagesV3JNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet4 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet4);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 8:
                Iav iav = (Iav) this.A01;
                CQLResultSet cQLResultSet5 = (CQLResultSet) MailboxClientNotificationsJNI.dispatchCqlOJOO(0, iav.A01, iav.A04, sqliteHolder);
                if (cQLResultSet5 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet5);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 9:
                Cxv cxv = (Cxv) this.A01;
                CQLResultSet cQLResultSet6 = (CQLResultSet) MailboxClientNotificationsJNI.dispatchCqlOOOOO(2, "main-app", cxv.A03, cxv.A04, sqliteHolder);
                if (cQLResultSet6 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet6);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 10:
                dispatchCqlOJO = MailboxClientNotificationsJNI.dispatchCqlOJO(3, 172800L, sqliteHolder);
                return new MailboxNullable(dispatchCqlOJO);
            case 11:
                Ibl ibl = (Ibl) this.A01;
                dispatchCqlOJO = MailboxCommunityJNI.dispatchDasmOOOOOOOOOOOO(19, ibl.A08, ibl.A07, null, ibl.A06, null, ibl.A02, ibl.A09, ibl.A03, ibl.A04, mailbox, sqliteHolder);
                return new MailboxNullable(dispatchCqlOJO);
            case 12:
                return MailboxCommunityJNI.dispatchDasmOJOO(20, ((Iam) this.A01).A01, mailbox, sqliteHolder);
            case 13:
                return MailboxCommunityJNI.dispatchDasmOJOO(22, ((Iam) this.A01).A01, mailbox, sqliteHolder);
            case 14:
                return MailboxCommunityJNI.dispatchDasmOOO(24, mailbox, sqliteHolder);
            case 15:
                IbG ibG = (IbG) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOO(26, ibG.A01, ibG.A02, mailbox, sqliteHolder);
            case 16:
                Iaz iaz = (Iaz) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOO(28, iaz.A01, iaz.A04, mailbox, sqliteHolder);
            case 17:
                return MailboxCommunityJNI.dispatchDasmOJOO(30, ((A0J) this.A01).A01, mailbox, sqliteHolder);
            case 18:
                return MailboxCommunityJNI.dispatchDasmOJOO(32, ((Ibu) this.A01).A01, mailbox, sqliteHolder);
            case 19:
                C3b8 c3b8 = (C3b8) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOO(35, c3b8.A01, c3b8.A02, mailbox, sqliteHolder);
            case 20:
                return MailboxCommunityJNI.dispatchDasmOOO(39, mailbox, sqliteHolder);
            case 21:
                return MailboxCommunityJNI.dispatchDasmOJOO(50, ((Iay) this.A01).A01, mailbox, sqliteHolder);
            case 22:
                A1Z a1z = (A1Z) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOO(53, a1z.A01, a1z.A02, mailbox, sqliteHolder);
            case 23:
                return MailboxCommunityJNI.dispatchDasmOJOO(55, ((Iam) this.A01).A01, mailbox, sqliteHolder);
            case 24:
                Iaw iaw = (Iaw) this.A01;
                return MailboxCommunityJNI.dispatchDasmOOOOOO(61, null, iaw.A02, iaw.A03, mailbox, sqliteHolder);
            case 25:
                Ibo ibo = (Ibo) this.A01;
                return MailboxCommunityJNI.dispatchDasmOOOOOOOOOO(63, ibo.A05, ibo.A07, ibo.A06, ibo.A08, ibo.A04, ibo.A0A, ibo.A09, mailbox, sqliteHolder);
            case 26:
                return MailboxCommunityJNI.dispatchDasmOOO(72, mailbox, sqliteHolder);
            case 27:
                return MailboxCommunityJNI.dispatchDasmOJOO(74, ((A0J) this.A01).A01, mailbox, sqliteHolder);
            case 28:
                A0J a0j = (A0J) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOO(80, a0j.A01, a0j.A04, mailbox, sqliteHolder);
            case 29:
                return MailboxCommunityJNI.dispatchDasmOJOO(86, ((Iam) this.A01).A01, mailbox, sqliteHolder);
            case 30:
                return MailboxCommunityJNI.dispatchDasmOJOO(88, ((A0J) this.A01).A01, mailbox, sqliteHolder);
            case 31:
                Ibx ibx = (Ibx) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJJOO(90, ibx.A01, ibx.A03, ibx.A02, mailbox, sqliteHolder);
            case 32:
                return MailboxCommunityJNI.dispatchDasmOJOO(92, ((Iay) this.A01).A01, mailbox, sqliteHolder);
            case 33:
                Ibb ibb = (Ibb) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOOOO(98, ibb.A01, ibb.A04, ibb.A06, ibb.A07, mailbox, sqliteHolder);
            case 34:
                return MailboxCommunityJNI.dispatchDasmOJOO(ActionId.RTMP_CONNECTION_CONNECTED, ((Iam) this.A01).A01, mailbox, sqliteHolder);
            case 35:
                return MailboxCommunityJNI.dispatchDasmOOOO(ActionId.VIDEO_SET_RENDERER_CONTEXT, ((Ian) this.A01).A03, mailbox, sqliteHolder);
            case 36:
                return MailboxCommunityJNI.dispatchDasmOJOO(ActionId.VIEW_WILL_APPEAR_BEGIN, ((A0J) this.A01).A01, mailbox, sqliteHolder);
            case 37:
                return MailboxCommunityJNI.dispatchDasmOOO(125, mailbox, sqliteHolder);
            case 38:
                CQLResultSet cQLResultSet7 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(21, ((A0J) this.A01).A01, sqliteHolder);
                if (cQLResultSet7 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet7);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 39:
                CQLResultSet cQLResultSet8 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(26, ((A0J) this.A01).A01, sqliteHolder);
                if (cQLResultSet8 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet8);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 40:
                CQLResultSet cQLResultSet9 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(31, ((Iam) this.A01).A01, sqliteHolder);
                if (cQLResultSet9 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet9);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 41:
                IbB ibB = (IbB) this.A01;
                CQLResultSet cQLResultSet10 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOIJOZ(35, ibB.A00, ibB.A01, sqliteHolder, ibB.A05);
                if (cQLResultSet10 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet10);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 42:
                CQLResultSet cQLResultSet11 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(40, ((Iam) this.A01).A01, sqliteHolder);
                if (cQLResultSet11 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet11);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 43:
                Ib1 ib1 = (Ib1) this.A01;
                CQLResultSet cQLResultSet12 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOOOO(44, ib1.A03, ib1.A04, sqliteHolder);
                if (cQLResultSet12 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet12);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                CQLResultSet cQLResultSet13 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(45, ((Ib2) this.A01).A01, sqliteHolder);
                if (cQLResultSet13 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet13);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                CQLResultSet cQLResultSet14 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(48, ((Iam) this.A01).A01, sqliteHolder);
                if (cQLResultSet14 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet14);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 46:
                IbG ibG2 = (IbG) this.A01;
                return MailboxCommunityJNI.dispatchCqlOJJO(50, ibG2.A01, ibG2.A02, sqliteHolder);
            case ActionId.ON_START_END /* 47 */:
                IbX ibX = (IbX) this.A01;
                return MailboxComposerJNI.dispatchCqlOIJOOOOOZ(0, ibX.A00, ibX.A01, ibX.A07, ibX.A05, ibX.A06, ibX.A04, sqliteHolder, false);
            case ActionId.QUEUED /* 48 */:
                A0J a0j2 = (A0J) this.A01;
                return MailboxCoreJNI.dispatchDasmOIJOOOO(4, 1, a0j2.A01, a0j2.A03, null, mailbox, sqliteHolder);
            case ActionId.IN_PROGRESS /* 49 */:
                IbM ibM = (IbM) this.A01;
                return MailboxCuckooJNI.dispatchDasmOIOOO(3, ibM.A01, ibM.A05, mailbox, sqliteHolder);
            case 50:
                return MailboxFTSJNI.dispatchCqlOO(11, sqliteHolder);
            case ActionId.UNKNOWN /* 51 */:
                return MailboxFTSJNI.dispatchCqlOIO(13, ((A0E) this.A01).A01, sqliteHolder);
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                Object[] objArr2 = (Object[]) MailboxFTSJNI.dispatchCqlOO(14, sqliteHolder);
                return new C5bt((Boolean) objArr2[1], (Number) objArr2[0]);
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                return MailboxFTSJNI.dispatchCqlOIO(15, ((A0E) this.A01).A01, sqliteHolder);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                return MailboxFTSJNI.dispatchCqlOIJOO(18, 10, Long.MAX_VALUE, ((Iar) this.A01).A03, sqliteHolder);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                IbC ibC = (IbC) this.A01;
                CQLResultSet cQLResultSet15 = (CQLResultSet) MailboxFTSJNI.dispatchCqlOIJOOOOZ(2, 10, ibC.A00, "AdvancedCrypto", ibC.A04, ibC.A03, sqliteHolder, ibC.A05);
                if (cQLResultSet15 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet15);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                Iaz iaz2 = (Iaz) this.A01;
                CQLResultSet cQLResultSet16 = (CQLResultSet) MailboxFTSJNI.dispatchCqlOIJOOO(3, 10, iaz2.A01, "AdvancedCrypto", iaz2.A04, sqliteHolder);
                if (cQLResultSet16 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet16);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                Object[] objArr3 = (Object[]) MailboxFTSJNI.dispatchCqlOO(4, sqliteHolder);
                return new C10294t2((Number) objArr3[0], (Number) objArr3[1], (Number) objArr3[2], (Number) objArr3[3]);
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                CQLResultSet cQLResultSet17 = (CQLResultSet) MailboxGIFJNI.dispatchCqlOOO(0, ((Iar) this.A01).A03, sqliteHolder);
                if (cQLResultSet17 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet17);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                CQLResultSet cQLResultSet18 = (CQLResultSet) MailboxGIFJNI.dispatchCqlOOO(1, ((Iar) this.A01).A03, sqliteHolder);
                if (cQLResultSet18 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet18);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                Ib6 ib6 = (Ib6) this.A01;
                dispatchCqlOJO = MailboxGIFJNI.dispatchDasmOIOOOO(1, 3, ib6.A04, ib6.A03, mailbox, sqliteHolder);
                return new MailboxNullable(dispatchCqlOJO);
            case ActionId.COUNTER /* 61 */:
                IbK ibK = (IbK) this.A01;
                return MailboxGraphJNI.dispatchDasmOIJOO(0, ibK.A01, ibK.A02, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                IbK ibK2 = (IbK) this.A01;
                return MailboxGraphJNI.dispatchDasmOIJOO(1, ibK2.A01, ibK2.A02, mailbox, sqliteHolder);
            case 63:
                IbK ibK3 = (IbK) this.A01;
                return MailboxGraphJNI.dispatchDasmOIJOO(2, ibK3.A01, ibK3.A02, mailbox, sqliteHolder);
            case 64:
                IbK ibK4 = (IbK) this.A01;
                return MailboxGraphJNI.dispatchDasmOIJOO(3, ibK4.A01, ibK4.A02, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                Ibx ibx2 = (Ibx) this.A01;
                return MailboxJewelNotificationJNI.dispatchCqlOIJJO(0, ibx2.A01, ibx2.A02, ibx2.A03, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                CQLResultSet cQLResultSet19 = (CQLResultSet) MailboxJewelNotificationJNI.dispatchCqlOJO(1, ((Iam) this.A01).A01, sqliteHolder);
                if (cQLResultSet19 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet19);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return MailboxLocationSharingJNI.dispatchDasmOJOO(4, ((Ibu) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                IbD ibD = (IbD) this.A01;
                return MailboxLocationSharingJNI.dispatchDasmODDJJOO(5, ibD.A00, ibD.A01, ibD.A03, ibD.A02, mailbox, sqliteHolder);
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                CQLResultSet cQLResultSet20 = (CQLResultSet) MailboxLocationSharingJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet20 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet20);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                CQLResultSet cQLResultSet21 = (CQLResultSet) MailboxLocationSharingJNI.dispatchCqlOJO(1, ((Iao) this.A01).A01, sqliteHolder);
                if (cQLResultSet21 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet21);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                CQLResultSet cQLResultSet22 = (CQLResultSet) MailboxLocationSharingJNI.dispatchCqlOJO(2, ((Iao) this.A01).A01, sqliteHolder);
                if (cQLResultSet22 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet22);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                CQLResultSet cQLResultSet23 = (CQLResultSet) MailboxLocationSharingJNI.dispatchCqlOJO(3, ((Ibu) this.A01).A01, sqliteHolder);
                if (cQLResultSet23 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet23);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.INTENT_MAPPED /* 73 */:
                return MailboxLocationSharingJNI.dispatchDasmOJOO(2, ((Ibu) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                IbY ibY = (IbY) this.A01;
                dispatchCqlOJO = MailboxLocationSharingJNI.dispatchDasmODDJJJJOO(3, ibY.A00, ibY.A01, ibY.A05, ibY.A03, ibY.A04, ibY.A02, mailbox, sqliteHolder);
                return new MailboxNullable(dispatchCqlOJO);
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                return MailboxMarkInboxSeenJNI.dispatchDasmOJOO(0, ((Iam) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_STARTED /* 76 */:
                CQLResultSet cQLResultSet24 = (CQLResultSet) MailboxMediaReceiverFetchJNI.dispatchCqlOOO(0, ((Iar) this.A01).A03, sqliteHolder);
                if (cQLResultSet24 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet24);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                CQLResultSet cQLResultSet25 = (CQLResultSet) MailboxMediaReceiverFetchJNI.dispatchCqlOOO(1, ((Iar) this.A01).A03, sqliteHolder);
                if (cQLResultSet25 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet25);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                IbE ibE = (IbE) this.A01;
                CQLResultSet cQLResultSet26 = (CQLResultSet) MailboxMessageListJNI.dispatchCqlOIIIJJO(1, ibE.A00, ibE.A01, -1, ibE.A03, ibE.A02, sqliteHolder);
                if (cQLResultSet26 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet26);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                IbL ibL = (IbL) this.A01;
                CQLResultSet cQLResultSet27 = (CQLResultSet) MailboxMessengerSafetyInterventionPlatformJNI.dispatchCqlOOOOO(0, ibL.A03, ibL.A04, ibL.A05, sqliteHolder);
                if (cQLResultSet27 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet27);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case 80:
                IbN ibN = (IbN) this.A01;
                return MailboxMessengerSafetyInterventionPlatformJNI.dispatchCqlOOOOO(2, ibN.A05, ibN.A03, ibN.A04, sqliteHolder);
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                IbN ibN2 = (IbN) this.A01;
                return MailboxMessengerSafetyInterventionPlatformJNI.dispatchCqlOOOOO(3, ibN2.A05, ibN2.A03, ibN2.A04, sqliteHolder);
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                IbL ibL2 = (IbL) this.A01;
                return MailboxMessengerSafetyInterventionPlatformJNI.dispatchCqlOOOOO(4, ibL2.A03, ibL2.A04, ibL2.A05, sqliteHolder);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A0J a0j3 = (A0J) this.A01;
                CQLResultSet cQLResultSet28 = (CQLResultSet) MailboxNotificationUtilsJNI.dispatchCqlOJOO(0, a0j3.A01, a0j3.A04, sqliteHolder);
                if (cQLResultSet28 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet28);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.MARKER_SWAPPED /* 84 */:
                CQLResultSet cQLResultSet29 = (CQLResultSet) MailboxOrcaJNI.dispatchCqlOIO(12, ((C3av) this.A01).A02, sqliteHolder);
                if (cQLResultSet29 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet29);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                CQLResultSet cQLResultSet30 = (CQLResultSet) MailboxOrcaContactListJNI.dispatchCqlOO(2, sqliteHolder);
                if (cQLResultSet30 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet30);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                CQLResultSet cQLResultSet31 = (CQLResultSet) MailboxOrcaContactListJNI.dispatchCqlOOO(4, ((Ibv) this.A01).A02, sqliteHolder);
                if (cQLResultSet31 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet31);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.ERROR /* 87 */:
                CQLResultSet cQLResultSet32 = (CQLResultSet) MailboxPaymentsJNI.dispatchCqlOOO(0, ((Iar) this.A01).A03, sqliteHolder);
                if (cQLResultSet32 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet32);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                IbM ibM2 = (IbM) this.A01;
                return MailboxPresenceJNI.dispatchDasmOIOOO(3, ibM2.A01, ibM2.A05, mailbox, sqliteHolder);
            case ActionId.FINALLY /* 89 */:
                return MailboxPresenceJNI.dispatchCqlOOO(2, ((Iar) this.A01).A03, sqliteHolder);
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                return MailboxPresenceJNI.dispatchDasmOOOO(0, ((Cxv) this.A01).A02, mailbox, sqliteHolder);
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                Iau iau = (Iau) this.A01;
                return MailboxPresenceJNI.dispatchDasmOOOOZ(1, iau.A03, mailbox, sqliteHolder, iau.A04);
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                Ibx ibx3 = (Ibx) this.A01;
                dispatchCqlOJO = MailboxQPJNI.dispatchCqlOIJJO(8, ibx3.A01, ibx3.A03, ibx3.A02, sqliteHolder);
                return new MailboxNullable(dispatchCqlOJO);
            case ActionId.ANIMATION_END /* 93 */:
                C3av c3av = (C3av) this.A01;
                return MailboxQPJNI.dispatchCqlOIIO(10, c3av.A01, c3av.A02, sqliteHolder);
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                CQLResultSet cQLResultSet33 = (CQLResultSet) MailboxQPJNI.dispatchCqlOJO(12, ((Iam) this.A01).A01, sqliteHolder);
                if (cQLResultSet33 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet33);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.MAIN_COMPLETE /* 95 */:
                IbF ibF = (IbF) this.A01;
                return MailboxQPJNI.dispatchDasmOIIIJOO(0, ibF.A01, ibF.A02, ibF.A00, ibF.A03, mailbox, sqliteHolder);
            case ActionId.INTERRUPTED /* 96 */:
                CQLResultSet cQLResultSet34 = (CQLResultSet) MailboxQPJNI.dispatchCqlOOO(1, ((Iap) this.A01).A03, sqliteHolder);
                if (cQLResultSet34 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet34);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                CQLResultSet cQLResultSet35 = (CQLResultSet) MailboxQPJNI.dispatchCqlOOO(4, ((C3ar) this.A01).A03, sqliteHolder);
                if (cQLResultSet35 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet35);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.NETWORK_RESPONSE /* 98 */:
                CQLResultSet cQLResultSet36 = (CQLResultSet) MailboxQPJNI.dispatchCqlOJO(6, ((A0J) this.A01).A01, sqliteHolder);
                if (cQLResultSet36 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet36);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                IbS ibS = (IbS) this.A01;
                return MailboxReactionV2JNI.dispatchDasmOJOOOOO(2, ibS.A00, ibS.A05, ibS.A04, ibS.A06, mailbox, sqliteHolder);
            case 100:
                Ibp ibp = (Ibp) this.A01;
                return MailboxReactionV2JNI.dispatchDasmOIJJJJJOOOOOOZ(3, ibp.A00, ibp.A01, ibp.A05, ibp.A03, ibp.A04, ibp.A02, ibp.A0A, null, ibp.A0B, ibp.A09, mailbox, sqliteHolder, ibp.A0C);
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                Ibh ibh = (Ibh) this.A01;
                return MailboxReactionV2JNI.dispatchDasmOIJJJJOOOO(4, ibh.A00, ibh.A04, ibh.A03, ibh.A02, ibh.A01, ibh.A07, ibh.A08, mailbox, sqliteHolder);
            case ActionId.DATA_LOAD_START /* 102 */:
                CQLResultSet cQLResultSet37 = (CQLResultSet) MailboxReactionV2JNI.dispatchCqlOOO(0, ((Iar) this.A01).A03, sqliteHolder);
                if (cQLResultSet37 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet37);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.LEGACY_MARKER /* 103 */:
                Ib5 ib5 = (Ib5) this.A01;
                CQLResultSet cQLResultSet38 = (CQLResultSet) MailboxReactionV2JNI.dispatchCqlOJOO(1, ib5.A01, ib5.A04, sqliteHolder);
                if (cQLResultSet38 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet38);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                IbN ibN3 = (IbN) this.A01;
                CQLResultSet cQLResultSet39 = (CQLResultSet) MailboxReactionV2JNI.dispatchCqlOOOOO(2, ibN3.A05, ibN3.A04, ibN3.A03, sqliteHolder);
                if (cQLResultSet39 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet39);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.ABORTED /* 105 */:
                Ib6 ib62 = (Ib6) this.A01;
                CQLResultSet cQLResultSet40 = (CQLResultSet) MailboxReactionV2JNI.dispatchCqlOOOO(3, ib62.A04, ib62.A03, sqliteHolder);
                if (cQLResultSet40 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet40);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.QUERY_READY /* 106 */:
                CQLResultSet cQLResultSet41 = (CQLResultSet) MailboxReactionV2JNI.dispatchCqlOOO(4, ((Iar) this.A01).A03, sqliteHolder);
                if (cQLResultSet41 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet41);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                return MailboxReactionV2JNI.dispatchDasmOOO(0, mailbox, sqliteHolder);
            case 108:
                Iaz iaz3 = (Iaz) this.A01;
                Object[] objArr4 = (Object[]) MailboxReplyReminderJNI.dispatchCqlOJOOZ(0, iaz3.A01, iaz3.A04, sqliteHolder, true);
                return new CEM((Number) objArr4[0], (Number) objArr4[1], (Number) objArr4[2], (Number) objArr4[4], (List) objArr4[3]);
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                return MailboxSearchJNI.dispatchCqlOJO(9, ((Iak) this.A01).A00, sqliteHolder);
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                CQLResultSet cQLResultSet42 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOO(13, ((Ias) this.A01).A03, sqliteHolder);
                if (cQLResultSet42 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet42);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.NEW_START_FOUND /* 111 */:
                Ib7 ib7 = (Ib7) this.A01;
                CQLResultSet cQLResultSet43 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOO(16, ib7.A04, ib7.A03, sqliteHolder);
                if (cQLResultSet43 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet43);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.MISSED_EVENT /* 112 */:
                A1Z a1z2 = (A1Z) this.A01;
                return MailboxSearchJNI.dispatchCqlOIJJO(18, 50, a1z2.A01, a1z2.A02, sqliteHolder);
            case ActionId.TIMEOUT /* 113 */:
                A1Z a1z3 = (A1Z) this.A01;
                return MailboxSearchJNI.dispatchCqlOJJO(19, a1z3.A01, a1z3.A02, sqliteHolder);
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                IbM ibM3 = (IbM) this.A01;
                CQLResultSet cQLResultSet44 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOIOOO(23, ibM3.A01, ibM3.A05, ibM3.A04, sqliteHolder);
                if (cQLResultSet44 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet44);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                return MailboxSearchJNI.dispatchCqlOO(2, sqliteHolder);
            case ActionId.VIDEO_PLAYING /* 116 */:
                CQLResultSet cQLResultSet45 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOIO(53, ((Ial) this.A01).A00, sqliteHolder);
                if (cQLResultSet45 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet45);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                CQLResultSet cQLResultSet46 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOO(54, sqliteHolder);
                if (cQLResultSet46 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet46);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                CQLResultSet cQLResultSet47 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOOZZ(58, ((Cxv) this.A01).A03, null, sqliteHolder, true, true);
                if (cQLResultSet47 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet47);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                CQLResultSet cQLResultSet48 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOO(62, sqliteHolder);
                if (cQLResultSet48 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet48);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                CQLResultSet cQLResultSet49 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOO(64, ((Cxk) this.A01).A02, sqliteHolder);
                if (cQLResultSet49 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet49);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                return MailboxSearchJNI.dispatchCqlOJO(65, ((Iay) this.A01).A01, sqliteHolder);
            case ActionId.CARD_DATA_LOADED /* 122 */:
                Iaw iaw2 = (Iaw) this.A01;
                CQLResultSet cQLResultSet50 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOO(66, iaw2.A03, iaw2.A02, sqliteHolder);
                if (cQLResultSet50 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet50);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                Iat iat = (Iat) this.A01;
                return MailboxSearchJNI.dispatchCqlOIJO(75, iat.A00, iat.A01, sqliteHolder);
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                return MailboxSearchJNI.dispatchDasmOOO(0, mailbox, sqliteHolder);
            case 125:
                return MailboxSearchJNI.dispatchDasmOOOO(1, ((Iar) this.A01).A03, mailbox, sqliteHolder);
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                return MailboxSearchJNI.dispatchDasmOOOO(6, ((Cxk) this.A01).A03, mailbox, sqliteHolder);
            case 127:
                return MailboxSearchJNI.dispatchDasmOOOO(11, ((Ib4) this.A01).A04, mailbox, sqliteHolder);
            case 128:
                Ib8 ib8 = (Ib8) this.A01;
                return MailboxSearchJNI.dispatchDasmOIOOO(13, ib8.A00, ib8.A04, mailbox, sqliteHolder);
            case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
                Ib6 ib63 = (Ib6) this.A01;
                Object[] objArr5 = (Object[]) MailboxShimJNI.dispatchCqlOIOOOO(19, 0, ib63.A03, ib63.A04, mailbox, sqliteHolder);
                return new HyD((Number) objArr5[0], (Number) objArr5[1]);
            case ActionId.APP_DID_FINISH_LAUNCHING /* 130 */:
                CQLResultSet cQLResultSet51 = (CQLResultSet) MailboxStatusJNI.dispatchCqlOJO(13, ((A0J) this.A01).A01, sqliteHolder);
                if (cQLResultSet51 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet51);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.APP_DID_BECOME_ACTIVE /* 131 */:
                Iaz iaz4 = (Iaz) this.A01;
                CQLResultSet cQLResultSet52 = (CQLResultSet) MailboxStickerJNI.dispatchCqlOJOOZZ(6, iaz4.A01, iaz4.A04, sqliteHolder, false, false);
                if (cQLResultSet52 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet52);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                Ib0 ib0 = (Ib0) this.A01;
                CQLResultSet cQLResultSet53 = (CQLResultSet) MailboxStickerJNI.dispatchCqlOOOZ(7, ib0.A03, sqliteHolder, ib0.A04);
                if (cQLResultSet53 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet53);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
                Ib9 ib9 = (Ib9) this.A01;
                return MailboxStickerJNI.dispatchDasmODIIJOOOO(0, 1.0d, 300, 200, ib9.A00, ib9.A04, ib9.A03, mailbox, sqliteHolder);
            case ActionId.APP_MAIN /* 134 */:
                return MailboxStickerJNI.dispatchDasmOJOO(1, ((Iao) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.MQTT_CONNECTING /* 135 */:
                Ibj ibj = (Ibj) this.A01;
                return MailboxStickerJNI.dispatchDasmODIIIOOOOOZZZ(2, 1.0d, 200, 300, ibj.A00, ibj.A05, ibj.A04, ibj.A03, mailbox, sqliteHolder, ibj.A07, ibj.A06, ibj.A08);
            case ActionId.MQTT_CONNECTED /* 136 */:
                CQLResultSet cQLResultSet54 = (CQLResultSet) MailboxStickerJNI.dispatchCqlOJO(1, ((Ibu) this.A01).A01, sqliteHolder);
                if (cQLResultSet54 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet54);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.MQTT_DISCONNECTED /* 137 */:
                CQLResultSet cQLResultSet55 = (CQLResultSet) MailboxStickerPickerJNI.dispatchCqlOOO(0, ((Iar) this.A01).A03, sqliteHolder);
                if (cQLResultSet55 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet55);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
                CQLResultSet cQLResultSet56 = (CQLResultSet) MailboxStickerPickerJNI.dispatchCqlOJJO(1, ((Iao) this.A01).A01, 888L, sqliteHolder);
                if (cQLResultSet56 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet56);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.APP_FIRST_VIEW_CONTROLLER /* 139 */:
                Iay iay = (Iay) this.A01;
                CQLResultSet cQLResultSet57 = (CQLResultSet) MailboxStickerPickerJNI.dispatchCqlOJJOOZZZZ(2, 888L, iay.A01, iay.A04, sqliteHolder, true, true, true, true);
                if (cQLResultSet57 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet57);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                return MailboxStickerPickerJNI.dispatchDasmODIIJOO(1, 2.0d, 192, 64, ((Ibu) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.MESSENGER_THREAD_LIST_DISPLAYED /* 141 */:
                return MailboxStickerPickerJNI.dispatchDasmOJOO(2, ((Ibu) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.PREV_ACTIVITY_PAUSE /* 142 */:
                Ib4 ib4 = (Ib4) this.A01;
                return MailboxStoriesJNI.dispatchDasmOIOOOO(4, 3, ib4.A02, ib4.A04, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_RESUME /* 143 */:
                CQLResultSet cQLResultSet58 = (CQLResultSet) MailboxStoriesJNI.dispatchCqlOOO(2, ((Ian) this.A01).A03, sqliteHolder);
                if (cQLResultSet58 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet58);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.ACTIVITY_START /* 144 */:
                CQLResultSet cQLResultSet59 = (CQLResultSet) MailboxStoriesJNI.dispatchCqlOOO(3, ((Ian) this.A01).A03, sqliteHolder);
                if (cQLResultSet59 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet59);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.BEGIN_START_ACTIVITY /* 145 */:
                CQLResultSet cQLResultSet60 = (CQLResultSet) MailboxStoriesJNI.dispatchCqlOOO(4, ((Ian) this.A01).A03, sqliteHolder);
                if (cQLResultSet60 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet60);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.END_START_ACTIVITY /* 146 */:
                CQLResultSet cQLResultSet61 = (CQLResultSet) MailboxStoriesJNI.dispatchCqlOOO(5, ((Ian) this.A01).A03, sqliteHolder);
                if (cQLResultSet61 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet61);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.FILE_SYSTEM_FAIL /* 147 */:
                CQLResultSet cQLResultSet62 = (CQLResultSet) MailboxStoriesJNI.dispatchCqlOJO(6, ((Iao) this.A01).A01, sqliteHolder);
                if (cQLResultSet62 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet62);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.FORMAT_ERROR /* 148 */:
                IbU ibU = (IbU) this.A01;
                Object[] objArr6 = (Object[]) MailboxTamJNI.dispatchCqlOJOOO(14, ibU.A02, ibU.A06, ibU.A05, sqliteHolder);
                return new HyE((Number) objArr6[0], (Number) objArr6[1]);
            case ActionId.PRIVACY_VIOLATION /* 149 */:
                Ibf ibf = (Ibf) this.A01;
                return MailboxTamJNI.dispatchCqlOJJOOOO(15, ibf.A02, ibf.A01, ibf.A05, ibf.A06, ibf.A07, sqliteHolder);
            case 150:
                return MailboxTamJNI.dispatchCqlOJOO(17, ((C3b8) this.A01).A02, null, sqliteHolder);
            case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                IbW ibW = (IbW) this.A01;
                return MailboxTamJNI.dispatchCqlOIJJOOOOO(18, 0, ibW.A01, ibW.A02, ibW.A06, null, null, ibW.A05, sqliteHolder);
            case ActionId.APPLY_OPTIMISTICS /* 152 */:
                return MailboxTamJNI.dispatchCqlOJOOO(19, 888L, ((Ibw) this.A01).A04, null, sqliteHolder);
            case ActionId.APPLY_FINISHED_LIST /* 153 */:
                return MailboxTamJNI.dispatchCqlOJOO(20, 888L, ((Ibw) this.A01).A04, sqliteHolder);
            case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                IbH ibH = (IbH) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(29, ibH.A02, ibH.A05, sqliteHolder);
            case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                return MailboxTamJNI.dispatchCqlOJO(31, ((C3b8) this.A01).A02, sqliteHolder);
            case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
                return MailboxTamJNI.dispatchCqlOJO(32, ((C3b8) this.A01).A02, sqliteHolder);
            case ActionId.WAIT_FOR_BLOCKERS /* 157 */:
                return MailboxTamJNI.dispatchCqlOJO(33, ((C3b8) this.A01).A02, sqliteHolder);
            case ActionId.NOTIFY_SUBSCRIBERS /* 158 */:
                IbQ ibQ = (IbQ) this.A01;
                return MailboxTamJNI.dispatchCqlOIIJOO(39, ibQ.A00, 0, ibQ.A02, ibQ.A05, sqliteHolder);
            case ActionId.FAIL_FILE_TOO_LARGE /* 159 */:
                CQLResultSet cQLResultSet63 = (CQLResultSet) MailboxTamJNI.dispatchCqlOJO(43, ((Iax) this.A01).A02, sqliteHolder);
                if (cQLResultSet63 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet63);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.OFFLINE /* 160 */:
                IbR ibR = (IbR) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(46, ibR.A01, ibR.A05, sqliteHolder);
            case ActionId.ASNYC_FAILED /* 161 */:
                IbU ibU2 = (IbU) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(48, ibU2.A02, ibU2.A06, sqliteHolder);
            case ActionId.ASYNC_FAIL /* 162 */:
                IbU ibU3 = (IbU) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(49, ibU3.A02, ibU3.A06, sqliteHolder);
            case ActionId.ON_ATTACH_FRAGMENT /* 163 */:
                CQLResultSet cQLResultSet64 = (CQLResultSet) MailboxTamJNI.dispatchCqlOJO(52, ((Iax) this.A01).A02, sqliteHolder);
                if (cQLResultSet64 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet64);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.VIEW_DID_APPEAR_BEGIN /* 164 */:
                return MailboxTamJNI.dispatchCqlOJO(53, ((Iax) this.A01).A02, sqliteHolder);
            case ActionId.DISPLAYED /* 165 */:
                dispatchCqlOJO = MailboxTamJNI.dispatchCqlOJO(55, ((C3b8) this.A01).A02, sqliteHolder);
                return new MailboxNullable(dispatchCqlOJO);
            case ActionId.DISPLAYED_ON_SCREEN /* 166 */:
                return MailboxTamJNI.dispatchCqlOJO(56, ((C3b8) this.A01).A02, sqliteHolder);
            case ActionId.ASYNC_ACTION_SUCCESS /* 167 */:
                IbA ibA = (IbA) this.A01;
                CQLResultSet cQLResultSet65 = (CQLResultSet) MailboxTamJNI.dispatchCqlOJJO(57, ibA.A02, ibA.A01, sqliteHolder);
                if (cQLResultSet65 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet65);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            case ActionId.ASYNC_ACTION_FAIL /* 168 */:
                Ibx ibx4 = (Ibx) this.A01;
                CQLResultSet cQLResultSet66 = (CQLResultSet) MailboxTamJNI.dispatchCqlOJJO(58, ibx4.A02, ibx4.A03, sqliteHolder);
                if (cQLResultSet66 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet66);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
            default:
                CQLResultSet cQLResultSet67 = (CQLResultSet) MailboxTamJNI.dispatchCqlOOO(61, ((Ibw) this.A01).A04, sqliteHolder);
                if (cQLResultSet67 != null) {
                    dispatchCqlOJO = new 1qX(cQLResultSet67);
                    return new MailboxNullable(dispatchCqlOJO);
                }
                break;
        }
        dispatchCqlOJO = null;
        return new MailboxNullable(dispatchCqlOJO);
    }
}
