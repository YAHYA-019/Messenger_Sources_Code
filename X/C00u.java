package X;

import java.io.Serializable;
import kotlin.enums.EnumEntries;

/* renamed from: X.00u, reason: invalid class name */
/* loaded from: 00u.class */
public final class C00u extends C00v implements Serializable, EnumEntries {
    public final Enum[] entries;

    public C00u(Enum[] enumArr) {
        this.entries = enumArr;
    }

    private final Object writeReplace() {
        return new 12L(this.entries);
    }

    @Override // X.C00w
    public int A08() {
        return this.entries.length;
    }

    @Override // X.C00w, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r0 = (Enum) obj;
        11T.A0F(r0, 0);
        return AnonymousClass001.A1W(02L.A02(this.entries, r0.ordinal()), r0);
    }

    @Override // X.C00v, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        C0A7.A01(i, this.entries.length);
        return this.entries[i];
    }

    @Override // X.C00v, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r0 = (Enum) obj;
        11T.A0F(r0, 0);
        int ordinal = r0.ordinal();
        if (02L.A02(this.entries, ordinal) == r0) {
            return ordinal;
        }
        return -1;
    }

    @Override // X.C00v, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        11T.A0F(obj, 0);
        return indexOf(obj);
    }
}
