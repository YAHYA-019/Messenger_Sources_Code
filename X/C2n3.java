package X;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.2n3, reason: invalid class name */
/* loaded from: 2n3.class */
public final class C2n3 implements C2n2 {
    public static final C2n4 A06 = new C2z1(0);
    public final C2n4 A00;
    public final C2n2 A01;
    public final Integer A02;
    public final Pattern A03;
    public final boolean A04;
    public final boolean A05;

    public C2n3(C2n4 c2n4, C2n2 c2n2, Integer num, Pattern pattern, boolean z, boolean z2) {
        11T.A0F(pattern, 2);
        this.A02 = num;
        this.A03 = pattern;
        this.A01 = c2n2;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = c2n4;
    }

    @Override // X.C2n2
    public List AL0(Kl6 kl6) {
        11T.A0F(kl6, 0);
        return this.A01.AL0(kl6);
    }
}
