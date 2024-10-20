package X;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableEntry;

/* loaded from: Lf5.class */
public final class Lf5 implements Predicate {
    public final Object A00;
    public final /* synthetic */ K9W A01;

    public Lf5(K9W k9w, Object obj) {
        this.A01 = k9w;
        this.A00 = obj;
    }

    @Override // com.google.common.base.Predicate
    public boolean apply(Object obj) {
        return this.A01.A00.apply(new ImmutableEntry(this.A00, obj));
    }
}
