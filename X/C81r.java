package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.messaging.threadview.surfaceoptions.model.ColorSchemeConfig;
import com.facebook.messaging.threadview.surfaceoptions.model.ThreadViewSurfaceOptions;
import com.facebook.messaging.threadview.surfaceoptions.model.UpButtonConfig;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMap;

/* renamed from: X.81r, reason: invalid class name */
/* loaded from: 81r.class */
public final class C81r extends 37K implements 2LK, MNw {
    public static final ThreadViewSurfaceOptions A0H;
    public View A00;
    public 1pH A01;
    public 9He A02;
    public ThreadKey A03;
    public ThreadViewParams A04;
    public 2OZ A05;
    public String A06;
    public 1BY A07;
    public AnonymousClass823 A08;
    public final InterfaceC00633oW A09;
    public final 2M3 A0A;
    public final C00i A0B;
    public final C09p A0C;
    public final C09p A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final DHe A0G;

    static {
        ThreadViewSurfaceOptions threadViewSurfaceOptions = 2MD.A00;
        threadViewSurfaceOptions.getClass();
        ColorSchemeConfig colorSchemeConfig = threadViewSurfaceOptions.A00;
        UpButtonConfig upButtonConfig = 2ME.A02;
        C1pq.A08("upButtonConfig", upButtonConfig);
        A0H = new ThreadViewSurfaceOptions(colorSchemeConfig, C81s.A00, upButtonConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C81r(Context context, 1BO r303) {
        super(context);
        this.A0G = new DHe() { // from class: X.81t
            @Override // X.DHe
            public void CQ5(int i, Bundle bundle) {
                C81r c81r = C81r.this;
                ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                c81r.A05.getClass();
                Intent intent = new Intent();
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                C81r.A03(c81r);
                c81r.A05.onActivityResult(ActionId.ON_VIEW_CREATED_END, i, intent);
            }

            @Override // X.DHe
            public void CSR() {
                C81r c81r = C81r.this;
                ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                c81r.A05.getClass();
                new Intent();
                C81r.A03(c81r);
                c81r.A05.onActivityResult(ActionId.ON_VIEW_CREATED_END, -1, new Intent());
            }
        };
        this.A0A = new C9rn(this, 1);
        this.A0F = new 1BQ(16922);
        this.A0B = new 1BV(this.A07, 17019);
        this.A0E = new 1BV(this.A07, 66470);
        this.A0D = new 9qY(this, 0);
        this.A0C = new 9qY(this, 1);
        this.A09 = new InterfaceC00633oW() { // from class: X.81u
            @Override // X.InterfaceC00633oW
            public boolean C9W() {
                C81r c81r = C81r.this;
                ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                JU4.A0b(c81r.A02.A00);
                return true;
            }
        };
        this.A07 = new 1BY(r303);
        C00j.A05("ThreadViewFragmentBubbleContentView", 975720203);
        try {
            A0U(2132542577);
            this.A00 = C09s.A01(this, 2131363731);
            C00j.A01(658374292);
        } catch (Throwable th) {
            C00j.A01(1299639786);
            throw th;
        }
    }

    public static void A00(C81r c81r) {
        AnonymousClass823 anonymousClass823 = c81r.A08;
        if (anonymousClass823 != null) {
            anonymousClass823.A0C.recycle();
            anonymousClass823.A0D.setOnTouchListener(null);
            c81r.A08 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A02(final C81r c81r) {
        AnonymousClass823 anonymousClass823 = c81r.A08;
        if (anonymousClass823 != null) {
            anonymousClass823.A0C.recycle();
            anonymousClass823.A0D.setOnTouchListener(null);
            c81r.A08 = null;
        }
        if (c81r.A05 != null) {
            if (((2BQ) c81r.A0F.get()).A05(1BJ.A00(1536))) {
                int dimensionPixelSize = c81r.getResources().getDimensionPixelSize(2132279368);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, dimensionPixelSize, 0, 0);
                c81r.A00.setLayoutParams(layoutParams);
            }
            AnonymousClass823 anonymousClass8232 = new AnonymousClass823(c81r.A05.A0e, c81r.A00, 0S2.A00);
            c81r.A08 = anonymousClass8232;
            anonymousClass8232.A05 = new AnonymousClass822() { // from class: X.81w
                @Override // X.AnonymousClass825
                public void Bv8(double d) {
                    C81r c81r2 = C81r.this;
                    ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                    c81r2.A02.A00.A17("swipe_up_thread_view");
                }
            };
            anonymousClass8232.A04 = new 2Ob() { // from class: X.81x
                public boolean ADo(MotionEvent motionEvent) {
                    C81r c81r2 = C81r.this;
                    ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                    return c81r2.A05.ADo(motionEvent);
                }
            };
            anonymousClass8232.A0D.setOnTouchListener(new C9q9(anonymousClass8232, 3));
        }
    }

    public static void A03(C81r c81r) {
        2OZ r0;
        1pH r02 = c81r.A01;
        if (r02 == null || (r0 = c81r.A05) == null) {
            return;
        }
        r02.Czy(r0, "thread_view_fragment");
    }

    public static void A04(C81r c81r) {
        if (!A05(c81r)) {
            A00(c81r);
            return;
        }
        AnonymousClass823 anonymousClass823 = c81r.A08;
        if (anonymousClass823 == null) {
            A02(c81r);
            return;
        }
        anonymousClass823.A09 = false;
        anonymousClass823.A0A = true;
        C66i c66i = anonymousClass823.A0F;
        c66i.A06(0.0d);
        c66i.A02();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A05(C81r c81r) {
        06Z A0W = c81r.A0W();
        int A0U = A0W.A0U();
        if (A0U == 0) {
            return false;
        }
        return "thread_view_fragment".equals(((C06c) A0W.A0e(A0U - 1)).A0A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0X() {
        this.A01 = 1pH.A01((ViewGroup) this.A0A.AUH(), A0W(), this.A09);
        06Z A0W = A0W();
        A0W.A1L(this.A0D);
        A0W.A1L(this.A0C);
        this.A01.getClass();
        if (A0W().A0b("thread_view_fragment") == null) {
            this.A01.Czy(2OZ.A08((ThreadViewParams) null, A0H), "thread_view_fragment");
        }
    }

    public void A0Y() {
        1pH r0 = this.A01;
        if (r0 != null) {
            r0.A06();
            this.A01 = null;
        }
        this.A05 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0Z(Fragment fragment) {
        if (fragment instanceof 2OZ) {
            2OZ r0 = (2OZ) fragment;
            if (this.A05 != r0) {
                this.A05 = r0;
                r0.A0b = new 5Sy() { // from class: X.90a
                    public void A00() {
                        C81r c81r = C81r.this;
                        ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                        9He r02 = c81r.A02;
                        r02.A00.A1V(c81r.A03, 1BJ.A00(465));
                    }

                    public void A02(ThreadKey threadKey) {
                        C81r c81r = C81r.this;
                        ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                        9He r02 = c81r.A02;
                        if (r02 != null) {
                            ThreadKey threadKey2 = c81r.A03;
                            JU4 ju4 = r02.A00;
                            int i = JU4.A1p;
                            Kuq kuq = ju4.A1E;
                            if (kuq.A02.containsKey(threadKey2.toString())) {
                                kuq.A06(threadKey2, threadKey);
                                ju4.A1F.A06(threadKey2, threadKey);
                            }
                        }
                    }

                    public void A04(boolean z) {
                        C81r c81r = C81r.this;
                        ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                        c81r.A02.A00.A17((String) null);
                    }

                    public void A05(boolean z) {
                        C81r c81r = C81r.this;
                        if (z) {
                            C81r.A00(c81r);
                        } else {
                            C81r.A02(c81r);
                        }
                    }

                    public void A06(boolean z) {
                        C81r c81r = C81r.this;
                        ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                        c81r.A02.A00.A1Y(z);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, X.81r] */
                    public void A07(boolean z) {
                        ?? r02 = C81r.this;
                        int i = 0;
                        int A02 = 0NA.A02(r02.getContext(), 2130968595, 0);
                        if (z) {
                            i = A02;
                        }
                        ThreadViewSurfaceOptions threadViewSurfaceOptions = C81r.A0H;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.setMargins(0, i, 0, 0);
                        r02.A00.setLayoutParams(layoutParams);
                    }
                };
                r0.setUserVisibleHint(this.A02);
                ThreadViewParams threadViewParams = this.A04;
                if (threadViewParams != null) {
                    this.A05.A1a(threadViewParams);
                }
            }
        } else if (fragment instanceof 8GC) {
            DHe dHe = this.A0G;
            BBc bBc = (8GC) fragment;
            11T.A0F(dHe, 0);
            bBc.A01 = dHe;
            BBc.A03(bBc);
        }
        2Or.A00(fragment, this.A0A);
    }

    @Override // X.MNw
    public void ATh(Intent intent) {
        2OZ r0 = this.A05;
        if (r0 != null) {
            r0.A0c.onActivityResult(1003, 0, intent);
        }
    }

    @Override // X.ML5
    public String AWi() {
        return "thread";
    }

    public java.util.Map Agf() {
        2OZ r0 = this.A05;
        return r0 != null ? r0.Agf() : RegularImmutableMap.A03;
    }

    @Override // X.ML5
    public boolean Bkd() {
        1pH r0 = this.A01;
        r0.getClass();
        return r0.A07();
    }

    @Override // X.ML5
    public void Bl5() {
        6F2 r0;
        if (this.A05 == null || !A05(this) || (r0 = this.A05.A0c) == null) {
            return;
        }
        r0.A0b.A1i();
        C62h c62h = r0.A0s;
        String str = c62h.A01;
        if (str != null) {
            C62h.A02(c62h, str);
        }
        r0.A1J.A00 = null;
        6Oj r02 = (6Oj) r0.A2O.get();
        r02.A02 = false;
        r02.A00 = null;
        C6eh c6eh = (C6eh) r0.A3U.get();
        c6eh.A01.clear();
        c6eh.A00 = null;
        if (r0.A3m.isEmpty()) {
            return;
        }
        ImmutableList A0E = 6F2.A0E(r0);
        int size = A0E.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            6cM r03 = ((6cL) A0E.get(i2)).A02;
            if (r03 != null && r03.A10.A01 == 1.0d) {
                6cM.A06(r03);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ML5
    public void Bl6() {
        6F2 r0;
        6F2 r02;
        boolean AZk = ((2yD) ((C81l) this.A0E.get()).A00.A00.get()).AZk(36323229912025441L);
        if (this.A05 != null && A05(this) && AZk) {
            2OZ r03 = this.A05;
            if (r03.A0r && (r02 = r03.A0c) != null && r03.A0H != null) {
                r02.A1f(r03.A0W);
            }
            6F2 r04 = this.A05.A0c;
            if (r04 != null) {
                r04.A0b.A1j();
                r04.A1a();
            }
            this.A05.setUserVisibleHint(true);
        }
        super/*X.32a*/.Bl6();
        if (this.A03 != null) {
            2dU.A00(getContext(), ((1Fv) 1Bi.A03(66351)).A04());
            ThreadKey threadKey = this.A03;
            PRELoggingEvent pRELoggingEvent = new PRELoggingEvent(threadKey.A0u().hashCode());
            6Bw A00 = C6iY.A00();
            A00.A09 = threadKey.A06.name();
            A00.A06 = "chat_head";
            2dU.A01(A00, pRELoggingEvent);
        }
        A04(this);
        if (this.A05 == null || !A05(this) || AZk || (r0 = this.A05.A0c) == null) {
            return;
        }
        r0.A0b.A1j();
        r0.A1a();
    }

    @Override // X.ML5
    public void BrA() {
        2OZ r0 = this.A05;
        if (r0 != null) {
            r0.A1Y();
        }
        A03(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ML5
    public void BrC() {
        super/*X.32a*/.BrC();
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        if (this.A05 == null || !A05(this)) {
            return;
        }
        this.A05.setUserVisibleHint(false);
    }

    @Override // X.ML5
    public void BrF() {
        ThreadViewParams threadViewParams;
        ThreadViewMessagesInitParams threadViewMessagesInitParams;
        if (!A05(this) && (threadViewParams = this.A04) != null && ((threadViewMessagesInitParams = threadViewParams.A0A) == null || threadViewMessagesInitParams.A0B == null)) {
            A03(this);
        }
        2OZ r0 = this.A05;
        if (r0 != null) {
            r0.A1Z();
        }
    }

    @Override // X.ML5
    public void BrG() {
        A04(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ML5
    public void BrK() {
        if (this.A03 != null) {
            2dU.A00(getContext(), ((1Fv) 1Bi.A03(66351)).A04());
            ThreadKey threadKey = this.A03;
            PRELoggingEvent pRELoggingEvent = new PRELoggingEvent(threadKey.A0u().hashCode());
            6Bw A00 = C6iY.A00();
            A00.A09 = threadKey.A06.name();
            A00.A06 = "chat_head";
            2dU.A01(A00, pRELoggingEvent);
        }
        if (this.A05 == null || !A05(this) || ((2yD) ((C81l) this.A0E.get()).A00.A00.get()).AZk(36323229912025441L)) {
            return;
        }
        this.A05.setUserVisibleHint(true);
    }

    @Override // X.ML5
    public boolean C6g() {
        2OZ r0 = this.A05;
        if (r0 != null) {
            return r0.A1c();
        }
        return false;
    }

    @Override // X.MNw
    public void CQ6(ThreadKey threadKey) {
    }

    @Override // X.MNw
    public void CvN(ThreadKey threadKey, NavigationTrigger navigationTrigger, MessageDeepLinkInfo messageDeepLinkInfo, ThreadViewMessagesInitParams threadViewMessagesInitParams, 5SW r306) {
        this.A03 = threadKey;
        C6el c6el = new C6el();
        c6el.A00(threadKey);
        c6el.A02(r306);
        c6el.A0A = threadViewMessagesInitParams;
        c6el.A06 = navigationTrigger;
        c6el.A07 = messageDeepLinkInfo;
        ThreadViewParams threadViewParams = new ThreadViewParams(c6el);
        this.A04 = threadViewParams;
        2OZ r0 = this.A05;
        if (r0 != null) {
            r0.A1a(threadViewParams);
        }
    }

    @Override // X.MNw
    public boolean CyI() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(72605697);
        A00(this);
        super/*X.32a*/.onDetachedFromWindow();
        0FI.A0C(1530688936, A06);
    }
}
