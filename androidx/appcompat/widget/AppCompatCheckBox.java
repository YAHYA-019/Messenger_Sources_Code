package androidx.appcompat.widget;

import X.C53a;
import X.C53g;
import X.C53h;
import X.DLV;
import X.Esh;
import X.F7w;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: AppCompatCheckBox.class */
public class AppCompatCheckBox extends CheckBox {
    public Esh A00;
    public final F7w A01;
    public final C53h A02;
    public final DLV A03;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969059);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        C53g.A03(getContext(), this);
        F7w f7w = new F7w(this);
        this.A01 = f7w;
        f7w.A01(attributeSet, i);
        C53h c53h = new C53h(this);
        this.A02 = c53h;
        c53h.A03(attributeSet, i);
        DLV dlv = new DLV(this);
        this.A03 = dlv;
        dlv.A07(attributeSet, i);
        Esh esh = this.A00;
        if (esh == null) {
            esh = new Esh(this);
            this.A00 = esh;
        }
        esh.A00(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C53h c53h = this.A02;
        if (c53h != null) {
            c53h.A00();
        }
        DLV dlv = this.A03;
        if (dlv != null) {
            dlv.A05();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        Esh esh = this.A00;
        if (esh == null) {
            esh = new Esh(this);
            this.A00 = esh;
        }
        esh.A00.A00.A01(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C53h c53h = this.A02;
        if (c53h != null) {
            c53h.A01();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C53h c53h = this.A02;
        if (c53h != null) {
            c53h.A02(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C53a.A00(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        F7w f7w = this.A01;
        if (f7w != null) {
            if (f7w.A02) {
                f7w.A02 = false;
            } else {
                f7w.A02 = true;
                F7w.A00(f7w);
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        DLV dlv = this.A03;
        if (dlv != null) {
            dlv.A05();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        DLV dlv = this.A03;
        if (dlv != null) {
            dlv.A05();
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        Esh esh = this.A00;
        if (esh == null) {
            esh = new Esh(this);
            this.A00 = esh;
        }
        super.setFilters(esh.A00.A00.A03(inputFilterArr));
    }
}
