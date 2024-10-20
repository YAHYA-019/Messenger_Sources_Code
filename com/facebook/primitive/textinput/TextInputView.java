package com.facebook.primitive.textinput;

import X.11T;
import X.C0Ad;
import X.EkW;
import X.FYr;
import X.GDD;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.view.inputmethod.InputConnectionCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: TextInputView.class */
public final class TextInputView extends EditText implements GDD {
    public EkW A00;
    public String[] A01;
    public boolean A02;

    public TextInputView(Context context) {
        super(context, null);
    }

    public TextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* synthetic */ TextInputView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, null);
    }

    public final boolean A00() {
        return Build.VERSION.SDK_INT >= 29 ? isSingleLine() : this.A02;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArr;
        11T.A0F(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        EkW ekW = this.A00;
        if (onCreateInputConnection == null || ekW == null || ((strArr = this.A01) != null && strArr.length == 0)) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArr;
        InputConnection createWrapper = InputConnectionCompat.createWrapper(this, onCreateInputConnection, editorInfo);
        C0Ad.A0C(this, new FYr(ekW), this.A01);
        return createWrapper;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        int length = length();
        if (i > length) {
            i = length;
        }
        super.setSelection(i);
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        int length = length();
        if (i > length) {
            i = length;
        }
        int length2 = length();
        if (i2 > length2) {
            i2 = length2;
        }
        super.setSelection(i, i2);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        this.A02 = z;
    }
}
