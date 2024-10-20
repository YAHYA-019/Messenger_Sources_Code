package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.5n8, reason: invalid class name */
/* loaded from: 5n8.class */
public final class C5n8 extends C5fu {
    public final int A00;
    public final Uri A01;
    public final 82Z A02;
    public final C5vw A03;
    public final 6Pp A04;
    public final 6C9 A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final C5fx A0E;

    public C5n8(C5w6 c5w6) {
        super(c5w6);
        this.A0E = C5fw.A0S;
        this.A06 = c5w6.A06;
        this.A0C = c5w6.A0C;
        this.A05 = c5w6.A05;
        this.A01 = c5w6.A01;
        this.A0B = c5w6.A0B;
        this.A0A = c5w6.A0A;
        this.A03 = c5w6.A03;
        this.A0D = c5w6.A0D;
        this.A09 = c5w6.A09;
        this.A08 = c5w6.A08;
        this.A00 = c5w6.A00;
        this.A04 = c5w6.A04;
        this.A02 = c5w6.A02;
        this.A07 = c5w6.A07;
    }

    @Override // X.C5fv
    public C5fx Ax3() {
        return this.A0E;
    }

    @Override // X.C5fu
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C5n8)) {
                return false;
            }
            C5n8 c5n8 = (C5n8) obj;
            if (super.equals(obj) && 11T.A0O(this.A06, c5n8.A06) && 11T.A0O(this.A0C, c5n8.A0C) && 11T.A0O(this.A05, c5n8.A05) && 11T.A0O(this.A01, c5n8.A01) && 11T.A0O(this.A0B, c5n8.A0B) && 11T.A0O(this.A0A, c5n8.A0A) && 11T.A0O(this.A03, c5n8.A03) && 11T.A0O(this.A0D, c5n8.A0D) && 11T.A0O(this.A09, c5n8.A09) && 11T.A0O(this.A08, c5n8.A08) && this.A00 == c5n8.A00 && 11T.A0O(this.A04, c5n8.A04) && 11T.A0O(this.A02, c5n8.A02) && 11T.A0O(this.A07, c5n8.A07)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // X.C5fu
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Integer num = this.A06;
        int i = 0;
        int hashCode2 = (((hashCode + (num != null ? num.hashCode() : 0)) * 31) + this.A0C.hashCode()) * 31;
        6C9 r0 = this.A05;
        int hashCode3 = (hashCode2 + (r0 != null ? r0.hashCode() : 0)) * 31;
        Uri uri = this.A01;
        int hashCode4 = (((((((((((hashCode3 + (uri != null ? uri.hashCode() : 0)) * 31) + this.A0B.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A0D.hashCode()) * 31) + this.A09.hashCode()) * 31;
        6Pp r02 = this.A04;
        int hashCode5 = (hashCode4 + (r02 != null ? r02.hashCode() : 0)) * 31;
        82Z r03 = this.A02;
        int hashCode6 = (hashCode5 + (r03 != null ? r03.hashCode() : 0)) * 31;
        String str = this.A07;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((hashCode6 + i) * 31) + this.A08.hashCode()) * 31) + this.A00;
    }

    @Override // X.C5fu
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[XmaMessage title=");
        A0k.append(this.A0B);
        A0k.append(AbE.A00(15));
        A0k.append(this.A0A);
        A0k.append(", media=");
        A0k.append(this.A05);
        A0k.append(", defaultCta=");
        A0k.append(this.A03);
        A0k.append(", ctas=");
        A0k.append(this.A0D);
        A0k.append(", super=");
        return 4YW.A07(super.toString(), A0k);
    }
}
