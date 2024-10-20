package X;

import android.content.BroadcastReceiver;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4m2.class */
public final class C08164m2 {
    public final BroadcastReceiver A00;
    public final Looper A01;
    public final List A02;

    public C08164m2(BroadcastReceiver broadcastReceiver, Looper looper, Object obj) {
        this.A00 = broadcastReceiver;
        this.A01 = looper;
        ArrayList arrayList = new ArrayList(4);
        this.A02 = arrayList;
        arrayList.add(obj);
    }
}
