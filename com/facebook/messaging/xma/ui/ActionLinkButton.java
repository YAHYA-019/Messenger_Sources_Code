package com.facebook.messaging.xma.ui;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.2OB;
import X.C09s;
import X.C0A2;
import X.C1oo;
import X.CZE;
import X.DEg;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: ActionLinkButton.class */
public final class ActionLinkButton extends CustomFrameLayout {
    public DEg A00;
    public FbTextView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionLinkButton(Context context) {
        super(context);
        11T.A0F(context, 1);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionLinkButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        A00(context);
        if (attributeSet != null) {
            A01(attributeSet);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionLinkButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        A00(context);
        if (attributeSet != null) {
            A01(attributeSet);
        }
    }

    private final void A00(Context context) {
        this.A00 = (DEg) 1Bn.A0E(context, (1BY) null, 83640);
        LayoutInflater.from(context).inflate(2132543601, this);
        this.A01 = (FbTextView) C09s.A01(this, 2131367976);
    }

    private final void A01(AttributeSet attributeSet) {
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1oo.A00, 0, 0);
        11T.A0A(obtainStyledAttributes);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                CharSequence A0u = 1BK.A0u(context, resourceId);
                2OB r0 = this.A01;
                if (r0 == null) {
                    11T.A0L("fbTextView");
                    throw 0Q8.createAndThrow();
                }
                r0.setText(A0u);
            }
            String string = obtainStyledAttributes.getString(1);
            if (string != null) {
                try {
                    Uri A03 = C0A2.A03(string);
                    if (A03 != null) {
                        setOnClickListener(new CZE(A03, this, 58));
                    }
                } catch (SecurityException unused) {
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
