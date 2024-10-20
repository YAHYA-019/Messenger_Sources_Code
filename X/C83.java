package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Set;

/* loaded from: C83.class */
public final class C83 {
    public ImmutableSet A01;
    public boolean A03;
    public boolean A04;
    public Set A02 = AnonymousClass001.A0v();
    public ImmutableList A00 = ImmutableList.of();

    public void A00(ImmutableList immutableList) {
        this.A00 = immutableList;
        C1pq.A08("dataSourceConfigurations", immutableList);
    }

    public void A01(ImmutableSet immutableSet) {
        this.A01 = immutableSet;
        if (this.A02.contains("selectedUsersFbIds")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A02);
        this.A02 = A1E;
        A1E.add("selectedUsersFbIds");
    }
}
