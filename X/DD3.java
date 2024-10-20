package X;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.channelsummaryaigeneration.fragment.ChannelSummaryBottomSheetFragment;
import com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel.CommunityTemplate;
import com.facebook.messaging.communitymessaging.communitypreview.aboutcommunity.AboutCommunityFragment;
import com.facebook.messaging.communitymessaging.directadd.disclosurebottomsheet.DirectAddDisclosureBottomSheetFragment;
import com.facebook.messaging.communitymessaging.events.creation.EventCreationState;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.model.GenAIChatSuggestion;
import com.facebook.messaging.communitymessaging.plugins.channellist.genaisuggestchatitemviewbinder.GenAISuggestChatItemViewBinderImplementation;
import com.facebook.messaging.location.model.NearbyPlace;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.CanvasOverlayCropViewFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.functions.Function1;

/* loaded from: DD3.class */
public final class DD3 extends C00q implements Function1 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DD3(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v304, types: [X.Alv, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v534, types: [X.Akz, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v626, types: [X.Alo, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r316v2, types: [androidx.fragment.app.Fragment, X.Alt] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GenAIChatSuggestion genAIChatSuggestion;
        2UR r303;
        GenAISuggestChatItemViewBinderImplementation genAISuggestChatItemViewBinderImplementation;
        C00m c00m;
        0D2 r306;
        0D2 baseMigBottomSheetDialogFragment;
        06Z r304;
        String str;
        06Z parentFragmentManager;
        Bundle bundle;
        String str2;
        String str3;
        C1574Alt c1574Alt;
        CNk cNk;
        EventCreationState A00;
        EventCreationState eventCreationState;
        boolean z;
        EventCreationState A002;
        Date time;
        long A003;
        Uri uri;
        Window window;
        AlF alF;
        AlR alR;
        switch (this.A00) {
            case 0:
                r306 = ((QHm) this.A01).A00.A00;
                r306.A0o();
                return 04S.A00;
            case 1:
                alR = ((C0E) this.A01).A00;
                alR.A0C = (Boolean) obj;
                AlR.A0E(alR);
                return 04S.A00;
            case 2:
                boolean A1V = AnonymousClass001.A1V(obj);
                alR = ((C0E) this.A01).A00;
                alR.A0X = A1V;
                AbJ.A0O(alR.A0p).A04(new CommunityMessagingLoggerModel(null, null, String.valueOf(alR.A0E), alR.A0L, null, null, "auto_invite_toggle", "chat_creation_sheet", alR.A0X ? "turn_on_auto_invite" : "turn_off_auto_invite", alR.A0P, null, null));
                AlR.A0E(alR);
                return 04S.A00;
            case 3:
                C1941Ax6 c1941Ax6 = (C1941Ax6) this.A01;
                if (c1941Ax6.A00 != BLA.A04) {
                    c00m = c1941Ax6.A02;
                    c00m.invoke();
                }
                return 04S.A00;
            case 4:
                ((C1967Axw) this.A01).A03.CLR();
                return 04S.A00;
            case 5:
                ((C1979Ay8) this.A01).A00.A00.A03.CGS();
                return 04S.A00;
            case 6:
            case 20:
                ((0D2) this.A01).A0p();
                return 04S.A00;
            case 7:
                DGp dGp = (DGp) obj;
                11T.A0F(dGp, 0);
                1Br.A0C(((Al3) this.A01).A07);
                ImmutableList.Builder builder = ImmutableList.builder();
                ImmutableMap.Builder A0c = 1BK.A0c();
                AeZ aeZ = null;
                while (true) {
                    AeZ aeZ2 = aeZ;
                    int i = 0;
                    for (AeZ aeZ3 : dGp.AgP()) {
                        if (aeZ3 instanceof C1791At0) {
                            if (aeZ2 != null) {
                                A0c.put(aeZ2, Integer.valueOf(i));
                            }
                            aeZ = aeZ3;
                        } else if (aeZ3 instanceof AeZ) {
                            if (aeZ2 == null) {
                                builder.m11011add((Object) aeZ3.A00);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (aeZ2 != null) {
                        A0c.put(aeZ2, Integer.valueOf(i));
                    }
                    ImmutableList A01 = 1Fj.A01(builder);
                    ImmutableMap build = A0c.build();
                    11T.A0A(build);
                    return new 8Lu(A01, build);
                }
            case 8:
                String str4 = (String) obj;
                if (str4 != null && !str4.equals("")) {
                    94S r0 = MigBottomSheetDialogFragment.A01;
                    06Z BDe = ((C6ny) this.A01).A06.BDe();
                    2Ov channelSummaryBottomSheetFragment = new ChannelSummaryBottomSheetFragment();
                    Bundle A05 = 1BK.A05();
                    A05.putString("gen_ai_channel_summary", str4);
                    channelSummaryBottomSheetFragment.setArguments(A05);
                    channelSummaryBottomSheetFragment.A0m(BDe, "ChannelSummaryBottmSheetFragment");
                }
                return 04S.A00;
            case 9:
                r306 = ((8Yv) this.A01).A00.A00;
                r306.A0o();
                return 04S.A00;
            case 10:
                c00m = ((8aU) this.A01).A01;
                c00m.invoke();
                return 04S.A00;
            case 11:
                ((Bkm) this.A01).A00 = AnonymousClass001.A03(obj);
                return 04S.A00;
            case 12:
                ((Number) obj).intValue();
                return Integer.valueOf(((9S7) ((C2i6) this.A01).A01).A01);
            case 13:
                ((8Yx) this.A01).A03.CSR();
                return 04S.A00;
            case 14:
                8eX r02 = (8eX) this.A01;
                String str5 = ((C9Mz) obj).A01;
                11T.A09(str5);
                alF = r02.A01.A00;
                alF.A09 = str5;
                AlF.A03(alF.A00, alF);
                return 04S.A00;
            case 15:
                8eX r03 = (8eX) this.A01;
                String str6 = ((C9Mz) obj).A01;
                11T.A09(str6);
                alF = r03.A01.A00;
                alF.A0A = str6;
                AlF.A03(alF.A00, alF);
                return 04S.A00;
            case 16:
                C8Wp c8Wp = (C8Wp) this.A01;
                ?? r04 = c8Wp.A01;
                CommunityTemplate communityTemplate = c8Wp.A00;
                11T.A0F(communityTemplate, 0);
                AbJ.A0O(r04.A05).A04(new CommunityMessagingLoggerModel(null, CAJ.A00(r04.A03), null, null, null, null, "community_category", "community_creation_community_category", "render_community_creation_sheet_guided", "community_creation_nux_interstitial", null, 1BK.A1D("community_category", communityTemplate.A02.category)));
                BzJ bzJ = AlT.A0D;
                1pI r05 = r04.A00;
                if (r05 != null) {
                    bzJ.A00(r05, communityTemplate, r04.A02, AbI.A10(r04.requireArguments(), "community_creation_template_upgraded_from_group_thread_id"), r04.requireArguments().getString("community_creation_template_entry_point"), null);
                    return 04S.A00;
                }
                str3 = "contentViewManager";
                11T.A0L(str3);
                throw 0Q8.createAndThrow();
            case 17:
                C1561Alf c1561Alf = ((AxW) this.A01).A00;
                String str7 = ((C9Mz) obj).A01;
                11T.A09(str7);
                c1561Alf.A08 = str7;
                return 04S.A00;
            case 18:
                11T.A0F(obj, 0);
                C8T c8t = (C8T) this.A01;
                7zP.A0O(c8t.A02).A00(c8t.A01, obj);
                return 04S.A00;
            case 19:
                baseMigBottomSheetDialogFragment = new AboutCommunityFragment();
                r304 = ((8aW) this.A01).A00;
                str = 7zK.A00(ActionId.MESSENGER_DELTA_REQUEST);
                baseMigBottomSheetDialogFragment.A0m(r304, str);
                return 04S.A00;
            case 21:
                c00m = ((QHV) this.A01).A05;
                c00m.invoke();
                return 04S.A00;
            case 22:
                MediaResource mediaResource = (MediaResource) obj;
                if (mediaResource != null && (uri = mediaResource.A0E) != null) {
                    ?? r06 = (C1546Akz) this.A01;
                    0D2 r315 = (CanvasOverlayCropViewFragment) r06.getParentFragmentManager().A0b("montage crop view");
                    r06.A06 = r315;
                    if (r315 == null) {
                        Integer num = r06.A07 ? 0S2.A00 : 0S2.A01;
                        r315 = new CanvasOverlayCropViewFragment();
                        Bundle A052 = 1BK.A05();
                        A052.putParcelable(TraceFieldType.Uri, uri);
                        r315.setArguments(A052);
                        A052.putInt("aspect", num.intValue());
                        r06.A06 = r315;
                    }
                    Dialog dialog = r315.A01;
                    if (dialog == null || !dialog.isShowing()) {
                        6KV r07 = r06.A01;
                        if (r07 == null) {
                            str3 = "viewOrientationLockHelper";
                            11T.A0L(str3);
                            throw 0Q8.createAndThrow();
                        }
                        r07.A02();
                        FragmentActivity activity = r06.getActivity();
                        if (activity != null && (window = activity.getWindow()) != null) {
                            window.setFlags(5381, 5381);
                        }
                        r315.A0m(r06.getParentFragmentManager(), "montage crop view");
                    }
                    r06.A08 = false;
                    r315.A0A = r06.A0D;
                }
                return 04S.A00;
            case 23:
                boolean A1V2 = AnonymousClass001.A1V(obj);
                2jW r08 = (2jW) this.A01;
                I5j i5j = (I5j) r08.A09.getValue();
                Context requireContext = r08.requireContext();
                if (A1V2) {
                    i5j.A03(requireContext);
                    2jW.A03(r08);
                } else {
                    i5j.A02(requireContext);
                    ((6KV) r08.A0E.getValue()).A05(-1);
                }
                return 04S.A00;
            case 24:
                HCK hck = (HCK) obj;
                11T.A0F(hck, 0);
                2jW r09 = (2jW) this.A01;
                HCK hck2 = r09.A01;
                if (hck2 == null) {
                    r09.A01 = hck;
                    hck2 = hck;
                }
                int i2 = hck.degrees;
                if (i2 % 180 != 0) {
                    i2 -= 180;
                }
                double d = hck2.degrees;
                if (d % 180.0d != 0.0d) {
                    d -= 180.0d;
                }
                ((C66i) r09.A0C.getValue()).A07(i2 - d);
                return 04S.A00;
            case 25:
                File file = (File) obj;
                11T.A0F(file, 0);
                2jW r010 = (2jW) this.A01;
                1pI A0E = AbI.A0E(r010);
                Community community = r010.A02;
                if (community == null) {
                    str3 = "community";
                    11T.A0L(str3);
                    throw 0Q8.createAndThrow();
                }
                1pN c1558Alc = new C1558Alc();
                c1558Alc.setArguments(0PK.A00(AbJ.A1b("community", community, 1BK.A1G("photo_uri", Uri.fromFile(file)), 1BK.A1G("from_gallery", false))));
                A0E.Cfr(c1558Alc, C1558Alc.__redex_internal_original_name);
                return 04S.A00;
            case 26:
                DirectAddDisclosureBottomSheetFragment directAddDisclosureBottomSheetFragment = (DirectAddDisclosureBottomSheetFragment) this.A01;
                directAddDisclosureBottomSheetFragment.A0A = false;
                directAddDisclosureBottomSheetFragment.A02 = (8Lh) obj;
                directAddDisclosureBottomSheetFragment.A1L().A0y(directAddDisclosureBottomSheetFragment.A1K(AbF.A0U(directAddDisclosureBottomSheetFragment.A1L())));
                return 04S.A00;
            case 27:
                QI9 qi9 = (QI9) this.A01;
                06Z r011 = qi9.A00;
                Calendar calendar = qi9.A08;
                if (calendar != null) {
                    Date time2 = calendar.getTime();
                    11T.A0A(time2);
                    Date date = qi9.A0A;
                    Date date2 = qi9.A09;
                    if (!RVN.A00(time2, date, date2)) {
                        Date time3 = calendar.getTime();
                        11T.A0A(time3);
                        if (RVN.A01(time3, date, date2)) {
                            A003 = Rg7.A00(date2);
                            Rg7.A01(r011, qi9.A04, (MGO) null, (CharSequence) null, qi9.A0A, qi9.A09, A003).A0i(r011, qi9.A05);
                            return 04S.A00;
                        }
                    }
                    Date time4 = calendar.getTime();
                    11T.A0A(time4);
                    if (RVN.A00(time4, date, date2)) {
                        time = calendar.getTime();
                        11T.A0A(time);
                        A003 = Rg7.A00(time);
                        Rg7.A01(r011, qi9.A04, (MGO) null, (CharSequence) null, qi9.A0A, qi9.A09, A003).A0i(r011, qi9.A05);
                        return 04S.A00;
                    }
                }
                time = qi9.A07.getTime();
                11T.A0A(time);
                A003 = Rg7.A00(time);
                Rg7.A01(r011, qi9.A04, (MGO) null, (CharSequence) null, qi9.A0A, qi9.A09, A003).A0i(r011, qi9.A05);
                return 04S.A00;
            case 28:
                C1576Alv c1576Alv = ((C1977Ay6) this.A01).A05.A00;
                CNk cNk2 = c1576Alv.A03;
                str3 = "eventCreationUiModel";
                if (cNk2 != null) {
                    if (cNk2.A02().A0B) {
                        cNk = c1576Alv.A03;
                        if (cNk != null) {
                            z = false;
                            A002 = EventCreationState.A00(cNk.A02(), null, null, null, null, null, null, null, null, null, 3071, z);
                            eventCreationState = A002;
                            cNk.A03(eventCreationState);
                        }
                    }
                    return 04S.A00;
                }
                11T.A0L(str3);
                throw 0Q8.createAndThrow();
            case 29:
                ?? r012 = ((C1977Ay6) this.A01).A05.A00;
                CNk cNk3 = r012.A03;
                String str8 = "eventCreationUiModel";
                if (cNk3 != null) {
                    if (!cNk3.A02().A09) {
                        6LF r013 = (6LF) 7zO.A0l((Fragment) r012, 67784);
                        LithoView lithoView = r012.A00;
                        if (lithoView == null) {
                            str8 = "lithoView";
                        } else {
                            r013.A03(lithoView, 7zQ.A0m(r012.A08), 7zN.A0s((Fragment) r012, 2131968208));
                        }
                    }
                    cNk = r012.A03;
                    if (cNk != null) {
                        z = cNk.A02().A09;
                        A002 = EventCreationState.A00(cNk.A02(), null, null, null, null, null, null, null, null, null, 3071, z);
                        eventCreationState = A002;
                        cNk.A03(eventCreationState);
                        return 04S.A00;
                    }
                }
                11T.A0L(str8);
                throw 0Q8.createAndThrow();
            case 30:
                cNk = ((C1977Ay6) this.A01).A05.A00.A03;
                if (cNk != null) {
                    A00 = EventCreationState.A00(cNk.A02(), null, 0S2.A0C, null, null, null, null, null, null, null, 4087, false);
                    eventCreationState = A00;
                    cNk.A03(eventCreationState);
                    return 04S.A00;
                }
                str3 = "eventCreationUiModel";
                11T.A0L(str3);
                throw 0Q8.createAndThrow();
            case 31:
                parentFragmentManager = ((C1977Ay6) this.A01).A05.A00.getParentFragmentManager();
                bundle = Bundle.EMPTY;
                str2 = "request_key_location_click";
                parentFragmentManager.A1R(str2, bundle);
                return 04S.A00;
            case 32:
                C9Mz c9Mz = (C9Mz) obj;
                11T.A0F(c9Mz, 0);
                Bd1 bd1 = ((C1977Ay6) this.A01).A05;
                String str9 = c9Mz.A01;
                11T.A09(str9);
                CNk cNk4 = bd1.A00.A03;
                if (cNk4 != null) {
                    cNk4.A05(str9);
                    return 04S.A00;
                }
                str3 = "eventCreationUiModel";
                11T.A0L(str3);
                throw 0Q8.createAndThrow();
            case 33:
                C5fi.A01(((C1977Ay6) this.A01).A04);
                return 04S.A00;
            case 34:
                11T.A0F(obj, 0);
                ((1Im) this.A01).A00(obj);
                return 04S.A00;
            case 35:
                RF3 rf3 = ((QH5) this.A01).A00;
                String str10 = ((C9Mz) obj).A01;
                11T.A09(str10);
                C1574Alt c1574Alt2 = rf3.A00;
                c1574Alt2.A02 = false;
                c1574Alt2.A01 = str10;
                c1574Alt = c1574Alt2;
                C1574Alt.A03(c1574Alt);
                return 04S.A00;
            case 36:
                ?? r316 = ((QH5) this.A01).A00.A00;
                String str11 = r316.A01;
                String str12 = "inputUrl";
                if (str11 != null) {
                    String A13 = 4YU.A13(str11);
                    if (new C04t("\\s").A07(str11) || !Patterns.WEB_URL.matcher(A13).find()) {
                        r316.A02 = true;
                        c1574Alt = r316;
                        C1574Alt.A03(c1574Alt);
                        return 04S.A00;
                    }
                    CNk cNk5 = r316.A00;
                    if (cNk5 == null) {
                        str12 = "eventsCreationLocationViewData";
                    } else {
                        String str13 = r316.A01;
                        if (str13 != null) {
                            CNk.A01(cNk5, (NearbyPlace) null, str13);
                            parentFragmentManager = r316.getParentFragmentManager();
                            bundle = Bundle.EMPTY;
                            str2 = "request_key_external_link_submitted";
                            parentFragmentManager.A1R(str2, bundle);
                            return 04S.A00;
                        }
                    }
                }
                11T.A0L(str12);
                throw 0Q8.createAndThrow();
            case 37:
                RF0 rf0 = ((QGK) this.A01).A00.A00.A01;
                if (rf0 == null) {
                    str3 = "stateListener";
                    11T.A0L(str3);
                    throw 0Q8.createAndThrow();
                }
                parentFragmentManager = rf0.A00.getParentFragmentManager();
                bundle = Bundle.EMPTY;
                str2 = "request_key_external_url_click";
                parentFragmentManager.A1R(str2, bundle);
                return 04S.A00;
            case 38:
                Brw brw = ((8aX) this.A01).A02;
                94S r014 = MigBottomSheetDialogFragment.A01;
                GenAIChatSuggestion genAIChatSuggestion2 = brw.A00;
                CIp cIp = brw.A02.A01;
                String str14 = brw.A03;
                7zT.A1S(genAIChatSuggestion2, cIp, str14);
                baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
                Bundle A053 = 1BK.A05();
                A053.putParcelable("arg_chat_suggestion", new OpaqueParcelable(genAIChatSuggestion2));
                A053.putString("arg_group_id", str14);
                baseMigBottomSheetDialogFragment.setArguments(A053);
                baseMigBottomSheetDialogFragment.A01 = cIp;
                r304 = brw.A01.A00;
                str = "GenAI_chat_suggestion_report_hide_fragment";
                baseMigBottomSheetDialogFragment.A0m(r304, str);
                return 04S.A00;
            case 39:
                Brw brw2 = ((8aX) this.A01).A02;
                genAIChatSuggestion = brw2.A00;
                if (genAIChatSuggestion != null) {
                    r303 = brw2.A02;
                    genAISuggestChatItemViewBinderImplementation = brw2.A01;
                    94S r015 = MigBottomSheetDialogFragment.A01;
                    9BW.A00(((37S) r303).A01, genAIChatSuggestion.A06, genAIChatSuggestion.A01, genAIChatSuggestion.A00).A0m(genAISuggestChatItemViewBinderImplementation.A00, "GenAI_chat_suggestion_report_hide_fragment");
                }
                return 1BK.A0d();
            case 40:
                ((C8bm) this.A01).A02.A00();
                return 04S.A00;
            case 41:
                C4Z c4z = ((C8bm) this.A01).A02;
                genAIChatSuggestion = c4z.A00;
                if (genAIChatSuggestion != null) {
                    r303 = c4z.A02;
                    genAISuggestChatItemViewBinderImplementation = c4z.A01;
                    94S r0152 = MigBottomSheetDialogFragment.A01;
                    9BW.A00(((37S) r303).A01, genAIChatSuggestion.A06, genAIChatSuggestion.A01, genAIChatSuggestion.A00).A0m(genAISuggestChatItemViewBinderImplementation.A00, "GenAI_chat_suggestion_report_hide_fragment");
                }
                return 1BK.A0d();
            case 42:
                r306 = ((C8ff) this.A01).A00.A01;
                r306.A0o();
                return 04S.A00;
            case 43:
                return ((C5xl) 1Br.A0B(((ROd) this.A01).A04)).ASY((ThreadKey) obj);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                c00m = ((8iG) this.A01).A02.A04;
                c00m.invoke();
                return 04S.A00;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                c00m = ((8iG) this.A01).A02.A06;
                c00m.invoke();
                return 04S.A00;
            case 46:
                c00m = ((8iG) this.A01).A02.A07;
                c00m.invoke();
                return 04S.A00;
            case ActionId.ON_START_END /* 47 */:
            default:
                4NU r016 = (4NU) this.A01;
                1sP.A00();
                if (!AnonymousClass001.A1V(r016.A00)) {
                    Boolean A0K = AnonymousClass001.A0K();
                    1sP.A00();
                    r016.A00 = A0K;
                }
                return 04S.A00;
            case ActionId.QUEUED /* 48 */:
                c00m = ((C8hs) this.A01).A01.A07;
                c00m.invoke();
                return 04S.A00;
        }
    }
}
