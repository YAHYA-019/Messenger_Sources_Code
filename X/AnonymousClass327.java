package X;

/* renamed from: X.327, reason: invalid class name */
/* loaded from: 327.class */
public final class AnonymousClass327 {
    public final 32B A00;
    public final AnonymousClass328 A01;
    public final 32A A02;
    public final Integer A03;
    public final Integer A04;

    public AnonymousClass327(32B r302, AnonymousClass328 anonymousClass328, 32A r304, Integer num, Integer num2) {
        this.A00 = r302;
        this.A02 = r304;
        this.A01 = anonymousClass328;
        this.A04 = num;
        this.A03 = num2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass327)) {
                return false;
            }
            AnonymousClass327 anonymousClass327 = (AnonymousClass327) obj;
            if (!11T.A0O(this.A00, anonymousClass327.A00) || !11T.A0O(this.A02, anonymousClass327.A02) || !11T.A0O(this.A01, anonymousClass327.A01) || !11T.A0O(this.A04, anonymousClass327.A04) || !11T.A0O(this.A03, anonymousClass327.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = ((((((AnonymousClass001.A02(this.A00) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A04)) * 31;
        Integer num = this.A03;
        if (num != null) {
            i = num.hashCode();
        }
        return A02 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FetchBackupGraphQLResponse(backup=");
        A0k.append(this.A00);
        A0k.append(", userPreferences=");
        A0k.append(this.A02);
        A0k.append(", user=");
        A0k.append(this.A01);
        A0k.append(", onboardingSoftNuxTimestamp=");
        A0k.append(this.A04);
        A0k.append(", onboardingHardNuxTimestamp=");
        return AnonymousClass002.A0K(this.A03, A0k);
    }
}
