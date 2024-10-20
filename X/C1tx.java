package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1tx, reason: invalid class name */
/* loaded from: 1tx.class */
public final class C1tx implements C1ty {
    public final int A00;
    public final 1LI A01;
    public final 1Iw A02;
    public final C1sr A03;
    public final 1tF A04;
    public final 1tH A05;
    public final C1tz A06;
    public final C1s8 A07;
    public final List A08;
    public final AtomicReference A09;
    public final boolean A0A;

    public C1tx(1LI r302, 1Iw r303, C1sr c1sr, 1tF r305, 1tH r306, C1tz c1tz, C1s8 c1s8, List list, int i, boolean z) {
        11T.A0F(r305, 4);
        this.A03 = c1sr;
        this.A02 = r303;
        this.A01 = r302;
        this.A04 = r305;
        this.A07 = c1s8;
        this.A0A = z;
        this.A00 = i;
        this.A08 = list;
        this.A06 = c1tz;
        this.A05 = r306;
        this.A09 = new AtomicReference(r305);
    }

    @Override // X.C1ty
    public boolean BUi() {
        return this.A0A;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1tx)) {
                return false;
            }
            C1tx c1tx = (C1tx) obj;
            if (!11T.A0O(this.A03, c1tx.A03) || !11T.A0O(this.A02, c1tx.A02) || !11T.A0O(this.A01, c1tx.A01) || !11T.A0O(this.A04, c1tx.A04) || !11T.A0O(this.A07, c1tx.A07) || this.A0A != c1tx.A0A || this.A00 != c1tx.A00 || !11T.A0O(this.A08, c1tx.A08) || !11T.A0O(this.A06, c1tx.A06) || !11T.A0O(this.A05, c1tx.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A05 = (((((((AnonymousClass002.A05(this.A07, AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A02, AnonymousClass001.A02(this.A03) * 31)))) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + this.A00) * 31) + AnonymousClass001.A02(this.A08)) * 31) + AnonymousClass001.A02(this.A06)) * 31;
        1tH r0 = this.A05;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return A05 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ResolveResult(node=");
        A0k.append(this.A03);
        A0k.append(", context=");
        A0k.append(this.A02);
        A0k.append(", component=");
        A0k.append(this.A01);
        A0k.append(", cache=");
        A0k.append(this.A04);
        A0k.append(", treeState=");
        A0k.append(this.A07);
        A0k.append(", isPartialResult=");
        A0k.append(this.A0A);
        A0k.append(", version=");
        A0k.append(this.A00);
        A0k.append(", eventHandlers=");
        A0k.append(this.A08);
        A0k.append(", outputs=");
        A0k.append(this.A06);
        A0k.append(", contextForResuming=");
        return AnonymousClass002.A0K(this.A05, A0k);
    }
}
