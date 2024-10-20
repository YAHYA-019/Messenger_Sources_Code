package X;

import java.io.Closeable;
import java.util.stream.BaseStream;
import java.util.stream.Stream;

/* loaded from: Li3.class */
public final class Li3 implements Closeable {
    public final BaseStream A00;

    public Li3(BaseStream baseStream) {
        this.A00 = baseStream;
    }

    public static Li3 A00(Stream stream) {
        return stream != null ? new Li3(stream) : A00(Stream.empty());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        this.A00.close();
    }
}
