package X;

import android.graphics.Rect;

/* renamed from: X.257, reason: invalid class name */
/* loaded from: 257.class */
public final class AnonymousClass257 {
    public int A00;
    public int A01;
    public long A02;
    public 23S A03;
    public 25R A04;
    public 25F A05;
    public 25F A06;
    public 25F A07;
    public 25F A08;
    public 25F A09;
    public 25P A0A;
    public Object A0B;
    public boolean A0C;
    public boolean A0D;
    public final float A0H;
    public final float A0I;
    public final Rect A0J;
    public final AnonymousClass250 A0K;
    public boolean A0E = false;
    public boolean A0G = false;
    public boolean A0F = false;

    public AnonymousClass257(Rect rect, 23S r303, 25R r304, 25F r305, 25F r306, 25F r307, 25F r308, 25F r309, 25P r310, AnonymousClass250 anonymousClass250, Object obj, float f, float f2, int i, int i2, long j, boolean z, boolean z2) {
        this.A0K = anonymousClass250;
        this.A0I = f;
        this.A0H = f2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A0D = z;
        this.A0B = obj;
        this.A0C = z2;
        this.A07 = r305;
        this.A09 = r306;
        this.A05 = r307;
        this.A08 = r308;
        this.A06 = r309;
        this.A03 = r303;
        this.A0A = r310;
        this.A04 = r304;
        this.A0J = rect;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass257)) {
                return false;
            }
            AnonymousClass257 anonymousClass257 = (AnonymousClass257) obj;
            if (!11T.A0O(this.A0K, anonymousClass257.A0K) || Float.compare(this.A0I, anonymousClass257.A0I) != 0 || Float.compare(this.A0H, anonymousClass257.A0H) != 0 || this.A01 != anonymousClass257.A01 || this.A00 != anonymousClass257.A00 || this.A02 != anonymousClass257.A02 || this.A0D != anonymousClass257.A0D || this.A0E != anonymousClass257.A0E || !11T.A0O(this.A0B, anonymousClass257.A0B) || this.A0G != anonymousClass257.A0G || this.A0C != anonymousClass257.A0C || this.A0F != anonymousClass257.A0F || !11T.A0O(this.A07, anonymousClass257.A07) || !11T.A0O(this.A09, anonymousClass257.A09) || !11T.A0O(this.A05, anonymousClass257.A05) || !11T.A0O(this.A08, anonymousClass257.A08) || !11T.A0O(this.A06, anonymousClass257.A06) || !11T.A0O(this.A03, anonymousClass257.A03) || !11T.A0O(this.A0A, anonymousClass257.A0A) || !11T.A0O(this.A04, anonymousClass257.A04) || !11T.A0O(this.A0J, anonymousClass257.A0J)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = (((((((((((((((((((((((((AnonymousClass002.A02(this.A02, (((1BL.A00(1BL.A00(1BL.A03(this.A0K), this.A0I), this.A0H) + this.A01) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0E ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A0B)) * 31) + AnonymousClass002.A00(this.A0G ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0C ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0F ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A07)) * 31) + AnonymousClass001.A02(this.A09)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A08)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A0A)) * 31;
        25R r0 = this.A04;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return 1BK.A03(this.A0J, (A02 + i) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("YogaLayoutOutput(yogaNode=");
        A0k.append(this.A0K);
        A0k.append(", widthFromStyle=");
        A0k.append(this.A0I);
        A0k.append(", heightFromStyle=");
        A0k.append(this.A0H);
        A0k.append(", _widthSpec=");
        A0k.append(this.A01);
        A0k.append(", _heightSpec=");
        A0k.append(this.A00);
        A0k.append(", _lastMeasuredSize=");
        A0k.append(this.A02);
        A0k.append(", _isCachedLayout=");
        A0k.append(this.A0D);
        A0k.append(", _isDiffedLayout=");
        A0k.append(this.A0E);
        A0k.append(", _layoutData=");
        A0k.append(this.A0B);
        A0k.append(", _wasMeasured=");
        A0k.append(this.A0G);
        A0k.append(", _cachedMeasuresValid=");
        A0k.append(this.A0C);
        A0k.append(", _measureHadExceptions=");
        A0k.append(this.A0F);
        A0k.append(", _contentRenderUnit=");
        A0k.append(this.A07);
        A0k.append(", _hostRenderUnit=");
        A0k.append(this.A09);
        A0k.append(", _backgroundRenderUnit=");
        A0k.append(this.A05);
        A0k.append(", _foregroundRenderUnit=");
        A0k.append(this.A08);
        A0k.append(", _borderRenderUnit=");
        A0k.append(this.A06);
        A0k.append(", _diffNode=");
        A0k.append(this.A03);
        A0k.append(", _delegate=");
        A0k.append(this.A0A);
        A0k.append(", _nestedResult=");
        A0k.append(this.A04);
        A0k.append(", _adjustedBounds=");
        return AnonymousClass002.A0K(this.A0J, A0k);
    }
}
