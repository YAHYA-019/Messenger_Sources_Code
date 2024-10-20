package com.facebook.widget.splitinput;

import X.1Bi;
import X.1Hv;
import X.48A;
import X.AnonymousClass001;
import X.C1oo;
import X.DKC;
import X.EmL;
import X.GGZ;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: SplitFieldCodeInputView.class */
public class SplitFieldCodeInputView extends 48A {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public LayoutInflater A04;
    public InputMethodManager A05;
    public PopupWindow A06;
    public GGZ A07;
    public EmL A08;
    public EmL A09;
    public ArrayList A0A;
    public List A0B;
    public ExecutorService A0C;
    public boolean A0D;

    public SplitFieldCodeInputView(Context context) {
        super(context);
        this.A01 = 2132543370;
        A00(null, true);
    }

    public SplitFieldCodeInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 2132543370;
        A00(attributeSet, true);
    }

    public SplitFieldCodeInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = 2132543370;
        A00(attributeSet, true);
    }

    public SplitFieldCodeInputView(Context context, boolean z) {
        super(context);
        this.A01 = 2132543370;
        A00(null, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00(AttributeSet attributeSet, boolean z) {
        Context context = getContext();
        this.A04 = (LayoutInflater) 1Hv.A02(context, 100193);
        this.A05 = (InputMethodManager) 1Hv.A02(context, 100189);
        this.A0C = (ExecutorService) 1Bi.A03(16456);
        setContentView(this.A01);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2V, 0, 0);
        try {
            try {
                this.A02 = obtainStyledAttributes.getInteger(0, 6);
            } catch (RuntimeException unused) {
                this.A02 = 6;
            }
            obtainStyledAttributes.recycle();
            this.A0D = z;
            this.A0B = AnonymousClass001.A0s();
            A01(this, this.A02, z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r302 <= 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127, types: [com.facebook.resources.ui.DigitEditText, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(com.facebook.widget.splitinput.SplitFieldCodeInputView r301, int r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.splitinput.SplitFieldCodeInputView.A01(com.facebook.widget.splitinput.SplitFieldCodeInputView, int, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A02() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A02) {
                break;
            }
            TextView textView = (TextView) this.A0A.get(i2);
            DKC.A1Q(textView);
            textView.setEnabled(true);
            i = i2 + 1;
        }
        int i3 = this.A00;
        ArrayList arrayList = this.A0A;
        if (i3 >= arrayList.size()) {
            i3 = arrayList.size() - 1;
        } else if (i3 < 0) {
            i3 = 0;
        }
        ((View) arrayList.get(i3)).setFocusableInTouchMode(false);
        ((View) this.A0A.get(0)).setFocusableInTouchMode(true);
        this.A00 = 0;
        if (hasFocus()) {
            ((View) this.A0A.get(0)).requestFocus();
        }
    }

    public void A03(String str) {
        if (str.length() != this.A02) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            int i3 = this.A02;
            if (i2 >= i3) {
                this.A00 = i3 - 1;
                return;
            } else {
                ((TextView) this.A0A.get(i2)).setText(str.substring(0, 1));
                str = str.substring(1);
                i = i2 + 1;
            }
        }
    }

    public void setTextColor(int i) {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setTextColor(i);
        }
    }
}
