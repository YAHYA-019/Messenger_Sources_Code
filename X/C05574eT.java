package X;

import com.google.common.base.Predicate;

/* renamed from: X.4eT, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4eT.class */
public final class C05574eT implements Predicate {
    public final /* synthetic */ 1E2 A00;
    public final /* synthetic */ 1E2 A01;

    public C05574eT(1E2 r302, 1E2 r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // com.google.common.base.Predicate
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        boolean z = false;
        if (((1ET) obj).ARN() == this.A01) {
            z = true;
        }
        return z;
    }
}
