package com.facebook.common.ui.radiobutton;

import X.0FI;
import X.Kea;
import X.LKf;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: EditableRadioGroup.class */
public class EditableRadioGroup extends LinearLayoutCompat {
    public int A00;
    public Kea A01;
    public LKf A02;
    public boolean A03;

    public EditableRadioGroup(Context context) {
        this(context, null);
    }

    public EditableRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = -1;
        this.A03 = false;
        this.A01 = new Kea(this);
        LKf lKf = new LKf(this);
        this.A02 = lKf;
        super.setOnHierarchyChangeListener(lKf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        KeyEvent.Callback findViewById;
        super.addView(view, i, layoutParams);
        if ((view instanceof Checkable) && ((Checkable) view).isChecked()) {
            this.A03 = true;
            int i2 = this.A00;
            if (i2 != -1 && (findViewById = findViewById(i2)) != null && (findViewById instanceof Checkable)) {
                ((Checkable) findViewById).setChecked(false);
            }
            this.A03 = false;
            this.A00 = view.getId();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(197981614);
        super.onFinishInflate();
        int i = this.A00;
        if (i != -1) {
            this.A03 = true;
            KeyEvent.Callback findViewById = findViewById(i);
            if (findViewById != null && (findViewById instanceof Checkable)) {
                ((Checkable) findViewById).setChecked(true);
            }
            this.A03 = false;
            this.A00 = this.A00;
        }
        0FI.A0C(814460694, A06);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A02.A00 = onHierarchyChangeListener;
    }
}
