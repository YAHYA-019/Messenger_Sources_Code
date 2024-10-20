package X;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: Lsn.class */
public final class Lsn implements Iterator, AnonymousClass116 {
    public int A00;
    public final /* synthetic */ SerialDescriptor A01;

    public Lsn(SerialDescriptor serialDescriptor) {
        this.A01 = serialDescriptor;
        this.A00 = serialDescriptor.Aj9();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return AnonymousClass001.A1P(this.A00);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        SerialDescriptor serialDescriptor = this.A01;
        int Aj9 = serialDescriptor.Aj9();
        int i = this.A00;
        this.A00 = i - 1;
        return serialDescriptor.Aj8(Aj9 - i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
