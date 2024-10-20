package X;

import com.facebook.accountinformation.mca.MailboxAccountInformationJNI;
import com.facebook.acra.constants.ActionId;
import com.facebook.advancedcryptotransportdiskmanager.mca.MailboxAdvancedCryptoTransportDiskManagerJNI;
import com.facebook.aibots.mca.MailboxAIBotsJNI;
import com.facebook.attachments.mca.MailboxAttachmentsJNI;
import com.facebook.avatarartifacto.mca.MailboxAvatarArtifactoJNI;
import com.facebook.avatarquickreactions.mca.MailboxAvatarQuickReactionsJNI;
import com.facebook.badgecount.mca.MailboxBadgeCountJNI;
import com.facebook.bloksxma.mca.MailboxBloksXMAJNI;
import com.facebook.bots.mca.MailboxBotsJNI;
import com.facebook.businessfeedback.mca.MailboxBusinessFeedbackJNI;
import com.facebook.businessinbox.mca.MailboxBusinessInboxJNI;
import com.facebook.businessrtcsettings.mca.MailboxBusinessRTCSettingsJNI;
import com.facebook.businessthreadmanagement.mca.MailboxBusinessThreadManagementJNI;
import com.facebook.clientnotificationssilentpush.mca.MailboxClientNotificationsSilentPushJNI;
import com.facebook.community.mca.MailboxCommunityJNI;
import com.facebook.communitychatsuggestedactions.mca.MailboxCommunityChatSuggestedActionsJNI;
import com.facebook.communitymessagingtrending.mca.MailboxCommunityMessagingTrendingJNI;
import com.facebook.contactsharesettings.mca.MailboxContactShareSettingsJNI;
import com.facebook.contactupload.mca.MailboxContactUploadJNI;
import com.facebook.copresence.mca.MailboxCopresenceJNI;
import com.facebook.cuckoo.mca.MailboxCuckooJNI;
import com.facebook.cutover.mca.MailboxCutoverJNI;
import com.facebook.events.mca.MailboxEventsJNI;
import com.facebook.extendedreactions.mca.MailboxExtendedReactionsJNI;
import com.facebook.familycentersupervision.mca.MailboxFamilyCenterSupervisionJNI;
import com.facebook.featurelimits.mca.MailboxFeatureLimitsJNI;
import com.facebook.fxcal.mca.MailboxFXCALJNI;
import com.facebook.globaldeletesettings.mca.MailboxGlobalDeleteSettingsJNI;
import com.facebook.highlightstab.mca.MailboxHighlightsTabJNI;
import com.facebook.inboxfolders.mca.MailboxInboxFoldersJNI;
import com.facebook.locationsharing.mca.MailboxLocationSharingJNI;
import com.facebook.magicalmessenger.mca.MailboxMagicalMessengerJNI;
import com.facebook.markinboxfolderseen.mca.MailboxMarkInboxFolderSeenJNI;
import com.facebook.memories.mca.MailboxMemoriesJNI;
import com.facebook.messagingprivacysettings.mca.MailboxMessagingPrivacySettingsJNI;
import com.facebook.messengerfoldermetadata.mca.MailboxMessengerFolderMetadataJNI;
import com.facebook.msgpinnedmessages.mca.MailboxMSGPinnedMessagesJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.orca.mca.MailboxOrcaJNI;
import com.facebook.polls.mca.MailboxPollsJNI;
import com.facebook.presence.mca.MailboxPresenceJNI;
import com.facebook.professionalmode.mca.MailboxProfessionalModeJNI;
import com.facebook.qp.mca.MailboxQPJNI;
import com.facebook.reachabilitysettings.mca.MailboxReachabilitySettingsJNI;
import com.facebook.reactionv2.mca.MailboxReactionV2JNI;
import com.facebook.recentmessages.mca.MailboxRecentMessagesJNI;
import com.facebook.rollcall.mca.MailboxRollCallJNI;
import com.facebook.roomschat.mca.MailboxRoomsChatJNI;
import com.facebook.rtc.mca.MailboxRTCJNI;
import com.facebook.safetyinterventions.mca.MailboxSafetyInterventionsJNI;
import com.facebook.search.mca.MailboxSearchJNI;
import com.facebook.sharedalbum.mca.MailboxSharedAlbumJNI;
import com.facebook.shim.mca.MailboxShimJNI;
import com.facebook.status.mca.MailboxStatusJNI;
import com.facebook.syncstates.mca.MailboxSyncStatesJNI;
import com.facebook.tam.mca.MailboxTamJNI;
import com.facebook.thread.mca.MailboxThreadJNI;
import com.facebook.threadactionsystem.mca.MailboxThreadActionSystemJNI;
import com.facebook.threadattachments.mca.MailboxThreadAttachmentsJNI;
import com.facebook.threadbans.mca.MailboxThreadBansJNI;
import com.facebook.threadcapability.mca.MailboxThreadCapabilityJNI;
import com.facebook.threademoji.mca.MailboxThreadEmojiJNI;
import com.facebook.threadsubscriptions.mca.MailboxThreadSubscriptionsJNI;
import com.facebook.topbanners.mca.MailboxTopBannersJNI;
import com.facebook.translation.mca.MailboxTranslationJNI;
import com.facebook.userprefsbool.mca.MailboxUserPrefsBoolJNI;
import com.facebook.userprefsint.mca.MailboxUserPrefsIntJNI;
import com.facebook.userprefsstring.mca.MailboxUserPrefsStringJNI;
import com.facebook.uservisibleerror.mca.MailboxUserVisibleErrorJNI;
import com.facebook.voicemessages.mca.MailboxVoiceMessagesJNI;

/* loaded from: A1g.class */
public final class A1g implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public A1g(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static long A00(A1g a1g) {
        return ((A1U) a1g.A01).A01;
    }

    public static A1g A01(Object obj, int i) {
        return new A1g(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        1qX r304;
        switch (this.A00) {
            case 0:
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxAccountInformationJNI.dispatchCqlOJO(0, A00(this), sqliteHolder);
                if (cQLResultSet != null) {
                    r304 = new 1qX(cQLResultSet);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 1:
                return MailboxAccountInformationJNI.dispatchDasmOJOO(0, ((C3aq) this.A01).A01, mailbox, sqliteHolder);
            case 2:
                return 7zL.A0s(MailboxAdvancedCryptoTransportDiskManagerJNI.dispatchCqlOO(1, sqliteHolder));
            case 3:
                return MailboxAIBotsJNI.dispatchDasmOOO(0, mailbox, sqliteHolder);
            case 4:
                return MailboxAIBotsJNI.dispatchDasmOJOO(1, A00(this), mailbox, sqliteHolder);
            case 5:
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxAttachmentsJNI.dispatchCqlOJO(3, A00(this), sqliteHolder);
                if (cQLResultSet2 != null) {
                    r304 = new 1qX(cQLResultSet2);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 6:
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxAvatarArtifactoJNI.dispatchCqlOJO(0, A00(this), sqliteHolder);
                if (cQLResultSet3 != null) {
                    r304 = new 1qX(cQLResultSet3);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 7:
                CQLResultSet cQLResultSet4 = (CQLResultSet) MailboxAvatarArtifactoJNI.dispatchCqlOOO(1, ((A1V) this.A01).A03, sqliteHolder);
                if (cQLResultSet4 != null) {
                    r304 = new 1qX(cQLResultSet4);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 8:
                CQLResultSet cQLResultSet5 = (CQLResultSet) MailboxAvatarArtifactoJNI.dispatchCqlOOO(2, ((A1V) this.A01).A03, sqliteHolder);
                if (cQLResultSet5 != null) {
                    r304 = new 1qX(cQLResultSet5);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 9:
                A0S a0s = (A0S) this.A01;
                CQLResultSet cQLResultSet6 = (CQLResultSet) MailboxAvatarArtifactoJNI.dispatchCqlOOOO(4, a0s.A04, a0s.A03, sqliteHolder);
                if (cQLResultSet6 != null) {
                    r304 = new 1qX(cQLResultSet6);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 10:
                CQLResultSet cQLResultSet7 = (CQLResultSet) MailboxAvatarQuickReactionsJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet7 != null) {
                    r304 = new 1qX(cQLResultSet7);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 11:
                CQLResultSet cQLResultSet8 = (CQLResultSet) MailboxBadgeCountJNI.dispatchCqlOOOZ(0, mailbox, sqliteHolder, true);
                if (cQLResultSet8 != null) {
                    r304 = new 1qX(cQLResultSet8);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 12:
                A0R a0r = (A0R) this.A01;
                return MailboxBloksXMAJNI.dispatchDasmOJOOO(1, a0r.A01, a0r.A04, mailbox, sqliteHolder);
            case 13:
                return MailboxBotsJNI.dispatchDasmOJOO(0, A00(this), mailbox, sqliteHolder);
            case 14:
                CQLResultSet cQLResultSet9 = (CQLResultSet) MailboxBusinessFeedbackJNI.dispatchCqlOJO(0, ((A0D) this.A01).A01, sqliteHolder);
                if (cQLResultSet9 != null) {
                    r304 = new 1qX(cQLResultSet9);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 15:
                A0o a0o = (A0o) this.A01;
                return MailboxBusinessInboxJNI.dispatchDasmOJOOOOO(1, a0o.A01, a0o.A06, a0o.A05, a0o.A04, mailbox, sqliteHolder);
            case 16:
                A1W a1w = (A1W) this.A01;
                return MailboxBusinessRTCSettingsJNI.dispatchDasmOJJOO(2, a1w.A01, a1w.A02, mailbox, sqliteHolder);
            case 17:
                A1W a1w2 = (A1W) this.A01;
                return MailboxBusinessThreadManagementJNI.dispatchDasmOJJOO(0, a1w2.A02, a1w2.A01, mailbox, sqliteHolder);
            case 18:
                C3aw c3aw = (C3aw) this.A01;
                CQLResultSet cQLResultSet10 = (CQLResultSet) MailboxClientNotificationsSilentPushJNI.dispatchCqlOOOOOO(0, "main-app", c3aw.A04, c3aw.A02, c3aw.A05, sqliteHolder);
                if (cQLResultSet10 != null) {
                    r304 = new 1qX(cQLResultSet10);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 19:
                return MailboxCommunityJNI.dispatchDasmOOOO(33, ((A1e) this.A01).A03, mailbox, sqliteHolder);
            case 20:
                CQLResultSet cQLResultSet11 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOOZ(11, sqliteHolder, ((C87u) this.A01).A03);
                if (cQLResultSet11 != null) {
                    r304 = new 1qX(cQLResultSet11);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 21:
                return MailboxCommunityJNI.dispatchDasmOJOO(51, A00(this), mailbox, sqliteHolder);
            case 22:
                return MailboxCommunityJNI.dispatchDasmOJOO(65, A00(this), mailbox, sqliteHolder);
            case 23:
                A0k a0k = (A0k) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIIJJOO(79, a0k.A02, a0k.A01, a0k.A03, a0k.A04, mailbox, sqliteHolder);
            case 24:
                return MailboxCommunityJNI.dispatchDasmOIJOO(91, 0, ((A1U) this.A01).A01, mailbox, sqliteHolder);
            case 25:
                A0b a0b = (A0b) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOOO(108, a0b.A02, a0b.A01, a0b.A05, mailbox, sqliteHolder);
            case 26:
                Rsg rsg = (Rsg) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOOOOOO(ActionId.MISSED_EVENT, rsg.A00, rsg.A01, rsg.A08, rsg.A06, rsg.A05, rsg.A07, mailbox, sqliteHolder);
            case 27:
                return MailboxCommunityJNI.dispatchDasmOOOO(ActionId.CARD_DATA_LOADED, ((A1e) this.A01).A02, mailbox, sqliteHolder);
            case 28:
                CQLResultSet cQLResultSet12 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOJO(29, ((A0O) this.A01).A01, sqliteHolder);
                if (cQLResultSet12 != null) {
                    r304 = new 1qX(cQLResultSet12);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 29:
                CQLResultSet cQLResultSet13 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOOO(46, ((A1Y) this.A01).A04, sqliteHolder);
                if (cQLResultSet13 != null) {
                    r304 = new 1qX(cQLResultSet13);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 30:
                A0N a0n = (A0N) this.A01;
                return MailboxCommunityChatSuggestedActionsJNI.dispatchCqlOJOZ(2, a0n.A01, sqliteHolder, a0n.A04);
            case 31:
                CQLResultSet cQLResultSet14 = (CQLResultSet) MailboxCommunityMessagingTrendingJNI.dispatchCqlOIO(0, ((A0G) this.A01).A01, sqliteHolder);
                if (cQLResultSet14 != null) {
                    r304 = new 1qX(cQLResultSet14);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 32:
                A0k a0k2 = (A0k) this.A01;
                return MailboxCommunityMessagingTrendingJNI.dispatchDasmOIIJJOO(0, a0k2.A02, a0k2.A01, a0k2.A03, a0k2.A04, mailbox, sqliteHolder);
            case 33:
                return MailboxCommunityMessagingTrendingJNI.dispatchDasmOJOO(1, A00(this), mailbox, sqliteHolder);
            case 34:
                return MailboxContactShareSettingsJNI.dispatchDasmOIOO(1, ((A0Z) this.A01).A01, mailbox, sqliteHolder);
            case 35:
                CQLResultSet cQLResultSet15 = (CQLResultSet) MailboxContactUploadJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet15 != null) {
                    r304 = new 1qX(cQLResultSet15);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 36:
                CQLResultSet cQLResultSet16 = (CQLResultSet) MailboxCopresenceJNI.dispatchCqlOJO(0, A00(this), sqliteHolder);
                if (cQLResultSet16 != null) {
                    r304 = new 1qX(cQLResultSet16);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 37:
                return MailboxCopresenceJNI.dispatchDasmOOO(1, mailbox, sqliteHolder);
            case 38:
                CQLResultSet cQLResultSet17 = (CQLResultSet) MailboxCuckooJNI.dispatchCqlOOZ(9, sqliteHolder, true);
                if (cQLResultSet17 != null) {
                    r304 = new 1qX(cQLResultSet17);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 39:
                CQLResultSet cQLResultSet18 = (CQLResultSet) MailboxCuckooJNI.dispatchCqlOO(10, sqliteHolder);
                if (cQLResultSet18 != null) {
                    r304 = new 1qX(cQLResultSet18);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 40:
                return 7zL.A0s(MailboxCuckooJNI.dispatchCqlOJO(0, A00(this), sqliteHolder));
            case 41:
                CQLResultSet cQLResultSet19 = (CQLResultSet) MailboxCuckooJNI.dispatchCqlOO(3, sqliteHolder);
                if (cQLResultSet19 != null) {
                    r304 = new 1qX(cQLResultSet19);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 42:
                CQLResultSet cQLResultSet20 = (CQLResultSet) MailboxCuckooJNI.dispatchCqlOO(5, sqliteHolder);
                if (cQLResultSet20 != null) {
                    r304 = new 1qX(cQLResultSet20);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 43:
                CQLResultSet cQLResultSet21 = (CQLResultSet) MailboxCuckooJNI.dispatchCqlOO(6, sqliteHolder);
                if (cQLResultSet21 != null) {
                    r304 = new 1qX(cQLResultSet21);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return 7zL.A0s(MailboxCuckooJNI.dispatchCqlOO(7, sqliteHolder));
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return 7zL.A0s(MailboxCutoverJNI.dispatchCqlOO(9, sqliteHolder));
            case 46:
                return 7zL.A0s(MailboxCutoverJNI.dispatchCqlOJO(3, A00(this), sqliteHolder));
            case ActionId.ON_START_END /* 47 */:
                A0N a0n2 = (A0N) this.A01;
                Object[] objArr = (Object[]) MailboxCutoverJNI.dispatchCqlOJOZ(5, a0n2.A01, sqliteHolder, a0n2.A04);
                return new C9fm((Boolean) objArr[1], (Number) objArr[0], (Number) objArr[4], (String) objArr[2]);
            case ActionId.QUEUED /* 48 */:
                CQLResultSet cQLResultSet22 = (CQLResultSet) MailboxEventsJNI.dispatchCqlOJO(0, A00(this), sqliteHolder);
                if (cQLResultSet22 != null) {
                    r304 = new 1qX(cQLResultSet22);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.IN_PROGRESS /* 49 */:
                A0m a0m = (A0m) this.A01;
                return MailboxExtendedReactionsJNI.dispatchDasmOJJJOOO(0, a0m.A03, a0m.A02, a0m.A01, a0m.A06, mailbox, sqliteHolder);
            case 50:
                return 7zL.A0s(MailboxFamilyCenterSupervisionJNI.dispatchCqlOO(0, sqliteHolder));
            case ActionId.UNKNOWN /* 51 */:
                CQLResultSet cQLResultSet23 = (CQLResultSet) MailboxFamilyCenterSupervisionJNI.dispatchCqlOO(1, sqliteHolder);
                if (cQLResultSet23 != null) {
                    r304 = new 1qX(cQLResultSet23);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                CQLResultSet cQLResultSet24 = (CQLResultSet) MailboxFamilyCenterSupervisionJNI.dispatchCqlOO(2, sqliteHolder);
                if (cQLResultSet24 != null) {
                    r304 = new 1qX(cQLResultSet24);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                CQLResultSet cQLResultSet25 = (CQLResultSet) MailboxFamilyCenterSupervisionJNI.dispatchCqlOO(3, sqliteHolder);
                if (cQLResultSet25 != null) {
                    r304 = new 1qX(cQLResultSet25);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                A0b a0b2 = (A0b) this.A01;
                return MailboxFamilyCenterSupervisionJNI.dispatchDasmOJJOOO(0, a0b2.A02, a0b2.A01, a0b2.A05, mailbox, sqliteHolder);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                CQLResultSet cQLResultSet26 = (CQLResultSet) MailboxFeatureLimitsJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet26 != null) {
                    r304 = new 1qX(cQLResultSet26);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.QUEUEING_FAIL /* 56 */:
                CQLResultSet cQLResultSet27 = (CQLResultSet) MailboxFXCALJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet27 != null) {
                    r304 = new 1qX(cQLResultSet27);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return MailboxGlobalDeleteSettingsJNI.dispatchCqlOO(0, sqliteHolder);
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                return MailboxGlobalDeleteSettingsJNI.dispatchCqlOO(1, sqliteHolder);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                A0R a0r2 = (A0R) this.A01;
                CQLResultSet cQLResultSet28 = (CQLResultSet) MailboxHighlightsTabJNI.dispatchCqlOJOO(7, a0r2.A01, a0r2.A04, sqliteHolder);
                if (cQLResultSet28 != null) {
                    r304 = new 1qX(cQLResultSet28);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                return MailboxHighlightsTabJNI.dispatchCqlOOO(9, ((A1V) this.A01).A03, sqliteHolder);
            case ActionId.COUNTER /* 61 */:
                return MailboxHighlightsTabJNI.dispatchDasmOOOO(0, ((A0a) this.A01).A04, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A0i a0i = (A0i) this.A01;
                return MailboxHighlightsTabJNI.dispatchDasmOOOOO(4, a0i.A02, a0i.A04, mailbox, sqliteHolder);
            case 63:
                return MailboxHighlightsTabJNI.dispatchDasmOOOO(5, ((A0a) this.A01).A04, mailbox, sqliteHolder);
            case 64:
                return MailboxHighlightsTabJNI.dispatchCqlOO(4, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                return MailboxInboxFoldersJNI.dispatchDasmOJOO(1, A00(this), mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A0v a0v = (A0v) this.A01;
                return MailboxLocationSharingJNI.dispatchDasmOJOOOOOO(0, a0v.A01, a0v.A05, a0v.A06, a0v.A07, a0v.A04, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A0M a0m2 = (A0M) this.A01;
                return 7zL.A0s(MailboxLocationSharingJNI.dispatchDasmODDOOO(1, a0m2.A01, a0m2.A00, "MESSENGER_ANDROID_LOCATION_SHARING", mailbox, sqliteHolder));
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A0O a0o2 = (A0O) this.A01;
                return MailboxMagicalMessengerJNI.dispatchCqlOJOO(5, a0o2.A01, a0o2.A04, sqliteHolder);
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                A0O a0o3 = (A0O) this.A01;
                return MailboxMagicalMessengerJNI.dispatchCqlOJOO(6, a0o3.A01, a0o3.A04, sqliteHolder);
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                return MailboxMarkInboxFolderSeenJNI.dispatchDasmOJOO(0, A00(this), mailbox, sqliteHolder);
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                CQLResultSet cQLResultSet29 = (CQLResultSet) MailboxMemoriesJNI.dispatchCqlOOO(1, ((A1V) this.A01).A03, sqliteHolder);
                if (cQLResultSet29 != null) {
                    r304 = new 1qX(cQLResultSet29);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                CQLResultSet cQLResultSet30 = (CQLResultSet) MailboxMemoriesJNI.dispatchCqlOOO(2, ((A1V) this.A01).A03, sqliteHolder);
                if (cQLResultSet30 != null) {
                    r304 = new 1qX(cQLResultSet30);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.INTENT_MAPPED /* 73 */:
                return MailboxMemoriesJNI.dispatchDasmOOO(2, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                return MailboxMemoriesJNI.dispatchDasmOOO(3, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                return MailboxMemoriesJNI.dispatchDasmOOO(4, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_STARTED /* 76 */:
                return MailboxMemoriesJNI.dispatchDasmOOO(5, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A0p a0p = (A0p) this.A01;
                return MailboxMemoriesJNI.dispatchDasmOJOOOOO(6, a0p.A01, a0p.A06, a0p.A05, a0p.A04, mailbox, sqliteHolder);
            case ActionId.FRAGMENT_CREATED /* 78 */:
                return MailboxMemoriesJNI.dispatchDasmOOOOZ(8, ((A1V) this.A01).A03, mailbox, sqliteHolder, true);
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A0H a0h = (A0H) this.A01;
                return MailboxMemoriesJNI.dispatchDasmOOOOZ(10, a0h.A03, mailbox, sqliteHolder, a0h.A04);
            case 80:
                return MailboxMemoriesJNI.dispatchDasmOOOO(11, ((A1V) this.A01).A03, mailbox, sqliteHolder);
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                return MailboxMessagingPrivacySettingsJNI.dispatchDasmOIOO(0, ((A0G) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                return MailboxMessagingPrivacySettingsJNI.dispatchCqlOIO(0, ((A0G) this.A01).A01, sqliteHolder);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                CQLResultSet cQLResultSet31 = (CQLResultSet) MailboxMessengerFolderMetadataJNI.dispatchCqlOO(1, sqliteHolder);
                if (cQLResultSet31 != null) {
                    r304 = new 1qX(cQLResultSet31);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.MARKER_SWAPPED /* 84 */:
                A1W a1w3 = (A1W) this.A01;
                Object[] objArr2 = (Object[]) MailboxMSGPinnedMessagesJNI.dispatchCqlOJJO(0, a1w3.A02, a1w3.A01, sqliteHolder);
                return new 9fK((String) objArr2[0], (Number) objArr2[1]);
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A0w a0w = (A0w) this.A01;
                return MailboxMSGPinnedMessagesJNI.dispatchDasmOIJJOOO(1, a0w.A01, a0w.A03, a0w.A02, a0w.A07, mailbox, sqliteHolder);
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                CQLResultSet cQLResultSet32 = (CQLResultSet) MailboxOrcaJNI.dispatchCqlOIO(8, 32, sqliteHolder);
                if (cQLResultSet32 != null) {
                    r304 = new 1qX(cQLResultSet32);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.ERROR /* 87 */:
                CQLResultSet cQLResultSet33 = (CQLResultSet) MailboxOrcaJNI.dispatchCqlOIO(2, 32, sqliteHolder);
                if (cQLResultSet33 != null) {
                    r304 = new 1qX(cQLResultSet33);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.METHOD_INVOKE /* 88 */:
                CQLResultSet cQLResultSet34 = (CQLResultSet) MailboxOrcaJNI.dispatchCqlOOOO(5, ((C3at) this.A01).A04, null, sqliteHolder);
                if (cQLResultSet34 != null) {
                    r304 = new 1qX(cQLResultSet34);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.FINALLY /* 89 */:
                A0Z a0z = (A0Z) this.A01;
                CQLResultSet cQLResultSet35 = (CQLResultSet) MailboxOrcaJNI.dispatchCqlOOOO(6, a0z.A05, a0z.A03, sqliteHolder);
                if (cQLResultSet35 != null) {
                    r304 = new 1qX(cQLResultSet35);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                A1W a1w4 = (A1W) this.A01;
                CQLResultSet cQLResultSet36 = (CQLResultSet) MailboxPollsJNI.dispatchCqlOJJO(1, a1w4.A01, a1w4.A02, sqliteHolder);
                if (cQLResultSet36 != null) {
                    r304 = new 1qX(cQLResultSet36);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                A0n a0n3 = (A0n) this.A01;
                return MailboxPollsJNI.dispatchDasmOJOOOO(0, a0n3.A01, a0n3.A06, a0n3.A04, mailbox, sqliteHolder);
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                A0n a0n4 = (A0n) this.A01;
                return MailboxPollsJNI.dispatchDasmOJOOOO(1, a0n4.A01, a0n4.A06, a0n4.A04, mailbox, sqliteHolder);
            case ActionId.ANIMATION_END /* 93 */:
                CQLResultSet cQLResultSet37 = (CQLResultSet) MailboxPresenceJNI.dispatchCqlOOZ(1, sqliteHolder, ((C3au) this.A01).A04);
                if (cQLResultSet37 != null) {
                    r304 = new 1qX(cQLResultSet37);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                CQLResultSet cQLResultSet38 = (CQLResultSet) MailboxProfessionalModeJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet38 != null) {
                    r304 = new 1qX(cQLResultSet38);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.MAIN_COMPLETE /* 95 */:
                return MailboxProfessionalModeJNI.dispatchDasmOOOZ(0, mailbox, sqliteHolder, ((C87u) this.A01).A03);
            case ActionId.INTERRUPTED /* 96 */:
                CQLResultSet cQLResultSet39 = (CQLResultSet) MailboxQPJNI.dispatchCqlOOO(2, ((A1V) this.A01).A03, sqliteHolder);
                if (cQLResultSet39 != null) {
                    r304 = new 1qX(cQLResultSet39);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.NETWORK_FAILED /* 97 */:
                A0S a0s2 = (A0S) this.A01;
                return MailboxQPJNI.dispatchCqlOIOOO(3, 1, a0s2.A04, a0s2.A03, sqliteHolder);
            case ActionId.NETWORK_RESPONSE /* 98 */:
                A0w a0w2 = (A0w) this.A01;
                return MailboxQPJNI.dispatchCqlOIJJOO(7, a0w2.A01, a0w2.A03, a0w2.A02, a0w2.A07, sqliteHolder);
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A1X a1x = (A1X) this.A01;
                return MailboxReachabilitySettingsJNI.dispatchDasmOIJOO(1, a1x.A01, a1x.A02, mailbox, sqliteHolder);
            case 100:
                A0c a0c = (A0c) this.A01;
                return MailboxReactionV2JNI.dispatchDasmOJOOO(1, a0c.A01, a0c.A05, mailbox, sqliteHolder);
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                CQLResultSet cQLResultSet40 = (CQLResultSet) MailboxRecentMessagesJNI.dispatchCqlOOO(0, ((A0C) this.A01).A03, sqliteHolder);
                if (cQLResultSet40 != null) {
                    r304 = new 1qX(cQLResultSet40);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.DATA_LOAD_START /* 102 */:
                CQLResultSet cQLResultSet41 = (CQLResultSet) MailboxRecentMessagesJNI.dispatchCqlOOO(1, ((A0C) this.A01).A03, sqliteHolder);
                if (cQLResultSet41 != null) {
                    r304 = new 1qX(cQLResultSet41);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.LEGACY_MARKER /* 103 */:
                A1W a1w5 = (A1W) this.A01;
                return MailboxRollCallJNI.dispatchDasmOJJOO(0, a1w5.A02, a1w5.A01, mailbox, sqliteHolder);
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                A0d a0d = (A0d) this.A01;
                return MailboxRollCallJNI.dispatchDasmOJJOOOOO(1, a0d.A01, a0d.A00, a0d.A04, null, a0d.A05, mailbox, sqliteHolder);
            case ActionId.ABORTED /* 105 */:
                A0p a0p2 = (A0p) this.A01;
                return 7zL.A0s(MailboxRollCallJNI.dispatchDasmOJOOOOO(2, a0p2.A01, a0p2.A05, a0p2.A04, a0p2.A06, mailbox, sqliteHolder));
            case ActionId.QUERY_READY /* 106 */:
                A0c a0c2 = (A0c) this.A01;
                Object[] objArr3 = (Object[]) MailboxRollCallJNI.dispatchDasmOJOOOOO(3, a0c2.A01, a0c2.A05, a0c2.A04, null, mailbox, sqliteHolder);
                return new 9fL((Number) objArr3[0], (Number) objArr3[1]);
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                A1W a1w6 = (A1W) this.A01;
                return MailboxRollCallJNI.dispatchDasmOJJOO(4, a1w6.A02, a1w6.A01, mailbox, sqliteHolder);
            case 108:
                A1W a1w7 = (A1W) this.A01;
                return 7zL.A0s(MailboxRollCallJNI.dispatchDasmOJJOOZ(5, a1w7.A02, a1w7.A01, mailbox, sqliteHolder, false));
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                CQLResultSet cQLResultSet42 = (CQLResultSet) MailboxRoomsChatJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet42 != null) {
                    r304 = new 1qX(cQLResultSet42);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                CQLResultSet cQLResultSet43 = (CQLResultSet) MailboxRTCJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet43 != null) {
                    r304 = new 1qX(cQLResultSet43);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.NEW_START_FOUND /* 111 */:
                CQLResultSet cQLResultSet44 = (CQLResultSet) MailboxSafetyInterventionsJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet44 != null) {
                    r304 = new 1qX(cQLResultSet44);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.MISSED_EVENT /* 112 */:
                A1a a1a = (A1a) this.A01;
                return MailboxSearchJNI.dispatchDasmOIOOOOO(5, a1a.A01, a1a.A07, a1a.A05, a1a.A06, mailbox, sqliteHolder);
            case ActionId.TIMEOUT /* 113 */:
                CQLResultSet cQLResultSet45 = (CQLResultSet) MailboxSharedAlbumJNI.dispatchCqlOJO(0, A00(this), sqliteHolder);
                if (cQLResultSet45 != null) {
                    r304 = new 1qX(cQLResultSet45);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                A1W a1w8 = (A1W) this.A01;
                return MailboxSharedAlbumJNI.dispatchDasmOJJOO(0, a1w8.A02, a1w8.A01, mailbox, sqliteHolder);
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                A0b a0b3 = (A0b) this.A01;
                return MailboxSharedAlbumJNI.dispatchDasmOJJOOO(5, a0b3.A02, a0b3.A01, a0b3.A05, mailbox, sqliteHolder);
            case ActionId.VIDEO_PLAYING /* 116 */:
                A0c a0c3 = (A0c) this.A01;
                Object[] objArr4 = (Object[]) MailboxSharedAlbumJNI.dispatchDasmOJOOOO(7, a0c3.A01, a0c3.A05, a0c3.A03, mailbox, sqliteHolder);
                return new 9fM((Number) objArr4[0], (java.util.Map) objArr4[1]);
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                Object[] objArr5 = (Object[]) MailboxShimJNI.dispatchCqlOIOOOOZZ(18, 0, ((A1e) this.A01).A03, null, mailbox, sqliteHolder, true, false);
                return new C9fN((Number) objArr5[0], (Number) objArr5[1]);
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                A0Z a0z2 = (A0Z) this.A01;
                return MailboxShimJNI.dispatchCqlOIOOO(34, a0z2.A01, a0z2.A03, a0z2.A05, sqliteHolder);
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                return 7zL.A0s(MailboxShimJNI.dispatchCqlOJO(46, A00(this), sqliteHolder));
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                return 7zL.A0s(MailboxShimJNI.dispatchCqlOJO(52, A00(this), sqliteHolder));
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                return MailboxStatusJNI.dispatchCqlOJO(12, A00(this), sqliteHolder);
            case ActionId.CARD_DATA_LOADED /* 122 */:
                CQLResultSet cQLResultSet46 = (CQLResultSet) MailboxStatusJNI.dispatchCqlOO(15, sqliteHolder);
                if (cQLResultSet46 != null) {
                    r304 = new 1qX(cQLResultSet46);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                CQLResultSet cQLResultSet47 = (CQLResultSet) MailboxStatusJNI.dispatchCqlOIO(16, ((A0G) this.A01).A01, sqliteHolder);
                if (cQLResultSet47 != null) {
                    r304 = new 1qX(cQLResultSet47);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                CQLResultSet cQLResultSet48 = (CQLResultSet) MailboxStatusJNI.dispatchCqlOO(17, sqliteHolder);
                if (cQLResultSet48 != null) {
                    r304 = new 1qX(cQLResultSet48);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case 125:
                CQLResultSet cQLResultSet49 = (CQLResultSet) MailboxStatusJNI.dispatchCqlOIO(0, ((A0G) this.A01).A01, sqliteHolder);
                if (cQLResultSet49 != null) {
                    r304 = new 1qX(cQLResultSet49);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                return MailboxStatusJNI.dispatchDasmOJOO(1, ((A0O) this.A01).A01, mailbox, sqliteHolder);
            case 127:
                A0Z a0z3 = (A0Z) this.A01;
                return MailboxStatusJNI.dispatchDasmOIOOO(5, a0z3.A01, a0z3.A05, mailbox, sqliteHolder);
            case 128:
                A0c a0c4 = (A0c) this.A01;
                return MailboxStatusJNI.dispatchDasmOJOOO(6, a0c4.A01, a0c4.A05, mailbox, sqliteHolder);
            case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
                CQLResultSet cQLResultSet50 = (CQLResultSet) MailboxStatusJNI.dispatchCqlOO(2, sqliteHolder);
                if (cQLResultSet50 != null) {
                    r304 = new 1qX(cQLResultSet50);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.APP_DID_FINISH_LAUNCHING /* 130 */:
                CQLResultSet cQLResultSet51 = (CQLResultSet) MailboxSyncStatesJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet51 != null) {
                    r304 = new 1qX(cQLResultSet51);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.APP_DID_BECOME_ACTIVE /* 131 */:
                return MailboxTamJNI.dispatchCqlOJOO(16, ((A1X) this.A01).A02, null, sqliteHolder);
            case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                A0r a0r3 = (A0r) this.A01;
                return 7zL.A0s(MailboxTamJNI.dispatchCqlOIJJJO(1, a0r3.A01, a0r3.A04, a0r3.A03, a0r3.A02, sqliteHolder));
            case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
                return MailboxTamJNI.dispatchCqlOJO(62, ((A1X) this.A01).A02, sqliteHolder);
            case ActionId.APP_MAIN /* 134 */:
                return 7zL.A0s(MailboxTamJNI.dispatchCqlOJO(71, ((A1X) this.A01).A02, sqliteHolder));
            case ActionId.MQTT_CONNECTING /* 135 */:
                CQLResultSet cQLResultSet52 = (CQLResultSet) MailboxThreadJNI.dispatchCqlOJO(0, ((C3aq) this.A01).A01, sqliteHolder);
                if (cQLResultSet52 != null) {
                    r304 = new 1qX(cQLResultSet52);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.MQTT_CONNECTED /* 136 */:
                return MailboxThreadActionSystemJNI.dispatchDasmOJOO(0, A00(this), mailbox, sqliteHolder);
            case ActionId.MQTT_DISCONNECTED /* 137 */:
                A0m a0m3 = (A0m) this.A01;
                return MailboxThreadActionSystemJNI.dispatchDasmOJJJOOO(1, a0m3.A01, a0m3.A03, a0m3.A02, a0m3.A06, mailbox, sqliteHolder);
            case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
                return MailboxThreadAttachmentsJNI.dispatchDasmOIJOO(0, 0, ((A0O) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.APP_FIRST_VIEW_CONTROLLER /* 139 */:
                return MailboxThreadBansJNI.dispatchDasmOJOO(1, A00(this), mailbox, sqliteHolder);
            case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                return MailboxThreadCapabilityJNI.dispatchDasmOJOO(0, ((A0D) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.MESSENGER_THREAD_LIST_DISPLAYED /* 141 */:
                CQLResultSet cQLResultSet53 = (CQLResultSet) MailboxThreadEmojiJNI.dispatchCqlOOO(0, ((A0F) this.A01).A03, sqliteHolder);
                if (cQLResultSet53 != null) {
                    r304 = new 1qX(cQLResultSet53);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.PREV_ACTIVITY_PAUSE /* 142 */:
                A1W a1w9 = (A1W) this.A01;
                return 7zL.A0s(MailboxThreadSubscriptionsJNI.dispatchDasmOJJJJJOO(0, 0L, a1w9.A02, a1w9.A01, 1L, 1L, mailbox, sqliteHolder));
            case ActionId.ACTIVITY_RESUME /* 143 */:
                return MailboxThreadSubscriptionsJNI.dispatchDasmOJOO(1, A00(this), mailbox, sqliteHolder);
            case ActionId.ACTIVITY_START /* 144 */:
                A0O a0o4 = (A0O) this.A01;
                return MailboxThreadSubscriptionsJNI.dispatchDasmOJOOO(2, a0o4.A01, a0o4.A04, mailbox, sqliteHolder);
            case ActionId.BEGIN_START_ACTIVITY /* 145 */:
                CQLResultSet cQLResultSet54 = (CQLResultSet) MailboxTopBannersJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet54 != null) {
                    r304 = new 1qX(cQLResultSet54);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.END_START_ACTIVITY /* 146 */:
                CQLResultSet cQLResultSet55 = (CQLResultSet) MailboxTranslationJNI.dispatchCqlOJO(0, A00(this), sqliteHolder);
                if (cQLResultSet55 != null) {
                    r304 = new 1qX(cQLResultSet55);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.FILE_SYSTEM_FAIL /* 147 */:
                A0R a0r4 = (A0R) this.A01;
                return MailboxTranslationJNI.dispatchCqlOJOO(1, a0r4.A01, a0r4.A04, sqliteHolder);
            case ActionId.FORMAT_ERROR /* 148 */:
                A0o a0o5 = (A0o) this.A01;
                return MailboxTranslationJNI.dispatchDasmOJOOOO(0, a0o5.A01, a0o5.A05, a0o5.A06, mailbox, sqliteHolder);
            case ActionId.PRIVACY_VIOLATION /* 149 */:
                A0o a0o6 = (A0o) this.A01;
                return MailboxTranslationJNI.dispatchDasmOJOOOO(1, a0o6.A01, a0o6.A05, a0o6.A06, mailbox, sqliteHolder);
            case 150:
                CQLResultSet cQLResultSet56 = (CQLResultSet) MailboxUserPrefsBoolJNI.dispatchCqlOOO(0, null, sqliteHolder);
                if (cQLResultSet56 != null) {
                    r304 = new 1qX(cQLResultSet56);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                CQLResultSet cQLResultSet57 = (CQLResultSet) MailboxUserPrefsIntJNI.dispatchCqlOOO(0, ((A0I) this.A01).A04, sqliteHolder);
                if (cQLResultSet57 != null) {
                    r304 = new 1qX(cQLResultSet57);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.APPLY_OPTIMISTICS /* 152 */:
                return MailboxUserPrefsIntJNI.dispatchDasmOJOOO(0, A00(this), 1BJ.A00(403), mailbox, sqliteHolder);
            case ActionId.APPLY_FINISHED_LIST /* 153 */:
                CQLResultSet cQLResultSet58 = (CQLResultSet) MailboxUserPrefsStringJNI.dispatchCqlOOO(0, null, sqliteHolder);
                if (cQLResultSet58 != null) {
                    r304 = new 1qX(cQLResultSet58);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                A0L a0l = (A0L) this.A01;
                return MailboxUserPrefsStringJNI.dispatchDasmOOOOO(0, a0l.A03, a0l.A04, mailbox, sqliteHolder);
            case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                CQLResultSet cQLResultSet59 = (CQLResultSet) MailboxUserVisibleErrorJNI.dispatchCqlOO(0, sqliteHolder);
                if (cQLResultSet59 != null) {
                    r304 = new 1qX(cQLResultSet59);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
                CQLResultSet cQLResultSet60 = (CQLResultSet) MailboxVoiceMessagesJNI.dispatchCqlOOO(1, ((A1V) this.A01).A03, sqliteHolder);
                if (cQLResultSet60 != null) {
                    r304 = new 1qX(cQLResultSet60);
                    return 7zL.A0s(r304);
                }
                r304 = null;
                return 7zL.A0s(r304);
            default:
                A0T a0t = (A0T) this.A01;
                return MailboxVoiceMessagesJNI.dispatchCqlODJOO(2, a0t.A00, a0t.A01, a0t.A04, sqliteHolder);
        }
    }
}
