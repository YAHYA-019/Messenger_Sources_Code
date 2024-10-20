package X;

import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.5v8, reason: invalid class name */
/* loaded from: 5v8.class */
public final class C5v8 extends C5fu {
    public final long A00;
    public final Photo A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final C5fx A0B;

    public C5v8(C7Ze c7Ze) {
        super(c7Ze);
        this.A0B = C5fw.A0L;
        String str = c7Ze.A08;
        if (str == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A08 = str;
        this.A09 = c7Ze.A09;
        this.A03 = c7Ze.A03;
        String str2 = c7Ze.A07;
        if (str2 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A07 = str2;
        this.A01 = c7Ze.A01;
        this.A00 = c7Ze.A00;
        this.A0A = c7Ze.A0A;
        this.A04 = c7Ze.A04;
        this.A02 = c7Ze.A02;
        this.A05 = c7Ze.A05;
        this.A06 = c7Ze.A06;
    }

    @Override // X.C5fv
    public C5fx Ax3() {
        return this.A0B;
    }

    @Override // X.C5fu
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C5v8)) {
                return false;
            }
            C5v8 c5v8 = (C5v8) obj;
            if (11T.A0O(this.A08, c5v8.A08) && 11T.A0O(this.A09, c5v8.A09) && 11T.A0O(this.A07, c5v8.A07) && 11T.A0O(this.A03, c5v8.A03) && 11T.A0O(this.A01, c5v8.A01) && this.A00 == c5v8.A00 && this.A0A == c5v8.A0A && 11T.A0O(this.A04, c5v8.A04) && this.A02 == c5v8.A02 && 11T.A0O(this.A05, c5v8.A05) && 11T.A0O(this.A06, c5v8.A06) && super.equals(obj)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // X.C5fu
    public int hashCode() {
        String str;
        int hashCode = ((super.hashCode() * 31) + this.A08.hashCode()) * 31;
        String str2 = this.A09;
        int i = 0;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A03;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.A07.hashCode()) * 31;
        Photo photo = this.A01;
        int hashCode4 = (hashCode3 + (photo != null ? photo.hashCode() : 0)) * 31;
        long j = this.A00;
        int i2 = (hashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
        int i3 = 1237;
        if (this.A0A) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        String str4 = this.A04;
        int hashCode5 = (i4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "INSTAGRAM";
                break;
            case 2:
                str = "FACEBOOK";
                break;
            default:
                str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                break;
        }
        int hashCode6 = (hashCode5 + str.hashCode() + intValue) * 31;
        String str5 = this.A05;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.A06;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    @Override // X.C5fu
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[StoryReplyMessage snippetText=");
        A0k.append(this.A07);
        A0k.append(", previewPhoto=%");
        A0k.append(this.A01);
        A0k.append(", expirationTimeMs=");
        A0k.append(this.A00);
        A0k.append(", isMontageShare=");
        A0k.append(this.A0A);
        A0k.append(", super=");
        return 4YW.A07(super.toString(), A0k);
    }
}
