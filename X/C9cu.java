package X;

import android.text.Editable;
import android.text.method.KeyListener;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.9cu, reason: invalid class name */
/* loaded from: 9cu.class */
public final class C9cu {
    public KeyListener A00;
    public FWy A01 = new FWy();
    public TextInputView A02;
    public 9W5 A03;
    public CharSequence A04;
    public CharSequence A05;
    public 03Y A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r302 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence A00() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.primitive.textinput.TextInputView r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r302
            android.text.Editable r0 = r0.getText()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L19
        L12:
            r0 = r302
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r302 = r0
        L17:
            r0 = r302
            return r0
        L19:
            r0 = r301
            java.lang.CharSequence r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
            r302 = r0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9cu.A00():java.lang.CharSequence");
    }

    public final void A01() {
        CharSequence charSequence = null;
        2JB.A02((String) null);
        TextInputView textInputView = this.A02;
        if (textInputView == null) {
            charSequence = "";
        } else {
            Editable text = textInputView.getText();
            if (text != null) {
                text.clear();
            }
        }
        this.A04 = charSequence;
    }

    public final void A02() {
        2JB.A02((String) null);
        TextInputView textInputView = this.A02;
        if (textInputView != null) {
            textInputView.clearFocus();
            new 0SN(textInputView).A00.A01();
        }
    }

    public final void A03(CharSequence charSequence) {
        11T.A0F(charSequence, 0);
        boolean z = true;
        2JB.A02((String) null);
        TextInputView textInputView = this.A02;
        this.A04 = null;
        if (textInputView == null) {
            this.A04 = charSequence;
            return;
        }
        int length = textInputView.getText().length() - textInputView.getSelectionEnd();
        if (textInputView.getSelectionEnd() != 0) {
            z = false;
        }
        textInputView.setText(charSequence);
        if (z) {
            return;
        }
        int length2 = charSequence.length();
        int length3 = charSequence.length();
        if (length2 >= length) {
            length3 -= length;
        }
        textInputView.setSelection(length3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r303 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = 0
            r303 = r0
            r0 = 0
            X.2JB.A02(r0)
            r0 = r301
            com.facebook.primitive.textinput.TextInputView r0 = r0.A02
            r304 = r0
            r0 = r301
            java.lang.CharSequence r0 = r0.A04
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L3f
            r0 = r305
            if (r0 == 0) goto L3a
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r304 = r0
            r0 = r304
            r1 = r305
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            r1 = r304
            java.lang.String r0 = X.AnonymousClass001.A0d(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
        L34:
            r0 = r301
            r1 = r303
            r0.A04 = r1
            return
        L3a:
            r0 = r302
            r303 = r0
            goto L34
        L3f:
            r0 = r305
            if (r0 == 0) goto L5b
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r304 = r0
            r0 = r304
            r1 = r305
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            r1 = r304
            java.lang.String r0 = X.AnonymousClass001.A0d(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5b
            r0 = r304
            r302 = r0
        L5b:
            r0 = r301
            com.facebook.primitive.textinput.TextInputView r0 = r0.A02
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L34
            r0 = r304
            r1 = r302
            r0.append(r1)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9cu.A04(java.lang.String):void");
    }

    public final boolean A05() {
        2JB.A02((String) null);
        TextInputView textInputView = this.A02;
        if (textInputView == null || !textInputView.requestFocus()) {
            return false;
        }
        new 0SN(textInputView).A00.A02();
        return true;
    }
}
