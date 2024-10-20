package X;

import com.google.common.base.Objects;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2p1, reason: invalid class name */
/* loaded from: 2p1.class */
public class C2p1 {
    public final C2p2 A00;
    public final C2p4 A01;
    public final ImmutableList A02;
    public final String A03;

    public C2p1(ImmutableList immutableList, String str) {
        str = Platform.stringIsNullOrEmpty(str) ? null : str;
        this.A03 = str;
        this.A00 = str == null ? null : new C2p2(str);
        this.A02 = immutableList;
        this.A01 = new C2p4(immutableList);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2p1 c2p1 = (C2p1) obj;
            if (!Objects.equal(this.A03, c2p1.A03) || !Objects.equal(this.A02, c2p1.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 0J6.A00(this.A03, this.A02);
    }

    public String toString() {
        return this.A03;
    }
}
