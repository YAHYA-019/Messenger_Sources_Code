package com.facebook.messaging.highlightstab.immersiveuicomponents.permalink;

import X.03Y;
import X.06Z;
import X.09X;
import X.0FI;
import X.0LQ;
import X.0ND;
import X.0Q8;
import X.0QD;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1LI;
import X.1Lo;
import X.2Qz;
import X.2R0;
import X.4YT;
import X.4YV;
import X.6LF;
import X.7J5;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.91P;
import X.95J;
import X.9Am;
import X.9Fr;
import X.9G3;
import X.9SW;
import X.9Tf;
import X.9Wd;
import X.9X8;
import X.9X9;
import X.9Yc;
import X.9qU;
import X.A32;
import X.A3A;
import X.ACB;
import X.AVH;
import X.AnonymousClass001;
import X.C08j;
import X.C0T0;
import X.C0T2;
import X.C0dp;
import X.C0dr;
import X.C1Y6;
import X.C1rn;
import X.C1ub;
import X.C3oi;
import X.C8be;
import X.C9mV;
import X.C9ty;
import X.C9yk;
import X.CJ8;
import X.F3k;
import X.FFj;
import X.GOm;
import X.InterfaceC00723of;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.LithoView;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveFixedColorScheme;
import com.facebook.messaging.highlightstab.immersiveuicomponents.permalink.HTImmersivePermalinkFragmentActivity;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.compat.RedexResourcesCompat;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: HTImmersivePermalinkFragmentActivity.class */
public final class HTImmersivePermalinkFragmentActivity extends FbFragmentActivity {
    public float A00;
    public FbUserSession A01;
    public A32 A02;
    public View A04;
    public LithoView A05;
    public C9ty A06;
    public 91P A07;
    public HTImmersiveFixedColorScheme A08;
    public 9Yc A09;
    public MigColorScheme A0A;
    public 6LF A0B;
    public C9yk A03 = new C9yk(null, null, ImmutableList.of(), null);
    public final 1Br A0E = 1Bq.A00(68355);
    public final 1Br A0C = 7zM.A0d();
    public final 1Br A0F = 1Bq.A00(84488);
    public final 1Br A0D = 1Bq.A00(68110);

    public static final void A12(final HTImmersivePermalinkFragmentActivity hTImmersivePermalinkFragmentActivity, HighlightsFeedContent highlightsFeedContent) {
        HTImmersiveFixedColorScheme hTImmersiveFixedColorScheme = hTImmersivePermalinkFragmentActivity.A08;
        String str = "fixedColorScheme";
        if (hTImmersiveFixedColorScheme != null) {
            float f = hTImmersivePermalinkFragmentActivity.A00;
            if (hTImmersivePermalinkFragmentActivity.A09 == null) {
                str = "feedState";
            } else {
                9SW r0 = new 9SW(new C1rn(7zN.A0f()), hTImmersiveFixedColorScheme, f, 0);
                Context baseContext = hTImmersivePermalinkFragmentActivity.getBaseContext();
                Context baseContext2 = hTImmersivePermalinkFragmentActivity.getBaseContext();
                C9yk c9yk = hTImmersivePermalinkFragmentActivity.A03;
                06Z BDe = hTImmersivePermalinkFragmentActivity.BDe();
                95J r02 = 95J.A03;
                HTImmersiveFixedColorScheme hTImmersiveFixedColorScheme2 = hTImmersivePermalinkFragmentActivity.A08;
                if (hTImmersiveFixedColorScheme2 != null) {
                    LithoView lithoView = new LithoView(hTImmersivePermalinkFragmentActivity, (AttributeSet) null);
                    A32 a32 = hTImmersivePermalinkFragmentActivity.A02;
                    if (a32 != null) {
                        9Wd r03 = (9Wd) C1Y6.A00(baseContext, "com_facebook_messaging_highlightstab_immersiveuicomponents_featurecontentview_plugins_interfaces_cards_HTImmersiveCardViewInterfaceSpec", "All", new Object[]{baseContext2, highlightsFeedContent, c9yk, BDe, r02, hTImmersiveFixedColorScheme2, lithoView, a32, new 9Tf()});
                        int i = highlightsFeedContent.A05;
                        9X8 A00 = r03.A00(i);
                        if (A00 == null) {
                            A00 = r03.A00(i + 1000);
                        }
                        2R0 A002 = ((2Qz) 1Br.A0B(hTImmersivePermalinkFragmentActivity.A0D)).A00(hTImmersivePermalinkFragmentActivity);
                        if (A00 != null) {
                            1LI r04 = new 7J5(new C8be(1, hTImmersivePermalinkFragmentActivity, A00, highlightsFeedContent, r0, A002), (03Y[]) null, 7zO.A1b(9G3.A01, A002, 1BK.A1G(C3oi.A00, hTImmersivePermalinkFragmentActivity)));
                            LithoView lithoView2 = hTImmersivePermalinkFragmentActivity.A05;
                            if (lithoView2 != null) {
                                lithoView2.A0y(r04);
                                return;
                            }
                            LithoView A003 = LithoView.A00(hTImmersivePermalinkFragmentActivity, r04);
                            A003.setBackgroundColor(-16777216);
                            hTImmersivePermalinkFragmentActivity.A05 = A003;
                            InterfaceC00723of interfaceC00723of = new InterfaceC00723of() { // from class: X.9sf
                                @Override // X.InterfaceC00723of
                                public final void Btn(BaseMountingView baseMountingView) {
                                    HTImmersivePermalinkFragmentActivity.this.startPostponedEnterTransition();
                                }
                            };
                            synchronized (A003) {
                                ((BaseMountingView) A003).A04 = interfaceC00723of;
                            }
                            hTImmersivePermalinkFragmentActivity.setContentView(A003);
                            ViewGroup.LayoutParams layoutParams = A003.getLayoutParams();
                            11T.A0I(layoutParams, GOm.A00(0));
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            Context baseContext3 = hTImmersivePermalinkFragmentActivity.getBaseContext();
                            11T.A0A(baseContext3);
                            RectF rectF = 9Fr.A00;
                            Resources resources = baseContext3.getResources();
                            int identifier = RedexResourcesCompat.getIdentifier(resources, 1BJ.A00(33), "dimen", "android");
                            int identifier2 = RedexResourcesCompat.getIdentifier(resources, 4YT.A00(1008), "bool", "android");
                            marginLayoutParams.setMargins(0, 0, 0, (identifier <= 0 || identifier2 <= 0 || !resources.getBoolean(identifier2)) ? 0 : resources.getDimensionPixelSize(identifier));
                            A003.setLayoutParams(marginLayoutParams);
                            return;
                        }
                        return;
                    }
                    str = "viewpointActionHandler";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        StringBuilder A0k;
        Set<String> keySet;
        List A0U;
        this.A01 = 7zQ.A0N().A05(this);
        Intent intent = getIntent();
        Object A00 = 9Am.A00(intent, HighlightsFeedContent.class, "EXTRA_HIGHLIGHTS_FEED_CONTENT");
        if (A00 == null) {
            Bundle extras = intent.getExtras();
            if (extras == null || (keySet = extras.keySet()) == null || (A0U = 0QD.A0U(keySet)) == null) {
                A0k = AnonymousClass001.A0k();
                A0k.append(intent);
                A0k.append(" does not have extras");
            } else {
                String A0t = 4YV.A0t(", ", A0U, (Function1) null);
                A0k = AnonymousClass001.A0k();
                A0k.append("Required argument '");
                A0k.append("EXTRA_HIGHLIGHTS_FEED_CONTENT");
                A0k.append("' is missing from ");
                A0k.append(intent);
                A0k.append(", included extra keys are [");
                A0k.append(A0t);
                A0k.append(']');
            }
            throw AnonymousClass001.A0N(A0k.toString());
        }
        HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) ((Parcelable) A00);
        Lifecycle lifecycle = getLifecycle();
        FbUserSession fbUserSession = this.A01;
        String str = "fbUserSession";
        if (fbUserSession != null) {
            C9ty c9ty = new C9ty(lifecycle, fbUserSession, AVH.A00(highlightsFeedContent, this, 7));
            this.A06 = c9ty;
            0fH.A0j("HTImmersiveMontageActiveNowCoordinator", "init");
            if (1BL.A0Q().AZk(36325759648158663L)) {
                c9ty.A00.init();
            }
            C9ty c9ty2 = this.A06;
            if (c9ty2 == null) {
                str = "montageLoader";
            } else {
                0fH.A0j("HTImmersiveMontageActiveNowCoordinator", "onCreateView");
                if (1BL.A0Q().AZk(36325759648158663L)) {
                    c9ty2.A00.Bs2();
                }
                this.A08 = 7zN.A0C(966).A0U((MigColorScheme) 1Bn.A0A(67718));
                FbUserSession fbUserSession2 = this.A01;
                if (fbUserSession2 != null) {
                    this.A09 = (9Yc) 1Lo.A08(fbUserSession2, 68362);
                    CJ8 A002 = ((9X9) 1Br.A0B(this.A0E)).A00(this);
                    FbUserSession fbUserSession3 = this.A01;
                    if (fbUserSession3 != null) {
                        this.A02 = new A32(new ACB(this, fbUserSession3, (C0dp) 1Br.A0B(this.A0C), (C0dr) 1Br.A0B(this.A0F), A002), FFj.A00());
                        A12(this, highlightsFeedContent);
                        Window window = getWindow();
                        if (window != null) {
                            C0T2 c0t2 = new C0T2(window.getDecorView(), window);
                            boolean z = !1BL.A0Q().AZk(36325759650649059L);
                            C0T0 c0t0 = c0t2.A00;
                            c0t0.A04(z);
                            c0t0.A03(false);
                        }
                        LithoView lithoView = this.A05;
                        if (lithoView != null) {
                            0ND.A00(lithoView, new 9qU(0, this, lithoView, highlightsFeedContent));
                        }
                        if (!C1ub.A00().AZk(36321636494295685L) || lithoView == null) {
                            return;
                        }
                        this.A0B = (6LF) 1Bn.A0E(this, (1BY) null, 67784);
                        this.A0A = 7zR.A0c(this);
                        View findViewById = C9mV.A02(this).getWindow().getDecorView().findViewById(2131364501);
                        this.A04 = findViewById;
                        6LF r0 = this.A0B;
                        if (r0 == null) {
                            str = "snackBar";
                        } else {
                            MigColorScheme migColorScheme = this.A0A;
                            if (migColorScheme != null) {
                                this.A07 = new 0LQ(new C08j[]{new A3A(lithoView, findViewById, migColorScheme, r0)});
                                return;
                            }
                            str = "userColorScheme";
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        F3k.A00(this);
        postponeEnterTransition();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(7681381);
        super.onPause();
        C9ty c9ty = this.A06;
        if (c9ty == null) {
            11T.A0L("montageLoader");
            throw 0Q8.createAndThrow();
        }
        c9ty.A01();
        91P r0 = this.A07;
        if (r0 != null) {
            unregisterReceiver(r0);
        }
        0FI.A07(-1893311269, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(16029312);
        super.onResume();
        C9ty c9ty = this.A06;
        if (c9ty == null) {
            11T.A0L("montageLoader");
            throw 0Q8.createAndThrow();
        }
        c9ty.A00();
        91P r0 = this.A07;
        if (r0 != null) {
            09X.A00();
            09X.A03(this, r0);
        }
        0FI.A07(1940989883, A00);
    }
}
