package X;

import java.util.Random;

/* renamed from: X.0ln, reason: invalid class name */
/* loaded from: 0ln.class */
public final class C0ln extends ThreadLocal {
    public final /* synthetic */ 13D A00;

    public C0ln(13D r302) {
        this.A00 = r302;
    }

    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        return new Random();
    }
}
