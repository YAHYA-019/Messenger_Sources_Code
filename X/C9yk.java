package X;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9yk, reason: invalid class name */
/* loaded from: 9yk.class */
public final class C9yk implements AnonymousClass544 {
    public final Aa5 A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;

    public C9yk(Aa5 aa5, ImmutableList immutableList, ImmutableList immutableList2, String str) {
        this.A02 = immutableList == null ? ImmutableList.of() : immutableList;
        this.A03 = str == null ? "" : str;
        this.A01 = immutableList2;
        this.A00 = aa5;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == C9yk.class) {
            C9yk c9yk = (C9yk) anonymousClass544;
            if (Objects.equal(this.A02, c9yk.A02) && Objects.equal(this.A01, c9yk.A01)) {
                z = 4YV.A1Z(this.A03, c9yk.A03);
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C9yk.class.hashCode() + 31;
    }
}
