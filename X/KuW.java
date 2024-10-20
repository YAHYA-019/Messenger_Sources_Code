package X;

import android.net.Uri;

/* loaded from: KuW.class */
public final class KuW {
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public KuW(String str, long j, long j2) {
        this.A03 = str == null ? "" : str;
        this.A02 = j;
        this.A01 = j2;
    }

    public Uri A00(String str) {
        return Uri.parse(L6E.A00(str, this.A03));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.KuW A01(X.KuW r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KuW.A01(X.KuW, java.lang.String):X.KuW");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            KuW kuW = (KuW) obj;
            if (this.A02 != kuW.A02 || this.A01 != kuW.A01 || !this.A03.equals(kuW.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == 0) {
            i = 7zM.A05(this.A03, (((527 + ((int) this.A02)) * 31) + ((int) this.A01)) * 31);
            this.A00 = i;
        }
        return i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RangedUri(referenceUri=");
        A0k.append(this.A03);
        A0k.append(", start=");
        A0k.append(this.A02);
        A0k.append(", length=");
        A0k.append(this.A01);
        return AnonymousClass001.A0d(")", A0k);
    }
}
