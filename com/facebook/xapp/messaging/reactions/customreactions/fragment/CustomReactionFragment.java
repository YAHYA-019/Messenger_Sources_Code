package com.facebook.xapp.messaging.reactions.customreactions.fragment;

import X.0FI;
import X.0Q8;
import X.0QD;
import X.11T;
import X.1BJ;
import X.1BL;
import X.1BM;
import X.1Bi;
import X.1IC;
import X.1X9;
import X.2Ov;
import X.4YT;
import X.4YU;
import X.4rX;
import X.6qY;
import X.6yQ;
import X.7HB;
import X.7HC;
import X.7zS;
import X.7zT;
import X.8Lr;
import X.94V;
import X.9Q0;
import X.A98;
import X.AYp;
import X.AYq;
import X.C0A8;
import X.C3o5;
import X.C4s1;
import X.C5bb;
import X.C74a;
import X.C9lz;
import X.C9pw;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.PathInterpolator;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Set;

/* loaded from: CustomReactionFragment.class */
public final class CustomReactionFragment extends 2Ov {
    public 8Lr A00;
    public C74a A01;
    public 6yQ A02;
    public C9lz A03;
    public 7HB A04;
    public 7HC A05;
    public AYp A06;
    public AYq A07;
    public 6qY A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final C9lz A1C() {
        C9lz c9lz = this.A03;
        if (c9lz != null) {
            return c9lz;
        }
        11T.A0L("customReactionController");
        throw 0Q8.createAndThrow();
    }

    public final void A1D() {
        super/*X.0D2*/.A0p();
        C9lz A1C = A1C();
        if (11T.A0O(A1C.A06, A1C.A07)) {
            return;
        }
        A1C.A0J.D7i(C3o5.A0n(A1C.A06));
        A1C.A0I.CSe(0QD.A0V(A1C.A06));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(746578846);
        super.onCreate(bundle);
        A0g(2, 2132608881);
        if (this.A00 != null) {
            FbUserSession A01 = 1BM.A01(this);
            8Lr r0 = this.A00;
            String str = "customReactionsParam";
            if (r0 != null) {
                Set set = (Set) r0.A00;
                boolean z = r0.A01;
                6yQ r02 = this.A02;
                if (r02 == null) {
                    str = "customColorStrategy";
                } else {
                    AYp aYp = this.A06;
                    if (aYp == null) {
                        str = "emojiClickListener";
                    } else {
                        6qY r03 = this.A08;
                        if (r03 == null) {
                            str = "customReactionsManager";
                        } else {
                            7HC r04 = this.A05;
                            if (r04 == null) {
                                str = "customSearchEmojisManager";
                            } else {
                                AYq aYq = this.A07;
                                if (aYq == null) {
                                    str = "customReactionTrayUpdateListener";
                                } else {
                                    7HB r05 = this.A04;
                                    if (r05 == null) {
                                        str = "customRecentEmojisManager";
                                    } else {
                                        C74a c74a = this.A01;
                                        if (c74a == null) {
                                            str = "loggingHelper";
                                        } else {
                                            this.A03 = new C9lz(A01, c74a, r02, r05, r04, aYp, aYq, r03, set, z, this.A0B, this.A09);
                                            i = 1933166449;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        A0p();
        i = -953299570;
        0FI.A08(i, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        int A02 = 0FI.A02(-2140364624);
        11T.A0F(layoutInflater, 0);
        if (this.A0A) {
            1BL.A0Q().Ba9(36316439575799940L);
        }
        View inflate = layoutInflater.inflate(2132541807, viewGroup, false);
        11T.A0I(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup3 = (ViewGroup) inflate;
        View requireViewById = viewGroup3.requireViewById(2131363607);
        11T.A0I(requireViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup4 = (ViewGroup) requireViewById;
        viewGroup4.animate().setInterpolator(new PathInterpolator(0.14f, 1.0f, 0.34f, 1.0f)).setDuration(400L);
        C9pw.A01(viewGroup3, viewGroup4, this, 46);
        C9lz A1C = A1C();
        Context A08 = 4YU.A08(viewGroup4);
        float A00 = C0A8.A00(A08, 12.0f);
        float[] fArr = new float[8];
        fArr[0] = A00;
        7zS.A1X(fArr, A00, 1);
        7zT.A1X(fArr, 0.0f);
        viewGroup4.setBackground(new C5bb(fArr, A1C.A0E.B66(A08)));
        C9lz A1C2 = A1C();
        View requireViewById2 = viewGroup3.requireViewById(2131363506);
        String A002 = 4YT.A00(6);
        11T.A0I(requireViewById2, A002);
        LithoView lithoView = (LithoView) requireViewById2;
        11T.A0F(lithoView, 0);
        A1C2.A03 = lithoView;
        A1C2.A0J.B6A(new A98(A1C2, 1));
        if (!A1C2.A09) {
            LithoView lithoView2 = A1C2.A03;
            if (lithoView2 == null) {
                11T.A0L("customReactionsTrayContainerView");
                throw 0Q8.createAndThrow();
            }
            lithoView2.setVisibility(8);
        }
        View requireViewById3 = viewGroup3.requireViewById(2131363862);
        11T.A0I(requireViewById3, 1BJ.A00(14));
        View inflate2 = ((ViewStub) requireViewById3).inflate();
        11T.A0I(inflate2, A002);
        Object obj = null;
        A1C().A03((LithoView) inflate2, "");
        C4s1 c4s1 = (C4s1) 1Bi.A03(49322);
        Context context = getContext();
        if (context != null) {
            obj = context.getSystemService("input_method");
        }
        11T.A0I(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        C9lz A1C3 = A1C();
        int A06 = c4s1.A06();
        11T.A0F(obj, 2);
        A1C3.A01 = viewGroup3;
        View requireViewById4 = viewGroup3.requireViewById(2131363607);
        11T.A0A(requireViewById4);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(requireViewById4);
        A1C3.A05 = A022;
        if (A022 != null) {
            A022.A0D((int) (A06 * 0.8f), true);
        }
        BottomSheetBehavior bottomSheetBehavior = A1C3.A05;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0I(true);
        }
        BottomSheetBehavior bottomSheetBehavior2 = A1C3.A05;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0B(5);
        }
        BottomSheetBehavior bottomSheetBehavior3 = A1C3.A05;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.A0G(new 94V(A1C3, obj, 1));
        }
        if (!A1C3.A08 && (viewGroup2 = A1C3.A01) != null) {
            viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(A1C3.A0C);
            A1C3.A08 = true;
        }
        View requireViewById5 = viewGroup3.requireViewById(2131364438);
        11T.A0A(requireViewById5);
        requireViewById5.setBackground(new C5bb(C0A8.A00(r0, 2.0f), A1C3.A0E.B9h(4YU.A08(requireViewById5))));
        A1C().A04 = new 9Q0(viewGroup4, this);
        0FI.A08(1379824499, A02);
        return viewGroup3;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(2116188257);
        super.onDestroy();
        if (this.A03 != null) {
            C9lz A1C = A1C();
            ViewGroup viewGroup = A1C.A01;
            if (viewGroup != null) {
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(A1C.A0C);
                A1C.A08 = false;
            }
            7HB r0 = A1C.A0F;
            1IC r02 = r0.A00;
            if (r02 != null) {
                r02.A05();
            }
            4rX r03 = r0.A01;
            if (r03 != null) {
                r03.dispose();
            }
            1X9 r04 = A1C.A0G.A00;
            if (r04 != null) {
                r04.cancel();
            }
        }
        0FI.A08(-473279825, A02);
    }
}
