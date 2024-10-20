package X;

/* renamed from: X.82k, reason: invalid class name */
/* loaded from: 82k.class */
public final class C82k extends C04v implements 5PP {
    public final int A00;
    public final String A01;
    public final String A02;

    public C82k(String str, String str2, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = str;
            this.A01 = str2;
        } else {
            this.A01 = str;
            this.A02 = str2;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C82k)) {
                return false;
            }
            C82k c82k = (C82k) obj;
            if (c82k.A00 != 1 || !11T.A0O(this.A02, c82k.A02)) {
                return false;
            }
            str = this.A01;
            str2 = c82k.A01;
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C82k)) {
                return false;
            }
            C82k c82k2 = (C82k) obj;
            if (c82k2.A00 != 0 || !11T.A0O(this.A01, c82k2.A01)) {
                return false;
            }
            str = this.A02;
            str2 = c82k2.A02;
        }
        return 11T.A0O(str, str2);
    }

    public int hashCode() {
        int i;
        int hashCode;
        String str;
        if (this.A00 != 0) {
            String str2 = this.A02;
            i = 0;
            hashCode = (str2 == null ? 0 : str2.hashCode()) * 31;
            str = this.A01;
        } else {
            String str3 = this.A01;
            i = 0;
            hashCode = (str3 == null ? 0 : str3.hashCode()) * 31;
            str = this.A02;
        }
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.A00 != 0 ? super.toString() : 0Pz.A0w("TranslatedMessageMetadata(translatedText=", this.A01, ", translatedTextDialect=", this.A02, ')');
    }
}
