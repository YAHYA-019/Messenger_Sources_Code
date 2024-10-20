package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.aibot.aidialog.dialogs.AiBotBottomSheetDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Locale;

/* renamed from: X.9ma, reason: invalid class name */
/* loaded from: 9ma.class */
public final class C9ma {
    public FrameLayout A00;
    public LinearLayout A01;
    public LithoView A02;
    public C94e A03;
    public 9lF A04;
    public C94f A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final FbUserSession A0A;
    public final 1pK A0B;
    public final 2S4 A0C;
    public final InterfaceC06154g3 A0D;
    public final 1Br A0E;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final ThreadKey A0N;
    public final AZS A0O;
    public final 5SW A0P;
    public final LK9 A0Q;
    public final C6ri A0R;
    public final 2Og A0S;
    public final 94U A0T;
    public final String A0U;
    public final C01i A0V;
    public final C01i A0W;
    public final C01i A0X;
    public final boolean A0Y;
    public final 1Br A0G = 1Bq.A00(68689);
    public final 1Br A0F = 1Bq.A00(68690);

    public C9ma(Context context, FbUserSession fbUserSession, 1pK r304, 2S4 r305, ThreadKey threadKey, AZS azs, 5SW r308, C6ri c6ri, 2Og r310, String str, boolean z) {
        DR7 dr7;
        BottomSheetBehavior A05;
        this.A09 = context;
        this.A0C = r305;
        this.A0A = fbUserSession;
        this.A0B = r304;
        this.A0S = r310;
        this.A0N = threadKey;
        this.A0P = r308;
        this.A0Y = z;
        this.A0R = c6ri;
        this.A0O = azs;
        this.A0U = str;
        this.A0H = 1HG.A00(context, 68555);
        this.A0L = 1Lm.A00(context, fbUserSession, 65869);
        this.A0M = 1Bu.A01(context, 49478);
        C03i c03i = C03i.A02;
        this.A0V = AQX.A00(this, c03i, 8);
        this.A0J = 1Bu.A00(68730);
        this.A0K = 1Bu.A00(68729);
        this.A0E = 1Bu.A00(68258);
        AQX aqx = new AQX(this, 15);
        C01i A00 = AQX.A00(new AQX(r304, 10), c03i, 11);
        this.A0X = 7zU.A0F(new AQX(A00, 12), aqx, AQc.A00(null, A00, 36), 7zL.A18(8DP.class));
        this.A0W = AQX.A00(this, c03i, 9);
        this.A0I = 7zM.A0f(context);
        this.A0Q = new LK9(this, 5);
        KTH kth = new 94U(this, 2);
        this.A0T = kth;
        this.A0D = new 8I0(this, 1);
        if (azs != null) {
            AV1 A002 = AV1.A00(this, 32);
            AiBotBottomSheetDialogFragment aiBotBottomSheetDialogFragment = ((C3Zf) azs).A00;
            9HK r0 = new 9HK(A002);
            2qR r02 = BaseMigBottomSheetDialogFragment.A06;
            aiBotBottomSheetDialogFragment.A02 = r0;
            DR7 dr72 = ((0D2) aiBotBottomSheetDialogFragment).A01;
            if (!(dr72 instanceof DR7) || (dr7 = dr72) == null || (A05 = dr7.A05()) == null) {
                return;
            }
            A05.A0G(kth);
        }
    }

    public static final void A00(ViewParent viewParent, boolean z) {
        ViewGroup viewGroup;
        while (viewParent != null) {
            if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
            viewParent = viewParent.getParent();
        }
    }

    public static final void A01(C9ma c9ma) {
        String str = c9ma.A06;
        if (str != null) {
            3vU A0x = 7zQ.A0x(c9ma.A0E);
            ThreadKey threadKey = c9ma.A0N;
            BOj A00 = 60U.A00(c9ma.A0P);
            int i = !c9ma.A0Y ? 1 : 0;
            3vU.A01(A00, (AnonymousClass988) null, EnumC03583yg.A01, (8Ey) null, A0x, 1BK.A0d(), (String) null, (String) null, 1BK.A0w(threadKey), (String) null, str, 17, 36, i);
        }
    }

    public static final void A02(C9ma c9ma) {
        DP5 dp5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayout = c9ma.A00;
        if (frameLayout == null || (dp5 = c9ma.A03) == null) {
            return;
        }
        if (dp5.getLayoutParams() == null) {
            dp5.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        }
        ViewGroup.LayoutParams layoutParams = dp5.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        Rect rect = new Rect();
        frameLayout.getGlobalVisibleRect(rect);
        int height = rect.height();
        marginLayoutParams.bottomMargin = frameLayout.getHeight() - height;
        ((ViewGroup.LayoutParams) marginLayoutParams).height = height;
        dp5.requestLayout();
    }

    public static final void A03(C9ma c9ma, boolean z) {
        LinearLayout linearLayout;
        if (c9ma.A02 == null || c9ma.A01 == null) {
            return;
        }
        ((8DP) c9ma.A0X.getValue()).A02();
        c9ma.A08 = false;
        AZS azs = c9ma.A0O;
        if (azs != null) {
            azs.ARZ();
        }
        FrameLayout frameLayout = c9ma.A00;
        if (frameLayout != null) {
            frameLayout.removeView(c9ma.A02);
        }
        C94e c94e = c9ma.A03;
        if (c94e != null) {
            C2a2 c2a2 = c94e.A00;
            if (c2a2 != null) {
                c2a2.AE0(null);
            }
            c94e.A00 = null;
        }
        FrameLayout frameLayout2 = c9ma.A00;
        if (frameLayout2 != null) {
            frameLayout2.removeView(c9ma.A03);
        }
        FrameLayout frameLayout3 = c9ma.A00;
        if (frameLayout3 != null) {
            frameLayout3.addView(c9ma.A01);
        }
        if (z && (linearLayout = c9ma.A01) != null) {
            linearLayout.post(new ACp(c9ma));
        }
        C5jn c5jn = ((C9M1) c9ma.A0V.getValue()).A00;
        if (c5jn != null) {
            c5jn.A00(new C87p(false, 12));
        }
        c9ma.A07 = false;
        if (azs != null) {
            azs.CrX(1.0f);
        }
    }

    public final void A04() {
        C01i c01i = this.A0V;
        ((C9M1) c01i.getValue()).A00 = ((C6u1) 1Lm.A05(this.A09, this.A0A, 68691)).AgW(this.A0N).A02;
        C5jn c5jn = ((C9M1) c01i.getValue()).A00;
        if (c5jn != null) {
            c5jn.A00(new C87p(true, 12));
        }
        this.A07 = true;
        AZS azs = this.A0O;
        if (azs != null) {
            azs.CrX(0.03f);
        }
        LifecycleOwner viewLifecycleOwner = this.A0B.getViewLifecycleOwner();
        AJT.A02(this, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), 19);
        AJW.A01(viewLifecycleOwner, this, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), 10);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.LifecycleOwner, X.94e, java.lang.Object] */
    public final void A05() {
        View view = this.A02;
        if (view != null) {
            ?? r0 = this.A03;
            if (r0 != 0) {
                C01i c01i = this.A0X;
                C15t c15t = ((8DP) c01i.getValue()).A0B;
                0zV r02 = ((8DP) c01i.getValue()).A06;
                11T.A0F(c15t, 0);
                C2a2 c2a2 = r0.A00;
                if (c2a2 != null) {
                    c2a2.AE0(null);
                }
                r0.A00 = null;
                r0.A00 = 2aK.A04(new AJf(r0, c15t, r02, null, 29), 7zO.A0J((LifecycleOwner) r0));
            }
            FrameLayout frameLayout = this.A00;
            if (frameLayout != null) {
                frameLayout.addView(this.A03);
                frameLayout.addView(view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [X.94e, X.DP5] */
    public final void A06(float f) {
        String A00;
        StringBuilder A0n;
        String A0s = 7zR.A0s();
        this.A06 = A0s;
        3vU A0x = 7zQ.A0x(this.A0E);
        ThreadKey threadKey = this.A0N;
        5SW r0 = this.A0P;
        3vU.A01(60U.A00(r0), (AnonymousClass988) null, EnumC03583yg.A01, (8Ey) null, A0x, false, (String) null, (String) null, 1BK.A0w(threadKey), (String) null, A0s, 1, 36, !this.A0Y ? 1 : 0);
        if (!this.A08) {
            8DP r02 = (8DP) this.A0X.getValue();
            Context context = this.A09;
            long j = threadKey.A02;
            LifecycleOwner viewLifecycleOwner = this.A0B.getViewLifecycleOwner();
            AK7 A19 = 7zL.A19(this, 4);
            boolean A002 = ((9Wm) 1Br.A0B(this.A0F)).A00();
            String str = this.A0U;
            if (str != null) {
                A0n = AnonymousClass001.A0n("meta_ai_");
                A0n.append(str);
            } else {
                if (r0 == null) {
                    A00 = null;
                } else {
                    switch (r0.ordinal()) {
                        case ActionId.ON_CREATE_VIEW_END /* 45 */:
                            A00 = "ai_home_from_folder_list";
                            break;
                        case ActionId.QUEUED /* 48 */:
                            A00 = "meta_ai_inbox_voice_button";
                            break;
                        case ActionId.MESSAGE_UPDATE_END /* 58 */:
                            A00 = AnonymousClass000.A00(212);
                            break;
                        case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                            A00 = "messenger_universal_search:meta_ai_search_result";
                            break;
                        case ActionId.ACTIVITY_STARTED /* 76 */:
                            A00 = "messenger_universal_search:ai_nullstate_donut";
                            break;
                        case ActionId.ACTIVITY_RESUMED /* 77 */:
                            A00 = "meta_ai_search_voice_button";
                            break;
                        case ActionId.FRAGMENT_CREATED /* 78 */:
                            A00 = "messenger_universal_search:ai_typeahead_donut";
                            break;
                        case ActionId.FRAGMENT_RESUMED /* 79 */:
                            A00 = "messenger_universal_search:ai_prompt";
                            break;
                        case 80:
                            A00 = "messenger_universal_search:ai_typeahead";
                            break;
                        case ActionId.INTENT_MAPPING_BEGIN /* 81 */:
                            A00 = "messenger_universal_search:ai_nullstate_airplane_send";
                            break;
                        case ActionId.FRAGMENT_ON_CREATE /* 82 */:
                            A00 = "messenger_universal_search:ai_typeahead_airplane_send";
                            break;
                        case ActionId.FRAGMENT_NEW_INSTANCE /* 83 */:
                            A00 = "messenger_universal_search:ai_typeahead_keyboard_send";
                            break;
                        case ActionId.FINALLY /* 89 */:
                            A00 = MRk.A00(0);
                            break;
                        case ActionId.RTMP_CONNECTION_REQUESTED /* 109 */:
                            A00 = "meta_ai_tab";
                            break;
                        case ActionId.VIDEO_PLAYING /* 116 */:
                            A00 = "mdotme";
                            break;
                        case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                            A00 = "messenger_universal_search:serp_snippet";
                            break;
                        case ActionId.RTMP_CONNECTION_INTERCEPTED /* 119 */:
                            A00 = "messenger_universal_search:serp_snippet_pill";
                            break;
                        default:
                            String name = r0.name();
                            Locale locale = Locale.US;
                            11T.A0B(locale);
                            A00 = 4YU.A18(locale, name);
                            break;
                    }
                    if (!0CV.A0b(A00, "meta_ai_", false)) {
                        A0n = AnonymousClass001.A0n("meta_ai_");
                        A0n.append(A00);
                    }
                }
                8DP.A01(context, viewLifecycleOwner, r02, A0s, A00, A19, j, A002);
            }
            A00 = A0n.toString();
            8DP.A01(context, viewLifecycleOwner, r02, A0s, A00, A19, j, A002);
        }
        Context context2 = this.A09;
        this.A02 = new LithoView(context2, (AttributeSet) null);
        this.A03 = new DP5(context2);
        this.A05 = new C94f((8DP) this.A0X.getValue(), new AKY(A0s, this, 5), 7zU.A0t(this, 3), new AV7(A0s, this, 3));
        LifecycleOwner viewLifecycleOwner2 = this.A0B.getViewLifecycleOwner();
        2aK.A03((Integer) null, (0DE) null, new AJH(viewLifecycleOwner2, this, (0DR) null, f, 1), LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), 3);
        LithoView lithoView = this.A02;
        if (lithoView == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        lithoView.setKeepScreenOn(true);
        if (this.A02 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
    }
}
