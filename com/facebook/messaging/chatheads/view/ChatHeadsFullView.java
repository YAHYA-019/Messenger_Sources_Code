package com.facebook.messaging.chatheads.view;

import X.0FI;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bf;
import X.1Bi;
import X.1Bn;
import X.1HH;
import X.1iG;
import X.2Oc;
import X.AbE;
import X.AmX;
import X.C00i;
import X.C09s;
import X.C1F6;
import X.DKC;
import X.JQy;
import X.JSl;
import X.JU4;
import X.Kf1;
import X.Kf2;
import X.Kf3;
import X.Kf7;
import X.Kuq;
import X.L2O;
import X.LKO;
import X.ML5;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.chatheads.view.ChatHeadCloseTargetView;
import com.facebook.chatheads.view.bubble.BubbleView;
import com.facebook.common.ui.keyboard.CustomKeyboardLayout;
import com.facebook.inject.FbInjector;
import com.facebook.widget.OverlayLayout;
import com.google.common.collect.ImmutableList;

/* loaded from: ChatHeadsFullView.class */
public class ChatHeadsFullView extends OverlayLayout implements 2Oc {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ChatHeadCloseTargetView A04;
    public C00i A05;
    public Kf1 A06;
    public Kf2 A07;
    public Kf3 A08;
    public L2O A09;
    public Integer A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public C00i A0E;
    public C00i A0F;
    public JSl A0G;
    public final Rect A0H;
    public final FrameLayout A0I;
    public final BubbleView A0J;
    public final CustomKeyboardLayout A0K;
    public final Rect A0L;
    public final View A0M;
    public final ViewStub A0N;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatHeadsFullView(Context context) {
        super(context);
        this.A0H = DKC.A0C();
        this.A0L = DKC.A0C();
        this.A0E = 1BV.A00(946);
        this.A05 = 1BQ.A02(16432);
        this.A0F = new 1HH(context, 68747);
        if (1BK.A0K().AZk(2342165715139774252L)) {
            ((1iG) 1Bi.A03(66389)).A00();
        }
        setContentView(2132542865);
        setId(2131362383);
        View A01 = C09s.A01(this, 2131362340);
        this.A03 = A01;
        LKO.A01(A01, this, 64);
        C1F6 c1f6 = (C1F6) this.A0E.get();
        View view = this.A03;
        Context A00 = 1Bf.A00(c1f6);
        try {
            L2O l2o = new L2O(view);
            1Bn.A0K();
            FbInjector.A04(A00);
            this.A09 = l2o;
            this.A0M = C09s.A01(this, R.id.content);
            BubbleView bubbleView = (BubbleView) C09s.A01(this, 2131362687);
            this.A0J = bubbleView;
            this.A0I = (FrameLayout) C09s.A01(this, 2131362976);
            this.A0N = (ViewStub) C09s.A01(this, 2131363059);
            this.A0K = (CustomKeyboardLayout) C09s.A01(this, 2131363501);
            bubbleView.A0D = new Kf7(this);
            Resources resources = getResources();
            this.A00 = resources.getDimensionPixelOffset(2131165194);
            this.A0D = resources.getDimensionPixelSize(2132279326);
            this.A01 = resources.getDimensionPixelSize(2132279447) + resources.getDimensionPixelOffset(2132279303);
            this.A02 = resources.getDimensionPixelOffset(2132279448) + resources.getDimensionPixelOffset(2132279303);
            bubbleView.setVisibility(8);
            if (Build.VERSION.SDK_INT >= 29) {
                this.A0G = new JSl(this);
            }
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    public static void A00(ChatHeadsFullView chatHeadsFullView) {
        BubbleView bubbleView = chatHeadsFullView.A0J;
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(bubbleView.A05);
        A0I.topMargin = 0;
        bubbleView.A05.setLayoutParams(A0I);
        bubbleView.A06.setVisibility(8);
        chatHeadsFullView.A0I.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(ChatHeadsFullView chatHeadsFullView) {
        BubbleView bubbleView = chatHeadsFullView.A0J;
        bubbleView.A06.setVisibility(8);
        int i = chatHeadsFullView.A0D;
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(bubbleView.A05);
        A0I.topMargin = i;
        bubbleView.A05.setLayoutParams(A0I);
        chatHeadsFullView.A0C = true;
        chatHeadsFullView.setChildrenDrawingOrderEnabled(true);
        chatHeadsFullView.A0I.setForeground(new ColorDrawable(chatHeadsFullView.getContext().getColor(2132213826)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A02(ChatHeadsFullView chatHeadsFullView) {
        BubbleView bubbleView = chatHeadsFullView.A0J;
        int i = chatHeadsFullView.A00;
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(bubbleView.A05);
        A0I.topMargin = i;
        bubbleView.A05.setLayoutParams(A0I);
        bubbleView.A06.setVisibility(0);
        FrameLayout frameLayout = chatHeadsFullView.A0I;
        frameLayout.setVisibility(0);
        chatHeadsFullView.A0C = false;
        chatHeadsFullView.setChildrenDrawingOrderEnabled(false);
        frameLayout.setForeground(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(ChatHeadsFullView chatHeadsFullView) {
        Rect rect = chatHeadsFullView.A0H;
        int i = rect.left;
        Rect rect2 = chatHeadsFullView.A0L;
        int max = Math.max(i, rect2.left);
        int max2 = Math.max(rect.top, rect2.top);
        int max3 = Math.max(rect.right, rect2.right);
        View rootView = chatHeadsFullView.getRootView();
        WindowManager.LayoutParams layoutParams = rootView != null ? (WindowManager.LayoutParams) rootView.getLayoutParams() : null;
        boolean z = false;
        if (layoutParams != null && (layoutParams.softInputMode & 240) == 48) {
            z = true;
        }
        int i2 = rect.bottom;
        if (!z) {
            i2 = Math.max(i2, rect2.bottom);
        }
        chatHeadsFullView.A0J.setPadding(max, max2, max3, i2);
        chatHeadsFullView.A0M.setPadding(max, max2, max3, i2);
    }

    public ChatHeadCloseTargetView A04() {
        ChatHeadCloseTargetView chatHeadCloseTargetView = this.A04;
        if (chatHeadCloseTargetView == null) {
            chatHeadCloseTargetView = (ChatHeadCloseTargetView) this.A0N.inflate();
            this.A04 = chatHeadCloseTargetView;
        }
        return chatHeadCloseTargetView;
    }

    public CustomKeyboardLayout AgH() {
        return this.A0K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super/*android.view.ViewGroup*/.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(this, getKeyDispatcherState(), this);
    }

    public boolean fitSystemWindows(Rect rect) {
        this.A0L.set(rect);
        A03(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.A0C) {
            View childAt = getChildAt(i2);
            BubbleView bubbleView = this.A0J;
            if (childAt == bubbleView) {
                return indexOfChild(this.A0I);
            }
            if (getChildAt(i2) == this.A0I) {
                return indexOfChild(bubbleView);
            }
        }
        return super/*android.view.ViewGroup*/.getChildDrawingOrder(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(972105666);
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        this.A0B = true;
        ViewTreeObserver.OnDrawListener onDrawListener = this.A0G;
        if (onDrawListener != null) {
            getViewTreeObserver().addOnDrawListener(onDrawListener);
        }
        0FI.A0C(-1358231923, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1317579951);
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        this.A0B = false;
        ViewTreeObserver.OnDrawListener onDrawListener = this.A0G;
        if (onDrawListener != null) {
            getViewTreeObserver().removeOnDrawListener(onDrawListener);
        }
        0FI.A0C(-63091898, A06);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 && i != 82) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        ML5 A0U;
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        if (i != 4) {
            return i == 82 && (A0U = JQy.A0U(this.A0J)) != null && A0U.C6g();
        }
        ML5 A0U2 = JQy.A0U(this.A0J);
        if (A0U2 != null && A0U2.Bkd()) {
            return true;
        }
        Kf1 kf1 = this.A06;
        String A00 = AbE.A00(5);
        if (kf1 != null) {
            JU4.A0b(kf1.A00);
            return true;
        }
        Kf2 kf2 = this.A07;
        if (kf2 == null) {
            return false;
        }
        kf2.A00.A17(A00);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e5, code lost:
    
        if (r0 != 0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.OverlayLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.chatheads.view.ChatHeadsFullView.onMeasure(int, int):void");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        AmX A01;
        int A06 = 0FI.A06(1652748177);
        Kf3 kf3 = this.A08;
        if (kf3 != null) {
            JU4 ju4 = kf3.A00;
            ju4.A0C = null;
            JU4.A0U(ju4);
            loop0: while (JU4.A03(ju4) > ju4.A07) {
                Kuq kuq = ju4.A1E;
                int size = kuq.A02.size();
                do {
                    size--;
                    if (size < 0) {
                        break loop0;
                    } else {
                        A01 = kuq.A01(size);
                    }
                } while (JU4.A13(ju4, A01.A03));
                JU4.A0p(ju4, ImmutableList.of((Object) A01), "max_chathead_limit");
            }
            JU4.A09(ju4);
        }
        0FI.A0C(-607079599, A06);
    }
}
