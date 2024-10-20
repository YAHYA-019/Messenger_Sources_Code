package com.facebook.messaging.common.ui.widgets.text;

import X.1BY;
import X.1Bn;
import X.DP1;
import X.F5T;
import X.FsS;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: RowReceiptTextView.class */
public class RowReceiptTextView extends DP1 {
    public FsS A00;

    /* JADX WARN: Multi-variable type inference failed */
    public RowReceiptTextView(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A00 = (FsS) 1Bn.A0E(getContext(), (1BY) null, 99844);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RowReceiptTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A00 = (FsS) 1Bn.A0E(getContext(), (1BY) null, 99844);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RowReceiptTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = (FsS) 1Bn.A0E(getContext(), (1BY) null, 99844);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence] */
    public /* bridge */ /* synthetic */ CharSequence A05(Object obj) {
        String str = ((F5T) obj).A01;
        if (str == null) {
            str = super.getContentDescription();
        }
        return str;
    }
}
