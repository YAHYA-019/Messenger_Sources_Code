package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.Ged, reason: case insensitive filesystem */
/* loaded from: Ged.class */
public final class C2482Ged extends 1RM {
    public final ThreadKey A00;
    public final /* synthetic */ 7V3 A01;

    public C2482Ged(ThreadKey threadKey, 7V3 r303) {
        this.A01 = r303;
        this.A00 = threadKey;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        Object obj2;
        2JX r0;
        2JX A0L;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        7V2 r02 = this.A01.A00;
        if (r02 != null) {
            r02.AS5((abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null || (A0L = 1BL.A0L((r0 = (2JX) obj2), -379606751, 1198424155)) == null || r0.A0L(1913864075, 2JX.class, 392532003) == null) ? null : new I2S(r0, A0L.A1r(), this.A00));
        }
    }

    public void A03(Throwable th) {
        7V2 r0 = this.A01.A00;
        if (r0 != null) {
            r0.AS6(th);
        }
    }
}
