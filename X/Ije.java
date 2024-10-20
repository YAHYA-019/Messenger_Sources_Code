package X;

import android.text.TextUtils;

/* loaded from: Ije.class */
public final class Ije implements JGz {
    public int A00;
    public int A01;
    public String A02;

    @Override // X.JGz
    public boolean BSC(JGz jGz) {
        boolean z = false;
        if (jGz instanceof Ije) {
            Ije ije = (Ije) jGz;
            if (this.A00 == ije.A00 && this.A01 == ije.A01 && TextUtils.equals(this.A02, ije.A02)) {
                z = true;
            }
        }
        return z;
    }
}
