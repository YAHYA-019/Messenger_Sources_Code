package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.76d, reason: invalid class name */
/* loaded from: 76d.class */
public final class C76d {
    public ThreadKey A00;
    public HashSet A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.76d, java.lang.Object] */
    public static final 6xM A00(Function1 function1, boolean z) {
        ?? obj = new Object();
        if (!z) {
            return (6xM) function1.invoke(obj);
        }
        HashSet A0w = AnonymousClass001.A0w(new Class[]{7D3.class});
        obj.A01 = A0w;
        return 4YU.A0c((Object) obj, A0w, function1);
    }
}
