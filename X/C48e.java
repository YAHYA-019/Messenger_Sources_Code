package X;

import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.48e, reason: invalid class name */
/* loaded from: 48e.class */
public final class C48e {
    public String A01;
    public String A02;
    public Set A03 = new HashSet();
    public ImmutableList A00 = ImmutableList.of();

    public void A00(ImmutableList immutableList) {
        this.A00 = immutableList;
        C1pq.A08("colors", immutableList);
    }

    public void A01(String str) {
        this.A01 = str;
        C1pq.A08("direction", str);
        if (this.A03.contains("direction")) {
            return;
        }
        HashSet hashSet = new HashSet(this.A03);
        this.A03 = hashSet;
        hashSet.add("direction");
    }
}
