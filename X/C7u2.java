package X;

import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7u2, reason: invalid class name */
/* loaded from: 7u2.class */
public final class C7u2 {
    public 7Td A00;
    public ImmutableList A01;
    public ImmutableList A02;
    public ImmutableList A03;
    public ImmutableList A04;
    public Set A05;
    public boolean A06;

    public C7u2() {
        this.A05 = AnonymousClass001.A0v();
        this.A01 = ImmutableList.of();
        this.A02 = ImmutableList.of();
    }

    public C7u2(AnonymousClass781 anonymousClass781) {
        this.A05 = AnonymousClass001.A0v();
        this.A00 = anonymousClass781.A00;
        this.A01 = anonymousClass781.A01;
        this.A06 = anonymousClass781.A06;
        this.A02 = anonymousClass781.A02;
        this.A03 = anonymousClass781.A03;
        this.A04 = anonymousClass781.A04;
        this.A05 = new HashSet(anonymousClass781.A05);
    }
}
