package X;

import android.content.Intent;

/* renamed from: X.0y0, reason: invalid class name */
/* loaded from: 0y0.class */
public final class C0y0 implements 0Fl {
    public final int A00;
    public final Intent A01;
    public final /* synthetic */ 0Fe A02;

    public C0y0(Intent intent, 0Fe r303, int i) {
        this.A02 = r303;
        this.A01 = intent;
        this.A00 = i;
    }

    public void AGu() {
        this.A02.stopSelf(this.A00);
    }

    public Intent getIntent() {
        return this.A01;
    }
}
