package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* loaded from: A39.class */
public final class A39 implements C08j {
    public static final IntentFilter A01 = new IntentFilter("com.facebook.messaging.highlightstab.model.highlights_hosting_fragment_invisible");
    public final C00m A00;

    public A39(C00m c00m) {
        this.A00 = c00m;
    }

    @Override // X.C08j
    public ArrayList Ara() {
        return C0s8.A10(A01);
    }

    @Override // X.C08j
    public void CFb(Context context, Intent intent, C01q c01q) {
        this.A00.invoke();
    }
}
