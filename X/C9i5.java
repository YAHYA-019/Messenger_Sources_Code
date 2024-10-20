package X;

/* renamed from: X.9i5, reason: invalid class name */
/* loaded from: 9i5.class */
public final class C9i5 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C9i5() {
        this("", "", "", "", "", "", "");
    }

    public C9i5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A04 = str5;
        this.A06 = str6;
        this.A00 = str7;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9i5)) {
                return false;
            }
            C9i5 c9i5 = (C9i5) obj;
            if (!11T.A0O(this.A01, c9i5.A01) || !11T.A0O(this.A02, c9i5.A02) || !11T.A0O(this.A03, c9i5.A03) || !11T.A0O(this.A05, c9i5.A05) || !11T.A0O(this.A04, c9i5.A04) || !11T.A0O(this.A06, c9i5.A06) || !11T.A0O(this.A00, c9i5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, AnonymousClass002.A07(this.A06, AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A05, AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A02, 4YV.A02(this.A01)))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetaAiLinks(aiDisclosuresLink=");
        A0k.append(this.A01);
        A0k.append(", aiTermsLink=");
        A0k.append(this.A02);
        A0k.append(", privacyCenterLink=");
        A0k.append(this.A03);
        A0k.append(", appLevelPrivacyCenterLink=");
        A0k.append(this.A05);
        A0k.append(", privacyPolicyLink=");
        A0k.append(this.A04);
        A0k.append(", learnMoreLink=");
        A0k.append(this.A06);
        A0k.append(", aiAtMetaLink=");
        A0k.append(this.A00);
        return 4YV.A0x(A0k);
    }
}
