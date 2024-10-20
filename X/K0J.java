package X;

import android.os.SystemClock;

/* loaded from: K0J.class */
public final class K0J extends LaD {
    public final JSv A00;

    public K0J(JSv jSv, 6W8 r303) {
        super(r303);
        this.A00 = jSv;
    }

    public void Bdn() {
        JSv jSv = this.A00;
        try {
            super.Bdn();
        } catch (6Db e) {
            if (e.getClass().equals(6Db.class)) {
                long j = jSv.A01;
                if (j > 0) {
                    long j2 = jSv.A00;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (j2 == -9223372036854775807L) {
                        jSv.A00 = elapsedRealtime;
                        return;
                    } else if (elapsedRealtime - j2 <= j) {
                        return;
                    }
                }
            }
            throw e;
        }
    }
}
