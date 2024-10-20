package X;

import android.content.Intent;

/* loaded from: Jto.class */
public final class Jto extends C04v implements MCM {
    public final Intent A00;
    public final boolean A01;

    public Jto(Intent intent, boolean z) {
        this.A00 = intent;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jto)) {
                return false;
            }
            Jto jto = (Jto) obj;
            if (!11T.A0O(this.A00, jto.A00) || this.A01 != jto.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
