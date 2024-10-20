package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.communitymessaging.plugins.communitypreview.stickyfooter.FoldersStickyFooterImplementation;
import com.facebook.messaging.contactstab.plugins.loader.customstatus.ContactsTabCustomStatusLoader;
import com.facebook.messaging.groups.invitelink.join.BaseGroupInviteLinkJoinFragment;
import com.facebook.messaging.profile.bottomsheet.dialog.UnfriendBottomSheetDialogFragment;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* loaded from: AC8.class */
public final class AC8 implements 1K9 {
    public final int A00;
    public final Object A01;

    public AC8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AC8 A00(Object obj, int i) {
        return new AC8(obj, i);
    }

    public static Object A01(AC8 ac8, Object obj) {
        11T.A0F(obj, 0);
        return ac8.A01;
    }

    public static void A02(ListenableFuture listenableFuture, Object obj, int i) {
        1Kd.A0E(new AC8(obj, i), listenableFuture);
    }

    public static void A03(ListenableFuture listenableFuture, Object obj, Executor executor, int i) {
        1Kd.A0F(new AC8(obj, i), listenableFuture, executor);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        1FX r307;
        ImmutableList immutableList;
        0DR r3072;
        0DV A17;
        C1x1 A0O;
        MutableLiveData mutableLiveData;
        Object obj;
        String str9;
        switch (this.A00) {
            case 1:
                r307 = (1FX) this.A01;
                immutableList = null;
                r307.set(immutableList);
                return;
            case 2:
            case 3:
            case 4:
                11T.A0F(th, 0);
                return;
            case 5:
                11T.A0F(th, 0);
                str7 = "ChannelEditingDescriptionAIGenerationUtil";
                str8 = "requestAIGeneratedDescription graphql failed";
                0fH.A0s(str7, str8, th);
                ((Function1) this.A01).invoke(null);
                return;
            case 6:
                11T.A0F(th, 0);
                str7 = "ChannelSummaryGenerationUtil";
                str8 = "requestAIGeneratedSummary graphql failed";
                0fH.A0s(str7, str8, th);
                ((Function1) this.A01).invoke(null);
                return;
            case 7:
            case 27:
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                ((Function1) this.A01).invoke(null);
                return;
            case 8:
                11T.A0F(th, 0);
                0fH.A0u("CommunityMessagingJoinFlowHandler", "Failed to fetch friends and chats information", th);
                r307 = (1FX) this.A01;
                immutableList = null;
                r307.set(immutableList);
                return;
            case 9:
                FoldersStickyFooterImplementation foldersStickyFooterImplementation = (FoldersStickyFooterImplementation) this.A01;
                foldersStickyFooterImplementation.A09 = 0S2.A0C;
                foldersStickyFooterImplementation.A06.A00();
                return;
            case 10:
            case 12:
            case 22:
            case 24:
            case 29:
            case 37:
            case 38:
            case 42:
            case 43:
            case ActionId.UNKNOWN /* 51 */:
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
            case ActionId.QUEUEING_BEGIN /* 54 */:
            case ActionId.QUEUEING_SUCCESS /* 55 */:
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
            case ActionId.PHOTO_CAPTURED /* 59 */:
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
            default:
                return;
            case 11:
                2TV r0 = ((2TR) this.A01).A01;
                if (r0 != null) {
                    r0.C47((Object) null, th);
                    return;
                }
                return;
            case 13:
                ((C9u2) this.A01).A0E.C46();
                return;
            case 14:
                if (((ContactsTabCustomStatusLoader) this.A01).A02.A00.A01 == null) {
                    str9 = "callback";
                    11T.A0L(str9);
                    throw 0Q8.createAndThrow();
                }
                return;
            case 15:
                ((C9Os) A01(this, th)).A00.invoke();
                return;
            case 16:
                11T.A0F(th, 0);
                str = "ThreadSettingSharedContentView";
                str2 = "Failed to get attachment count for fetching attachments from network, exception thrown";
                0fH.A0p(str, str2, th);
                return;
            case 17:
            case 18:
                11T.A0F(th, 0);
                str = "ThreadSettingSharedContentView";
                str2 = "Failed to load media attachments for thread pk, exception thrown";
                0fH.A0p(str, str2, th);
                return;
            case 19:
                11T.A0F(th, 0);
                7zN.A1a((Function1) this.A01, false);
                str = "ThreadSettingSharedContentView";
                str2 = "Failed to check if we need to load more from open, exception thrown";
                0fH.A0p(str, str2, th);
                return;
            case 20:
                11T.A0F(th, 0);
                str = "ThreadSettingSharedContentView";
                str2 = "Failed to check if we need to load more from echo, exception thrown";
                0fH.A0p(str, str2, th);
                return;
            case 21:
                11T.A0F(th, 0);
                0fH.A0p("ThreadSettingSharedContentView", "Failed to check if we need to load more from echo, exception thrown", th);
                7zN.A1a((Function1) this.A01, false);
                return;
            case 23:
                ((C9J3) this.A01).A00.A04 = false;
                return;
            case 25:
                1Iw r02 = (1Iw) this.A01;
                if (r02.A02 != null) {
                    r02.A0G(7zS.A0N((Object) null), "updateState:ContactBottomSheetContextLinesComponent.updateContextLines");
                    return;
                }
                return;
            case 26:
                BaseGroupInviteLinkJoinFragment baseGroupInviteLinkJoinFragment = (BaseGroupInviteLinkJoinFragment) this.A01;
                baseGroupInviteLinkJoinFragment.A1O("error_connection");
                baseGroupInviteLinkJoinFragment.A0p();
                Aa2 aa2 = baseGroupInviteLinkJoinFragment.A01;
                if (aa2 != null) {
                    aa2.D0I(2131957431);
                    return;
                }
                return;
            case 28:
                r3072 = (0DR) A01(this, th);
                A17 = 7zL.A17(th);
                r3072.resumeWith(A17);
                return;
            case 30:
                ((6EM) this.A01).A00 = false;
                return;
            case 31:
                r3072 = (0DR) this.A01;
                A17 = null;
                r3072.resumeWith(A17);
                return;
            case 32:
                str3 = "MemoriesHiddenThreadsFetcher";
                str4 = "Failed to hide thread";
                0fH.A0o(str3, str4);
                return;
            case 33:
                str3 = "MemoriesHiddenThreadsFetcher";
                str4 = "Failed to unhide thread";
                0fH.A0o(str3, str4);
                return;
            case 34:
                11T.A0F(th, 0);
                ((9gU) this.A01).A02 = false;
                str5 = "QRCodeDetectionHelper";
                str6 = "Failed to parse QR code";
                0fH.A0s(str5, str6, th);
                return;
            case 35:
                C9a0 c9a0 = (C9a0) this.A01;
                c9a0.A08.invoke();
                7zP.A0N(c9a0.A03).Ciz(new ADY(c9a0));
                FragmentActivity activity = c9a0.A01.getActivity();
                if (activity != null) {
                    9BA.A00(activity);
                    return;
                }
                return;
            case 36:
                7zP.A0c(((C9cj) A01(this, th)).A03).A04(0Pz.A1B("Location: BusinessInboxFAQDetailsFetcher, Error Message: Fail to fetch FAQ suggested question, ", th));
                return;
            case 39:
                ((A4x) this.A01).A00.A00(false);
                return;
            case 40:
                DFY dfy = ((UnfriendBottomSheetDialogFragment) this.A01).A04;
                if (dfy != null) {
                    dfy.Bzw(1Kn.A01);
                    return;
                }
                return;
            case 41:
                C9hr c9hr = (C9hr) this.A01;
                A0O = 7zP.A0O(c9hr.A06);
                mutableLiveData = c9hr.A05;
                obj = AnonymousClass966.A03;
                A0O.A00(mutableLiveData, obj);
                return;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                C9a7 c9a7 = (C9a7) this.A01;
                A0O = 7zP.A0O(c9a7.A05);
                mutableLiveData = c9a7.A04;
                obj = C95q.A02;
                A0O.A00(mutableLiveData, obj);
                return;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                C9c6 c9c6 = (C9c6) this.A01;
                A0O = 7zP.A0O(c9c6.A03);
                mutableLiveData = c9c6.A02;
                obj = AnonymousClass960.A03;
                A0O.A00(mutableLiveData, obj);
                return;
            case 46:
                7zQ.A16(((1Iw) this.A01).A0D, 2131957317);
                return;
            case ActionId.ON_START_END /* 47 */:
                ((C2lh) A01(this, th)).A02(0Pz.A1B("Something went wrong: ", th));
                return;
            case ActionId.QUEUED /* 48 */:
                11T.A0F(th, 0);
                str5 = "MsysGlobalColorFilterSettingManager";
                str6 = "globalColorFilterSettingManager.fetchGlobalSetting() failed";
                0fH.A0s(str5, str6, th);
                return;
            case ActionId.IN_PROGRESS /* 49 */:
                8Gr.A07((8Gr) this.A01, ImmutableList.builder().build());
                return;
            case 50:
                8vI.A06((8vI) this.A01, 0);
                return;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                0fH.A14(((A4v) A01(this, th)).A07, "Send message failure: %s", 7zO.A1a(th));
                return;
            case ActionId.QUEUEING_FAIL /* 56 */:
                NotesCreationFragment notesCreationFragment = (NotesCreationFragment) this.A01;
                8LZ r03 = notesCreationFragment.A09;
                if (r03 == null) {
                    str9 = "viewDataModel";
                } else {
                    Context context = notesCreationFragment.A02;
                    str9 = "context";
                    if (context != null) {
                        String A0u = 1BK.A0u(context, 2131962214);
                        Context context2 = notesCreationFragment.A02;
                        if (context2 != null) {
                            8LZ.A01(r03, notesCreationFragment, A0u, 1BK.A0u(context2, 2131962212));
                            return;
                        }
                    }
                }
                11T.A0L(str9);
                throw 0Q8.createAndThrow();
            case ActionId.COUNTER /* 61 */:
                C9n2 c9n2 = (C9n2) this.A01;
                7zO.A1X(c9n2.A03);
                c9n2.A03 = null;
                C9n2.A03(c9n2, C0ty.A00, false, true);
                return;
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                C9n2 c9n22 = (C9n2) this.A01;
                7zO.A1X(c9n22.A02);
                c9n22.A02 = null;
                C9n2.A02(c9n22, C0ty.A00, false);
                return;
            case 63:
                C9gQ.A00((C9gQ) this.A01, null, th);
                return;
            case 64:
                r307 = (1FX) this.A01;
                immutableList = ImmutableList.of();
                r307.set(immutableList);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:523:0x0f84, code lost:
    
        if (r304 == null) goto L352;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:467:0x0ce9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:619:0x13af  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x13dd  */
    /* JADX WARN: Type inference failed for: r0v1242, types: [X.8GD, androidx.fragment.app.Fragment, X.8xj] */
    /* JADX WARN: Type inference failed for: r0v1253, types: [X.06c] */
    /* JADX WARN: Type inference failed for: r0v748, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 7932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AC8.onSuccess(java.lang.Object):void");
    }
}
