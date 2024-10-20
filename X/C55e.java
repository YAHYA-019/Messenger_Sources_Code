package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* renamed from: X.55e, reason: invalid class name */
/* loaded from: 55e.class */
public final class C55e implements AnonymousClass544 {
    public final long A00;
    public final 55A A01;
    public final 55B A02;
    public final 55E A03;
    public final AnonymousClass555 A04;
    public final EL0 A05;
    public final MigColorScheme A06;
    public final CharSequence A07;
    public final Integer A08;
    public final boolean A09;

    public C55e(55A r302, 55B r303, 55E r304, AnonymousClass555 anonymousClass555, EL0 el0, MigColorScheme migColorScheme, CharSequence charSequence, Integer num, long j, boolean z) {
        r302.getClass();
        migColorScheme.getClass();
        this.A00 = j;
        this.A01 = r302;
        this.A02 = r303;
        this.A03 = r304;
        this.A04 = anonymousClass555;
        this.A05 = el0;
        this.A08 = num;
        this.A06 = migColorScheme;
        this.A09 = z;
        this.A07 = charSequence;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == C55e.class) {
            C55e c55e = (C55e) anonymousClass544;
            if (this.A00 == c55e.A00 && 6EV.A00(this.A01, c55e.A01) && 6EW.A00(this.A02, c55e.A02) && 6EU.A00(this.A03, c55e.A03) && C7t5.A00(this.A04, c55e.A04) && this.A05 == c55e.A05 && this.A08 == c55e.A08 && Objects.equal(this.A06, c55e.A06) && this.A09 == c55e.A09 && this.A07 == c55e.A07) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A00;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A00);
        stringHelper.add("tile", this.A03);
        stringHelper.add("title", this.A01);
        stringHelper.add("subtitle", this.A02);
        stringHelper.add("accessory", this.A04);
        stringHelper.add("titleStyle", this.A05);
        stringHelper.add("isEnabled", this.A09);
        return stringHelper.toString();
    }
}
