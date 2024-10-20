package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.login.ui.GenericFirstPartySsoViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.aibot.nux.AiBotMentionsNuxBrazilFragment;
import com.facebook.messaging.aibot.nux.MetaAIVoiceNuxFragment;
import com.facebook.messaging.aibot.plugins.core.threadsettings.aipagecustomcommand.row.ThreadSettingsAiPageCustomCommandRow;
import com.facebook.messaging.aibot.plugins.core.threadsettings.datausagerow.ThreadSettingsAiBotDataUsageRow;
import com.facebook.messaging.aibot.plugins.core.threadsettings.manageaimemory.ThreadSettingsManageAIMemoryRow;
import com.facebook.messaging.business.agent.plugins.biim.takeoverbottomsheet.AiAgentTakeOverBottomSheetDialogFragment;
import com.facebook.messaging.business.agent.plugins.biim.takeoverbottomsheet.AiAgentTakeOverBottomSheetDialogModel;
import com.facebook.messaging.business.bizrtc.pagertcsettings.PageRTCDisableCallingWarningBottomSheet;
import com.facebook.messaging.communitymessaging.adminonboarding.bottomsheet.AdminOnboardingBottomSheetFragment;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.directadd.aboutcommunity.AboutCommunityFragment;
import com.facebook.messaging.communitymessaging.invitelink.joinchainingchats.JoiningChainingChatBottomSheetFragment;
import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingJoinFlowEntrypoint;
import com.facebook.messaging.communitymessaging.model.GenAIChatSuggestion;
import com.facebook.messaging.communitymessaging.plugins.channellist.channellistondemandpromotionbanner.ChannelListOnDemandPromotionBannerImplementation;
import com.facebook.messaging.communitymessaging.plugins.channellist.channellistserverqpbanner.ChannelListServerPromotionBannerImplementation;
import com.facebook.messaging.communitymessaging.plugins.channellist.genaisuggestedchats.infobottomsheet.GenAiSuggestedChatsInfoBottomSheetFragment;
import com.facebook.messaging.communitymessaging.plugins.communitypreview.stickyfooter.FoldersStickyFooterImplementation;
import com.facebook.messaging.communitymessaging.threadedreplies.qp.SidechatsGenericNuxFragment;
import com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment.GeneratedThemeCreationFragment;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.defaulteb.nux.EbDefaultUpsellFragment;
import com.facebook.messaging.encryptedbackups.hsm.reminder.fragment.PinReminderFragment;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EbMigrationPinCreationFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EbSetupOptOutFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsSetupFragment;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.model.BottomSheetState;
import com.facebook.messaging.encryptedbackups.onetimecode.restoreflow.viewdata.EbOneTimeCodeRestoreViewData;
import com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment.EbConfirmRecoveryCodeFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbRestoreOptionsFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinResetYourPinFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinTryAgainFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsOtcFirstGreetingFragment;
import com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsOtherStepsToRestoreFragment;
import com.facebook.messaging.hdmediasends.nux.HdMediaNuxFragment;
import com.facebook.messaging.memories.nux.MemoriesNuxFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.composer.magicmod.nux.MagicModNuxFragment;
import com.facebook.messaging.msys.thread.aibot.nullstate.cardstack.layoutmanager.AiBotGroupedCardStackLayoutManager;
import com.facebook.messaging.polling.PollingInputParams;
import com.facebook.messaging.publicchats.join.ChannelNotificationGroupInviteFragment;
import com.facebook.messaging.publicchats.plugins.threaddetails.showchannelinpersonalinboxthreadsettingsrow.ShowChannelInPersonalInboxThreadSettingsRowImplementation;
import com.facebook.messaging.publicchats.quickpromotion.pollsdiscoverability.PollsDiscoverabilityNuxFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.xapp.messaging.browser.model.MessengerInAppBrowserLaunchParam;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.9py, reason: invalid class name */
/* loaded from: 9py.class */
public final class C9py implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C9py(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static int A00(C9py c9py, int i) {
        int A05 = 0FI.A05(i);
        ((0D2) c9py.A01).A0o();
        return A05;
    }

    public static 8Lf A01(View.OnClickListener onClickListener, CharSequence charSequence, CharSequence charSequence2, Object obj, int i) {
        return new 8Lf(onClickListener, new C9py(obj, i), charSequence, charSequence2);
    }

    public static 8Lf A02(CharSequence charSequence, Object obj, int i) {
        return new 8Lf(new C9py(obj, i), charSequence);
    }

    public static C9py A03(Object obj, int i) {
        return new C9py(obj, i);
    }

    public static void A04(View view, Object obj, int i) {
        view.setOnClickListener(new C9py(obj, i));
    }

    public static void A05(C2sn c2sn, 8TX r302, Object obj, int i) {
        r302.A2Y(new C9py(obj, i));
        c2sn.A00(r302.A2W());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0D2, androidx.fragment.app.Fragment, com.facebook.messaging.aibot.nux.AiBotMentionsNuxBrazilFragment] */
    /* JADX WARN: Type inference failed for: r0v1097, types: [X.8v0, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v1129, types: [androidx.fragment.app.Fragment, X.8vF] */
    /* JADX WARN: Type inference failed for: r0v1247, types: [com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment.GeneratedThemeCreationFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v130, types: [X.0D2, androidx.fragment.app.Fragment, com.facebook.messaging.communitymessaging.genaichatsuggestions.ui.GenAIChatSuggestionsBottomSheetFragment] */
    /* JADX WARN: Type inference failed for: r0v1884, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbNuxPasskeyRestoreFragment] */
    /* JADX WARN: Type inference failed for: r0v192, types: [com.facebook.messaging.communitymessaging.genaichatsuggestions.ui.GenAIChatSuggestionsReportToFacebookBottomSheetFragment, X.0D2, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v1984, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v2008, types: [androidx.fragment.app.Fragment, com.facebook.messaging.friending.bottomsheet.SuggestedConnectionsExplainerBottomSheetFragment] */
    /* JADX WARN: Type inference failed for: r0v2422, types: [X.3xC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2428, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v2686, types: [androidx.fragment.app.Fragment, com.facebook.messaging.communitymessaging.adminonboarding.bottomsheet.AdminOnboardingBottomSheetFragment] */
    /* JADX WARN: Type inference failed for: r0v293, types: [X.0D2, androidx.fragment.app.Fragment, com.facebook.messaging.communitymessaging.plugins.channellist.genaisuggestedchats.infobottomsheet.GenAiSuggestedChatsInfoBottomSheetFragment] */
    /* JADX WARN: Type inference failed for: r0v613, types: [com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, com.facebook.messaging.encryptedbackups.nux.fragment.MeNuxCreatePinSoftBlockFragment] */
    /* JADX WARN: Type inference failed for: r0v618, types: [com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment, androidx.fragment.app.Fragment, com.facebook.base.fragment.AbstractNavigableFragment] */
    /* JADX WARN: Type inference failed for: r0v694, types: [com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.base.fragment.AbstractNavigableFragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbRestoreRecoveryCodeFragment] */
    /* JADX WARN: Type inference failed for: r0v738 */
    /* JADX WARN: Type inference failed for: r0v754, types: [X.99V] */
    /* JADX WARN: Type inference failed for: r0v762, types: [com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinResetYourPinFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v840, types: [com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsOtcFirstGreetingFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment] */
    /* JADX WARN: Type inference failed for: r0v942, types: [X.6Sh, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int A05;
        int i;
        ThreadKey threadKey;
        String str;
        Long A0e;
        int A052;
        int i2;
        boolean z;
        Long A0e2;
        int A053;
        int i3;
        int A054;
        int i4;
        ThreadKey threadKey2;
        ThreadKey threadKey3;
        C1x1 A0O;
        MutableLiveData mutableLiveData;
        AnonymousClass965 anonymousClass965;
        2Xd r0;
        int A055;
        int i5;
        switch (this.A00) {
            case 0:
                A055 = 0FI.A05(-1140414529);
                GenericFirstPartySsoViewGroup.access$000((GenericFirstPartySsoViewGroup) this.A01);
                i5 = 1329672970;
                0FI.A0B(i5, A055);
                return;
            case 1:
                A055 = 0FI.A05(1679530048);
                ((FbFragmentActivity) this.A01).finish();
                i5 = -1437943501;
                0FI.A0B(i5, A055);
                return;
            case 2:
                A055 = 0FI.A05(-1390345330);
                ?? obj = new Object();
                ((3xC) obj).A00 = view;
                ((RMQ) this.A01).A03.invoke(obj);
                i5 = -1256401073;
                0FI.A0B(i5, A055);
                return;
            case 3:
                A055 = 0FI.A05(-848675700);
                9Si r02 = ((C8xj) this.A01).A00;
                if (r02 != null) {
                    F4v f4v = r02.A02;
                    C9a0 c9a0 = r02.A03;
                    F4v.A00(f4v, "branded_chat_interstitial", "click", "select_themes_button", c9a0.A07, null);
                    c9a0.A00(r02.A01);
                    r02.A00 = true;
                    06Z r03 = c9a0.A02;
                    Fragment A0b = r03.A0b(C8xj.__redex_internal_original_name);
                    if (A0b != null) {
                        C06c A0G = 7zL.A0G(r03);
                        A0G.A0I(A0b);
                        A0G.A04();
                    }
                }
                i5 = -1787991456;
                0FI.A0B(i5, A055);
                return;
            case 4:
                A055 = 0FI.A05(-1948596779);
                9Si r04 = ((C8xj) this.A01).A00;
                if (r04 != null) {
                    F4v f4v2 = r04.A02;
                    C9a0 c9a02 = r04.A03;
                    F4v.A00(f4v2, "branded_chat_interstitial", "click", AbE.A00(49), c9a02.A07, null);
                    06Z r05 = c9a02.A02;
                    Fragment A0b2 = r05.A0b(C8xj.__redex_internal_original_name);
                    if (A0b2 != null) {
                        C06c A0G2 = 7zL.A0G(r05);
                        A0G2.A0I(A0b2);
                        A0G2.A04();
                    }
                }
                i5 = 1406663322;
                0FI.A0B(i5, A055);
                return;
            case 5:
                A055 = 0FI.A05(-672018890);
                ((C8dx) this.A01).A00.invoke();
                i5 = -873061932;
                0FI.A0B(i5, A055);
                return;
            case 6:
                A055 = 0FI.A05(-1908856988);
                QHy qHy = (QHy) this.A01;
                int i6 = QHy.A03;
                qHy.A00.invoke();
                i5 = 1366676687;
                0FI.A0B(i5, A055);
                return;
            case 7:
                A052 = 0FI.A05(1120745298);
                Uri A0D = 7zM.A0D("https://www.facebook.com/help/messenger-app/820841429347610?ref=learn_more");
                C68t A0R = 7zU.A0R();
                if (A0R != null) {
                    A0R.A0E((Context) this.A01, A0D);
                } else {
                    0LS.A0C((Context) this.A01, 4YU.A09(A0D));
                }
                i2 = -1961186374;
                0FI.A0B(i2, A052);
                return;
            case 8:
                A055 = 0FI.A05(-1867942392);
                1Bn.A0A(147499);
                Context requireContext = ((Fragment) this.A01).requireContext();
                7zU.A0u(requireContext, 7zQ.A0d(requireContext), "https://www.facebook.com/help/messenger-app/820841429347610?ref=learn_more");
                i5 = 882525972;
                0FI.A0B(i5, A055);
                return;
            case 9:
                A052 = 0FI.A05(409171974);
                Context context = (Context) this.A01;
                String BCz = 4YV.A0V(9GL.A00.A00).BCz(36885746074584664L, "https://www.facebook.com/help/messenger-app/667776101667447?ref=ipl");
                11T.A0A(BCz);
                1BV A00 = 1BV.A00(68729);
                try {
                    Uri A03 = C0A2.A03(BCz);
                    if (A03 != null) {
                        C76 c76 = (C76) A00.get();
                        C5id c5id = MessengerInAppBrowserLaunchParam.A0E.A02;
                        11T.A09(c5id);
                        c76.A01(context, A03, c5id);
                    }
                } catch (SecurityException unused) {
                }
                i2 = -1377471849;
                0FI.A0B(i2, A052);
                return;
            case 10:
                A055 = 0FI.A05(1831552030);
                ((8Yr) this.A01).A02.invoke();
                i5 = -2017653151;
                0FI.A0B(i5, A055);
                return;
            case 11:
                A05 = 0FI.A05(1185027510);
                ?? r06 = (AiBotMentionsNuxBrazilFragment) this.A01;
                94S r07 = MigBottomSheetDialogFragment.A01;
                3vU r08 = r06.A02;
                if (r08 == null) {
                    str = "logger";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                Bundle bundle = r06.mArguments;
                BOj bOj = null;
                Serializable serializable = bundle != null ? bundle.getSerializable("AiBotMentionsNuxBrazilFragment.entry_point") : null;
                if (serializable instanceof BOj) {
                    bOj = (BOj) serializable;
                }
                Bundle bundle2 = r06.mArguments;
                ThreadKey threadKey4 = null;
                if (bundle2 != null && (threadKey = (ThreadKey) bundle2.getParcelable("AiBotMentionsNuxBrazilFragment.thread_key")) != null) {
                    threadKey4 = threadKey;
                }
                r08.A0I(bOj, threadKey4);
                9QP r09 = r06.A00;
                if (r09 != null) {
                    C77c.A04(r09.A00).A07();
                    r09.A01.invoke();
                    r06.A0o();
                    i = 1799316849;
                    0FI.A0B(i, A05);
                    return;
                }
                str = "listener";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 12:
                A055 = A00(this, 1941812034);
                i5 = -1803618054;
                0FI.A0B(i5, A055);
                return;
            case 13:
                A055 = 0FI.A05(-1434644908);
                MetaAIVoiceNuxFragment metaAIVoiceNuxFragment = (MetaAIVoiceNuxFragment) this.A01;
                C9N5 c9n5 = metaAIVoiceNuxFragment.A00;
                if (c9n5 != null) {
                    c9n5.A01.invoke();
                    3vU.A0A(7zQ.A0x(c9n5.A00), "continue", 38);
                }
                metaAIVoiceNuxFragment.A0p();
                i5 = 406774423;
                0FI.A0B(i5, A055);
                return;
            case 14:
                A055 = 0FI.A05(1130380230);
                FbUserSession A04 = 7zQ.A0N().A04();
                ThreadSettingsAiPageCustomCommandRow threadSettingsAiPageCustomCommandRow = (ThreadSettingsAiPageCustomCommandRow) this.A01;
                List A002 = 6PZ.A00((6PZ) 1Lm.A05(threadSettingsAiPageCustomCommandRow.A00, A04, 68152), 1BK.A0w(threadSettingsAiPageCustomCommandRow.A01), false);
                if (A002 != null) {
                    Q4l.A04.A00(1vD.A00(view), A002, 2131967078);
                }
                i5 = -1225389709;
                0FI.A0B(i5, A055);
                return;
            case 15:
                A055 = 0FI.A05(-318350723);
                ThreadSettingsAiBotDataUsageRow threadSettingsAiBotDataUsageRow = (ThreadSettingsAiBotDataUsageRow) this.A01;
                C76 c762 = threadSettingsAiBotDataUsageRow.A01;
                Context context2 = threadSettingsAiBotDataUsageRow.A00;
                Uri A0D2 = 7zM.A0D("https://www.facebook.com/privacy/genai");
                C5id c5id2 = MessengerInAppBrowserLaunchParam.A0E.A02;
                11T.A09(c5id2);
                c762.A01(context2, A0D2, c5id2);
                i5 = 746199041;
                0FI.A0B(i5, A055);
                return;
            case 16:
                A052 = 0FI.A05(-2083620443);
                11T.A0F(view, 0);
                1pI A003 = 1vD.A00(view);
                ThreadSummary threadSummary = ((ThreadSettingsManageAIMemoryRow) this.A01).A01;
                Long A0k = (threadSummary == null || (threadKey2 = threadSummary.A0n) == null) ? null : 7zO.A0k(threadKey2);
                if (A003.BVa() && A0k != null) {
                    long longValue = A0k.longValue();
                    ?? c8v0 = new C8v0();
                    7zT.A1B((Fragment) c8v0, "thread_ID", Long.valueOf(longValue));
                    A003.Czz((Fragment) c8v0, 0S2.A0u, "ManageAiMemoryFragmentContentTag");
                }
                i2 = -368743179;
                0FI.A0B(i2, A052);
                return;
            case 17:
                A055 = 0FI.A05(-941441346);
                1pI A004 = 1vD.A00(view);
                if (A004.BVa()) {
                    A004.Czz((Fragment) this.A01, 0S2.A0u, "memu_settings_fragment_content_tag");
                }
                i5 = 95257578;
                0FI.A0B(i5, A055);
                return;
            case 18:
                A052 = 0FI.A05(2009150218);
                1pI A005 = 1vD.A00(view);
                ThreadSummary threadSummary2 = (ThreadSummary) this.A01;
                Long A0k2 = (threadSummary2 == null || (threadKey3 = threadSummary2.A0n) == null) ? null : 7zO.A0k(threadKey3);
                if (A005.BVa() && A0k2 != null) {
                    long longValue2 = A0k2.longValue();
                    Bundle A056 = 1BK.A05();
                    A056.putLong("thread_ID", longValue2);
                    ?? c8vF = new C8vF();
                    c8vF.setArguments(A056);
                    A005.Czz((Fragment) c8vF, 0S2.A0u, "AiBotEmbodimentPipSettingFragmentContentTag");
                }
                i2 = -918184483;
                0FI.A0B(i2, A052);
                return;
            case 19:
                A055 = 0FI.A05(1975876125);
                ((8Ys) this.A01).A01.invoke();
                i5 = 926232524;
                0FI.A0B(i5, A055);
                return;
            case 20:
                A055 = 0FI.A05(79336978);
                ((9ZK) this.A01).A00.BkU();
                i5 = -1610211701;
                0FI.A0B(i5, A055);
                return;
            case 21:
                int A057 = 0FI.A05(1795838167);
                9Ha r010 = ((8V7) this.A01).A00;
                Context A08 = 4YU.A08(view);
                AiAgentTakeOverBottomSheetDialogFragment aiAgentTakeOverBottomSheetDialogFragment = r010.A00;
                AiAgentTakeOverBottomSheetDialogFragment.A05(aiAgentTakeOverBottomSheetDialogFragment, "click", "confirm");
                FbUserSession fbUserSession = aiAgentTakeOverBottomSheetDialogFragment.A00;
                if (fbUserSession == null) {
                    str = "fbUserSession";
                } else {
                    9fV r011 = (9fV) 1Lo.A04(A08, fbUserSession, (1BY) null, 68038);
                    AiAgentTakeOverBottomSheetDialogModel aiAgentTakeOverBottomSheetDialogModel = aiAgentTakeOverBottomSheetDialogFragment.A01;
                    str = "model";
                    if (aiAgentTakeOverBottomSheetDialogModel != null) {
                        String str2 = aiAgentTakeOverBottomSheetDialogModel.A01;
                        11T.A0A(str2);
                        AiAgentTakeOverBottomSheetDialogModel aiAgentTakeOverBottomSheetDialogModel2 = aiAgentTakeOverBottomSheetDialogFragment.A01;
                        if (aiAgentTakeOverBottomSheetDialogModel2 != null) {
                            String str3 = aiAgentTakeOverBottomSheetDialogModel2.A00;
                            11T.A0A(str3);
                            AiAgentTakeOverBottomSheetDialogModel aiAgentTakeOverBottomSheetDialogModel3 = aiAgentTakeOverBottomSheetDialogFragment.A01;
                            if (aiAgentTakeOverBottomSheetDialogModel3 != null) {
                                String str4 = aiAgentTakeOverBottomSheetDialogModel3.A02;
                                11T.A0A(str4);
                                r011.A01.put(str2, false);
                                GraphQlQueryParamSet A0M = 7zL.A0M();
                                07S A0J = 4YU.A0J(GraphQlCallInput.A02, str3, "page_id");
                                07S.A00(A0J, str4, "user_id");
                                4YV.A1A(A0J, A0M, "data");
                                5Dh A006 = 5Dh.A00(A0M, new C01643sd(Q7a.class, "DisableAgentMutation", null, "data", "fbandroid", -197835321, 384, 1815258156L, 1815258156L, false, true));
                                1Fw.A04(7zQ.A0O(A08));
                                7zM.A0K(A08).A09(A006);
                                9fV.A00(r011, str2, false);
                                aiAgentTakeOverBottomSheetDialogFragment.A0o();
                                0FI.A0B(-573184363, A057);
                                return;
                            }
                        }
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 22:
                A055 = 0FI.A05(-67871538);
                ((8V7) this.A01).A00.A00.A0o();
                i5 = -1817312953;
                0FI.A0B(i5, A055);
                return;
            case 23:
                A055 = 0FI.A05(-540332525);
                ((PageRTCDisableCallingWarningBottomSheet) this.A01).A1M();
                i5 = -497471596;
                0FI.A0B(i5, A055);
                return;
            case 24:
                A055 = 0FI.A05(587104092);
                ((8dA) this.A01).A01.invoke();
                i5 = -1571443350;
                0FI.A0B(i5, A055);
                return;
            case 25:
                A055 = 0FI.A05(1033077301);
                Q4l.A04.A00(1vD.A00(view), (List) this.A01, 2131955321);
                i5 = 696063839;
                0FI.A0B(i5, A055);
                return;
            case 26:
                A055 = 0FI.A05(2008866287);
                9Hf r012 = ((C8Wm) this.A01).A00;
                C68t A0R2 = 7zU.A0R();
                ?? r013 = r012.A00;
                A0R2.A0E(r013.requireContext(), 4YU.A0F("https://www.facebook.com/help/3397387057158160"));
                AdminOnboardingBottomSheetFragment.A05(r013, "learn_more");
                i5 = -2135823607;
                0FI.A0B(i5, A055);
                return;
            case 27:
                A055 = 0FI.A05(-817279619);
                ((8aU) this.A01).A00.invoke();
                i5 = 1843257099;
                0FI.A0B(i5, A055);
                return;
            case 28:
                A055 = 0FI.A05(-1327449940);
                ((C8Wq) this.A01).A01.invoke();
                i5 = -592495944;
                0FI.A0B(i5, A055);
                return;
            case 29:
                A055 = 0FI.A05(1412202482);
                ((C8Wq) this.A01).A02.invoke();
                i5 = -282343045;
                0FI.A0B(i5, A055);
                return;
            case 30:
                A055 = 0FI.A05(164790941);
                9NR r014 = ((8aW) this.A01).A01;
                FoldersStickyFooterImplementation foldersStickyFooterImplementation = r014.A00;
                Context context3 = foldersStickyFooterImplementation.A02;
                MigColorScheme migColorScheme = r014.A01;
                3kD r015 = new 3kD(foldersStickyFooterImplementation);
                1Bn.A0A(67527);
                DR6 dr6 = new DR6(context3, migColorScheme);
                dr6.A03(context3.getString(2131954613));
                dr6.A0J(context3.getString(2131954612));
                C9oG.A00(dr6, context3.getString(2131954611), r015, 2);
                dr6.A0E(new DialogInterface.OnClickListener() { // from class: X.9np
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        7zU.A0x(dialogInterface);
                    }
                }, context3.getString(2131954610));
                dr6.A05();
                i5 = -738810959;
                0FI.A0B(i5, A055);
                return;
            case 31:
                A055 = 0FI.A05(626295140);
                i5 = -1429196073;
                0FI.A0B(i5, A055);
                return;
            case 32:
                A055 = 0FI.A05(-1424746313);
                ((8fW) this.A01).A01.invoke();
                i5 = -109058741;
                0FI.A0B(i5, A055);
                return;
            case 33:
                A055 = 0FI.A05(1202729787);
                ((8fW) this.A01).A02.invoke();
                i5 = 1962853345;
                0FI.A0B(i5, A055);
                return;
            case 34:
                A055 = 0FI.A05(-116527309);
                new AboutCommunityFragment().A0m(((Fragment) this.A01).getParentFragmentManager(), "AboutCommunityFragment");
                i5 = -259067140;
                0FI.A0B(i5, A055);
                return;
            case 35:
                A055 = 0FI.A05(-1938173422);
                ((8gP) this.A01).A02.invoke();
                i5 = 340612944;
                0FI.A0B(i5, A055);
                return;
            case 36:
                A055 = 0FI.A05(-1610487438);
                ((8gP) this.A01).A03.invoke();
                i5 = 455259288;
                0FI.A0B(i5, A055);
                return;
            case 37:
                A05 = 0FI.A05(700290853);
                ?? r016 = ((C1949Axe) this.A01).A01.A00;
                06Z r017 = r016.mFragmentManager;
                if (r017 != null) {
                    94S r018 = MigBottomSheetDialogFragment.A01;
                    GenAIChatSuggestion genAIChatSuggestion = r016.A02;
                    str = "chatSuggestion";
                    if (genAIChatSuggestion != null) {
                        long j = genAIChatSuggestion.A01;
                        Long valueOf = Long.valueOf(j);
                        long j2 = genAIChatSuggestion.A00;
                        Long valueOf2 = Long.valueOf(j2);
                        if (valueOf != null && valueOf2 != null) {
                            CIp cIp = r016.A01;
                            if (cIp != null) {
                                ?? baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                                baseMigBottomSheetDialogFragment.setArguments(0PK.A00(7zO.A1b("community_id_arg", Long.valueOf(j2), 1BK.A1G("chat_suggestion_arg", Long.valueOf(j)))));
                                baseMigBottomSheetDialogFragment.A00 = cIp;
                                baseMigBottomSheetDialogFragment.A0m(r017, "GenAIChatSuggestionsBottomSheetFragment");
                            }
                            str = "genAIChatSuggestionsViewData";
                        }
                        r016.A0o();
                    }
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                94S r019 = MigBottomSheetDialogFragment.A01;
                C1296Ad8 A0W = 7zR.A0W();
                GenAIChatSuggestion genAIChatSuggestion2 = r016.A02;
                str = "chatSuggestion";
                if (genAIChatSuggestion2 != null) {
                    String valueOf3 = String.valueOf(Long.valueOf(genAIChatSuggestion2.A00));
                    String str5 = r016.A03;
                    GenAIChatSuggestion genAIChatSuggestion3 = r016.A02;
                    if (genAIChatSuggestion3 != null) {
                        String str6 = genAIChatSuggestion3.A06;
                        if (str6 == null) {
                            str6 = "";
                        }
                        A0W.A04(new CommunityMessagingLoggerModel(null, null, valueOf3, str5, null, null, "ai_channel_recs", "ai_chat_suggestion_bottom_sheet", "report_chat", "channel_list", null, 1BK.A1D("channel_name", str6)));
                        i = -61744188;
                        0FI.A0B(i, A05);
                        return;
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 38:
                A055 = 0FI.A05(-1975766655);
                7zU.A0R().A0G(((Fragment) this.A01).requireContext(), 4YU.A0F(AbE.A00(546)), C5id.A10);
                i5 = 1714645800;
                0FI.A0B(i5, A055);
                return;
            case 39:
                A055 = 0FI.A05(1170341653);
                ((C2lh) this.A01).A01();
                i5 = -1880812496;
                0FI.A0B(i5, A055);
                return;
            case 40:
                A055 = 0FI.A05(-1380421777);
                7zL.A1S(this.A01);
                i5 = 66394487;
                0FI.A0B(i5, A055);
                return;
            case 41:
                A055 = 0FI.A05(-1422085061);
                ((8iG) this.A01).A00.onClick(view);
                i5 = 137163148;
                0FI.A0B(i5, A055);
                return;
            case 42:
                A055 = 0FI.A05(627306017);
                ((C8hs) this.A01).A01.A04.invoke();
                i5 = -367571426;
                0FI.A0B(i5, A055);
                return;
            case 43:
                A055 = 0FI.A05(223749690);
                ((C8hs) this.A01).A01.A06.invoke();
                i5 = 1900028315;
                0FI.A0B(i5, A055);
                return;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A055 = 0FI.A05(482455954);
                ((C8hs) this.A01).A00.onClick(view);
                i5 = 2099703931;
                0FI.A0B(i5, A055);
                return;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A05 = 0FI.A05(-1074325749);
                JoiningChainingChatBottomSheetFragment joiningChainingChatBottomSheetFragment = ((C8bn) this.A01).A00.A00;
                2qR r020 = BaseMigBottomSheetDialogFragment.A06;
                C9m5 c9m5 = (C9m5) 1Br.A0B(joiningChainingChatBottomSheetFragment.A09);
                CommunityMessagingInviteLinkData communityMessagingInviteLinkData = joiningChainingChatBottomSheetFragment.A02;
                str = "inviteLinkData";
                if (communityMessagingInviteLinkData != null) {
                    String str7 = communityMessagingInviteLinkData.A0E;
                    C1296Ad8.A02((C1296Ad8) 1Br.A0B(c9m5.A04), new CommunityMessagingLoggerModel(null, null, null, null, null, null, null, "group_join_chaining_bottom_sheet", "group_join_chaining_bottom_sheet_dismissed", "chats_inbox", null, 1BK.A1D("is_smc", 6EX.A02(communityMessagingInviteLinkData.A0B, (str7 == null || (A0e = 0CW.A0e(str7)) == null) ? 0L : A0e.longValue()) ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT)), "dismiss");
                    JoiningChainingChatBottomSheetFragment.A05(joiningChainingChatBottomSheetFragment);
                    joiningChainingChatBottomSheetFragment.A0p();
                    9VC r021 = joiningChainingChatBottomSheetFragment.A01;
                    if (r021 != null) {
                        CommunityMessagingInviteLinkData communityMessagingInviteLinkData2 = joiningChainingChatBottomSheetFragment.A02;
                        if (communityMessagingInviteLinkData2 != null) {
                            11T.A0A(ImmutableList.copyOf((Collection) joiningChainingChatBottomSheetFragment.A0C));
                            if (communityMessagingInviteLinkData2.A0B != null) {
                                r021.A04.A03(null, communityMessagingInviteLinkData2, r021.A05, r021.A07);
                            }
                            i = -1084949924;
                            0FI.A0B(i, A05);
                            return;
                        }
                    }
                    str = "joinChainingChatManager";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 46:
                A052 = 0FI.A05(380910112);
                JoiningChainingChatBottomSheetFragment joiningChainingChatBottomSheetFragment2 = ((C8bn) this.A01).A00.A00;
                2qR r022 = BaseMigBottomSheetDialogFragment.A06;
                C9m5 c9m52 = (C9m5) 1Br.A0B(joiningChainingChatBottomSheetFragment2.A09);
                CommunityMessagingInviteLinkData communityMessagingInviteLinkData3 = joiningChainingChatBottomSheetFragment2.A02;
                str = "inviteLinkData";
                if (communityMessagingInviteLinkData3 != null) {
                    String str8 = communityMessagingInviteLinkData3.A0E;
                    ((C1296Ad8) 1Br.A0B(c9m52.A04)).A04(new CommunityMessagingLoggerModel(null, null, null, null, null, null, "join_chat_button", "group_join_chaining_bottom_sheet", "chat_recommendation_direct_join_clicked", "chats_inbox", null, 1BK.A1D("is_smc", 6EX.A02(communityMessagingInviteLinkData3.A0B, (str8 == null || (A0e2 = 0CW.A0e(str8)) == null) ? 0L : A0e2.longValue()) ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT)));
                    JoiningChainingChatBottomSheetFragment.A05(joiningChainingChatBottomSheetFragment2);
                    joiningChainingChatBottomSheetFragment2.A0p();
                    9VC r023 = joiningChainingChatBottomSheetFragment2.A01;
                    if (r023 != null) {
                        CommunityMessagingInviteLinkData communityMessagingInviteLinkData4 = joiningChainingChatBottomSheetFragment2.A02;
                        if (communityMessagingInviteLinkData4 != null) {
                            ImmutableList A0a = 1BL.A0a(joiningChainingChatBottomSheetFragment2.A0C);
                            Long l = communityMessagingInviteLinkData4.A0B;
                            if (l != null) {
                                22I r024 = (22I) 1Lm.A05(r023.A00, r023.A01, 33183);
                                1Du it = A0a.iterator();
                                while (it.hasNext()) {
                                    Number number = (Number) it.next();
                                    CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint = r023.A05;
                                    Integer valueOf4 = communityMessagingJoinFlowEntrypoint != null ? Integer.valueOf(communityMessagingJoinFlowEntrypoint.value) : null;
                                    C96j c96j = communityMessagingInviteLinkData4.A03;
                                    11T.A0A(c96j);
                                    String A007 = C9m6.A00(c96j, communityMessagingJoinFlowEntrypoint, r023.A06);
                                    if (communityMessagingInviteLinkData4.A0M) {
                                        z = true;
                                        if (c96j == C96j.A02) {
                                            r024.A0I((MailboxCallback) null, ((AnonymousClass224) 1Br.A0B(r023.A03)).A00("949036578942304"), Boolean.valueOf(z), l, number, valueOf4, A007, (String) null, (String) null);
                                        }
                                    }
                                    z = false;
                                    r024.A0I((MailboxCallback) null, ((AnonymousClass224) 1Br.A0B(r023.A03)).A00("949036578942304"), Boolean.valueOf(z), l, number, valueOf4, A007, (String) null, (String) null);
                                }
                                r023.A04.A03(null, communityMessagingInviteLinkData4, r023.A05, r023.A07);
                            }
                            i2 = -62140493;
                            0FI.A0B(i2, A052);
                            return;
                        }
                    }
                    str = "joinChainingChatManager";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.ON_START_END /* 47 */:
                A052 = 0FI.A05(1344918050);
                ((ChannelListOnDemandPromotionBannerImplementation) this.A01).A02.Bks("cm_channel_list_on_demand_banner");
                i2 = 489978394;
                0FI.A0B(i2, A052);
                return;
            case ActionId.QUEUED /* 48 */:
                A052 = 0FI.A05(1936424658);
                ((ChannelListServerPromotionBannerImplementation) this.A01).A08.Bks("cm_channel_list_server_banner");
                i2 = -264954422;
                0FI.A0B(i2, A052);
                return;
            case ActionId.IN_PROGRESS /* 49 */:
                A052 = 0FI.A05(589019150);
                ?? r025 = ((8VB) this.A01).A00.A01;
                GenAiSuggestedChatsInfoBottomSheetFragment.A05(r025, false);
                CIp cIp2 = r025.A00;
                if (cIp2 != null) {
                    long j3 = r025.requireArguments().getLong("community_id_arg");
                    if (Long.valueOf(j3) != null) {
                        22I r026 = (22I) 1Br.A0B(((CFK) 1Br.A0B(cIp2.A09)).A06);
                        1Um A0O2 = 1BK.A0O(r026, 0);
                        MailboxFutureImpl A0P = 1BK.A0P(A0O2);
                        1Um.A02(A0O2, new A1U(r026, A0P, 7, j3), A0P, false);
                    }
                    r025.A0o();
                    i2 = 1965691246;
                    0FI.A0B(i2, A052);
                    return;
                }
                str = "genAIChatSuggestionsViewData";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 50:
                A052 = 0FI.A05(1286741181);
                7zR.A0Z().A01(7zL.A0A(((8VB) this.A01).A00.A00), 7zM.A0D("https://www.facebook.com/privacy/guide/generative-ai/"), C5id.A06);
                i2 = -1643356037;
                0FI.A0B(i2, A052);
                return;
            case ActionId.UNKNOWN /* 51 */:
                A053 = 0FI.A05(-1276789974);
                SidechatsGenericNuxFragment sidechatsGenericNuxFragment = (SidechatsGenericNuxFragment) this.A01;
                RPY rpy = SidechatsGenericNuxFragment.A06;
                C9es c9es = sidechatsGenericNuxFragment.A01;
                if (c9es == null) {
                    str = "falcoLogger";
                } else {
                    ThreadKey threadKey5 = sidechatsGenericNuxFragment.A02;
                    if (threadKey5 == null) {
                        str = "parentThreadKey";
                    } else {
                        long A0r = threadKey5.A0r();
                        BM4 bm4 = sidechatsGenericNuxFragment.A00;
                        if (bm4 != null) {
                            String str9 = bm4.parentSurface;
                            11T.A0F(str9, 1);
                            C9es.A00(c9es).A04(new CommunityMessagingLoggerModel(null, null, null, null, String.valueOf(A0r), null, "got_it", AbE.A00(730), AbE.A00(ActionId.WAIT_FOR_BLOCKERS), str9, null, null));
                            sidechatsGenericNuxFragment.A0o();
                            i3 = 17078271;
                            0FI.A0B(i3, A053);
                            return;
                        }
                        str = "entryPoint";
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                A052 = A00(this, -1073623482);
                i2 = -1453354013;
                0FI.A0B(i2, A052);
                return;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                A05 = 0FI.A05(1032685436);
                C8bs c8bs = (C8bs) this.A01;
                (c8bs.A04 ? c8bs.A03 : c8bs.A02).invoke();
                i = 1274373124;
                0FI.A0B(i, A05);
                return;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                A052 = 0FI.A05(-1265784381);
                ((8VC) this.A01).A00.invoke(AnonymousClass001.A0K());
                i2 = -416240689;
                0FI.A0B(i2, A052);
                return;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                A052 = 0FI.A05(-594227533);
                Context A0A = 7zU.A0A(this.A01);
                1BV A008 = 1BV.A00(68729);
                try {
                    Uri A032 = C0A2.A03("https://www.messenger.com/help/2750564398424947");
                    if (A032 != null) {
                        ((C76) A008.get()).A01(A0A, A032, C5id.A0z);
                    }
                } catch (SecurityException unused2) {
                }
                i2 = 1457006559;
                0FI.A0B(i2, A052);
                return;
            case ActionId.QUEUEING_FAIL /* 56 */:
                A052 = 0FI.A05(1921129536);
                ((C8ae) this.A01).A03.invoke();
                i2 = 136332504;
                0FI.A0B(i2, A052);
                return;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                A052 = 0FI.A05(911349615);
                7zL.A1T(this.A01, view);
                i2 = -1835370900;
                0FI.A0B(i2, A052);
                return;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                A052 = 0FI.A05(-1853754875);
                ((C8bt) this.A01).A03.invoke();
                i2 = 1938165276;
                0FI.A0B(i2, A052);
                return;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                A052 = 0FI.A05(1947899251);
                ?? r027 = (GeneratedThemeCreationFragment) this.A01;
                ArrayList A11 = C0s8.A11(7zO.A0D((Fragment) r027).getString(2131952619), 7zO.A0D((Fragment) r027).getString(2131952620), 7zO.A0D((Fragment) r027).getString(2131952621), 7zO.A0D((Fragment) r027).getString(2131952622), 7zO.A0D((Fragment) r027).getString(2131952623), 7zO.A0D((Fragment) r027).getString(2131952624));
                if (7zU.A0Y((GeneratedThemeCreationFragment) r027).AZk(36325278612804148L)) {
                    A11.addAll(C0s8.A14(7zO.A0D((Fragment) r027).getString(2131952694), 7zO.A0D((Fragment) r027).getString(2131952695), 7zO.A0D((Fragment) r027).getString(2131952696), 7zO.A0D((Fragment) r027).getString(2131952697), 7zO.A0D((Fragment) r027).getString(2131952698), 7zO.A0D((Fragment) r027).getString(2131952699), 7zO.A0D((Fragment) r027).getString(2131952700), 7zO.A0D((Fragment) r027).getString(2131952701), 7zO.A0D((Fragment) r027).getString(2131952702), 7zO.A0D((Fragment) r027).getString(2131952703)));
                }
                if (7zU.A0Y((GeneratedThemeCreationFragment) r027).AZk(36325278612738611L)) {
                    A11.addAll(C0s8.A14(7zO.A0D((Fragment) r027).getString(2131952705), 7zO.A0D((Fragment) r027).getString(2131952704), 7zO.A0D((Fragment) r027).getString(2131952706), 7zO.A0D((Fragment) r027).getString(2131952707), 7zO.A0D((Fragment) r027).getString(2131952708), 7zO.A0D((Fragment) r027).getString(2131952709), 7zO.A0D((Fragment) r027).getString(2131952710), 7zO.A0D((Fragment) r027).getString(2131952711), 7zO.A0D((Fragment) r027).getString(2131952712)));
                }
                C07z c07z = C07y.A00;
                Object obj2 = A11.get(C07y.A01.A05(A11.size()));
                11T.A0A(obj2);
                String str10 = (String) obj2;
                EditText editText = r027.A03;
                if (editText != null) {
                    editText.setText(str10);
                }
                i2 = 70208642;
                0FI.A0B(i2, A052);
                return;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                A052 = 0FI.A05(1809960493);
                ((QFm) this.A01).A00.A01.A0o();
                i2 = -1734669845;
                0FI.A0B(i2, A052);
                return;
            case ActionId.COUNTER /* 61 */:
                A052 = 0FI.A05(1028870300);
                Context context4 = ((QFm) this.A01).A00.A00.A0D;
                7zU.A0u(context4, (FIu) 7zN.A0k(context4, 100011), "https://www.facebook.com/help/messenger-app/786613221989782?ref=learn_more");
                i2 = 1810559853;
                0FI.A0B(i2, A052);
                return;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                A052 = 0FI.A05(-392469228);
                ((8VH) this.A01).A00.A01.A0o();
                i2 = -1892061224;
                0FI.A0B(i2, A052);
                return;
            case 63:
                A052 = 0FI.A05(522073009);
                7zR.A0Z().A01(7zL.A0A(((8VH) this.A01).A00.A00), 7zM.A0D("https://www.facebook.com/help/messenger-app/786613221989782?ref=learn_more"), C5id.A0Z);
                i2 = 967437416;
                0FI.A0B(i2, A052);
                return;
            case 64:
                A052 = 0FI.A05(-913420589);
                EbDefaultUpsellFragment ebDefaultUpsellFragment = ((8VI) this.A01).A00.A00;
                8Co r028 = ebDefaultUpsellFragment.A01;
                if (r028 == null) {
                    str = "viewModel";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                Bundle A1a = ebDefaultUpsellFragment.A1a();
                C00i c00i = r028.A02.A00;
                7zU.A0O(c00i).A08("DEFAULT_EB_UPSELL_TURN_ON_CLICK");
                7zU.A0O(c00i).A0B("DEFAULT_EB_REQUESTED", ConstantsKt.CAMERA_ID_BACK);
                C1wk A0Z = 7zP.A0Z(r028.A01);
                1Ql.A02(C1wk.A02(A0Z), C1wg.A01(A0Z, 1NK.A4k, 1), true);
                1Br.A0C(r028.A00);
                7zR.A10(A1a, ebDefaultUpsellFragment, C97j.A0i.key);
                i2 = -1948659088;
                0FI.A0B(i2, A052);
                return;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                A053 = 0FI.A05(665523800);
                QGM qgm = (QGM) this.A01;
                if (!qgm.A02) {
                    qgm.A00.A00.A1f(true);
                }
                i3 = -1143651593;
                0FI.A0B(i3, A053);
                return;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                A053 = 0FI.A05(1060524343);
                QGM qgm2 = (QGM) this.A01;
                if (!qgm2.A02) {
                    qgm2.A00.A00.A1c();
                }
                i3 = -397356148;
                0FI.A0B(i3, A053);
                return;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                A053 = 0FI.A05(-1850250751);
                QGN qgn = (QGN) this.A01;
                if (!qgn.A02) {
                    qgn.A00.A00.A1f(true);
                }
                i3 = -2036508997;
                0FI.A0B(i3, A053);
                return;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                A053 = 0FI.A05(2132776454);
                QGN qgn2 = (QGN) this.A01;
                if (!qgn2.A02) {
                    qgn2.A00.A00.A1c();
                }
                i3 = 643020510;
                0FI.A0B(i3, A053);
                return;
            case ActionId.INTERACTION_OPEN_MEDIA_PICKER /* 69 */:
                A053 = 0FI.A05(1100780964);
                QGO qgo = (QGO) this.A01;
                if (!qgo.A02) {
                    qgo.A00.A00.A1f(true);
                }
                i3 = -1054225654;
                0FI.A0B(i3, A053);
                return;
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                A053 = 0FI.A05(-164958165);
                QGO qgo2 = (QGO) this.A01;
                if (!qgo2.A02) {
                    qgo2.A00.A00.A1b();
                }
                i3 = 544447773;
                0FI.A0B(i3, A053);
                return;
            case ActionId.INTERACTION_OPEN_CHECK_IN /* 71 */:
                A053 = 0FI.A05(2054617456);
                C8ag c8ag = (C8ag) this.A01;
                if (!c8ag.A04) {
                    c8ag.A00.Box();
                }
                i3 = -643779233;
                0FI.A0B(i3, A053);
                return;
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                A053 = 0FI.A05(-1291850088);
                C8ag c8ag2 = (C8ag) this.A01;
                if (!c8ag2.A04) {
                    c8ag2.A00.Bou();
                }
                i3 = -985933166;
                0FI.A0B(i3, A053);
                return;
            case ActionId.INTENT_MAPPED /* 73 */:
                A053 = 0FI.A05(366165554);
                C8ah c8ah = (C8ah) this.A01;
                if (!c8ah.A04) {
                    c8ah.A00.A00.A1f(true);
                }
                i3 = -2068681068;
                0FI.A0B(i3, A053);
                return;
            case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                A053 = 0FI.A05(3357032);
                C8ah c8ah2 = (C8ah) this.A01;
                if (!c8ah2.A04) {
                    c8ah2.A00.A00.A1c();
                }
                i3 = 1207538553;
                0FI.A0B(i3, A053);
                return;
            case ActionId.ACTIVITY_PAUSED /* 75 */:
                A053 = 0FI.A05(1090454754);
                C8ah c8ah3 = (C8ah) this.A01;
                if (!c8ah3.A04) {
                    c8ah3.A00.A00.A1f(true);
                }
                i3 = -416721266;
                0FI.A0B(i3, A053);
                return;
            case ActionId.ACTIVITY_STARTED /* 76 */:
                A052 = 0FI.A05(-586460021);
                PinReminderFragment pinReminderFragment = ((8dE) this.A01).A02.A00;
                94S r029 = MigBottomSheetDialogFragment.A01;
                C9ga c9ga = pinReminderFragment.A00;
                if (c9ga != null) {
                    ((9hC) 1Br.A0B(c9ga.A05)).A01("PIN_VALIDATION_RESET_PIN_CLICK");
                    c9ga.A0A.Cvx(96B.A07);
                    i2 = 474137686;
                    0FI.A0B(i2, A052);
                    return;
                }
                str = "viewData";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.ACTIVITY_RESUMED /* 77 */:
                A052 = 0FI.A05(-943781186);
                ((C8Wv) this.A01).A02.invoke();
                i2 = -655465726;
                0FI.A0B(i2, A052);
                return;
            case ActionId.FRAGMENT_CREATED /* 78 */:
                A052 = 0FI.A05(916455645);
                ((8Z4) this.A01).A03.invoke();
                i2 = 42150643;
                0FI.A0B(i2, A052);
                return;
            case ActionId.FRAGMENT_RESUMED /* 79 */:
                A052 = 0FI.A05(455378444);
                ((8Z4) this.A01).A02.invoke();
                i2 = 1826631834;
                0FI.A0B(i2, A052);
                return;
            case 80:
                A052 = 0FI.A05(1928768196);
                ((C8Ww) this.A01).A02.invoke();
                i2 = -872723845;
                0FI.A0B(i2, A052);
                return;
            case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                A05 = 0FI.A05(803321676);
                EbMigrationPinCreationFragment ebMigrationPinCreationFragment = ((8dF) this.A01).A03.A00;
                9lO r030 = ebMigrationPinCreationFragment.A01;
                str = "viewData";
                if (r030 != null) {
                    r030.A03();
                    9lO r031 = ebMigrationPinCreationFragment.A01;
                    if (r031 != null) {
                        int ordinal = ((95E) ((LiveData) r031.A0J.getValue()).getValue()).ordinal();
                        if (ordinal == 0) {
                            Bundle A058 = 1BK.A05();
                            A058.putBoolean("reset_pin", true);
                            A058.putBoolean("from_setting", !ebMigrationPinCreationFragment.A1l());
                            ebMigrationPinCreationFragment.A1r(C97j.A0b.key, A058);
                        } else if (ordinal == 1) {
                            EbMigrationPinCreationFragment.A0C(ebMigrationPinCreationFragment);
                            ebMigrationPinCreationFragment.A1r("hsm_restore_forgot_pin_reset_pin", Bundle.EMPTY);
                        }
                        i = 1656788630;
                        0FI.A0B(i, A05);
                        return;
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                A05 = 0FI.A05(2142906843);
                ((C8dz) this.A01).A03.Boj();
                i = -1420552193;
                0FI.A0B(i, A05);
                return;
            case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                A05 = 0FI.A05(1956220009);
                ((8VJ) this.A01).A00.A00();
                i = -498608702;
                0FI.A0B(i, A05);
                return;
            case ActionId.MARKER_SWAPPED /* 84 */:
                A05 = 0FI.A05(421851719);
                EncryptedBackupsSetupFragment encryptedBackupsSetupFragment = ((8VJ) this.A01).A00.A00;
                encryptedBackupsSetupFragment.A1d().A08("SETUP_INTRO_SCREEN_ADVANCED_OPTIONS_TAP");
                7zU.A1O(C97j.A0R, encryptedBackupsSetupFragment);
                i = -1571316496;
                0FI.A0B(i, A05);
                return;
            case ActionId.FRAGMENT_INSTANCE_CREATED /* 85 */:
                A05 = 0FI.A05(1840285032);
                ((8VK) this.A01).A00.C7j();
                i = 1204218430;
                0FI.A0B(i, A05);
                return;
            case ActionId.PREV_ACTIVITY_PAUSED /* 86 */:
                A05 = 0FI.A05(1617548531);
                ((8VL) this.A01).A00.A00();
                i = -1185483;
                0FI.A0B(i, A05);
                return;
            case ActionId.ERROR /* 87 */:
                A053 = 0FI.A05(1608523993);
                8Z5 r032 = (8Z5) this.A01;
                if (!r032.A03) {
                    EbSetupOptOutFragment ebSetupOptOutFragment = r032.A00.A00;
                    ebSetupOptOutFragment.A1d().A08("SETUP_ADVANCED_SETUP_LOCAL_STORAGE_SETUP_CONFIRM");
                    ebSetupOptOutFragment.A1k(AQn.A01(ebSetupOptOutFragment, 1), AQn.A01(ebSetupOptOutFragment, 2), 2131966432, 2131966431, 2131962481, 2131966430);
                }
                i3 = -219898981;
                0FI.A0B(i3, A053);
                return;
            case ActionId.METHOD_INVOKE /* 88 */:
                A05 = 0FI.A05(-1525885752);
                ((8VN) this.A01).A00.A00();
                i = 1451381726;
                0FI.A0B(i, A05);
                return;
            case ActionId.FINALLY /* 89 */:
                A05 = 0FI.A05(-1231065141);
                EncryptedBackupsSetupFragment encryptedBackupsSetupFragment2 = ((8VN) this.A01).A00.A00;
                encryptedBackupsSetupFragment2.A1d().A08("SETUP_INTRO_SCREEN_ADVANCED_OPTIONS_TAP");
                7zU.A1O(C97j.A0R, encryptedBackupsSetupFragment2);
                i = 1874377885;
                0FI.A0B(i, A05);
                return;
            case ActionId.PHOTO_DOWNLOAD_COMPLETE /* 90 */:
                A05 = 0FI.A05(-358927591);
                7zL.A1R(this.A01);
                i = 1897589551;
                0FI.A0B(i, A05);
                return;
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
                A053 = 0FI.A05(-213701191);
                C8hp c8hp = (C8hp) this.A01;
                if (!c8hp.A05) {
                    9gD r033 = c8hp.A02.A00;
                    int ordinal2 = ((C95y) r033.A03.getValue()).ordinal();
                    if (ordinal2 == 2) {
                        7zU.A0P(r033.A07).A08("SETUP_ADVANCED_SETUP_GOTO_LOCAL_STORAGE_SETUP");
                        A0O = 7zP.A0O(r033.A06);
                        mutableLiveData = r033.A02;
                        anonymousClass965 = AnonymousClass965.A06;
                    } else if (ordinal2 == 1) {
                        7zU.A0P(r033.A07).A08("SETUP_ADVANCED_SETUP_GOTO_GOOGLE_DRIVE_SETUP");
                        A0O = 7zP.A0O(r033.A06);
                        mutableLiveData = r033.A02;
                        anonymousClass965 = AnonymousClass965.A04;
                    } else if (ordinal2 == 0) {
                        7zU.A0P(r033.A07).A08("SETUP_ADVANCED_SETUP_GOTO_PIN_CODE_SETUP");
                        A0O = 7zP.A0O(r033.A06);
                        mutableLiveData = r033.A02;
                        anonymousClass965 = AnonymousClass965.A05;
                    } else if (ordinal2 == 3) {
                        7zU.A0P(r033.A07).A08("SETUP_ADVANCED_SETUP_GOTO_40DIGIT_ACCESS_CODE_SETUP");
                        A0O = 7zP.A0O(r033.A06);
                        mutableLiveData = r033.A02;
                        anonymousClass965 = AnonymousClass965.A03;
                    }
                    A0O.A00(mutableLiveData, anonymousClass965);
                }
                i3 = 77900673;
                0FI.A0B(i3, A053);
                return;
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
                A05 = 0FI.A05(-202546505);
                ((8VO) this.A01).A00.CHC();
                i = -1478389305;
                0FI.A0B(i, A05);
                return;
            case ActionId.ANIMATION_END /* 93 */:
                A05 = 0FI.A05(-340987641);
                ((C8ai) this.A01).A00.CHC();
                i = -394069172;
                0FI.A0B(i, A05);
                return;
            case ActionId.UDP_REQUEST_SEND /* 94 */:
                A05 = 0FI.A05(-1308928232);
                ((8VP) this.A01).A00.A00();
                i = -30175187;
                0FI.A0B(i, A05);
                return;
            case ActionId.MAIN_COMPLETE /* 95 */:
                A05 = 0FI.A05(-352752935);
                EncryptedBackupsSetupFragment encryptedBackupsSetupFragment3 = ((8VP) this.A01).A00.A00;
                encryptedBackupsSetupFragment3.A1d().A08("SETUP_INTRO_SCREEN_ADVANCED_OPTIONS_TAP");
                7zU.A1O(C97j.A0R, encryptedBackupsSetupFragment3);
                i = -1926985268;
                0FI.A0B(i, A05);
                return;
            case ActionId.INTERRUPTED /* 96 */:
                A05 = 0FI.A05(995279989);
                ?? r034 = ((8VQ) this.A01).A00.A00;
                C9uq c9uq = r034.A00;
                if (c9uq == null) {
                    str = "userFlowLogger";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                c9uq.A08("SETUP_INTRO_SCREEN_CREATE_PIN_TAP");
                ?? hsmPinCodeSetupBaseFragment = new HsmPinCodeSetupBaseFragment();
                7zT.A1B((Fragment) hsmPinCodeSetupBaseFragment, "from_setting", AnonymousClass001.A0K());
                r034.A1i(hsmPinCodeSetupBaseFragment, "Pin_Setup");
                i = -1514277528;
                0FI.A0B(i, A05);
                return;
            case ActionId.NETWORK_FAILED /* 97 */:
                A053 = 0FI.A05(312540688);
                C8aj c8aj = (C8aj) this.A01;
                if (!c8aj.A02) {
                    c8aj.A00.Box();
                }
                i3 = 126693484;
                0FI.A0B(i3, A053);
                return;
            case ActionId.NETWORK_RESPONSE /* 98 */:
                A053 = 0FI.A05(1037244585);
                C8aj c8aj2 = (C8aj) this.A01;
                if (!c8aj2.A02) {
                    c8aj2.A00.Bou();
                }
                i3 = 1199514936;
                0FI.A0B(i3, A053);
                return;
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
                A05 = 0FI.A05(-1339422133);
                EbOneTimeCodeRestoreViewData ebOneTimeCodeRestoreViewData = ((8dG) this.A01).A02.A01;
                7zO.A0Z(ebOneTimeCodeRestoreViewData.A0K).A07("OTC_RESTORE_VIEW_ALL_DEVICES_CLICK");
                7zP.A0O(ebOneTimeCodeRestoreViewData.A0H).A01(ebOneTimeCodeRestoreViewData.A0A, BottomSheetState.LoadingDeviceList.A00);
                List list = ebOneTimeCodeRestoreViewData.A02;
                if (list != null) {
                    EbOneTimeCodeRestoreViewData.A03(ebOneTimeCodeRestoreViewData, list);
                }
                if (ebOneTimeCodeRestoreViewData.A02 == null && !ebOneTimeCodeRestoreViewData.A06) {
                    AQn A01 = AQn.A01(ebOneTimeCodeRestoreViewData, 28);
                    AQn A012 = AQn.A01(ebOneTimeCodeRestoreViewData, 29);
                    ebOneTimeCodeRestoreViewData.A06 = true;
                    ((ExecutorService) 1Br.A0B(ebOneTimeCodeRestoreViewData.A0E)).submit((Runnable) new SD1(ebOneTimeCodeRestoreViewData, A01, A012));
                }
                i = 705412780;
                0FI.A0B(i, A05);
                return;
            case 100:
                A053 = 0FI.A05(1806325978);
                C8ak c8ak = (C8ak) this.A01;
                if (!c8ak.A04) {
                    ?? r035 = c8ak.A00.A00;
                    AJd.A03(r035, LifecycleOwnerKt.getLifecycleScope(r035), 47);
                }
                i3 = -1570615848;
                0FI.A0B(i3, A053);
                return;
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                A05 = 0FI.A05(331321746);
                7zL.A1T(this.A01, view);
                i = -63142499;
                0FI.A0B(i, A05);
                return;
            case ActionId.DATA_LOAD_START /* 102 */:
                A05 = 0FI.A05(1544846950);
                EbConfirmRecoveryCodeFragment ebConfirmRecoveryCodeFragment = ((C8cg) this.A01).A02.A00;
                7zU.A0P(ebConfirmRecoveryCodeFragment.A02).A08("CREATE_PIN_INSTEAD_TAP");
                7zU.A1O(C97j.A0b, ebConfirmRecoveryCodeFragment);
                i = 46329774;
                0FI.A0B(i, A05);
                return;
            case ActionId.LEGACY_MARKER /* 103 */:
                A05 = 0FI.A05(-1226168693);
                7zL.A1R(this.A01);
                i = -29463400;
                0FI.A0B(i, A05);
                return;
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
                A05 = 0FI.A05(513542114);
                C8hk c8hk = (C8hk) this.A01;
                if (!c8hk.A04) {
                    EbRestoreOptionsFragment ebRestoreOptionsFragment = c8hk.A00.A00;
                    C9ch c9ch = ebRestoreOptionsFragment.A03;
                    str = "viewData";
                    if (c9ch != null) {
                        int ordinal3 = c9ch.A00().ordinal();
                        if (ordinal3 == 9) {
                            C9up c9up = ebRestoreOptionsFragment.A01;
                            if (c9up != null) {
                                c9up.A07("RESTORE_SKIP_CONFIRMATION_ALERT_SHOW");
                                ebRestoreOptionsFragment.A1h();
                                DR6 A0P2 = 7zV.A0P(ebRestoreOptionsFragment);
                                C9oG.A02(A0P2, ebRestoreOptionsFragment, 32, 2131956450);
                                C9oG.A01(A0P2, ebRestoreOptionsFragment, 33, 2131964499);
                                A0P2.A05();
                            } else {
                                str = "restoreFlowLogger";
                            }
                        } else if (ordinal3 != 32) {
                            C9ch c9ch2 = ebRestoreOptionsFragment.A03;
                            if (c9ch2 != null) {
                                c9ch2.A02();
                                C9ch c9ch3 = ebRestoreOptionsFragment.A03;
                                if (c9ch3 != null) {
                                    EbRestoreOptionsFragment.A0B(ebRestoreOptionsFragment, c9ch3.A00().key);
                                }
                            }
                        } else {
                            2aK.A03((Integer) null, (0DE) null, new AJe(ebRestoreOptionsFragment, null, 3), 7zN.A0y(), 3);
                        }
                        0FI.A0B(i, A05);
                        return;
                    }
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                i = -258798405;
                0FI.A0B(i, A05);
                return;
            case ActionId.ABORTED /* 105 */:
                A05 = 0FI.A05(242238076);
                C8e0 c8e0 = (C8e0) this.A01;
                C9Ik c9Ik = c8e0.A02;
                99W r036 = c8e0.A03;
                ?? r037 = c9Ik.A00;
                9TX r038 = r037.A04;
                str = "viewData";
                C8tQ c8tQ = null;
                if (r038 != null) {
                    7zO.A0Z(r038.A03).A07("RESTORE_ENTER_RECOVERY_CODE_SCREEN_ACTION_DONT_HAVE_RC");
                    if (r036 != null) {
                        r037.A06.getValue();
                        c8tQ = C9ku.A00(r036);
                    }
                    if (!(c8tQ instanceof C8tP)) {
                        if (c8tQ instanceof C8tQ) {
                            9TX r039 = r037.A04;
                            if (r039 != null) {
                                7zO.A0Z(r039.A03).A07("RESTORE_OPEN_HELP_CENTER");
                                FIu fIu = r037.A01;
                                if (fIu == null) {
                                    str = "messengerBrowserLauncher";
                                } else {
                                    fIu.A08(r037.requireContext(), c8tQ.A00);
                                }
                            }
                        } else if (r037.A04 == null) {
                            str = "squeak";
                        }
                        0FI.A0B(i, A05);
                        return;
                    }
                    r037.A1p();
                    Intent A059 = 7zV.A05(Bundle.EMPTY, (AbstractNavigableFragment) r037, ((C8tP) c8tQ).A00.key, r037.A1l() ? 1 : 0);
                    if (A059 != null) {
                        r037.A1Y(A059);
                    }
                    i = 1660724177;
                    0FI.A0B(i, A05);
                    return;
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.QUERY_READY /* 106 */:
                A05 = 0FI.A05(918288344);
                ?? r040 = ((C8Wx) this.A01).A01.A00;
                9Id r041 = r040.A00;
                if (r041 != null) {
                    7zO.A0Z(r041.A00).A07("RESTORE_BACKUP_RESET_PIN_ENTER_NEW_PIN_BUTTON_CLICK");
                    7zU.A15((Fragment) r040);
                    i = -2095886197;
                    0FI.A0B(i, A05);
                    return;
                }
                str = "pinResetYourPinViewData";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.RTMP_PACKET_RECEIVED /* 107 */:
                A05 = 0FI.A05(-2043102600);
                EncryptedBackupsHsmPinResetYourPinFragment encryptedBackupsHsmPinResetYourPinFragment = ((C8Wx) this.A01).A01.A00;
                9Id r042 = encryptedBackupsHsmPinResetYourPinFragment.A00;
                if (r042 != null) {
                    7zO.A0Z(r042.A00).A07("RESTORE_BACKUP_RESET_PIN_CANT_RESET_PIN_BUTTON_CLICK");
                    encryptedBackupsHsmPinResetYourPinFragment.A1q(encryptedBackupsHsmPinResetYourPinFragment.A1a(), C97j.A08);
                    i = -2108788179;
                    0FI.A0B(i, A05);
                    return;
                }
                str = "pinResetYourPinViewData";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 108:
                A05 = 0FI.A05(1508345429);
                EncryptedBackupsHsmPinTryAgainFragment encryptedBackupsHsmPinTryAgainFragment = ((C8al) this.A01).A03.A00;
                9Ia r043 = encryptedBackupsHsmPinTryAgainFragment.A00;
                if (r043 == null) {
                    str = "hsmPinTryAgainViewData";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                7zO.A0Z(r043.A00).A06("PIN_CODE_RESTORE_LOCKED_SKIP_CLICK");
                7zU.A1N(C97j.A07, encryptedBackupsHsmPinTryAgainFragment);
                i = -1241394633;
                0FI.A0B(i, A05);
                return;
            case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                A05 = 0FI.A05(-2058174790);
                EncryptedBackupsOtcFirstGreetingFragment encryptedBackupsOtcFirstGreetingFragment = ((C8am) this.A01).A00.A00;
                9Qi r044 = encryptedBackupsOtcFirstGreetingFragment.A00;
                if (r044 != null) {
                    7zO.A0Z(r044.A01).A07("OTC_RESTORE_INTRO_SCREEN_PRIMARY_ACTION");
                    String str11 = C97j.A0Y.key;
                    encryptedBackupsOtcFirstGreetingFragment.A1p();
                    9C4.A00(encryptedBackupsOtcFirstGreetingFragment, str11);
                    i = 464245161;
                    0FI.A0B(i, A05);
                    return;
                }
                str = "viewData";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.RTMP_CONNECTION_RELEASE /* 110 */:
                A05 = 0FI.A05(-434627454);
                ?? r045 = ((C8am) this.A01).A00.A00;
                9Qi r046 = r045.A00;
                str = "viewData";
                if (r046 != null) {
                    7zO.A0Z(r046.A01).A07("OTC_RESTORE_INTRO_SCREEN_SECONDARY_ACTION");
                    9Qi r047 = r045.A00;
                    if (r047 != null) {
                        if (7zS.A0x(r047.A02) == 0S2.A01) {
                            String str12 = C97j.A0X.key;
                            r045.A1p();
                            9C4.A00((BaseFragment) r045, str12);
                        } else {
                            FIu fIu2 = r045.A00;
                            if (fIu2 != null) {
                                7zU.A0u(r045.requireContext(), fIu2, "https://www.facebook.com/help/messenger-app/431055522328649?ref=learn_more");
                            } else {
                                str = "mMessengerBrowserLauncher";
                            }
                        }
                        i = 762740005;
                        0FI.A0B(i, A05);
                        return;
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.NEW_START_FOUND /* 111 */:
                A05 = 0FI.A05(-1028912464);
                EncryptedBackupsOtherStepsToRestoreFragment encryptedBackupsOtherStepsToRestoreFragment = ((C8an) this.A01).A01.A00;
                9Ic r048 = encryptedBackupsOtherStepsToRestoreFragment.A00;
                if (r048 == null) {
                    str = "otherStepsToRestoreViewData";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                7zO.A0Z(r048.A00).A06("RESTORE_END_OF_THE_ROAD_ACTION_END_FLOW");
                encryptedBackupsOtherStepsToRestoreFragment.A1q(encryptedBackupsOtherStepsToRestoreFragment.A1a(), C97j.A0E);
                i = -675698428;
                0FI.A0B(i, A05);
                return;
            case ActionId.MISSED_EVENT /* 112 */:
                A05 = 0FI.A05(-2146363522);
                7zU.A0R().A0G((Context) this.A01, 4YU.A0F("https://www.facebook.com/help/messenger-app/1946238052392522?ref=learn_more"), C5id.A10);
                i = -646060083;
                0FI.A0B(i, A05);
                return;
            case ActionId.TIMEOUT /* 113 */:
                A05 = 0FI.A05(-596771568);
                0D2 r049 = (0D2) this.A01;
                r049.A0p();
                7zR.A14(r049);
                i = 712302322;
                0FI.A0B(i, A05);
                return;
            case ActionId.CONTROLLER_INITIATED /* 114 */:
                A05 = 0FI.A05(-883208888);
                C68t A0R3 = 7zU.A0R();
                9gF r050 = (9gF) this.A01;
                1G2 r051 = 9gF.A08;
                A0R3.A0G(r050.A01, 4YU.A0F("https://www.facebook.com/help/messenger-app/1946238052392522?ref=learn_more"), C5id.A10);
                i = -375788397;
                0FI.A0B(i, A05);
                return;
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
                A05 = 0FI.A05(-962115676);
                Intent A009 = 4iH.A00();
                9gF r052 = (9gF) this.A01;
                1G2 r053 = 9gF.A08;
                0LS.A0A(r052.A01, A009);
                1Ql.A01(1Br.A08(r052.A07), 9gF.A08, true);
                i = -1530883377;
                0FI.A0B(i, A05);
                return;
            case ActionId.VIDEO_PLAYING /* 116 */:
                A05 = 0FI.A05(-1546086200);
                9gF r054 = (9gF) this.A01;
                FbUserSession fbUserSession2 = r054.A02;
                1Br A013 = 1Bu.A01(r054.A01, 82461);
                User user = r054.A00;
                if (user != null) {
                    1Br.A0D(r054.A04, new ABp(r054, fbUserSession2, 6), (ListenableFuture) ((CNa) 1Br.A0B(A013)).A03(fbUserSession2, user, false));
                }
                i = 1727095832;
                0FI.A0B(i, A05);
                return;
            case ActionId.RTMP_CONNECTION_CONNECTED /* 117 */:
                A05 = 0FI.A05(804441611);
                ((QH8) this.A01).A00.A00.A0o();
                i = -702253200;
                0FI.A0B(i, A05);
                return;
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                A05 = 0FI.A05(876231);
                7zU.A0R().A0E(((QFo) this.A01).A00.A00.requireContext(), 4YU.A0F("https://m.facebook.com/help/163810437015615/?ref=share"));
                i = 1051007374;
                0FI.A0B(i, A05);
                return;
            case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                A054 = 0FI.A05(-1839142117);
                C34s c34s = (C34s) this.A01;
                C3Ss.A01(98G.A03, 98A.A01, (C3Ss) 1Br.A0B(c34s.A0l));
                if (c34s.A0W == null || !1Br.A07(C65h.A02).AZk(36322001552950276L)) {
                    FbUserSession fbUserSession3 = c34s.A06;
                    if (fbUserSession3 != null && c34s.A0I != null && c34s.A0J != null) {
                        C65h c65h = C65h.A04;
                        if (1Br.A07(C65h.A02).AZk(36322001552884739L)) {
                            MigColorScheme migColorScheme2 = c34s.A0M;
                            if (migColorScheme2 == null) {
                                str = "colorSchemeSelected";
                                11T.A0L(str);
                                throw 0Q8.createAndThrow();
                            }
                            c65h.A08(fbUserSession3, c34s.A0I, c34s.A0J, migColorScheme2);
                        }
                    }
                } else {
                    2Of r055 = c34s.A0W;
                    if (r055 != null) {
                        r055.AQN((6Sh) new Object());
                    }
                }
                i4 = -469954374;
                0FI.A0B(i4, A054);
                return;
            case ActionId.VIDEO_SET_RENDERER_CONTEXT /* 120 */:
                A05 = 0FI.A05(1592100504);
                1pI r056 = ((C34s) this.A01).A07;
                if (r056 != null) {
                    r056.CeH(4YT.A00(1053));
                }
                i = 1908845379;
                0FI.A0B(i, A05);
                return;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                A05 = 0FI.A05(-1758313297);
                C34s.A09((C34s) this.A01);
                i = -369909603;
                0FI.A0B(i, A05);
                return;
            case ActionId.CARD_DATA_LOADED /* 122 */:
                A05 = 0FI.A05(2113801839);
                C34s.A09((C34s) this.A01);
                i = 432847581;
                0FI.A0B(i, A05);
                return;
            case ActionId.VIEW_WILL_APPEAR_BEGIN /* 123 */:
                A05 = 0FI.A05(2112449004);
                HdMediaNuxFragment.A05((HdMediaNuxFragment) this.A01);
                i = -34300433;
                0FI.A0B(i, A05);
                return;
            case ActionId.VIEW_DID_LOAD_BEGIN /* 124 */:
                A05 = A00(this, 1731598943);
                i = 1697084887;
                0FI.A0B(i, A05);
                return;
            case 125:
                A05 = 0FI.A05(601327157);
                HdMediaNuxFragment.A05((HdMediaNuxFragment) this.A01);
                i = 1099565190;
                0FI.A0B(i, A05);
                return;
            case ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES /* 126 */:
                A05 = 0FI.A05(-1871367727);
                9X7 r057 = ((8Gf) this.A01).A07;
                if (r057 != null) {
                    r057.A00(false);
                    i = -1975138820;
                    0FI.A0B(i, A05);
                    return;
                }
                str = "contentLoader";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 127:
                A054 = 0FI.A05(-1614467473);
                8Gh r058 = (8Gh) this.A01;
                C9ty c9ty = r058.A08;
                if (c9ty == null) {
                    str = "montageLoader";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                c9ty.A00();
                9bF r059 = r058.A0B;
                if (r059 != null) {
                    r059.A00(r058.A0X, false, true);
                    i4 = -519422297;
                    0FI.A0B(i4, A054);
                    return;
                }
                str = "contentLoader";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 128:
                A05 = 0FI.A05(700445805);
                7zL.A1R(this.A01);
                i = 651558657;
                0FI.A0B(i, A05);
                return;
            case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
                A05 = A00(this, -1323833295);
                i = -1417335535;
                0FI.A0B(i, A05);
                return;
            case ActionId.APP_DID_FINISH_LAUNCHING /* 130 */:
                A05 = A00(this, -234285332);
                i = 961319726;
                0FI.A0B(i, A05);
                return;
            case ActionId.APP_DID_BECOME_ACTIVE /* 131 */:
                A05 = 0FI.A05(-690745543);
                7zL.A1T(this.A01, view);
                i = -1207664802;
                0FI.A0B(i, A05);
                return;
            case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
                A05 = 0FI.A05(1890399446);
                83Y.A01((Context) this.A01, true);
                i = -1164000216;
                0FI.A0B(i, A05);
                return;
            case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
                A055 = 0FI.A05(1402599330);
                EAX eax = ((7UA) this.A01).A00;
                if (eax == null) {
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A0B(-297638993, A055);
                    throw A0h;
                }
                eax.cancel();
                i5 = 1124125020;
                0FI.A0B(i5, A055);
                return;
            case ActionId.APP_MAIN /* 134 */:
                A05 = 0FI.A05(883540136);
                C9kl c9kl = (C9kl) this.A01;
                FrameLayout frameLayout = c9kl.A03;
                frameLayout.setVisibility(0);
                2Wo r060 = c9kl.A0F;
                if (r060.A04()) {
                    r060.A03();
                }
                if (c9kl.A01 == null) {
                    int id = frameLayout.getId();
                    06Z r061 = c9kl.A04;
                    6QS A0Y = r061.A0Y(id);
                    c9kl.A01 = A0Y;
                    if (A0Y == null) {
                        6QS r062 = new 6QS();
                        Bundle A0510 = 1BK.A05();
                        A0510.putBoolean(4YT.A00(458), true);
                        r062.setArguments(A0510);
                        c9kl.A01 = r062;
                        C06c A0G3 = 7zL.A0G(r061);
                        A0G3.A0M(c9kl.A01, id);
                        A0G3.A04();
                    }
                    ((C62h) c9kl.A07.get()).A00 = c9kl.A0D;
                    c9kl.A01.A0F = c9kl.A0B;
                    UserKey A0L = ThreadKey.A0L(c9kl.A0C.A0n);
                    if (A0L != null) {
                        BTZ.A00(c9kl.A01.getLifecycle(), new 9uH(new 9uJ(c9kl), 0), ((AeX) 1Bn.A0E((Context) null, c9kl.A00, 82710)).A00(A0L));
                    } else {
                        C9kl.A01(c9kl, null);
                    }
                }
                frameLayout.post(new ADS(c9kl));
                i = -1803661768;
                0FI.A0B(i, A05);
                return;
            case ActionId.MQTT_CONNECTING /* 135 */:
                A05 = 0FI.A05(1181180628);
                HtH htH = ((8hF) this.A01).A00;
                if (htH != null) {
                    htH.A00();
                }
                i = 1519403260;
                0FI.A0B(i, A05);
                return;
            case ActionId.MQTT_CONNECTED /* 136 */:
                A05 = 0FI.A05(116244505);
                HtH htH2 = ((8hF) this.A01).A00;
                if (htH2 != null) {
                    htH2.A01();
                }
                i = 210526397;
                0FI.A0B(i, A05);
                return;
            case ActionId.MQTT_DISCONNECTED /* 137 */:
                A05 = 0FI.A05(-315806236);
                HtH htH3 = ((8hF) this.A01).A00;
                if (htH3 != null) {
                    htH3.A02();
                }
                i = -1938550436;
                0FI.A0B(i, A05);
                return;
            case ActionId.MESSENGER_DELTA_REQUEST /* 138 */:
                A055 = 0FI.A05(679040617);
                ((C8au) this.A01).A00.onClick(view);
                i5 = 1557110824;
                0FI.A0B(i5, A055);
                return;
            case ActionId.APP_FIRST_VIEW_CONTROLLER /* 139 */:
                A055 = 0FI.A05(1392183278);
                MemoriesNuxFragment.A05((MemoriesNuxFragment) this.A01);
                i5 = -866950804;
                0FI.A0B(i5, A055);
                return;
            case ActionId.MESSENGER_THREAD_LIST_LOADED /* 140 */:
                A055 = 0FI.A05(1588582897);
                8XH r063 = (8XH) this.A01;
                r063.A01.A02(r063.A00);
                i5 = 1407460363;
                0FI.A0B(i5, A055);
                return;
            case ActionId.MESSENGER_THREAD_LIST_DISPLAYED /* 141 */:
                A055 = 0FI.A05(459483413);
                C8hi c8hi = (C8hi) this.A01;
                long j4 = C8hi.A03;
                c8hi.A01.A02(c8hi.A00);
                i5 = 115249812;
                0FI.A0B(i5, A055);
                return;
            case ActionId.PREV_ACTIVITY_PAUSE /* 142 */:
                A055 = 0FI.A05(-2096739487);
                MagicModNuxFragment magicModNuxFragment = (MagicModNuxFragment) this.A01;
                9OJ r064 = magicModNuxFragment.A00;
                if (r064 != null) {
                    9Y7 r065 = (9Y7) 1Br.A0B(r064.A00.A00);
                    1Ql.A01(1Br.A08(r065.A00), ((1M0) 1Lm.A06(7zS.A0E(r065.A01), 100241)).A00("magic_mod_nux_accepted"), true);
                    r064.A01.invoke();
                    magicModNuxFragment.A0o();
                    i5 = 618192104;
                    0FI.A0B(i5, A055);
                    return;
                }
                str = "listener";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.ACTIVITY_RESUME /* 143 */:
                A05 = 0FI.A05(-91882303);
                8uM r066 = (8uM) this.A01;
                HGD hgd = r066.A03;
                if (hgd != null) {
                    User user2 = r066.A0D;
                    if (user2 != null) {
                        hgd.A08(user2.A0k, 0S2.A01);
                    }
                    str = "paramUser";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                i = -1826469220;
                0FI.A0B(i, A05);
                return;
            case ActionId.ACTIVITY_START /* 144 */:
                A05 = 0FI.A05(-282468667);
                8uM r067 = (8uM) this.A01;
                HGD hgd2 = r067.A03;
                if (hgd2 != null) {
                    User user3 = r067.A0D;
                    if (user3 != null) {
                        hgd2.A08(user3.A0k, 0S2.A00);
                    }
                    str = "paramUser";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                i = 936579280;
                0FI.A0B(i, A05);
                return;
            case ActionId.BEGIN_START_ACTIVITY /* 145 */:
                A05 = 0FI.A05(1828632925);
                8uM r068 = (8uM) this.A01;
                HGD hgd3 = r068.A03;
                if (hgd3 != null) {
                    User user4 = r068.A0D;
                    if (user4 != null) {
                        hgd3.A08(user4.A0k, 0S2.A0C);
                    }
                    str = "paramUser";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                i = 250343643;
                0FI.A0B(i, A05);
                return;
            case ActionId.END_START_ACTIVITY /* 146 */:
                A055 = 0FI.A05(-1127112953);
                ((C8cp) this.A01).A02.invoke();
                i5 = -172172149;
                0FI.A0B(i5, A055);
                return;
            case ActionId.FILE_SYSTEM_FAIL /* 147 */:
                A055 = 0FI.A05(1774472830);
                7zR.A0Z().A01(7zP.A0L((C2k6) this.A01), 7zM.A0D("https://www.facebook.com/help/messenger-app/1039542879410863"), C5id.A0Z);
                i5 = 199128691;
                0FI.A0B(i5, A055);
                return;
            case ActionId.FORMAT_ERROR /* 148 */:
                A052 = 0FI.A05(370314333);
                8uP r069 = (8uP) this.A01;
                List list2 = C2lb.A0J;
                AiBotGroupedCardStackLayoutManager aiBotGroupedCardStackLayoutManager = r069.A00;
                aiBotGroupedCardStackLayoutManager.A00 = !aiBotGroupedCardStackLayoutManager.A00;
                aiBotGroupedCardStackLayoutManager.A0e();
                TextView textView = ((8E2) r069).A05;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = ((8E2) r069).A06;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                RecyclerView recyclerView = ((8E2) r069).A07;
                if (recyclerView != null && (r0 = recyclerView.A0C) != null) {
                    r0.A07();
                }
                r069.A03.Bie(C9ls.A01(null, null, null, null, null, "see_less"));
                i2 = -1946981573;
                0FI.A0B(i2, A052);
                return;
            case ActionId.PRIVACY_VIOLATION /* 149 */:
                A05 = 0FI.A05(-1726951520);
                8Cd r070 = (8Cd) this.A01;
                float f = NestedScrollView.A0T;
                Aaf aaf = r070.A02;
                if (aaf != null) {
                    aaf.C9j();
                }
                i = 1879139322;
                0FI.A0B(i, A05);
                return;
            case 150:
                A05 = 0FI.A05(-1703401440);
                8Cf r071 = (8Cf) this.A01;
                float f2 = NestedScrollView.A0T;
                Aaf aaf2 = r071.A05;
                if (aaf2 != null) {
                    aaf2.C9j();
                }
                i = 571682931;
                0FI.A0B(i, A05);
                return;
            case ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE /* 151 */:
                A055 = 0FI.A05(-192661797);
                C8uT c8uT = (C8uT) this.A01;
                c8uT.A00.invoke(((EditText) 7zM.A1B(c8uT.A03)).getText().toString());
                i5 = -2083214993;
                0FI.A0B(i5, A055);
                return;
            case ActionId.APPLY_OPTIMISTICS /* 152 */:
                A055 = 0FI.A05(-157133022);
                ((C8uT) this.A01).A00.invoke(null);
                i5 = -1781930127;
                0FI.A0B(i5, A055);
                return;
            case ActionId.APPLY_FINISHED_LIST /* 153 */:
                A055 = 0FI.A05(-720541886);
                ((8iY) this.A01).A00.invoke();
                i5 = 154527273;
                0FI.A0B(i5, A055);
                return;
            case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                A05 = 0FI.A05(-62634385);
                9Sl r072 = ((C9z8) this.A01).A00;
                1Br r073 = r072.A01;
                94S r074 = MigBottomSheetDialogFragment.A01;
                C3RE c3re = (C3RE) 1Br.A0B(r073);
                String str13 = r072.A03;
                1UG A082 = 1BK.A08(1Br.A02(c3re.A00), "messenger_business_inbox_filter_clear_button_click");
                if (A082.isSampled()) {
                    A082.A7R("event_location", 1BJ.A00(1081));
                    1UG.A01(new 0DA(), A082);
                    4YU.A1H(A082, Long.parseLong(str13));
                    A082.BZL();
                }
                ((2SG) 1Br.A0B(r072.A00)).A01(1Hb.A02);
                r072.A02.A0o();
                i = -350973919;
                0FI.A0B(i, A05);
                return;
            case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                A05 = 0FI.A05(-1138280531);
                C00m c00m = ((C92f) this.A01).A01;
                if (c00m != null) {
                    c00m.invoke();
                }
                i = -22496092;
                0FI.A0B(i, A05);
                return;
            case ActionId.SERVICE_ON_START_COMMAND /* 156 */:
                A055 = 0FI.A05(27875697);
                ((8Vi) this.A01).A01.invoke();
                i5 = -108315304;
                0FI.A0B(i5, A055);
                return;
            case ActionId.WAIT_FOR_BLOCKERS /* 157 */:
                A055 = 0FI.A05(1627912134);
                ((View.OnClickListener) this.A01).onClick(view);
                i5 = -574754914;
                0FI.A0B(i5, A055);
                return;
            case ActionId.NOTIFY_SUBSCRIBERS /* 158 */:
                A055 = 0FI.A05(-1369014067);
                ((View.OnClickListener) this.A01).onClick(view);
                i5 = -585752090;
                0FI.A0B(i5, A055);
                return;
            case ActionId.FAIL_FILE_TOO_LARGE /* 159 */:
                A055 = 0FI.A05(689311150);
                ((View.OnClickListener) this.A01).onClick(view);
                i5 = -1312326496;
                0FI.A0B(i5, A055);
                return;
            case ActionId.OFFLINE /* 160 */:
                A055 = 0FI.A05(-1430946894);
                ((8Vp) this.A01).A00.onClick(view);
                i5 = 1499180491;
                0FI.A0B(i5, A055);
                return;
            case ActionId.ASNYC_FAILED /* 161 */:
                A055 = 0FI.A05(783707699);
                0D2 r075 = (0D2) this.A01;
                CQo.A09(BOn.A0D, 7zR.A0a(), 204, ActionId.TIMEOUT);
                r075.A0p();
                i5 = 247725143;
                0FI.A0B(i5, A055);
                return;
            case ActionId.ASYNC_FAIL /* 162 */:
                A055 = 0FI.A05(1960675559);
                ((8Vq) this.A01).A00.onClick(view);
                i5 = 409150953;
                0FI.A0B(i5, A055);
                return;
            case ActionId.ON_ATTACH_FRAGMENT /* 163 */:
                A055 = 0FI.A05(1573385394);
                ((0D2) this.A01).A0p();
                i5 = -491703794;
                0FI.A0B(i5, A055);
                return;
            case ActionId.VIEW_DID_APPEAR_BEGIN /* 164 */:
                A05 = 0FI.A05(48361843);
                RJS rjs = ((QGW) this.A01).A01;
                ChannelNotificationGroupInviteFragment channelNotificationGroupInviteFragment = rjs.A01;
                C06z[] c06zArr = ChannelNotificationGroupInviteFragment.A08;
                if (AnonymousClass001.A1W(7zU.A0K(channelNotificationGroupInviteFragment), C96j.A06)) {
                    ((C1306Adj) 1Br.A0B(channelNotificationGroupInviteFragment.A06)).A0G(ChannelNotificationGroupInviteFragment.A05(channelNotificationGroupInviteFragment), "public_chats:direct_invite_accept_notification");
                } else if (7zU.A0K(channelNotificationGroupInviteFragment) == C96j.A05) {
                    ((CQo) 1Br.A0B(channelNotificationGroupInviteFragment.A03)).A0K(ChannelNotificationGroupInviteFragment.A05(channelNotificationGroupInviteFragment), "public_chats:direct_invite_accept_notification");
                }
                BDc bDc = (BDc) 1Br.A0B(rjs.A00);
                Long valueOf5 = Long.valueOf(ChannelNotificationGroupInviteFragment.A05(channelNotificationGroupInviteFragment));
                String str14 = channelNotificationGroupInviteFragment.A1M().A0D;
                11T.A0A(str14);
                bDc.A01((MailboxCallback) null, valueOf5, 9CC.A00(str14), "public_chats:direct_invite_accept_notification", 3);
                channelNotificationGroupInviteFragment.A0p();
                i = -1739437463;
                0FI.A0B(i, A05);
                return;
            case ActionId.DISPLAYED /* 165 */:
                A05 = 0FI.A05(-1186384406);
                ShowChannelInPersonalInboxThreadSettingsRowImplementation showChannelInPersonalInboxThreadSettingsRowImplementation = (ShowChannelInPersonalInboxThreadSettingsRowImplementation) this.A01;
                11T.A0D(view);
                ThreadSummary threadSummary3 = showChannelInPersonalInboxThreadSettingsRowImplementation.A02;
                1pI A0010 = 1vD.A00(view);
                if (A0010.BVa()) {
                    8GV r076 = new 8GV();
                    r076.A02 = threadSummary3;
                    A0010.Czz(r076, 0S2.A01, "ShowChannelInPersonalInboxSettingFragment");
                }
                i = 93638108;
                0FI.A0B(i, A05);
                return;
            case ActionId.DISPLAYED_ON_SCREEN /* 166 */:
                A055 = A00(this, -476537214);
                i5 = -469403938;
                0FI.A0B(i5, A055);
                return;
            case ActionId.ASYNC_ACTION_SUCCESS /* 167 */:
                A055 = 0FI.A05(338817740);
                PollsDiscoverabilityNuxFragment pollsDiscoverabilityNuxFragment = (PollsDiscoverabilityNuxFragment) this.A01;
                94S r077 = MigBottomSheetDialogFragment.A01;
                ThreadKey threadKey6 = pollsDiscoverabilityNuxFragment.A00;
                if (threadKey6 == null) {
                    str = "threadKey";
                } else {
                    63D r078 = pollsDiscoverabilityNuxFragment.A01;
                    if (r078 != null) {
                        r078.CVn(COS.A01(threadKey6, new PollingInputParams(BOT.A04, threadKey6, null, null, null, false)));
                        pollsDiscoverabilityNuxFragment.A0p();
                        i5 = -631186132;
                        0FI.A0B(i5, A055);
                        return;
                    }
                    str = "coreBindings";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case ActionId.ASYNC_ACTION_FAIL /* 168 */:
                A055 = 0FI.A05(2071448082);
                ((0D2) this.A01).A0p();
                i5 = 1536045407;
                0FI.A0B(i5, A055);
                return;
            default:
                A055 = 0FI.A05(-1289078151);
                7zL.A1R(this.A01);
                i5 = 475306963;
                0FI.A0B(i5, A055);
                return;
        }
    }
}
