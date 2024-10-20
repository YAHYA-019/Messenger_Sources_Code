package com.facebook.messaging.photos.editing;

import X.0FI;
import X.11T;
import X.6P9;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.HUR;
import X.HUW;
import X.HUY;
import X.HiJ;
import X.HtQ;
import X.JFU;
import X.LJq;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Window;
import com.facebook.resources.ui.FbEditText;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: LayerEditText.class */
public class LayerEditText extends FbEditText {
    public JFU A00;
    public ArrayList A01;
    public ArrayList A02;
    public boolean A03;

    public LayerEditText(Context context) {
        super(context);
    }

    public LayerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LayerEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        Context context = getContext();
        if (!(context instanceof Activity) || this.A03) {
            return;
        }
        Window window = ((Activity) context).getWindow();
        if (hasFocus() && hasWindowFocus()) {
            window.addFlags(1024);
        } else {
            window.clearFlags(1024);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addTextChangedListener(TextWatcher textWatcher) {
        super/*android.widget.TextView*/.addTextChangedListener(textWatcher);
        ArrayList arrayList = this.A02;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            this.A02 = arrayList;
        }
        arrayList.add(textWatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-160643992);
        super/*android.widget.TextView*/.onAttachedToWindow();
        Context context = getContext();
        if (context instanceof Activity) {
            this.A03 = AnonymousClass001.A1N(((Activity) context).getWindow().getAttributes().flags & 1024);
        }
        0FI.A0C(2070968889, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = 0FI.A06(1039067277);
        super/*android.widget.TextView*/.onFocusChanged(z, i, rect);
        if (!z) {
            Editable text = getText();
            for (Object obj : text.getSpans(0, text.length(), UnderlineSpan.class)) {
                text.removeSpan(obj);
            }
            AbstractC2327GOs.A0g(this, false);
        }
        A00();
        0FI.A0C(1927157086, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        JFU jfu;
        if (i != 4 || keyEvent.getAction() != 1 || (jfu = this.A00) == null) {
            return super/*android.widget.TextView*/.onKeyPreIme(i, keyEvent);
        }
        jfu.Bkc(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSelectionChanged(int i, int i2) {
        HtQ htQ;
        CharSequence subSequence;
        super/*android.widget.TextView*/.onSelectionChanged(i, i2);
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                HiJ hiJ = ((HUR) it.next()).A00;
                HUY huy = hiJ.A02;
                if (huy != null) {
                    String str = null;
                    if (hiJ.A03) {
                        6P9 r0 = hiJ.A00;
                        Editable text = r0.getText();
                        int selectionEnd = r0.getSelectionEnd() - 1;
                        int i3 = selectionEnd + 1;
                        LJq[] lJqArr = (LJq[]) text.getSpans(selectionEnd, i3, LJq.class);
                        if (lJqArr.length > 0) {
                            LJq lJq = lJqArr[0];
                            int spanStart = text.getSpanStart(lJq) + 1;
                            String charSequence = text.subSequence(spanStart, text.getSpanEnd(lJq)).toString();
                            String A00 = lJq.A02.A0X.A00();
                            11T.A0A(A00);
                            if (!charSequence.equals(A00.replace(' ', (char) 160))) {
                                text.removeSpan(lJq);
                            }
                            subSequence = text.subSequence(spanStart, i3);
                        } else {
                            while (selectionEnd >= 0 && text.charAt(selectionEnd) != ' ') {
                                if (text.charAt(selectionEnd) == '@') {
                                    subSequence = text.subSequence(selectionEnd + 1, i3);
                                } else {
                                    selectionEnd--;
                                }
                            }
                        }
                        str = subSequence.toString();
                        break;
                    }
                    HUW huw = huy.A00.A01;
                    if (huw != null && (htQ = huw.A00.A03) != null) {
                        htQ.A01(str);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-2116174310);
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        setPivotX(i / 2);
        setPivotY(i2 / 2);
        0FI.A0C(-2062633390, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        int A06 = 0FI.A06(-753295073);
        super/*android.widget.TextView*/.onWindowFocusChanged(z);
        A00();
        0FI.A0C(732596866, A06);
    }
}
