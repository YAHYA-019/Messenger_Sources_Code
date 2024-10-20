package com.facebook.payments.receipt.components;

import X.0S2;
import X.C09s;
import X.DZb;
import X.EBH;
import X.GFu;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.facebook.widget.loadingindicator.LoadingIndicatorView;

/* loaded from: ReceiptListView.class */
public class ReceiptListView extends EBH implements GFu {
    public LinearLayout A00;
    public ListView A01;
    public DZb A02;
    public LoadingIndicatorView A03;

    public ReceiptListView(Context context) {
        super(context);
        A00();
    }

    public ReceiptListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ReceiptListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        A0U(2132543228);
        this.A03 = (LoadingIndicatorView) C09s.A01(this, 2131365307);
        this.A01 = (ListView) C09s.A01(this, R.id.list);
        this.A00 = (LinearLayout) C09s.A01(this, 2131364171);
    }

    @Override // X.GFu
    public void BOB() {
        this.A01.setAlpha(1.0f);
        LoadingIndicatorView.A01(this.A03, 0S2.A0C, false);
    }
}
