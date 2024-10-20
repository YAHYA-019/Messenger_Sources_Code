package X;

import com.google.common.base.Optional;
import java.io.Closeable;

/* loaded from: Lhy.class */
public final class Lhy implements Closeable {
    public final Optional A00;
    public final /* synthetic */ L83 A01;

    public Lhy(L83 l83, Optional optional) {
        11T.A0F(optional, 2);
        this.A01 = l83;
        this.A00 = optional;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01.A00.set(this.A00);
    }
}
