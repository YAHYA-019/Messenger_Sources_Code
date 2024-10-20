package X;

import java.util.List;

/* renamed from: X.5fu, reason: invalid class name */
/* loaded from: 5fu.class */
public abstract class C5fu implements C5fv {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C5fs A03;
    public final C2o9 A04;
    public final C5fr A05;
    public final C5fr A06;
    public final Long A07;
    public final Long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final java.util.Map A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C5fu(C5fq c5fq) {
        11T.A0F(c5fq, 1);
        String str = c5fq.A09;
        if (str == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A09 = str;
        this.A0B = c5fq.A0B;
        C5fr c5fr = c5fq.A05;
        if (c5fr == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A05 = c5fr;
        this.A0H = c5fq.A0I;
        this.A02 = c5fq.A02;
        this.A01 = c5fq.A01;
        this.A08 = c5fq.A08;
        this.A04 = c5fq.A04;
        this.A03 = c5fq.A03;
        List list = c5fq.A0D;
        if (list == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A0D = list;
        java.util.Map map = c5fq.A0E;
        if (map == null) {
            map = c5fq.A0F;
            if (map == null) {
                throw AnonymousClass001.A0L("Required value was null.");
            }
        }
        this.A0E = map;
        this.A00 = c5fq.A00;
        this.A0I = c5fq.A0J;
        this.A06 = c5fq.A06;
        this.A0G = c5fq.A0H;
        this.A0F = c5fq.A0G;
        this.A0A = c5fq.A0A;
        this.A0C = c5fq.A0C;
        this.A07 = c5fq.A07;
    }

    /* JADX WARN: Type inference failed for: r0v146, types: [X.5fq, X.5w9] */
    /* JADX WARN: Type inference failed for: r0v171, types: [X.5w4, X.5fq] */
    /* JADX WARN: Type inference failed for: r0v204, types: [X.5fq, X.5w8] */
    /* JADX WARN: Type inference failed for: r0v213, types: [X.5w7, X.5fq] */
    /* JADX WARN: Type inference failed for: r0v222, types: [X.5fp, X.5fq] */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.5fq, X.7h1] */
    /* JADX WARN: Type inference failed for: r0v75, types: [X.7h3, X.5fq] */
    /* JADX WARN: Type inference failed for: r0v90, types: [X.7h4, X.5fq] */
    /* JADX WARN: Type inference failed for: r0v99, types: [X.7Ze, X.5fq] */
    public C5fq A00() {
        if (this instanceof 5gC) {
            return new C5qu((5gC) this);
        }
        if (this instanceof 5gP) {
            return new C5w5((5gP) this);
        }
        if (this instanceof C5ft) {
            C5ft c5ft = (C5ft) this;
            ?? c5fq = new C5fq(c5ft);
            c5fq.A00 = c5ft.A01;
            return c5fq;
        }
        if (this instanceof C5v9) {
            C5v9 c5v9 = (C5v9) this;
            ?? c5fq2 = new C5fq(c5v9);
            c5fq2.A00 = c5v9.A00;
            return c5fq2;
        }
        if (this instanceof 5gR) {
            5gR r0 = (5gR) this;
            ?? c5fq3 = new C5fq(r0);
            c5fq3.A00 = r0.A00;
            return c5fq3;
        }
        if (this instanceof C5n8) {
            return new C5w6((C5n8) this);
        }
        if (this instanceof C5n6) {
            C5n6 c5n6 = (C5n6) this;
            C5fq c5fq4 = new C5fq(c5n6);
            ((5wB) c5fq4).A01 = c5n6.A01;
            ((5wB) c5fq4).A00 = c5n6.A00;
            ((5wB) c5fq4).A02 = c5n6.A02;
            return c5fq4;
        }
        if (this instanceof 5vM) {
            5vM r02 = (5vM) this;
            ?? c5fq5 = new C5fq(r02);
            c5fq5.A01 = C0ty.A00;
            c5fq5.A00 = -1;
            c5fq5.A03 = r02.A02;
            return c5fq5;
        }
        if (this instanceof 5wJ) {
            5wJ r03 = (5wJ) this;
            C5fq c5fq6 = new C5fq(r03);
            ((5wA) c5fq6).A00 = "";
            ((5wA) c5fq6).A00 = r03.A00;
            return c5fq6;
        }
        if (this instanceof C5uY) {
            return new C5vu((C5uY) this);
        }
        if (this instanceof C5n7) {
            C5n7 c5n7 = (C5n7) this;
            ?? c5fq7 = new C5fq(c5n7);
            c5fq7.A00 = c5n7.A00;
            return c5fq7;
        }
        if (this instanceof 5wE) {
            return new 5wC((5wE) this);
        }
        if (this instanceof C5v8) {
            C5v8 c5v8 = (C5v8) this;
            ?? c5fq8 = new C5fq(c5v8);
            c5fq8.A02 = 0S2.A00;
            c5fq8.A08 = c5v8.A08;
            c5fq8.A09 = c5v8.A09;
            c5fq8.A03 = c5v8.A03;
            c5fq8.A07 = c5v8.A07;
            c5fq8.A01 = c5v8.A01;
            c5fq8.A00 = c5v8.A00;
            c5fq8.A0A = c5v8.A0A;
            c5fq8.A04 = c5v8.A04;
            c5fq8.A02 = c5v8.A02;
            c5fq8.A05 = c5v8.A05;
            c5fq8.A06 = c5v8.A06;
            return c5fq8;
        }
        if (this instanceof 7Hd) {
            7Hd r04 = (7Hd) this;
            ?? c5fq9 = new C5fq(r04);
            c5fq9.A00 = r04.A00;
            return c5fq9;
        }
        if (this instanceof 5vL) {
            5vL r05 = (5vL) this;
            ?? c5fq10 = new C5fq(r05);
            c5fq10.A02 = r05.A02;
            c5fq10.A00 = r05.A00;
            c5fq10.A01 = r05.A01;
            return c5fq10;
        }
        if (this instanceof 7HJ) {
            return new C5fq(this);
        }
        if (!(this instanceof 5gQ)) {
            return this instanceof 5vK ? new C5fq(this) : new C5fq();
        }
        5gQ r06 = (5gQ) this;
        ?? c5fq11 = new C5fq(r06);
        c5fq11.A00 = r06.A00;
        return c5fq11;
    }

    public boolean A01(Object obj) {
        return this instanceof 5gC ? obj instanceof 5gC : this instanceof C5v9 ? obj instanceof C5v9 : this instanceof C5ft ? obj instanceof C5ft : this instanceof 5gP ? obj instanceof 5gP : this instanceof C5n8 ? obj instanceof C5n8 : this instanceof 5gR ? obj instanceof 5gR : this instanceof 5vM ? obj instanceof 5vM : this instanceof C5n6 ? obj instanceof C5n6 : this instanceof 5wJ ? obj instanceof 5wJ : this instanceof C5v8 ? obj instanceof C5v8 : this instanceof 5vK ? obj instanceof 5vK : this instanceof C5n7 ? obj instanceof C5n7 : this instanceof 7HJ ? obj instanceof 7HJ : this instanceof 7Hd ? obj instanceof 7Hd : this instanceof 5vL ? obj instanceof 5vL : this instanceof 5gQ ? obj instanceof 5gQ : this instanceof 7RO ? obj instanceof 7RO : obj instanceof C5fu;
    }

    @Override // X.C5fv
    public C5fv A6V(C5g3 c5g3, 5PP r303) {
        C00j.A05("AbstractMessage.addMetadata", -733258416);
        try {
            C5fq A00 = A00();
            A00.A02(c5g3, r303);
            C5fv A002 = A00.A00();
            C00j.A01(1096975393);
            return A002;
        } catch (Throwable th) {
            C00j.A01(771107642);
            throw th;
        }
    }

    @Override // X.C5fv
    public 5PP AxW(C5g3 c5g3) {
        11T.A0F(c5g3, 0);
        Object obj = this.A0E.get(c5g3);
        if (obj instanceof 5PP) {
            return (5PP) obj;
        }
        return null;
    }

    @Override // X.C5fv
    public C5fv D7d(C5fs c5fs) {
        C00j.A05("AbstractMessage.updateProcessingState", -76689652);
        try {
            C5fq A00 = A00();
            A00.A03 = c5fs;
            C5fv A002 = A00.A00();
            C00j.A01(2073572703);
            return A002;
        } catch (Throwable th) {
            C00j.A01(726201021);
            throw th;
        }
    }

    @Override // X.C5fv
    public C5fv D7v(C2o9 c2o9) {
        C00j.A05("AbstractMessage.updateSendState", 1474551540);
        try {
            C5fq A00 = A00();
            A00.A04 = c2o9;
            C5fv A002 = A00.A00();
            C00j.A01(1271097738);
            return A002;
        } catch (Throwable th) {
            C00j.A01(12607139);
            throw th;
        }
    }

    public boolean equals(Object obj) {
        C5fr c5fr;
        C5fr c5fr2;
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C5fu)) {
                return false;
            }
            C5fu c5fu = (C5fu) obj;
            if (c5fu.A01(this) && 11T.A0O(this.A09, c5fu.A09) && 11T.A0O(this.A0B, c5fu.A0B)) {
                C5fr c5fr3 = this.A05;
                String str = c5fr3.A06;
                C5fr c5fr4 = c5fu.A05;
                if (11T.A0O(str, c5fr4.A06) && this.A04 == c5fu.A04 && 11T.A0O(this.A0D, c5fu.A0D) && 11T.A0O(c5fr3.A07, c5fr4.A07) && this.A02 == c5fu.A02 && this.A01 == c5fu.A01 && 11T.A0O(this.A08, c5fu.A08) && 11T.A0O(this.A0E, c5fu.A0E) && this.A0F == c5fu.A0F && ((c5fr = this.A06) != null ? !((c5fr2 = c5fu.A06) == null || !11T.A0O(c5fr.A06, c5fr2.A06) || !11T.A0O(c5fr.A07, c5fr2.A07)) : c5fu.A06 == null) && this.A0H == c5fu.A0H && this.A00 == c5fu.A00 && this.A0I == c5fu.A0I && this.A0G == c5fu.A0G && 11T.A0O(this.A0A, c5fu.A0A) && 11T.A0O(this.A0C, c5fu.A0C) && 11T.A0O(this.A07, c5fu.A07)) {
                    return true;
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = this.A09.hashCode();
        String str = this.A0B;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        C5fr c5fr = this.A05;
        int hashCode2 = ((((hashCode * 31) + c5fr.A06.hashCode()) * 31) + c5fr.A07.hashCode()) * 31;
        long j = this.A02;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A01;
        int i2 = i + ((int) (j2 ^ (j2 >>> 32)));
        Long l = this.A08;
        if (l != null) {
            long longValue = l.longValue();
            i2 = (i2 * 31) + ((int) (longValue ^ (longValue >>> 32)));
        }
        int hashCode3 = ((((((i2 * 31) + this.A0E.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A0D.hashCode()) * 31;
        int i3 = 1237;
        if (this.A0F) {
            i3 = 1231;
        }
        int i4 = hashCode3 + i3;
        C5fr c5fr2 = this.A06;
        if (c5fr2 != null) {
            i4 = AnonymousClass002.A07(c5fr2.A06, i4 * 31) + c5fr2.A07.hashCode();
        }
        int i5 = i4 * 31;
        int i6 = 1237;
        if (this.A0H) {
            i6 = 1231;
        }
        int i7 = (((i5 + i6) * 31) + this.A00) * 31;
        int i8 = 1237;
        if (this.A0I) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0G) {
            i10 = 1231;
        }
        int i11 = i9 + i10;
        String str2 = this.A0A;
        if (str2 != null) {
            i11 = (i11 * 31) + str2.hashCode();
        }
        int hashCode4 = (i11 * 31) + this.A0C.hashCode();
        Long l2 = this.A07;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            hashCode4 = (hashCode4 * 31) + ((int) (longValue2 ^ (longValue2 >>> 32)));
        }
        return hashCode4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[AbstractMessage id=");
        sb.append(this.A09);
        sb.append(", timeSent=");
        sb.append(this.A02);
        sb.append(7zK.A00(16));
        sb.append(this.A03);
        sb.append(", hasAttachments=");
        sb.append(this.A0F);
        sb.append(']');
        return sb.toString();
    }
}
