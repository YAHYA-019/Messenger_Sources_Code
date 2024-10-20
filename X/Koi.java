package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: Koi.class */
public final class Koi {
    public final Context A00;

    public Koi(Context context) {
        this.A00 = context;
    }

    public K2P A00(Handler handler, AnonymousClass286 anonymousClass286, 2A4 r304, 2A6 r305) {
        r304.getClass();
        r305.getClass();
        Context context = this.A00;
        HashSet A0v = AnonymousClass001.A0v();
        HashSet A0v2 = AnonymousClass001.A0v();
        0QO r0 = new 0QO(0);
        0QO r02 = new 0QO(0);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        AnonymousClass283 anonymousClass283 = KdD.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Looper mainLooper = context.getMainLooper();
        String packageName = context.getPackageName();
        String A0Y = AnonymousClass001.A0Y(context);
        A0s.add(r304);
        A0s2.add(r305);
        AbstractC00481b7.A03(anonymousClass286, "Api must not be null");
        r02.put(anonymousClass286, null);
        AnonymousClass283 anonymousClass2832 = anonymousClass286.A00;
        AbstractC00481b7.A03(anonymousClass2832, "Base client builder must not be null");
        List A00 = anonymousClass2832.A00(null);
        A0v2.addAll(A00);
        A0v.addAll(A00);
        if (handler != null) {
            mainLooper = handler.getLooper();
        }
        return EYL.A00(context, mainLooper, googleApiAvailability, anonymousClass283, packageName, A0Y, A0s, A0s2, r0, r02, A0v, A0v2);
    }
}
