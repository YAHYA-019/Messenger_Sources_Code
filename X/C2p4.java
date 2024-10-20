package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.2p4, reason: invalid class name */
/* loaded from: 2p4.class */
public final class C2p4 extends C2p3 implements Iterable {
    public ImmutableList A00 = null;
    public final ImmutableList A01;

    public C2p4(ImmutableList immutableList) {
        this.A01 = immutableList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C2p4) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            1Du it = this.A01.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                A0i.getClass();
                builder.m11011add((Object) new C2p2(A0i));
            }
            immutableList = builder.build();
            this.A00 = immutableList;
        }
        return immutableList.iterator();
    }

    public String toString() {
        return 0Pz.A0d("[**REDACTED", "**,...]", hashCode());
    }
}
