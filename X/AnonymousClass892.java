package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.google.common.base.Objects;

/* renamed from: X.892, reason: invalid class name */
/* loaded from: 892.class */
public final class AnonymousClass892 extends C1rj {
    public int A00;
    public C63s A01;
    public AnonymousClass622 A02;
    public C6qc A03;
    public boolean A04;

    public AnonymousClass892() {
        super("StickerComponent");
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.80T, X.81B] */
    public Object A0n(Context context) {
        InterfaceC07034in interfaceC07034in = 6fM.A0I;
        ?? obj = new Object();
        6fM r0 = new 6fM(context, (80T) obj);
        ((81C) r0).A00 = obj;
        return r0;
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        AnonymousClass892 anonymousClass892 = (AnonymousClass892) r302;
        AnonymousClass892 anonymousClass8922 = (AnonymousClass892) r303;
        Integer num = null;
        Boolean valueOf = anonymousClass892 == null ? null : Boolean.valueOf(anonymousClass892.A04);
        Boolean valueOf2 = anonymousClass8922 == null ? null : Boolean.valueOf(anonymousClass8922.A04);
        C6qc c6qc = anonymousClass892 == null ? null : anonymousClass892.A03;
        C6qc c6qc2 = anonymousClass8922 == null ? null : anonymousClass8922.A03;
        Integer valueOf3 = anonymousClass892 == null ? null : Integer.valueOf(anonymousClass892.A00);
        if (anonymousClass8922 != null) {
            num = Integer.valueOf(anonymousClass8922.A00);
        }
        if (Objects.equal(valueOf3, num) && valueOf == valueOf2) {
            if (c6qc == null) {
                return c6qc != c6qc2;
            }
            if (c6qc2 != null && Objects.equal(c6qc.A06, c6qc2.A06) && Objects.equal(c6qc.A04, c6qc2.A04) && c6qc.A0A == c6qc2.A0A && c6qc.A01 == c6qc2.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        AnonymousClass622 anonymousClass622 = this.A02;
        C6qc c6qc = this.A03;
        1Bi.A03(50202);
        1Bi.A03(68023);
        String str = anonymousClass622.A03.A1n;
        int dimensionPixelSize = 4YU.A0E(r302).getDimensionPixelSize(!TextUtils.isEmpty(str) ? C9dj.A00(str) : 7Qf.A00((GraphQLStickerType) null, c6qc.A06));
        C2ra.A05(c23p, i, i2, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        81C r0 = (81C) obj;
        AnonymousClass622 anonymousClass622 = this.A02;
        C6qc c6qc = this.A03;
        C63s c63s = this.A01;
        boolean z = this.A04;
        int i = this.A00;
        81B r02 = r0.A00;
        if (r02 != null) {
            r02.A01 = anonymousClass622;
            r02.A00 = c63s;
        }
        r0.setAlpha(c6qc.A00);
        r0.A04(4YV.A0C(r302.A0D), c6qc);
        if (i != 0) {
            r0.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        } else {
            r0.setColorFilter(null);
        }
        C69f c69f = ((6fM) r0).A0B;
        float A00 = z ? 7zR.A00(r0) : 0.0f;
        5SA r03 = new 5SA();
        r03.A02(A00);
        c69f.A0A(r03);
        ((6fM) r0).A0C.A03();
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        81C r0 = (81C) obj;
        81B r02 = r0.A00;
        if (r02 != null) {
            r02.A01 = null;
            r02.A00 = null;
        }
        ((6fM) r0).A0C.A04();
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            AnonymousClass892 anonymousClass892 = (AnonymousClass892) r302;
            if (this.A04 != anonymousClass892.A04) {
                return false;
            }
            AnonymousClass622 anonymousClass622 = this.A02;
            AnonymousClass622 anonymousClass6222 = anonymousClass892.A02;
            if (anonymousClass622 != null) {
                if (!anonymousClass622.equals(anonymousClass6222)) {
                    return false;
                }
            } else if (anonymousClass6222 != null) {
                return false;
            }
            C63s c63s = this.A01;
            C63s c63s2 = anonymousClass892.A01;
            if (c63s != null) {
                if (!c63s.equals(c63s2)) {
                    return false;
                }
            } else if (c63s2 != null) {
                return false;
            }
            C6qc c6qc = this.A03;
            C6qc c6qc2 = anonymousClass892.A03;
            if (c6qc != null) {
                if (!c6qc.equals(c6qc2)) {
                    return false;
                }
            } else if (c6qc2 != null) {
                return false;
            }
            if (this.A00 != anonymousClass892.A00) {
                return false;
            }
        }
        return true;
    }
}
