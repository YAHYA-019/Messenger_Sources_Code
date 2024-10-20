package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.3O4, reason: invalid class name */
/* loaded from: 3O4.class */
public final class C3O4 {
    public final Integer A00;
    public final String A01;
    public final Throwable A02;
    public final boolean A03;

    public C3O4(Integer num, String str, Throwable th, boolean z) {
        this.A02 = th;
        num.getClass();
        this.A00 = num;
        this.A01 = str;
        this.A03 = z;
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("exception=");
        Throwable th = this.A02;
        A0k.append(th != null ? th.getMessage() : "null");
        A0k.append(",errorDescription=");
        A0k.append(this.A01);
        A0k.append(",channel=");
        switch (this.A00.intValue()) {
            case 0:
                str = "MQTT";
                break;
            case 1:
                str = "GRAPH";
                break;
            default:
                str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                break;
        }
        A0k.append(str);
        A0k.append(",success=");
        A0k.append(this.A03);
        return A0k.toString();
    }
}
