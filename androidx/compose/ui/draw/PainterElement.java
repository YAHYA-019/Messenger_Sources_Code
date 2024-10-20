package androidx.compose.ui.draw;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Kdj;
import X.Krv;
import X.LOB;
import X.MLf;
import androidx.compose.ui.Alignment;

/* loaded from: PainterElement.class */
public final class PainterElement extends LOB {
    public final float A00;
    public final Alignment A01;
    public final Kdj A02;
    public final Krv A03;
    public final MLf A04;
    public final boolean A05 = true;

    public PainterElement(Alignment alignment, Kdj kdj, Krv krv, MLf mLf, float f) {
        this.A03 = krv;
        this.A01 = alignment;
        this.A04 = mLf;
        this.A00 = f;
        this.A02 = kdj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PainterElement)) {
                return false;
            }
            PainterElement painterElement = (PainterElement) obj;
            if (!11T.A0O(this.A03, painterElement.A03) || this.A05 != painterElement.A05 || !11T.A0O(this.A01, painterElement.A01) || !11T.A0O(this.A04, painterElement.A04) || Float.compare(this.A00, painterElement.A00) != 0 || !11T.A0O(this.A02, painterElement.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A00(AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A01, (1BL.A03(this.A03) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31)), this.A00) + AnonymousClass001.A02(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PainterElement(painter=");
        A0k.append(this.A03);
        A0k.append(", sizeToIntrinsics=");
        A0k.append(this.A05);
        A0k.append(", alignment=");
        A0k.append(this.A01);
        A0k.append(", contentScale=");
        A0k.append(this.A04);
        A0k.append(", alpha=");
        A0k.append(this.A00);
        A0k.append(", colorFilter=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}
