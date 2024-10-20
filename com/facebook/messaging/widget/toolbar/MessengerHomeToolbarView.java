package com.facebook.messaging.widget.toolbar;

import X.1Hv;
import X.2Wo;
import X.5W8;
import X.AbG;
import X.AbK;
import X.C09s;
import X.C1oo;
import X.C22a;
import X.FY2;
import X.GOp;
import X.IKB;
import X.IlT;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: MessengerHomeToolbarView.class */
public class MessengerHomeToolbarView extends CustomFrameLayout {
    public View A00;
    public View A01;
    public View A02;
    public ViewStub A03;
    public InputMethodManager A04;
    public EditText A05;
    public TextView A06;
    public C22a A07;
    public 2Wo A08;
    public final 5W8 A09;

    public MessengerHomeToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = new IlT(this, 22);
        this.A04 = (InputMethodManager) 1Hv.A02(context, 100189);
        this.A07 = GOp.A0y();
        A0U(2132542647);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1y);
        setBackgroundResource(obtainStyledAttributes.getResourceId(0, 2132411219));
        setElevation(obtainStyledAttributes.getDimensionPixelSize(2, 0));
        obtainStyledAttributes.recycle();
        this.A02 = C09s.A01(this, 2131367147);
        2Wo A0v = AbK.A0v(this, 2131367149);
        this.A08 = A0v;
        A0v.A02 = this.A09;
        this.A06 = AbG.A09(this, 2131367150);
        IKB.A00(this.A02, this, 36);
        IKB.A00(this.A06, this, 37);
        this.A06.setOnLongClickListener(new FY2(this, 0));
        this.A05 = (EditText) C09s.A01(this, 2131367193);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return super.dispatchKeyEventPreIme(keyEvent);
    }
}
