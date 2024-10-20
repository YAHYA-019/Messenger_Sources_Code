package com.facebook.messaging.rtc.incall.impl.active.callcontrols.ui;

import X.07C;
import X.07I;
import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.4YU;
import X.4zI;
import X.5XE;
import X.7zL;
import X.8Lu;
import X.AbI;
import X.AbM;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.C01i;
import X.C03i;
import X.C0s8;
import X.C2639Gjt;
import X.C2cd;
import X.C7sj;
import X.C7ua;
import X.DKC;
import X.DKD;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GS2;
import X.GjU;
import X.GrN;
import X.Gz5;
import X.Hne;
import X.I3o;
import X.I4x;
import X.IFw;
import X.Ig0;
import X.J9u;
import X.JDB;
import X.JFq;
import X.JPU;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: MsgrCallControlsView.class */
public final class MsgrCallControlsView extends ConstraintLayout implements JPU {
    public GjU A00;
    public Function1 A01;
    public boolean A02;
    public int[] A03;
    public final float A04;
    public final IFw A05;
    public final C01i A06;
    public final C01i A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgrCallControlsView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A04 = 7zL.A01(GOo.A0A(this), 2132279310) * 1.0f;
        this.A06 = AbstractC2326GOr.A0n(this);
        this.A07 = J9u.A00(this, C03i.A02, 42);
        this.A05 = new IFw(this, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgrCallControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        1BL.A1F(context, attributeSet);
        this.A04 = 7zL.A01(GOo.A0A(this), 2132279310) * 1.0f;
        this.A06 = AbstractC2326GOr.A0n(this);
        this.A07 = J9u.A00(this, C03i.A02, 42);
        this.A05 = new IFw(this, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgrCallControlsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        1BL.A1F(context, attributeSet);
        this.A04 = 7zL.A01(GOo.A0A(this), 2132279310) * 1.0f;
        this.A06 = AbstractC2326GOr.A0n(this);
        this.A07 = J9u.A00(this, C03i.A02, 42);
        this.A05 = new IFw(this, 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.View A00(X.Ig0 r302) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.callcontrols.ui.MsgrCallControlsView.A00(X.Ig0):android.view.View");
    }

    public static final void A01(View view, MsgrCallControlsView msgrCallControlsView) {
        int indexOfChild = msgrCallControlsView.indexOfChild(view);
        if (indexOfChild >= 0) {
            Ig0 ig0 = (Ig0) ((8Lu) msgrCallControlsView.A00.A02.get(indexOfChild)).A00;
            11T.A0F(ig0, 0);
            ((GrN) msgrCallControlsView.A07.getValue()).A0f(ig0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02(X.8Lu r302, int r303) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.active.callcontrols.ui.MsgrCallControlsView.A02(X.8Lu, int):void");
    }

    private final void A03(GjU gjU, int i) {
        if (gjU.A03) {
            View childAt = getChildAt(i);
            childAt.setAlpha(0.0f);
            childAt.setTranslationY((DKC.A03(this) * 1.0f) + gjU.A00);
            float f = this.A04;
            childAt.setTranslationX((f * (-1.0f)) + ((f / (getChildCount() / 2)) * i));
        }
    }

    public void A05(Gz5 gz5, boolean z) {
        11T.A0F(gz5, 0);
        GrN grN = (GrN) this.A07.getValue();
        C01i c01i = grN.A0c;
        if (GOo.A1Z(gz5, GOn.A0r(c01i).A0A) || GOo.A1Z(gz5, GOn.A0r(c01i).A0D)) {
            GrN.A00(grN);
            return;
        }
        if (gz5.equals(GOn.A0r(c01i).Aye())) {
            int i = 2131967622;
            if (z) {
                i = 2131962011;
            }
            JFq jFq = ((GS2) grN).A00;
            if (AbM.A1a(jFq)) {
                ((JPU) AbM.A0r(jFq)).A8T(GOn.A0r(c01i).Aye(), i);
                return;
            }
            return;
        }
        if (gz5.equals(GOn.A0r(c01i).BJn())) {
            return;
        }
        if (!GOo.A1Z(gz5, GOn.A0r(c01i).A0F)) {
            if (!GOo.A1Z(gz5, GOn.A0r(c01i).A0G)) {
                throw 1BL.A0h(gz5, "Button check not handled: ", AnonymousClass001.A0k());
            }
            ((JPU) GS2.A05(grN)).BLN();
            GOp.A0s(grN.A07).A0c();
            GOp.A0h(grN.A0M).BZn("SWITCH_CAMERA");
            return;
        }
        ((I3o) 1Br.A0B(grN.A0I)).A02(z, 0S2.A0C);
        ((I4x) 1Br.A0B(grN.A0J)).A03(z);
        AbstractC2326GOr.A1E(grN.A0M.A00, z);
        int i2 = 2131957552;
        if (z) {
            i2 = 2131957553;
        }
        JFq jFq2 = ((GS2) grN).A00;
        if (AbM.A1a(jFq2)) {
            ((JPU) AbM.A0r(jFq2)).A8T(GOn.A0r(c01i).Aye(), i2);
        }
        GrN.A01(grN);
    }

    public final void A8T(Gz5 gz5, int i) {
        11T.A0F(gz5, 0);
        Iterator it = this.A00.A02.iterator();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (!it.hasNext()) {
                View childAt = getChildAt(i2);
                if (childAt != null) {
                    C2cd.A05(childAt, DKD.A0q(this, i));
                    return;
                }
                return;
            }
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            if (11T.A0O(((8Lu) next).A00, gz5)) {
                i2 = i4;
            }
            i3 = i5;
        }
    }

    public void BLN() {
        if (1Br.A07(((Hne) 1Bn.A0E(4YU.A08(this), (1BY) null, 83981)).A00).AZk(2342155480234463641L)) {
            try {
                performHapticFeedback(3);
            } catch (IllegalArgumentException e) {
                4zI.A03.A02("MsgrCallControls", "Unable to perform haptic feedback", e, AnonymousClass001.A1Z());
            }
        }
    }

    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        float f;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        float f2;
        ViewPropertyAnimator alpha;
        View childAt;
        C2639Gjt c2639Gjt = (C2639Gjt) jdb;
        11T.A0F(c2639Gjt, 0);
        getLayoutParams().height = c2639Gjt.A01;
        GjU gjU = c2639Gjt.A02;
        11T.A0F(gjU, 0);
        Iterator it = this.A00.A02.iterator();
        List list = gjU.A02;
        Iterator it2 = list.iterator();
        int[] iArr = this.A03;
        if (iArr == null || iArr.length != list.size()) {
            this.A03 = new int[list.size()];
        }
        int i = 0;
        while (it.hasNext() && it2.hasNext() && i < getChildCount() && (childAt = getChildAt(i)) != null) {
            8Lu r0 = (8Lu) it.next();
            8Lu r02 = (8Lu) it2.next();
            Object obj = r0.A00;
            Ig0 ig0 = (Ig0) r02.A00;
            if (!7zL.A1X(obj, ig0)) {
                int[] iArr2 = this.A03;
                if (iArr2 == null) {
                    break;
                }
                iArr2[i] = childAt.getId();
                if (r0.A01 != r02.A01) {
                    A02(r02, i);
                }
                i++;
            } else {
                View A00 = A00(ig0);
                int[] iArr3 = this.A03;
                if (iArr3 == null) {
                    break;
                }
                iArr3[i] = A00.getId();
                removeViewAt(i);
                addView(A00, i);
                A02(r02, i);
                A03(gjU, i);
                i++;
            }
        }
        while (it.hasNext()) {
            it.next();
            removeViewAt(i);
        }
        while (true) {
            if (it2.hasNext()) {
                8Lu r03 = (8Lu) it2.next();
                View A002 = A00((Ig0) r03.A00);
                int[] iArr4 = this.A03;
                if (iArr4 == null) {
                    break;
                }
                iArr4[i] = A002.getId();
                addView(A002, i);
                A02(r03, i);
                A03(gjU, i);
                i++;
            } else {
                int[] iArr5 = this.A03;
                if (iArr5 != null) {
                    if (iArr5.length != 0) {
                        C01i c01i = this.A06;
                        ((5XE) c01i.getValue()).A0C(this);
                        int[] iArr6 = this.A03;
                        if (iArr6 != null) {
                            for (int i2 : iArr6) {
                                ((5XE) c01i.getValue()).A09(i2, 3, 0, 3);
                                ((5XE) c01i.getValue()).A09(i2, 4, 0, 4);
                            }
                            5XE r04 = (5XE) c01i.getValue();
                            int[] iArr7 = this.A03;
                            if (iArr7 != null) {
                                int length = iArr7.length;
                                if (length < 2) {
                                    throw AnonymousClass001.A0L("must have 2 or more widgets in a chain");
                                }
                                5XE.A02(r04, iArr7[0]).A03.A0Y = 0;
                                int i3 = iArr7[0];
                                float f3 = 0.0f / 0.0f;
                                HashMap hashMap = r04.A00;
                                C7sj c7sj = (C7sj) hashMap.get(AbstractC2326GOr.A0c(hashMap, i3));
                                if (c7sj != null) {
                                    C7ua c7ua = c7sj.A03;
                                    c7ua.A0a = 0;
                                    c7ua.A0b = -1;
                                    c7ua.A0Z = -1;
                                }
                                int i4 = 1;
                                do {
                                    int i5 = iArr7[i4];
                                    int i6 = i4 - 1;
                                    int i7 = iArr7[i6];
                                    C7sj c7sj2 = (C7sj) hashMap.get(AbstractC2326GOr.A0c(hashMap, i5));
                                    if (c7sj2 != null) {
                                        C7ua c7ua2 = c7sj2.A03;
                                        c7ua2.A0b = i7;
                                        c7ua2.A0a = -1;
                                        c7ua2.A0Z = -1;
                                    }
                                    int i8 = iArr7[i6];
                                    int i9 = iArr7[i4];
                                    C7sj c7sj3 = (C7sj) hashMap.get(AbstractC2326GOr.A0c(hashMap, i8));
                                    if (c7sj3 != null) {
                                        C7ua c7ua3 = c7sj3.A03;
                                        c7ua3.A0k = i9;
                                        c7ua3.A0l = -1;
                                        c7ua3.A0j = -1;
                                    }
                                    i4++;
                                } while (i4 < length);
                                C7sj c7sj4 = (C7sj) hashMap.get(AbstractC2326GOr.A0c(hashMap, iArr7[length - 1]));
                                if (c7sj4 != null) {
                                    C7ua c7ua4 = c7sj4.A03;
                                    c7ua4.A0l = 0;
                                    c7ua4.A0k = -1;
                                    c7ua4.A0j = -1;
                                }
                                ((5XE) c01i.getValue()).A0A(this);
                            }
                        }
                    }
                    boolean z = this.A00.A03;
                    boolean z2 = gjU.A03;
                    if (z != z2) {
                        float f4 = 1.0f;
                        if (z2) {
                            f = DKC.A03(this) * 1.0f;
                            f4 = 0.0f;
                        } else {
                            f = 0.0f;
                        }
                        07I it3 = 07C.A07(0, getChildCount()).iterator();
                        while (it3.hasNext()) {
                            int A003 = it3.A00();
                            View childAt2 = getChildAt(A003);
                            if (childAt2 != null && (animate = childAt2.animate()) != null && (translationY = animate.translationY(f)) != null) {
                                if (z2) {
                                    float f5 = this.A04;
                                    f2 = (f5 * (-1.0f)) + ((f5 / (getChildCount() / 2)) * A003);
                                } else {
                                    f2 = 0.0f;
                                }
                                ViewPropertyAnimator translationX = translationY.translationX(f2);
                                if (translationX != null && (alpha = translationX.alpha(f4)) != null) {
                                    alpha.setInterpolator(new DecelerateInterpolator());
                                }
                            }
                        }
                    }
                    this.A00 = gjU;
                    if (this.A02) {
                        setTranslationY(0.0f);
                        return;
                    }
                    GOo.A1C(this);
                    float A03 = c2639Gjt.A03 ? (DKC.A03(this) * 1.0f) + gjU.A00 : 0.0f;
                    if (getTranslationY() != A03) {
                        animate().translationY(A03).setInterpolator(new DecelerateInterpolator()).setListener(this.A05);
                        return;
                    }
                    return;
                }
            }
        }
        11T.A0L("buttonViewIdArray");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1032448302);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A07);
        0FI.A0C(-119783135, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1256338012);
        super.onDetachedFromWindow();
        AbI.A1X(this.A07);
        0FI.A0C(1620424819, A06);
    }
}
