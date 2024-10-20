package com.facebook.common.draggableview;

import X.0Be;
import X.0FI;
import X.0Pz;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.C00j;
import X.C2626GjK;
import X.GY1;
import X.GfU;
import X.GvB;
import X.Ioy;
import X.JKw;
import X.JiS;
import X.Kuo;
import X.L0V;
import X.L3C;
import X.LDR;
import X.MIh;
import X.QzK;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: DraggableViewContainer.class */
public class DraggableViewContainer extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Point A09;
    public View A0A;
    public Integer A0B;
    public 0Be A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public ViewGroup.LayoutParams A0G;
    public Integer A0H;
    public boolean A0I;
    public final Kuo A0J;
    public final Kuo A0K;
    public final List A0L;
    public final GestureDetector A0M;
    public final GvB A0N;
    public final L3C A0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableViewContainer(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        L3C l3c = new L3C(new L0V(Choreographer.getInstance()));
        this.A0O = l3c;
        Kuo A01 = l3c.A01();
        11T.A0D(A01);
        A01.A02 = 0.3d;
        A01.A00 = 0.3d;
        this.A0J = A01;
        Kuo A012 = l3c.A01();
        11T.A0D(A012);
        A012.A02 = 0.3d;
        A012.A00 = 0.3d;
        this.A0K = A012;
        this.A0N = new GvB(this);
        this.A0B = 0S2.A0C;
        this.A0M = new GestureDetector(context, (GestureDetector.OnGestureListener) new GfU(this));
        this.A0L = new ArrayList();
    }

    public /* synthetic */ DraggableViewContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final C2626GjK A00(DraggableViewContainer draggableViewContainer) {
        return new C2626GjK((draggableViewContainer.A02 / 2) + draggableViewContainer.A05, (draggableViewContainer.A01 / 2) + draggableViewContainer.A08, (draggableViewContainer.getWidth() - draggableViewContainer.A07) - (draggableViewContainer.A02 / 2), (draggableViewContainer.getHeight() - draggableViewContainer.A00) - (draggableViewContainer.A01 / 2));
    }

    private final void A01() {
        0fH.A0j("DraggableViewContainer", "Ending animations");
        this.A0D = false;
        Kuo kuo = this.A0J;
        kuo.A01(kuo.A01);
        Kuo kuo2 = this.A0K;
        kuo2.A01(kuo2.A01);
        LDR.A02(this);
    }

    private final void A02() {
        this.A0J.A01(0.0d);
        this.A0K.A01(0.0d);
        View view = this.A0A;
        if (view != null) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e4, code lost:
    
        if (r321 != false) goto L146;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(android.graphics.Point r301, android.view.View r302, X.C2626GjK r303, com.facebook.common.draggableview.DraggableViewContainer r304, java.lang.Integer r305, int r306, int r307, int r308, int r309, int r310, int r311, boolean r312) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.draggableview.DraggableViewContainer.A03(android.graphics.Point, android.view.View, X.GjK, com.facebook.common.draggableview.DraggableViewContainer, java.lang.Integer, int, int, int, int, int, int, boolean):void");
    }

    private final void A04(C2626GjK c2626GjK, boolean z) {
        C00j.A05("DraggableViewContainer.moveToFrame", 655361040);
        try {
            View view = this.A0A;
            if (view != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating for transition to frame: ");
                sb.append(c2626GjK);
                sb.append(", shouldAnimate: ");
                sb.append(z);
                0fH.A0j("DraggableViewContainer", sb.toString());
                A02();
                if (z) {
                    C00j.A05("DraggableViewContainer.beginDelayedTransition", 1670718631);
                    try {
                        JiS jiS = new JiS();
                        jiS.A0T(200L);
                        jiS.A0I(new GY1(this));
                        LDR.A03(this, jiS);
                        C00j.A01(-498801123);
                    } catch (Throwable th) {
                        C00j.A01(107486168);
                        throw th;
                    }
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                11T.A0I(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = c2626GjK.A01;
                marginLayoutParams.leftMargin = i;
                int i2 = c2626GjK.A03;
                marginLayoutParams.topMargin = i2;
                int width = getWidth();
                int i3 = c2626GjK.A02;
                marginLayoutParams.rightMargin = width - i3;
                marginLayoutParams.bottomMargin = getHeight() - i3;
                ((ViewGroup.LayoutParams) marginLayoutParams).width = i3 - i;
                ((ViewGroup.LayoutParams) marginLayoutParams).height = c2626GjK.A00 - i2;
                view.setLayoutParams(marginLayoutParams);
            }
            C00j.A01(1161051742);
        } catch (Throwable th2) {
            C00j.A01(1911307671);
            throw th2;
        }
    }

    public static final void A05(DraggableViewContainer draggableViewContainer, Double d, Double d2, int i, int i2) {
        if (draggableViewContainer.A0A != null) {
            0fH.A0l("DraggableViewContainer", 0Pz.A0C(i, i2, "Finish dragging with targetX=", ", targetY="));
            C2626GjK A00 = A00(draggableViewContainer);
            int i3 = A00.A01;
            int i4 = A00.A02;
            int i5 = i3;
            if (Math.abs(i - i3) >= Math.abs(i - i4)) {
                i5 = i4;
            }
            int i6 = A00.A03;
            int i7 = A00.A00;
            int i8 = i6;
            if (Math.abs(i2 - i6) >= Math.abs(i2 - i7)) {
                i8 = i7;
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Setting to nearest corner x=");
            A0k.append(i5);
            A0k.append(", y=");
            A0k.append(i8);
            1BL.A1I(A00, ", bounds=", "DraggableViewContainer", A0k);
            boolean z = true;
            boolean A1Q = AnonymousClass001.A1Q(i5, i3);
            if (i8 != i6) {
                z = false;
            }
            A06(draggableViewContainer, A1Q ? z ? 0S2.A01 : 0S2.A0N : z ? 0S2.A0C : 0S2.A0Y, false, false);
            if (d != null) {
                draggableViewContainer.A0J.A03(d.doubleValue());
            }
            if (d2 != null) {
                draggableViewContainer.A0K.A03(d2.doubleValue());
            }
            draggableViewContainer.A0J.A02(r0.getTranslationX() + (i - ((int) (((r0.getLeft() + r0.getRight()) / 2) + r0.getTranslationX()))));
            draggableViewContainer.A0K.A02(r0.getTranslationY() + (i2 - ((int) (((r0.getTop() + r0.getBottom()) / 2) + r0.getTranslationY()))));
        }
    }

    public static final void A06(DraggableViewContainer draggableViewContainer, Integer num, boolean z, boolean z2) {
        C00j.A05("DraggableViewContainer.setCorner", -711763862);
        try {
            Integer num2 = draggableViewContainer.A0B;
            if (num2 != num) {
                0fH.A0j("DraggableViewContainer", 0Pz.A0v("Updating corner from ", num2 != null ? QzK.A00(num2) : "null", " to ", QzK.A00(num)));
                draggableViewContainer.A0B = num;
                if (z) {
                    A07(draggableViewContainer, z2);
                }
            }
            C00j.A01(-1287657697);
        } catch (Throwable th) {
            C00j.A01(285698293);
            throw th;
        }
    }

    public static final void A07(DraggableViewContainer draggableViewContainer, boolean z) {
        int i;
        int i2;
        Point point;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Point point2;
        if (draggableViewContainer.A0D) {
            return;
        }
        if (draggableViewContainer.A0B != 0S2.A00 || (point2 = draggableViewContainer.A09) == null) {
            C2626GjK A00 = A00(draggableViewContainer);
            int intValue = draggableViewContainer.A0B.intValue();
            if (intValue == 1) {
                i = A00.A01;
            } else if (intValue != 2) {
                if (intValue == 3) {
                    i = A00.A01;
                } else if (intValue == 4) {
                    i = A00.A02;
                } else {
                    if (intValue != 0) {
                        throw 1BK.A1F();
                    }
                    Point point3 = draggableViewContainer.A09;
                    int i8 = 0;
                    if (point3 != null) {
                        i7 = point3.x;
                        i8 = point3.y;
                    } else {
                        i7 = 0;
                    }
                    point = new Point(i7, i8);
                    int i9 = point.x;
                    int i10 = draggableViewContainer.A02 / 2;
                    i3 = i9 - i10;
                    int i11 = point.y;
                    int i12 = draggableViewContainer.A01 / 2;
                    i4 = i11 - i12;
                    i5 = i9 + i10;
                    i6 = i11 + i12;
                }
                i2 = A00.A00;
                point = new Point(i, i2);
                int i92 = point.x;
                int i102 = draggableViewContainer.A02 / 2;
                i3 = i92 - i102;
                int i112 = point.y;
                int i122 = draggableViewContainer.A01 / 2;
                i4 = i112 - i122;
                i5 = i92 + i102;
                i6 = i112 + i122;
            } else {
                i = A00.A02;
            }
            i2 = A00.A03;
            point = new Point(i, i2);
            int i922 = point.x;
            int i1022 = draggableViewContainer.A02 / 2;
            i3 = i922 - i1022;
            int i1122 = point.y;
            int i1222 = draggableViewContainer.A01 / 2;
            i4 = i1122 - i1222;
            i5 = i922 + i1022;
            i6 = i1122 + i1222;
        } else {
            i3 = point2.x;
            i4 = point2.y;
            i5 = i3 + draggableViewContainer.A02;
            i6 = i4 + draggableViewContainer.A01;
        }
        draggableViewContainer.A04(new C2626GjK(i3, i4, i5, i6), z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view = this.A0A;
        boolean z = false;
        if (view != null && motionEvent != null && this.A06 == 0) {
            float x = motionEvent.getX() - view.getTranslationX();
            float y = motionEvent.getY() - view.getTranslationY();
            if (this.A0I || (view.getLeft() <= x && x <= view.getRight() && view.getTop() <= y && y <= view.getBottom())) {
                z = super.dispatchTouchEvent(motionEvent);
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(652006985);
        super.onAttachedToWindow();
        Kuo kuo = this.A0J;
        MIh mIh = this.A0N;
        kuo.A05(mIh);
        this.A0K.A05(mIh);
        0FI.A0C(1926936154, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-600353369);
        A01();
        Kuo kuo = this.A0J;
        GvB gvB = this.A0N;
        if (gvB == null) {
            throw AnonymousClass001.A0L("listenerToRemove is required");
        }
        kuo.A0D.remove(gvB);
        this.A0K.A0D.remove(gvB);
        super.onDetachedFromWindow();
        0FI.A0C(-265175903, A06);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0F) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A06 > 0) {
            A02();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-1577179644);
        super.onSizeChanged(i, i2, i3, i4);
        StringBuilder sb = new StringBuilder();
        sb.append("onSizeChanged: (");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") -> (");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(')');
        0fH.A0j("DraggableViewContainer", sb.toString());
        A01();
        post(new Ioy(this));
        0Be r0 = this.A0C;
        if (r0 != null) {
            r0.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        0FI.A0C(-1056570532, A06);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = 0FI.A05(-888600730);
        boolean z = false;
        if (motionEvent == null || this.A0E) {
            i = -98724687;
        } else {
            int action = motionEvent.getAction();
            if (action == 0) {
                requestDisallowInterceptTouchEvent(true);
                this.A0I = true;
                1BL.A1I(motionEvent, "Begin dragging with ", "DraggableViewContainer", AnonymousClass001.A0k());
                Iterator it = this.A0L.iterator();
                while (it.hasNext()) {
                    ((JKw) it.next()).AND(motionEvent.getX(), motionEvent.getY());
                }
            } else if (action == 1 || action == 3) {
                requestDisallowInterceptTouchEvent(false);
                this.A0I = false;
                1BL.A1I(motionEvent, "End dragging with ", "DraggableViewContainer", AnonymousClass001.A0k());
                Iterator it2 = this.A0L.iterator();
                while (it2.hasNext()) {
                    ((JKw) it2.next()).ANE(motionEvent.getX(), motionEvent.getY());
                }
            }
            z = this.A0M.onTouchEvent(motionEvent);
            View view = this.A0A;
            if (view != null && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !z)) {
                C2626GjK A00 = A00(this);
                int left = (int) (((view.getLeft() + view.getRight()) / 2) + view.getTranslationX());
                int i2 = A00.A01;
                int i3 = A00.A02;
                if (Math.abs(left - i2) >= Math.abs(left - i3)) {
                    i2 = i3;
                }
                int top = (int) (((view.getTop() + view.getBottom()) / 2) + view.getTranslationY());
                int i4 = A00.A03;
                int i5 = A00.A00;
                if (Math.abs(top - i4) >= Math.abs(top - i5)) {
                    i4 = i5;
                }
                A05(this, null, null, i2, i4);
            }
            i = -1022691056;
        }
        0FI.A0B(i, A05);
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        int i;
        C00j.A05("DraggableViewContainer.removeView", -1602354141);
        if (view != null) {
            try {
                View view2 = this.A0A;
                if (view2 != null && view2 == view) {
                    A01();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Removing ");
                    sb.append(view);
                    0fH.A0l("DraggableViewContainer", sb.toString());
                    ViewGroup.LayoutParams layoutParams = this.A0G;
                    if (layoutParams != null) {
                        view.setLayoutParams(layoutParams);
                    }
                    this.A0G = null;
                    A02();
                    super.removeView(this.A0A);
                    this.A0A = null;
                    i = 648716430;
                    C00j.A01(i);
                }
            } catch (Throwable th) {
                C00j.A01(-1240913838);
                throw th;
            }
        }
        i = 497492323;
        C00j.A01(i);
    }
}
