package X;

import android.view.View;

/* loaded from: Hre.class */
public final class Hre {
    public final View.OnClickListener A00;
    public final String A01;

    public Hre(View.OnClickListener onClickListener, String str) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = onClickListener;
    }

    public boolean equals(Object obj) {
        Hre hre;
        String str = this.A01;
        String str2 = null;
        if ((obj instanceof Hre) && (hre = (Hre) obj) != null) {
            str2 = hre.A01;
        }
        return 11T.A0O(str, str2);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
