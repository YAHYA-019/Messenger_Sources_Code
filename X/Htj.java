package X;

import android.view.View;
import java.util.Arrays;

/* loaded from: Htj.class */
public final class Htj {
    public final int A00;
    public final int A01;
    public final long A02;
    public final View A03;

    public Htj(View view, int i, int i2, long j) {
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = view;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            Htj htj = (Htj) obj;
            if (this.A02 != htj.A02 || this.A01 != htj.A01 || this.A03 != htj.A03 || this.A00 != htj.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A02), Integer.valueOf(this.A00), this.A03});
    }

    public String toString() {
        C46q c46q = new C46q("RenderRequest");
        C46q.A00(c46q, String.valueOf(this.A02), "ssrc");
        c46q.A01("streamType", this.A01);
        c46q.A01("renderLocation", this.A00);
        C46q.A00(c46q, this.A03, "view");
        return 11T.A02(c46q);
    }
}
