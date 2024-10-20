package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.At6 */
/* loaded from: At6.class */
public final class C1797At6 extends C04v implements DJ2, DIU, DHK {
    public final int A00;
    public final 2JX A01;
    public final DJ2 A02;
    public final DHK A03;
    public final DIU A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final String A0E;

    public C1797At6() {
        this(null, null, null, null, null, null, null, null, 0, 32767, false, false, false, false, false, false, false);
    }

    public C1797At6(2JX r302, DJ2 dj2, DHK dhk, DIU diu, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A07 = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A0E = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A0B = z4;
        this.A01 = r302;
        this.A0C = z5;
        this.A0A = z6;
        this.A0D = z7;
        this.A00 = i;
        this.A04 = diu;
        this.A02 = dj2;
        this.A03 = dhk;
    }

    public /* synthetic */ C1797At6(2JX r302, DJ2 dj2, DHK dhk, DIU diu, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this(null, new C1796At5(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 04R.A0G(), 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false), new C1798At7(false, null), new C2637Gjr(null, new 8Lr(7, (Object) null, false), false, true), null, null, null, 0, false, false, false, false, false, false, true);
    }

    public static /* synthetic */ C1797At6 A00(2JX r301, C1797At6 c1797At6, DJ2 dj2, DIU diu, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        DJ2 dj22 = dj2;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        boolean z11 = z4;
        2JX r325 = r301;
        boolean z12 = z5;
        boolean z13 = z6;
        boolean z14 = z7;
        int i3 = i;
        DIU diu2 = diu;
        DHK dhk = null;
        if ((i2 & 1) != 0) {
            z8 = c1797At6.A07;
        }
        if ((i2 & 2) != 0) {
            z9 = c1797At6.A09;
        }
        if ((i2 & 4) != 0) {
            z10 = c1797At6.A08;
        }
        if ((i2 & 8) != 0) {
            str4 = c1797At6.A0E;
        }
        if ((i2 & 16) != 0) {
            str5 = c1797At6.A06;
        }
        if ((i2 & 32) != 0) {
            str6 = c1797At6.A05;
        }
        if ((i2 & 64) != 0) {
            z11 = c1797At6.A0B;
        }
        if ((i2 & 128) != 0) {
            r325 = c1797At6.A01;
        }
        if ((i2 & 256) != 0) {
            z12 = c1797At6.A0C;
        }
        if ((i2 & 512) != 0) {
            z13 = c1797At6.A0A;
        }
        if ((i2 & 1024) != 0) {
            z14 = c1797At6.A0D;
        }
        if ((i2 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            i3 = c1797At6.A00;
        }
        if ((i2 & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
            diu2 = c1797At6.A04;
        }
        if ((i2 & 8192) != 0) {
            dj22 = c1797At6.A02;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            dhk = c1797At6.A03;
        }
        7zR.A1R(diu2, dj22);
        11T.A0F(dhk, 14);
        return new C1797At6(r325, dj22, dhk, diu2, str4, str5, str6, i3, z8, z9, z10, z11, z12, z13, z14);
    }

    @Override // X.DJ2
    public int AVV() {
        return this.A02.AVV();
    }

    @Override // X.DJ2
    public ImmutableList AVW() {
        return this.A02.AVW();
    }

    public 8Lr AYN() {
        return this.A04.AYN();
    }

    public H9F AbB() {
        return this.A04.AbB();
    }

    @Override // X.DJ2
    public boolean AbR() {
        return this.A02.AbR();
    }

    public boolean AbU() {
        return this.A03.AbU();
    }

    @Override // X.DJ2
    public UserKey Aeu() {
        return this.A02.Aeu();
    }

    @Override // X.DJ2
    public String Aev() {
        return this.A02.Aev();
    }

    @Override // X.DJ2
    public String Ag5() {
        return this.A02.Ag5();
    }

    @Override // X.DJ2
    public int Atg() {
        return this.A02.Atg();
    }

    @Override // X.DJ2
    public ImmutableList Atu() {
        return this.A02.Atu();
    }

    @Override // X.DJ2
    public 2JX AuJ() {
        return this.A01;
    }

    @Override // X.DJ2
    public String AuP() {
        return this.A02.AuP();
    }

    @Override // X.DJ2
    public String AuQ() {
        return this.A06;
    }

    @Override // X.DJ2
    public 2JX AwT() {
        return this.A02.AwT();
    }

    @Override // X.DJ2
    public java.util.Map B1W() {
        return this.A02.B1W();
    }

    @Override // X.DJ2
    public ImmutableList B88() {
        return this.A02.B88();
    }

    public String B8C() {
        return this.A03.B8C();
    }

    @Override // X.DJ2
    public 2JX B9w() {
        return this.A02.B9w();
    }

    @Override // X.DJ2
    public boolean BAj() {
        return this.A02.BAj();
    }

    @Override // X.DJ2
    public boolean BAu() {
        return this.A02.BAu();
    }

    public boolean BAz() {
        return this.A04.BAz();
    }

    @Override // X.DJ2
    public int BKH() {
        return this.A00;
    }

    @Override // X.DJ2
    public 2JX BKt() {
        return this.A02.BKt();
    }

    @Override // X.DJ2
    public boolean BQa() {
        return this.A02.BQa();
    }

    @Override // X.DJ2
    public boolean BQn() {
        return this.A02.BQn();
    }

    @Override // X.DJ2
    public boolean BR5() {
        return this.A02.BR5();
    }

    @Override // X.DJ2
    public boolean BRO() {
        return this.A02.BRO();
    }

    @Override // X.DJ2
    public boolean BRP() {
        return this.A02.BRP();
    }

    @Override // X.DJ2
    public boolean BRn() {
        return this.A02.BRn();
    }

    @Override // X.DJ2
    public boolean BTi() {
        return this.A0B;
    }

    public boolean BTq() {
        return this.A04.BTq();
    }

    @Override // X.DJ2
    public boolean BW8() {
        return this.A0C;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1797At6)) {
                return false;
            }
            C1797At6 c1797At6 = (C1797At6) obj;
            if (this.A07 != c1797At6.A07 || this.A09 != c1797At6.A09 || this.A08 != c1797At6.A08 || !11T.A0O(this.A0E, c1797At6.A0E) || !11T.A0O(this.A06, c1797At6.A06) || !11T.A0O(this.A05, c1797At6.A05) || this.A0B != c1797At6.A0B || !11T.A0O(this.A01, c1797At6.A01) || this.A0C != c1797At6.A0C || this.A0A != c1797At6.A0A || this.A0D != c1797At6.A0D || this.A00 != c1797At6.A00 || !11T.A0O(this.A04, c1797At6.A04) || !11T.A0O(this.A02, c1797At6.A02) || !11T.A0O(this.A03, c1797At6.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A03, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A04, ((((((((((((((((((((((AnonymousClass002.A00(this.A07 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A08 ? 1 : 0)) * 31) + 1BL.A05(this.A0E)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A05)) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + 4YU.A03(this.A01)) * 31) + AnonymousClass002.A00(this.A0C ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + this.A00) * 31)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("JoinerDataViewModel(isConnectingAfterRing=");
        A0k.append(this.A07);
        A0k.append(", isFirstJoinerRinging=");
        A0k.append(this.A09);
        A0k.append(", isFirstActiveJoinerPhase=");
        A0k.append(this.A08);
        A0k.append(", firstActiveJoinerId=");
        A0k.append(this.A0E);
        A0k.append(", lobbyTitle=");
        A0k.append(this.A06);
        A0k.append(", lobbySubtitle=");
        A0k.append(this.A05);
        A0k.append(", isLive=");
        A0k.append(this.A0B);
        A0k.append(", liveVideoLobby=");
        A0k.append(this.A01);
        A0k.append(", isPendingJoinApproval=");
        A0k.append(this.A0C);
        A0k.append(1BJ.A00(606));
        A0k.append(this.A0A);
        A0k.append(", shouldShowParticipants=");
        A0k.append(this.A0D);
        A0k.append(", viewerCount=");
        A0k.append(this.A00);
        A0k.append(", videoSettingsData=");
        A0k.append(this.A04);
        A0k.append(", sharedData=");
        A0k.append(this.A02);
        A0k.append(", shareLinkData=");
        return AnonymousClass002.A0K(this.A03, A0k);
    }
}
