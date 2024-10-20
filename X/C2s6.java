package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2s6, reason: invalid class name */
/* loaded from: 2s6.class */
public class C2s6 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C2s6.class, "_handled$volatile");
    public final Throwable A00;
    public volatile /* synthetic */ int _handled$volatile;

    public C2s6(Throwable th, boolean z) {
        this.A00 = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(AnonymousClass001.A0X(this));
        A0k.append('[');
        A0k.append(this.A00);
        return AnonymousClass001.A0g(A0k, ']');
    }
}
