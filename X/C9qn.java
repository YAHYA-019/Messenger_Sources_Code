package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.aibot.aidialog.dialogs.AiBotBottomSheetDialogFragment;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.communityprofile.CommunityEditingProfileFragment;
import com.facebook.messaging.communitymessaging.invitelink.CommunityMessagingInviteLinkJoinBottomSheetFragment;
import com.facebook.messaging.communitymessaging.invitelink.joinchainingchats.JoiningChainingChatBottomSheetFragment;
import com.facebook.messaging.communitymessaging.model.Member;
import com.facebook.messaging.communitymessaging.pinnedmessages.ui.FeaturedPinnedMessagesBottomSheet;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.lockchat.auth.AuthLockChatState;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.messaging.memories.viewer.MemoryViewerFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;
import com.facebook.messaging.sharedcontent.plugins.files.tabcontent.SharedFilesTabContentImplementation;
import com.facebook.messaging.sharedcontent.plugins.links.tabcontent.SharedLinksTabContentImplementation;
import com.facebook.messaging.sharedcontent.plugins.media.tabcontent.SharedMediaTabContentImplementation;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9qn, reason: invalid class name */
/* loaded from: 9qn.class */
public final class C9qn implements Observer {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9qn(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(LifecycleOwner lifecycleOwner, LiveData liveData, Object obj, Object obj2, int i) {
        liveData.observe(lifecycleOwner, new C9qn(obj, obj2, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v220, types: [com.facebook.messaging.communitymessaging.pinnedmessages.ui.FeaturedPinnedMessagesBottomSheet, com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v95, types: [androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r308v3, types: [com.facebook.messaging.sharedcontent.plugins.links.tabcontent.SharedLinksTabContentImplementation] */
    /* JADX WARN: Type inference failed for: r308v5, types: [com.facebook.messaging.sharedcontent.plugins.media.tabcontent.SharedMediaTabContentImplementation] */
    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        String str2;
        String str3;
        LiveData liveData;
        MediatorLiveData mediatorLiveData;
        LifecycleOwner lifecycleOwner;
        int i;
        SharedFilesTabContentImplementation sharedFilesTabContentImplementation;
        Window window;
        9Vo r354;
        Integer num;
        String A00;
        Integer num2;
        MemoryViewModel memoryViewModel;
        MemoryViewModel memoryViewModel2;
        switch (this.A00) {
            case 0:
                ThreadSummary threadSummary = 7zU.A0N(obj).A00;
                if (threadSummary != null) {
                    A7J a7j = (A7J) this.A02;
                    1Br r0 = (1Br) this.A01;
                    if (threadSummary.A2X) {
                        C00i c00i = r0.A00;
                        6mG r02 = (6mG) c00i.get();
                        1G9 r03 = 6mG.A01;
                        if (r02.A01(r03)) {
                            return;
                        }
                        Context context = a7j.A00;
                        11T.A0I(context, DKB.A00(1));
                        06Z BDe = ((FragmentActivity) context).BDe();
                        11T.A0A(BDe);
                        new BaseMigBottomSheetDialogFragment().A0m(BDe, "ThreadViewFirstEntry");
                        ((6mG) c00i.get()).A00(r03);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                82Z r04 = (82Z) obj;
                if (r04 != null) {
                    AiBotBottomSheetDialogFragment aiBotBottomSheetDialogFragment = (AiBotBottomSheetDialogFragment) this.A02;
                    View view = (View) this.A01;
                    2qR r05 = BaseMigBottomSheetDialogFragment.A06;
                    Object parent = view.getParent();
                    11T.A0I(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    View findViewById = ((View) parent).findViewById(2131364441);
                    Dialog dialog = ((0D2) aiBotBottomSheetDialogFragment).A01;
                    if (dialog == null || (window = dialog.getWindow()) == null) {
                        return;
                    }
                    Number number = (Number) r04.A01;
                    if (number != null) {
                        C2yk.A00(window, number.intValue());
                        9HK r06 = aiBotBottomSheetDialogFragment.A02;
                        if (r06 != null) {
                            r06.A00.invoke(number);
                        }
                    }
                    Number number2 = (Number) r04.A02;
                    if (number2 != null) {
                        int intValue = number2.intValue();
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        float[] fArr = new float[8];
                        int i2 = 0;
                        do {
                            fArr[i2] = 0.0f;
                            i2++;
                        } while (i2 < 8);
                        7zV.A0k(gradientDrawable, fArr);
                        gradientDrawable.setColor(intValue);
                        findViewById.setBackground(gradientDrawable);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Member member = (Member) obj;
                CommunityEditingProfileFragment communityEditingProfileFragment = (CommunityEditingProfileFragment) this.A02;
                communityEditingProfileFragment.A04 = member;
                C9ad c9ad = communityEditingProfileFragment.A01;
                if (c9ad == null) {
                    str = "profileCache";
                } else {
                    c9ad.A01.A06 = member.A0B;
                    LithoView lithoView = communityEditingProfileFragment.A00;
                    if (lithoView != null) {
                        lithoView.A0y(CommunityEditingProfileFragment.A05((FbUserSession) this.A01, communityEditingProfileFragment));
                        return;
                    }
                    str = "lithoView";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 3:
                ThreadSummaryDataModel A0N = 7zU.A0N(obj);
                CommunityMessagingInviteLinkJoinBottomSheetFragment communityMessagingInviteLinkJoinBottomSheetFragment = (CommunityMessagingInviteLinkJoinBottomSheetFragment) this.A02;
                ThreadSummary threadSummary2 = A0N.A00;
                94S r07 = MigBottomSheetDialogFragment.A01;
                communityMessagingInviteLinkJoinBottomSheetFragment.A05 = threadSummary2;
                liveData = (LiveData) this.A01;
                liveData.removeObserver(this);
                return;
            case 4:
                ThreadSummaryDataModel A0N2 = 7zU.A0N(obj);
                JoiningChainingChatBottomSheetFragment joiningChainingChatBottomSheetFragment = (JoiningChainingChatBottomSheetFragment) this.A02;
                ThreadSummary threadSummary3 = A0N2.A00;
                2qR r08 = BaseMigBottomSheetDialogFragment.A06;
                joiningChainingChatBottomSheetFragment.A04 = threadSummary3;
                liveData = (LiveData) this.A01;
                liveData.removeObserver(this);
                return;
            case 5:
                8Lt r09 = (8Lt) obj;
                ?? r010 = (FeaturedPinnedMessagesBottomSheet) this.A02;
                11T.A0D(r09);
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                94S r011 = MigBottomSheetDialogFragment.A01;
                5zD r012 = (5zD) 7zO.A0l((Fragment) r010, 67704);
                r012.Cn0((ThreadViewColorScheme) 7zO.A0l((Fragment) r010, 68548));
                LithoView A1L = r010.A1L();
                ThreadSummary threadSummary4 = (ThreadSummary) r09.A02;
                2S3 r013 = r010.A04;
                MigColorScheme migColorScheme = r010.A02;
                if (migColorScheme == null) {
                    str = "migColorScheme";
                } else {
                    06Z parentFragmentManager = r010.getParentFragmentManager();
                    06Z childFragmentManager = r010.getChildFragmentManager();
                    11T.A0D(parentFragmentManager);
                    11T.A0D(childFragmentManager);
                    A1L.A0y(new 8hV(parentFragmentManager, childFragmentManager, fbUserSession, r013, r09, r012, threadSummary4, migColorScheme, (C5xv) null, new AR7(r09, r010, 27), true, true));
                    if (threadSummary4 == null || r010.A03) {
                        return;
                    }
                    C1296Ad8 A0W = 7zR.A0W();
                    r010.A00 = A0W;
                    if (A0W != null) {
                        ThreadKey threadKey = threadSummary4.A0l;
                        A0W.A03(new CommunityMessagingLoggerModel(null, null, threadKey != null ? 1BK.A0w(threadKey) : null, String.valueOf(threadSummary4.A06), 1BK.A0w(threadSummary4.A0n), null, null, "featured_messages_bottom_sheet", "featured_messages_bottom_sheet_rendered", "thread_view", null, null));
                        r010.A03 = true;
                        return;
                    }
                    str = "communityMessagingLogger";
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 6:
                11T.A0F(obj, 0);
                if (obj == C1x0.A05) {
                    str2 = "AutoBackupRestoreManager";
                    str3 = "checkFetchBackupLoadingState: in loading status";
                    0fH.A0j(str2, str3);
                    return;
                }
                ((LiveData) this.A02).removeObserver(this);
                7zL.A1T(this.A01, obj);
                return;
            case 7:
                11T.A0F(obj, 0);
                if (obj == C1x0.A05) {
                    str2 = "BlockStoreRestoreManager";
                    str3 = "checkFetchBackupLoadingState: in loading status";
                    0fH.A0j(str2, str3);
                    return;
                }
                ((LiveData) this.A02).removeObserver(this);
                7zL.A1T(this.A01, obj);
                return;
            case 8:
                C1x0 c1x0 = (C1x0) obj;
                11T.A0F(c1x0, 0);
                9nI r014 = (9nI) this.A02;
                if (!((C1wv) 1Br.A0B(r014.A04)).A00) {
                    str2 = "NuxLoadingViewData";
                    str3 = "loaded with cached status, waiting for real updated";
                    0fH.A0j(str2, str3);
                    return;
                }
                int ordinal = c1x0.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        9nI.A04(r014);
                        return;
                    }
                    return;
                } else {
                    if (r014.A00) {
                        return;
                    }
                    r014.A00 = true;
                    r014.A08((LifecycleOwner) this.A01, false);
                    return;
                }
            case 9:
                99P r015 = (99P) obj;
                11T.A0F(r015, 0);
                if (r015.equals(C8sr.A00) || r015.equals(C8ss.A00)) {
                    return;
                }
                if (!(r015 instanceof C8sp)) {
                    if (r015.equals(C8sq.A00)) {
                        9nI.A04((9nI) this.A02);
                        return;
                    }
                    return;
                } else {
                    9nI r016 = (9nI) this.A02;
                    if (!r016.A01) {
                        ((Function1) this.A01).invoke(((C8sp) r015).A00);
                    }
                    r016.A01 = true;
                    return;
                }
            case 10:
                99P r017 = (99P) obj;
                if (r017 instanceof C8sp) {
                    r354 = (9Vo) this.A02;
                    C9up A0Z = 7zO.A0Z(r354.A07);
                    C8sp c8sp = (C8sp) r017;
                    Set<C96p> set = c8sp.A00;
                    boolean z = c8sp.A01;
                    11T.A0F(set, 0);
                    LinkedHashSet A15 = 7zL.A15();
                    if (z) {
                        A15.add("ONE_TIME_CODE");
                    }
                    ArrayList A1E = C1A3.A1E(set);
                    for (C96p c96p : set) {
                        int ordinal2 = c96p.ordinal();
                        if (ordinal2 == 2) {
                            num = 0S2.A0C;
                        } else if (ordinal2 == 1) {
                            num = 0S2.A0N;
                        } else if (ordinal2 == 5) {
                            num = 0S2.A0Y;
                        } else if (ordinal2 == 0) {
                            num = 0S2.A00;
                        } else if (ordinal2 != 10) {
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("Unsupported type '");
                            A0k.append(c96p);
                            0fH.A0k("RestoreFlowLogger", AnonymousClass001.A0d("' logged in the vd set. Please make sure only supported vd passed in", A0k));
                            A00 = "";
                            A1E.add(A00);
                        } else {
                            num = 0S2.A15;
                        }
                        A00 = 9Bo.A00(num);
                        A1E.add(A00);
                    }
                    String[] strArr = (String[]) AnonymousClass041.A04(A1E, A15).toArray(new String[0]);
                    MarkerEditor withFlow = 4YV.A0Z(A0Z.A04).withFlow(A0Z.A02);
                    withFlow.annotate("AVAILABLE_VD_TYPES", strArr);
                    withFlow.markerEditingCompleted();
                    0fH.A0k("RestoreBackupViewData", "finished loading vd status");
                } else if (11T.A0O(r017, C8sr.A00)) {
                    0fH.A0k("RestoreBackupViewData", "start to load vd status");
                    ((C9c4) this.A01).A01();
                    return;
                } else if (11T.A0O(r017, C8ss.A00)) {
                    0fH.A0k("RestoreBackupViewData", "loading vd status");
                    return;
                } else {
                    if (!11T.A0O(r017, C8sq.A00)) {
                        return;
                    }
                    0fH.A0k("RestoreBackupViewData", "failed to load vd status");
                    r354 = (9Vo) this.A02;
                }
                7zP.A0O(r354.A06).A01(r354.A01, true);
                return;
            case 11:
                2aK.A03((Integer) null, (0DE) null, AJj.A01(this.A02, obj, null, 40), 2Zy.A00((LifecycleOwner) this.A01, 2Zo.A00()), 3);
                return;
            case 12:
                if (AnonymousClass001.A1V(obj)) {
                    ((C9tz) this.A02).A00();
                    7zL.A1S(this.A01);
                    return;
                }
                return;
            case 13:
                ThreadSummary threadSummary5 = ((ThreadSummaryDataModel) obj).A00;
                if (threadSummary5 == null || (num2 = threadSummary5.A1a) == null || num2.intValue() != 1) {
                    return;
                }
                3Gs.A00((Activity) this.A01, true);
                ((AuthLockChatState) 1Br.A0B(((A7V) this.A02).A02)).A02.set(1xS.A02);
                return;
            case 14:
                MemoryViewModel memoryViewModel3 = (MemoryViewModel) obj;
                11T.A0F(memoryViewModel3, 0);
                MemoryViewerFragment memoryViewerFragment = (MemoryViewerFragment) this.A02;
                if (memoryViewModel3.equals(memoryViewerFragment.A08)) {
                    return;
                }
                memoryViewerFragment.A08 = memoryViewModel3;
                7zL.A1R(this.A01);
                return;
            case 15:
                List list = (List) obj;
                MemoryViewerFragment memoryViewerFragment2 = (MemoryViewerFragment) this.A02;
                MemoryViewModel memoryViewModel4 = memoryViewerFragment2.A08;
                if (memoryViewModel4 != null) {
                    11T.A0D(list);
                    String str4 = memoryViewModel4.A0F;
                    String str5 = memoryViewModel4.A0G;
                    ThreadKey threadKey2 = memoryViewModel4.A07;
                    String str6 = memoryViewModel4.A0H;
                    long j = memoryViewModel4.A05;
                    String str7 = memoryViewModel4.A0D;
                    String str8 = memoryViewModel4.A0E;
                    Long l = memoryViewModel4.A09;
                    int i3 = memoryViewModel4.A02;
                    int i4 = memoryViewModel4.A01;
                    List list2 = memoryViewModel4.A0N;
                    List list3 = memoryViewModel4.A0O;
                    long j2 = memoryViewModel4.A06;
                    String str9 = memoryViewModel4.A0I;
                    String str10 = memoryViewModel4.A0K;
                    Long l2 = memoryViewModel4.A0A;
                    String str11 = memoryViewModel4.A0J;
                    String str12 = memoryViewModel4.A0L;
                    List list4 = memoryViewModel4.A0P;
                    boolean z2 = memoryViewModel4.A0R;
                    boolean z3 = memoryViewModel4.A0T;
                    String str13 = memoryViewModel4.A0M;
                    long j3 = memoryViewModel4.A04;
                    Long l3 = memoryViewModel4.A0C;
                    Integer num3 = memoryViewModel4.A08;
                    Long l4 = memoryViewModel4.A0B;
                    boolean z4 = memoryViewModel4.A0U;
                    int i5 = memoryViewModel4.A03;
                    11T.A0H(str4, str5);
                    11T.A0F(str7, 5);
                    7zP.A1O(list2, 10, list3);
                    7zP.A1R(str12, 17, list4);
                    11T.A0F(list, 28);
                    memoryViewModel2 = new MemoryViewModel(threadKey2, num3, l, l2, l3, l4, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list2, list3, list4, list, i3, i4, i5, j, j2, j3, z2, z3, z4);
                } else {
                    memoryViewModel2 = null;
                }
                memoryViewerFragment2.A08 = memoryViewModel2;
                7zL.A1R(this.A01);
                return;
            case 16:
                C96y c96y = (C96y) obj;
                MemoryViewerFragment memoryViewerFragment3 = (MemoryViewerFragment) this.A02;
                MontageProgressIndicatorView montageProgressIndicatorView = memoryViewerFragment3.A0A;
                if (montageProgressIndicatorView != null) {
                    montageProgressIndicatorView.A02();
                }
                if (c96y != null) {
                    MemoryViewModel memoryViewModel5 = memoryViewerFragment3.A08;
                    if (memoryViewModel5 != null) {
                        int i6 = c96y.modeId;
                        if (i6 == memoryViewModel5.A03) {
                            return;
                        }
                        String str14 = memoryViewModel5.A0F;
                        String str15 = memoryViewModel5.A0G;
                        ThreadKey threadKey3 = memoryViewModel5.A07;
                        String str16 = memoryViewModel5.A0H;
                        long j4 = memoryViewModel5.A05;
                        String str17 = memoryViewModel5.A0D;
                        String str18 = memoryViewModel5.A0E;
                        Long l5 = memoryViewModel5.A09;
                        int i7 = memoryViewModel5.A02;
                        int i8 = memoryViewModel5.A01;
                        List list5 = memoryViewModel5.A0N;
                        List list6 = memoryViewModel5.A0O;
                        long j5 = memoryViewModel5.A06;
                        String str19 = memoryViewModel5.A0I;
                        String str20 = memoryViewModel5.A0K;
                        Long l6 = memoryViewModel5.A0A;
                        String str21 = memoryViewModel5.A0J;
                        String str22 = memoryViewModel5.A0L;
                        List list7 = memoryViewModel5.A0P;
                        boolean z5 = memoryViewModel5.A0R;
                        boolean z6 = memoryViewModel5.A0T;
                        String str23 = memoryViewModel5.A0M;
                        long j6 = memoryViewModel5.A04;
                        Long l7 = memoryViewModel5.A0C;
                        Integer num4 = memoryViewModel5.A08;
                        Long l8 = memoryViewModel5.A0B;
                        boolean z7 = memoryViewModel5.A0U;
                        List list8 = memoryViewModel5.A0Q;
                        1BK.A1M(str14, str15);
                        11T.A0F(str17, 5);
                        7zP.A1O(list5, 10, list6);
                        7zP.A1R(str22, 17, list7);
                        11T.A0F(list8, 28);
                        memoryViewModel = new MemoryViewModel(threadKey3, num4, l5, l6, l7, l8, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, list5, list6, list7, list8, i7, i8, i6, j4, j5, j6, z5, z6, z7);
                    } else {
                        memoryViewModel = null;
                    }
                    memoryViewerFragment3.A08 = memoryViewModel;
                    memoryViewerFragment3.A0D = false;
                    MemoryViewerFragment.A07((Context) this.A01, memoryViewerFragment3);
                    return;
                }
                return;
            case 17:
                8Lt r018 = (8Lt) obj;
                8GU r019 = (8GU) this.A02;
                11T.A0D(r018);
                FbUserSession fbUserSession2 = (FbUserSession) this.A01;
                5zD r020 = (5zD) 7zO.A0l(r019, 67704);
                ThreadViewColorScheme threadViewColorScheme = (ThreadViewColorScheme) 7zO.A0l(r019, 68548);
                ThreadSummary threadSummary6 = (ThreadSummary) r018.A02;
                boolean z8 = false;
                if (threadSummary6 != null) {
                    9Xv r021 = (9Xv) 7zO.A0l(r019, 68078);
                    Capabilities A02 = ((5Hr) 1Bn.A0A(67674)).A02(r019.requireContext(), fbUserSession2, threadSummary6, (User) null, (2Sh) null);
                    if (ThreadKey.A0a(threadSummary6.A0n) && !4YU.A1Y(A02, 172) && !r021.A00(fbUserSession2, threadSummary6)) {
                        z8 = true;
                    }
                }
                r020.Cn0(threadViewColorScheme);
                9uG r022 = new 9uG(r020);
                LithoView lithoView2 = r019.A01;
                str = "lithoView";
                if (lithoView2 != null) {
                    2S4 r023 = r019.A06;
                    MigColorScheme migColorScheme2 = r019.A04;
                    if (migColorScheme2 == null) {
                        str = "colorScheme";
                    } else {
                        06Z r024 = r019.mFragmentManager;
                        11T.A0A(r024);
                        lithoView2.A0y(new 8hV(r024, 7zN.A08(r019), fbUserSession2, r023, r018, r022, threadSummary6, migColorScheme2, new C9zj(r019, 83), AVH.A00(r018, r019, 47), false, z8));
                        if (r019.A01 != null) {
                            return;
                        }
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            case 18:
                SharedFilesTabContentImplementation sharedFilesTabContentImplementation2 = (SharedFilesTabContentImplementation) this.A02;
                ExL exL = sharedFilesTabContentImplementation2.A0A;
                exL.A02.removeObserver(this);
                mediatorLiveData = exL.A03;
                lifecycleOwner = (LifecycleOwner) this.A01;
                i = 94;
                sharedFilesTabContentImplementation = sharedFilesTabContentImplementation2;
                C9qq.A01(lifecycleOwner, mediatorLiveData, sharedFilesTabContentImplementation, i);
                return;
            case 19:
                ?? r308 = (SharedLinksTabContentImplementation) this.A02;
                mediatorLiveData = r308.A08.A01;
                mediatorLiveData.removeObserver(this);
                lifecycleOwner = (LifecycleOwner) this.A01;
                i = 95;
                sharedFilesTabContentImplementation = r308;
                C9qq.A01(lifecycleOwner, mediatorLiveData, sharedFilesTabContentImplementation, i);
                return;
            case 20:
                ?? r3082 = (SharedMediaTabContentImplementation) this.A02;
                ExL exL2 = r3082.A0D;
                exL2.A02.removeObserver(this);
                mediatorLiveData = exL2.A03;
                lifecycleOwner = (LifecycleOwner) this.A01;
                i = 97;
                sharedFilesTabContentImplementation = r3082;
                C9qq.A01(lifecycleOwner, mediatorLiveData, sharedFilesTabContentImplementation, i);
                return;
            case 21:
                C95r c95r = (C95r) obj;
                if (c95r != null) {
                    int ordinal3 = c95r.ordinal();
                    if (ordinal3 == 0) {
                        ((View) this.A01).setVisibility(8);
                        return;
                    } else {
                        if (ordinal3 == 1 || ordinal3 == 2) {
                            ((View) this.A01).setVisibility(0);
                            8Cj.A01((8Cj) this.A02, 0S2.A04, 0S2.A0C, new 03Y[0]);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                Object obj2 = (AX5) obj;
                11T.A0F(obj2, 0);
                0Je r025 = (0Je) this.A01;
                if (r025.element) {
                    if (obj2 instanceof Ab5) {
                        8Cz r026 = (8Cz) this.A02;
                        AX5 ax5 = (Ab5) obj2;
                        r026.A01 = true;
                        C9kc c9kc = r026.A00;
                        C9by c9by = ((A1n) ax5).A00;
                        c9by.A03.A00(new SDU(c9kc, c9by, true));
                    }
                } else if (obj2 instanceof C90m) {
                    C9by c9by2 = ((A1n) ((AX3) obj2)).A00;
                    c9by2.A03.A00(new S8t(c9by2));
                    r025.element = true;
                    return;
                }
                8Cz r027 = (8Cz) this.A02;
                r027.A02 = false;
                liveData = r027.A07;
                liveData.removeObserver(this);
                return;
        }
    }
}
