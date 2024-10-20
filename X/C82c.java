package X;

/* renamed from: X.82c, reason: invalid class name */
/* loaded from: 82c.class */
public final class C82c extends C04v implements 5PP {
    public final int A00;
    public final String A01;

    public C82c(String str, int i) {
        this.A00 = i;
        11T.A0F(str, 1);
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                i = 0;
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                i = 1;
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                i = 2;
                break;
            case 3:
                if (this == obj) {
                    return true;
                }
                i = 3;
                break;
            case 4:
                if (this == obj) {
                    return true;
                }
                i = 4;
                break;
            default:
                if (this == obj) {
                    return true;
                }
                i = 5;
                break;
        }
        if (!(obj instanceof C82c)) {
            return false;
        }
        C82c c82c = (C82c) obj;
        return c82c.A00 == i && 11T.A0O(this.A01, c82c.A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        StringBuilder sb;
        String str;
        switch (this.A00) {
            case 1:
                sb = new StringBuilder();
                str = "MessageSendFailStateMetadata(failureMessage=";
                break;
            case 2:
                sb = new StringBuilder();
                str = "XmaSnippetMetadata(snippetText=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        sb.append(this.A01);
        return 4YV.A0x(sb);
    }
}
