package com.facebook.messaging.chatheads.service;

import X.08O;
import X.0FI;
import X.0LG;
import X.0LH;
import X.0LI;
import X.0P6;
import X.0fH;
import X.0nD;
import X.1Bi;
import X.1Bn;
import X.1Bt;
import X.1CO;
import X.1Du;
import X.1Fv;
import X.1GD;
import X.1GU;
import X.1Gw;
import X.1Gz;
import X.1HN;
import X.1Hv;
import X.1I7;
import X.1IG;
import X.1IM;
import X.1Ih;
import X.1Lo;
import X.1Ot;
import X.1P9;
import X.1PA;
import X.1Rv;
import X.1XW;
import X.1lN;
import X.1qC;
import X.20O;
import X.2LK;
import X.2SB;
import X.2TM;
import X.2yD;
import X.4bE;
import X.4bH;
import X.4iH;
import X.4iI;
import X.4vY;
import X.4vZ;
import X.4wA;
import X.5QN;
import X.5SW;
import X.5qC;
import X.6FW;
import X.6Q7;
import X.8HL;
import X.9NL;
import X.9We;
import X.9aG;
import X.AnonymousClass001;
import X.AnonymousClass023;
import X.AnonymousClass472;
import X.C00i;
import X.C00j;
import X.C01s;
import X.C02l;
import X.C04544bB;
import X.C05284dd;
import X.C08134lz;
import X.C0dr;
import X.C0tp;
import X.C10834uq;
import X.C10864ut;
import X.C10894uw;
import X.C11064vf;
import X.C11094vi;
import X.C11314w5;
import X.C1239Abh;
import X.C15h;
import X.C1Gu;
import X.C1hh;
import X.C1og;
import X.C1xj;
import X.C1xm;
import X.C2121Dea;
import X.C2fx;
import X.C2iz;
import X.C2j0;
import X.C2j1;
import X.C2mq;
import X.C2rm;
import X.C4Nz;
import X.CJb;
import X.Cjt;
import X.DMV;
import X.EPg;
import X.FIM;
import X.GQr;
import X.InterfaceC03063wz;
import X.InterfaceC03753yy;
import X.InterfaceC03763yz;
import X.InterfaceC03773z0;
import X.InterfaceC03783z1;
import X.InterfaceC07964le;
import X.JU4;
import X.Qof;
import X.R0h;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.telephony.PhoneStateListener;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ServiceLifecycleDispatcher;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.chatheads.ipc.ChatHeadMessageNotification;
import com.facebook.messaging.chatheads.service.ChatHeadService;
import com.facebook.messaging.chatheads.view.ChatHeadForegroundActivity;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.UserFbidIdentifier;
import com.facebook.user.model.UserKey;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: ChatHeadService.class */
public class ChatHeadService extends C2rm implements LifecycleOwner, 1lN, 2LK, C2iz, 1IM, 1XW, InterfaceC03753yy, InterfaceC03763yz, InterfaceC03773z0, InterfaceC03783z1 {
    public static final ImmutableSet A10 = ImmutableSet.A0A(C1xm.A09);
    public int A00;
    public int A01;
    public 1I7 A02;
    public 1Ot A03;
    public C00i A04;
    public JU4 A05;
    public Set A06;
    public boolean A07;
    public boolean A08;
    public KeyguardManager A09;
    public Configuration A0A;
    public PhoneStateListener A0B;
    public WindowManager A0C;
    public FbUserSession A0D;
    public 1PA A0E;
    public 1PA A0F;
    public 1I7 A0G;
    public C0dr A0I;
    public 1Gz A0J;
    public DMV A0K;
    public 1Gw A0L;
    public C1Gu A0M;
    public C4Nz A0N;
    public C00i A0O;
    public C00i A0P;
    public C00i A0Q;
    public C00i A0R;
    public C00i A0S;
    public C00i A0T;
    public C00i A0U;
    public C10834uq A0V;
    public C10894uw A0W;
    public 1HN A0X;
    public 1Ih A0Y;
    public C15h A0Z;
    public C15h A0a;
    public final 1Bt A0k = (1Bt) 1Bi.A03(66185);
    public final C00i A0n = 1Bi.A00(49363);
    public final C00i A0o = 1Bi.A00(16511);
    public final FbNetworkManager A0b = (FbNetworkManager) 1Bi.A03(16687);
    public final C00i A0q = 1Bi.A00(67722);
    public final C00i A0d = 1Bi.A00(116361);
    public final C00i A0x = 1Bi.A00(6);
    public final C00i A0v = 1Bi.A00(49233);
    public 1qC A0H = (1qC) 1Bi.A03(116294);
    public final 1Rv A0z = (1Rv) 1Bi.A03(67262);
    public final C00i A0t = 1Bi.A00(67920);
    public final C00i A0l = 1Bi.A00(131294);
    public final C00i A0p = 1Bi.A00(17085);
    public final C00i A0y = 1Hv.A00(this, 67720);
    public final C00i A0u = 1Bn.A05(this, 67579);
    public final C00i A0e = 1Bn.A03(83430);
    public final C00i A0g = 1Bi.A00(16432);
    public final C00i A0c = 1Bi.A00(66591);
    public final C00i A0f = 1Bi.A00(66435);
    public final C00i A0m = 1Bi.A00(65849);
    public final C00i A0s = 1Bi.A00(16385);
    public final C00i A0w = 1Bn.A03(67125);
    public final ServiceLifecycleDispatcher A0i = new ServiceLifecycleDispatcher(this);
    public final List A0h = new ArrayList();
    public final InterfaceC07964le A0j = new 0LG(this);
    public final C00i A0r = 1Bn.A05(this, 67958);

    /* JADX WARN: Multi-variable type inference failed */
    private Context A00() {
        return new 6FW(new 6FW(this, 2132608319), C1hh.A00());
    }

    public static NavigationTrigger A01(Intent intent) {
        String A07;
        String stringExtra = intent.getStringExtra(C1xj.A0T);
        NavigationTrigger navigationTrigger = null;
        NavigationTrigger A05 = (stringExtra == null || (A07 = NavigationTrigger.A07(stringExtra)) == null) ? NavigationTrigger.A05(stringExtra) : NavigationTrigger.A01(null, stringExtra, A07);
        if (A05 != null) {
            navigationTrigger = NavigationTrigger.A02(CJb.A01(intent.getExtras(), A05), A05.A08(), A05.A0D(), A05.A0B(), A05.A09(), A05.A0E(), A05.A0F());
        }
        return navigationTrigger;
    }

    private void A02() {
        if (A0v(this)) {
            this.A05.A1A();
        }
    }

    private void A03() {
        if (((C2fx) this.A0t.get()).A00()) {
            A1C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public void A1D() {
        Bundle bundle = new Bundle();
        bundle.putString("log_out_reason", "session_expired");
        ((20O) this.A0R.get()).A02(this, bundle);
        A0l(this);
        stopSelf(this.A01);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A05, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void A1C() {
        InterfaceC03063wz interfaceC03063wz = (InterfaceC03063wz) this.A0T.get();
        0P6 r0 = new 0P6(this);
        Executor executor = (Executor) this.A0U.get();
        FbUserSession fbUserSession = this.A0D;
        fbUserSession.getClass();
        interfaceC03063wz.BYn(fbUserSession, r0, executor);
    }

    private void A06() {
        ((1GU) this.A04.get()).CY3(new Runnable() { // from class: X.0ki
            public static final String __redex_internal_original_name = "ChatHeadService$$ExternalSyntheticLambda4";

            @Override // java.lang.Runnable
            public final void run() {
                ChatHeadService.this.A1A();
            }
        });
    }

    private void A07() {
        JU4 ju4 = this.A05;
        if (ju4 != null) {
            ju4.A1E();
        }
    }

    private void A08() {
        if (Build.VERSION.SDK_INT <= 30 || this.A0z.A0B()) {
            ((C10864ut) this.A0O.get()).A02(0);
            ((1GU) this.A04.get()).CY3(new 0LH(this));
        }
    }

    private void A09() {
        0fH.A0j("ChatHeadService", "startChatHeadForegroundActivityIfExpanded");
        JU4 ju4 = this.A05;
        if (ju4 == null || !ju4.A1b()) {
            return;
        }
        A0n(this);
    }

    private void A0A(Intent intent) {
        ThreadKey A00 = C10894uw.A00(intent);
        if (A00 == null) {
            ((C01s) this.A0o.get()).D0v("ChatHeadService", "Failed to get thread key in handleActionClearUnreadThread");
        } else {
            A0p(A00, intent.getStringExtra(C1xj.A0T));
        }
    }

    private void A0B(Intent intent) {
        String stringExtra = intent.getStringExtra(C1xj.A0T);
        if (stringExtra == null) {
            stringExtra = "from_intent_unknown";
        }
        JU4 ju4 = this.A05;
        if (ju4 == null || !ju4.A1Z()) {
            return;
        }
        this.A05.A1W(stringExtra);
    }

    private void A0C(Intent intent) {
        ThreadKey A00 = C10894uw.A00(intent);
        if (A00 == null) {
            ((C01s) this.A0o.get()).D0v("ChatHeadService", "Failed to get thread key in handleActionRemoveChatHead");
            return;
        }
        0fH.A0g(A00, "ChatHeadService", "handleActionHideChatHead: %s");
        String stringExtra = intent.getStringExtra(C1xj.A0T);
        JU4 ju4 = this.A05;
        if (ju4 != null) {
            ju4.A1V(A00, stringExtra);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0D(Intent intent) {
        JU4 ju4 = this.A05;
        if (ju4 == null || !ju4.A1b()) {
            return;
        }
        if (!intent.getBooleanExtra(C1xj.A0J, false)) {
            R0h.A00(this, intent.getStringExtra(C1xj.A0K));
        }
        A0l(this);
        A0o(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public void A1F(Intent intent) {
        if (!intent.hasExtra("EXTRA_BADGE_COUNT") || this.A05 == null) {
            return;
        }
        this.A05.A1M(intent.getIntExtra("EXTRA_BADGE_COUNT", 0));
    }

    private void A0F(Intent intent) {
        if (this.A05 != null) {
            String str = C1xj.A0V;
            if (intent.hasExtra(str)) {
                this.A05.A1Y(intent.getBooleanExtra(str, false));
            }
        }
    }

    private void A0G(Intent intent) {
        if (intent.hasExtra("extra_monotonic_start_timestamp_ms")) {
            long longExtra = intent.getLongExtra("extra_monotonic_start_timestamp_ms", -1);
            if (longExtra >= 0) {
                long now = this.A0I.now();
                0fH.A0a(Long.valueOf(longExtra), Long.valueOf(now), Long.valueOf(now - longExtra), "ChatHeadService", "In handleActionOpenChatHead, fb4aClickTime=%d, nowTime=%d, diff=%d");
                ((2SB) this.A0a.get()).A05(intent.getStringExtra(C1xj.A0M), longExtra - now);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public void A1E(Intent intent) {
        if (C1og.A00(intent.getIntExtra("event", -1)) == C1og.CHANNEL_DISCONNECTED) {
            A09();
        }
    }

    private void A0I(Intent intent, FbUserSession fbUserSession) {
        if (intent.getBooleanExtra(C1xj.A0N, false) && this.A09.inKeyguardRestrictedInputMode()) {
            0fH.A0n("ChatHeadService", "Received ACTION_OPEN_CHAT_HEAD and expected keyguard to be unlocked but it wasn't. Dropping intent.");
            return;
        }
        A0G(intent);
        String str = C1xj.A0M;
        if (!intent.hasExtra(str)) {
            A0O(intent, fbUserSession, this, C10894uw.A00(intent));
            return;
        }
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra == null) {
            ((C01s) this.A0o.get()).D0v("ChatHeadService", "Fbid is null in handleActionOpenChatHead");
        } else if (!((2yD) this.A0s.get()).AZr(1GD.A00().A02(), 36317259908983889L)) {
            A0R(intent, fbUserSession, stringExtra);
        } else {
            0fH.A0j("ChatHeadService", "fb profile entrypoint is not enabled");
            A0P(intent, fbUserSession, this, stringExtra);
        }
    }

    private void A0J(Intent intent, FbUserSession fbUserSession) {
        ThreadKey A00 = C10894uw.A00(intent);
        if (A00 == null) {
            ((C01s) this.A0o.get()).D0v("ChatHeadService", "Failed to get thread key in handleActionOpenChatHeadForThreadSettings");
            return;
        }
        0fH.A0g(A00, "ChatHeadService", "handleActionOpenChatHeadForThreadSettings: %s");
        C1239Abh A002 = ThreadViewMessagesInitParams.A00();
        A002.A01(Integer.valueOf(intent.getIntExtra("start_thread_settings_fragment", 0)));
        ThreadViewMessagesInitParams A003 = A002.A00();
        NavigationTrigger A01 = A01(intent);
        boolean booleanExtra = intent.getBooleanExtra("extra_msplit_not_consented", false);
        A0h(fbUserSession, A00, A01, (MessageDeepLinkInfo) intent.getParcelableExtra("extra_thread_view_message_to_show"), A003, 5SW.A0L, booleanExtra);
    }

    private void A0K(Intent intent, FbUserSession fbUserSession) {
        if (intent.getBooleanExtra(C1xj.A0N, false) && this.A09.inKeyguardRestrictedInputMode()) {
            0fH.A0n("ChatHeadService", "Received ACTION_POPUP_CHAT_HEAD and expected keyguard to be unlocked but it wasn't. Dropping intent.");
            return;
        }
        ThreadKey A00 = C10894uw.A00(intent);
        if (A00 == null) {
            ((C01s) this.A0o.get()).D0v("ChatHeadService", "Failed to get thread key in handleActionPopupChatHead");
            return;
        }
        0fH.A0g(A00, "ChatHeadService", "handleActionPopupChatHead: %s");
        String stringExtra = intent.getStringExtra(C1xj.A0T);
        A0r(stringExtra);
        A0i(fbUserSession, A00, stringExtra);
    }

    private void A0L(Intent intent, FbUserSession fbUserSession) {
        String str = C1xj.A0R;
        if (intent.hasExtra(str)) {
            A0f(fbUserSession, (ChatHeadMessageNotification) intent.getParcelableExtra(str));
        }
    }

    private void A0M(Intent intent, FbUserSession fbUserSession, Qof qof) {
        if (A0t()) {
            return;
        }
        A0T(fbUserSession);
        A0a(fbUserSession);
        String stringExtra = intent.getStringExtra(C1xj.A0T);
        JU4 ju4 = this.A05;
        if (ju4 != null) {
            ju4.A1P(qof, stringExtra);
        }
    }

    public static void A0N(Intent intent, FbUserSession fbUserSession, ChatHeadService chatHeadService, int i) {
        Qof qof;
        chatHeadService.A01 = Math.max(chatHeadService.A01, i);
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        0fH.A0i(intent, "ChatHeadService", "onStartCommand: %s");
        ((C11064vf) chatHeadService.A0n.get()).A01(action, intent.getStringExtra(C1xj.A0T));
        ((C04544bB) chatHeadService.A0l.get()).A02(4bH.A01, action);
        if (action.equals(C1xj.A05)) {
            chatHeadService.A0L(intent, fbUserSession);
            return;
        }
        if (action.equals(C1xj.A0B)) {
            chatHeadService.A0B(intent);
            return;
        }
        if (action.equals(C1xj.A06) || action.equals(C1xj.A07)) {
            chatHeadService.A0I(intent, fbUserSession);
            return;
        }
        if (action.equals(C1xj.A08)) {
            chatHeadService.A0J(intent, fbUserSession);
            return;
        }
        if (action.equals(C1xj.A0D)) {
            chatHeadService.A0C(intent);
            return;
        }
        if (action.equals(C1xj.A02)) {
            chatHeadService.A0A(intent);
            return;
        }
        if (action.equals(C1xj.A01)) {
            chatHeadService.A02();
            return;
        }
        if (action.equals(C1xj.A0F)) {
            chatHeadService.A0a(fbUserSession);
            return;
        }
        if (action.equals(C1xj.A04)) {
            chatHeadService.A0Z(fbUserSession);
            return;
        }
        if (action.equals(C1xj.A03)) {
            JU4 ju4 = chatHeadService.A05;
            if (ju4 != null) {
                ju4.A17("REASON_MANUAL_CALL");
                return;
            }
            return;
        }
        if (action.equals(C1xj.A00)) {
            chatHeadService.A0D(intent);
            return;
        }
        if (action.equals(C1xj.A09) || action.equals(C1xj.A0I)) {
            qof = Qof.A04;
        } else {
            if (action.equals(C1xj.A0A)) {
                chatHeadService.A0U(fbUserSession);
                return;
            }
            if (action.equals(C1xj.A0H)) {
                qof = Qof.A03;
            } else {
                if (!action.equals(C1xj.A0G)) {
                    if (action.equals(5QN.A00)) {
                        chatHeadService.A07();
                        return;
                    }
                    if (action.equals(C1xj.A0C)) {
                        chatHeadService.A0K(intent, fbUserSession);
                        return;
                    }
                    if (action.equals(C1xj.A0E)) {
                        chatHeadService.A0F(intent);
                        return;
                    } else if (action.equals(C1xj.A0X)) {
                        chatHeadService.A0s(true);
                        return;
                    } else {
                        if (action.equals(C1xj.A0Y)) {
                            chatHeadService.A0s(false);
                            return;
                        }
                        return;
                    }
                }
                qof = Qof.A02;
            }
        }
        chatHeadService.A0M(intent, fbUserSession, qof);
    }

    public static void A0O(Intent intent, FbUserSession fbUserSession, ChatHeadService chatHeadService, ThreadKey threadKey) {
        if (threadKey == null) {
            ((C01s) chatHeadService.A0o.get()).D0v("ChatHeadService", "Failed to get thread key in handleActionOpenChatHead");
            return;
        }
        String stringExtra = intent.getStringExtra(C1xj.A0T);
        if (stringExtra == null) {
            stringExtra = "";
        }
        chatHeadService.A0r(stringExtra);
        if (intent.getAction() != null && intent.getAction().equals(C1xj.A07)) {
            String str = C1xj.A0U;
            if (intent.hasExtra(str)) {
                Intent intent2 = (Intent) intent.getParcelableExtra(str);
                if (intent2 != null) {
                    chatHeadService.A0Q(intent2, fbUserSession, threadKey, stringExtra);
                    return;
                }
                return;
            }
        }
        5SW r312 = null;
        if (intent.hasExtra("extra_thread_view_source")) {
            r312 = (5SW) intent.getSerializableExtra("extra_thread_view_source");
        }
        MessageDeepLinkInfo messageDeepLinkInfo = (MessageDeepLinkInfo) intent.getParcelableExtra("extra_thread_view_message_to_show");
        ThreadViewMessagesInitParams threadViewMessagesInitParams = (ThreadViewMessagesInitParams) intent.getParcelableExtra("thread_view_messages_init_params");
        boolean booleanExtra = intent.getBooleanExtra("extra_msplit_not_consented", false);
        NavigationTrigger A01 = A01(intent);
        switch (stringExtra.hashCode()) {
            case 1045523402:
                if (stringExtra.equals("M4 group-centric Omnipicker")) {
                    6Q7 r0 = (6Q7) chatHeadService.A0r.get();
                    FbUserSession fbUserSession2 = chatHeadService.A0D;
                    fbUserSession2.getClass();
                    r0.A05(fbUserSession2, threadKey);
                    break;
                }
                break;
            case 1123504639:
                if (stringExtra.equals("group_create_redirect")) {
                    6Q7 r02 = (6Q7) chatHeadService.A0r.get();
                    FbUserSession fbUserSession3 = chatHeadService.A0D;
                    fbUserSession3.getClass();
                    r02.A04(fbUserSession3, threadKey);
                    break;
                }
                break;
            case 1217851434:
                if (stringExtra.equals("context_pop_out_selected")) {
                    6Q7 r03 = (6Q7) chatHeadService.A0r.get();
                    FbUserSession fbUserSession4 = chatHeadService.A0D;
                    fbUserSession4.getClass();
                    r03.A03(fbUserSession4, threadKey);
                    break;
                }
                break;
        }
        chatHeadService.A0h(fbUserSession, threadKey, A01, messageDeepLinkInfo, threadViewMessagesInitParams, r312, booleanExtra);
    }

    public static void A0P(Intent intent, FbUserSession fbUserSession, ChatHeadService chatHeadService, String str) {
        ThreadKey A03 = ((4iI) chatHeadService.A0y.get()).A03(new UserFbidIdentifier(str));
        0fH.A0g(A03 == null ? "" : A03, "ChatHeadService", "handleActionChatHead, navigateToOpenThread: %s");
        A0O(intent, fbUserSession, chatHeadService, A03);
    }

    private void A0Q(Intent intent, FbUserSession fbUserSession, ThreadKey threadKey, String str) {
        A0T(fbUserSession);
        A0d(fbUserSession, 0);
        this.A05.A1O(intent, threadKey, str);
    }

    private void A0R(Intent intent, FbUserSession fbUserSession, String str) {
        this.A08 = true;
        ((AnonymousClass472) this.A0u.get()).A00(UserKey.A01(str)).A01(new Cjt(intent, fbUserSession, this, str));
    }

    private void A0S(FbUserSession fbUserSession) {
        if (this.A03 == null) {
            8HL r0 = new 8HL(fbUserSession, this);
            this.A03 = r0;
            this.A0k.A03(r0);
        }
    }

    private void A0T(FbUserSession fbUserSession) {
        if (this.A05 == null) {
            A0Y(fbUserSession);
        }
    }

    private void A0U(FbUserSession fbUserSession) {
        if (A0t()) {
            return;
        }
        A0T(fbUserSession);
        A0a(fbUserSession);
        JU4 ju4 = this.A05;
        if (ju4 != null) {
            ju4.A1J();
        }
    }

    private void A0V(FbUserSession fbUserSession) {
        ((C11064vf) this.A0n.get()).A01(C1xj.A04, "screen-locked");
        A0e(fbUserSession, 1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public void A1M(FbUserSession fbUserSession) {
        A0d(fbUserSession, 1);
        A0o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0X(FbUserSession fbUserSession) {
        boolean z = false;
        if (this.A0J == null) {
            z = true;
        }
        Preconditions.checkState(z);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        1Gz r0 = new 1Gz(new C0tp(fbUserSession, this, 2), new C0tp(fbUserSession, this, 3), "android.intent.action.CLOSE_SYSTEM_DIALOGS", "android.intent.action.USER_PRESENT");
        this.A0J = r0;
        AnonymousClass023.A03(r0, this, intentFilter, true);
        ((C08134lz) this.A0v.get()).A01(this.A0j);
    }

    private void A0Y(FbUserSession fbUserSession) {
        JU4 ju4;
        boolean z = false;
        if (this.A05 == null) {
            z = true;
        }
        Preconditions.checkState(z);
        this.A05 = this.A0N.A00(A00(), fbUserSession);
        ((C11094vi) this.A0d.get()).A00("COLLAPSED");
        JU4 ju42 = this.A05;
        ju42.A1R(new 9aG(this));
        ju42.A1B();
        this.A0V.A00();
        JU4 ju43 = this.A05;
        if (ju43 != null) {
            ju43.A1F();
            if (this.A09.inKeyguardRestrictedInputMode()) {
                A0V(fbUserSession);
            }
            if (this.A00 != 0 && (ju4 = this.A05) != null) {
                ju4.A1K(1);
            }
            A03();
        }
    }

    private void A0Z(FbUserSession fbUserSession) {
        A0e(fbUserSession, 2, true);
    }

    private void A0a(FbUserSession fbUserSession) {
        A0d(fbUserSession, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A0b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void A1L(FbUserSession fbUserSession) {
        if (A0u()) {
            return;
        }
        A0c(fbUserSession);
        try {
            C2121Dea c2121Dea = new C2121Dea(this);
            c2121Dea.A06(2131952976);
            c2121Dea.A05(2131952974);
            c2121Dea.A0E(new DialogInterface.OnClickListener() { // from class: X.0kf
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatHeadService.this.A1D();
                }
            }, 2131952975);
            c2121Dea.A0C(false);
            this.A0K = c2121Dea.A04();
        } catch (WindowManager.BadTokenException | SecurityException e) {
            ((C01s) this.A0o.get()).softReport("ChatHeadService", "failed to show SESSION_EXPIRED dialog", e);
        }
    }

    public static void A0c(FbUserSession fbUserSession) {
        ((FIM) 1Bn.A0A(100129)).A06(EPg.A0l, fbUserSession.Aud());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0d(FbUserSession fbUserSession, int i) {
        int i2 = (i ^ (-1)) & this.A00;
        this.A00 = i2;
        if (i2 == 0) {
            JU4 ju4 = this.A05;
            if (ju4 == null) {
                ((C11314w5) 1Lo.A03(getApplicationContext(), fbUserSession, 49366)).A05(4wA.A00, false);
            } else {
                ju4.A1L(1);
                this.A0w.get();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0e(FbUserSession fbUserSession, int i, boolean z) {
        if (this.A00 == 0) {
            JU4 ju4 = this.A05;
            if (ju4 == null) {
                ((C11314w5) 1Lo.A03(getApplicationContext(), fbUserSession, 49366)).A05(4wA.A00, true);
            } else if (z) {
                ju4.A19();
            } else {
                ju4.A1K(1);
            }
        }
        this.A00 = i | this.A00;
        if (A0t()) {
            A0l(this);
            stopSelf(this.A01);
        }
    }

    private void A0f(FbUserSession fbUserSession, ChatHeadMessageNotification chatHeadMessageNotification) {
        chatHeadMessageNotification.getClass();
        Message A00 = chatHeadMessageNotification.A00();
        A00.getClass();
        ThreadKey A09 = A00.A09();
        if (A00.A05() != null) {
            ((5qC) this.A0m.get()).A00(A00);
            A0T(fbUserSession);
            JU4 ju4 = this.A05;
            if (ju4 != null) {
                if (A09 != null && !ju4.A1c(A09)) {
                    6Q7 r0 = (6Q7) this.A0r.get();
                    FbUserSession fbUserSession2 = this.A0D;
                    fbUserSession2.getClass();
                    r0.A06(fbUserSession2, A09);
                }
                this.A05.A1Q(chatHeadMessageNotification);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0g(FbUserSession fbUserSession, final ChatHeadService chatHeadService) {
        chatHeadService.A0X = new 0LI(chatHeadService);
        chatHeadService.A0L = new GQr(chatHeadService);
        ((FbSharedPreferences) chatHeadService.A0Q.get()).CcW(chatHeadService.A0X, A10);
        final int i = 1;
        chatHeadService.A0M.A01(chatHeadService.A0L, 67);
        1P9 Bgy = chatHeadService.A02.Bgy();
        final int i2 = 0;
        Bgy.A05(new C02l(chatHeadService, i2) { // from class: X.0tr
            public final int A00;
            public final Object A01;

            {
                this.A00 = i2;
                this.A01 = chatHeadService;
            }

            @Override // X.C02l
            public final void CFb(Context context, Intent intent, C01q c01q) {
                int i3 = this.A00;
                ChatHeadService chatHeadService2 = (ChatHeadService) this.A01;
                switch (i3) {
                    case 0:
                        chatHeadService2.A18();
                        return;
                    case 1:
                        chatHeadService2.A1F(intent);
                        return;
                    case 2:
                        chatHeadService2.A1G(intent);
                        return;
                    case 3:
                        chatHeadService2.A1E(intent);
                        return;
                    default:
                        chatHeadService2.A16();
                        return;
                }
            }
        }, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE");
        Bgy.A05(new C02l(chatHeadService, i) { // from class: X.0tr
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = chatHeadService;
            }

            @Override // X.C02l
            public final void CFb(Context context, Intent intent, C01q c01q) {
                int i3 = this.A00;
                ChatHeadService chatHeadService2 = (ChatHeadService) this.A01;
                switch (i3) {
                    case 0:
                        chatHeadService2.A18();
                        return;
                    case 1:
                        chatHeadService2.A1F(intent);
                        return;
                    case 2:
                        chatHeadService2.A1G(intent);
                        return;
                    case 3:
                        chatHeadService2.A1E(intent);
                        return;
                    default:
                        chatHeadService2.A16();
                        return;
                }
            }
        }, "com.facebook.orca.ACTION_INBOX_BADGE_COUNT_UPDATED");
        final int i3 = 2;
        Bgy.A05(new C02l(chatHeadService, i3) { // from class: X.0tr
            public final int A00;
            public final Object A01;

            {
                this.A00 = i3;
                this.A01 = chatHeadService;
            }

            @Override // X.C02l
            public final void CFb(Context context, Intent intent, C01q c01q) {
                int i32 = this.A00;
                ChatHeadService chatHeadService2 = (ChatHeadService) this.A01;
                switch (i32) {
                    case 0:
                        chatHeadService2.A18();
                        return;
                    case 1:
                        chatHeadService2.A1F(intent);
                        return;
                    case 2:
                        chatHeadService2.A1G(intent);
                        return;
                    case 3:
                        chatHeadService2.A1E(intent);
                        return;
                    default:
                        chatHeadService2.A16();
                        return;
                }
            }
        }, "com.facebook.orca.ACTION_MULTIPLE_THREADS_READ_FOR_UI");
        final int i4 = 3;
        Bgy.A05(new C02l(chatHeadService, i4) { // from class: X.0tr
            public final int A00;
            public final Object A01;

            {
                this.A00 = i4;
                this.A01 = chatHeadService;
            }

            @Override // X.C02l
            public final void CFb(Context context, Intent intent, C01q c01q) {
                int i32 = this.A00;
                ChatHeadService chatHeadService2 = (ChatHeadService) this.A01;
                switch (i32) {
                    case 0:
                        chatHeadService2.A18();
                        return;
                    case 1:
                        chatHeadService2.A1F(intent);
                        return;
                    case 2:
                        chatHeadService2.A1G(intent);
                        return;
                    case 3:
                        chatHeadService2.A1E(intent);
                        return;
                    default:
                        chatHeadService2.A16();
                        return;
                }
            }
        }, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        final int i5 = 4;
        Bgy.A05(new C02l(chatHeadService, i5) { // from class: X.0tr
            public final int A00;
            public final Object A01;

            {
                this.A00 = i5;
                this.A01 = chatHeadService;
            }

            @Override // X.C02l
            public final void CFb(Context context, Intent intent, C01q c01q) {
                int i32 = this.A00;
                ChatHeadService chatHeadService2 = (ChatHeadService) this.A01;
                switch (i32) {
                    case 0:
                        chatHeadService2.A18();
                        return;
                    case 1:
                        chatHeadService2.A1F(intent);
                        return;
                    case 2:
                        chatHeadService2.A1G(intent);
                        return;
                    case 3:
                        chatHeadService2.A1E(intent);
                        return;
                    default:
                        chatHeadService2.A16();
                        return;
                }
            }
        }, "com.facebook.orca.ACTION_MONTAGE_THREAD_LIST_UPDATED_FOR_UI");
        1PA A02 = Bgy.A02();
        chatHeadService.A0F = A02;
        A02.A00();
        1P9 Bgy2 = chatHeadService.A0G.Bgy();
        Bgy2.A05(new C0tp(fbUserSession, chatHeadService, 0), "ACTION_MQTT_NO_AUTH");
        Bgy2.A05(new C0tp(fbUserSession, chatHeadService, 1), BlueServiceOperationFactory.BLUESERVICE_NO_AUTH);
        1PA A022 = Bgy2.A02();
        chatHeadService.A0E = A022;
        A022.A00();
        chatHeadService.A0X(fbUserSession);
        if (4vY.A01(chatHeadService)) {
            return;
        }
        4vZ r0 = new 4vZ(chatHeadService);
        chatHeadService.A0B = r0;
        chatHeadService.A0H.A0F(r0, 32);
    }

    private void A0h(FbUserSession fbUserSession, ThreadKey threadKey, NavigationTrigger navigationTrigger, MessageDeepLinkInfo messageDeepLinkInfo, ThreadViewMessagesInitParams threadViewMessagesInitParams, 5SW r307, boolean z) {
        5SW r309 = r307;
        A0T(fbUserSession);
        if (this.A05 != null) {
            A0d(fbUserSession, 0);
            if (r307 == null || r307 == 5SW.A1M) {
                r309 = 5SW.A0L;
            }
            this.A05.A1T(threadKey, navigationTrigger, messageDeepLinkInfo, threadViewMessagesInitParams, r309, z);
        }
    }

    private void A0i(FbUserSession fbUserSession, ThreadKey threadKey, String str) {
        A0T(fbUserSession);
        if (this.A05 != null) {
            A0d(fbUserSession, 0);
            this.A05.A1U(threadKey, 5SW.A1M, str);
        }
    }

    private void A0j(FbUserSession fbUserSession, String str) {
        boolean equal = Objects.equal(str, "lock");
        if (A0v(this)) {
            this.A05.A17("close_sys_dialogs");
            if (equal) {
                A0V(fbUserSession);
            }
        }
    }

    public static void A0l(ChatHeadService chatHeadService) {
        if (chatHeadService.A05 != null) {
            chatHeadService.A0V.A01();
            chatHeadService.A05.A1G();
            chatHeadService.A05 = null;
        }
    }

    public static void A0m(final ChatHeadService chatHeadService) {
        ((1GU) chatHeadService.A04.get()).AAs();
        if (AnonymousClass001.A1V(chatHeadService.A0Z.get())) {
            return;
        }
        ((C10864ut) chatHeadService.A0O.get()).A01();
        if (A0v(chatHeadService)) {
            JU4 ju4 = chatHeadService.A05;
            if (ju4.A1b()) {
                ju4.A17("hide_request").addListener(new Runnable() { // from class: X.0ke
                    public static final String __redex_internal_original_name = "ChatHeadService$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatHeadService.this.A19();
                    }
                }, MoreExecutors.directExecutor());
                return;
            }
        }
        A0l(chatHeadService);
        A0o(chatHeadService);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0n(ChatHeadService chatHeadService) {
        0fH.A0j("ChatHeadService", "startChatHeadForegroundActivity");
        Intent intent = new Intent((Context) chatHeadService, (Class<?>) ChatHeadForegroundActivity.class);
        intent.setFlags(872480768);
        ((08O) chatHeadService.A0x.get()).A06().A0A(chatHeadService.getApplicationContext(), intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0o(ChatHeadService chatHeadService) {
        if (!chatHeadService.A0h.isEmpty() || A0v(chatHeadService) || chatHeadService.A00 != 0 || chatHeadService.A08) {
            return;
        }
        ((C11094vi) chatHeadService.A0d.get()).A00("NOT_SHOWN");
        ((C10864ut) chatHeadService.A0O.get()).A01();
        chatHeadService.stopSelf(chatHeadService.A01);
    }

    private void A0p(ThreadKey threadKey, String str) {
        JU4 ju4 = this.A05;
        if (ju4 != null && "read_on_web".equals(str)) {
            ju4.A1V(threadKey, str);
        } else if (A0v(this)) {
            this.A05.A1S(threadKey);
        }
    }

    private void A0q(C05284dd c05284dd) {
        0fH.A0g(c05284dd.A00, "ChatHeadService", "onMontageThreadListUpdate event calling class : %s");
        ((1GU) this.A04.get()).CY3(new Runnable() { // from class: X.0P5
            public static final String __redex_internal_original_name = "ChatHeadService$$ExternalSyntheticLambda5";

            @Override // java.lang.Runnable
            public final void run() {
                ChatHeadService.this.A1C();
            }
        });
    }

    private void A0r(String str) {
        2SB r303;
        if (str.contains("is_from_fb4a")) {
            ((2SB) this.A0a.get()).A04(str);
            return;
        }
        String str2 = "diode";
        if (str.contains(str2)) {
            r303 = (2SB) this.A0a.get();
        } else if (str.contains("shortcut")) {
            r303 = (2SB) this.A0a.get();
            str2 = "tap_shortcut";
        } else {
            if (!str.contains("notification")) {
                return;
            }
            r303 = (2SB) this.A0a.get();
            str2 = "tap_system_tray_notification";
        }
        r303.A04(str2);
    }

    private void A0s(boolean z) {
        ((C10864ut) this.A0O.get()).A03(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r301.A0z.A0B() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0t() {
        /*
            r301 = this;
            r0 = r301
            X.15h r0 = r0.A0Z
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.booleanValue()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L26
            r0 = r301
            X.1Rv r0 = r0.A0z
            boolean r0 = r0.A0B()
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L28
        L26:
            r0 = 1
            r303 = r0
        L28:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.chatheads.service.ChatHeadService.A0t():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.isShowing() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0u() {
        /*
            r301 = this;
            r0 = r301
            X.DMV r0 = r0.A0K
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.isShowing()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.chatheads.service.ChatHeadService.A0u():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A1a() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0v(com.facebook.messaging.chatheads.service.ChatHeadService r301) {
        /*
            r0 = r301
            X.JU4 r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = r0.A1a()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.chatheads.service.ChatHeadService.A0v(com.facebook.messaging.chatheads.service.ChatHeadService):boolean");
    }

    public IBinder A10(Intent intent) {
        if (!((2yD) this.A0s.get()).AZk(36326360944432646L)) {
            return null;
        }
        this.A0i.onServicePreSuperOnBind();
        return null;
    }

    @Override // X.C2rm
    public int A11(Intent intent, int i, int i2) {
        int i3;
        int A04 = 0FI.A04(-1690118047);
        C00j.A05("ChatHeadService.onStartCommand", -1016927588);
        if (((2yD) this.A0s.get()).AZk(36326360944432646L)) {
            this.A0i.onServicePreSuperOnStart();
        }
        ((C04544bB) this.A0l.get()).A04(4bE.A02);
        A08();
        try {
            if (this.A0k.A04() && this.A0h.isEmpty()) {
                A0N(intent, ((1Fv) 1Bi.A03(66351)).A04(), this, i2);
                A0o(this);
                C00j.A01(646577718);
                i3 = 139875921;
            } else {
                this.A0h.add(new 9NL(intent, i2));
                C00j.A01(-87886933);
                i3 = -481551808;
            }
            0FI.A0A(i3, A04);
            return 2;
        } catch (Throwable th) {
            C00j.A01(480068388);
            0FI.A0A(1399057650, A04);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2rm
    public void A12() {
        int A04 = 0FI.A04(1218661445);
        C00j.A05("ChatHeadService.onCreate", 305051123);
        try {
            if (((1CO) this.A0s.get()).AZk(36326360944432646L)) {
                this.A0i.onServicePreSuperOnCreate();
            }
            super.A12();
            setTheme(2132608319);
            getTheme().applyStyle(C1hh.A00(), true);
            this.A04 = 1Bi.A00(16458);
            this.A0O = 1Hv.A00(this, 49356);
            this.A0V = (C10834uq) 1Bn.A0D(this, 49354);
            this.A0W = (C10894uw) 1Bn.A0D(this, 49357);
            this.A0Y = (1Ih) 1Bi.A03(67196);
            this.A0Q = 1Bi.A00(33013);
            this.A0M = (C1Gu) 1Bn.A0A(65844);
            this.A0G = (1I7) 1Hv.A02(this, 65729);
            this.A0Z = new 0nD(this, 1);
            this.A09 = (KeyguardManager) 1Hv.A02(this, 100176);
            this.A0R = 1Bi.A00(33179);
            this.A02 = (1I7) 1Hv.A02(this, 65728);
            this.A0I = (C0dr) 1Bi.A03(84488);
            this.A0a = new 0nD(this, 2);
            this.A0N = (C4Nz) 1Bn.A0D(this, 33264);
            this.A0C = (WindowManager) 1Hv.A02(this, 100186);
            this.A0P = 1Bn.A05(this, 82435);
            this.A0T = 1Bn.A05(this, 67912);
            this.A0U = 1Bi.A00(16432);
            FbUserSession A042 = ((1Fv) 1Bi.A03(66351)).A04();
            this.A0D = A042;
            this.A0S = 1Lo.A00(this, A042, 85200);
            A08();
            this.A0Y.A02();
            this.A0A = new Configuration(getResources().getConfiguration());
            if (this.A0k.A04()) {
                A0g(this.A0D, this);
            } else {
                A0S(this.A0D);
            }
            ((C2j0) this.A0p.get()).A02(this);
            C00j.A01(1770569592);
            0FI.A0A(-192943456, A04);
        } catch (Throwable th) {
            C00j.A01(1137995975);
            0FI.A0A(473377761, A04);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2rm
    public void A13() {
        1qC r0;
        int A04 = 0FI.A04(2081197267);
        ((C11064vf) this.A0n.get()).A01("DESTROY_SERVICE", null);
        if (((2yD) this.A0s.get()).AZk(36326360944432646L)) {
            this.A0i.onServicePreSuperOnDestroy();
        }
        ((C11094vi) this.A0d.get()).A00("NOT_SHOWN");
        if (this.A0X != null) {
            ((FbSharedPreferences) this.A0Q.get()).D64(this.A0X, A10);
            this.A0X = null;
        }
        1Gw r02 = this.A0L;
        if (r02 != null) {
            this.A0M.A02(r02, 67);
            this.A0L = null;
        }
        synchronized (this) {
            try {
                this.A07 = true;
            } catch (Throwable th) {
                0FI.A0A(-1756476838, A04);
                throw th;
            }
        }
        super.A13();
        1Gz r03 = this.A0J;
        if (r03 != null) {
            unregisterReceiver(r03);
            this.A0J = null;
        }
        C00i c00i = this.A0v;
        if (c00i != null) {
            ((C08134lz) c00i.get()).A02(this.A0j);
        }
        1PA r04 = this.A0F;
        if (r04 != null) {
            r04.A01();
            this.A0F = null;
        }
        1PA r05 = this.A0E;
        if (r05 != null) {
            r05.A01();
            this.A0E = null;
        }
        A0l(this);
        this.A0V.A01();
        PhoneStateListener phoneStateListener = this.A0B;
        if (phoneStateListener != null && (r0 = this.A0H) != null) {
            r0.A0F(phoneStateListener, 0);
            this.A0B = null;
            this.A0H = null;
        }
        Set set = this.A06;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((1IG) it.next()).A03();
            }
            this.A06.clear();
        }
        ((C2j0) this.A0p.get()).A03(this);
        0FI.A0A(1709537527, A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ 2SB A14() {
        return (2SB) 1Bn.A0D(this, 17019);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Boolean A15() {
        return (Boolean) 1Bn.A0D(this, 99943);
    }

    public /* synthetic */ void A17() {
        A0m(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void A18() {
        A0l(this);
        stopSelf(this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void A19() {
        ((08O) this.A0x.get()).A06().A0A(this, 4iH.A00());
        A0l(this);
        A0o(this);
    }

    public /* synthetic */ void A1A() {
        if (A0v(this)) {
            this.A05.A17("screen_off");
        }
    }

    public /* synthetic */ void A1B() {
        this.A0V.A00();
    }

    public /* synthetic */ void A1G(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("multiple_thread_keys");
        if (parcelableArrayListExtra == null) {
            0fH.A0k("ChatHeadService", "No thread keys in intent");
            return;
        }
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            A0p((ThreadKey) it.next(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void A1H(Intent intent, Bundle bundle) {
        super/*android.content.ContextWrapper*/.startActivity(intent, bundle);
    }

    public /* synthetic */ void A1I(final Intent intent, final Bundle bundle) {
        this.A05.A17("starting_activity").addListener(new Runnable() { // from class: X.0kg
            public static final String __redex_internal_original_name = "ChatHeadService$$ExternalSyntheticLambda20";

            @Override // java.lang.Runnable
            public final void run() {
                this.A1H(intent, bundle);
            }
        }, MoreExecutors.directExecutor());
    }

    public /* synthetic */ void A1J(Intent intent, FbUserSession fbUserSession) {
        A0j(fbUserSession, intent.getStringExtra("reason"));
    }

    public /* synthetic */ void A1N(1IG r302) {
        synchronized (this) {
            if (!this.A07) {
                this.A06.remove(r302);
            }
        }
    }

    public /* synthetic */ void A1O(2TM r302) {
        ArrayList arrayList = new ArrayList();
        1Du it = r302.A00.iterator();
        while (it.hasNext()) {
            MontageBucketPreview montageBucketPreview = (MontageBucketPreview) it.next();
            if (!montageBucketPreview.A0A) {
                arrayList.add(montageBucketPreview);
            }
        }
        JU4 ju4 = this.A05;
        if (ju4 != null) {
            ju4.A1X(arrayList);
        }
    }

    public /* synthetic */ void A1P(boolean z) {
        if (z) {
            return;
        }
        A06();
    }

    @Override // X.C2iz
    public void AU9(C2j1 c2j1) {
        c2j1.A00(33);
    }

    @Override // X.C2iz
    public void AUA(C2mq c2mq) {
        if (c2mq.AU8() == 33) {
            A0q((C05284dd) c2mq);
        }
    }

    public String AWg() {
        return "chat_heads";
    }

    public Map Agf() {
        JU4 ju4 = this.A05;
        if (ju4 != null) {
            return ju4.Agf();
        }
        return null;
    }

    public Long Am7() {
        return 3719985438017145L;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v4 ??, still in use, count: 2, list:
          (r304v4 ??) from 0x004e: PHI (r304v2 ??) = (r304v1 ??), (r304v4 ??) binds: [B:22:0x003e, B:25:0x004a] A[DONT_GENERATE, DONT_INLINE]
          (r304v4 ?? I:java.util.Set) from 0x004b: IPUT 
          (r304v4 ?? I:java.util.Set)
          (r301v0 'this' ?? I:com.facebook.messaging.chatheads.service.ChatHeadService A[IMMUTABLE_TYPE, THIS])
         A[Catch: all -> 0x0067] com.facebook.messaging.chatheads.service.ChatHeadService.A06 java.util.Set
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public void CcH(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v4 ??, still in use, count: 2, list:
          (r304v4 ??) from 0x004e: PHI (r304v2 ??) = (r304v1 ??), (r304v4 ??) binds: [B:22:0x003e, B:25:0x004a] A[DONT_GENERATE, DONT_INLINE]
          (r304v4 ?? I:java.util.Set) from 0x004b: IPUT 
          (r304v4 ?? I:java.util.Set)
          (r301v0 'this' ?? I:com.facebook.messaging.chatheads.service.ChatHeadService A[IMMUTABLE_TYPE, THIS])
         A[Catch: all -> 0x0067] com.facebook.messaging.chatheads.service.ChatHeadService.A06 java.util.Set
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public void attachBaseContext(Context context) {
        1Ih r0 = this.A0Y;
        if (r0 != null) {
            r0.A02();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.A0i.getLifecycle();
    }

    public void onConfigurationChanged(Configuration configuration) {
        JU4 ju4;
        this.A0Y.A02();
        if ((configuration.diff(this.A0A) & 128) != 0 && (ju4 = this.A05) != null) {
            ju4.A1I();
        }
        this.A0A = new Configuration(configuration);
    }

    public void onTrimMemory(int i) {
        0fH.A0g(Integer.valueOf(i), "ChatHeadService", "Received onTrimMemory, level: %d");
        if (this.A05 != null) {
            boolean z = true;
            int i2 = 60;
            if (((9We) this.A0q.get()).A00(this.A0C.getDefaultDisplay())) {
                i2 = 80;
            }
            if (i >= i2) {
                this.A05.A1H();
            } else {
                z = false;
            }
            ((C11064vf) this.A0n.get()).A00(i, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startActivity(final Intent intent, final Bundle bundle) {
        if (A0v(this)) {
            this.A05.A1C();
        }
        intent.setFlags(intent.getFlags() | 268435456 | Constants.LOAD_RESULT_PGO);
        boolean booleanExtra = intent.getBooleanExtra(C1xj.A0P, false);
        if (!A0v(this) || booleanExtra) {
            super/*android.content.ContextWrapper*/.startActivity(intent, bundle);
        } else {
            ((1GU) this.A04.get()).Ciz(new Runnable() { // from class: X.0kh
                public static final String __redex_internal_original_name = "ChatHeadService$$ExternalSyntheticLambda3";

                @Override // java.lang.Runnable
                public final void run() {
                    this.A1I(intent, bundle);
                }
            });
        }
    }
}
