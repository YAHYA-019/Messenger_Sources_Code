package androidx.compose.ui.draw;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQz;
import X.LDp;
import X.LOB;
import X.Lis;
import X.MEK;

/* loaded from: ShadowGraphicsLayerElement.class */
public final class ShadowGraphicsLayerElement extends LOB {
    public final float A00;
    public final long A01;
    public final long A02;
    public final MEK A03;

    public ShadowGraphicsLayerElement(MEK mek, float f, long j, long j2) {
        this.A00 = f;
        this.A03 = mek;
        this.A01 = j;
        this.A02 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ShadowGraphicsLayerElement)) {
                return false;
            }
            ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
            if (!AnonymousClass001.A1O(Float.compare(this.A00, shadowGraphicsLayerElement.A00)) || !11T.A0O(this.A03, shadowGraphicsLayerElement.A03)) {
                return false;
            }
            long j = this.A01;
            long j2 = shadowGraphicsLayerElement.A01;
            long j3 = LDp.A01;
            if (j != j2 || this.A02 != shadowGraphicsLayerElement.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = (AnonymousClass002.A05(this.A03, JQz.A04(this.A00)) + 1237) * 31;
        long j = this.A01;
        long j2 = LDp.A01;
        return AnonymousClass002.A03(this.A02, AnonymousClass002.A02(j, A05));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ShadowGraphicsLayerElement(elevation=");
        A0k.append((Object) Lis.A00(this.A00));
        A0k.append(", shape=");
        A0k.append(this.A03);
        4YV.A1Q(A0k, ", clip=");
        A0k.append(", ambientColor=");
        JQz.A12(this.A01, A0k);
        A0k.append(", spotColor=");
        return AnonymousClass002.A0K(LDp.A07(this.A02), A0k);
    }
}
