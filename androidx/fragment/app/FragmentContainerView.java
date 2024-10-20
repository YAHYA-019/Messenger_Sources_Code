package androidx.fragment.app;

import X.06Z;
import X.08D;
import X.0Pz;
import X.0TW;
import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06c;
import X.C0Ad;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: FragmentContainerView.class */
public final class FragmentContainerView extends FrameLayout {
    public boolean A00;
    public View.OnApplyWindowInsetsListener A01;
    public final List A02;
    public final List A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A02 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        this.A00 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        11T.A0F(context, 1);
        this.A02 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        this.A00 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = 0TW.A01;
            11T.A0B(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw AnonymousClass001.A0q(0Pz.A0w("FragmentContainerView must be within a FragmentActivity to use ", str, "=\"", classAttribute, '\"'));
            }
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, 06Z r304) {
        super(context, attributeSet);
        11T.A0G(context, 1, attributeSet);
        11T.A0F(r304, 3);
        this.A02 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        this.A00 = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = 0TW.A01;
        11T.A0B(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment A0Y = r304.A0Y(id);
        if (classAttribute != null && A0Y == null) {
            if (id == -1) {
                throw 0Pz.A07("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? 0Pz.A0W(" with tag ", string) : "");
            }
            Fragment A02 = r304.A0d().A02(context.getClassLoader(), classAttribute);
            11T.A0A(A02);
            A02.mFragmentId = id;
            A02.mContainerId = id;
            A02.mTag = string;
            A02.mFragmentManager = r304;
            A02.mHost = r304.A05;
            A02.onInflate(context, attributeSet, (Bundle) null);
            C06c c06c = new C06c(r304);
            c06c.A0G = true;
            c06c.A0E(this, A02, string);
            c06c.A07();
        }
        r304.A1I(this);
    }

    private final void A00(View view) {
        if (this.A03.contains(view)) {
            this.A02.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        11T.A0F(view, 0);
        if (06Z.A04(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        A0k.append(view);
        throw AnonymousClass002.A0F(" is not associated with a Fragment.", A0k);
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        08D A05;
        11T.A0F(windowInsets, 0);
        08D r0 = new 08D(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.A01;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            11T.A0A(onApplyWindowInsets);
            A05 = new 08D(onApplyWindowInsets);
        } else {
            A05 = C0Ad.A05(this, r0);
        }
        if (!A05.A00.A0A()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0Ad.A04(getChildAt(i), A05);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        if (this.A00) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        11T.A0F(canvas, 0);
        11T.A0F(view, 1);
        if (this.A00) {
            List list = this.A02;
            if ((!list.isEmpty()) && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        11T.A0F(view, 0);
        this.A03.remove(view);
        if (this.A02.remove(view)) {
            this.A00 = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        11T.A0F(windowInsets, 0);
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                11T.A0A(childAt);
                A00(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        11T.A0F(view, 0);
        A00(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        11T.A0A(childAt);
        A00(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        11T.A0F(view, 0);
        A00(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        int i4 = i;
        while (true) {
            int i5 = i4;
            if (i5 >= i3) {
                super.removeViews(i, i2);
                return;
            }
            View childAt = getChildAt(i5);
            11T.A0A(childAt);
            A00(childAt);
            i4 = i5 + 1;
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        int i4 = i;
        while (true) {
            int i5 = i4;
            if (i5 >= i3) {
                super.removeViewsInLayout(i, i2);
                return;
            }
            View childAt = getChildAt(i5);
            11T.A0A(childAt);
            A00(childAt);
            i4 = i5 + 1;
        }
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw AnonymousClass001.A0q("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        11T.A0F(onApplyWindowInsetsListener, 0);
        this.A01 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        11T.A0F(view, 0);
        if (view.getParent() == this) {
            this.A03.add(view);
        }
        super.startViewTransition(view);
    }
}
