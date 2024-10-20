package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.570, reason: invalid class name */
/* loaded from: 570.class */
public final class AnonymousClass570 implements AnonymousClass544 {
    public final MigColorScheme A00;
    public final String A01;

    public AnonymousClass570(MigColorScheme migColorScheme, String str) {
        11T.A0F(str, 1);
        11T.A0F(migColorScheme, 2);
        this.A01 = str;
        this.A00 = migColorScheme;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        11T.A0F(anonymousClass544, 0);
        boolean z = false;
        if (!11T.A0O(anonymousClass544.getClass(), AnonymousClass570.class)) {
            return false;
        }
        AnonymousClass570 anonymousClass570 = (AnonymousClass570) anonymousClass544;
        if (11T.A0O(anonymousClass570.A01, this.A01) && 11T.A0O(this.A00, anonymousClass570.A00)) {
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return AnonymousClass570.class.hashCode();
    }
}
