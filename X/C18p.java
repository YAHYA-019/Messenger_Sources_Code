package X;

import java.util.List;

/* renamed from: X.18p, reason: invalid class name */
/* loaded from: 18p.class */
public final class C18p {
    public String A00;
    public java.util.Map A01;
    public final C18q A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public C18p(C18q c18q, String str, String str2, String str3, String str4, List list) {
        this.A03 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = c18q;
        this.A04 = str4;
        this.A07 = list;
    }

    public C18p(C18q c18q, String str, String str2, List list, java.util.Map map) {
        this.A03 = str;
        this.A07 = list;
        this.A06 = null;
        this.A05 = null;
        this.A02 = c18q;
        this.A04 = str2;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{clientIdentifier='");
        A0k.append(this.A03);
        A0k.append("', willTopic='");
        A0k.append(this.A06);
        A0k.append("', willMessage='");
        A0k.append(this.A05);
        A0k.append("', userName='");
        A0k.append(this.A02);
        A0k.append("', phpOverride='");
        A0k.append(this.A00);
        A0k.append("'");
        return AnonymousClass001.A0f(A0k);
    }
}
