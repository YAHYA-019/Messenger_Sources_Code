package X;

import com.instagram.common.bloks.payload.BloksComponentQueryResources;

/* loaded from: Ez3.class */
public final class Ez3 {
    public final Eyb A00;
    public final BloksComponentQueryResources A01;
    public final String A02;
    public final String A03;
    public final java.util.Map A04;

    public Ez3(Eyb eyb, BloksComponentQueryResources bloksComponentQueryResources, String str, String str2, java.util.Map map) {
        this.A00 = eyb;
        this.A02 = str;
        this.A04 = map;
        this.A03 = str2;
        this.A01 = bloksComponentQueryResources;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ez3)) {
                return false;
            }
            Ez3 ez3 = (Ez3) obj;
            if (!11T.A0O(this.A00, ez3.A00) || !11T.A0O(this.A02, ez3.A02) || !11T.A0O(this.A04, ez3.A04) || !11T.A0O(this.A03, ez3.A03) || !11T.A0O(this.A01, ez3.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A03, AnonymousClass002.A05(this.A04, AnonymousClass002.A07(this.A02, 1BL.A03(this.A00)))) + AnonymousClass001.A02(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BloksBatchedComponentQueryParseResult(componentParseResult=");
        A0k.append(this.A00);
        A0k.append(", appId=");
        A0k.append(this.A02);
        A0k.append(", consumedParams=");
        A0k.append(this.A04);
        A0k.append(", rawComponentPayload=");
        A0k.append(this.A03);
        A0k.append(", resources=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
