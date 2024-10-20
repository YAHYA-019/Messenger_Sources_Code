package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.554, reason: invalid class name */
/* loaded from: 554.class */
public final class AnonymousClass554 implements AnonymousClass555 {
    public MigColorScheme A00;
    public CharSequence A01;
    public final AnonymousClass553 A02;
    public final CharSequence A03;
    public final boolean A04;

    public AnonymousClass554(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, CharSequence charSequence, boolean z) {
        this.A03 = charSequence;
        this.A04 = z;
        this.A00 = migColorScheme;
        this.A02 = anonymousClass553 == null ? AnonymousClass553.A01 : anonymousClass553;
    }

    @Override // X.AnonymousClass556
    public boolean BVf(AnonymousClass556 anonymousClass556) {
        boolean z = false;
        if (anonymousClass556.getClass() == AnonymousClass554.class) {
            AnonymousClass554 anonymousClass554 = (AnonymousClass554) anonymousClass556;
            if (this.A03.equals(anonymousClass554.A03) && this.A04 == anonymousClass554.A04 && Objects.equal(this.A00, anonymousClass554.A00)) {
                z = 4YV.A1Z(this.A01, anonymousClass554.A01);
            }
        }
        return z;
    }
}
