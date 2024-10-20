package X;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* loaded from: Lcm.class */
public abstract class Lcm implements MR0 {
    public final DataHolder A00;

    public Lcm(DataHolder dataHolder) {
        this.A00 = dataHolder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        DataHolder dataHolder = this.A00;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new LsR(this);
    }
}
