package X;

/* renamed from: X.31m, reason: invalid class name */
/* loaded from: 31m.class */
public final class C31m {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final java.util.Map A04;

    public /* synthetic */ C31m(String str, String str2, java.util.Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        long nanoTime = System.nanoTime();
        this.A03 = str;
        this.A02 = str2;
        this.A04 = map;
        this.A01 = currentTimeMillis;
        this.A00 = nanoTime;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C31m)) {
                return false;
            }
            C31m c31m = (C31m) obj;
            if (!11T.A0O(this.A03, c31m.A03) || !11T.A0O(this.A02, c31m.A02) || !11T.A0O(this.A04, c31m.A04) || this.A01 != c31m.A01 || this.A00 != c31m.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = AnonymousClass002.A02(this.A01, AnonymousClass002.A05(this.A04, AnonymousClass002.A07(this.A02, this.A03.hashCode() * 31)));
        long j = this.A00;
        return A02 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EventData(type=");
        A0k.append(this.A03);
        A0k.append(", renderStateId=");
        A0k.append(this.A02);
        A0k.append(", attributes=");
        A0k.append(this.A04);
        A0k.append(", timestamp=");
        A0k.append(this.A01);
        A0k.append(", startTime=");
        A0k.append(this.A00);
        return AnonymousClass001.A0g(A0k, ')');
    }
}
