package X;

import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.57e, reason: invalid class name */
/* loaded from: 57e.class */
public final class C57e implements AnonymousClass544 {
    public final ThreadParticipant A00;
    public final MigColorScheme A01;

    public C57e(ThreadParticipant threadParticipant, MigColorScheme migColorScheme) {
        this.A00 = threadParticipant;
        this.A01 = migColorScheme;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if ((anonymousClass544 instanceof C57e) && this == anonymousClass544) {
            C57e c57e = (C57e) anonymousClass544;
            if (Objects.equal(this.A00, c57e.A00)) {
                z = 4YV.A1Z(this.A01, c57e.A01);
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C57e.class.hashCode() + 31;
    }
}
