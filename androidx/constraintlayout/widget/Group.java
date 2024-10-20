package androidx.constraintlayout.widget;

import X.0FI;
import X.5Wl;
import X.AnonymousClass001;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;

/* loaded from: Group.class */
public class Group extends 5Wl {
    public Group(Context context) {
        super(context);
        ((5Wl) this).A05 = new int[32];
        ((5Wl) this).A04 = AnonymousClass001.A0u();
        ((5Wl) this).A01 = context;
        A07((AttributeSet) null);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((5Wl) this).A05 = new int[32];
        ((5Wl) this).A04 = AnonymousClass001.A0u();
        ((5Wl) this).A01 = context;
        A07(attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((5Wl) this).A05 = new int[32];
        ((5Wl) this).A04 = AnonymousClass001.A0u();
        ((5Wl) this).A01 = context;
        A07(attributeSet);
    }

    public void A07(AttributeSet attributeSet) {
        super.A07(attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1816887170);
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            A08((ConstraintLayout) parent);
        }
        0FI.A0C(1579384541, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.View*/.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        A08((ConstraintLayout) parent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.view.View*/.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        A08((ConstraintLayout) parent);
    }
}
