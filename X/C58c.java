package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.58c, reason: invalid class name */
/* loaded from: 58c.class */
public final class C58c implements 55E {
    public final 2MQ A00;
    public final C1p8 A01;
    public final C1p8 A02;
    public final MigColorScheme A03;
    public final Integer A04;

    public C58c(2MQ r302, C1p8 c1p8, C1p8 c1p82, MigColorScheme migColorScheme, Integer num) {
        this.A00 = r302;
        this.A04 = num;
        this.A03 = migColorScheme;
        this.A02 = c1p8;
        this.A01 = c1p82;
    }

    public boolean BVi(55E r302) {
        boolean z = false;
        if (r302.getClass() == C58c.class) {
            C58c c58c = (C58c) r302;
            if (Objects.equal(this.A00, c58c.A00) && this.A04 == c58c.A04 && Objects.equal(this.A03, c58c.A03) && Objects.equal(this.A02, c58c.A02) && Objects.equal(this.A01, c58c.A01)) {
                z = true;
            }
        }
        return z;
    }
}
