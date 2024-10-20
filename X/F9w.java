package X;

/* loaded from: F9w.class */
public final class F9w {
    public final MRN A00;
    public final MRN A01;
    public final boolean A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public F9w() {
        /*
            r301 = this;
            X.M9S r0 = X.M9S.A01
            r302 = r0
            r0 = r301
            r1 = r302
            r2 = r302
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F9w.<init>():void");
    }

    public F9w(MRN mrn, MRN mrn2, boolean z) {
        11T.A0F(mrn2, 3);
        this.A02 = z;
        this.A00 = mrn;
        this.A01 = mrn2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9w)) {
                return false;
            }
            F9w f9w = (F9w) obj;
            if (this.A02 != f9w.A02 || !11T.A0O(this.A00, f9w.A00) || !11T.A0O(this.A01, f9w.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass002.A05(this.A00, AnonymousClass002.A00(this.A02 ? 1 : 0) * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MEmuUpdateProfileResponse(createdMEmuProfile=");
        A0k.append(this.A02);
        A0k.append(", extendedCaptureImages=");
        A0k.append(this.A00);
        A0k.append(", verificationResults=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
