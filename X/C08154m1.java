package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import java.util.List;

/* renamed from: X.4m1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4m1.class */
public final class C08154m1 extends BroadcastReceiver {
    public final Looper A00;
    public final C4A9 A01;
    public final 4AP A02;

    public C08154m1(Looper looper, C4A9 c4a9, 4AP r304) {
        this.A01 = c4a9;
        this.A02 = r304;
        looper.getClass();
        this.A00 = looper;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(368015069);
        List A012 = this.A02.A01(this.A00);
        if (A012 == null || A012.isEmpty()) {
            i = -596845534;
        } else {
            this.A01.CFd(context, intent, A012);
            i = 1803864619;
        }
        0FI.A0D(i, A01, intent);
    }
}
