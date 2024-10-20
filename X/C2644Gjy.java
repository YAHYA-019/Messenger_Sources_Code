package X;

import android.graphics.Rect;

/* renamed from: X.Gjy, reason: case insensitive filesystem */
/* loaded from: Gjy.class */
public final class C2644Gjy extends C04v implements JDB {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Rect A04;
    public final JOL A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final int A0J;

    public C2644Gjy() {
        this(DKC.A0C(), null, 0.0f, 0.0f, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public C2644Gjy(Rect rect, JOL jol, float f, float f2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        11T.A0F(rect, 5);
        this.A03 = i;
        this.A02 = i2;
        this.A0C = z;
        this.A05 = jol;
        this.A04 = rect;
        this.A08 = z2;
        this.A07 = z3;
        this.A0A = z4;
        this.A00 = f;
        this.A09 = z5;
        this.A01 = f2;
        this.A0E = z6;
        this.A0B = z7;
        this.A0J = i3;
        this.A06 = z8;
        this.A0H = z9;
        this.A0G = z10;
        this.A0I = z11;
        this.A0F = z12;
        this.A0D = z13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2644Gjy)) {
                return false;
            }
            C2644Gjy c2644Gjy = (C2644Gjy) obj;
            if (this.A03 != c2644Gjy.A03 || this.A02 != c2644Gjy.A02 || this.A0C != c2644Gjy.A0C || !11T.A0O(this.A05, c2644Gjy.A05) || !11T.A0O(this.A04, c2644Gjy.A04) || this.A08 != c2644Gjy.A08 || this.A07 != c2644Gjy.A07 || this.A0A != c2644Gjy.A0A || Float.compare(this.A00, c2644Gjy.A00) != 0 || this.A09 != c2644Gjy.A09 || Float.compare(this.A01, c2644Gjy.A01) != 0 || this.A0E != c2644Gjy.A0E || this.A0B != c2644Gjy.A0B || this.A0J != c2644Gjy.A0J || this.A06 != c2644Gjy.A06 || this.A0H != c2644Gjy.A0H || this.A0G != c2644Gjy.A0G || this.A0I != c2644Gjy.A0I || this.A0F != c2644Gjy.A0F || this.A0D != c2644Gjy.A0D) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((1BL.A00((1BL.A00((((((AnonymousClass002.A05(this.A04, ((((((this.A03 * 31) + this.A02) * 31) + AnonymousClass002.A00(this.A0C ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass002.A00(this.A08 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A07 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31, this.A00) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31, this.A01) + AnonymousClass002.A00(this.A0E ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + this.A0J) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0H ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0G ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0I ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0F ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ActiveDrawerContainerViewState(visibilityState=");
        A0k.append(this.A03);
        A0k.append(", requestedDrawerState=");
        A0k.append(this.A02);
        A0k.append(", isSecondRowShownInCollapsedDrawer=");
        A0k.append(this.A0C);
        A0k.append(", requestedPlugin=");
        A0k.append(this.A05);
        A0k.append(", windowInsets=");
        A0k.append(this.A04);
        A0k.append(", isParticipantOverflowPillVisible=");
        A0k.append(this.A08);
        A0k.append(", isParticipantOverflowPillForScrollableGridVisible=");
        A0k.append(this.A07);
        A0k.append(", isPromotionAvailable=");
        A0k.append(this.A0A);
        A0k.append(", participantOverflowPillAlpha=");
        A0k.append(this.A00);
        A0k.append(", isPendingApprovalsIndicatorVisible=");
        A0k.append(this.A09);
        A0k.append(", pendingApprovalsIndicatorAlpha=");
        A0k.append(this.A01);
        A0k.append(", isTabletSize=");
        A0k.append(this.A0E);
        A0k.append(", isPromotionViewEnabled=");
        A0k.append(this.A0B);
        A0k.append(", aboveDrawerPluginKey=");
        A0k.append(this.A0J);
        A0k.append(", isE2eeDisclaimerShown=");
        A0k.append(this.A06);
        A0k.append(", shouldPullUpRosterDrawerSheet=");
        A0k.append(this.A0H);
        A0k.append(", shouldPullUpHaloDrawerSheet=");
        A0k.append(this.A0G);
        A0k.append(", wasStartedWithVideo=");
        A0k.append(this.A0I);
        A0k.append(", isVideoCall=");
        A0k.append(this.A0F);
        A0k.append(", isSpeakerPhone=");
        return DKH.A0q(A0k, this.A0D);
    }
}
