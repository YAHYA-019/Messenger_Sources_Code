package androidx.compose.ui.graphics;

import X.0Pz;
import X.11T;
import X.1BL;
import X.7zK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKG;
import X.JQz;
import X.JR2;
import X.L3m;
import X.LDp;
import X.LOB;
import X.MEK;

/* loaded from: GraphicsLayerElement.class */
public final class GraphicsLayerElement extends LOB {
    public final float A00;
    public final float A02;
    public final long A04;
    public final long A05;
    public final long A06;
    public final MEK A07;
    public final boolean A08;
    public final float A03 = 1.0f;
    public final float A01 = 8.0f;

    public GraphicsLayerElement(MEK mek, float f, float f2, long j, long j2, long j3, boolean z) {
        this.A02 = f;
        this.A00 = f2;
        this.A06 = j;
        this.A07 = mek;
        this.A08 = z;
        this.A04 = j2;
        this.A05 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GraphicsLayerElement)) {
                return false;
            }
            GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
            if (Float.compare(this.A02, graphicsLayerElement.A02) != 0 || Float.compare(this.A03, graphicsLayerElement.A03) != 0 || Float.compare(this.A00, graphicsLayerElement.A00) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.A01, graphicsLayerElement.A01) != 0) {
                return false;
            }
            long j = this.A06;
            long j2 = graphicsLayerElement.A06;
            long j3 = L3m.A01;
            if (j != j2 || !11T.A0O(this.A07, graphicsLayerElement.A07) || this.A08 != graphicsLayerElement.A08) {
                return false;
            }
            long j4 = this.A04;
            long j5 = graphicsLayerElement.A04;
            long j6 = LDp.A01;
            if (j4 != j5 || this.A05 != graphicsLayerElement.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A00 = 1BL.A00(1BL.A00(JQz.A04(this.A02), this.A03), this.A00);
        int floatToIntBits = Float.floatToIntBits(0.0f);
        int A002 = 1BL.A00((((((((((((A00 + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31) + floatToIntBits) * 31, this.A01);
        long j = this.A06;
        long j2 = L3m.A01;
        int A05 = (AnonymousClass002.A05(this.A07, AnonymousClass002.A02(j, A002)) + AnonymousClass002.A00(this.A08 ? 1 : 0)) * 31 * 31;
        long j3 = this.A04;
        long j4 = LDp.A01;
        return AnonymousClass002.A02(this.A05, AnonymousClass002.A02(j3, A05));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GraphicsLayerElement(scaleX=");
        A0k.append(this.A02);
        A0k.append(", scaleY=");
        A0k.append(this.A03);
        A0k.append(", alpha=");
        JR2.A0l(A0k, this.A00);
        A0k.append(this.A01);
        A0k.append(", transformOrigin=");
        long j = this.A06;
        long j2 = L3m.A01;
        A0k.append((Object) 0Pz.A0Q("TransformOrigin(packedValue=", ')', j));
        A0k.append(", shape=");
        A0k.append(this.A07);
        A0k.append(", clip=");
        A0k.append(this.A08);
        DKG.A1X(A0k, ", renderEffect=");
        A0k.append(7zK.A00(49));
        JQz.A12(this.A04, A0k);
        A0k.append(", spotShadowColor=");
        JQz.A12(this.A05, A0k);
        A0k.append(", compositingStrategy=");
        A0k.append((Object) 0Pz.A0O("CompositingStrategy(value=", ')', 0));
        return AnonymousClass001.A0g(A0k, ')');
    }
}
