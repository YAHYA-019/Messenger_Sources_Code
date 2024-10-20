package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.56q, reason: invalid class name */
/* loaded from: 56q.class */
public final class C56q implements AnonymousClass544 {
    public final 1LI A00;
    public final 9PG A01;
    public final 9PH A02;
    public final Biu A03;
    public final MigColorScheme A04;
    public final C2fd A05;
    public final String A06;
    public final String A07;

    public C56q(1LI r302, 9PG r303, 9PH r304, Biu biu, MigColorScheme migColorScheme, C2fd c2fd, String str, String str2) {
        this.A01 = r303;
        this.A02 = r304;
        this.A03 = biu;
        this.A05 = c2fd;
        this.A04 = migColorScheme;
        this.A00 = r302;
        this.A06 = str;
        this.A07 = str2;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == C56q.class) {
            C56q c56q = (C56q) anonymousClass544;
            if (this.A05 == c56q.A05 && Objects.equal(this.A04, c56q.A04) && Objects.equal(this.A00, c56q.A00) && Objects.equal(this.A06, c56q.A06) && Objects.equal(this.A07, c56q.A07)) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C56q.class.hashCode();
    }
}
