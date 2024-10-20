package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.6xa, reason: invalid class name */
/* loaded from: 6xa.class */
public final class C6xa {
    public ThreadKey A00;
    public C6tS A01 = null;
    public 6wV A02;
    public HashSet A03;

    public static final 6xM A00(Function1 function1, boolean z) {
        C6xa c6xa = new C6xa();
        if (!z) {
            return (6xM) function1.invoke(c6xa);
        }
        HashSet A0w = AnonymousClass001.A0w(new Class[]{C7Ac.class, 7Aa.class, 7Ad.class, 7Ae.class, 7Af.class, C7Ag.class, C7Ah.class, 7Af.class});
        c6xa.A03 = A0w;
        return 4YU.A0c(c6xa, A0w, function1);
    }
}
