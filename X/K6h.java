package X;

import android.content.SharedPreferences;

/* loaded from: K6h.class */
public final class K6h extends K6n {
    public SharedPreferences A00;
    public long A01;
    public long A02;
    public final Kzl A03;

    public K6h(L9t l9t) {
        super(l9t);
        this.A02 = -1;
        this.A03 = new Kzl(this, AnonymousClass001.A05(Kz3.A09.A00));
    }

    public final long A0J() {
        L0g.A00();
        A0I();
        long j = this.A01;
        if (j == 0) {
            j = this.A00.getLong("first_run", 0L);
            if (j == 0) {
                j = System.currentTimeMillis();
                SharedPreferences.Editor edit = this.A00.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    LCw.A0A(this, "Failed to commit first run time", 5);
                }
            }
            this.A01 = j;
        }
        return j;
    }

    public final long A0K() {
        L0g.A00();
        A0I();
        long j = this.A02;
        if (j == -1) {
            j = this.A00.getLong("last_dispatch", 0L);
            this.A02 = j;
        }
        return j;
    }

    public final void A0L() {
        L0g.A00();
        A0I();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.A02 = currentTimeMillis;
    }
}
