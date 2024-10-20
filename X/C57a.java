package X;

import com.facebook.messaging.polling.datamodels.PollingDraftOption;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.57a, reason: invalid class name */
/* loaded from: 57a.class */
public final class C57a implements AnonymousClass544 {
    public final int A00;
    public final AaY A01;
    public final AY4 A02;
    public final PollingDraftOption A03;
    public final MigColorScheme A04;
    public final boolean A05;

    public C57a(AaY aaY, AY4 ay4, PollingDraftOption pollingDraftOption, MigColorScheme migColorScheme, int i, boolean z) {
        this.A00 = i;
        this.A03 = pollingDraftOption;
        this.A04 = migColorScheme;
        this.A01 = aaY;
        this.A02 = ay4;
        this.A05 = z;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == 57U.class) {
            if (this == anonymousClass544) {
                return true;
            }
            57U r0 = (57U) anonymousClass544;
            if (this.A00 == r0.A00 && Objects.equal(this.A03, r0.A02) && Objects.equal(this.A04, r0.A03) && this.A05 == r0.A04) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 0J6.A00(C57a.class, this.A03.A04);
    }
}
