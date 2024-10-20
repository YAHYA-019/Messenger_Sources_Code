package X;

import android.animation.Animator;

/* loaded from: Dq5.class */
public final class Dq5 extends C04v {
    public String A03 = "";
    public boolean A04 = true;
    public int A01 = 1;
    public Animator.AnimatorListener A02 = null;
    public float A00 = 0.0f;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dq5)) {
                return false;
            }
            Dq5 dq5 = (Dq5) obj;
            if (!11T.A0O(this.A03, dq5.A03) || this.A04 != dq5.A04 || this.A01 != dq5.A01 || !11T.A0O(this.A02, dq5.A02) || Float.compare(this.A00, dq5.A00) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((4YV.A02(this.A03) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + this.A01) * 31) + AnonymousClass001.A02(this.A02)) * 31) + Float.floatToIntBits(this.A00);
    }
}
