package X;

import android.text.TextUtils;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/* renamed from: X.565, reason: invalid class name */
/* loaded from: 565.class */
public final class AnonymousClass565 implements AnonymousClass544 {
    public final C2p1 A00;
    public final MigColorScheme A01;
    public final C2fr A02;
    public final ImmutableList A03;
    public final ImmutableList A04;

    public AnonymousClass565(C2p1 c2p1, MigColorScheme migColorScheme, C2fr c2fr, ImmutableList immutableList) {
        c2p1.getClass();
        this.A00 = c2p1;
        this.A02 = c2fr;
        this.A04 = immutableList == null ? ImmutableList.of() : immutableList;
        this.A03 = ImmutableList.of();
        migColorScheme.getClass();
        this.A01 = migColorScheme;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == AnonymousClass565.class) {
            AnonymousClass565 anonymousClass565 = (AnonymousClass565) anonymousClass544;
            ImmutableList immutableList = anonymousClass565.A03;
            int size = immutableList.size();
            ImmutableList immutableList2 = this.A03;
            if (size == immutableList2.size()) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < immutableList2.size()) {
                        if (!TextUtils.equals(((9bL) immutableList.get(i2)).A01, ((9bL) immutableList2.get(i2)).A01)) {
                            break;
                        }
                        i = i2 + 1;
                    } else if (Objects.equal(this.A00, anonymousClass565.A00) && Objects.equal(this.A02, anonymousClass565.A02) && Objects.equal(this.A04, anonymousClass565.A04)) {
                        z = 4YV.A1Z(this.A01, anonymousClass565.A01);
                    }
                }
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 0L;
    }
}
