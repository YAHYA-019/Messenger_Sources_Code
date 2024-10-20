package X;

import java.util.Iterator;

/* renamed from: X.Jla, reason: case insensitive filesystem */
/* loaded from: Jla.class */
public abstract class AbstractC3169Jla extends Lj2 {
    public final java.util.Map A00;

    public AbstractC3169Jla(String str) {
        super(str);
        this.A00 = 1BK.A1C();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.MQx
    public boolean A7z() {
        try {
            Iterator A1A = 1BK.A1A(this.A00);
            while (A1A.hasNext()) {
                try {
                    if (!((MQx) A1A.next()).A7z()) {
                        clear();
                        return false;
                    }
                } catch (KPu unused) {
                    clear();
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            clear();
            throw th;
        }
    }

    @Override // X.Lj2, X.MQx, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.util.Map map = this.A00;
        Iterator A1A = 1BK.A1A(map);
        while (A1A.hasNext()) {
            ((MQx) A1A.next()).close();
        }
        map.clear();
        super.close();
    }
}
