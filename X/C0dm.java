package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0dm, reason: invalid class name */
/* loaded from: 0dm.class */
public final class C0dm implements Runnable {
    public static final String __redex_internal_original_name = "PublicBaseJobIntentServiceWithSwitchOff$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ Class A03;

    public C0dm(Context context, Class cls, int i, Intent intent) {
        this.A01 = context;
        this.A03 = cls;
        this.A02 = intent;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        0Fc.A01(this.A01, this.A03, this.A00 + 1, this.A02);
    }
}
