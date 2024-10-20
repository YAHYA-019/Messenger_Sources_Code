package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* renamed from: X.55z, reason: invalid class name */
/* loaded from: 55z.class */
public final class C55z implements AnonymousClass544 {
    public final long A00;
    public final 55A A01;
    public final 55B A02;
    public final 55B A03;
    public final 55E A04;
    public final AnonymousClass555 A05;
    public final 6BD A06;
    public final MigColorScheme A07;

    public C55z(6BC r302) {
        this.A00 = r302.A00;
        this.A04 = r302.A06;
        55A r0 = r302.A03;
        r0.getClass();
        this.A01 = r0;
        this.A03 = r302.A05;
        this.A02 = r302.A04;
        this.A05 = r302.A07;
        this.A06 = r302.A08;
        this.A07 = r302.A09;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544.getClass() == C55z.class) {
            C55z c55z = (C55z) anonymousClass544;
            if (this.A00 == c55z.A00 && 6EV.A00(this.A01, c55z.A01) && 6EW.A00(this.A03, c55z.A03) && 6EW.A00(this.A02, c55z.A02) && C7t5.A00(this.A05, c55z.A05) && 6EU.A00(this.A04, c55z.A04) && Objects.equal(this.A07, c55z.A07) && this.A06 == c55z.A06) {
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
        stringHelper.add("tile", this.A04);
        stringHelper.add("title", this.A01);
        stringHelper.add("subtitle", this.A03);
        stringHelper.add("metatext", this.A02);
        stringHelper.add("accessory", this.A05);
        stringHelper.add("subtitlestyle", this.A06);
        return 4YV.A0s(stringHelper, AnonymousClass001.A0X(this.A07), "colorScheme");
    }
}
