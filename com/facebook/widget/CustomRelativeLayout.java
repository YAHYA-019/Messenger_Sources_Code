package com.facebook.widget;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.1BL;
import X.3HJ;
import X.3JE;
import X.AnonymousClass001;
import X.C00j;
import X.C1km;
import X.C1oo;
import X.C3jd;
import X.C3jn;
import X.KwH;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.contacts.picker.common.ContactPickerSectionUpsellView;
import com.facebook.systrace.Systrace;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;
import com.google.common.base.Throwables;
import java.util.LinkedList;

/* loaded from: CustomRelativeLayout.class */
public class CustomRelativeLayout extends FbRelativeLayout {
    public 3JE A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    public CustomRelativeLayout(Context context) {
        super(context);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
        A00(context, attributeSet, 0);
    }

    public CustomRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = true;
        A00(context, attributeSet, i);
    }

    private final void A00(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0Z, i, i);
            this.A04 = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            String str = this.A04;
            if (str != null) {
                this.A03 = 0Pz.A0W(str, ".onMeasure");
                this.A02 = 0Pz.A0W(str, ".onLayout");
            }
        }
    }

    public void A0C(int i) {
        this.A01 = i;
        Systrace.A0E(32);
        String str = this.A04;
        if (str == null) {
            str = C1km.A00(getClass());
        }
        Context context = getContext();
        if (context == null || context.getResources() == null) {
            C00j.A07("%s.setContentView", str, -836442554);
        } else {
            C00j.A04(str, context.getResources().getResourceName(i), "%s.setContentView(%s)", 1635835333);
        }
        try {
            try {
                LayoutInflater.from(context).inflate(i, this);
                C00j.A01(-793650861);
            } catch (RuntimeException e) {
                C3jn.A01(this, e, this.A01);
                throw 0Q8.createAndThrow();
            } catch (StackOverflowError e2) {
                C3jn.A01(this, e2, this.A01);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            C00j.A01(571194144);
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (RuntimeException | StackOverflowError e) {
            C3jn.A01(this, e, this.A01);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        if (this.A05) {
            try {
                super.dispatchRestoreInstanceState(sparseArray);
            } catch (IllegalArgumentException e) {
                int i = this.A01;
                Throwables.throwIfInstanceOf(e, C3jd.class);
                StringBuilder A0k = AnonymousClass001.A0k();
                Resources resources = getResources();
                A0k.append("\nView Hierarchy:");
                LinkedList linkedList = new LinkedList();
                linkedList.add(this);
                while (!linkedList.isEmpty()) {
                    int size = linkedList.size();
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 < size) {
                            View view = (View) linkedList.poll();
                            if (view != null) {
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) view;
                                    int childCount = viewGroup.getChildCount();
                                    for (int i4 = 0; i4 < childCount; i4++) {
                                        linkedList.add(viewGroup.getChildAt(i4));
                                    }
                                }
                                3HJ.A00(resources, view, A0k, i);
                            }
                            i2 = i3 + 1;
                        }
                    }
                }
                if (Log.getStackTraceString(e).contains("Failed to resolve attribute at index")) {
                    A0k.append("\n  TESTING NOTE:  If you receive this error in a test, you might not have a theme set on the activity.  This can be set in the testing manifest or by adding a call to setTheme(R.style.your_theme) when creating the activity");
                }
                RuntimeException runtimeException = new RuntimeException(1BL.A0u("\n  Original Throwable: ", Log.getStackTraceString(e), A0k));
                runtimeException.initCause(e);
                throw runtimeException;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        if (this.A05) {
            super.dispatchSaveInstanceState(sparseArray);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-622227747);
        super.onAttachedToWindow();
        0FI.A0C(1807901340, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1549641150);
        super.onDetachedFromWindow();
        0FI.A0C(-2144173716, A06);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String str = this.A02;
        boolean z2 = false;
        if (str != null) {
            z2 = true;
            C00j.A05(str, -1195986438);
        }
        try {
            try {
                try {
                    super.onLayout(z, i, i2, i3, i4);
                    if (z) {
                        3JE r0 = this.A00;
                        if (r0 != null) {
                            ContactPickerSectionUpsellView contactPickerSectionUpsellView = r0.A00;
                            contactPickerSectionUpsellView.setTouchDelegate(KwH.A01(contactPickerSectionUpsellView.A00, contactPickerSectionUpsellView, 15, 15, 15, 15));
                        }
                    }
                    if (z2) {
                        C00j.A01(1262114901);
                    }
                } catch (StackOverflowError e) {
                    C3jn.A01(this, e, this.A01);
                    throw 0Q8.createAndThrow();
                }
            } catch (RuntimeException e2) {
                C3jn.A01(this, e2, this.A01);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            if (z2) {
                C00j.A01(-660026058);
            }
            throw th;
        }
    }

    @Override // com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        String str = this.A03;
        boolean z = false;
        if (str != null) {
            z = true;
            C00j.A05(str, 1104401477);
        }
        try {
            try {
                super.onMeasure(i, i2);
                if (z) {
                    C00j.A01(-1469771637);
                }
            } catch (RuntimeException e) {
                C3jn.A01(this, e, this.A01);
                throw 0Q8.createAndThrow();
            } catch (StackOverflowError e2) {
                C3jn.A01(this, e2, this.A01);
                throw 0Q8.createAndThrow();
            }
        } catch (Throwable th) {
            if (z) {
                C00j.A01(1192892084);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void restoreHierarchyState(SparseArray sparseArray) {
        super.dispatchRestoreInstanceState(sparseArray);
    }

    @Override // android.view.View
    public void saveHierarchyState(SparseArray sparseArray) {
        super.dispatchSaveInstanceState(sparseArray);
    }
}
