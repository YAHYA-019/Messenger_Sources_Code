package X;

import com.facebook.graphql.enums.GraphQLXFBCoplayDifficulty;
import java.util.List;

/* loaded from: Fju.class */
public final class Fju implements JDB {
    public final int A00;
    public final int A01;
    public final GraphQLXFBCoplayDifficulty A02;
    public final C1706Aqc A03;
    public final ELM A04;
    public final EMv A05;
    public final Integer A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public Fju(Eqn eqn) {
        this.A03 = eqn.A03;
        this.A04 = eqn.A04;
        this.A02 = eqn.A02;
        this.A07 = eqn.A07;
        this.A08 = eqn.A08;
        this.A09 = eqn.A09;
        this.A0A = eqn.A0A;
        this.A0B = eqn.A0B;
        this.A00 = eqn.A00;
        this.A01 = eqn.A01;
        this.A06 = eqn.A06;
        this.A05 = eqn.A05;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fju)) {
                return false;
            }
            Fju fju = (Fju) obj;
            if (!11T.A0O(this.A03, fju.A03) || this.A04 != fju.A04 || this.A02 != fju.A02 || !11T.A0O(this.A07, fju.A07) || !11T.A0O(this.A08, fju.A08) || this.A09 != fju.A09 || this.A0A != fju.A0A || this.A0B != fju.A0B || this.A00 != fju.A00 || this.A01 != fju.A01 || !11T.A0O(this.A06, fju.A06) || this.A05 != fju.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A03);
        int A032 = (A03 * 31) + C3o5.A03(this.A04);
        int A04 = C1pq.A04(this.A06, (((C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A08, C1pq.A04(this.A07, (A032 * 31) + C3o5.A03(this.A02))), this.A09), this.A0A), this.A0B) * 31) + this.A00) * 31) + this.A01);
        return (A04 * 31) + DKF.A04(this.A05);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CoplayDrawerPluginViewState{appInfo=");
        A0k.append(this.A03);
        A0k.append(", ctaButtonState=");
        A0k.append(this.A04);
        A0k.append(", difficulty=");
        A0k.append(this.A02);
        A0k.append(", genre=");
        A0k.append(this.A07);
        A0k.append(", ineligibleParticipants=");
        A0k.append(this.A08);
        A0k.append(", isDmaGamingConsentUndecided=");
        A0k.append(this.A09);
        A0k.append(", isDmaGamingNotConsented=");
        A0k.append(this.A0A);
        A0k.append(", isLoading=");
        A0k.append(this.A0B);
        A0k.append(", maxPlayerCount=");
        A0k.append(this.A00);
        A0k.append(", minPlayerCount=");
        A0k.append(this.A01);
        A0k.append(", minRoundLength=");
        A0k.append(this.A06);
        A0k.append(", screenType=");
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }
}
