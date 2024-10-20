package X;

import java.util.HashSet;

/* renamed from: X.00b, reason: invalid class name */
/* loaded from: 00b.class */
public final class C00b extends ThreadLocal {
    public final /* synthetic */ 00R A00;

    public C00b(00R r302) {
        this.A00 = r302;
    }

    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        return new HashSet();
    }
}
