package X;

import android.os.Handler;

/* loaded from: Hp8.class */
public final class Hp8 {
    public boolean A00;
    public final Handler A01 = AnonymousClass001.A07();
    public final S91 A02 = new S91(this);
    public final C00m A03;

    public Hp8(C00m c00m) {
        this.A03 = c00m;
    }

    public final void A00() {
        if (this.A00) {
            this.A00 = false;
            this.A01.removeCallbacks(this.A02);
        }
    }
}
