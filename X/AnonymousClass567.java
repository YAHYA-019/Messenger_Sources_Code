package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.567, reason: invalid class name */
/* loaded from: 567.class */
public final class AnonymousClass567 implements AnonymousClass544 {
    public MigColorScheme A00;
    public ImmutableList A01;
    public String A02;
    public String A03;

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        AnonymousClass567 anonymousClass567;
        ImmutableList immutableList;
        String str;
        String str2;
        boolean z = false;
        if (anonymousClass544.getClass() == AnonymousClass567.class && (immutableList = (anonymousClass567 = (AnonymousClass567) anonymousClass544).A01) != null && immutableList.equals(this.A01) && (str = anonymousClass567.A03) != null && str.equals(this.A03) && (str2 = anonymousClass567.A02) != null && str2.equals(this.A02)) {
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 0L;
    }
}
