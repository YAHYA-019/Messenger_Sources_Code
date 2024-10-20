package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4yg.class */
public final class C12024yg {
    public final Context A00;
    public final FbSharedPreferences A01;
    public final ExecutorService A02;

    public C12024yg() {
        Context A00 = FbInjector.A00();
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        ExecutorService executorService = (ExecutorService) 1Bi.A03(16449);
        this.A00 = A00;
        this.A01 = fbSharedPreferences;
        this.A02 = executorService;
    }

    public void A00() {
        this.A02.execute(new JoX(this));
    }
}
