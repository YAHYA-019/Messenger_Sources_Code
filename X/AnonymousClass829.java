package X;

import java.util.HashSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.829, reason: invalid class name */
/* loaded from: 829.class */
public final class AnonymousClass829 {
    public 6wV A00;
    public HashSet A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.829, java.lang.Object] */
    public static final 6xM A00(Function1 function1, boolean z) {
        ?? obj = new Object();
        if (!z) {
            return (6xM) function1.invoke(obj);
        }
        HashSet A0w = AnonymousClass001.A0w(new Class[]{82B.class});
        obj.A01 = A0w;
        return new A6V((Object) obj, A0w, function1);
    }
}
