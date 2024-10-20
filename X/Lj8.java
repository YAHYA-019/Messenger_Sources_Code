package X;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: Lj8.class */
public final class Lj8 implements Iterable, AnonymousClass116 {
    public final /* synthetic */ SerialDescriptor A00;

    public Lj8(SerialDescriptor serialDescriptor) {
        this.A00 = serialDescriptor;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new Lsn(this.A00);
    }
}
