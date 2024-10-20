package com.facebook.widget.text;

import X.0FI;
import X.0S2;
import X.2KU;
import X.6PA;
import X.6PB;
import X.6PC;
import X.6Rq;
import X.6Rs;
import X.8AZ;
import X.C0Ad;
import X.C0dv;
import X.C1235Abd;
import X.C1oo;
import X.C2rY;
import X.DM9;
import X.FWs;
import X.GGa;
import X.RDt;
import android.content.ClipData;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.facebook.resources.ui.FbEditText;
import java.util.Iterator;
import java.util.List;

/* loaded from: BetterEditTextView.class */
public class BetterEditTextView extends FbEditText {
    public Drawable A00;
    public RDt A01;
    public C1235Abd A02;
    public 6Rq A03;
    public FWs A04;
    public GGa A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public String[] A0A;
    public 6PC A0B;
    public Boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public BetterEditTextView(Context context) {
        super(context);
        this.A0E = false;
        this.A09 = false;
        this.A0D = false;
        this.A0C = null;
        A02(context, null);
    }

    public BetterEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0E = false;
        this.A09 = false;
        this.A0D = false;
        this.A0C = null;
        A02(context, attributeSet);
    }

    public BetterEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0E = false;
        this.A09 = false;
        this.A0D = false;
        this.A0C = null;
        A02(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        this.A08 = false;
        boolean A00 = C2rY.A00(getContext());
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (A00) {
            setCompoundDrawablesWithIntrinsicBounds(null, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], null, compoundDrawables[3]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A01() {
        this.A08 = true;
        boolean A00 = C2rY.A00(getContext());
        Drawable drawable = this.A00;
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (A00) {
            setCompoundDrawablesWithIntrinsicBounds(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0B);
            int i = obtainStyledAttributes.getInt(4, -1);
            int i2 = obtainStyledAttributes.getInt(5, -1);
            2KU.A02(getTypeface(), this, i == -1 ? 0S2.A01 : 6PA.A00[i], i2 == -1 ? 0S2.A0Y : 6PB.A00[i2]);
            this.A0E = obtainStyledAttributes.getBoolean(6, false);
            Drawable drawable = obtainStyledAttributes.getDrawable(2);
            this.A00 = drawable;
            if (drawable != null) {
                if (this.A04 == null) {
                    FWs fWs = new FWs(this);
                    this.A04 = fWs;
                    addTextChangedListener(fWs);
                    this.A09 = false;
                }
                int color = obtainStyledAttributes.getColor(3, 0);
                if (color != 0) {
                    this.A00.setTint(color);
                }
            }
            this.A0D = obtainStyledAttributes.getBoolean(0, false);
            this.A07 = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
        6PC r304 = this.A0B;
        if (r304 == null) {
            r304 = new 6PC(this);
            this.A0B = r304;
        }
        C0Ad.A0B(this, r304);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(BetterEditTextView betterEditTextView, CharSequence charSequence) {
        if (betterEditTextView.A00 != null) {
            Boolean bool = betterEditTextView.A0C;
            if (bool != null) {
                betterEditTextView.A05(bool);
            } else if (charSequence.length() <= 0 || (!betterEditTextView.isFocused() && betterEditTextView.A0E)) {
                betterEditTextView.A00();
            } else {
                betterEditTextView.A01();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A04() {
        super/*android.widget.EditText*/.setText("", TextView.BufferType.EDITABLE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A05(Boolean bool) {
        this.A0C = bool;
        if (bool == null) {
            A03(this, getText());
        } else if (bool.booleanValue()) {
            A01();
        } else {
            A00();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean A06(float f) {
        boolean z = false;
        if (this.A08 && (!C2rY.A00(getContext()) ? f > getWidth() - getCompoundPaddingRight() : f < getCompoundPaddingLeft())) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        6PC r0 = this.A0B;
        if (r0 == null || !r0.A0p(motionEvent)) {
            return super/*android.view.View*/.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z = false;
        if ((getImeOptions() & 1073741824) == 1073741824) {
            z = true;
        }
        InputConnection onCreateInputConnection = super/*android.widget.TextView*/.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            String[] strArr = this.A0A;
            if (strArr != null && strArr.length != 0) {
                editorInfo.contentMimeTypes = strArr;
                onCreateInputConnection = InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, (InputConnectionCompat.OnCommitContentListener) new 8AZ(this));
            }
            onCreateInputConnection = new DM9(onCreateInputConnection, this);
        }
        if (this.A0D && !z && (editorInfo.inputType & 131087) == 131073) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = 0FI.A06(1948212433);
        A03(this, getText());
        super/*android.widget.TextView*/.onFocusChanged(z, i, rect);
        0FI.A0C(1935637503, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Parcelable onSaveInstanceState() {
        this.A0F = true;
        Parcelable onSaveInstanceState = super/*android.widget.TextView*/.onSaveInstanceState();
        this.A0F = false;
        return onSaveInstanceState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSelectionChanged(int i, int i2) {
        List list;
        super/*android.widget.TextView*/.onSelectionChanged(i, i2);
        if (!this.A0F && (list = this.A06) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((6Rs) it.next()).CKE();
            }
        }
        int length = getText().length();
        if (i != i2 || i2 >= length) {
            return;
        }
        Editable text = getText();
        int i3 = 0;
        if (i2 > 0) {
            int codePointAt = Character.codePointAt(text, 0);
            do {
                i3 += Character.charCount(codePointAt);
                if (i3 < i2) {
                    codePointAt = Character.codePointAt(text, i3);
                }
            } while (i3 < i2);
        }
        if (i3 != i) {
            Selection.setSelection(getEditableText(), i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            if (!this.A07) {
                Context context = getContext();
                ClipData A00 = C0dv.A00(context);
                boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
                C0dv.A01(A00, context);
                C1235Abd c1235Abd = this.A02;
                if (c1235Abd != null) {
                    c1235Abd.A00();
                }
                return onTextContextMenuItem;
            }
            C1235Abd c1235Abd2 = this.A02;
            if (c1235Abd2 != null) {
                c1235Abd2.A00();
            }
        }
        return super.onTextContextMenuItem(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-454387802);
        if (motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            motionEvent.getY();
            if (A06(x)) {
                A04();
            }
        }
        boolean onTouchEvent = super/*android.widget.TextView*/.onTouchEvent(motionEvent);
        0FI.A0B(-591905704, A05);
        return onTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.A09 = true;
        super/*android.widget.EditText*/.setText(charSequence, bufferType);
    }
}
