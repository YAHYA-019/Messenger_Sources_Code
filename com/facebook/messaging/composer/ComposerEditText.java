package com.facebook.messaging.composer;

import X.0FI;
import X.1BK;
import X.1BQ;
import X.6PD;
import X.C00i;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.widget.text.BetterEditTextView;

/* loaded from: ComposerEditText.class */
public class ComposerEditText extends BetterEditTextView {
    public C00i A00;
    public boolean A01;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposerEditText(Context context) {
        super(context);
        1BQ A01 = 1BQ.A01();
        this.A00 = A01;
        setEditableFactory(new 6PD(A01));
    }

    public ComposerEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposerEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        1BQ r0 = new 1BQ(16511);
        this.A00 = r0;
        setEditableFactory(new 6PD(r0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        try {
            super/*android.widget.TextView*/.onDraw(canvas);
        } catch (NullPointerException e) {
            1BK.A09(this.A00).softReport("T17243948:composeredittext_ondraw_npe", e);
            invalidate();
        }
    }

    @Override // com.facebook.widget.text.BetterEditTextView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(1069263312);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 0) {
            if (action == 1 || action == 3) {
                z = false;
            }
            0FI.A0B(237418774, A05);
            return onTouchEvent;
        }
        this.A01 = z;
        0FI.A0B(237418774, A05);
        return onTouchEvent;
    }
}
