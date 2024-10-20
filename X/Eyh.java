package X;

import android.graphics.Bitmap;

/* loaded from: Eyh.class */
public final class Eyh {
    public final int A00;
    public final Bitmap A01;
    public final EzU A02;

    public Eyh(Bitmap bitmap, EzU ezU, int i) {
        11T.A0F(ezU, 1);
        this.A02 = ezU;
        this.A01 = bitmap;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyh)) {
                return false;
            }
            Eyh eyh = (Eyh) obj;
            if (!11T.A0O(this.A02, eyh.A02) || !11T.A0O(this.A01, eyh.A01) || this.A00 != eyh.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, 1BL.A03(this.A02)) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EmuFlashGeneratedImage(generatedMedia=");
        A0k.append(this.A02);
        A0k.append(", bitmap=");
        A0k.append(this.A01);
        A0k.append(AnonymousClass000.A00(65));
        return DKH.A0p(A0k, this.A00);
    }
}
