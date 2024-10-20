package X;

import android.graphics.Bitmap;

/* loaded from: Eyg.class */
public final class Eyg {
    public final Bitmap A00;
    public final EMx A01;
    public final String A02;

    public Eyg(Bitmap bitmap, EMx eMx, String str) {
        11T.A0F(eMx, 1);
        this.A01 = eMx;
        this.A00 = bitmap;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyg)) {
                return false;
            }
            Eyg eyg = (Eyg) obj;
            if (this.A01 != eyg.A01 || !11T.A0O(this.A00, eyg.A00) || !11T.A0O(this.A02, eyg.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1BL.A03(this.A01) + AnonymousClass001.A02(this.A00)) * 31) + 7zN.A05(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MEmuPoseData(memuPose=");
        A0k.append(this.A01);
        A0k.append(", bitmap=");
        A0k.append(this.A00);
        A0k.append(", uploadHandle=");
        return DKH.A0o(this.A02, A0k);
    }
}
