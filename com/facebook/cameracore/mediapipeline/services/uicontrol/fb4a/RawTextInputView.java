package com.facebook.cameracore.mediapipeline.services.uicontrol.fb4a;

import X.0FI;
import X.AbH;
import X.AbI;
import X.FWs;
import X.FYa;
import X.IPD;
import X.RDt;
import X.S3l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import com.facebook.cameracore.mediapipeline.services.uicontrol.RawEditableTextListener;
import com.facebook.widget.text.BetterEditTextView;

/* loaded from: RawTextInputView.class */
public class RawTextInputView extends BetterEditTextView {
    public InputMethodManager A00;
    public IPD A01;
    public boolean A02;

    public RawTextInputView(Context context) {
        super(context);
        A00(context);
    }

    public RawTextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public RawTextInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(Context context) {
        setInputType(16385);
        setSingleLine();
        setEnabled(false);
        setVisibility(8);
        setImeOptions(6);
        S3l s3l = new S3l(this);
        if (this.A04 == null) {
            FWs fWs = new FWs(this);
            this.A04 = fWs;
            addTextChangedListener(fWs);
            this.A09 = false;
        }
        this.A05 = s3l;
        setOnEditorActionListener(new FYa(this, 6));
        ((BetterEditTextView) this).A01 = new RDt(this);
        this.A00 = AbI.A06(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A07() {
        RawEditableTextListener rawEditableTextListener;
        if (this.A02) {
            this.A02 = false;
            IPD ipd = this.A01;
            if (ipd != null && (rawEditableTextListener = ipd.A00) != null) {
                rawEditableTextListener.onExit();
            }
            setEnabled(false);
            clearFocus();
            setFocusable(false);
            setFocusableInTouchMode(false);
            setVisibility(8);
            AbH.A1L(this, this.A00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        A07();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int A06 = 0FI.A06(736524807);
        setMeasuredDimension(1, 1);
        0FI.A0C(-146085349, A06);
    }
}
