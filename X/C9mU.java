package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.9mU, reason: invalid class name */
/* loaded from: 9mU.class */
public final class C9mU {
    public static final void A00(TextUtils.TruncateAt truncateAt, C9cu c9cu, TextInputView textInputView) {
        if (textInputView.getEllipsize() != truncateAt) {
            KeyListener keyListener = textInputView.getKeyListener();
            if (keyListener == null) {
                9W5 r0 = c9cu.A03;
                if (r0 == null) {
                    throw 1BK.A0h();
                }
                keyListener = r0.A0H;
            }
            c9cu.A00 = keyListener;
            textInputView.setKeyListener(null);
            textInputView.setEllipsize(truncateAt);
        }
    }

    public static final boolean A01() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r0 == 145) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(int r301) {
        /*
            r0 = r301
            r1 = 4095(0xfff, float:5.738E-42)
            r0 = r0 & r1
            r301 = r0
            r0 = 129(0x81, float:1.81E-43)
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L2b
            r0 = 225(0xe1, float:3.15E-43)
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L2b
            r0 = 18
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L2b
            r0 = 145(0x91, float:2.03E-43)
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L2d
        L2b:
            r0 = 1
            r302 = r0
        L2d:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9mU.A02(int):boolean");
    }

    public static final boolean A03(TextInputView textInputView) {
        Editable text = textInputView.getText();
        boolean z = false;
        if (text == null) {
            return false;
        }
        Rect rect = new Rect();
        textInputView.getPaint().getTextBounds(text.toString(), 0, text.length(), rect);
        if (rect.width() > (textInputView.getWidth() - textInputView.getPaddingLeft()) - textInputView.getPaddingRight()) {
            z = true;
        }
        return z;
    }

    public final boolean A04(TextInputView textInputView) {
        Editable text = textInputView.getText();
        boolean z = false;
        if (text != null && text.length() != 0 && textInputView.getWidth() != 0 && textInputView.getLineCount() <= 1 && (textInputView.getInputType() & 131087) != 131073 && !A02(textInputView.getInputType())) {
            z = true;
        }
        return z;
    }
}
