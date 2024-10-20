package X;

import android.text.TextPaint;

/* renamed from: X.9cY, reason: invalid class name */
/* loaded from: 9cY.class */
public final class C9cY {
    public final int A00;
    public final int A01;
    public final long A02;
    public final TextPaint A03;

    public C9cY(TextPaint textPaint, int i, int i2, long j) {
        this.A03 = textPaint;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9cY)) {
                return false;
            }
            C9cY c9cY = (C9cY) obj;
            if (!11T.A0O(this.A03, c9cY.A03) || this.A01 != c9cY.A01 || Float.compare(10.0f, 10.0f) != 0 || Float.compare(1.0f, 1.0f) != 0 || this.A00 != c9cY.A00 || this.A02 != c9cY.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((1BL.A00(1BL.A00((1BL.A03(this.A03) + this.A01) * 31 * 31 * 31, 10.0f), 1.0f) + 1237) * 31) + this.A00) * 31) + 1BL.A01(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextDisplayParams(textPaint=");
        A0k.append(this.A03);
        A0k.append(", viewWidth=");
        A0k.append(this.A01);
        A0k.append(", compoundPaddingLeft=");
        A0k.append(0);
        A0k.append(", compoundPaddingRight=");
        A0k.append(0);
        A0k.append(", lineSpacingExtra=");
        A0k.append(10.0f);
        A0k.append(", lineSpacingMultiplier=");
        A0k.append(1.0f);
        A0k.append(", includeFontPadding=");
        A0k.append(false);
        A0k.append(", maxLines=");
        A0k.append(this.A00);
        A0k.append(", wordIntervalMs=");
        A0k.append(this.A02);
        return 4YV.A0x(A0k);
    }
}
