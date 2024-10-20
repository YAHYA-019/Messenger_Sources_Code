package X;

import com.facebook.graphql.enums.GraphQLXFBGenAIVoiceCategory;

/* loaded from: DqE.class */
public final class DqE extends C04v {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public DqE(GraphQLXFBGenAIVoiceCategory graphQLXFBGenAIVoiceCategory, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = graphQLXFBGenAIVoiceCategory;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A02 = str6;
    }

    public DqE(String str, String str2, String str3, String str4, String str5, String str6, java.util.Map map) {
        7zP.A1L(str, 1, str5);
        11T.A0F(str6, 7);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A07 = str4;
        this.A01 = map;
        this.A06 = str5;
        this.A05 = str6;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DqE)) {
                return false;
            }
            DqE dqE = (DqE) obj;
            if (dqE.A00 != 1 || !11T.A0O(this.A02, dqE.A02) || !11T.A0O(this.A03, dqE.A03) || !11T.A0O(this.A04, dqE.A04) || !11T.A0O(this.A07, dqE.A07) || !11T.A0O(this.A01, dqE.A01) || !11T.A0O(this.A06, dqE.A06)) {
                return false;
            }
            str = this.A05;
            str2 = dqE.A05;
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DqE)) {
                return false;
            }
            DqE dqE2 = (DqE) obj;
            if (dqE2.A00 != 0 || this.A01 != dqE2.A01 || !11T.A0O(this.A03, dqE2.A03) || !11T.A0O(this.A04, dqE2.A04) || !11T.A0O(this.A05, dqE2.A05) || !11T.A0O(this.A06, dqE2.A06) || !11T.A0O(this.A07, dqE2.A07)) {
                return false;
            }
            str = this.A02;
            str2 = dqE2.A02;
        }
        return 11T.A0O(str, str2);
    }

    public int hashCode() {
        if (this.A00 == 0) {
            return (((((((((((AnonymousClass001.A02(this.A01) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A07)) * 31) + 7zN.A05(this.A02);
        }
        return 7zM.A05(this.A05, AnonymousClass002.A07(this.A06, AnonymousClass002.A05(this.A01, (((((4YV.A02(this.A02) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A04)) * 31) + 7zN.A05(this.A07)) * 31)));
    }
}
