package com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment;

import X.0CU;
import X.0D2;
import X.0FI;
import X.0Gm;
import X.0Pz;
import X.0Q8;
import X.0QD;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1EH;
import X.1G9;
import X.1GS;
import X.1Iw;
import X.1JF;
import X.1LH;
import X.1LI;
import X.1Lo;
import X.1Ql;
import X.1tJ;
import X.2K3;
import X.2KD;
import X.2KQ;
import X.2Ov;
import X.2Zo;
import X.2Zy;
import X.2aI;
import X.2aK;
import X.2qQ;
import X.2qR;
import X.4YT;
import X.4YU;
import X.53P;
import X.5P5;
import X.66V;
import X.6NA;
import X.6tM;
import X.6zN;
import X.77G;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.7zU;
import X.7zV;
import X.8HG;
import X.8Z3;
import X.8hB;
import X.91V;
import X.98D;
import X.9I6;
import X.9WG;
import X.9ZZ;
import X.9fT;
import X.9kV;
import X.9pI;
import X.A1Y;
import X.A3Q;
import X.A81;
import X.A82;
import X.ACz;
import X.AD0;
import X.AEh;
import X.AEi;
import X.AEj;
import X.AR6;
import X.AV4;
import X.AnonymousClass001;
import X.C00i;
import X.C07y;
import X.C0s8;
import X.C13m;
import X.C1u2;
import X.C1u3;
import X.C1u4;
import X.C1u7;
import X.C26z;
import X.C2a2;
import X.C2aj;
import X.C2cp;
import X.C2cq;
import X.C2yk;
import X.C5bb;
import X.C5ic;
import X.C62j;
import X.C66h;
import X.C66i;
import X.C8d6;
import X.C97m;
import X.C9I7;
import X.C9oG;
import X.C9pd;
import X.C9py;
import X.CHy;
import X.CfG;
import X.DLP;
import X.DR6;
import X.InterfaceC00713oe;
import X.LKk;
import X.QG7;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RuntimeShader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.customthreads.themepreview.ThemePreviewFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.resources.ui.FbImageButton;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.ui.edittext.AnimatedHintsTextLayout;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: GeneratedThemeCreationFragment.class */
public final class GeneratedThemeCreationFragment extends 2Ov {
    public int A00;
    public int A01;
    public RuntimeShader A02;
    public EditText A03;
    public FbUserSession A04;
    public CfG A05;
    public LithoView A06;
    public LithoView A07;
    public LithoView A08;
    public InterfaceC00713oe A09;
    public InterfaceC00713oe A0A;
    public 8HG A0B;
    public ThreadKey A0C;
    public CHy A0D;
    public FbImageButton A0E;
    public FbImageButton A0F;
    public FbLinearLayout A0G;
    public FbLinearLayout A0H;
    public FbLinearLayout A0I;
    public FbLinearLayout A0J;
    public C66i A0K;
    public AnimatedHintsTextLayout A0L;
    public 9ZZ A0M;
    public ListenableFuture A0N;
    public Float A0O;
    public Integer A0P;
    public ScheduledFuture A0Q;
    public 2aI A0R;
    public C2a2 A0S;
    public boolean A0T;
    public C1u3 A0U;
    public 1LI A0V;
    public DLP A0W;
    public ThreadThemeInfo A0X;
    public Boolean A0Y;
    public Boolean A0Z;
    public final 1Br A0a;
    public final 1Br A0b;
    public final 1Br A0c;
    public final 1Br A0d;
    public final 1Br A0e;
    public final 1Br A0f;
    public final 1Br A0g;
    public final 1Br A0h;
    public final 1Br A0i;
    public final 66V A0j;
    public final List A0k;
    public final 1Br A0l;
    public final C5ic A0m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.66V] */
    public GeneratedThemeCreationFragment() {
        Boolean A0d = 1BK.A0d();
        this.A0Z = A0d;
        this.A0Y = A0d;
        this.A0h = 1Bu.A00(49939);
        this.A0P = 0S2.A00;
        this.A0g = 7zM.A0U();
        this.A0j = new Object();
        this.A0k = AnonymousClass001.A0s();
        this.A0a = 1Bu.A00(67789);
        this.A0b = 7zN.A0I(this);
        this.A0m = 7zQ.A0l();
        this.A0i = 1Bq.A00(16461);
        this.A0c = 1Bu.A02(this, 68190);
        this.A0l = 1Bq.A00(66663);
        this.A0f = 1Bq.A00(16504);
        this.A01 = C07y.A01.A05(4);
        this.A0e = 1Bu.A02(this, 68187);
        this.A0d = 1Bq.A00(68183);
    }

    public static final 77G A05(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        return (77G) 1Br.A0B(generatedThemeCreationFragment.A0l);
    }

    public static final String A06(GeneratedThemeCreationFragment generatedThemeCreationFragment, String str) {
        if (str.length() != 0 && !0CU.A0O(str)) {
            CharSequence A03 = 1JF.A03(str, true);
            11T.A0D(A03);
            String A0u = 7zO.A0u(A03, 0, 1);
            Locale A05 = ((1GS) 1Br.A0B(generatedThemeCreationFragment.A0f)).A05();
            11T.A0A(A05);
            String upperCase = A0u.toUpperCase(A05);
            11T.A0A(upperCase);
            str = 0Pz.A0W(upperCase, 7zO.A0u(A03, 1, A03.length()));
        }
        return str;
    }

    private final void A07() {
        FbLinearLayout fbLinearLayout = this.A0G;
        if (fbLinearLayout != null) {
            if (A05(this).A02()) {
                fbLinearLayout.animate().setDuration(C97m.A02.A02()).alpha(0.0f).withEndAction(new AEh(this, fbLinearLayout)).start();
                return;
            }
            fbLinearLayout.setVisibility(8);
            InterfaceC00713oe interfaceC00713oe = this.A09;
            if (interfaceC00713oe != null) {
                interfaceC00713oe.Bef(0S2.A01);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A08() {
        EditText editText = this.A03;
        if (editText != null) {
            Context context = getContext();
            Object systemService = context != null ? context.getSystemService("input_method") : null;
            11T.A0I(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            7zR.A12(editText, (InputMethodManager) systemService);
        }
    }

    public static final void A0C(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        8HG r0 = generatedThemeCreationFragment.A0B;
        if (r0 != null) {
            r0.dispose();
        }
        ((1EH) 1Br.A0B(((9kV) 1Br.A0B(generatedThemeCreationFragment.A0c)).A03)).AEI();
        ScheduledFuture scheduledFuture = generatedThemeCreationFragment.A0Q;
        if (scheduledFuture != null && !scheduledFuture.isCancelled() && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(true);
        }
        ListenableFuture listenableFuture = generatedThemeCreationFragment.A0N;
        if (listenableFuture == null || listenableFuture.isCancelled() || listenableFuture.isDone()) {
            return;
        }
        listenableFuture.cancel(true);
    }

    public static final void A0E(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        FbLinearLayout fbLinearLayout = generatedThemeCreationFragment.A0I;
        if (fbLinearLayout != null) {
            if (A05(generatedThemeCreationFragment).A02()) {
                ViewPropertyAnimator animate = fbLinearLayout.animate();
                C97m c97m = C97m.A02;
                animate.setDuration(c97m.A02()).alpha(0.0f).withEndAction(new AEi(generatedThemeCreationFragment, fbLinearLayout)).start();
                FbLinearLayout fbLinearLayout2 = generatedThemeCreationFragment.A0H;
                if (fbLinearLayout2 != null) {
                    fbLinearLayout2.animate().setDuration(c97m.A02()).alpha(0.0f).withEndAction(new ACz(generatedThemeCreationFragment)).start();
                    return;
                }
                return;
            }
            fbLinearLayout.setVisibility(8);
            FbLinearLayout fbLinearLayout3 = generatedThemeCreationFragment.A0H;
            if (fbLinearLayout3 != null) {
                fbLinearLayout3.setVisibility(8);
            }
            InterfaceC00713oe interfaceC00713oe = generatedThemeCreationFragment.A0A;
            if (interfaceC00713oe != null) {
                interfaceC00713oe.Bef(0S2.A01);
            }
            C2a2 c2a2 = generatedThemeCreationFragment.A0S;
            if (c2a2 == null || !c2a2.BRC()) {
                7zP.A1U(generatedThemeCreationFragment.A0S);
            }
        }
    }

    public static final void A0F(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        LithoView lithoView = generatedThemeCreationFragment.A07;
        if (lithoView != null) {
            if (A05(generatedThemeCreationFragment).A02()) {
                lithoView.animate().setDuration(C97m.A02.A02()).alpha(0.0f).withEndAction(new AD0(lithoView));
            } else {
                lithoView.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0G(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        LithoView lithoView = generatedThemeCreationFragment.A08;
        if (lithoView != null) {
            C00i c00i = generatedThemeCreationFragment.A0g.A00;
            C1u2 c1u2 = (C1u2) c00i.get();
            C1u3 c1u3 = C1u3.A0U;
            C1u4 c1u4 = C1u4.SIZE_32;
            int A04 = c1u2.A04(c1u3, c1u4);
            boolean z = false;
            Drawable A09 = ((C1u2) c00i.get()).A09(C1u3.A3S, c1u4, 0);
            2qR r0 = 6tM.A01;
            1Br r02 = generatedThemeCreationFragment.A0b;
            6tM A00 = 6zN.A00(7zQ.A0m(r02));
            AV4 A002 = AV4.A00(generatedThemeCreationFragment, 24);
            11T.A0D(A09);
            if (generatedThemeCreationFragment.A0P == 0S2.A0C) {
                z = true;
            }
            2KD A003 = 2K3.A00(7zP.A0T(generatedThemeCreationFragment));
            A003.A2z(7zO.A0D(generatedThemeCreationFragment).getString(2131957295));
            A003.A2h();
            A003.A2w(z ? C1u7.A06 : C1u7.A04);
            A003.A2x(7zQ.A0m(r02));
            7zR.A1A(A003, new AR6(1, generatedThemeCreationFragment, z));
            A003.A2D(C26z.END, 2132279314);
            lithoView.A0y(new C8d6(A09, A003.A2W(), A00, null, null, A002, A04));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0H(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        9ZZ r0 = generatedThemeCreationFragment.A0M;
        if (r0 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Object obj = r0.A02;
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo");
        ThreadThemeInfo threadThemeInfo = (ThreadThemeInfo) obj;
        9WG r02 = ThemePreviewFragment.A09;
        ThreadThemeInfo threadThemeInfo2 = generatedThemeCreationFragment.A0X;
        if (threadThemeInfo2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ThreadKey threadKey = generatedThemeCreationFragment.A0C;
        if (threadKey == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        boolean A01 = A05(generatedThemeCreationFragment).A01();
        Boolean bool = generatedThemeCreationFragment.A0Z;
        if (bool == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = generatedThemeCreationFragment.A0Y;
        if (bool2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        r02.A00(threadKey, (ThreadSummary) null, threadThemeInfo, threadThemeInfo2, (String) null, A01, booleanValue, true, bool2.booleanValue(), false).A0m(generatedThemeCreationFragment.getChildFragmentManager(), "GeneratedThemeCreationFragment");
        ThreadKey threadKey2 = generatedThemeCreationFragment.A0C;
        if (threadKey2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (!threadKey2.A0z()) {
            6NA r03 = (6NA) 1Bi.A03(50079);
            ThreadKey threadKey3 = generatedThemeCreationFragment.A0C;
            if (threadKey3 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            r03.A02(98D.A01, threadKey3, "create_with_ai", threadThemeInfo.A0T);
            return;
        }
        Object A03 = 1Bi.A03(68186);
        FbUserSession fbUserSession = generatedThemeCreationFragment.A04;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        ThreadKey threadKey4 = generatedThemeCreationFragment.A0C;
        if (threadKey4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        98D r04 = 98D.A01;
        ((5P5) 1Lo.A08(fbUserSession, 67488)).A00(new A1Y(A03, r04, threadKey4, "create_with_ai", 6), threadKey4.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0I(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        DR6 A02 = generatedThemeCreationFragment.A0m.A02(generatedThemeCreationFragment.requireContext());
        A02.A0K(false);
        A02.A03(7zO.A0D(generatedThemeCreationFragment).getString(2131957292));
        A02.A0J(7zO.A0D(generatedThemeCreationFragment).getString(2131957291));
        C9oG.A00(A02, 7zO.A0D(generatedThemeCreationFragment).getString(2131957293), generatedThemeCreationFragment, 11);
        A02.A05();
    }

    public static final void A0J(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        FbLinearLayout fbLinearLayout = generatedThemeCreationFragment.A0G;
        if (fbLinearLayout != null) {
            if (A05(generatedThemeCreationFragment).A02()) {
                fbLinearLayout.setAlpha(0.0f);
            }
            fbLinearLayout.setVisibility(0);
            InterfaceC00713oe interfaceC00713oe = generatedThemeCreationFragment.A09;
            if (interfaceC00713oe != null) {
                interfaceC00713oe.Bef(0S2.A00);
            }
            if (A05(generatedThemeCreationFragment).A02()) {
                7zV.A0o(fbLinearLayout.animate(), C97m.A02);
            }
        }
    }

    public static final void A0K(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        FbLinearLayout fbLinearLayout;
        RuntimeShader runtimeShader;
        generatedThemeCreationFragment.A0P = 0S2.A01;
        LithoView lithoView = generatedThemeCreationFragment.A06;
        if (lithoView != null) {
            ViewParent parent = lithoView.getParent();
            11T.A0I(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(generatedThemeCreationFragment.A06);
            generatedThemeCreationFragment.A06 = null;
        }
        generatedThemeCreationFragment.A08();
        generatedThemeCreationFragment.A07();
        A0F(generatedThemeCreationFragment);
        FbLinearLayout fbLinearLayout2 = generatedThemeCreationFragment.A0I;
        if (fbLinearLayout2 != null) {
            if (A05(generatedThemeCreationFragment).A02()) {
                fbLinearLayout2.setAlpha(0.0f);
                FbLinearLayout fbLinearLayout3 = generatedThemeCreationFragment.A0H;
                if (fbLinearLayout3 != null) {
                    fbLinearLayout3.setAlpha(0.0f);
                }
                fbLinearLayout2.setVisibility(0);
                FbLinearLayout fbLinearLayout4 = generatedThemeCreationFragment.A0H;
                if (fbLinearLayout4 != null) {
                    fbLinearLayout4.setVisibility(0);
                }
                InterfaceC00713oe interfaceC00713oe = generatedThemeCreationFragment.A0A;
                if (interfaceC00713oe != null) {
                    interfaceC00713oe.Bef(0S2.A00);
                }
                ViewPropertyAnimator animate = fbLinearLayout2.animate();
                7zV.A0o(animate.setStartDelay(r0.A02()), C97m.A02);
                FbLinearLayout fbLinearLayout5 = generatedThemeCreationFragment.A0H;
                if (fbLinearLayout5 != null) {
                    fbLinearLayout5.animate().setStartDelay(r0.A02()).setDuration(r0.A01()).alpha(0.2f).start();
                }
            } else {
                fbLinearLayout2.setVisibility(0);
                FbLinearLayout fbLinearLayout6 = generatedThemeCreationFragment.A0H;
                if (fbLinearLayout6 != null) {
                    fbLinearLayout6.setAlpha(0.1f);
                }
                FbLinearLayout fbLinearLayout7 = generatedThemeCreationFragment.A0H;
                if (fbLinearLayout7 != null) {
                    fbLinearLayout7.setVisibility(0);
                }
                InterfaceC00713oe interfaceC00713oe2 = generatedThemeCreationFragment.A0A;
                if (interfaceC00713oe2 != null) {
                    interfaceC00713oe2.Bef(0S2.A00);
                }
            }
            if (A05(generatedThemeCreationFragment).A03() && (fbLinearLayout = generatedThemeCreationFragment.A0H) != null && (runtimeShader = generatedThemeCreationFragment.A02) != null) {
                runtimeShader.setFloatUniform("iResolution", fbLinearLayout.getWidth(), fbLinearLayout.getHeight());
                2aI r304 = generatedThemeCreationFragment.A0R;
                C2aj c2aj = null;
                if (r304 == null) {
                    r304 = 2Zy.A02(2Zo.A04(false));
                    generatedThemeCreationFragment.A0R = r304;
                }
                if (r304 != null) {
                    c2aj = 2aK.A04(new GeneratedThemeCreationFragment$showLoadingStateView$2(runtimeShader, fbLinearLayout, null), r304);
                }
                generatedThemeCreationFragment.A0S = c2aj;
            }
        }
        A0O(generatedThemeCreationFragment, false);
        A0G(generatedThemeCreationFragment);
    }

    public static final void A0L(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        generatedThemeCreationFragment.A0P = 0S2.A0C;
        generatedThemeCreationFragment.A08();
        generatedThemeCreationFragment.A07();
        A0E(generatedThemeCreationFragment);
        A0M(generatedThemeCreationFragment);
        LithoView lithoView = generatedThemeCreationFragment.A07;
        if (lithoView != null) {
            if (A05(generatedThemeCreationFragment).A02()) {
                lithoView.setAlpha(0.0f);
                lithoView.setVisibility(0);
                ViewPropertyAnimator animate = lithoView.animate();
                7zV.A0o(animate.setStartDelay(r0.A02()), C97m.A02);
            } else {
                lithoView.setVisibility(0);
            }
        }
        A0O(generatedThemeCreationFragment, true);
        A0G(generatedThemeCreationFragment);
    }

    public static final void A0M(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        final 9ZZ r0;
        LithoView lithoView = generatedThemeCreationFragment.A07;
        if (lithoView == null || (r0 = generatedThemeCreationFragment.A0M) == null) {
            return;
        }
        final List A0V = 0QD.A0V(generatedThemeCreationFragment.A0k);
        final Float f = generatedThemeCreationFragment.A0O;
        final boolean z = !generatedThemeCreationFragment.A0T;
        final int i = generatedThemeCreationFragment.A00;
        final int color = lithoView.getContext().getColor(2132213824);
        final C9I7 c9i7 = new C9I7(generatedThemeCreationFragment);
        final 1LI r02 = generatedThemeCreationFragment.A0V;
        if (r02 == null) {
            11T.A0L("feedbackEntryComponent");
            throw 0Q8.createAndThrow();
        }
        lithoView.A0y(new 1LH(r02, c9i7, r0, f, A0V, i, color, z) { // from class: X.8db
            public final int A00;
            public final int A01;
            public final 1LI A02;
            public final 9ZZ A03;
            public final Float A04;
            public final boolean A05;
            public final C9I7 A06;
            public final List A07;

            {
                this.A03 = r0;
                this.A07 = A0V;
                this.A04 = f;
                this.A05 = z;
                this.A00 = i;
                this.A01 = color;
                this.A06 = c9i7;
                this.A02 = r02;
            }

            public 1LI A0s(C2k5 c2k5) {
                QGz qGz;
                QGz qGz2;
                C1rh c1rh;
                11T.A0F(c2k5, 0);
                boolean z2 = this.A05;
                boolean z3 = true;
                if (!z2 || this.A07.size() <= 1) {
                    z3 = false;
                }
                2lQ r03 = 2lO.A02;
                C8a5 c8a5 = null;
                2lO A0V2 = 7zT.A0V((2lO) null, 7zL.A0i(0S2.A04, 7zP.A0A()), 7zQ.A08());
                Integer num = 0S2.A00;
                2lO A04 = C82m.A04(A0V2, num, 100.0f, 0);
                Integer num2 = 0S2.A01;
                2lO A0Y = 7zS.A0Y(C82m.A04(A04, num2, 100.0f, 0), num2);
                C2sn A0L = 7zR.A0L(c2k5);
                2lO A042 = C82m.A04(null, num, 100.0f, 0);
                Integer num3 = 0S2.A0C;
                2lO A0c = 7zS.A0c(A042, num3, true);
                1Iw AeS = A0L.AeS();
                C2sn A0U = 7zQ.A0U(AeS);
                8Tm A00 = C8mf.A00(A0U.A00);
                A00.A2a(this.A00);
                A00.A2X();
                A00.A2Z(24.0f);
                2lO A043 = C82m.A04(null, num, 100.0f, 0);
                C2sn A0J = 7zS.A0J(A0U);
                9ZZ r04 = this.A03;
                A0J.A00(new QHw(r04.A00, Float.valueOf(24.0f), this.A04));
                if (z2) {
                    qGz = new QGz(GradientDrawable.Orientation.BOTTOM_TOP, 7zL.A0w(7zP.A08()), (C2lu) null, new int[]{0, this.A01});
                } else {
                    qGz = null;
                }
                A0J.A00(qGz);
                if (z2) {
                    qGz2 = new QGz(GradientDrawable.Orientation.TOP_BOTTOM, (C2lu) null, 7zL.A0w(7zP.A08()), new int[]{0, this.A01});
                } else {
                    qGz2 = null;
                }
                8Tm.A07(A00, 7zN.A0N(qGz2, A0J, A0U, A043), A0U);
                7zN.A1L(A0U, A0L, A0c);
                if (z2) {
                    c1rh = 7zN.A0R(this.A02, 7zQ.A0U(AeS), A0L, 7zS.A0a(4YV.A0L(4YV.A0L(7zS.A0S(7zQ.A0Y(7zQ.A0Y((2lO) null, 0S2.A0N, 7zQ.A0B()), 0S2.A15, 7zQ.A06()), 0), num, C1ro.FLEX_END, 0), num3, false, 1), num, 0));
                } else {
                    c1rh = null;
                }
                A0L.A00(c1rh);
                if (z3) {
                    c8a5 = new C8a5(r04.A01, this.A06, 7zL.A0w(Double.doubleToRawLongBits(34.0d)), this.A07);
                }
                return 7zM.A0k(c8a5, A0L, c2k5, A0Y);
            }
        });
    }

    public static final void A0N(GeneratedThemeCreationFragment generatedThemeCreationFragment, String str) {
        A0C(generatedThemeCreationFragment);
        EditText editText = generatedThemeCreationFragment.A03;
        if (editText != null) {
            editText.clearFocus();
        }
        EditText editText2 = generatedThemeCreationFragment.A03;
        if (editText2 != null) {
            editText2.setText(str);
        }
        generatedThemeCreationFragment.A0B = new 8HG(generatedThemeCreationFragment, str);
        generatedThemeCreationFragment.A0Q = ((ScheduledExecutorService) 1Br.A0B(generatedThemeCreationFragment.A0i)).schedule(new AEj(generatedThemeCreationFragment, str), 200L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0O(GeneratedThemeCreationFragment generatedThemeCreationFragment, boolean z) {
        FbImageButton fbImageButton = generatedThemeCreationFragment.A0E;
        if (fbImageButton != null) {
            EditText editText = generatedThemeCreationFragment.A03;
            String A06 = A06(generatedThemeCreationFragment, String.valueOf(editText != null ? editText.getText() : null));
            9ZZ r0 = generatedThemeCreationFragment.A0M;
            boolean A0O = 11T.A0O(A06, r0 != null ? r0.A03 : null);
            if (0CU.A0O(A06) || A06.length() == 0) {
                fbImageButton.setVisibility(8);
                generatedThemeCreationFragment.A0U = null;
                return;
            }
            C1u3 c1u3 = A0O ? C1u3.A5P : C1u3.A0Y;
            C00i c00i = generatedThemeCreationFragment.A0g.A00;
            C1u2 c1u2 = (C1u2) c00i.get();
            1Br r02 = generatedThemeCreationFragment.A0b;
            MigColorScheme A0m = 7zQ.A0m(r02);
            fbImageButton.setImageDrawable(c1u2.A08(c1u3, z ? A0m.B4d() : A0m.Aht()));
            fbImageButton.setClickable(z);
            FbImageButton fbImageButton2 = generatedThemeCreationFragment.A0F;
            if (fbImageButton2 != null) {
                C1u2 c1u22 = (C1u2) c00i.get();
                C1u3 c1u32 = C1u3.A2C;
                MigColorScheme A0m2 = 7zQ.A0m(r02);
                fbImageButton2.setImageDrawable(c1u22.A08(c1u32, z ? A0m2.B4d() : A0m2.Aht()));
                fbImageButton2.setClickable(z);
            }
            if (z) {
                fbImageButton.setOnClickListener(new C9pd(generatedThemeCreationFragment, fbImageButton, A06, 1, A0O));
            }
            fbImageButton.setContentDescription(7zO.A0D(generatedThemeCreationFragment).getString(2131957294));
            if (c1u3 != generatedThemeCreationFragment.A0U && 7zU.A0Y(generatedThemeCreationFragment).AZk(36325278612410926L)) {
                int dimensionPixelSize = 7zO.A0D(generatedThemeCreationFragment).getDimensionPixelSize(2132279312);
                C66i c66i = generatedThemeCreationFragment.A0K;
                if (c66i != null) {
                    c66i.A01();
                }
                C66i c66i2 = generatedThemeCreationFragment.A0K;
                if (c66i2 == null) {
                    c66i2 = new C66i((C62j) 1Br.A0B(generatedThemeCreationFragment.A0h));
                    c66i2.A09(C66h.A02(16.0d, 8.0d));
                    c66i2.A06 = false;
                    ViewGroup.LayoutParams layoutParams = fbImageButton.getLayoutParams();
                    11T.A0I(layoutParams, 4YT.A00(5));
                    c66i2.A0A(new 91V((ViewGroup.MarginLayoutParams) layoutParams, generatedThemeCreationFragment, fbImageButton));
                }
                generatedThemeCreationFragment.A0K = c66i2;
                c66i2.A06(0.0d);
                c66i2.A07(dimensionPixelSize);
            }
            generatedThemeCreationFragment.A0U = c1u3;
            if (!A0O) {
                fbImageButton.setRotation(0.0f);
            }
            fbImageButton.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(874379683);
        super.onCreate(bundle);
        A0g(2, R.style.Theme.NoTitleBar);
        this.A04 = 7zT.A08(this);
        0FI.A08(-628470257, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1854397539);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542090, viewGroup, false);
        View findViewById = inflate.findViewById(2131364317);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new LKk(findViewById, this, 0));
        0FI.A08(853561439, A02);
        return inflate;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-559699853);
        super.onDestroyView();
        this.A08 = null;
        this.A0L = null;
        this.A0J = null;
        this.A03 = null;
        this.A0E = null;
        this.A0F = null;
        this.A07 = null;
        FbLinearLayout fbLinearLayout = this.A0G;
        if (fbLinearLayout != null) {
            fbLinearLayout.removeAllViews();
        }
        this.A0G = null;
        FbLinearLayout fbLinearLayout2 = this.A0I;
        if (fbLinearLayout2 != null) {
            fbLinearLayout2.removeAllViews();
        }
        this.A0I = null;
        this.A0H = null;
        this.A02 = null;
        this.A0R = null;
        this.A0S = null;
        this.A0D = null;
        this.A05 = null;
        A0C(this);
        this.A06 = null;
        0FI.A08(701928321, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        Window window = null;
        Parcelable parcelable = bundle2 != null ? bundle2.getParcelable("thread_key") : null;
        Parcelable.Creator creator = ThreadKey.CREATOR;
        11T.A0B(creator);
        this.A0C = (ThreadKey) 0Gm.A01(creator, parcelable, ThreadKey.class);
        Bundle bundle3 = this.mArguments;
        Parcelable parcelable2 = bundle3 != null ? bundle3.getParcelable("current_thread_theme_info") : null;
        Parcelable.Creator creator2 = ThreadThemeInfo.CREATOR;
        11T.A0B(creator2);
        this.A0X = (ThreadThemeInfo) 0Gm.A01(creator2, parcelable2, ThreadThemeInfo.class);
        Bundle bundle4 = this.mArguments;
        this.A0Z = bundle4 != null ? Boolean.valueOf(bundle4.getBoolean("is_current_theme_deprecated")) : null;
        Bundle bundle5 = this.mArguments;
        this.A0Y = bundle5 != null ? Boolean.valueOf(bundle5.getBoolean("has_available_ai_generated_theme")) : null;
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            window = dialog.getWindow();
        }
        1Br r0 = this.A0b;
        this.A00 = 7zQ.A0m(r0).Chx(7zV.A0N(this));
        Context requireContext = requireContext();
        MigColorScheme A0m = 7zQ.A0m(r0);
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132346770);
        Drawable drawable = requireContext.getDrawable(7zT.A02(A0o, A0m, 2132346769));
        if (window != null) {
            window.setSoftInputMode(16);
            window.setBackgroundDrawable(drawable);
            C2yk.A00(window, this.A00);
            1tJ.A07(window, false);
            1tJ.A06(window, this.A00);
        }
        this.A0D = (CHy) 7zO.A0l(this, 82650);
        DLP dlp = new DLP(view);
        this.A0W = dlp;
        dlp.A02(new A3Q(this, 1));
        this.A08 = (LithoView) view.requireViewById(2131364318);
        A0G(this);
        this.A0J = (FbLinearLayout) view.requireViewById(2131364329);
        this.A0L = (AnimatedHintsTextLayout) view.requireViewById(2131364316);
        EditText editText = (EditText) view.requireViewById(2131364328);
        this.A03 = editText;
        if (editText != null) {
            editText.setTypeface(2KQ.A04.A00(requireContext()));
            editText.setTextColor(7zQ.A0m(r0).B4i());
            editText.setHintTextColor(7zQ.A0m(r0).B36());
            int A01 = 7zN.A01(7zO.A0D(this));
            int dimensionPixelSize = 7zO.A0D(this).getDimensionPixelSize(com.mapbox.mapboxsdk.R.dimen.mapbox_eight_dp);
            editText.setPadding(A01, dimensionPixelSize, A01, dimensionPixelSize);
            FbLinearLayout fbLinearLayout = this.A0J;
            if (fbLinearLayout != null) {
                fbLinearLayout.setBackground(new C5bb(7zL.A01(7zO.A0D(this), com.mapbox.mapboxsdk.R.dimen.mapbox_eight_dp), 7zO.A05(7zQ.A0m(r0), 7zQ.A0m(r0).BDl(), 7zQ.A0m(r0).B4n())));
                AnimatedHintsTextLayout animatedHintsTextLayout = this.A0L;
                if (animatedHintsTextLayout != null) {
                    animatedHintsTextLayout.A06(11T.A03(7zO.A0D(this).getString(2131957303)));
                    editText.addTextChangedListener(new 9pI(this, 2));
                    editText.requestFocus();
                    if (7zU.A0Y(this).AZk(36325278612673074L)) {
                        fbLinearLayout.getLayoutParams().width = ((7zO.A0D(this).getDisplayMetrics().widthPixels - (7zO.A0D(this).getDimensionPixelSize(2132279314) * 2)) - 7zO.A0D(this).getDimensionPixelSize(2132279312)) - 7zO.A0D(this).getDimensionPixelSize(com.mapbox.mapboxsdk.R.dimen.mapbox_four_dp);
                        FbImageButton fbImageButton = (FbImageButton) view.requireViewById(2131364319);
                        this.A0F = fbImageButton;
                        if (fbImageButton != null) {
                            fbImageButton.setVisibility(0);
                            fbImageButton.setImageDrawable(7zP.A0S(this.A0g).A08(C1u3.A2C, 7zQ.A0m(r0).B4d()));
                            C9py.A04(fbImageButton, this, 59);
                        }
                    }
                    FbImageButton fbImageButton2 = (FbImageButton) view.requireViewById(2131364315);
                    this.A0E = fbImageButton2;
                    if (fbImageButton2 != null) {
                        fbImageButton2.setHapticFeedbackEnabled(7zU.A0Y(this).AZk(36325278612476463L));
                    }
                    A0O(this, false);
                }
            }
        }
        this.A0G = (FbLinearLayout) view.requireViewById(2131364320);
        1Iw A0T = 7zP.A0T(this);
        this.A09 = new 53P(this);
        2qR r02 = 6tM.A01;
        6tM A00 = 6zN.A00(7zQ.A0m(r0));
        String A0t = 4YU.A0t(7zO.A0D(this), 2131952619);
        Drawable drawable2 = requireContext().getDrawable(2132475911);
        if (drawable2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A81 a81 = new A81(A0t, drawable2);
        String A0t2 = 4YU.A0t(7zO.A0D(this), 2131952620);
        Drawable drawable3 = requireContext().getDrawable(2132475912);
        if (drawable3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A81 a812 = new A81(A0t2, drawable3);
        String A0t3 = 4YU.A0t(7zO.A0D(this), 2131952621);
        Drawable drawable4 = requireContext().getDrawable(2132475913);
        if (drawable4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A81 a813 = new A81(A0t3, drawable4);
        String A0t4 = 4YU.A0t(7zO.A0D(this), 2131952622);
        Drawable drawable5 = requireContext().getDrawable(2132475914);
        if (drawable5 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A81 a814 = new A81(A0t4, drawable5);
        String A0t5 = 4YU.A0t(7zO.A0D(this), 2131952623);
        Drawable drawable6 = requireContext().getDrawable(2132475915);
        if (drawable6 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A81 a815 = new A81(A0t5, drawable6);
        String A0t6 = 4YU.A0t(7zO.A0D(this), 2131952624);
        Drawable drawable7 = requireContext().getDrawable(2132475916);
        if (drawable7 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ArrayList A11 = C0s8.A11(a81, a812, a813, a814, a815, new A81(A0t6, drawable7));
        if (7zU.A0Y(this).AZk(36325278612804148L)) {
            String A0t7 = 4YU.A0t(7zO.A0D(this), 2131952694);
            Drawable drawable8 = requireContext().getDrawable(2132475917);
            if (drawable8 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a816 = new A81(A0t7, drawable8);
            String A0t8 = 4YU.A0t(7zO.A0D(this), 2131952695);
            Drawable drawable9 = requireContext().getDrawable(2132475918);
            if (drawable9 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a817 = new A81(A0t8, drawable9);
            String A0t9 = 4YU.A0t(7zO.A0D(this), 2131952696);
            Drawable drawable10 = requireContext().getDrawable(2132475919);
            if (drawable10 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a818 = new A81(A0t9, drawable10);
            String A0t10 = 4YU.A0t(7zO.A0D(this), 2131952697);
            Drawable drawable11 = requireContext().getDrawable(2132475920);
            if (drawable11 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a819 = new A81(A0t10, drawable11);
            String A0t11 = 4YU.A0t(7zO.A0D(this), 2131952698);
            Drawable drawable12 = requireContext().getDrawable(2132475921);
            if (drawable12 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8110 = new A81(A0t11, drawable12);
            String A0t12 = 4YU.A0t(7zO.A0D(this), 2131952699);
            Drawable drawable13 = requireContext().getDrawable(2132475922);
            if (drawable13 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8111 = new A81(A0t12, drawable13);
            String A0t13 = 4YU.A0t(7zO.A0D(this), 2131952700);
            Drawable drawable14 = requireContext().getDrawable(2132475923);
            if (drawable14 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8112 = new A81(A0t13, drawable14);
            String A0t14 = 4YU.A0t(7zO.A0D(this), 2131952701);
            Drawable drawable15 = requireContext().getDrawable(2132475924);
            if (drawable15 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8113 = new A81(A0t14, drawable15);
            String A0t15 = 4YU.A0t(7zO.A0D(this), 2131952702);
            Drawable drawable16 = requireContext().getDrawable(2132475925);
            if (drawable16 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8114 = new A81(A0t15, drawable16);
            String A0t16 = 4YU.A0t(7zO.A0D(this), 2131952703);
            Drawable drawable17 = requireContext().getDrawable(2132475926);
            if (drawable17 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A11.addAll(C0s8.A14(a816, a817, a818, a819, a8110, a8111, a8112, a8113, a8114, new A81(A0t16, drawable17)));
        }
        if (7zU.A0Y(this).AZk(36325278612738611L)) {
            String A0t17 = 4YU.A0t(7zO.A0D(this), 2131952705);
            Drawable drawable18 = requireContext().getDrawable(2132475927);
            if (drawable18 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8115 = new A81(A0t17, drawable18);
            String A0t18 = 4YU.A0t(7zO.A0D(this), 2131952704);
            Drawable drawable19 = requireContext().getDrawable(2132475928);
            if (drawable19 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8116 = new A81(A0t18, drawable19);
            String A0t19 = 4YU.A0t(7zO.A0D(this), 2131952706);
            Drawable drawable20 = requireContext().getDrawable(2132475929);
            if (drawable20 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8117 = new A81(A0t19, drawable20);
            String A0t20 = 4YU.A0t(7zO.A0D(this), 2131952707);
            Drawable drawable21 = requireContext().getDrawable(2132475930);
            if (drawable21 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8118 = new A81(A0t20, drawable21);
            String A0t21 = 4YU.A0t(7zO.A0D(this), 2131952708);
            Drawable drawable22 = requireContext().getDrawable(2132475931);
            if (drawable22 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8119 = new A81(A0t21, drawable22);
            String A0t22 = 4YU.A0t(7zO.A0D(this), 2131952709);
            Drawable drawable23 = requireContext().getDrawable(2132475932);
            if (drawable23 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8120 = new A81(A0t22, drawable23);
            String A0t23 = 4YU.A0t(7zO.A0D(this), 2131952710);
            Drawable drawable24 = requireContext().getDrawable(2132475933);
            if (drawable24 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8121 = new A81(A0t23, drawable24);
            String A0t24 = 4YU.A0t(7zO.A0D(this), 2131952711);
            Drawable drawable25 = requireContext().getDrawable(2132475934);
            if (drawable25 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A81 a8122 = new A81(A0t24, drawable25);
            String A0t25 = 4YU.A0t(7zO.A0D(this), 2131952712);
            Drawable drawable26 = requireContext().getDrawable(2132475935);
            if (drawable26 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A11.addAll(C0s8.A14(a8115, a8116, a8117, a8118, a8119, a8120, a8121, a8122, new A81(A0t25, drawable26)));
        }
        LithoView A03 = LithoView.A03(new 8hB(this.A0j, A00, new A82(this), C13m.A1A(A11), this.A00, 4, 7zU.A0Y(this).AZk(36325278612607537L), true), A0T, this.A09);
        FbLinearLayout fbLinearLayout2 = this.A0G;
        if (fbLinearLayout2 != null) {
            fbLinearLayout2.addView(A03);
        }
        this.A0I = (FbLinearLayout) view.requireViewById(2131364321);
        if (A05(this).A03()) {
            this.A0H = (FbLinearLayout) view.requireViewById(2131364322);
            this.A02 = new RuntimeShader("uniform float2 iResolution; uniform float iTime; uniform shader background; mat2 RotationMatrix(float a) { float s = sin(a); float c = cos(a); return mat2(c, -s, s, c); } vec2 hash( vec2 p ) { p = vec2( dot(p,vec2(2127.1,81.17)), dot(p,vec2(1269.5,283.37)) ); return fract(sin(p)*78642.2211); } float noise( in vec2 p ) { vec2 i = floor( p ); vec2 f = fract( p ); vec2 u = f*f*(3.0-2.0*f); float n = mix( mix( dot( -1.0+2.0*hash( i + vec2(0.0,0.0) ), f - vec2(0.0,0.0) ), dot( -1.0+2.0*hash( i + vec2(1.0,0.0) ), f - vec2(1.0,0.0) ), u.x), mix( dot( -1.0+2.0*hash( i + vec2(0.0,1.0) ), f - vec2(0.0,1.0) ), dot( -1.0+2.0*hash( i + vec2(1.0,1.0) ), f - vec2(1.0,1.0) ), u.x), u.y); return 0.5 + 0.5*n; } vec3 glossyFolds(vec2 fragCoord) { float minRes = min(iResolution.x, iResolution.y); vec2 uv = (fragCoord * 2.0 - iResolution.xy) / minRes; float d = -iTime * 0.4; float a = 0.0; for (float i = 0.0; i < 4.0; ++i) { a += cos(i - d - a * uv.y); d += sin(uv.x * i + a); } d += iTime; vec3 col = vec3(cos(uv * noise(vec2(d, a))) * 0.4 + 0.6, cos(a + d) * 0.6 + 0.4); col = cos(col * cos(vec3(d, a, 4.5)) * 0.6 + 0.4); return col; } vec4 main( vec2 fragCoord ) { vec2 uv = fragCoord/iResolution.xy; float ratio = iResolution.x / iResolution.y; vec2 tuv = uv; tuv -= .5; float processing = smoothstep(0.0, 1.0, iTime * 0.5); float rotationCoefficient = processing * 0.08 + (1.0 - processing) * 0.02; float degree = noise(vec2(iTime*.1, tuv.x*tuv.y))+iTime*rotationCoefficient; tuv.y *= 1./ratio; tuv *= RotationMatrix(radians((degree-.5)*720.+180.)); tuv.y *= ratio; vec3 colorBlue = vec3(0, .474, .925); vec3 colorGreen = vec3(.372, .980, .756); vec3 colorPink = vec3(.988, .568, .854); vec3 colorPurple = vec3(0.278, 0, .866); vec3 foldsComp = glossyFolds(fragCoord); vec3 layer1 = mix(colorPurple, colorGreen, smoothstep(-.3, .2, (tuv*RotationMatrix(radians(-5.))).x)); vec3 layer2 = mix(colorPink, colorBlue, smoothstep(-.3, .2, (tuv*RotationMatrix(radians(-5.))).x)); vec3 colorComp = mix(layer1, layer2, smoothstep(.5, -.3, tuv.y)); vec3 finalComp = mix(foldsComp,colorComp, smoothstep(-.5, .2, (tuv*RotationMatrix(radians(-5.))).x)); return vec4(finalComp,1.0); }");
        }
        this.A0A = new 53P(this);
        6tM A002 = 6zN.A00(7zQ.A0m(r0));
        ThreadKey threadKey = this.A0C;
        if (threadKey == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        LithoView A032 = LithoView.A03(new 8Z3(threadKey, A002), 7zP.A0T(this), this.A0A);
        FbLinearLayout fbLinearLayout3 = this.A0I;
        if (fbLinearLayout3 != null) {
            fbLinearLayout3.addView(A032);
        }
        A0E(this);
        this.A07 = (LithoView) view.requireViewById(2131364327);
        A0M(this);
        7zQ.A19(this.A07);
        C00i c00i = this.A0e.A00;
        FbSharedPreferences A09 = 1Br.A09(((9fT) c00i.get()).A00);
        1G9 r03 = 9fT.A02;
        if (!A09.AZn(r03, false)) {
            1Ql.A01(1Br.A08(((9fT) c00i.get()).A00), r03, true);
            this.A06 = (LithoView) view.requireViewById(2131364323);
            1LI qg7 = new QG7(new 9I6(this), 6zN.A00(7zQ.A0m(r0)));
            LithoView lithoView = this.A06;
            if (lithoView != null) {
                lithoView.A0y(qg7);
            }
        }
        FbLinearLayout fbLinearLayout4 = this.A0G;
        if (fbLinearLayout4 != null) {
            fbLinearLayout4.bringToFront();
        }
        A0J(this);
        C2cq A003 = C2cp.A00(7zP.A0T(this), 0);
        A003.A2a(7zP.A0S(this.A0g).A07(C1u3.A2N));
        A003.A2N(true);
        7zO.A1N(A003, AV4.A00(this, 23));
        C2cp A2W = A003.A2W();
        11T.A0D(A2W);
        this.A0V = A2W;
    }
}
