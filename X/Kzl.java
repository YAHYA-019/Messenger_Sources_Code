package X;

import android.content.SharedPreferences;

/* loaded from: Kzl.class */
public final class Kzl {
    public final long A00;
    public final /* synthetic */ K6h A01;

    public Kzl(K6h k6h, long j) {
        this.A01 = k6h;
        AbstractC00481b7.A04("monitoring");
        AbstractC00481b7.A07(AnonymousClass001.A1P((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        this.A00 = j;
    }

    public static final void A00(Kzl kzl) {
        K6h k6h = kzl.A01;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = k6h.A00.edit();
        edit.remove(String.valueOf("monitoring").concat(":count"));
        edit.remove(String.valueOf("monitoring").concat(":value"));
        edit.putLong(String.valueOf("monitoring").concat(":start"), currentTimeMillis);
        edit.commit();
    }
}
