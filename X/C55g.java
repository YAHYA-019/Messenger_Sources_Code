package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Arrays;

/* renamed from: X.55g, reason: invalid class name */
/* loaded from: 55g.class */
public final class C55g implements AnonymousClass544 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final C1p8 A04;
    public final MigColorScheme A05;
    public final 2KE A06;
    public final CharSequence A07;
    public final boolean A08;

    public C55g(C1p8 c1p8, MigColorScheme migColorScheme, 2KE r304, CharSequence charSequence, int i, int i2, int i3, long j, boolean z) {
        this.A03 = j;
        charSequence.getClass();
        this.A07 = charSequence;
        r304.getClass();
        this.A06 = r304;
        this.A04 = c1p8;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        migColorScheme.getClass();
        this.A05 = migColorScheme;
        this.A08 = z;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544 instanceof C55g) {
            C55g c55g = (C55g) anonymousClass544;
            if (Objects.equal(this.A07, c55g.A07) && Objects.equal(this.A06, c55g.A06) && Objects.equal(this.A04, c55g.A04) && this.A01 == c55g.A01 && this.A02 == c55g.A02 && this.A00 == c55g.A00 && Objects.equal(this.A05, c55g.A05) && this.A08 == c55g.A08) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        long j = this.A03;
        if (j == -1) {
            j = Arrays.hashCode(new Object[]{this.A07, this.A06, this.A04, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A00), this.A05, null});
        }
        return j;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("text", this.A07);
        stringHelper.add("textStyle", this.A06);
        stringHelper.add("textColor", this.A04);
        stringHelper.add("horizontalPaddingDp", this.A01);
        stringHelper.add("topPaddingDp", this.A02);
        stringHelper.add("bottomPaddingDp", this.A00);
        stringHelper.add("colorScheme", AnonymousClass001.A0X(this.A05));
        stringHelper.add("accessibleClickableSpans", this.A08);
        return 4YV.A0s(stringHelper, (Object) null, "textAlignment");
    }
}
