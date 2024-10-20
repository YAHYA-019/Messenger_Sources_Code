package X;

import android.graphics.Paint;
import android.text.Editable;
import android.text.style.LineHeightSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: Jwh.class */
public final class Jwh extends Jwa implements LineHeightSpan {
    public final float A00;
    public final String A01;
    public final int A02;

    public Jwh(Editable editable, DisplayMetrics displayMetrics, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(editable, displayMetrics, i, i2, i3, i4);
        String A0g;
        StringBuilder A0k;
        this.A02 = i5;
        if (!z || i == 0) {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append(super.A01);
            A0g = AnonymousClass001.A0g(A0k2, '.');
        } else {
            int i6 = super.A01;
            if (i == 1) {
                A0k = AnonymousClass001.A0k();
                while (i6 > 0) {
                    int i7 = i6 - 1;
                    A0k.insert(0, (char) ((i7 % 26) + 97));
                    i6 = i7 / 26;
                }
            } else if (i6 > 0) {
                int[] iArr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                int i8 = 0;
                String[] strArr = {"m", "cm", "d", "cd", "c", "xc", Lra.__redex_internal_original_name, "xl", "x", "ix", "v", "iv", "i"};
                A0k = AnonymousClass001.A0k();
                while (true) {
                    if (i6 < iArr[i8]) {
                        i8++;
                        if (i8 >= 13) {
                            break;
                        }
                    } else {
                        A0k.append(strArr[i8]);
                        i6 -= iArr[i8];
                    }
                }
            } else {
                A0g = "";
            }
            A0k.append('.');
            A0g = 11T.A02(A0k);
        }
        this.A01 = A0g;
        this.A00 = TypedValue.applyDimension(2, 8.0f, displayMetrics);
        ((LJo) this).A00 = TypedValue.applyDimension(2, 28.0f, displayMetrics) * (i + 1);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        11T.A0F(fontMetricsInt, 5);
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        int i7 = i5 - i6;
        int i8 = this.A02;
        if (i7 > i8) {
            float f = i8 / i7;
            fontMetricsInt.ascent = (int) (i6 * f);
            fontMetricsInt.descent = (int) (i5 * f);
        } else {
            int i9 = (i8 - i7) / 2;
            fontMetricsInt.descent = i5 + i9;
            fontMetricsInt.ascent = i6 - i9;
        }
    }
}
