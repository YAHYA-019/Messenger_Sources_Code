package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.572, reason: invalid class name */
/* loaded from: 572.class */
public final class AnonymousClass572 implements AnonymousClass544 {
    public final long A00;
    public final MigColorScheme A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass572(MigColorScheme migColorScheme, String str, String str2, String str3, long j) {
        this.A00 = j;
        this.A01 = migColorScheme;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == AnonymousClass572.class) {
            AnonymousClass572 anonymousClass572 = (AnonymousClass572) anonymousClass544;
            if (this.A00 == anonymousClass572.A00 && Objects.equal(this.A01, anonymousClass572.A01) && Objects.equal(this.A04, anonymousClass572.A04) && Objects.equal(this.A03, anonymousClass572.A03)) {
                z = 4YV.A1Z(this.A02, anonymousClass572.A02);
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A00;
    }
}
