package com.google.android.material.textfield;

import X.0FI;
import X.6LS;
import X.6Lc;
import X.6Ld;
import X.DKC;
import X.DPm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.Locale;

/* loaded from: TextInputEditText.class */
public class TextInputEditText extends DPm {
    public boolean A00;
    public final Rect A01;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969411);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(6LS.A00(context, attributeSet, i, 0), attributeSet, i);
        this.A01 = DKC.A0C();
        TypedArray A00 = 6Lc.A00(context, attributeSet, 6Ld.A0S, new int[0], i, 2132608543);
        this.A00 = A00.getBoolean(0, false);
        A00.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextInputLayout A00() {
        ViewParent parent = getParent();
        while (true) {
            ViewParent viewParent = parent;
            if (!(viewParent instanceof View)) {
                return null;
            }
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout) viewParent;
            }
            parent = viewParent.getParent();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void getFocusedRect(Rect rect) {
        super/*android.widget.TextView*/.getFocusedRect(rect);
        TextInputLayout A00 = A00();
        if (A00 == null || !this.A00 || rect == null) {
            return;
        }
        Rect rect2 = this.A01;
        A00.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super/*android.view.View*/.getGlobalVisibleRect(rect, point);
        TextInputLayout A00 = A00();
        if (A00 != null && this.A00 && rect != null) {
            Rect rect2 = this.A01;
            A00.getGlobalVisibleRect(rect2, point);
            rect.bottom = rect2.bottom;
        }
        return globalVisibleRect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharSequence getHint() {
        TextInputLayout A00 = A00();
        if (A00 == null || !A00.A0p) {
            return super/*android.widget.TextView*/.getHint();
        }
        if (A00.A0n) {
            return A00.A0b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1486108126);
        super/*android.widget.TextView*/.onAttachedToWindow();
        TextInputLayout A00 = A00();
        if (A00 != null && A00.A0p && super/*android.widget.TextView*/.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
        0FI.A0C(-1553932031, A06);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout A00 = A00();
            editorInfo.hintText = (A00 == null || !A00.A0n) ? null : A00.A0b;
        }
        return onCreateInputConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super/*android.view.View*/.requestRectangleOnScreen(rect);
        TextInputLayout A00 = A00();
        if (A00 != null && this.A00) {
            Rect rect2 = this.A01;
            rect2.set(0, A00.getHeight() - getResources().getDimensionPixelOffset(2132279327), A00.getWidth(), A00.getHeight());
            A00.requestRectangleOnScreen(rect2, true);
        }
        return requestRectangleOnScreen;
    }
}
