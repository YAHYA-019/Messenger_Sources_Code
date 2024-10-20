package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.4bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bd.class */
public final class RunnableC04574bd implements Runnable {
    public static final String __redex_internal_original_name = "FgServiceUtil$launchForegroundService$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;

    public RunnableC04574bd(Intent intent, Context context) {
        this.A01 = intent;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        09X.A00().A08().A0G(this.A00, this.A01);
    }
}
