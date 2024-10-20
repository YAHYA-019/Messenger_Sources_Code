package com.facebook.messaging.chatheads.view.chathead;

import X.0FI;
import X.DKD;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.resources.ui.FbTextView;

/* loaded from: ChatHeadBubbleTextView.class */
public class ChatHeadBubbleTextView extends FbTextView {
    public boolean A00;

    public ChatHeadBubbleTextView(Context context) {
        this(context, null, 0);
    }

    public ChatHeadBubbleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatHeadBubbleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = getResources();
        setShadowLayer(resources.getDimension(2132279439), resources.getDimension(2132279325), resources.getDimension(2132279438), resources.getColor(2132213823));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int A06 = 0FI.A06(1884249167);
        super/*android.widget.TextView*/.onMeasure(i, i2);
        if (this.A00 && View.MeasureSpec.getMode(i) != 1073741824 && DKD.A03(this) > 1) {
            float f = 0.0f;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= DKD.A03(this)) {
                    break;
                }
                f = Math.max(f, getLayout().getLineWidth(i4));
                i3 = i4 + 1;
            }
            int round = Math.round(f + getPaddingLeft() + getPaddingRight());
            if (round < getMeasuredWidth()) {
                float f2 = -0.0f;
                super/*android.widget.TextView*/.onMeasure(View.MeasureSpec.makeMeasureSpec(round, (-1) << (-1)), i2);
            }
        }
        0FI.A0C(-1800381437, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxEms(int i) {
        super/*android.widget.TextView*/.setMaxEms(i);
        this.A00 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxWidth(int i) {
        super/*android.widget.TextView*/.setMaxWidth(i);
        this.A00 = true;
    }
}
