package X;

import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* renamed from: X.At5, reason: case insensitive filesystem */
/* loaded from: At5.class */
public final class C1796At5 extends C04v implements DJ2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final 2JX A03;
    public final 2JX A04;
    public final 2JX A05;
    public final 2JX A06;
    public final UserKey A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final java.util.Map A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;

    public C1796At5() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 04R.A0G(), 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public C1796At5(2JX r302, 2JX r303, 2JX r304, 2JX r305, UserKey userKey, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, java.util.Map map, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.A0K = z;
        this.A0R = z2;
        this.A0T = z3;
        this.A0W = z4;
        this.A01 = i;
        this.A0D = str;
        this.A07 = userKey;
        this.A0B = str2;
        this.A08 = immutableList;
        this.A0J = map;
        this.A00 = i2;
        this.A0C = str3;
        this.A0F = str4;
        this.A0E = str5;
        this.A0S = z5;
        this.A02 = i3;
        this.A03 = r302;
        this.A0U = z6;
        this.A04 = r303;
        this.A0L = z7;
        this.A0Q = z8;
        this.A06 = r304;
        this.A05 = r305;
        this.A0O = z9;
        this.A0P = z10;
        this.A09 = immutableList2;
        this.A0A = immutableList3;
        this.A0N = z11;
        this.A0M = z12;
        this.A0V = z13;
        this.A0I = str6;
        this.A0G = str7;
        this.A0H = str8;
    }

    @Override // X.DJ2
    public int AVV() {
        return this.A00;
    }

    @Override // X.DJ2
    public ImmutableList AVW() {
        return this.A08;
    }

    @Override // X.DJ2
    public boolean AbR() {
        return this.A0K;
    }

    @Override // X.DJ2
    public UserKey Aeu() {
        return this.A07;
    }

    @Override // X.DJ2
    public String Aev() {
        return this.A0B;
    }

    @Override // X.DJ2
    public String Ag5() {
        return this.A0C;
    }

    @Override // X.DJ2
    public int Atg() {
        return this.A01;
    }

    @Override // X.DJ2
    public ImmutableList Atu() {
        return this.A09;
    }

    @Override // X.DJ2
    public 2JX AuJ() {
        return this.A03;
    }

    @Override // X.DJ2
    public String AuP() {
        return this.A0D;
    }

    @Override // X.DJ2
    public String AuQ() {
        return this.A0F;
    }

    @Override // X.DJ2
    public 2JX AwT() {
        return this.A04;
    }

    @Override // X.DJ2
    public java.util.Map B1W() {
        return this.A0J;
    }

    @Override // X.DJ2
    public ImmutableList B88() {
        return this.A0A;
    }

    @Override // X.DJ2
    public 2JX B9w() {
        return this.A05;
    }

    @Override // X.DJ2
    public boolean BAj() {
        return this.A0V;
    }

    @Override // X.DJ2
    public boolean BAu() {
        return this.A0W;
    }

    @Override // X.DJ2
    public int BKH() {
        return this.A02;
    }

    @Override // X.DJ2
    public 2JX BKt() {
        return this.A06;
    }

    @Override // X.DJ2
    public boolean BQa() {
        return this.A0L;
    }

    @Override // X.DJ2
    public boolean BQn() {
        return this.A0M;
    }

    @Override // X.DJ2
    public boolean BR5() {
        return this.A0N;
    }

    @Override // X.DJ2
    public boolean BRO() {
        return this.A0O;
    }

    @Override // X.DJ2
    public boolean BRP() {
        return this.A0P;
    }

    @Override // X.DJ2
    public boolean BRn() {
        return this.A0Q;
    }

    @Override // X.DJ2
    public boolean BTi() {
        return this.A0S;
    }

    @Override // X.DJ2
    public boolean BW8() {
        return this.A0U;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1796At5)) {
                return false;
            }
            C1796At5 c1796At5 = (C1796At5) obj;
            if (this.A0K != c1796At5.A0K || this.A0R != c1796At5.A0R || this.A0T != c1796At5.A0T || this.A0W != c1796At5.A0W || this.A01 != c1796At5.A01 || !11T.A0O(this.A0D, c1796At5.A0D) || !11T.A0O(this.A07, c1796At5.A07) || !11T.A0O(this.A0B, c1796At5.A0B) || !11T.A0O(this.A08, c1796At5.A08) || !11T.A0O(this.A0J, c1796At5.A0J) || this.A00 != c1796At5.A00 || !11T.A0O(this.A0C, c1796At5.A0C) || !11T.A0O(this.A0F, c1796At5.A0F) || !11T.A0O(this.A0E, c1796At5.A0E) || this.A0S != c1796At5.A0S || this.A02 != c1796At5.A02 || !11T.A0O(this.A03, c1796At5.A03) || this.A0U != c1796At5.A0U || !11T.A0O(this.A04, c1796At5.A04) || this.A0L != c1796At5.A0L || this.A0Q != c1796At5.A0Q || !11T.A0O(this.A06, c1796At5.A06) || !11T.A0O(this.A05, c1796At5.A05) || this.A0O != c1796At5.A0O || this.A0P != c1796At5.A0P || !11T.A0O(this.A09, c1796At5.A09) || !11T.A0O(this.A0A, c1796At5.A0A) || this.A0N != c1796At5.A0N || this.A0M != c1796At5.A0M || this.A0V != c1796At5.A0V || !11T.A0O(this.A0I, c1796At5.A0I) || !11T.A0O(this.A0G, c1796At5.A0G) || !11T.A0O(this.A0H, c1796At5.A0H)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass002.A00(this.A0K ? 1 : 0) * 31) + AnonymousClass002.A00(this.A0R ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0T ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0W ? 1 : 0)) * 31) + this.A01) * 31) + 1BL.A05(this.A0D)) * 31) + AnonymousClass001.A02(this.A07)) * 31) + 1BL.A05(this.A0B)) * 31) + AnonymousClass001.A02(this.A08)) * 31) + AnonymousClass001.A02(this.A0J)) * 31) + this.A00) * 31) + 1BL.A05(this.A0C)) * 31) + 1BL.A05(this.A0F)) * 31) + 1BL.A05(this.A0E)) * 31) + AnonymousClass002.A00(this.A0S ? 1 : 0)) * 31) + this.A02) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass002.A00(this.A0U ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass002.A00(this.A0L ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0Q ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass002.A00(this.A0O ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0P ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A09)) * 31) + AnonymousClass001.A02(this.A0A)) * 31) + AnonymousClass002.A00(this.A0N ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0M ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0V ? 1 : 0)) * 31) + 1BL.A05(this.A0I)) * 31) + 1BL.A05(this.A0G)) * 31) + 7zN.A05(this.A0H);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LobbySharedDataViewModelImpl(canJoin=");
        A0k.append(this.A0K);
        A0k.append(", isLinkLocked=");
        A0k.append(this.A0R);
        A0k.append(", isMicrophoneMuted=");
        A0k.append(this.A0T);
        A0k.append(", shouldShowLegalDisclaimerText=");
        A0k.append(this.A0W);
        A0k.append(", legalDisclaimerText=");
        A0k.append(this.A01);
        A0k.append(", lobbyEmoji=");
        A0k.append(this.A0D);
        A0k.append(", creatorKey=");
        A0k.append(this.A07);
        A0k.append(", creatorName=");
        A0k.append(this.A0B);
        A0k.append(", activeParticipants=");
        A0k.append(this.A08);
        A0k.append(", participantStates=");
        A0k.append(this.A0J);
        A0k.append(", activeParticipantCount=");
        A0k.append(this.A00);
        A0k.append(", currentUserName=");
        A0k.append(this.A0C);
        A0k.append(", lobbyTitle=");
        A0k.append(this.A0F);
        A0k.append(", lobbySubtitle=");
        A0k.append(this.A0E);
        A0k.append(", isLive=");
        A0k.append(this.A0S);
        A0k.append(", viewerCount=");
        A0k.append(this.A02);
        A0k.append(", liveVideoLobby=");
        A0k.append(this.A03);
        A0k.append(", isShowingRingingUi=");
        A0k.append(this.A0U);
        A0k.append(", meeting=");
        A0k.append(this.A04);
        A0k.append(", isAnonymousJoinsAllowed=");
        A0k.append(this.A0L);
        A0k.append(", isE2eeEncrypted=");
        A0k.append(this.A0Q);
        A0k.append(1BJ.A00(617));
        A0k.append(this.A06);
        A0k.append(1BJ.A00(613));
        A0k.append(this.A05);
        A0k.append(", isCreatorForeignUser=");
        A0k.append(this.A0O);
        A0k.append(", isCreatorLimitedUser=");
        A0k.append(this.A0P);
        A0k.append(", linkRingableParticipants=");
        A0k.append(this.A09);
        A0k.append(1BJ.A00(612));
        A0k.append(this.A0A);
        A0k.append(", isCallConnected=");
        A0k.append(this.A0N);
        A0k.append(1BJ.A00(605));
        A0k.append(this.A0M);
        A0k.append(1BJ.A00(614));
        A0k.append(this.A0V);
        A0k.append(1BJ.A00(610));
        A0k.append(this.A0I);
        A0k.append(1BJ.A00(608));
        A0k.append(this.A0G);
        A0k.append(1BJ.A00(609));
        A0k.append(this.A0H);
        return 4YV.A0x(A0k);
    }
}
