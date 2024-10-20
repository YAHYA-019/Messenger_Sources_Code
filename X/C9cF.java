package X;

/* renamed from: X.9cF, reason: invalid class name */
/* loaded from: 9cF.class */
public final class C9cF {
    public final long A00;
    public final String A01;

    public C9cF(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9cF)) {
                return false;
            }
            C9cF c9cF = (C9cF) obj;
            if (this.A00 != c9cF.A00 || !11T.A0O(this.A01, c9cF.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 7zQ.A02(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GenerateOneTimeCodeResponse(sessionId=");
        A0k.append(this.A00);
        A0k.append(", code=");
        A0k.append(this.A01);
        return 4YV.A0x(A0k);
    }
}
