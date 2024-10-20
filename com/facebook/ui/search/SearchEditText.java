package com.facebook.ui.search;

import X.0FI;
import X.1BL;
import X.1BQ;
import X.1JF;
import X.2yD;
import X.AbI;
import X.AbM;
import X.AnonymousClass001;
import X.C00i;
import X.C01s;
import X.DKC;
import X.DKH;
import X.DZn;
import X.EdU;
import X.G10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.StringBuilderPrinter;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.widget.text.BetterEditTextView;
import java.util.Vector;

/* loaded from: SearchEditText.class */
public class SearchEditText extends BetterEditTextView implements TextView.OnEditorActionListener {
    public InputMethodManager A00;
    public EdU A01;
    public CharSequence A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public KeyListener A06;
    public C00i A07;
    public boolean A08;
    public final Vector A09;

    public SearchEditText(Context context) {
        super(context);
        this.A09 = new Vector();
        this.A04 = true;
        A00();
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = new Vector();
        this.A04 = true;
        A00();
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = new Vector();
        this.A04 = true;
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        this.A07 = 1BQ.A02(50171);
        this.A06 = getKeyListener();
        setOnEditorActionListener(this);
        addTextChangedListener((TextWatcher) this.A07.get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A02() == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(com.facebook.ui.search.SearchEditText r301, boolean r302) {
        /*
            r0 = r301
            boolean r0 = r0.requestFocus()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L14
            r0 = r301
            boolean r0 = r0.A02()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L19
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L19:
            r0 = 1000(0x3e8, double:4.94E-321)
            r306 = r0
            r0 = r301
            r1 = r306
            X.C2cd.A04(r0, r1)
            r0 = r304
            if (r0 != 0) goto L46
            r0 = r302
            if (r0 != 0) goto L45
            X.G11 r0 = new X.G11
            r305 = r0
            r0 = r305
            r1 = r301
            r0.<init>(r1)
            r0 = 100
            long r0 = (long) r0
            r306 = r0
            r0 = r301
            r1 = r305
            r2 = r306
            boolean r0 = r0.postDelayed(r1, r2)
        L45:
            return
        L46:
            r0 = r301
            boolean r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L45
            r0 = r301
            java.lang.CharSequence r0 = r0.A03
            r308 = r0
            r0 = r301
            r1 = r308
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ui.search.SearchEditText.A01(com.facebook.ui.search.SearchEditText, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean A02() {
        InputMethodManager inputMethodManager;
        synchronized (this) {
            inputMethodManager = this.A00;
            if (inputMethodManager == null) {
                inputMethodManager = AbI.A06(getContext());
                this.A00 = inputMethodManager;
            }
        }
        boolean showSoftInput = inputMethodManager.showSoftInput(this, 0);
        this.A08 = !showSoftInput;
        return showSoftInput;
    }

    @Override // com.facebook.widget.text.BetterEditTextView
    public void A04() {
        this.A05 = false;
        super.A04();
        this.A02 = null;
        this.A03 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A07() {
        InputMethodManager inputMethodManager;
        synchronized (this) {
            inputMethodManager = this.A00;
            if (inputMethodManager == null) {
                inputMethodManager = AbI.A06(getContext());
                this.A00 = inputMethodManager;
            }
        }
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        this.A08 = false;
        clearFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void clearFocus() {
        if (this.A04) {
            setFocusableInTouchMode(false);
            super/*android.view.View*/.clearFocus();
            setFocusableInTouchMode(true);
        } else {
            super/*android.view.View*/.clearFocus();
        }
        CharSequence charSequence = this.A02;
        if (charSequence != null) {
            CharSequence charSequence2 = this.A03;
            setText(charSequence);
            this.A03 = charSequence2;
            this.A02 = charSequence;
            this.A05 = true;
        }
    }

    @Override // com.facebook.widget.text.BetterEditTextView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -1073741825;
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 3) {
            return false;
        }
        EdU edU = this.A01;
        if (edU != null) {
            DZn dZn = edU.A00;
            String A0u = AbM.A0u(dZn.A08);
            if (!1JF.A0A(A0u)) {
                DZn.A07(dZn, A0u);
            }
        }
        A07();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || (i != 23 && i != 66 && i != 160)) {
            return super/*android.widget.TextView*/.onKeyDown(i, keyEvent);
        }
        EdU edU = this.A01;
        if (edU != null) {
            DZn dZn = edU.A00;
            String A0u = AbM.A0u(dZn.A08);
            if (!1JF.A0A(A0u)) {
                DZn.A07(dZn, A0u);
            }
        }
        A07();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            postDelayed(new G10(this), 100);
        }
        return super/*android.widget.TextView*/.onKeyPreIme(i, keyEvent);
    }

    @Override // com.facebook.resources.ui.FbEditText
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A08) {
            this.A08 = false;
            A02();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        return super/*android.widget.TextView*/.onPrivateIMECommand(str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (super.onTouchEvent(r302) != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.text.BetterEditTextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = -1083089118(0xffffffffbf715f22, float:-0.94285786)
            int r0 = X.0FI.A05(r0)
            r303 = r0
            r0 = r302
            int r0 = r0.getAction()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L29
            r0 = r301
            boolean r0 = r0.A05
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L29
            r0 = r301
            java.lang.CharSequence r0 = r0.A03
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
            r0 = r301
            r1 = r305
            r0.setText(r1)
        L29:
            r0 = r301
            java.util.Vector r0 = r0.A09
            r305 = r0
            r0 = r305
            X.1Du r0 = X.DKD.A0g(r0)
            r306 = r0
            r0 = 0
            r307 = r0
        L39:
            r0 = r306
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L6c
            r0 = r306
            java.lang.Object r0 = r0.next()
            android.view.View$OnTouchListener r0 = (android.view.View.OnTouchListener) r0
            r305 = r0
            r0 = r305
            r1 = r301
            r2 = r302
            boolean r0 = r0.onTouch(r1, r2)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L39
        L5f:
            r0 = 1
            r307 = r0
        L62:
            r0 = -1795704185(0xffffffff94f7ba87, float:-2.5014198E-26)
            r1 = r303
            X.0FI.A0B(r0, r1)
            r0 = r307
            return r0
        L6c:
            r0 = r301
            r1 = r302
            boolean r0 = super.onTouchEvent(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L62
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ui.search.SearchEditText.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        int A06 = 0FI.A06(-2063498828);
        super/*android.widget.TextView*/.onWindowFocusChanged(z);
        if (z && this.A08 && ((2yD) DKC.A0x()).AZk(72339799160654062L)) {
            A02();
        }
        0FI.A0C(-1258966626, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super/*android.view.View*/.performAccessibilityAction(i, bundle);
        }
        onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, getX(), getY(), 0));
        boolean onTouchEvent = onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, getX(), getY(), 0));
        DKH.A17(this);
        return onTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        super/*android.view.View*/.setBackground(drawable);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.A09.add(onTouchListener);
        }
    }

    @Override // com.facebook.widget.text.BetterEditTextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (IndexOutOfBoundsException e) {
            C01s A0I = 1BL.A0I();
            StringBuilder A0k = AnonymousClass001.A0k();
            TextUtils.dumpSpans(charSequence, new StringBuilderPrinter(A0k), null);
            A0I.softReport("SearchEditText", StringFormatUtil.formatStrLocaleSafe("Exception caught in get SearchEditText. text: \"%s\". debug text: \"%s\"", charSequence, A0k.toString()), e);
            super.setText(charSequence.toString(), bufferType);
        }
        this.A05 = false;
        this.A02 = null;
        this.A03 = charSequence;
    }
}
