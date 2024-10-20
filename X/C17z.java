package X;

import android.content.Context;

/* renamed from: X.17z, reason: invalid class name */
/* loaded from: 17z.class */
public final class C17z {
    public Integer A00;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.0MY] */
    public 0MY A00(Context context, AnonymousClass094 anonymousClass094) {
        C09D A01 = 0Pz.A01(context, anonymousClass094, "runtime_params");
        if (A01.contains("DELIVERY_RETRY_INTERVAL")) {
            this.A00 = Integer.valueOf(A01.getInt("DELIVERY_RETRY_INTERVAL", 300));
        }
        Integer num = this.A00;
        ?? obj = new Object();
        ((0MY) obj).A03 = null;
        ((0MY) obj).A00 = 0L;
        ((0MY) obj).A01 = null;
        ((0MY) obj).A02 = num;
        return obj;
    }
}
