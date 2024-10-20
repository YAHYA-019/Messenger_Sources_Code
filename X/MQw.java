package X;

import java.io.Closeable;

/* loaded from: MQw.class */
public interface MQw extends Closeable {
    KlT AqY();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getCount();

    boolean moveToFirst();

    boolean moveToNext();
}
