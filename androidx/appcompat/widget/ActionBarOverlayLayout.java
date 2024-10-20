package androidx.appcompat.widget;

import X.08D;
import X.08K;
import X.08N;
import X.0Ck;
import X.0Cl;
import X.0ES;
import X.0FI;
import X.1BK;
import X.AnonymousClass001;
import X.C0Cn;
import X.C7ya;
import X.DKC;
import X.GKD;
import X.JUI;
import X.JXc;
import X.JXw;
import X.JZu;
import X.Kru;
import X.LLZ;
import X.LLc;
import X.LLe;
import X.LLh;
import X.LQD;
import X.LjX;
import X.LjY;
import X.MB3;
import X.MHj;
import android.R;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.OverScroller;

/* loaded from: ActionBarOverlayLayout.class */
public class ActionBarOverlayLayout extends ViewGroup implements C7ya, 0Ck, 0Cl {
    public static final Rect A0V;
    public static final 08D A0W;
    public static final int[] A0X = {2130968595, R.attr.windowContentOverlay};
    public int A00;
    public int A01;
    public ViewPropertyAnimator A02;
    public OverScroller A03;
    public ActionBarContainer A04;
    public MB3 A05;
    public GKD A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public Drawable A0B;
    public ContentFrameLayout A0C;
    public 08D A0D;
    public 08D A0E;
    public 08D A0F;
    public 08D A0G;
    public boolean A0H;
    public final AnimatorListenerAdapter A0I;
    public final Rect A0J;
    public final JXc A0K;
    public final Runnable A0L;
    public final Runnable A0M;
    public final Rect A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Rect A0Q;
    public final Rect A0R;
    public final Rect A0S;
    public final Rect A0T;
    public final C0Cn A0U;

    static {
        08K r0 = new 08K();
        0ES r02 = new 0ES(0, 1, 0, 1);
        08N r03 = r0.A00;
        r03.A06(r02);
        A0W = r03.A00();
        A0V = DKC.A0C();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.0Cn, java.lang.Object] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 0;
        this.A0N = DKC.A0C();
        this.A0R = DKC.A0C();
        this.A0P = DKC.A0C();
        this.A0J = DKC.A0C();
        this.A0O = DKC.A0C();
        this.A0S = DKC.A0C();
        this.A0Q = DKC.A0C();
        this.A0T = DKC.A0C();
        08D r0 = 08D.A01;
        this.A0D = r0;
        this.A0F = r0;
        this.A0E = r0;
        this.A0G = r0;
        this.A0I = new JUI(this, 0);
        this.A0M = new LjX(this);
        this.A0L = new LjY(this);
        A00(context);
        this.A0U = new Object();
        View view = new View(context);
        view.setWillNotDraw(true);
        this.A0K = view;
        addView(view);
    }

    private void A00(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0X);
        boolean z = false;
        this.A09 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.A0B = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.A03 = new OverScroller(context);
    }

    public static void A01(ActionBarOverlayLayout actionBarOverlayLayout) {
        GKD A0G;
        if (actionBarOverlayLayout.A0C == null) {
            actionBarOverlayLayout.A0C = (ContentFrameLayout) actionBarOverlayLayout.findViewById(2131361867);
            actionBarOverlayLayout.A04 = (ActionBarContainer) actionBarOverlayLayout.findViewById(2131361868);
            GKD findViewById = actionBarOverlayLayout.findViewById(2131361866);
            if (findViewById instanceof GKD) {
                A0G = findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw 1BK.A0i("Can't make a decor toolbar out of ", AnonymousClass001.A0X(findViewById));
                }
                A0G = ((Toolbar) findViewById).A0G();
            }
            actionBarOverlayLayout.A06 = A0G;
        }
    }

    public void A02() {
        removeCallbacks(this.A0M);
        removeCallbacks(this.A0L);
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void A03(boolean z) {
        if (z != this.A0H) {
            this.A0H = z;
            if (z) {
                return;
            }
            A02();
            A02();
            this.A04.setTranslationY(-Math.max(0, Math.min(0, this.A04.getHeight())));
        }
    }

    @Override // X.C7ya
    public void ANh() {
        LLc lLc;
        A01(this);
        ActionMenuView actionMenuView = this.A06.A09.A0F;
        if (actionMenuView == null || (lLc = actionMenuView.A06) == null) {
            return;
        }
        lLc.A01();
        JZu jZu = lLc.A08;
        if (jZu != null) {
            jZu.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r0.A02() == false) goto L8;
     */
    @Override // X.C7ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BUf() {
        /*
            r301 = this;
            r0 = r301
            A01(r0)
            r0 = r301
            X.GKD r0 = r0.A06
            X.LLh r0 = (X.LLh) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0F
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2a
            r0 = r302
            X.LLc r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2a
            r0 = r302
            boolean r0 = r0.A02()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L2e
        L2a:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L2e:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.BUf():boolean");
    }

    public void C8h(View view, int[] iArr, int i, int i2, int i3) {
    }

    public void C8i(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void C8j(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        C8i(view, i, i2, i3, i4, i5);
    }

    public void C8k(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (onStartNestedScroll(r302, r303, r304) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean CMt(android.view.View r302, android.view.View r303, int r304, int r305) {
        /*
            r301 = this;
            r0 = r305
            if (r0 != 0) goto L16
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            boolean r0 = r0.onStartNestedScroll(r1, r2, r3)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L19
        L16:
            r0 = 0
            r307 = r0
        L19:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.CMt(android.view.View, android.view.View, int, int):boolean");
    }

    public void CNm(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // X.C7ya
    public void CrC(Menu menu, MHj mHj) {
        A01(this);
        LLh lLh = this.A06;
        LLc lLc = lLh.A08;
        if (lLc == null) {
            lLc = new LLc(lLh.A09.getContext());
            lLh.A08 = lLc;
        }
        lLc.A06 = mHj;
        Toolbar toolbar = lLh.A09;
        LQD lqd = (LQD) menu;
        if (lqd == null && toolbar.A0F == null) {
            return;
        }
        Toolbar.A0A(toolbar);
        LQD lqd2 = toolbar.A0F.A05;
        if (lqd2 != lqd) {
            if (lqd2 != null) {
                lqd2.A0C(toolbar.A0E);
                lqd2.A0C(toolbar.A0H);
            }
            if (toolbar.A0H == null) {
                toolbar.A0H = new LLZ(toolbar);
            }
            lLc.A0D = true;
            Context context = toolbar.A05;
            if (lqd != null) {
                lqd.A09(context, lLc);
                lqd.A09(toolbar.A05, toolbar.A0H);
            } else {
                lLc.BP3(context, (LQD) null);
                toolbar.A0H.BP3(toolbar.A05, (LQD) null);
                lLc.D7M(true);
                toolbar.A0H.D7M(true);
            }
            ActionMenuView actionMenuView = toolbar.A0F;
            int i = toolbar.A02;
            if (actionMenuView.A02 != i) {
                actionMenuView.A02 = i;
                actionMenuView.A03 = i == 0 ? actionMenuView.getContext() : new ContextThemeWrapper(actionMenuView.getContext(), i);
            }
            ActionMenuView actionMenuView2 = toolbar.A0F;
            actionMenuView2.A06 = lLc;
            lLc.A07 = actionMenuView2;
            actionMenuView2.A05 = lLc.A05;
            toolbar.A0E = lLc;
            toolbar.A0J();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof JXw;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A0B != null) {
            int bottom = this.A04.getVisibility() == 0 ? (int) (this.A04.getBottom() + this.A04.getTranslationY() + 0.5f) : 0;
            this.A0B.setBounds(0, bottom, getWidth(), this.A0B.getIntrinsicHeight() + bottom);
            this.A0B.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0Cn c0Cn = this.A0U;
        return c0Cn.A01 | c0Cn.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0153, code lost:
    
        if (r312 != false) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r302) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A00(getContext());
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(2033358046);
        super.onDetachedFromWindow();
        A02();
        0FI.A0C(-140243450, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= childCount) {
                return;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams A0I = DKC.A0I(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = A0I.leftMargin + paddingLeft;
                int i8 = A0I.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
            i5 = i6 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Runnable runnable;
        if (!this.A0H || !z) {
            return false;
        }
        this.A03.fling(0, 0, 0, (int) f2, 0, 0, (-1) << (-1), (-1) >>> 1);
        if (this.A03.getFinalY() > this.A04.getHeight()) {
            A02();
            runnable = this.A0L;
        } else {
            A02();
            runnable = this.A0M;
        }
        runnable.run();
        this.A07 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.A0A = this.A0A + i2;
        A02();
        this.A04.setTranslationY(-Math.max(0, Math.min(r0, this.A04.getHeight())));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        LLe lLe;
        Kru kru;
        this.A0U.A01 = i;
        ActionBarContainer actionBarContainer = this.A04;
        this.A0A = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        A02();
        LLe lLe2 = this.A05;
        if (lLe2 == null || (kru = (lLe = lLe2).A06) == null) {
            return;
        }
        kru.A00();
        lLe.A06 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.A04.getVisibility() != 0) {
            return false;
        }
        return this.A0H;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        Runnable runnable;
        if (!this.A0H || this.A07) {
            return;
        }
        if (this.A0A <= this.A04.getHeight()) {
            A02();
            runnable = this.A0M;
        } else {
            A02();
            runnable = this.A0L;
        }
        postDelayed(runnable, 600L);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        A01(this);
        int i2 = this.A00 ^ i;
        this.A00 = i;
        boolean z2 = false;
        boolean A1O = AnonymousClass001.A1O(i & 4);
        if ((i & 256) != 0) {
            z2 = true;
        }
        LLe lLe = this.A05;
        if (lLe != null) {
            LLe lLe2 = lLe;
            lLe2.A0C = !z2;
            if (A1O || !z2) {
                if (lLe2.A0F) {
                    lLe2.A0F = false;
                    z = true;
                    LLe.A01(lLe2, z);
                }
            } else if (!lLe2.A0F) {
                z = true;
                lLe2.A0F = true;
                LLe.A01(lLe2, z);
            }
        }
        if ((i2 & 256) == 0 || this.A05 == null) {
            return;
        }
        requestApplyInsets();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        int A06 = 0FI.A06(133357578);
        super.onWindowVisibilityChanged(i);
        this.A01 = i;
        LLe lLe = this.A05;
        if (lLe != null) {
            lLe.A00 = i;
        }
        0FI.A0C(2116487754, A06);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
