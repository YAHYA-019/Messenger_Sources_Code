package X;

import com.facebook.messaging.business.plugins.suggestedreply.model.ReplyEntry;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.574, reason: invalid class name */
/* loaded from: 574.class */
public final class AnonymousClass574 implements AnonymousClass544 {
    public final int A00;
    public final int A01;
    public final 06Z A02;
    public final DGf A03;
    public final ReplyEntry A04;
    public final MigColorScheme A05;
    public final String A06;

    public AnonymousClass574(06Z r302, DGf dGf, ReplyEntry replyEntry, MigColorScheme migColorScheme, String str, int i, int i2) {
        this.A05 = migColorScheme;
        this.A04 = replyEntry;
        this.A03 = dGf;
        this.A02 = r302;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = str;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == AnonymousClass574.class) {
            AnonymousClass574 anonymousClass574 = (AnonymousClass574) anonymousClass544;
            if (Objects.equal(this.A05, anonymousClass574.A05) && Objects.equal(this.A04, anonymousClass574.A04) && Objects.equal(Integer.valueOf(this.A00), Integer.valueOf(anonymousClass574.A00)) && Objects.equal(Integer.valueOf(this.A01), Integer.valueOf(anonymousClass574.A01)) && Objects.equal(this.A03, anonymousClass574.A03) && Objects.equal(this.A02, anonymousClass574.A02)) {
                z = 4YV.A1Z(this.A06, anonymousClass574.A06);
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 0L;
    }
}
