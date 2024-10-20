package com.facebook.browser.lite.search.ui.facebook.webview;

import X.0Cm;
import X.0Co;
import X.11T;
import X.5OJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.facebook.common.dextricks.Constants;
import com.facebook.secure.securewebview.SecureWebView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: NestedScrollSecureWebView.class */
public final class NestedScrollSecureWebView extends SecureWebView implements 0Cm {
    public static float A0E;
    public static final float A0F = (float) (Math.log(0.78d) / Math.log(0.9d));
    public int A00;
    public int A01;
    public VelocityTracker A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public final EdgeEffect A08;
    public final EdgeEffect A09;
    public final OverScroller A0A;
    public final 0Co A0B;
    public final int[] A0C;
    public final int[] A0D;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestedScrollSecureWebView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestedScrollSecureWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollSecureWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        0Co r0 = new 0Co(this);
        this.A0B = r0;
        this.A0C = new int[2];
        this.A0D = new int[2];
        this.A00 = -1;
        this.A09 = 5OJ.A02(context, attributeSet);
        this.A08 = 5OJ.A02(context, attributeSet);
        Context context2 = getContext();
        this.A0A = new OverScroller(context2);
        A0E = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setFocusable(true);
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.A07 = viewConfiguration.getScaledTouchSlop();
        this.A05 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A04 = viewConfiguration.getScaledMaximumFlingVelocity();
        r0.A04(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public /* synthetic */ NestedScrollSecureWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final boolean A00(EdgeEffect edgeEffect, int i) {
        boolean z = true;
        if (i <= 0) {
            float A00 = 5OJ.A00(edgeEffect) * getHeight();
            float abs = Math.abs(-i) * 0.35f;
            float f = A0E * 0.015f;
            float log = (float) Math.log(abs / f);
            double d = A0F;
            if (((float) (f * Math.exp((d / (d - 1.0d)) * log))) >= A00) {
                z = false;
            }
        }
        return z;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0B.A06(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0B.A05(f, f2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.A0B.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x06ee, code lost:
    
        if (r301.A03 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x072d, code lost:
    
        if (r301.A0A.springBack(getScrollX(), getScrollY(), 0, 0, 0, computeVerticalScrollRange()) != false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0453  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.search.ui.facebook.webview.NestedScrollSecureWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
