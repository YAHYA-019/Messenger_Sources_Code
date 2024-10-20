package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.inject.FbInjector;
import com.facebook.storage.keystats.fbapps.FbSharedPreferencesCompat;
import java.util.concurrent.Executor;

/* renamed from: X.5hj, reason: invalid class name */
/* loaded from: 5hj.class */
public final class C5hj {
    public long A00;
    public final SharedPreferences A01;
    public final C00i A02;
    public final C5hm A03;
    public final C1Zg A04;

    public C5hj() {
        C1Zg c1Zg = (C1Zg) 1Bn.A0A(33057);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(65567);
        1G2 A0D = 1G0.A00.A0D("stash/utilization");
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            FbSharedPreferencesCompat fbSharedPreferencesCompat = new FbSharedPreferencesCompat(A0D);
            1Bn.A0K();
            FbInjector.A04(A01);
            C5hl c5hl = (C5hl) 1Bi.A03(66764);
            this.A00 = 0L;
            this.A04 = c1Zg;
            this.A03 = new C5hm(fbSharedPreferencesCompat, c5hl, (Executor) 1Bn.A0A(16454));
            this.A01 = fbSharedPreferencesCompat;
            this.A02 = new 1BQ(16465);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
