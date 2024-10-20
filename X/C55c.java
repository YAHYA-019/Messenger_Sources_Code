package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.55c, reason: invalid class name */
/* loaded from: 55c.class */
public final class C55c implements AnonymousClass544 {
    public final int A00;
    public final long A01;
    public final View.OnClickListener A02;
    public final View.OnLongClickListener A03;
    public final 2K8 A04;
    public final MigColorScheme A05;
    public final 2RH A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public C55c(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, 2K8 r304, MigColorScheme migColorScheme, 2RH r306, String str, String str2, String str3, String str4, int i, long j, boolean z) {
        str.getClass();
        this.A01 = j;
        this.A0A = str;
        this.A07 = str2;
        this.A0B = z;
        this.A02 = onClickListener;
        this.A03 = onLongClickListener;
        this.A05 = migColorScheme == null ? LightColorScheme.A00() : migColorScheme;
        this.A09 = str3;
        this.A08 = str4;
        this.A04 = r304;
        this.A00 = i;
        this.A06 = r306;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == C55c.class) {
            C55c c55c = (C55c) anonymousClass544;
            if (this.A01 == c55c.A01 && 1JF.A0C(this.A0A, c55c.A0A) && 1JF.A0C(this.A07, c55c.A07) && this.A0B == c55c.A0B && Objects.equal(this.A05, c55c.A05) && 1JF.A0C(this.A09, c55c.A09) && 1JF.A0C(this.A08, c55c.A08) && this.A04 == c55c.A04 && this.A00 == c55c.A00 && this.A06 == c55c.A06) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A01;
    }
}
