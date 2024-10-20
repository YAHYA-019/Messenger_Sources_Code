package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.facebook.profilo.multiprocess.ProfiloIPCParcelable;

/* renamed from: X.03k, reason: invalid class name */
/* loaded from: 03k.class */
public abstract class C03k extends BroadcastReceiver {
    public abstract ProfiloIPCParcelable A00();

    public abstract String A01();

    public abstract String A02();

    public final void A03(Context context, String str) {
        Intent intent = new Intent(A02());
        intent.putExtra("pid", Process.myPid());
        ProfiloIPCParcelable A00 = A00();
        if (A00 != null) {
            intent.putExtra("parcel", A00);
        }
        context.sendBroadcast(intent, str);
    }
}
