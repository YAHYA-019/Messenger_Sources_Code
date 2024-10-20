package com.facebook.messaging.composer;

import X.06Z;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Fv;
import X.1Fw;
import X.1Hv;
import X.1Js;
import X.1Lm;
import X.1Lo;
import X.1YC;
import X.1qI;
import X.1rP;
import X.23F;
import X.2BQ;
import X.2S4;
import X.2Wo;
import X.2yD;
import X.4YU;
import X.5Gh;
import X.5II;
import X.5OF;
import X.67E;
import X.67F;
import X.67O;
import X.6FM;
import X.6Nq;
import X.6Nr;
import X.6Os;
import X.6Ot;
import X.6Ou;
import X.6Ov;
import X.6Ow;
import X.6Ox;
import X.6Oy;
import X.6P0;
import X.6PG;
import X.6PH;
import X.6PJ;
import X.6PK;
import X.6PO;
import X.6PP;
import X.6PS;
import X.6PV;
import X.6PZ;
import X.6Pa;
import X.6Pb;
import X.6Pc;
import X.6Pd;
import X.6Pe;
import X.6Pf;
import X.6Ph;
import X.6Pi;
import X.6QS;
import X.6R4;
import X.6Rb;
import X.6Re;
import X.6Rh;
import X.6Ri;
import X.6Rj;
import X.6S5;
import X.6S7;
import X.6SB;
import X.6SC;
import X.6Sh;
import X.6Sm;
import X.6Sp;
import X.6fA;
import X.6fD;
import X.7mD;
import X.82O;
import X.8WO;
import X.8YO;
import X.9EB;
import X.ABb;
import X.ACu;
import X.AHk;
import X.AnonymousClass001;
import X.BOj;
import X.C00i;
import X.C00j;
import X.C09s;
import X.C1235Abd;
import X.C1236Abe;
import X.C1F6;
import X.C1Y6;
import X.C1oo;
import X.C1u2;
import X.C1u3;
import X.C1u4;
import X.C2ib;
import X.C2j0;
import X.C60j;
import X.C62j;
import X.C66i;
import X.C6g3;
import X.C6gy;
import X.C6gz;
import X.C6h0;
import X.C6kd;
import X.C6kf;
import X.C77c;
import X.C7qw;
import X.C7wm;
import X.C7yt;
import X.C83q;
import X.C9hh;
import X.CYl;
import X.F94;
import X.IKL;
import X.IKd;
import X.IL9;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.composer.combinedexpression.plugins.buttons.composertabbedextensions.CombinedExpressionTabbedExtensionSetConfig;
import com.facebook.messaging.model.messages.ProfileRange;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.user.model.UserKey;
import com.facebook.widget.FbImageView;
import com.facebook.widget.text.BetterEditTextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mapbox.mapboxsdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: OneLineComposerView.class */
public class OneLineComposerView extends ViewGroup implements C7yt {
    public static final long A1Y = TimeUnit.SECONDS.toMillis(4);
    public static final Set A1Z = ImmutableSet.A06("suggested_expression", "gif", "emoji", "gallery", "stickers_ls", "avatar_stickers_ls", new String[0]);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public View A07;
    public ViewGroup A08;
    public LinearLayout A09;
    public 06Z A0A;
    public FbUserSession A0B;
    public 2S4 A0C;
    public 6Nq A0D;
    public 82O A0E;
    public C00i A0F;
    public C00i A0G;
    public C00i A0H;
    public C00i A0I;
    public C00i A0J;
    public C00i A0K;
    public C00i A0L;
    public C00i A0M;
    public C00i A0N;
    public C00i A0O;
    public C00i A0P;
    public 67O A0Q;
    public LithoView A0R;
    public 6S5 A0S;
    public ComposerActionButton A0T;
    public ComposerActionButton A0U;
    public ComposerActionButton A0V;
    public ComposerActionButton A0W;
    public 6Pd A0X;
    public ComposerBarEditorActionBarContainerView A0Y;
    public 6PP A0Z;
    public ComposerBarLeftPrimaryButtonsView A0a;
    public 6Pc A0b;
    public 6Ri A0c;
    public 6SB A0d;
    public 6Re A0e;
    public 6FM A0f;
    public 6fA A0g;
    public 6PH A0h;
    public 6PH A0i;
    public 6Pi A0j;
    public 6S7 A0k;
    public 6SC A0l;
    public ThreadKey A0m;
    public C6kd A0n;
    public BetterEditTextView A0o;
    public Integer A0p;
    public Integer A0q;
    public Integer A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public List A0v;
    public Future A0w;
    public ScheduledExecutorService A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public View A1C;
    public FrameLayout A1D;
    public C00i A1E;
    public LithoView A1F;
    public 6Ox A1G;
    public final C00i A1H;
    public final C00i A1I;
    public final C00i A1J;
    public final C00i A1K;
    public final C00i A1L;
    public final C00i A1M;
    public final C00i A1N;
    public final C00i A1O;
    public final C00i A1P;
    public final 67O A1Q;
    public final 6Ow A1R;
    public final 6Ou A1S;
    public final C00i A1T;
    public final C00i A1U;
    public final C00i A1V;
    public final C00i A1W;
    public final 6Os A1X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLineComposerView(Context context) {
        super(context, null, 0);
        11T.A0F(context, 1);
        this.A1M = 1BQ.A02(67554);
        this.A1P = 1BQ.A02(17077);
        this.A1V = 1BQ.A02(84183);
        this.A1O = 1BQ.A02(68024);
        this.A1H = 1BQ.A02(66227);
        Context context2 = getContext();
        this.A1L = new 1BV(context2, 33230);
        this.A1J = new 1BV(context2, 68283);
        this.A1I = 1BQ.A02(66409);
        this.A1T = 1BV.A00(66478);
        this.A1U = 1BQ.A02(66351);
        this.A1K = 1BQ.A02(68550);
        this.A0y = false;
        this.A0z = true;
        this.A1W = 1BQ.A02(68025);
        this.A1N = 1BQ.A02(16922);
        this.A1X = (6Os) 1Bi.A03(84359);
        this.A0t = "text";
        this.A0f = 6FM.A04;
        this.A15 = true;
        this.A04 = 0;
        this.A11 = true;
        this.A12 = false;
        this.A0v = AnonymousClass001.A0s();
        this.A1B = false;
        this.A16 = false;
        this.A1S = new 6Ou(new 6Ot(this));
        this.A1Q = new 6Ov(this);
        this.A1R = new 6Ow(this);
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLineComposerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        11T.A0F(context, 1);
        this.A1M = new 1BQ(67554);
        this.A1P = new 1BQ(17077);
        this.A1V = new 1BQ(84183);
        this.A1O = new 1BQ(68024);
        this.A1H = new 1BQ(66227);
        Context context2 = getContext();
        this.A1L = new 1BV(context2, 33230);
        this.A1J = new 1BV(context2, 68283);
        this.A1I = new 1BQ(66409);
        this.A1T = new 1BV(66478);
        this.A1U = new 1BQ(66351);
        this.A1K = new 1BQ(68550);
        this.A0y = false;
        this.A0z = true;
        this.A1W = new 1BQ(68025);
        this.A1N = new 1BQ(16922);
        this.A1X = (6Os) 1Bi.A03(84359);
        this.A0t = "text";
        this.A0f = 6FM.A04;
        this.A15 = true;
        this.A04 = 0;
        this.A11 = true;
        this.A12 = false;
        this.A0v = new ArrayList();
        this.A1B = false;
        this.A16 = false;
        this.A1S = new 6Ou(new 6Ot(this));
        this.A1Q = new 6Ov(this);
        this.A1R = new 6Ow(this);
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneLineComposerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A1M = 1BQ.A02(67554);
        this.A1P = 1BQ.A02(17077);
        this.A1V = 1BQ.A02(84183);
        this.A1O = 1BQ.A02(68024);
        this.A1H = 1BQ.A02(66227);
        Context context2 = getContext();
        this.A1L = new 1BV(context2, 33230);
        this.A1J = new 1BV(context2, 68283);
        this.A1I = 1BQ.A02(66409);
        this.A1T = 1BV.A00(66478);
        this.A1U = 1BQ.A02(66351);
        this.A1K = 1BQ.A02(68550);
        this.A0y = false;
        this.A0z = true;
        this.A1W = 1BQ.A02(68025);
        this.A1N = 1BQ.A02(16922);
        this.A1X = (6Os) 1Bi.A03(84359);
        this.A0t = "text";
        this.A0f = 6FM.A04;
        this.A15 = true;
        this.A04 = 0;
        this.A11 = true;
        this.A12 = false;
        this.A0v = AnonymousClass001.A0s();
        this.A1B = false;
        this.A16 = false;
        this.A1S = new 6Ou(new 6Ot(this));
        this.A1Q = new 6Ov(this);
        this.A1R = new 6Ow(this);
        A04();
    }

    public static int A00(OneLineComposerView oneLineComposerView) {
        ThreadKey threadKey;
        if (oneLineComposerView.A0q == 0S2.A0u && (((threadKey = oneLineComposerView.A0m) == null || !threadKey.A0y()) && ((C6kf) oneLineComposerView.A1T.get()).A00())) {
            return oneLineComposerView.getContext().getResources().getDimensionPixelSize(2132279464);
        }
        if (oneLineComposerView.A0q != 0S2.A15) {
            return 0;
        }
        ThreadKey threadKey2 = oneLineComposerView.A0m;
        if (threadKey2 != null && threadKey2.A0y()) {
            return 0;
        }
        C00i c00i = oneLineComposerView.A1T;
        if (!((C6kf) c00i.get()).A00() || !1Br.A07(((C6kf) c00i.get()).A00).AZk(36323552035228319L)) {
            return 0;
        }
        Context context = oneLineComposerView.getContext();
        return context.getResources().getDimensionPixelSize(2132279387) + context.getResources().getDimensionPixelSize(R.dimen.mapbox_eight_dp) + context.getResources().getDimensionPixelSize(R.dimen.mapbox_four_dp);
    }

    public static int A01(OneLineComposerView oneLineComposerView) {
        if (oneLineComposerView.A0q == 0S2.A0u) {
            return 0;
        }
        return oneLineComposerView.A08.getWidth();
    }

    public static 6R4 A02(OneLineComposerView oneLineComposerView) {
        2S4 r0 = oneLineComposerView.A0C;
        r0.getClass();
        return (6R4) r0.A00(68179);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0 == X.0S2.A01) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean A03(com.facebook.messaging.composer.OneLineComposerView r301) {
        /*
            r0 = r301
            java.lang.Integer r0 = r0.A0q
            r301 = r0
            java.lang.Integer r0 = X.0S2.A00
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L1b
            java.lang.Integer r0 = X.0S2.A01
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L1d
        L1b:
            r0 = 1
            r304 = r0
        L1d:
            r0 = r304
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.OneLineComposerView.A03(com.facebook.messaging.composer.OneLineComposerView):java.lang.Boolean");
    }

    /* JADX WARN: Type inference failed for: r0v126, types: [com.facebook.widget.text.BetterEditTextView, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v156, types: [X.83q] */
    /* JADX WARN: Type inference failed for: r0v213, types: [X.Abc] */
    /* JADX WARN: Type inference failed for: r0v222, types: [X.Abe] */
    private void A04() {
        6PH r305;
        C00j.A05("OneLineComposerView.injectMe", 1303544857);
        try {
            this.A0K = new 1BV(68011);
            this.A0N = new 1BV(98321);
            this.A0J = new 1BV(66570);
            Context context = getContext();
            this.A0M = new 1BV(context, 68438);
            this.A0x = (ScheduledExecutorService) 1Bi.A03(16461);
            82O r0 = (82O) 1Bn.A0E(context, (1BY) null, 661);
            this.A0O = new 1BV(665);
            82O r02 = (82O) 1Bn.A0A(666);
            this.A1E = new 1BV(98449);
            this.A0H = new 1BV(67169);
            this.A0E = (82O) 1Bn.A0E(context, (1BY) null, 664);
            this.A1G = (6Ox) 1Bn.A0A(50088);
            this.A0G = new 1BV(116067);
            this.A0L = new 1BQ(16839);
            this.A0P = new 1BV(16671);
            this.A0F = new 1BQ(16458);
            this.A0D = (6Nq) 1Hv.A02(context, 68747);
            C00j.A01(1651320750);
            LayoutInflater.from(context).inflate(2132542888, this);
            this.A0Y = (ComposerBarEditorActionBarContainerView) requireViewById(2131363790);
            this.A0a = (ComposerBarLeftPrimaryButtonsView) requireViewById(2131363236);
            this.A07 = requireViewById(2131363791);
            this.A0V = (ComposerActionButton) requireViewById(2131363252);
            this.A0T = (ComposerActionButton) requireViewById(2131363241);
            this.A0U = this.A0Y.A09;
            this.A0W = (ComposerActionButton) requireViewById(2131363257);
            this.A08 = (ViewGroup) requireViewById(2131367295);
            this.A1C = requireViewById(2131367957);
            ComposerBarEditorActionBarContainerView composerBarEditorActionBarContainerView = this.A0Y;
            ?? r03 = composerBarEditorActionBarContainerView.A0D;
            this.A0o = r03;
            this.A1F = composerBarEditorActionBarContainerView.A06;
            this.A1D = composerBarEditorActionBarContainerView.A05;
            this.A0R = composerBarEditorActionBarContainerView.A07;
            this.A09 = composerBarEditorActionBarContainerView.A0C;
            this.A03 = r03.getInputType();
            FbFrameLayout fbFrameLayout = (FbFrameLayout) requireViewById(2131362303);
            FbImageView fbImageView = (FbImageView) requireViewById(2131362305);
            FbImageView fbImageView2 = (FbImageView) requireViewById(2131362304);
            2Wo A00 = 2Wo.A00((ViewStub) requireViewById(2131363106));
            ?? r04 = new Object() { // from class: X.83q
            };
            2Wo A002 = 2Wo.A00((ViewStub) requireViewById(2131361962));
            C00i c00i = this.A0O;
            c00i.getClass();
            this.A0i = ((82O) c00i.get()).A06(context, (C83q) r04, new 6PG(A00), "EXPRESSION");
            if (((C2ib) this.A1P.get()).A04()) {
                C00i c00i2 = this.A0O;
                c00i2.getClass();
                r305 = ((82O) c00i2.get()).A06(context, (C83q) r04, new 6PG(A002), "BUSINESS_TOOLS");
            } else {
                r305 = null;
            }
            this.A0h = r305;
            r0.getClass();
            ComposerBarEditorActionBarContainerView composerBarEditorActionBarContainerView2 = this.A0Y;
            6PO r05 = new 6PO(this);
            Context A01 = FbInjector.A01();
            FbInjector.A04(r0.B92().Aqm());
            1Bn.A0M(r0);
            try {
                6PP r06 = new 6PP(context, r0, composerBarEditorActionBarContainerView2, r05);
                1Bn.A0K();
                FbInjector.A04(A01);
                this.A0Z = r06;
                D7u();
                this.A0Z.A0R.A02.A02 = new C1235Abd(this);
                this.A0Y.A08.A04 = new Object() { // from class: X.Abc
                };
                C1F6 c1f6 = (C1F6) 1Bn.A0A(662);
                ComposerBarLeftPrimaryButtonsView composerBarLeftPrimaryButtonsView = this.A0a;
                ?? r07 = new Object() { // from class: X.Abe
                };
                Context A012 = FbInjector.A01();
                FbInjector.A04(c1f6.B92().Aqm());
                1Bn.A0M(c1f6);
                6Pc r08 = new 6Pc(composerBarLeftPrimaryButtonsView, (C1236Abe) r07);
                1Bn.A0K();
                FbInjector.A04(A012);
                this.A0b = r08;
                C1F6 c1f62 = (C1F6) 1Bn.A0A(660);
                6Ow r09 = this.A1R;
                A01 = FbInjector.A01();
                FbInjector.A04(c1f62.B92().Aqm());
                1Bn.A0M(c1f62);
                6Pd r010 = new 6Pd(r09, fbFrameLayout, fbImageView, fbImageView2);
                1Bn.A0K();
                FbInjector.A04(A01);
                this.A0X = r010;
                ComposerBarLeftPrimaryButtonsView composerBarLeftPrimaryButtonsView2 = this.A0a;
                ViewGroup.LayoutParams layoutParams = composerBarLeftPrimaryButtonsView2.getLayoutParams();
                Preconditions.checkNotNull(layoutParams, "layoutParams should not be null");
                layoutParams.width = getResources().getDimensionPixelSize(2132279326);
                composerBarLeftPrimaryButtonsView2.setLayoutParams(layoutParams);
                this.A04 = layoutParams.width;
                final 6Pe r011 = new 6Pe(this);
                A07(this.A0V, r011, 0S2.A03);
                A07(this.A0T, r011, 0S2.A1G);
                A07(this.A0W, r011, 0S2.A02);
                A07(this.A0U, r011, 0S2.A15);
                A07(fbFrameLayout, r011, 0S2.A07);
                final int i = 1;
                this.A0V.setOnKeyListener(new View.OnKeyListener(r011, i) { // from class: X.9q1
                    public final int A00;
                    public final Object A01;

                    {
                        this.A00 = i;
                        this.A01 = r011;
                    }

                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                        if (this.A00 != 0) {
                            OneLineComposerView oneLineComposerView = (OneLineComposerView) ((6Pe) this.A01).A00.get();
                            if (oneLineComposerView == null) {
                                return false;
                            }
                            Set set = OneLineComposerView.A1Z;
                            6Rb r012 = oneLineComposerView.A0S.A00.A0F;
                            if (r012 != null) {
                                return r012.A08(view, i2, keyEvent);
                            }
                            return false;
                        }
                        6QS r013 = (6QS) this.A01;
                        11T.A0F(keyEvent, 0);
                        6QS.A0P(r013, new A5o(keyEvent));
                        boolean A1N = AnonymousClass001.A1N(keyEvent.getFlags() & 2);
                        if (i2 != 66 || keyEvent.isShiftPressed() || A1N) {
                            return false;
                        }
                        6QS.A0H(r013);
                        return true;
                    }
                });
                6PS.A00(this.A0Z.A0R).A03.add(new 6Pf(this));
                2Wo A003 = 2Wo.A00((ViewStub) C09s.A01(this, 2131363238));
                r02.getClass();
                FbFrameLayout fbFrameLayout2 = (FbFrameLayout) A003.A01();
                6Ph r012 = new 6Ph(this);
                Context A013 = FbInjector.A01();
                FbInjector.A04(r02.B92().Aqm());
                1Bn.A0M(r02);
                try {
                    6Pi r013 = new 6Pi(context, r012, fbFrameLayout2);
                    1Bn.A0K();
                    FbInjector.A04(A013);
                    this.A0j = r013;
                    A0G(this, "text");
                    A0E(this);
                    Cn6(0S2.A0C);
                    this.A0Z.A06();
                    C00i c00i3 = this.A0K;
                    c00i3.getClass();
                    if (((C60j) c00i3.get()).A00()) {
                        2Wo A004 = 2Wo.A00((ViewStub) requireViewById(2131365648));
                        C00i c00i4 = this.A0K;
                        c00i4.getClass();
                        if (((C60j) c00i4.get()).A00()) {
                            82O r014 = this.A0E;
                            r014.getClass();
                            A013 = FbInjector.A01();
                            FbInjector.A04(r014.B92().Aqm());
                            1Bn.A0M(r014);
                            6Re r015 = new 6Re(r014, A004);
                            1Bn.A0K();
                            FbInjector.A04(A013);
                            this.A0e = r015;
                            r015.A00 = this.A00;
                        }
                    }
                    this.A0Q = new 6Rh(this);
                    ComposerActionButton composerActionButton = this.A0W;
                    C00i c00i5 = this.A0L;
                    c00i5.getClass();
                    composerActionButton.setImageResource(((C1u2) c00i5.get()).A04(C1u3.A5k, C1u4.SIZE_32));
                    A06(null, this, null);
                    this.A0I = new 1BV(115924);
                    6Ou r016 = this.A1S;
                    ((C2j0) r016.A00.A00.get()).A02(r016);
                    this.A1D.setVisibility(8);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            C00j.A01(642769177);
            throw th;
        }
    }

    private void A05() {
        6PP r0 = this.A0Z;
        boolean z = this.A13;
        int i = this.A04;
        int i2 = 0;
        int i3 = 0;
        if (z) {
            i3 = i;
        }
        ComposerBarEditorActionBarContainerView composerBarEditorActionBarContainerView = r0.A0P;
        composerBarEditorActionBarContainerView.A01 = i3;
        if (r0.A09 == 0S2.A01) {
            r0.A04();
        }
        if (z) {
            i2 = -i;
        }
        composerBarEditorActionBarContainerView.A00 = i2;
    }

    public static void A06(Drawable drawable, OneLineComposerView oneLineComposerView, String str) {
        ComposerActionButton composerActionButton;
        int i;
        oneLineComposerView.A06 = drawable;
        if (drawable == null) {
            ComposerActionButton composerActionButton2 = oneLineComposerView.A0V;
            C00i c00i = oneLineComposerView.A0L;
            c00i.getClass();
            composerActionButton2.setImageResource(((C1u2) c00i.get()).A04(C1u3.A42, C1u4.SIZE_32));
            composerActionButton = oneLineComposerView.A0V;
            i = oneLineComposerView.A00;
        } else {
            A0C(oneLineComposerView);
            oneLineComposerView.A0V.setImageDrawable(drawable);
            composerActionButton = oneLineComposerView.A0V;
            i = 0;
        }
        composerActionButton.A00(i, i);
        ComposerActionButton composerActionButton3 = oneLineComposerView.A0V;
        if (str == null) {
            str = oneLineComposerView.getResources().getString(2131954669);
        }
        composerActionButton3.setContentDescription(str);
    }

    public static void A07(View view, 6Pe r302, Integer num) {
        view.setOnClickListener(new CYl(r302, num, 7));
        view.setOnTouchListener(new IKd(num, r302, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0484, code lost:
    
        if (X.6SC.A01(r0).A03.size() != 0) goto L118;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0020. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.6Sh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A08(android.view.View r301, final com.facebook.messaging.composer.OneLineComposerView r302, java.lang.Integer r303) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.OneLineComposerView.A08(android.view.View, com.facebook.messaging.composer.OneLineComposerView, java.lang.Integer):void");
    }

    public static void A09(BOj bOj, OneLineComposerView oneLineComposerView, List list, boolean z) {
        ((C77c) oneLineComposerView.A1J.get()).A0H(oneLineComposerView.A0A, bOj, oneLineComposerView.A0m, new 6Pa(oneLineComposerView, list, z), new 6Pb(oneLineComposerView));
    }

    public static void A0A(67O r301, OneLineComposerView oneLineComposerView) {
        C00i c00i = oneLineComposerView.A1N;
        if (((2BQ) c00i.get()).A04(1BJ.A00(48))) {
            if (4YU.A0d(c00i).A05("upload_audio_interstitial")) {
                ((F94) 4YU.A0p(oneLineComposerView.A1E)).A00(oneLineComposerView.getContext(), r301, null, "upload_audio_interstitial");
                return;
            } else {
                r301.BqY((Object) null);
                return;
            }
        }
        FbUserSession fbUserSession = oneLineComposerView.A0B;
        if (fbUserSession != null) {
            ((6Sp) 1Lo.A04(oneLineComposerView.getContext(), fbUserSession, (1BY) null, 50103)).A02(oneLineComposerView.A0A, r301, oneLineComposerView.A0m, (Object) null, "upload_audio_interstitial");
        }
    }

    public static void A0B(OneLineComposerView oneLineComposerView) {
        if (!oneLineComposerView.A0Z.A0R.A02.hasFocus()) {
            oneLineComposerView.A0Z.A0R.A02.requestFocus();
        } else if ("text".equals(oneLineComposerView.A0t)) {
            oneLineComposerView.A0S.A01();
        }
        if (oneLineComposerView.A18) {
            6PS r0 = oneLineComposerView.A0Z.A0R;
            r0.A02.postDelayed(new ACu(r0), 100);
            oneLineComposerView.A18 = false;
        } else {
            6Nq r02 = oneLineComposerView.A0D;
            r02.getClass();
            if (((6Nr) r02).A04) {
                return;
            }
            6PS r03 = oneLineComposerView.A0Z.A0R;
            ((InputMethodManager) r03.A00.A00.get()).showSoftInput(r03.A02, 0);
        }
    }

    public static void A0C(OneLineComposerView oneLineComposerView) {
        Drawable drawable;
        5Gh r0 = oneLineComposerView.A06;
        if (r0 instanceof 5OF) {
            5Gh r02 = r0;
            if (r02.A04() || (drawable = oneLineComposerView.getResources().getDrawable(((C1u2) 4YU.A0p(oneLineComposerView.A0L)).A03(C1u3.A42))) == null) {
                return;
            }
            drawable.setColorFilter(new PorterDuffColorFilter(oneLineComposerView.A00, PorterDuff.Mode.SRC_IN));
            r02.A02(drawable);
        }
    }

    public static void A0D(OneLineComposerView oneLineComposerView) {
        Integer valueOf;
        ComposerActionButton composerActionButton = oneLineComposerView.A0a.A03;
        MigColorScheme migColorScheme = ((6fD) 4YU.A0p(oneLineComposerView.A0H)).A00;
        ImmutableList of = (migColorScheme == null || (valueOf = Integer.valueOf(migColorScheme.B4i())) == null) ? ImmutableList.of() : ImmutableList.copyOf((Collection) new 1rP(new ABb(oneLineComposerView, valueOf, 0), A02(oneLineComposerView).A00()));
        if (of.size() > 0) {
            ((6fD) 4YU.A0p(oneLineComposerView.A0H)).A00(oneLineComposerView.getContext(), composerActionButton, new IL9(oneLineComposerView, 1), oneLineComposerView.A0m, of, oneLineComposerView.getResources().getDimensionPixelSize(2132279457));
            oneLineComposerView.A0b.A01(true);
            if (6PV.A00((6PV) 4YU.A0p(oneLineComposerView.A0G)).AZk(36315473202783189L)) {
                A02(oneLineComposerView).A01();
            }
        }
    }

    public static void A0E(OneLineComposerView oneLineComposerView) {
        6Pc r0 = oneLineComposerView.A0b;
        boolean z = oneLineComposerView.A13;
        if (z != r0.A04) {
            r0.A04 = z;
            6Pc.A00(r0, r0.A02);
        }
        if (oneLineComposerView.A13) {
            oneLineComposerView.A0S.A00.A09.A08("more_drawer");
        }
        oneLineComposerView.A05();
    }

    public static void A0F(OneLineComposerView oneLineComposerView, int i, int i2) {
        int intValue;
        Integer num = oneLineComposerView.A0q;
        if (num == null || ((intValue = num.intValue()) == 0 || intValue == 3 || intValue == 2 || intValue == 4 ? oneLineComposerView.A0Z.A0R.A08() && oneLineComposerView.A0v.isEmpty() : !(intValue == 6 || intValue == 7 || (intValue == 8 && (!oneLineComposerView.A0Z.A0R.A08()))))) {
            oneLineComposerView.A0W.A00(i2, i2);
        } else {
            oneLineComposerView.A0W.A00(i, i);
        }
    }

    public static void A0G(OneLineComposerView oneLineComposerView, String str) {
        oneLineComposerView.A0t = str;
        ComposerActionButton composerActionButton = oneLineComposerView.A0U;
        boolean equals = "expression".equals(str);
        composerActionButton.setSelected(equals);
        oneLineComposerView.A1G.getClass();
        int i = (equals || "expression_search".equals(str) || "text".equals(str)) ? oneLineComposerView.A00 : oneLineComposerView.A01;
        ComposerActionButton composerActionButton2 = oneLineComposerView.A0U;
        if (composerActionButton2.A00 != 0) {
            composerActionButton2.A00(i, oneLineComposerView.A00);
        }
        oneLineComposerView.A0b.A03(str);
        ComposerActionBar composerActionBar = oneLineComposerView.A0Y.A08;
        composerActionBar.A06 = str;
        ComposerActionBar.A01(composerActionBar);
    }

    private void A0H(ThreadKey threadKey) {
        UserKey userKey;
        if (threadKey == null) {
            userKey = null;
        } else {
            userKey = new UserKey(1Js.A03, String.valueOf(threadKey.A02));
        }
        FbUserSession A04 = ((1Fv) this.A1U.get()).A04();
        11T.A0F(A04, 0);
        ((23F) 1Lo.A04((Context) null, A04, (1BY) null, 33102)).A00(userKey);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.6Sh, java.lang.Object] */
    public static boolean A0I(MotionEvent motionEvent, View view, OneLineComposerView oneLineComposerView, Integer num) {
        Integer num2;
        5II r307;
        String str;
        int intValue = num.intValue();
        if (intValue == 4) {
            if (oneLineComposerView.A0q == 0S2.A0C) {
                if (oneLineComposerView.A0f != 6FM.A03) {
                    num2 = 0S2.A0N;
                }
                num2 = 0S2.A00;
            }
            6QS r0 = oneLineComposerView.A0S.A00;
            6QS.A0P(r0, (6Sh) new Object());
            r0.A09.A07();
            return false;
        }
        if (intValue == 3) {
            if (oneLineComposerView.A0q == 0S2.A0C) {
                if (oneLineComposerView.A0f != 6FM.A03) {
                    num2 = 0S2.A0Y;
                }
                num2 = 0S2.A00;
            }
            6QS r02 = oneLineComposerView.A0S.A00;
            6QS.A0P(r02, (6Sh) new Object());
            r02.A09.A07();
            return false;
        }
        if (intValue == 11) {
            6QS r03 = oneLineComposerView.A0S.A00;
            6Rb r04 = r03.A0F;
            if (r04 == null || r03.A0c) {
                return false;
            }
            r04.A09(view, motionEvent);
            return false;
        }
        if (intValue != 2) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r307 = (5II) oneLineComposerView.A1W.get();
            str = "ephemeral_button_event_down";
        } else {
            if (actionMasked != 1) {
                return false;
            }
            r307 = (5II) oneLineComposerView.A1W.get();
            str = "ephemeral_button_event_release";
        }
        r307.A0A(str);
        return false;
        oneLineComposerView.Cn6(num2);
        ((5II) oneLineComposerView.A1W.get()).A0A("composer_tab_selected");
        6QS r022 = oneLineComposerView.A0S.A00;
        6QS.A0P(r022, (6Sh) new Object());
        r022.A09.A07();
        return false;
    }

    public static boolean A0J(OneLineComposerView oneLineComposerView) {
        List list;
        6PZ r0 = (6PZ) 1Lo.A04(oneLineComposerView.getContext(), ((1Fv) oneLineComposerView.A1U.get()).A04(), (1BY) null, 68152);
        ThreadKey threadKey = oneLineComposerView.A0m;
        boolean z = false;
        if (1qI.A02((1qI) r0.A01.A00.get()).AZk(36322796123932519L) && threadKey != null && (list = (List) r0.A02.get(String.valueOf(threadKey.A0r()))) != null && (!list.isEmpty())) {
            z = true;
        }
        return z;
    }

    @Override // X.C7yt
    public void ANb() {
        6Sm A00;
        6Ri r0 = this.A0c;
        if (r0 == null || (A00 = 6Rj.A00(r0.A04)) == null || !A00.A0J) {
            return;
        }
        A00.A07(true);
    }

    @Override // X.C7yt
    public ImmutableList Awa() {
        int i;
        int length;
        6SC r0 = this.A0l;
        if (r0 == null) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        String str = r0.A06.A01().A00;
        str.getClass();
        int i2 = 0;
        while (true) {
            i = i2;
            length = str.length();
            if (i >= length) {
                i = length;
                break;
            }
            if (str.charAt(i) != ' ') {
                break;
            }
            i2 = i + 1;
        }
        C7qw[] c7qwArr = (C7qw[]) r0.A06.A0A(0, length, C7qw.class);
        int length2 = c7qwArr.length;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length2) {
                return builder.build();
            }
            C7qw c7qw = c7qwArr[i4];
            6PS r02 = r0.A06;
            11T.A0F(c7qw, 0);
            Editable text = r02.A02.getText();
            11T.A0A(text);
            int spanStart = text.getSpanStart(c7qw);
            String str2 = c7qw.A01;
            int max = Math.max(0, spanStart - i);
            Editable text2 = r0.A06.A02.getText();
            11T.A0A(text2);
            builder.m11011add((Object) new ProfileRange(c7qw.A00, str2, max, text2.getSpanEnd(c7qw) - spanStart));
            i3 = i4 + 1;
        }
    }

    @Override // X.C7yt
    public void BNx() {
        2Wo r0 = this.A0i.A0A.A00;
        if (r0.A05()) {
            r0.A02();
        }
        6PH r02 = this.A0h;
        if (r02 != null) {
            2Wo r03 = r02.A0A.A00;
            if (r03.A05()) {
                r03.A02();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x03b2, code lost:
    
        if (r0 == X.0S2.A0j) goto L56;
     */
    @Override // X.C7yt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Cn6(java.lang.Integer r302) {
        /*
            Method dump skipped, instructions count: 1325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.OneLineComposerView.Cn6(java.lang.Integer):void");
    }

    @Override // X.C7yt
    public void CrB(List list) {
        ImmutableList Awa;
        this.A0v = list;
        if (list.isEmpty()) {
            this.A1D.setVisibility(8);
            this.A0R.setVisibility(8);
            this.A0Z.A07();
        } else {
            this.A1F.A0y(new 8YO(9EB.A00(list), new C7wm(this, 1), new C7wm(this, 0)));
            this.A1D.setVisibility(0);
            LithoView lithoView = this.A0R;
            List list2 = this.A0v;
            AHk aHk = new AHk(this, 4);
            11T.A0F(list2, 0);
            lithoView.A0y(new 8WO(9EB.A00(list2), aHk));
            LinearLayout linearLayout = this.A09;
            if (linearLayout != null) {
                linearLayout.addOnLayoutChangeListener(new IKL(this, 0));
            }
        }
        if (this.A0v.isEmpty() || (Awa = Awa()) == null) {
            return;
        }
        int size = Awa.size();
        for (int i = 0; i < size; i++) {
            int intValue = 7mD.A00(((ProfileRange) Awa.get(i)).type).intValue();
            if (intValue == 5 || intValue == 6 || intValue == 9) {
                ((C77c) this.A1J.get()).A0E(getContext(), C09s.A01(this, 2131363258), 0);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [int] */
    /* JADX WARN: Type inference failed for: r0v84, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // X.C7yt
    public void CzQ() {
        String str;
        boolean A1W = AnonymousClass001.A1W(this.A0q, 0S2.A0Y);
        6PH r0 = this.A0i;
        6PK r02 = r0.A05;
        String str2 = r0.A0B;
        String str3 = r0.A07;
        6PJ r03 = r02.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r04 = r03.A05;
        r04.A08("com.facebook.messaging.composer.plugins.interfaces.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", "messaging.composer.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", "getOptionForButtonPress", andIncrement);
        try {
            6PJ.A00(r03);
            boolean equals = str2.equals("EXPRESSION");
            try {
                try {
                    if (equals && 6PJ.A01(r03)) {
                        equals = atomicInteger.getAndIncrement();
                        str = "messaging.composer.combinedexpression.buttons.composertabbedextensions.CombinedExpressionTabbedExtensionSetConfig";
                        r04.A0A("com.facebook.messaging.composer.combinedexpression.plugins.buttons.composertabbedextensions.CombinedExpressionTabbedExtensionSetConfig", str, "com.facebook.messaging.composer.plugins.interfaces.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", equals ? 1 : 0, "messaging.composer.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", "com.facebook.messaging.composer.combinedexpression.plugins.buttons.ComposerCombinedexpressionButtonsKillSwitch", "getOptionForButtonPress");
                        CombinedExpressionTabbedExtensionSetConfig combinedExpressionTabbedExtensionSetConfig = r03.A00;
                        11T.A0F(str3, 0);
                        1BY r05 = combinedExpressionTabbedExtensionSetConfig.A00.A00;
                        1Br A03 = 1Lm.A03(1Fw.A06(1Bn.A0E((Context) null, r05, 16428)), r05, 68177);
                        if (A1W) {
                            str3 = 6PV.A00((6PV) ((C6gy) 1Br.A0B(combinedExpressionTabbedExtensionSetConfig.A01)).A00.get()).AZk(36315473201472459L) ? "STICKERS" : C6h0.A00(C6gz.A01.A00());
                        } else if (((C9hh) 1Br.A0B(A03)).A01()) {
                            str3 = C6h0.A00(C6gz.A01.A00());
                        }
                    } else {
                        if (!str2.equals("BUSINESS_TOOLS") || !6PJ.A02(r03)) {
                            r04.A02((Exception) null, "messaging.composer.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", "getOptionForButtonPress", andIncrement);
                            str3 = null;
                            r0.A03(str3);
                            if (!A03(this).booleanValue() || this.A0Z.A0R.A09()) {
                                Cn6(0S2.A0C);
                            }
                            return;
                        }
                        equals = atomicInteger.getAndIncrement();
                        str = "messaging.nativepagereply.businesstools.composertabbedextensions.BusinessToolsTabbedExtensionSetConfig";
                        r04.A0A("com.facebook.messaging.nativepagereply.plugins.businesstools.composertabbedextensions.BusinessToolsTabbedExtensionSetConfig", str, "com.facebook.messaging.composer.plugins.interfaces.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", equals ? 1 : 0, "messaging.composer.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.businesstools.BusinessToolsKillSwitch", "getOptionForButtonPress");
                        str3 = ((C2ib) 1Bi.A03(17077)).A0C() ? "SAVED_REPLIES" : "CATALOG";
                    }
                    r04.A09(str, "messaging.composer.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", "getOptionForButtonPress", equals ? 1 : 0);
                    r04.A02((Exception) null, "messaging.composer.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", "getOptionForButtonPress", andIncrement);
                    r0.A03(str3);
                    if (A03(this).booleanValue()) {
                    }
                    Cn6(0S2.A0C);
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                r04.A04((Exception) null, str, "messaging.composer.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", "getOptionForButtonPress", equals);
            }
        } catch (Throwable th) {
            r04.A02((Exception) null, "messaging.composer.tabbedextensions.ComposerTabbedExtensionSetConfigInterfaceSpec", "getOptionForButtonPress", andIncrement);
            throw th;
        }
    }

    @Override // X.C7yt
    public void Czb(C6g3 c6g3) {
        C66i c66i;
        double d;
        6PP r0 = this.A0Z;
        if (r0.A0C || !((2yD) r0.A0L.get()).AZk(2342157636306280528L)) {
            r0.A0P.A09.setVisibility(8);
            return;
        }
        if (c6g3.equals(r0.A06)) {
            return;
        }
        boolean z = false;
        if (r0.A06 != null) {
            z = true;
        }
        r0.A06 = c6g3;
        if (!z) {
            6PP.A01(r0);
            return;
        }
        ComposerActionButton composerActionButton = r0.A0P.A09;
        if (r0.A00 == 0) {
            r0.A00 = composerActionButton.getHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) composerActionButton.getLayoutParams();
            r0.A01 = marginLayoutParams != null ? marginLayoutParams.rightMargin : 0;
        }
        C66i c66i2 = r0.A08;
        int max = c66i2 != null ? (int) Math.max(c66i2.A01, c66i2.A03) : composerActionButton.getHeight();
        C66i c66i3 = r0.A08;
        if (c66i3 != null) {
            c66i3.A01();
        }
        if (((2yD) ((6P0) r0.A0J.get()).A00.A00.get()).AZk(36320652931972700L) && composerActionButton.getHeight() == 0) {
            c66i = new C66i((C62j) r0.A0M.get());
            c66i.A09(6PP.A0c);
            c66i.A06 = true;
            c66i.A0A(new 67E((ViewGroup.MarginLayoutParams) composerActionButton.getLayoutParams(), composerActionButton, max, r0.A01));
            r0.A08 = c66i;
            c66i.A06(r0.A00);
            d = r0.A00;
        } else {
            c66i = new C66i((C62j) r0.A0M.get());
            c66i.A09(6PP.A0c);
            c66i.A06 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) composerActionButton.getLayoutParams();
            c66i.A0A(new 67F(marginLayoutParams2, composerActionButton, r0, max, marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0));
            r0.A08 = c66i;
            c66i.A06(max);
            d = 0.0d;
        }
        c66i.A07(d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0097, code lost:
    
        if (A0J(r301) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029e A[Catch: all -> 0x036c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x036c, blocks: (B:3:0x000d, B:4:0x0012, B:5:0x0017, B:8:0x0020, B:11:0x0029, B:12:0x002f, B:13:0x0034, B:16:0x0055, B:17:0x005a, B:19:0x0060, B:20:0x0066, B:21:0x006b, B:23:0x0071, B:24:0x0076, B:27:0x007f, B:31:0x009d, B:34:0x00a6, B:35:0x00ab, B:39:0x00e7, B:40:0x00ec, B:43:0x00f5, B:44:0x00fa, B:47:0x0105, B:50:0x010e, B:51:0x0113, B:52:0x011a, B:54:0x0123, B:57:0x012c, B:60:0x0135, B:61:0x013a, B:64:0x0143, B:65:0x0148, B:68:0x0151, B:69:0x0156, B:70:0x015d, B:71:0x0162, B:73:0x0168, B:76:0x0174, B:77:0x0179, B:79:0x017f, B:80:0x0185, B:81:0x018a, B:84:0x0193, B:86:0x0199, B:87:0x019e, B:89:0x01a3, B:95:0x01bd, B:96:0x01c2, B:105:0x01de, B:106:0x0200, B:107:0x0206, B:109:0x020d, B:114:0x0225, B:116:0x022a, B:117:0x022f, B:119:0x0236, B:124:0x024b, B:126:0x0250, B:127:0x0255, B:129:0x025c, B:134:0x0271, B:136:0x0276, B:137:0x027a, B:139:0x0280, B:144:0x028e, B:146:0x0294, B:149:0x029e, B:152:0x02a7, B:153:0x02ac, B:154:0x02b1, B:157:0x02e4, B:158:0x02e9, B:162:0x02c9, B:163:0x02cd, B:166:0x02d6, B:168:0x02dd, B:172:0x032a, B:173:0x032f, B:176:0x0338, B:177:0x033e, B:178:0x0343, B:181:0x034e, B:183:0x0356, B:184:0x035d, B:185:0x02f2, B:190:0x0302, B:191:0x0307, B:192:0x030c, B:195:0x0315, B:198:0x0320, B:201:0x02c4, B:202:0x02ba, B:206:0x01eb, B:207:0x01fb, B:211:0x00c7, B:213:0x00ce, B:218:0x008b, B:223:0x01f3), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d6 A[Catch: all -> 0x036c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x036c, blocks: (B:3:0x000d, B:4:0x0012, B:5:0x0017, B:8:0x0020, B:11:0x0029, B:12:0x002f, B:13:0x0034, B:16:0x0055, B:17:0x005a, B:19:0x0060, B:20:0x0066, B:21:0x006b, B:23:0x0071, B:24:0x0076, B:27:0x007f, B:31:0x009d, B:34:0x00a6, B:35:0x00ab, B:39:0x00e7, B:40:0x00ec, B:43:0x00f5, B:44:0x00fa, B:47:0x0105, B:50:0x010e, B:51:0x0113, B:52:0x011a, B:54:0x0123, B:57:0x012c, B:60:0x0135, B:61:0x013a, B:64:0x0143, B:65:0x0148, B:68:0x0151, B:69:0x0156, B:70:0x015d, B:71:0x0162, B:73:0x0168, B:76:0x0174, B:77:0x0179, B:79:0x017f, B:80:0x0185, B:81:0x018a, B:84:0x0193, B:86:0x0199, B:87:0x019e, B:89:0x01a3, B:95:0x01bd, B:96:0x01c2, B:105:0x01de, B:106:0x0200, B:107:0x0206, B:109:0x020d, B:114:0x0225, B:116:0x022a, B:117:0x022f, B:119:0x0236, B:124:0x024b, B:126:0x0250, B:127:0x0255, B:129:0x025c, B:134:0x0271, B:136:0x0276, B:137:0x027a, B:139:0x0280, B:144:0x028e, B:146:0x0294, B:149:0x029e, B:152:0x02a7, B:153:0x02ac, B:154:0x02b1, B:157:0x02e4, B:158:0x02e9, B:162:0x02c9, B:163:0x02cd, B:166:0x02d6, B:168:0x02dd, B:172:0x032a, B:173:0x032f, B:176:0x0338, B:177:0x033e, B:178:0x0343, B:181:0x034e, B:183:0x0356, B:184:0x035d, B:185:0x02f2, B:190:0x0302, B:191:0x0307, B:192:0x030c, B:195:0x0315, B:198:0x0320, B:201:0x02c4, B:202:0x02ba, B:206:0x01eb, B:207:0x01fb, B:211:0x00c7, B:213:0x00ce, B:218:0x008b, B:223:0x01f3), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032a A[Catch: all -> 0x036c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x036c, blocks: (B:3:0x000d, B:4:0x0012, B:5:0x0017, B:8:0x0020, B:11:0x0029, B:12:0x002f, B:13:0x0034, B:16:0x0055, B:17:0x005a, B:19:0x0060, B:20:0x0066, B:21:0x006b, B:23:0x0071, B:24:0x0076, B:27:0x007f, B:31:0x009d, B:34:0x00a6, B:35:0x00ab, B:39:0x00e7, B:40:0x00ec, B:43:0x00f5, B:44:0x00fa, B:47:0x0105, B:50:0x010e, B:51:0x0113, B:52:0x011a, B:54:0x0123, B:57:0x012c, B:60:0x0135, B:61:0x013a, B:64:0x0143, B:65:0x0148, B:68:0x0151, B:69:0x0156, B:70:0x015d, B:71:0x0162, B:73:0x0168, B:76:0x0174, B:77:0x0179, B:79:0x017f, B:80:0x0185, B:81:0x018a, B:84:0x0193, B:86:0x0199, B:87:0x019e, B:89:0x01a3, B:95:0x01bd, B:96:0x01c2, B:105:0x01de, B:106:0x0200, B:107:0x0206, B:109:0x020d, B:114:0x0225, B:116:0x022a, B:117:0x022f, B:119:0x0236, B:124:0x024b, B:126:0x0250, B:127:0x0255, B:129:0x025c, B:134:0x0271, B:136:0x0276, B:137:0x027a, B:139:0x0280, B:144:0x028e, B:146:0x0294, B:149:0x029e, B:152:0x02a7, B:153:0x02ac, B:154:0x02b1, B:157:0x02e4, B:158:0x02e9, B:162:0x02c9, B:163:0x02cd, B:166:0x02d6, B:168:0x02dd, B:172:0x032a, B:173:0x032f, B:176:0x0338, B:177:0x033e, B:178:0x0343, B:181:0x034e, B:183:0x0356, B:184:0x035d, B:185:0x02f2, B:190:0x0302, B:191:0x0307, B:192:0x030c, B:195:0x0315, B:198:0x0320, B:201:0x02c4, B:202:0x02ba, B:206:0x01eb, B:207:0x01fb, B:211:0x00c7, B:213:0x00ce, B:218:0x008b, B:223:0x01f3), top: B:2:0x000d }] */
    @Override // X.C7yt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D7u() {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.OneLineComposerView.D7u():void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof 6Oy;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        ((6Oy) marginLayoutParams).A00 = 1;
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return generateDefaultLayoutParams();
        }
        Context context = getContext();
        11T.A0A(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        ((6Oy) marginLayoutParams).A00 = 1;
        int[] iArr = C1oo.A2C;
        11T.A0B(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        ((6Oy) marginLayoutParams).A00 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        ((6Oy) marginLayoutParams).A00 = 1;
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= childCount) {
                return;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                11T.A0I(layoutParams, "null cannot be cast to non-null type com.facebook.messaging.composer.layout.PrioritizedVerticalLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i7 = marginLayoutParams.leftMargin + paddingLeft;
                int i8 = marginLayoutParams.topMargin + paddingTop;
                int measuredHeight = childAt.getMeasuredHeight();
                childAt.layout(i7, i8, childAt.getMeasuredWidth() + i7, i8 + measuredHeight);
                paddingTop += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i5 = i6 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d5, code lost:
    
        if (r301.A19 != false) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.OneLineComposerView.onMeasure(int, int):void");
    }
}
