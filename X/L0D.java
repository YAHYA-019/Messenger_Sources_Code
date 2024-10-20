package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* loaded from: L0D.class */
public final class L0D {
    public int A00;
    public ServiceConnection A01;
    public IGetInstallReferrerService A02;
    public final Context A03;

    public L0D() {
    }

    public L0D(Context context) {
        this.A00 = 0;
        this.A03 = context.getApplicationContext();
    }
}
