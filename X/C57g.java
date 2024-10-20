package X;

import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.57g, reason: invalid class name */
/* loaded from: 57g.class */
public final class C57g implements AnonymousClass544 {
    public final int A00;
    public final ThreadParticipant A01;
    public final AaY A02;
    public final MigColorScheme A03;
    public final boolean A04;
    public final boolean A05;

    public C57g(ThreadParticipant threadParticipant, AaY aaY, MigColorScheme migColorScheme, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = threadParticipant;
        this.A03 = migColorScheme;
        this.A02 = aaY;
        this.A05 = z;
        this.A04 = z2;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == C57g.class) {
            if (this == anonymousClass544) {
                return true;
            }
            C57g c57g = (C57g) anonymousClass544;
            if (this.A00 == c57g.A00 && Objects.equal(this.A01, c57g.A01) && Objects.equal(this.A03, c57g.A03) && this.A05 == c57g.A05 && this.A04 == c57g.A04) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 0J6.A01(C57g.class, this.A01, Boolean.valueOf(this.A05));
    }
}
