package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1bq, reason: invalid class name */
/* loaded from: 1bq.class */
public final class C1bq {
    public int A00;
    public int A01;
    public C1bw A02;
    public Set A03;
    public final Set A04;
    public final Set A05;

    public C1bq(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.A05 = hashSet;
        this.A04 = new HashSet();
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            if (cls2 == null) {
                throw AnonymousClass001.A0Q("Null interface");
            }
        }
        Collections.addAll(this.A05, clsArr);
    }

    public C1bo A00() {
        boolean z = false;
        if (this.A02 != null) {
            z = true;
        }
        if (!z) {
            throw AnonymousClass001.A0N("Missing required property: factory.");
        }
        return new C1bo(this.A02, new HashSet(this.A05), new HashSet(this.A04), this.A03, this.A00, this.A01);
    }

    public void A01(1cN r302) {
        if (!(!this.A05.contains(r302.A01))) {
            throw AnonymousClass001.A0L("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.A04.add(r302);
    }
}
