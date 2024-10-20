package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.dialog.MenuDialogFragment;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.dialog.MenuDialogParams;
import com.facebook.messaging.highlightstab.immersivefeatures.plugins.immersivecardviews.localevents.HTImmersiveLocalEventsCardViewImplementation;
import com.facebook.messaging.highlightstab.immersivefeatures.storiestray.plugins.tray.contentview.HTImmersiveStoriesTrayViewImplementation;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.inboxsubtabs.plugins.subtabs.itemviewbinder.InboxSubtabsItemViewBinderImplementation;
import com.facebook.messaging.lockchat.auth.AuthLockChatState;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.reactions.MessageReactionsOverlayFragment;
import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;
import com.facebook.messaging.wellbeing.supportinclusion.plugins.proactivewarning.threadviewbanner.ProactiveWarningThreadViewBanner;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.rp.platform.metaai.messenger.MessengerMetaAiRsysDelegate;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.extensions.gen.CallClientContextConverter;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: AQh.class */
public final class AQh extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQh(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public static AQh A00(Object obj, Object obj2, Object obj3, int i) {
        return new AQh(i, obj, obj2, obj3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v455, types: [com.facebook.messaging.reactions.MessageReactionsOverlayFragment, androidx.fragment.app.Fragment] */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Function2 function2;
        Object obj;
        Object obj2;
        Executor executor;
        AFG aDp;
        boolean z;
        ThreadKey threadKey;
        6BJ A0z;
        C00m c00m;
        String str;
        ThreadKey threadKey2;
        Fse fse;
        McfReference mcfReference;
        ReentrantReadWriteLock.WriteLock writeLock;
        8NF r0;
        switch (this.A00) {
            case 0:
                C8hb c8hb = (C8hb) this.A03;
                long j = C8hb.A0F;
                c8hb.A01.removeObserver((Observer) this.A01);
                if (C1ub.A00().AZk(36321636485251667L)) {
                    ((9AX) 7zO.A0p(this.A02)).A00 = 8Kp.A03;
                }
                return 04S.A00;
            case 1:
                C9qq c9qq = new C9qq(this.A01, 66);
                C8hb c8hb2 = (C8hb) this.A03;
                long j2 = C8hb.A0F;
                c8hb2.A01.observeForever(c9qq);
                return 7zL.A0T(A00(c8hb2, c9qq, this.A02, 0));
            case 2:
                C5wh c5wh = (C5wh) this.A02;
                if (c5wh != C5wh.A09) {
                    ((FbSharedPreferences) this.A01).D63((1HO) this.A03, C9dI.A01(c5wh));
                }
                return 04S.A00;
            case 3:
                C8hb c8hb3 = (C8hb) this.A03;
                long j3 = C8hb.A0F;
                c8hb3.A04.A00();
                ((Handler) ((1Br) this.A02).get()).postDelayed(new AD9((9cG) this.A01), 5000L);
                return 04S.A00;
            case 4:
                ((2R0) this.A01).A0K(C98S.A0Q, 2R7.A0I);
                8hE r02 = (8hE) this.A03;
                r02.A01.A02(Long.parseLong(((85T) this.A02).A06), "pymk_messenger_highlights_tab", 7zO.A0r(r02.A02));
                return 04S.A00;
            case 5:
                C8by c8by = (C8by) this.A03;
                C2k5 c2k5 = (C2k5) this.A01;
                HighlightsAttachmentContent highlightsAttachmentContent = (HighlightsAttachmentContent) this.A02;
                2R0 A00 = c8by.A01.A00(3vP.A00(c2k5));
                HighlightsFeedContent highlightsFeedContent = c8by.A02;
                2R0.A08(C98S.A0W, (3Ec) null, A00, highlightsAttachmentContent, highlightsFeedContent);
                9nH r03 = 9nH.A01;
                Context A002 = 3vP.A00(c2k5);
                Aaj aaj = c8by.A00;
                1BL.A1H(highlightsAttachmentContent, highlightsFeedContent, aaj);
                String str2 = highlightsAttachmentContent.A06;
                if (str2 != null) {
                    if (0CU.A0O(str2)) {
                        str2 = null;
                    }
                    if (str2 != null && 02L.A0C(Integer.valueOf(highlightsFeedContent.A05), new Integer[]{Integer.valueOf(C5by.A07.value)})) {
                        C68t A0R = 7zU.A0R();
                        Uri uri = null;
                        try {
                            uri = C0A2.A03(str2);
                        } catch (SecurityException unused) {
                        }
                        A0R.A0G(A002, uri, C5id.A10);
                        return 04S.A00;
                    }
                }
                String str3 = highlightsFeedContent.A0O;
                if (str3 != null) {
                    if (0CU.A0O(str3)) {
                        str3 = null;
                    }
                    if (str3 != null && C9dH.A00(highlightsFeedContent) != C5by.A0K) {
                        9dJ.A00(A002, C5id.A10, str3);
                        return 04S.A00;
                    }
                }
                9nH.A05(aaj, highlightsFeedContent);
                return 04S.A00;
            case 6:
                C8h7 c8h7 = (C8h7) this.A03;
                2R0 A003 = c8h7.A02.A00(((C2k6) this.A01).AeS().A0D);
                HighlightsFeedContent highlightsFeedContent2 = c8h7.A04;
                C98S c98s = C98S.A0T;
                HighlightsAttachmentContent highlightsAttachmentContent2 = c8h7.A03;
                2R0.A08(c98s, (3Ec) null, A003, highlightsAttachmentContent2, highlightsFeedContent2);
                c8h7.A01.Bjg((8Lu) this.A02, highlightsAttachmentContent2, highlightsFeedContent2);
                return 04S.A00;
            case 7:
                C8i0 c8i0 = (C8i0) this.A03;
                String str4 = c8i0.A09;
                if (str4 != null) {
                    c8i0.A08.momentTypeString = str4;
                }
                C5wh c5wh2 = c8i0.A08;
                return 7zL.A0T(AQl.A01(c5wh2 == C5wh.A05 ? 2aK.A04(new AJK(this.A02, this.A01, c8i0, c5wh2.momentTypeString, (0DR) null, 5), 7zN.A0y()) : null, 1));
            case 8:
                int ordinal = ((C8bz) this.A03).A03.ordinal();
                if (ordinal == 0) {
                    int ordinal2 = ((C95i) this.A02).ordinal();
                    if (ordinal2 == 0 || ordinal2 == 2 || ordinal2 == 3) {
                        C9kv c9kv = (C9kv) ((C2lh) this.A01).A02;
                        return new 0Oa(c9kv.A01, c9kv.A00, c9kv.A00());
                    }
                    if (ordinal2 != 1) {
                        throw 1BK.A1F();
                    }
                } else if (ordinal != 1) {
                    throw 1BK.A1F();
                }
                return new 0Oa((Object) null, (Object) null, (Object) null);
            case 9:
                Uri uri2 = (Uri) this.A03;
                return 7zL.A0T(AQl.A01(uri2 != null ? ((9hM) this.A01).A00(uri2, AVC.A01(this.A02, 43)) : null, 10));
            case 10:
                ThreadKey threadKey3 = (ThreadKey) ((C2lh) this.A02).A02;
                if (threadKey3 == null) {
                    return null;
                }
                6RU r04 = (6RU) this.A01;
                C8hq c8hq = (C8hq) this.A03;
                return new 9Tc(c8hq.A00, c8hq.A01, c8hq.A03, threadKey3, r04);
            case 11:
                9nF.A04(3vP.A00((C2k6) this.A02), ((HTImmersiveLocalEventsCardViewImplementation) this.A03).A03, (String) null);
                return 04S.A00;
            case 12:
                HTImmersiveStoriesTrayViewImplementation hTImmersiveStoriesTrayViewImplementation = (HTImmersiveStoriesTrayViewImplementation) this.A03;
                long j4 = HTImmersiveStoriesTrayViewImplementation.A0A;
                9Tf r05 = hTImmersiveStoriesTrayViewImplementation.A03;
                r05.A03.removeObserver((Observer) this.A02);
                r05.A01.removeObserver((Observer) this.A01);
                return 04S.A00;
            case 13:
                Object obj3 = this.A01;
                C9qq c9qq2 = new C9qq(obj3, 69);
                C9qn c9qn = new C9qn(obj3, this.A02, 12);
                HTImmersiveStoriesTrayViewImplementation hTImmersiveStoriesTrayViewImplementation2 = (HTImmersiveStoriesTrayViewImplementation) this.A03;
                long j5 = HTImmersiveStoriesTrayViewImplementation.A0A;
                9Tf r06 = hTImmersiveStoriesTrayViewImplementation2.A03;
                r06.A03.observeForever(c9qq2);
                r06.A01.observeForever(c9qn);
                return 7zL.A0T(A00(hTImmersiveStoriesTrayViewImplementation2, c9qn, c9qq2, 12));
            case 14:
                return new C9tz(C9iN.A00((C2k5) this.A03).getLifecycle(), (FbUserSession) this.A01, (Function1) this.A02);
            case 15:
                InboxSubtabsItemViewBinderImplementation inboxSubtabsItemViewBinderImplementation = (InboxSubtabsItemViewBinderImplementation) this.A03;
                ((AuthLockChatState) 1Br.A0B(inboxSubtabsItemViewBinderImplementation.A04)).A00.set(true);
                InboxSubtabsItemViewBinderImplementation.A01((2SO) this.A01, inboxSubtabsItemViewBinderImplementation, (1Hb) this.A02);
                return 04S.A00;
            case 16:
                1Br.A0C((1Br) this.A02);
                return new 9Yj((2Ff) 7zO.A0p(this.A03), (ExecutorService) this.A01);
            case 17:
                fse = new Fse((Context) this.A01, (C8c9) this.A03, AQT.A00(this.A02, 49), true);
                fse.BoD();
                return 04S.A00;
            case 18:
                fse = new Fse((Context) this.A01, (C8c9) this.A03, new AQa(this.A02, 0), false);
                fse.BoD();
                return 04S.A00;
            case 19:
                String str5 = ((C8ay) this.A03).A03;
                if (str5 == null) {
                    return null;
                }
                6rU.A0T((C2iw) this.A01, str5);
                return null;
            case 20:
                ReboundViewPager reboundViewPager = (ReboundViewPager) this.A03;
                ReboundViewPager.A09(reboundViewPager, 1);
                Object obj4 = this.A02;
                11T.A0F(obj4, 0);
                reboundViewPager.A0m.remove(obj4);
                if (obj4 instanceof ACA) {
                    reboundViewPager.A0o.remove(obj4);
                }
                reboundViewPager.A0I();
                ((LBI) this.A01).A01();
                return 04S.A00;
            case 21:
                8hQ r07 = (8hQ) this.A03;
                8hQ r08 = 8hQ.$redex_init_class;
                8NF r09 = r07.A01;
                mcfReference = null;
                if ((r09 instanceof 8NF) && (r0 = r09) != null) {
                    C2k5 c2k52 = (C2k5) this.A02;
                    1Br r010 = (1Br) this.A01;
                    AnonymousClass557 A0p = 7zL.A0p();
                    String A09 = 3yH.A09(c2k52, 2131959555);
                    MigColorScheme migColorScheme = r07.A02;
                    C1u7 c1u7 = C1u7.A08;
                    A0p.A03(5OL.A01(A09, migColorScheme.Chx(c1u7)));
                    A0p.A01();
                    A0p.A02(55J.A01(C9ye.A01(r0, 66), r0.A00.A06));
                    A0p.A05 = C58x.A00(7zP.A0S(r010).A02(2MQ.A2o, 2Re.A02), migColorScheme.Chx(C1p7.A07), migColorScheme.Chx(c1u7));
                    A0p.A02(new C9yl(migColorScheme.BEi()));
                    return A0p.A00();
                }
                return mcfReference;
            case 22:
                ((C6js) this.A01).A01((A8Y) this.A02, ((8Vn) this.A03).A01);
                return 04S.A00;
            case 23:
                C8b7 c8b7 = (C8b7) this.A03;
                9KE r011 = c8b7.A01;
                MenuDialogItem menuDialogItem = (MenuDialogItem) this.A01;
                11T.A0D(menuDialogItem);
                Object obj5 = c8b7.A00.A02;
                C9ua c9ua = r011.A00.A09;
                if (c9ua != null) {
                    c9ua.C6c(menuDialogItem, obj5);
                }
                ((5II) this.A02).A0A("composer_tab_selected");
                return 04S.A00;
            case 24:
                C8b7 c8b72 = (C8b7) this.A03;
                9KE r012 = c8b72.A01;
                0CL r013 = (0CL) this.A02;
                MenuDialogParams menuDialogParams = (MenuDialogParams) r013.element;
                C9ua c9ua2 = r012.A00.A09;
                if (c9ua2 != null) {
                    MenuDialogFragment A05 = MenuDialogFragment.A05(menuDialogParams);
                    ?? r014 = (MessageReactionsOverlayFragment) c9ua2.A01;
                    CallerContext callerContext = MessageReactionsOverlayFragment.A0g;
                    ThreadSummary threadSummary = r014.A07;
                    if (threadSummary != null && threadSummary.A0n.A1A()) {
                        C1296Ad8 c1296Ad8 = (C1296Ad8) 1Bn.A0A(83118);
                        ThreadSummary threadSummary2 = r014.A07;
                        ThreadKey threadKey4 = threadSummary2.A0l;
                        String l = threadKey4 != null ? Long.toString(threadKey4.A0r()) : null;
                        String l2 = Long.toString(threadSummary2.A06);
                        String l3 = Long.toString(threadSummary2.A0n.A04);
                        ParticipantInfo participantInfo = r014.A06.A0K;
                        String A004 = participantInfo != null ? participantInfo.A00() : null;
                        FbUserSession fbUserSession = r014.A01;
                        fbUserSession.getClass();
                        c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, l, l2, l3, A004, AbE.A00(76), AbE.A00(578), "render_more_actions", "thread_view", null, BSa.A00(r014.getContext(), fbUserSession, r014.A07)));
                    }
                    1Du it = menuDialogParams.A01.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            MenuDialogItem menuDialogItem2 = (MenuDialogItem) it.next();
                            if (r014.A07 != null && menuDialogItem2.A01 == BNO.A0E.id) {
                                C9Om c9Om = (C9Om) r014.A0a.get();
                                ThreadKey threadKey5 = r014.A07.A0n;
                                Message message = r014.A06;
                                11T.A0F(message, 1);
                                if (threadKey5 != null && threadKey5.A1A()) {
                                    1UG A08 = 1BK.A08(1Br.A02(c9Om.A00), "message_action");
                                    if (A08.isSampled() && (str = message.A1V) != null && (threadKey2 = message.A0V) != null) {
                                        long A0r = threadKey2.A0r();
                                        A08.A7R("action", "create_prompt_menu_item_impression");
                                        A08.A7R("entry_point", AbE.A00(586));
                                        A08.A7R("message_type", ((C00653oY) 1Br.A0B(c9Om.A01)).A01(message));
                                        A08.A7R("mid", str);
                                        A08.A7R("reaction", "NULL");
                                        A08.A7R(4YT.A00(177), "NULL");
                                        A08.A0E("threadid", Long.valueOf(A0r));
                                        A08.A7R("thread_type", "group");
                                        A08.A7R("recipient_id", (String) null);
                                        A08.A6H("groupsize", (Long) null);
                                        A08.A6J("extra", (java.util.Map) null);
                                        A08.BZL();
                                    }
                                }
                            }
                        }
                    }
                    A05.A02 = c9ua2;
                    A05.A0m(r014.getChildFragmentManager(), "more menu");
                }
                ((5II) this.A01).A0A("composer_tab_selected");
                function2 = c8b72.A02;
                obj = r013.element;
                obj2 = AnonymousClass001.A0K();
                function2.invoke(obj, obj2);
                return 04S.A00;
            case 25:
                1Iw r015 = (1Iw) this.A01;
                Object obj6 = this.A03;
                MigColorScheme migColorScheme2 = (MigColorScheme) this.A02;
                Resources A0E = 4YU.A0E(r015);
                String A0t = 4YU.A0t(A0E, 2131964710);
                String string = A0E.getString(2131964709);
                IaR iaR = new IaR(obj6, 11);
                C1u3 c1u3 = C1u3.A1a;
                C1u4 c1u4 = C1u4.SIZE_32;
                C1ut c1ut = C1ut.A0B;
                7zP.A1S(c1u3, c1u4, c1ut);
                migColorScheme2.getClass();
                return C9iQ.A02(iaR, new 5AM(c1u3, c1u4, c1ut, migColorScheme2, (CharSequence) null), migColorScheme2, A0t, null, string);
            case 26:
                1Iw r016 = (1Iw) this.A01;
                Object obj7 = this.A03;
                MigColorScheme migColorScheme3 = (MigColorScheme) this.A02;
                Resources A0E2 = 4YU.A0E(r016);
                return C9iQ.A02(new IaR(obj7, 10), null, migColorScheme3, 4YU.A0t(A0E2, 2131953735), A0E2.getString(2131964711), null);
            case 27:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                C2401Gc3 c2401Gc3 = (C2401Gc3) this.A03;
                viewGroup.removeView(c2401Gc3.A01);
                c2401Gc3.A01 = null;
                c2401Gc3.A04 = null;
                C2401Gc3.A06((View) this.A02);
                HbW hbW = c2401Gc3.A05;
                if (hbW != null) {
                    GQy.A09(hbW.A01, GOm.A00(334), hbW.A00);
                }
                return 04S.A00;
            case 28:
                final C2lh c2lh = (C2lh) this.A02;
                final 8Ze r017 = (8Ze) this.A03;
                final IMK imk = (IMK) this.A01;
                return new HGB() { // from class: X.8ue
                    public void A01() {
                        C2lh.this.A04(83U.A01(imk, r017, 13));
                    }
                };
            case 29:
                FbUserSession fbUserSession2 = (FbUserSession) this.A01;
                Bum bum = (Bum) this.A03;
                AbstractC05414dq A03 = 1VX.A03((Context) 1Br.A0B(bum.A01), fbUserSession2);
                5Dh r018 = (5Dh) this.A02;
                4YU.A1J(r018, 322006035685628L);
                ListenableFuture A06 = A03.A06(r018);
                11T.A0A(A06);
                return 2FP.A02(new ImY(1), A06, 4YV.A11(bum.A00));
            case 30:
                Object obj8 = this.A01;
                Bun bun = (Bun) this.A03;
                1Vd A092 = 7zT.A09(bun.A01);
                C3sb c3sb = (C3sb) this.A02;
                4YU.A1J(c3sb, 322006035685628L);
                return 2FP.A02(new D2q(obj8, bun, 11), A092.A09(c3sb), 4YV.A11(bun.A00));
            case 31:
                FbUserSession fbUserSession3 = (FbUserSession) this.A01;
                Bt3 bt3 = (Bt3) this.A03;
                AbstractC05414dq A032 = 1VX.A03((Context) 1Br.A0B(bt3.A01), fbUserSession3);
                5Dh r019 = (5Dh) this.A02;
                4YU.A1J(r019, 322006035685628L);
                ListenableFuture A062 = A032.A06(r019);
                11T.A0A(A062);
                return 2FP.A02(new Lew(14), A062, 4YV.A11(bt3.A00));
            case 32:
                8vK r020 = ((8cJ) this.A03).A01;
                Iterable iterable = (Iterable) ((C2lh) this.A02).A02;
                final ArrayList A1E = C1A3.A1E(iterable);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    A1E.add(((8KV) it2.next()).A0F);
                }
                Object obj9 = this.A01;
                8vK r021 = r020;
                11T.A0F(obj9, 1);
                ArrayList A1E2 = C1A3.A1E(A1E);
                Iterator it3 = A1E.iterator();
                while (it3.hasNext()) {
                    4YU.A1W(A1E2, 8vK.A00(r021, AnonymousClass001.A0i(it3)));
                }
                final AQj aQj = new AQj(29, r021, A1E, A1E2, obj9);
                final Context context = r021.A02.getContext();
                final FbUserSession A01 = 1Fw.A01(context);
                final C9c5 c9c5 = r021.A0C;
                11T.A0F(A01, 0);
                DR6 A02 = ((C5ic) 1Br.A0B(c9c5.A03)).A02(context);
                A02.A00(2131964313);
                C9oG.A01(A02, c9c5, 58, 2131952729);
                final int i = 2;
                A02.A0D(new DialogInterface.OnClickListener(i, context, A01, c9c5, A1E, aQj) { // from class: X.9nl
                    public final int A00;
                    public final Object A01;
                    public final Object A02;
                    public final Object A03;
                    public final Object A04;
                    public final Object A05;

                    {
                        this.A00 = i;
                        this.A05 = c9c5;
                        this.A02 = A01;
                        this.A04 = A1E;
                        this.A01 = context;
                        this.A03 = aQj;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        switch (this.A00) {
                            case 0:
                                CallToAction callToAction = (CallToAction) this.A01;
                                String str6 = callToAction.A0G;
                                String str7 = callToAction.A0E;
                                if (str6 != null && str7 != null) {
                                    ((CIs) 1Br.A0B(((COy) this.A05).A01)).A01((Uri) this.A04, str6, str7, 0);
                                }
                                COy.A01((FbUserSession) this.A03, (CallToActionContextParams) this.A02, (COy) this.A05, callToAction);
                                return;
                            case 1:
                                ImmutableList.Builder builder = ImmutableList.builder();
                                List list = (List) this.A03;
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    builder.m11011add((Object) ((UserKey) it4.next()).id);
                                }
                                IFc iFc = (IFc) ((C00i) this.A05).get();
                                if (!IFc.A0C(iFc)) {
                                    2R2 A012 = IFc.A01(iFc, "remove_all_guests_selected");
                                    if (A012 != null) {
                                        A012.A0E(AbE.A00(572), "messenger_all_guests_removal_confirmation");
                                        1Hz r022 = new 1Hz();
                                        Iterator it5 = list.iterator();
                                        while (it5.hasNext()) {
                                            r022.A05(((UserKey) it5.next()).id);
                                        }
                                        ImmutableSet A07 = r022.A07();
                                        11T.A0A(A07);
                                        ((0D7) A012).A00.A7M(GOm.A00(361), A07);
                                        A012.BZL();
                                    }
                                    4zI.A03.A05(AbE.A00(4), GOm.A00(ActionId.MQTT_DISCONNECTED), new Object[]{"remove_all_guests_selected", list});
                                }
                                C00i c00i = (C00i) this.A02;
                                ((IRF) c00i.get()).A0d(builder.build());
                                ((CP1) ((C00i) this.A04).get()).A04();
                                ((IRF) c00i.get()).A0h(1, GOm.A00(280));
                                return;
                            default:
                                C9c5 c9c52 = (C9c5) this.A05;
                                FbUserSession fbUserSession4 = (FbUserSession) this.A02;
                                List list2 = (List) this.A04;
                                AQh A005 = AQh.A00(c9c52, this.A01, this.A03, 34);
                                Context context2 = c9c52.A01;
                                11T.A09(context2);
                                9ZC r023 = (9ZC) 1Lm.A05(context2, fbUserSession4, 68588);
                                SharedAlbumArgs sharedAlbumArgs = c9c52.A08;
                                ThreadKey threadKey6 = sharedAlbumArgs.A01;
                                long j6 = sharedAlbumArgs.A00;
                                r023.A00(threadKey6, list2, A005, j6);
                                9nJ A0j = 7zQ.A0j(c9c52.A05);
                                11T.A0F(threadKey6, 0);
                                C98N c98n = C98N.REMOVE_CONTRIBUTIONS_DIALOG;
                                ArrayList A0z2 = 1BL.A0z(list2);
                                Iterator it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    7zV.A19(A0z2, it6);
                                }
                                9nJ.A03(c98n, 98L.A02, threadKey6, A0j, "click", "button_remove", A0z2, (List) null, j6);
                                return;
                        }
                    }
                }, 2131964332);
                7zN.A13(A02);
                9nJ A0j = 7zQ.A0j(c9c5.A05);
                SharedAlbumArgs sharedAlbumArgs = c9c5.A08;
                ThreadKey threadKey6 = sharedAlbumArgs.A01;
                long j6 = sharedAlbumArgs.A00;
                11T.A0F(threadKey6, 0);
                C98N c98n = C98N.REMOVE_CONTRIBUTIONS_DIALOG;
                ArrayList A1E3 = C1A3.A1E(A1E);
                Iterator it4 = A1E.iterator();
                while (it4.hasNext()) {
                    7zV.A19(A1E3, it4);
                }
                9nJ.A03(c98n, 98L.A02, threadKey6, A0j, "impression", "none", A1E3, (List) null, j6);
                return 04S.A00;
            case 33:
                Iterable iterable2 = (Iterable) ((C2lh) this.A02).A02;
                ArrayList A1E4 = C1A3.A1E(iterable2);
                Iterator it5 = iterable2.iterator();
                while (it5.hasNext()) {
                    A1E4.add(((8KV) it5.next()).A0F);
                }
                8vK r022 = ((8cJ) this.A03).A01;
                ArrayList A1E5 = C1A3.A1E(iterable2);
                Iterator it6 = iterable2.iterator();
                while (it6.hasNext()) {
                    A1E5.add(((8KV) it6.next()).A05);
                }
                c00m = (C00m) this.A01;
                8vK r023 = r022;
                11T.A0F(c00m, 1);
                ArrayList A1E6 = C1A3.A1E(A1E4);
                Iterator it7 = A1E4.iterator();
                while (it7.hasNext()) {
                    4YU.A1W(A1E6, 8vK.A00(r023, AnonymousClass001.A0i(it7)));
                }
                9nJ A0j2 = 7zQ.A0j(r023.A05);
                SharedAlbumArgs sharedAlbumArgs2 = r023.A0A;
                ThreadKey threadKey7 = sharedAlbumArgs2.A01;
                ArrayList A1E7 = C1A3.A1E(A1E4);
                Iterator it8 = A1E4.iterator();
                while (it8.hasNext()) {
                    7zV.A19(A1E7, it8);
                }
                long j7 = sharedAlbumArgs2.A00;
                11T.A0F(threadKey7, 0);
                9nJ.A03(C98N.ALBUM_VIEWER_SELECT, 98L.A07, threadKey7, A0j2, "click", "button_save", A1E7, A1E6, j7);
                ((6Ro) 1Br.A0B(r023.A06)).A08(r023.A02.getContext(), CallerContext.A0B("SharedAlbumViewerListenerImpl"), r023.A0E, 0QD.A0S(A1E5));
                c00m.invoke();
                return 04S.A00;
            case 34:
                C9c5 c9c52 = (C9c5) this.A03;
                7zQ.A17((Context) this.A01, c9c52.A02, 7zQ.A0m(c9c52.A04), (6LF) 1Br.A0B(c9c52.A06), 2131964370);
                c00m = (C00m) this.A02;
                c00m.invoke();
                return 04S.A00;
            case 35:
                return new 5S1((06Z) this.A02, (2YQ) this.A03, (MigColorScheme) this.A01);
            case 36:
                if (2oV.A01((2oV) this.A03)) {
                    final Context context2 = (Context) this.A02;
                    return new C93n(new AYu(context2) { // from class: X.3d2
                        public final Context A00;

                        {
                            11T.A0F(context2, 1);
                            this.A00 = context2;
                        }

                        @Override // X.AYu
                        public String AeF(C2m6 c2m6) {
                            Context context3 = this.A00;
                            1Hv.A02(context3, 17098);
                            String str6 = C2qo.A00(context3, null, new C2p2(((2oT) c2m6).A02.toString()), false).A00;
                            str6.getClass();
                            return str6;
                        }
                    });
                }
                final MigColorScheme migColorScheme4 = (MigColorScheme) this.A01;
                return new C2p0(migColorScheme4) { // from class: X.93m
                    public final MigColorScheme A00;

                    {
                        11T.A0F(migColorScheme4, 1);
                        this.A00 = migColorScheme4;
                    }

                    @Override // X.C2p0
                    public /* bridge */ /* synthetic */ 1LI A00(1Iw r302, C2m6 c2m6, Object obj10) {
                        String str6 = ((C2ow) obj10).A00;
                        11T.A0F(r302, 0);
                        2zX r024 = new 2zX(r302, new C2p9());
                        r024.A2Y(new C2p1(ImmutableList.of(), str6));
                        r024.A2Z(C2p6.A00.A05);
                        r024.A2X(this.A00.Chx(C1u7.A0A));
                        r024.A2K("thread_name");
                        return r024.A2W();
                    }
                };
            case 37:
                ((7OX) this.A02).BNt();
                ProactiveWarningThreadViewBanner proactiveWarningThreadViewBanner = (ProactiveWarningThreadViewBanner) this.A03;
                6mO r024 = proactiveWarningThreadViewBanner.A02;
                if (r024 != null) {
                    r024.A01();
                }
                if (7zS.A0m(proactiveWarningThreadViewBanner.A0D).AZk(36315653590623537L)) {
                    executor = proactiveWarningThreadViewBanner.A0H;
                    aDp = new AFG((ThreadSummary) this.A01, proactiveWarningThreadViewBanner);
                    executor.execute(aDp);
                }
                return 04S.A00;
            case 38:
                C8vn c8vn = (C8vn) this.A03;
                AnonymousClass622 anonymousClass622 = (AnonymousClass622) this.A01;
                6Ay r025 = (6Ay) this.A02;
                88A A012 = C8vn.A01(r025, c8vn);
                7ZM A0w = r025.A0w();
                String BEQ = (A0w == null || (A0z = A0w.A0z()) == null) ? null : A0z.BEQ();
                ThreadSummary threadSummary3 = anonymousClass622.A05;
                if (threadSummary3 != null && (threadKey = threadSummary3.A0n) != null && (A012 == 88A.A04 || A012 == 88A.A05)) {
                    9nJ.A07(threadKey, 7zQ.A0j(c8vn.A03), "impression", "photo_pile", BEQ != null ? Long.parseLong(BEQ) : 0L);
                }
                return 04S.A00;
            case 39:
                8Zt r026 = (8Zt) this.A03;
                Object obj10 = this.A02;
                Object obj11 = this.A01;
                boolean A005 = ((1Wa) 1Br.A0B(r026.A01)).A00();
                Biu biu = r026.A02.A03;
                11T.A0A(biu);
                if (A005) {
                    return new IKR(1, obj11, biu, obj10);
                }
                return null;
            case 40:
                8Gr r027 = (8Gr) this.A03;
                int i2 = 8Gr.A0I;
                Function1 function1 = r027.A0C;
                if (function1 == null) {
                    11T.A0L("updatePreferenceFragmentAudienceCallback");
                    throw 0Q8.createAndThrow();
                }
                Object obj12 = this.A01;
                11T.A0D(obj12);
                function1.invoke(obj12);
                executor = (Executor) this.A02;
                aDp = new ADp(r027);
                executor.execute(aDp);
                return 04S.A00;
            case 41:
                C2lh c2lh2 = (C2lh) this.A01;
                c2lh2.A02(4YU.A0k());
                4NU r028 = (4NU) this.A02;
                Timer timer = new Timer();
                1sP.A00();
                r028.A00 = timer;
                if (!((8Zw) this.A03).A00) {
                    ((Timer) 7zL.A10(r028)).scheduleAtFixedRate((TimerTask) new AIF(c2lh2), 1580L, 1580L);
                }
                return 7zL.A0T(AQp.A01(r028, 38));
            case 42:
                ((Handler) this.A03).removeCallbacks((Runnable) this.A02);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A01;
                lottieAnimationView.A04();
                lottieAnimationView.setImageResource(0);
                return 04S.A00;
            case 43:
                if (((C8dt) this.A03).A03.A06) {
                    ((View) this.A01).removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.A02);
                }
                return 04S.A00;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                if (((C8dt) this.A03).A03.A06) {
                    ((DLP) this.A02).A03((A3R) this.A01);
                }
                return 04S.A00;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                FHh fHh = null;
                GJj gJj = null;
                GJj gJj2 = (GJj) this.A02;
                if (gJj2 != null) {
                    fHh = (FHh) this.A01;
                    z = true;
                    gJj = gJj2;
                } else {
                    z = false;
                }
                FragmentActivity A082 = 7zV.A08();
                if (A082 == null) {
                    throw AnonymousClass001.A0N("No active consent flow is opened!");
                }
                Fragment A0b = A082.BDe().A0b("consent_screen");
                if (A0b == null) {
                    throw AnonymousClass001.A0N("No active screen is opened!");
                }
                if (z) {
                    FEK.A00(fHh, DKc.A01, gJj);
                }
                C06c A0D = 7zU.A0D(A082);
                A0D.A0I(A0b);
                A0D.A04();
                return 04S.A00;
            case 46:
                String str6 = (String) FHj.A03.removeLast();
                FHh fHh2 = (FHh) this.A01;
                if (fHh2 != null) {
                    11T.A0F(str6, 0);
                    writeLock = C9mq.A02.writeLock();
                    11T.A0A(writeLock);
                    writeLock.lock();
                    try {
                        9AK r029 = (9AK) C9mq.A00.get(str6);
                        if (r029 != null) {
                            r029.A00 = fHh2;
                        }
                        writeLock.unlock();
                    } catch (Throwable th) {
                        writeLock.unlock();
                        throw th;
                    }
                }
                int ordinal3 = ((ELd) this.A03).ordinal();
                mcfReference = null;
                if (ordinal3 == 0) {
                    C9mq.A01(str6);
                } else if (ordinal3 == 1) {
                    C9mq.A03(str6);
                } else if (ordinal3 == 2) {
                    C9mq.A04(str6);
                } else if (ordinal3 == 3) {
                    C9mq.A02(str6);
                }
                Efe efe = new Efe((EhI) this.A02);
                11T.A0F(str6, 0);
                writeLock = C9mq.A02.writeLock();
                11T.A0A(writeLock);
                writeLock.lock();
                C9mq.A01.put(str6, efe);
                writeLock.unlock();
                Activity A006 = F7B.A00.A00(str6);
                if (A006 != null) {
                    A006.finish();
                    return 04S.A00;
                }
                return mcfReference;
            case ActionId.ON_START_END /* 47 */:
                function2 = (01N) this.A03;
                obj = this.A01;
                obj2 = this.A02;
                function2.invoke(obj, obj2);
                return 04S.A00;
            case ActionId.QUEUED /* 48 */:
                ((C0Fz) this.A03).A02(this.A01, this.A02);
                return 04S.A00;
            default:
                AudioModule AXn = ((IFQ) this.A02).A0F.AXn();
                if (AXn == null) {
                    throw 1BK.A0h();
                }
                mcfReference = CallClientContextConverter.CProxy.convertToMcfReference(new GxI(((MessengerMetaAiRsysDelegate) this.A03).A01, AXn, ((C2618Gj7) this.A01).A00));
                return mcfReference;
        }
    }
}
