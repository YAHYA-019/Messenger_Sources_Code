package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.66k, reason: invalid class name */
/* loaded from: 66k.class */
public final class C66k {
    public ImmutableList A00;
    public Object A01;

    public ImmutableList A00() {
        ImmutableList immutableList;
        synchronized (this) {
            immutableList = this.A00;
            if (immutableList == null) {
                Object obj = this.A01;
                if (obj == null) {
                    immutableList = ImmutableList.of();
                    this.A00 = immutableList;
                } else if (obj instanceof ArrayList) {
                    immutableList = ImmutableList.copyOf((Collection) obj);
                    this.A00 = immutableList;
                } else {
                    immutableList = ImmutableList.of(obj);
                    this.A00 = immutableList;
                }
            }
        }
        return immutableList;
    }

    public void A01() {
        synchronized (this) {
            Object obj = this.A01;
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    this.A00 = null;
                }
            } else if (obj != null) {
                this.A01 = null;
                this.A00 = null;
            }
        }
    }
}
