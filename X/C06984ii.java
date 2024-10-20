package X;

import android.graphics.Bitmap;
import android.graphics.PointF;

/* renamed from: X.4ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ii.class */
public class C06984ii extends AbstractC06994ij {
    public final Bitmap.Config A00;
    public final PointF A01;
    public final InterfaceC07034in A02;
    public final C5em A03;
    public final 5BK A04;
    public final C2r9 A05;
    public final C02353ux A06;
    public final C2rD A07;
    public final 30B A08;
    public final 3xX A09;
    public final Boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C06984ii(C07014il c07014il) {
        super(c07014il);
        this.A06 = c07014il.A06;
        this.A08 = c07014il.A08;
        this.A07 = c07014il.A07;
        this.A09 = c07014il.A09;
        this.A05 = c07014il.A05;
        this.A04 = c07014il.A04;
        this.A03 = c07014il.A03;
        this.A02 = c07014il.A02;
        this.A01 = c07014il.A01;
        this.A0C = c07014il.A0C;
        this.A0B = c07014il.A0B;
        this.A00 = c07014il.A00;
        this.A0A = c07014il.A0A;
    }

    public static C07004ik A00() {
        return 5BI.A00(C06974ih.A0Q);
    }

    public static void A01(5BH r301, C07004ik c07004ik) {
        r301.A2Z(new C06974ih(c07004ik));
    }

    public C46q A02() {
        C46q A00 = C2qv.A00(this);
        C46q.A00(A00, super.A00, "priority");
        C46q.A00(A00, super.A01, "cacheChoice");
        C46q.A00(A00, super.A02, "diskCacheId");
        C46q.A00(A00, this.A06, "resizeOptions");
        C46q.A00(A00, this.A08, "downsampleOverride");
        C46q.A00(A00, this.A07, "rotationOptions");
        C46q.A00(A00, this.A09, "postprocessor");
        C46q.A00(A00, this.A05, "imageDecodeOptions");
        C46q.A00(A00, this.A04, "roundingOptions");
        C46q.A00(A00, this.A03, "borderOptions");
        C46q.A00(A00, this.A02, "actualImageScaleType");
        C46q.A00(A00, this.A01, "actualImageFocusPoint");
        A00.A02("localThumbnailPreviewsEnabled", this.A0C);
        A00.A02("loadThumbnailOnly", this.A0B);
        C46q.A00(A00, this.A00, "bitmapConfig");
        C46q.A00(A00, this.A0A, 1BJ.A00(1948));
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0158, code lost:
    
        if (X.C2qv.A01(r301.A02, ((X.AbstractC06994ij) r302).A02) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(X.C06984ii r302) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06984ii.A03(X.4ii):boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !1BL.A1V(this, obj)) {
            return false;
        }
        return A03((C06984ii) obj);
    }

    @Override // X.AbstractC06994ij
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        C02353ux c02353ux = this.A06;
        int i = 0;
        int hashCode2 = (hashCode + (c02353ux != null ? c02353ux.hashCode() : 0)) * 31;
        30B r0 = this.A08;
        int hashCode3 = (hashCode2 + (r0 != null ? r0.hashCode() : 0)) * 31;
        C2rD c2rD = this.A07;
        int hashCode4 = (hashCode3 + (c2rD != null ? c2rD.hashCode() : 0)) * 31;
        3xX r02 = this.A09;
        int hashCode5 = (hashCode4 + (r02 != null ? r02.hashCode() : 0)) * 31;
        C2r9 c2r9 = this.A05;
        int hashCode6 = (hashCode5 + (c2r9 != null ? c2r9.hashCode() : 0)) * 31;
        5BK r03 = this.A04;
        int hashCode7 = (hashCode6 + (r03 != null ? r03.hashCode() : 0)) * 31;
        C5em c5em = this.A03;
        int hashCode8 = (((hashCode7 + (c5em != null ? c5em.hashCode() : 0)) * 31) + this.A02.hashCode()) * 31;
        PointF pointF = this.A01;
        int hashCode9 = (((((hashCode8 + (pointF != null ? pointF.hashCode() : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31;
        Bitmap.Config config = this.A00;
        int hashCode10 = (hashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.A0A;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DecodedImageOptions{");
        A0k.append(A02());
        return AnonymousClass001.A0f(A0k);
    }
}
