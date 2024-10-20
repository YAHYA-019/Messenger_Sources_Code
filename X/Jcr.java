package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: Jcr.class */
public final class Jcr extends Kdj {
    public final long A00;

    public Jcr(long j) {
        super(Build.VERSION.SDK_INT >= 29 ? KUX.A00(j) : new PorterDuffColorFilter(L5e.A00(j), PorterDuff.Mode.SRC_IN));
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Jcr)) {
                return false;
            }
            long j = this.A00;
            long j2 = ((Jcr) obj).A00;
            long j3 = LDp.A01;
            if (j != j2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = LDp.A01;
        return 7zQ.A02(j) + 5;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BlendModeColorFilter(color=");
        JQz.A12(this.A00, A0k);
        A0k.append(", blendMode=");
        return AnonymousClass002.A0K("SrcIn", A0k);
    }
}
