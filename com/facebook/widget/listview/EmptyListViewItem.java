package com.facebook.widget.listview;

import X.1BQ;
import X.2Ct;
import X.2MR;
import X.2Me;
import X.C00i;
import X.C09s;
import X.C0dr;
import X.C1oo;
import X.C2ip;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.widget.CustomRelativeLayout;
import com.google.common.base.Platform;

/* loaded from: EmptyListViewItem.class */
public class EmptyListViewItem extends CustomRelativeLayout {
    public TextView A00;
    public long A01;
    public ViewStub A02;
    public C00i A03;
    public final C00i A04;

    public EmptyListViewItem(Context context) {
        super(context);
        this.A04 = 1BQ.A02(17081);
        A00();
    }

    public EmptyListViewItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmptyListViewItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = new 1BQ(17081);
        A00();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1oo.A0m);
        if (obtainStyledAttributes.peekValue(0) != null) {
            this.A00.setTextColor(obtainStyledAttributes.getColor(0, 0));
        }
        obtainStyledAttributes.recycle();
    }

    private void A00() {
        this.A03 = new 1BQ(84488);
        A0C(2132542911);
        this.A02 = (ViewStub) C09s.A01(this, 2131363876);
        this.A00 = (TextView) C09s.A01(this, 2131363877);
        if (getBackground() == null) {
            setBackground(new ColorDrawable(2Me.A02.A03(getContext(), 2MR.A2J)));
        }
    }

    public void A0D(int i) {
        this.A00.setText(i);
        boolean stringIsNullOrEmpty = Platform.stringIsNullOrEmpty(this.A00.getText().toString());
        TextView textView = this.A00;
        int i2 = 0;
        if (stringIsNullOrEmpty) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public void A0E(CharSequence charSequence) {
        this.A00.setText(charSequence);
        boolean stringIsNullOrEmpty = Platform.stringIsNullOrEmpty(this.A00.getText().toString());
        TextView textView = this.A00;
        int i = 0;
        if (stringIsNullOrEmpty) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void A0F(boolean z) {
        long j;
        if (z) {
            this.A04.get();
            if (this.A02.getVisibility() != 0) {
                C00i c00i = this.A03;
                c00i.getClass();
                j = ((C0dr) c00i.get()).now();
                this.A01 = j;
            }
        } else {
            j = 0;
            if (this.A01 != 0) {
                C2ip c2ip = (C2ip) this.A04.get();
                C00i c00i2 = this.A03;
                c00i2.getClass();
                long now = ((C0dr) c00i2.get()).now() - this.A01;
                ViewStub viewStub = this.A02;
                if (viewStub != null && viewStub.getVisibility() == 0) {
                    if (now > 0) {
                        ((2Ct) c2ip.A01.get()).A05("progress_spinner_time", now);
                    }
                    this.A01 = j;
                }
            }
        }
        ViewStub viewStub2 = this.A02;
        int i = 8;
        if (z) {
            i = 0;
        }
        viewStub2.setVisibility(i);
    }

    public void setTextColor(int i) {
        this.A00.setTextColor(i);
    }
}
