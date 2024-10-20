package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.avatarartifacto.mca.MailboxAvatarArtifactoJNI;
import com.facebook.bmopbuyerviewfeaturecapabilities.mca.MailboxBMOPBuyerViewFeatureCapabilitiesJNI;
import com.facebook.broadcastflow.mca.MailboxBroadcastFlowJNI;
import com.facebook.callhistory.mca.MailboxCallHistoryJNI;
import com.facebook.catchup.mca.MailboxCatchUpJNI;
import com.facebook.community.mca.MailboxCommunityJNI;
import com.facebook.communitychatsuggestedactions.mca.MailboxCommunityChatSuggestedActionsJNI;
import com.facebook.communitymessagingtrending.mca.MailboxCommunityMessagingTrendingJNI;
import com.facebook.composermenu.mca.MailboxComposerMenuJNI;
import com.facebook.contactsharesettings.mca.MailboxContactShareSettingsJNI;
import com.facebook.copresence.mca.MailboxCopresenceJNI;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.cuckoo.mca.MailboxCuckooJNI;
import com.facebook.cutover.mca.MailboxCutoverJNI;
import com.facebook.filteredthreadsranges.mca.MailboxFilteredThreadsRangesJNI;
import com.facebook.highlightstab.mca.MailboxHighlightsTabJNI;
import com.facebook.inthreadbanner.mca.MailboxInThreadBannerJNI;
import com.facebook.marketplacecta.mca.MailboxMarketplaceCTAJNI;
import com.facebook.mediareceiverfetch.mca.MailboxMediaReceiverFetchJNI;
import com.facebook.memories.mca.MailboxMemoriesJNI;
import com.facebook.messengerleadintent.mca.MailboxMessengerLeadIntentJNI;
import com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter;
import com.facebook.msys.cql.dataclasses.XmaDataclassAdapter;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.orca.mca.MailboxOrcaJNI;
import com.facebook.pushnotifications.mca.MailboxPushNotificationsJNI;
import com.facebook.qp.mca.MailboxQPJNI;
import com.facebook.reaction.mca.MailboxReactionJNI;
import com.facebook.rooms.mca.MailboxRoomsJNI;
import com.facebook.rtccallevents.mca.MailboxRtcCallEventsJNI;
import com.facebook.search.mca.MailboxSearchJNI;
import com.facebook.searchquery.mca.MailboxSearchQueryJNI;
import com.facebook.sharedalbum.mca.MailboxSharedAlbumJNI;
import com.facebook.sharing.mca.MailboxSharingJNI;
import com.facebook.shim.mca.MailboxShimJNI;
import com.facebook.status.mca.MailboxStatusJNI;
import com.facebook.stories.mca.MailboxStoriesJNI;
import com.facebook.tam.mca.MailboxTamJNI;
import com.facebook.tamreportingshim.mca.MailboxTamReportingShimJNI;
import com.facebook.threadmembers.mca.MailboxThreadMembersJNI;
import com.facebook.topbanners.mca.MailboxTopBannersJNI;

/* loaded from: N85.class */
public final class N85 implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public N85(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static N85 A00(Object obj, int i) {
        return new N85(obj, i);
    }

    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        1qX r308;
        switch (this.A00) {
            case 0:
                N70 n70 = (N70) this.A01;
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxAdvancedCryptoTransportJNI.dispatchCqlOIIJO(12, 3, n70.A01, n70.A02, sqliteHolder);
                if (cQLResultSet != null) {
                    r308 = new 1qX(cQLResultSet);
                    return 7zL.A0s(r308);
                }
                break;
            case 1:
                return 7zL.A0s(MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJO(13, 3, ((N6s) this.A01).A01, sqliteHolder));
            case 2:
                return 7zL.A0s(MailboxAvatarArtifactoJNI.dispatchDasmOJOO(2, ((N72) this.A01).A01, mailbox, sqliteHolder));
            case 3:
                N77 n77 = (N77) this.A01;
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxAvatarArtifactoJNI.dispatchCqlOIIOOOO(5, n77.A00, 0, n77.A03, n77.A04, n77.A05, sqliteHolder);
                if (cQLResultSet2 != null) {
                    r308 = new 1qX(cQLResultSet2);
                    return 7zL.A0s(r308);
                }
                break;
            case 4:
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxBMOPBuyerViewFeatureCapabilitiesJNI.dispatchCqlOJO(0, ((N6u) this.A01).A01, sqliteHolder);
                if (cQLResultSet3 != null) {
                    r308 = new 1qX(cQLResultSet3);
                    return 7zL.A0s(r308);
                }
                break;
            case 5:
                return MailboxBMOPBuyerViewFeatureCapabilitiesJNI.dispatchDasmOJOO(0, ((N73) this.A01).A01, mailbox, sqliteHolder);
            case 6:
                N7w n7w = (N7w) this.A01;
                CQLResultSet cQLResultSet4 = (CQLResultSet) MailboxBroadcastFlowJNI.dispatchCqlOOOOOOOOOOOOOOOOOOOOOOOOO(5, n7w.A0B, n7w.A0A, n7w.A0N, n7w.A0H, n7w.A09, n7w.A0F, n7w.A03, n7w.A0L, n7w.A0K, n7w.A0P, n7w.A0I, n7w.A07, n7w.A0E, n7w.A08, n7w.A0M, n7w.A0D, n7w.A05, n7w.A0G, n7w.A0J, n7w.A0C, n7w.A0O, n7w.A06, n7w.A04, sqliteHolder);
                if (cQLResultSet4 != null) {
                    r308 = new 1qX(cQLResultSet4);
                    return 7zL.A0s(r308);
                }
                break;
            case 7:
                return MailboxCallHistoryJNI.dispatchCqlOJO(8, ((N73) this.A01).A01, sqliteHolder);
            case 8:
                return MailboxCallHistoryJNI.dispatchCqlOJO(9, ((N73) this.A01).A01, sqliteHolder);
            case 9:
                CQLResultSet cQLResultSet5 = (CQLResultSet) MailboxCallHistoryJNI.dispatchCqlOJO(11, ((N6u) this.A01).A01, sqliteHolder);
                if (cQLResultSet5 != null) {
                    r308 = new 1qX(cQLResultSet5);
                    return 7zL.A0s(r308);
                }
                break;
            case 10:
                return MailboxCallHistoryJNI.dispatchCqlOOO(1, ((N6v) this.A01).A03, sqliteHolder);
            case 11:
                return MailboxCallHistoryJNI.dispatchCqlOOO(2, ((N6v) this.A01).A03, sqliteHolder);
            case 12:
                CQLResultSet cQLResultSet6 = (CQLResultSet) MailboxCallHistoryJNI.dispatchCqlOOO(3, ((N6v) this.A01).A03, sqliteHolder);
                if (cQLResultSet6 != null) {
                    r308 = new 1qX(cQLResultSet6);
                    return 7zL.A0s(r308);
                }
                break;
            case 13:
                N74 n74 = (N74) this.A01;
                CQLResultSet cQLResultSet7 = (CQLResultSet) MailboxCallHistoryJNI.dispatchCqlOOOO(4, n74.A04, n74.A03, sqliteHolder);
                if (cQLResultSet7 != null) {
                    r308 = new 1qX(cQLResultSet7);
                    return 7zL.A0s(r308);
                }
                break;
            case 14:
                return MailboxCallHistoryJNI.dispatchCqlOJO(6, ((N6u) this.A01).A01, sqliteHolder);
            case 15:
                N7B n7b = (N7B) this.A01;
                CQLResultSet cQLResultSet8 = (CQLResultSet) MailboxCatchUpJNI.dispatchCqlOIJJO(1, 100, n7b.A02, n7b.A01, sqliteHolder);
                if (cQLResultSet8 != null) {
                    r308 = new 1qX(cQLResultSet8);
                    return 7zL.A0s(r308);
                }
                break;
            case 16:
                N7B n7b2 = (N7B) this.A01;
                CQLResultSet cQLResultSet9 = (CQLResultSet) MailboxCatchUpJNI.dispatchCqlOIJJO(2, 100, n7b2.A02, n7b2.A01, sqliteHolder);
                if (cQLResultSet9 != null) {
                    r308 = new 1qX(cQLResultSet9);
                    return 7zL.A0s(r308);
                }
                break;
            case 17:
                N7B n7b3 = (N7B) this.A01;
                CQLResultSet cQLResultSet10 = (CQLResultSet) MailboxCatchUpJNI.dispatchCqlOIJJO(4, 100, n7b3.A02, n7b3.A01, sqliteHolder);
                if (cQLResultSet10 != null) {
                    r308 = new 1qX(cQLResultSet10);
                    return 7zL.A0s(r308);
                }
                break;
            case 18:
                N7B n7b4 = (N7B) this.A01;
                CQLResultSet cQLResultSet11 = (CQLResultSet) MailboxCatchUpJNI.dispatchCqlOIJJO(5, 100, n7b4.A02, n7b4.A01, sqliteHolder);
                if (cQLResultSet11 != null) {
                    r308 = new 1qX(cQLResultSet11);
                    return 7zL.A0s(r308);
                }
                break;
            case 19:
                N7f n7f = (N7f) this.A01;
                return 7zL.A0s(MailboxCommunityJNI.dispatchDasmOJOOOOOOOOOOOOOOOZ(15, n7f.A00, n7f.A07, "", n7f.A04, n7f.A05, n7f.A08, n7f.A0A, null, n7f.A06, n7f.A09, n7f.A03, null, null, null, mailbox, sqliteHolder, n7f.A0B));
            case 20:
                N7g n7g = (N7g) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOOOOOOOOOO(16, n7g.A00, n7g.A0A, n7g.A07, n7g.A08, n7g.A0B, n7g.A03, n7g.A05, n7g.A09, n7g.A06, n7g.A04, mailbox, sqliteHolder);
            case 21:
                N6w n6w = (N6w) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJJOOO(42, n6w.A01, n6w.A00, n6w.A04, mailbox, sqliteHolder);
            case 22:
                N7l n7l = (N7l) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJJOOOOOOOOOOOZ(46, n7l.A00, n7l.A01, 0L, n7l.A0B, n7l.A05, n7l.A09, n7l.A08, n7l.A07, n7l.A0A, n7l.A0C, n7l.A06, null, mailbox, sqliteHolder, n7l.A0D);
            case 23:
                N7F n7f2 = (N7F) this.A01;
                return MailboxCommunityJNI.dispatchDasmOJOOOZ(62, n7f2.A01, n7f2.A04, mailbox, sqliteHolder, n7f2.A05);
            case 24:
                N7N n7n = (N7N) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJOOOOO(94, n7n.A00, n7n.A01, n7n.A07, n7n.A05, n7n.A06, mailbox, sqliteHolder);
            case 25:
                N7m n7m = (N7m) this.A01;
                CQLResultSet cQLResultSet12 = (CQLResultSet) MailboxCommunityJNI.dispatchCqlOIIJJOOOOOZZZZ(34, n7m.A01, n7m.A00, n7m.A02, 0L, n7m.A08, n7m.A09, n7m.A06, n7m.A07, sqliteHolder, n7m.A0B, n7m.A0A, n7m.A0D, n7m.A0C);
                if (cQLResultSet12 != null) {
                    r308 = new 1qX(cQLResultSet12);
                    return 7zL.A0s(r308);
                }
                break;
            case 26:
                N7c n7c = (N7c) this.A01;
                return MailboxCommunityJNI.dispatchDasmOIJJJOOZZZZ(6, n7c.A00, n7c.A03, n7c.A02, n7c.A01, mailbox, sqliteHolder, n7c.A0A, n7c.A07, n7c.A09, n7c.A08);
            case 27:
                return MailboxCommunityChatSuggestedActionsJNI.dispatchCqlOJO(0, ((N6u) this.A01).A01, sqliteHolder);
            case 28:
                N75 n75 = (N75) this.A01;
                return MailboxCommunityChatSuggestedActionsJNI.dispatchCqlOJOO(1, n75.A01, n75.A04, sqliteHolder);
            case 29:
                N78 n78 = (N78) this.A01;
                return MailboxCommunityChatSuggestedActionsJNI.dispatchCqlOJOOOZ(3, n78.A00, n78.A03, n78.A04, sqliteHolder, n78.A05);
            case 30:
                N7Q n7q = (N7Q) this.A01;
                CQLResultSet cQLResultSet13 = (CQLResultSet) MailboxCommunityMessagingTrendingJNI.dispatchCqlOIIIOZZ(1, n7q.A02, n7q.A03, n7q.A01, sqliteHolder, n7q.A06, n7q.A07);
                if (cQLResultSet13 != null) {
                    r308 = new 1qX(cQLResultSet13);
                    return 7zL.A0s(r308);
                }
                break;
            case 31:
                CQLResultSet cQLResultSet14 = (CQLResultSet) MailboxComposerMenuJNI.dispatchCqlOJO(0, ((N6s) this.A01).A01, sqliteHolder);
                if (cQLResultSet14 != null) {
                    r308 = new 1qX(cQLResultSet14);
                    return 7zL.A0s(r308);
                }
                break;
            case 32:
                CQLResultSet cQLResultSet15 = (CQLResultSet) MailboxComposerMenuJNI.dispatchCqlOJO(1, ((N6s) this.A01).A01, sqliteHolder);
                if (cQLResultSet15 != null) {
                    r308 = new 1qX(cQLResultSet15);
                    return 7zL.A0s(r308);
                }
                break;
            case 33:
                CQLResultSet cQLResultSet16 = (CQLResultSet) MailboxContactShareSettingsJNI.dispatchCqlOJO(0, ((N6s) this.A01).A01, sqliteHolder);
                if (cQLResultSet16 != null) {
                    r308 = new 1qX(cQLResultSet16);
                    return 7zL.A0s(r308);
                }
                break;
            case 34:
                return MailboxContactShareSettingsJNI.dispatchDasmOOO(0, mailbox, sqliteHolder);
            case 35:
                return MailboxContactShareSettingsJNI.dispatchDasmOOOZ(2, mailbox, sqliteHolder, ((IbP) this.A01).A05);
            case 36:
                MS1 ms1 = (MS1) this.A01;
                return MailboxCopresenceJNI.dispatchDasmOIIJOO(0, ms1.A01, ms1.A00, ms1.A02, mailbox, sqliteHolder);
            case 37:
                N75 n752 = (N75) this.A01;
                return MailboxCoreJNI.dispatchDasmOIJOOOO(1, 1, n752.A01, n752.A04, null, mailbox, sqliteHolder);
            case 38:
                N83 n83 = (N83) this.A01;
                Object[] objArr = (Object[]) MailboxCoreJNI.dispatchDasmOIIJOOOOOOOOOOOZ(3, n83.A01, 1, n83.A02, null, null, null, null, n83.A04, null, null, null, null, mailbox, sqliteHolder, false);
                return new N24((Number) objArr[0], (Number) objArr[1]);
            case 39:
                N6x n6x = (N6x) this.A01;
                return MailboxCoreJNI.dispatchDasmOIJOOOO(1, 1, n6x.A00, n6x.A04, n6x.A03, mailbox, sqliteHolder);
            case 40:
                return MailboxCuckooJNI.dispatchDasmOOO(0, mailbox, sqliteHolder);
            case 41:
                return MailboxCuckooJNI.dispatchDasmOOO(1, mailbox, sqliteHolder);
            case 42:
                return MailboxCuckooJNI.dispatchDasmOOO(2, mailbox, sqliteHolder);
            case 43:
                N7I n7i = (N7I) this.A01;
                return MailboxCuckooJNI.dispatchDasmOIIOOOOZ(4, n7i.A00, 2, n7i.A05, n7i.A04, mailbox, sqliteHolder, n7i.A06);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return MailboxCuckooJNI.dispatchDasmOOO(5, mailbox, sqliteHolder);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return MailboxCuckooJNI.dispatchDasmOOOO(6, ((N74) this.A01).A02, mailbox, sqliteHolder);
            case 46:
                N74 n742 = (N74) this.A01;
                return 7zL.A0s(MailboxCuckooJNI.dispatchCqlOOOOO(1, n742.A04, n742.A02, mailbox, sqliteHolder));
            case ActionId.ON_START_END /* 47 */:
                N7F n7f3 = (N7F) this.A01;
                return MailboxCutoverJNI.dispatchCqlOJOOZ(10, n7f3.A01, n7f3.A04, sqliteHolder, n7f3.A05);
            case ActionId.QUEUED /* 48 */:
                return 7zL.A0s(MailboxCutoverJNI.dispatchCqlOJOOZ(11, ((N82) this.A01).A01, null, sqliteHolder, false));
            case ActionId.IN_PROGRESS /* 49 */:
                return 7zL.A0s(MailboxCutoverJNI.dispatchCqlOJO(0, ((N82) this.A01).A01, sqliteHolder));
            case 50:
                return 7zL.A0s(MailboxCutoverJNI.dispatchCqlOJO(1, ((N82) this.A01).A01, sqliteHolder));
            case ActionId.UNKNOWN /* 51 */:
                return 7zL.A0s(MailboxCutoverJNI.dispatchCqlOJO(2, ((N82) this.A01).A01, sqliteHolder));
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                return 7zL.A0s(MailboxCutoverJNI.dispatchCqlOJO(7, ((N82) this.A01).A01, sqliteHolder));
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                N7X n7x = (N7X) this.A01;
                return MailboxFilteredThreadsRangesJNI.dispatchDasmOIJOOOOOOOOOOOZZ(1, n7x.A00, n7x.A01, n7x.A07, n7x.A05, n7x.A04, n7x.A06, n7x.A09, n7x.A08, null, null, null, mailbox, sqliteHolder, true, false);
            case ActionId.QUEUEING_BEGIN /* 54 */:
                N79 n79 = (N79) this.A01;
                return MailboxFilteredThreadsRangesJNI.dispatchDasmOIJOOOO(2, n79.A00, n79.A01, n79.A05, n79.A04, mailbox, sqliteHolder);
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                CQLResultSet cQLResultSet17 = (CQLResultSet) MailboxHighlightsTabJNI.dispatchCqlOO(6, sqliteHolder);
                if (cQLResultSet17 != null) {
                    r308 = new 1qX(cQLResultSet17);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.QUEUEING_FAIL /* 56 */:
                N7q n7q2 = (N7q) this.A01;
                return MailboxHighlightsTabJNI.dispatchCqlOJJOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(8, n7q2.A01, n7q2.A00, n7q2.A0G, n7q2.A09, n7q2.A0F, n7q2.A0H, n7q2.A0A, n7q2.A0B, n7q2.A0D, n7q2.A0C, n7q2.A06, n7q2.A05, null, null, null, null, null, null, n7q2.A0E, null, null, null, null, null, null, n7q2.A04, n7q2.A08, n7q2.A07, null, null, sqliteHolder);
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                N7O n7o = (N7O) this.A01;
                return MailboxHighlightsTabJNI.dispatchCqlOJJOOOOO(0, n7o.A01, n7o.A00, n7o.A06, n7o.A04, n7o.A05, n7o.A07, sqliteHolder);
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                N7J n7j = (N7J) this.A01;
                return MailboxHighlightsTabJNI.dispatchDasmOIIOOOO(3, n7j.A00, 1, n7j.A05, n7j.A06, mailbox, sqliteHolder);
            case ActionId.PHOTO_CAPTURED /* 59 */:
                CQLResultSet cQLResultSet18 = (CQLResultSet) MailboxInThreadBannerJNI.dispatchCqlOJO(0, ((N73) this.A01).A01, sqliteHolder);
                if (cQLResultSet18 != null) {
                    r308 = new 1qX(cQLResultSet18);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                CQLResultSet cQLResultSet19 = (CQLResultSet) MailboxInThreadBannerJNI.dispatchCqlOJJO(1, ((N72) this.A01).A01, 0L, sqliteHolder);
                if (cQLResultSet19 != null) {
                    r308 = new 1qX(cQLResultSet19);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.COUNTER /* 61 */:
                return MailboxInThreadBannerJNI.dispatchDasmOJOO(0, ((N6u) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                return MailboxInThreadBannerJNI.dispatchDasmOJOO(1, ((N6u) this.A01).A01, mailbox, sqliteHolder);
            case 63:
                return MailboxInThreadBannerJNI.dispatchDasmOJOO(2, ((N6u) this.A01).A01, mailbox, sqliteHolder);
            case 64:
                N7K n7k = (N7K) this.A01;
                return MailboxMarketplaceCTAJNI.dispatchDasmOJJOOOOO(0, n7k.A01, n7k.A00, n7k.A06, n7k.A05, n7k.A04, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                N7d n7d = (N7d) this.A01;
                return MailboxMediaReceiverFetchJNI.dispatchCqlOIIJOOOOOOO(4, n7d.A01, n7d.A00, n7d.A02, n7d.A0A, n7d.A07, n7d.A08, n7d.A06, n7d.A09, n7d.A05, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                return MailboxMemoriesJNI.dispatchDasmOOO(1, mailbox, sqliteHolder);
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                N7L n7l2 = (N7L) this.A01;
                return MailboxMemoriesJNI.dispatchDasmOIJOOOOOOO(9, n7l2.A00, n7l2.A01, n7l2.A06, n7l2.A04, n7l2.A05, null, null, mailbox, sqliteHolder);
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                CQLResultSet cQLResultSet20 = (CQLResultSet) MailboxMessengerLeadIntentJNI.dispatchCqlOJO(0, ((N82) this.A01).A01, sqliteHolder);
                if (cQLResultSet20 != null) {
                    r308 = new 1qX(cQLResultSet20);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                CQLResultSet cQLResultSet21 = (CQLResultSet) MailboxMessengerLeadIntentJNI.dispatchCqlOJO(1, ((N82) this.A01).A01, sqliteHolder);
                if (cQLResultSet21 != null) {
                    r308 = new 1qX(cQLResultSet21);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                MRo mRo = (MRo) this.A01;
                CQLResultSet cQLResultSet22 = (CQLResultSet) MailboxOrcaJNI.dispatchCqlOOOO(9, mRo.A05, mRo.A04, sqliteHolder);
                if (cQLResultSet22 != null) {
                    r308 = new 1qX(cQLResultSet22);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                N6y n6y = (N6y) this.A01;
                CQLResultSet cQLResultSet23 = (CQLResultSet) MailboxOrcaJNI.dispatchCqlOOOO(0, n6y.A03, n6y.A04, sqliteHolder);
                if (cQLResultSet23 != null) {
                    r308 = new 1qX(cQLResultSet23);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                MRo mRo2 = (MRo) this.A01;
                return 7zL.A0s(MailboxOrcaJNI.dispatchCqlOOOOZ(4, mRo2.A04, mRo2.A03, sqliteHolder, true));
            case ActionId.INTENT_MAPPED /* 73 */:
                N6z n6z = (N6z) this.A01;
                CQLResultSet cQLResultSet24 = (CQLResultSet) MailboxOrcaJNI.dispatchCqlOIJO(7, n6z.A01, n6z.A02, sqliteHolder);
                if (cQLResultSet24 != null) {
                    r308 = new 1qX(cQLResultSet24);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                return MailboxPushNotificationsJNI.dispatchDasmOJOO(11, ((N6s) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                N7P n7p = (N7P) this.A01;
                1qX r3082 = null;
                CQLResultSet cQLResultSet25 = (CQLResultSet) ((Object[]) MailboxPushNotificationsJNI.dispatchCqlOIJOOOOOOOOOOOOOOOOOOOOOOOO(0, 67, n7p.A00, n7p.A06, null, null, null, null, null, null, n7p.A04, null, null, null, n7p.A03, null, null, n7p.A05, n7p.A07, null, null, null, null, null, null, null, sqliteHolder))[0];
                if (cQLResultSet25 != null) {
                    r3082 = new 1qX(cQLResultSet25);
                }
                return new N21(r3082);
            case ActionId.ACTIVITY_STARTED /* 76 */:
                return 7zL.A0s(MailboxPushNotificationsJNI.dispatchCqlOJO(2, ((N6s) this.A01).A01, sqliteHolder));
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                return MailboxPushNotificationsJNI.dispatchDasmOOOZ(4, mailbox, sqliteHolder, ((N6p) this.A01).A02);
            case ActionId.FRAGMENT_CREATED /* 78 */:
                MRo mRo3 = (MRo) this.A01;
                CQLResultSet cQLResultSet26 = (CQLResultSet) MailboxQPJNI.dispatchCqlOIOOO(0, mRo3.A01, mRo3.A05, mRo3.A03, sqliteHolder);
                if (cQLResultSet26 != null) {
                    r308 = new 1qX(cQLResultSet26);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                N7R n7r = (N7R) this.A01;
                return MailboxReactionJNI.dispatchDasmOJJJOOOOO(0, n7r.A03, n7r.A02, n7r.A01, n7r.A06, n7r.A07, null, mailbox, sqliteHolder);
            case 80:
                CQLResultSet cQLResultSet27 = (CQLResultSet) MailboxRoomsJNI.dispatchCqlOOOO(1, null, ((N6v) this.A01).A03, sqliteHolder);
                if (cQLResultSet27 != null) {
                    r308 = new 1qX(cQLResultSet27);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                CQLResultSet cQLResultSet28 = (CQLResultSet) MailboxRoomsJNI.dispatchCqlOOOO(2, null, ((N6v) this.A01).A03, sqliteHolder);
                if (cQLResultSet28 != null) {
                    r308 = new 1qX(cQLResultSet28);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                N71 n71 = (N71) this.A01;
                return MailboxRtcCallEventsJNI.dispatchCqlOOOOO(2, n71.A02, n71.A04, mailbox, sqliteHolder);
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                return MailboxRtcCallEventsJNI.dispatchCqlOOOO(3, ((N6t) this.A01).A02, mailbox, sqliteHolder);
            case ActionId.MARKER_SWAPPED /* 84 */:
                CQLResultSet cQLResultSet29 = (CQLResultSet) MailboxRtcCallEventsJNI.dispatchCqlOO(4, sqliteHolder);
                if (cQLResultSet29 != null) {
                    r308 = new 1qX(cQLResultSet29);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                N7Y n7y = (N7Y) this.A01;
                CQLResultSet cQLResultSet30 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOOZZZZ(32, n7y.A05, n7y.A04, sqliteHolder, n7y.A08, n7y.A09, n7y.A07, n7y.A06);
                if (cQLResultSet30 != null) {
                    r308 = new 1qX(cQLResultSet30);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                N7o n7o2 = (N7o) this.A01;
                CQLResultSet cQLResultSet31 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOOZZZZZZZZZZZ(33, n7o2.A05, n7o2.A04, sqliteHolder, n7o2.A0B, n7o2.A08, n7o2.A09, n7o2.A06, n7o2.A0G, n7o2.A0C, n7o2.A0E, n7o2.A0A, n7o2.A0F, n7o2.A0D, n7o2.A07);
                if (cQLResultSet31 != null) {
                    r308 = new 1qX(cQLResultSet31);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.ERROR /* 87 */:
                N7t n7t = (N7t) this.A01;
                CQLResultSet cQLResultSet32 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOOOOOOOZZZZZZZZZZZZZ(34, n7t.A06, n7t.A05, null, n7t.A07, n7t.A04, sqliteHolder, n7t.A0F, n7t.A0E, n7t.A08, n7t.A0J, n7t.A0G, n7t.A0I, n7t.A0D, n7t.A0K, n7t.A0C, n7t.A0H, n7t.A09, n7t.A0A, n7t.A0B);
                if (cQLResultSet32 != null) {
                    r308 = new 1qX(cQLResultSet32);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.METHOD_INVOKE /* 88 */:
                N7G n7g2 = (N7G) this.A01;
                return MailboxSearchJNI.dispatchCqlOIJOOO(51, n7g2.A00, n7g2.A01, n7g2.A05, n7g2.A04, sqliteHolder);
            case ActionId.FINALLY /* 89 */:
                N7i n7i2 = (N7i) this.A01;
                return MailboxSearchJNI.dispatchDasmOIJOOOOOOOOOOO(2, n7i2.A00, n7i2.A01, n7i2.A0B, n7i2.A07, n7i2.A0A, "", n7i2.A05, "", n7i2.A06, n7i2.A09, n7i2.A08, mailbox, sqliteHolder);
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                N7Z n7z = (N7Z) this.A01;
                return MailboxSearchJNI.dispatchDasmOIOOOOOOOO(8, n7z.A00, n7z.A04, n7z.A06, n7z.A08, n7z.A09, n7z.A07, n7z.A05, mailbox, sqliteHolder);
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                N7r n7r2 = (N7r) this.A01;
                CQLResultSet cQLResultSet33 = (CQLResultSet) MailboxSearchQueryJNI.dispatchCqlOIIIOOZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ(0, n7r2.A04, n7r2.A00, n7r2.A03, n7r2.A07, sqliteHolder, n7r2.A0E, n7r2.A0D, false, false, false, false, false, n7r2.A0H, false, n7r2.A0F, false, false, false, false, false, false, false, false, false, n7r2.A0G, false, false, n7r2.A0C, n7r2.A0A, n7r2.A0B, n7r2.A09, n7r2.A08, false, false);
                if (cQLResultSet33 != null) {
                    r308 = new 1qX(cQLResultSet33);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                return MailboxSharedAlbumJNI.dispatchDasmOJOO(2, ((N82) this.A01).A01, mailbox, sqliteHolder);
            case ActionId.ANIMATION_END /* 93 */:
                N75 n753 = (N75) this.A01;
                return MailboxSharedAlbumJNI.dispatchDasmOJOOO(3, n753.A01, n753.A04, mailbox, sqliteHolder);
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                N75 n754 = (N75) this.A01;
                return MailboxSharedAlbumJNI.dispatchDasmOJOOO(4, n754.A01, n754.A04, mailbox, sqliteHolder);
            case ActionId.MAIN_COMPLETE /* 95 */:
                return MailboxSharingJNI.dispatchDasmOOO(1, mailbox, sqliteHolder);
            case ActionId.INTERRUPTED /* 96 */:
                CQLResultSet cQLResultSet34 = (CQLResultSet) MailboxSharingJNI.dispatchCqlOIO(0, ((CzW) this.A01).A01, sqliteHolder);
                if (cQLResultSet34 != null) {
                    r308 = new 1qX(cQLResultSet34);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.NETWORK_FAILED /* 97 */:
                return 7zL.A0s(MailboxSharingJNI.dispatchCqlOO(1, sqliteHolder));
            case ActionId.NETWORK_RESPONSE /* 98 */:
                return 7zL.A0s(MailboxSharingJNI.dispatchCqlOJO(2, ((N73) this.A01).A01, sqliteHolder));
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                CQLResultSet cQLResultSet35 = (CQLResultSet) MailboxSharingJNI.dispatchCqlOIIOO(3, ((CzW) this.A01).A01, 3, null, sqliteHolder);
                if (cQLResultSet35 != null) {
                    r308 = new 1qX(cQLResultSet35);
                    return 7zL.A0s(r308);
                }
                break;
            case 100:
                return 7zL.A0s(MailboxSharingJNI.dispatchCqlOO(4, sqliteHolder));
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                N7M n7m2 = (N7M) this.A01;
                return MailboxShimJNI.dispatchCqlOJJOO(17, n7m2.A01, n7m2.A02, n7m2.A06, sqliteHolder);
            case ActionId.DATA_LOAD_START /* 102 */:
                N7B n7b5 = (N7B) this.A01;
                return MailboxShimJNI.dispatchCqlOJJOOO(26, n7b5.A01, n7b5.A02, null, null, sqliteHolder);
            case ActionId.LEGACY_MARKER /* 103 */:
                return MailboxShimJNI.dispatchCqlOJO(27, ((N72) this.A01).A01, sqliteHolder);
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                N7D n7d2 = (N7D) this.A01;
                return MailboxShimJNI.dispatchCqlOJOOO(28, n7d2.A01, n7d2.A05, n7d2.A04, sqliteHolder);
            case ActionId.ABORTED /* 105 */:
                N76 n76 = (N76) this.A01;
                return MailboxShimJNI.dispatchCqlOIJOZ(29, n76.A00, n76.A01, sqliteHolder, n76.A04);
            case ActionId.QUERY_READY /* 106 */:
                IbP ibP = (IbP) this.A01;
                return MailboxShimJNI.dispatchCqlOOOOZ(32, ibP.A02, ibP.A04, sqliteHolder, ibP.A05);
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                Cy7 cy7 = (Cy7) this.A01;
                return MailboxShimJNI.dispatchCqlOIOOO(35, cy7.A01, cy7.A03, cy7.A05, sqliteHolder);
            case 108:
                return 7zL.A0s(MailboxShimJNI.dispatchCqlOJO(2, ((N82) this.A01).A01, sqliteHolder));
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                CQLResultSet cQLResultSet36 = (CQLResultSet) MailboxShimJNI.dispatchCqlOJO(43, ((N82) this.A01).A01, sqliteHolder);
                if (cQLResultSet36 != null) {
                    r308 = new 1qX(cQLResultSet36);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                return 7zL.A0s(MailboxShimJNI.dispatchCqlOJO(47, ((N82) this.A01).A01, sqliteHolder));
            case ActionId.NEW_START_FOUND /* 111 */:
                return 7zL.A0s(MailboxShimJNI.dispatchCqlOJO(48, ((N82) this.A01).A01, sqliteHolder));
            case ActionId.MISSED_EVENT /* 112 */:
                Object[] objArr2 = (Object[]) MailboxShimJNI.dispatchCqlOJO(50, ((N82) this.A01).A01, sqliteHolder);
                return new N25((Number) objArr2[0], (Number) objArr2[1]);
            case ActionId.TIMEOUT /* 113 */:
                return 7zL.A0s(MailboxShimJNI.dispatchCqlOJO(51, ((N82) this.A01).A01, sqliteHolder));
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                N7R n7r3 = (N7R) this.A01;
                return MailboxStatusJNI.dispatchCqlOJJJOOO(18, n7r3.A03, n7r3.A02, n7r3.A01, n7r3.A07, n7r3.A06, sqliteHolder);
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                return MailboxStatusJNI.dispatchDasmOOOO(2, ((N71) this.A01).A03, mailbox, sqliteHolder);
            case ActionId.VIDEO_PLAYING /* 116 */:
                N7v n7v = (N7v) this.A01;
                return MailboxStatusJNI.dispatchDasmOIIJOOOOOOOOOOOOOOOOOZZ(3, n7v.A01, n7v.A00, n7v.A02, n7v.A0E, n7v.A0J, n7v.A0G, n7v.A07, n7v.A0C, n7v.A09, n7v.A0I, n7v.A0H, n7v.A0B, n7v.A0F, null, n7v.A0D, n7v.A08, n7v.A0K, n7v.A0A, mailbox, sqliteHolder, n7v.A0M, n7v.A0L);
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                N7p n7p2 = (N7p) this.A01;
                return MailboxStoriesJNI.dispatchDasmOIIJJJOOOOOOOOOOOOOOOOOOOO(2, 1, 1, n7p2.A02, n7p2.A01, n7p2.A00, n7p2.A0G, null, null, null, null, null, n7p2.A0A, n7p2.A0F, n7p2.A0B, n7p2.A05, n7p2.A0C, n7p2.A0D, n7p2.A07, n7p2.A06, n7p2.A0E, n7p2.A09, n7p2.A08, null, mailbox, sqliteHolder);
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                N7n n7n2 = (N7n) this.A01;
                Object[] objArr3 = (Object[]) MailboxTamJNI.dispatchCqlOIIJJJOOOOOOOOOOOOOOO(8, n7n2.A00, n7n2.A02, n7n2.A05, n7n2.A04, n7n2.A03, n7n2.A09, "fb_sticker", n7n2.A0E, n7n2.A0D, n7n2.A0C, n7n2.A0A, n7n2.A08, null, null, n7n2.A0B, null, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject((5oV) null), null, null, sqliteHolder);
                return new N27((Number) objArr3[0], (Number) objArr3[1]);
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                N7u n7u = (N7u) this.A01;
                Object[] objArr4 = (Object[]) MailboxTamJNI.dispatchCqlOIIIIJJJOOOOOOOOOOOOOOOOOOOOOO(9, n7u.A00, n7u.A04, n7u.A02, n7u.A03, n7u.A07, n7u.A06, n7u.A05, n7u.A0H, n7u.A0G, n7u.A0B, n7u.A0E, n7u.A0D, n7u.A0J, n7u.A0A, n7u.A0I, null, null, null, null, null, null, n7u.A0C, n7u.A0F, n7u.A0K, null, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject((5oV) null), null, null, sqliteHolder);
                return new N26((Number) objArr4[0], (Number) objArr4[1]);
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                N7b n7b6 = (N7b) this.A01;
                return 7zL.A0s(MailboxTamJNI.dispatchCqlOIJJJOOOOO(10, n7b6.A01, n7b6.A04, n7b6.A03, n7b6.A02, n7b6.A08, n7b6.A09, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject(n7b6.A05), null, sqliteHolder));
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                N83 n832 = (N83) this.A01;
                return MailboxTamJNI.dispatchCqlOJOO(26, n832.A02, n832.A04, sqliteHolder);
            case ActionId.CARD_DATA_LOADED /* 122 */:
                N7C n7c2 = (N7C) this.A01;
                return MailboxTamJNI.dispatchCqlOJOOZ(28, n7c2.A02, n7c2.A05, sqliteHolder, false);
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                N7x n7x2 = (N7x) this.A01;
                Object[] objArr5 = (Object[]) MailboxTamJNI.dispatchCqlOIIIIJJJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(35, 0, n7x2.A02, n7x2.A01, 0, n7x2.A04, n7x2.A05, n7x2.A03, n7x2.A0P, n7x2.A0O, n7x2.A0N, n7x2.A0D, n7x2.A0E, null, null, null, n7x2.A0F, null, n7x2.A0Q, n7x2.A0M, n7x2.A0A, n7x2.A09, null, null, n7x2.A0J, n7x2.A0K, n7x2.A0B, n7x2.A0C, null, null, null, null, n7x2.A0G, n7x2.A0L, n7x2.A0I, n7x2.A0H, n7x2.A08, sqliteHolder);
                return new N28((Number) objArr5[0], (Number) objArr5[1], (Number) objArr5[2], (Number) objArr5[3]);
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                N7s n7s = (N7s) this.A01;
                Object[] objArr6 = (Object[]) MailboxTamJNI.dispatchCqlOIIIIJJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(36, n7s.A02, 0, n7s.A01, 0, n7s.A04, n7s.A03, n7s.A0G, XmaDataclassAdapter.INSTANCE.toNullableRawObject(n7s.A05), n7s.A0F, null, null, n7s.A0A, null, null, null, null, null, null, null, null, null, null, null, n7s.A0H, n7s.A0E, null, null, null, null, null, n7s.A0B, n7s.A0C, n7s.A08, n7s.A09, null, null, null, null, null, n7s.A0D, null, null, null, null, null, sqliteHolder);
                return new N2A((Number) objArr6[0], (Number) objArr6[1], (Number) objArr6[2], (Number) objArr6[3]);
            case 125:
                N7y n7y2 = (N7y) this.A01;
                Object[] objArr7 = (Object[]) MailboxTamJNI.dispatchCqlOIIIJJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOZ(37, n7y2.A03, n7y2.A02, n7y2.A00, n7y2.A05, n7y2.A04, n7y2.A0V, n7y2.A0U, n7y2.A0H, n7y2.A0J, n7y2.A0K, null, null, null, null, null, null, null, null, null, null, n7y2.A0W, null, null, n7y2.A0X, n7y2.A0T, n7y2.A0D, n7y2.A0C, n7y2.A0L, null, n7y2.A0Q, n7y2.A0R, n7y2.A0E, n7y2.A0F, n7y2.A0M, n7y2.A0N, n7y2.A09, n7y2.A0A, n7y2.A0O, n7y2.A0S, n7y2.A0P, null, n7y2.A0G, null, XmaDataclassAdapter.INSTANCE.toNullableRawObject(n7y2.A06), n7y2.A0B, n7y2.A0I, n7y2.A0Y, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject((5oV) null), sqliteHolder, false);
                return new N29((Number) objArr7[0], (Number) objArr7[1], (Number) objArr7[2], (Number) objArr7[3]);
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                N7z n7z2 = (N7z) this.A01;
                Object[] objArr8 = (Object[]) MailboxTamJNI.dispatchCqlOIIIIIJJJOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(38, n7z2.A04, n7z2.A03, 0, n7z2.A01, n7z2.A02, n7z2.A06, n7z2.A07, n7z2.A05, n7z2.A0V, n7z2.A0U, n7z2.A0E, n7z2.A0H, null, n7z2.A0I, null, n7z2.A0W, n7z2.A0T, n7z2.A0D, n7z2.A0C, null, null, n7z2.A0X, n7z2.A0Y, n7z2.A0F, n7z2.A0G, null, null, null, null, n7z2.A0S, n7z2.A0P, n7z2.A0O, n7z2.A0N, n7z2.A0R, n7z2.A0Q, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject(n7z2.A08), n7z2.A0J, n7z2.A0M, n7z2.A0L, n7z2.A0K, n7z2.A0B, sqliteHolder);
                return new N2B((Number) objArr8[0], (Number) objArr8[1], (Number) objArr8[2], (Number) objArr8[3], (Number) objArr8[4]);
            case 127:
                N7V n7v2 = (N7V) this.A01;
                return MailboxTamJNI.dispatchCqlOJJJOOOOO(3, n7v2.A03, n7v2.A01, n7v2.A02, n7v2.A07, n7v2.A06, n7v2.A08, null, sqliteHolder);
            case 128:
                return MailboxTamJNI.dispatchCqlOJO(66, ((N83) this.A01).A02, sqliteHolder);
            case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
                N7e n7e = (N7e) this.A01;
                return 7zL.A0s(MailboxTamJNI.dispatchCqlOIJJJOOOOOOOOO(7, n7e.A01, n7e.A04, n7e.A03, n7e.A02, n7e.A07, n7e.A0A, null, n7e.A08, n7e.A09, null, ReadOnlyMessageMetadataDataclassAdapter.INSTANCE.toNullableRawObject((5oV) null), null, sqliteHolder));
            case ActionId.APP_DID_FINISH_LAUNCHING /* 130 */:
                N75 n755 = (N75) this.A01;
                CQLResultSet cQLResultSet37 = (CQLResultSet) MailboxTamReportingShimJNI.dispatchCqlOJOO(0, n755.A01, n755.A04, sqliteHolder);
                if (cQLResultSet37 != null) {
                    r308 = new 1qX(cQLResultSet37);
                    return 7zL.A0s(r308);
                }
                break;
            case ActionId.APP_DID_BECOME_ACTIVE /* 131 */:
                N7S n7s2 = (N7S) this.A01;
                return 7zL.A0s(MailboxTamReportingShimJNI.dispatchCqlOIJJOOOO(1, n7s2.A00, n7s2.A02, n7s2.A01, n7s2.A06, n7s2.A05, n7s2.A07, sqliteHolder));
            case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                N7W n7w2 = (N7W) this.A01;
                return 7zL.A0s(MailboxTamReportingShimJNI.dispatchCqlOIJJOOOOOOOO(2, n7w2.A00, n7w2.A02, n7w2.A01, n7w2.A07, null, n7w2.A05, null, null, n7w2.A06, n7w2.A08, sqliteHolder));
            case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
                N7M n7m3 = (N7M) this.A01;
                return MailboxThreadMembersJNI.dispatchDasmOJJOOO(2, n7m3.A02, n7m3.A01, n7m3.A06, mailbox, sqliteHolder);
            case ActionId.APP_MAIN /* 134 */:
                N7D n7d3 = (N7D) this.A01;
                return MailboxThreadMembersJNI.dispatchDasmOJOOOO(3, n7d3.A01, n7d3.A05, n7d3.A03, mailbox, sqliteHolder);
            default:
                MS4 ms4 = (MS4) this.A01;
                CQLResultSet cQLResultSet38 = (CQLResultSet) MailboxTopBannersJNI.dispatchCqlOIJOOOO(3, 0, ms4.A00, ms4.A03, ms4.A05, ms4.A04, sqliteHolder);
                if (cQLResultSet38 != null) {
                    r308 = new 1qX(cQLResultSet38);
                    return 7zL.A0s(r308);
                }
                break;
        }
        r308 = null;
        return 7zL.A0s(r308);
    }
}
