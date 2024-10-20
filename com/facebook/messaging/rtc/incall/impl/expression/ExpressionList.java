package com.facebook.messaging.rtc.incall.impl.expression;

import X.0FI;
import X.11T;
import X.1Bn;
import X.1Br;
import X.1Lm;
import X.2yD;
import X.7zM;
import X.AKX;
import X.AbI;
import X.C00i;
import X.C01g;
import X.C01i;
import X.DKF;
import X.DKG;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GWo;
import X.GWy;
import X.HAU;
import X.HAl;
import X.HCR;
import X.HG5;
import X.HQ0;
import X.I8A;
import X.IEo;
import X.IKu;
import X.IMJ;
import X.IML;
import X.IPz;
import X.IZn;
import X.JDB;
import X.JFq;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ExpressionList.class */
public final class ExpressionList extends RecyclerView implements JFq {
    public int A00;
    public GWo A01;
    public int A02;
    public final ViewTreeObserver.OnGlobalLayoutListener A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C01i A06;
    public final FbUserSession A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressionList(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressionList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressionList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A05 = 7zM.A0e(context);
        this.A06 = C01g.A01(new AKX(context, this, 38));
        FbUserSession A03 = 1Br.A03(this.A05);
        this.A07 = A03;
        this.A04 = GOn.A0d(context, A03);
        this.A03 = new IKu(this, 2);
        setImportantForAccessibility(1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        linearLayoutManager.A0f();
        A1D(linearLayoutManager);
        setNestedScrollingEnabled(false);
        A1B(new GWy(this));
        A1A(null);
        setClipChildren(false);
    }

    public /* synthetic */ ExpressionList(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r0.A0D() != X.HCR.A04) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.rtc.incall.impl.expression.ExpressionList r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A04
            X.IML r0 = X.GOp.A0W(r0)
            r302 = r0
            r0 = r302
            X.HAU r0 = r0.A02
            r303 = r0
            X.HAU r0 = X.HAU.A04
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L27
            r0 = r302
            X.HCR r0 = r0.A0D()
            r303 = r0
            X.HCR r0 = X.HCR.A04
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L2a
        L27:
            r0 = 1
            r305 = r0
        L2a:
            r0 = r302
            X.HAU r0 = r0.A02
            r303 = r0
            X.HAU r0 = X.HAU.A02
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L49
            r0 = r302
            X.HCR r0 = r0.A0D()
            r303 = r0
            X.HCR r0 = X.HCR.A01
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L49
            r0 = 0
            r305 = r0
        L49:
            r0 = r301
            X.2XA r0 = r0.A0F
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5c
            r0 = r304
            r1 = r305
            r2 = 0
            r0.Cjt(r1, r2)
        L5c:
            r0 = r301
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r303 = r0
            r0 = r301
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r0.A03
            r304 = r0
            r0 = r303
            r1 = r304
            r0.removeOnGlobalLayoutListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.expression.ExpressionList.A00(com.facebook.messaging.rtc.incall.impl.expression.ExpressionList):void");
    }

    public static final void A01(ExpressionList expressionList, int i) {
        View childAt = expressionList.getChildAt(0);
        if (childAt != null) {
            expressionList.A02 = ((expressionList.getWidth() / 2) - expressionList.getPaddingLeft()) - (childAt.getWidth() / 2);
        }
        IML A0W = GOp.A0W(expressionList.A04);
        if (A0W.A02 == HAU.A06) {
            1Br.A0C(A0W.A0R);
        }
        if (A0W.A09(A0W.A0B()) == 0) {
            A00(expressionList);
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) expressionList.A0F;
            if (linearLayoutManager != null) {
                linearLayoutManager.Cjt(i, expressionList.A02);
            }
        }
        expressionList.getViewTreeObserver().removeOnGlobalLayoutListener(expressionList.A03);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void A10(int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        if (this.A01 != null) {
            C00i c00i = this.A04.A00;
            HCR A0D = GOo.A0U(c00i).A0D();
            HCR hcr = HCR.A0L;
            if ((A0D == hcr || GOo.A0U(c00i).A0D() == HCR.A0D) && (linearLayoutManager = (LinearLayoutManager) this.A0F) != null) {
                int A1j = linearLayoutManager.A1j();
                IML A0U = GOo.A0U(c00i);
                GWo gWo = this.A01;
                11T.A0I(gWo, "null cannot be cast to non-null type com.facebook.rtc.expression.expressionlist.RtcExpressionCircularEffectsAdapter");
                int size = gWo.A00.size();
                if (A0U.A0D() == hcr) {
                    int A00 = 2yD.A00(1Br.A07(((HQ0) 1Br.A0B(A0U.A0i)).A00), 36595646802889417L);
                    if (A0U.A08 || size >= A00 || A1j + 2yD.A00(I8A.A01(A0U.A0h.A00), 36597351907003970L) < size) {
                        return;
                    }
                    A0U.A08 = true;
                    ((IPz) 1Br.A0B(A0U.A0l)).A09(HAl.A0D, 0);
                    return;
                }
                if (A0U.A0D() == HCR.A0D) {
                    C00i c00i2 = A0U.A0h.A00;
                    int A002 = 2yD.A00(I8A.A01(c00i2), 36597351906741824L);
                    if (A0U.A07 || size >= A002 || A1j + 2yD.A00(I8A.A01(c00i2), 36597351907003970L) < size) {
                        return;
                    }
                    A0U.A07 = true;
                    ((IPz) 1Br.A0B(A0U.A0l)).A08(HAl.A0D, 0);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean A1M(int i, int i2) {
        return super.A1M((int) (i * 0.35f), i2);
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        IZn iZn = (IZn) jdb;
        11T.A0F(iZn, 0);
        HAU A00 = iZn.A00();
        11T.A0A(A00);
        if (A00 != HAU.A07) {
            GWo gWo = this.A01;
            if (gWo == null) {
                1Bn.A0A(147916);
                gWo = new GWo(getContext());
                this.A01 = gWo;
            }
            if (this.A0C != gWo) {
                A16(gWo);
            }
            Integer num = iZn.A01;
            if (num != null) {
                A01(this, num.intValue());
            }
            setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1778923456);
        super.onAttachedToWindow();
        AbI.A1S(this, this.A06);
        GWo gWo = this.A01;
        if (gWo != null) {
            FbUserSession A0H = GOo.A0H(gWo);
            Context context = gWo.A05;
            IPz iPz = (IPz) 1Lm.A05(context, A0H, 114831);
            iPz.A0W.add(gWo);
            iPz.A0V.add(gWo);
            IMJ imj = (IMJ) 1Lm.A05(context, A0H, 98491);
            HG5 hg5 = gWo.A07;
            imj.A08(hg5);
            ((IEo) 1Lm.A05(context, A0H, 100046)).A0B(gWo.A0J);
            GWo.A04(gWo);
            hg5.A01();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.A03);
        0FI.A0C(-1267630556, A06);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1554824685);
        AbI.A1X(this.A06);
        A16(null);
        GWo gWo = this.A01;
        if (gWo != null) {
            FbUserSession A0H = GOo.A0H(gWo);
            Context context = gWo.A05;
            IPz iPz = (IPz) 1Lm.A05(context, A0H, 114831);
            iPz.A0W.remove(gWo);
            iPz.A0V.remove(gWo);
            ((IMJ) 1Lm.A05(context, A0H, 98491)).A09(gWo.A07);
            ((IEo) 1Lm.A05(context, A0H, 100046)).A0C(gWo.A0J);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.A03);
        super.onDetachedFromWindow();
        0FI.A0C(387463164, A06);
    }
}
