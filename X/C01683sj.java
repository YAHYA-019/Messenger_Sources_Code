package X;

import java.util.HashMap;

/* renamed from: X.3sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3sj.class */
public final class C01683sj implements InterfaceC01693sk {
    @Override // X.InterfaceC01693sk
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        String str;
        F6v f6v = ((Eqk) obj).A02;
        Object obj2 = null;
        if (f6v != null && (str = f6v.A0I) != null) {
            obj2 = new HashMap(f6v.A08.A00).get(str);
        }
        return obj2;
    }
}
