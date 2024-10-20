package X;

import com.google.common.collect.ImmutableList;
import org.apache.http.NameValuePair;

/* renamed from: X.3zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zz.class */
public final class C04113zz {
    public final 1GS A00;
    public final C15h A01;
    public final C03z A02;

    public C04113zz() {
        1GS r0 = (1GS) 1Bi.A03(16504);
        C4Xg c4Xg = new C4Xg(this, 9);
        C03z c03z = (C03z) 1Bi.A03(84634);
        this.A00 = r0;
        this.A01 = c4Xg;
        this.A02 = c03z;
    }

    public 07S A00(C04103zy c04103zy) {
        07S r303 = c04103zy.A07;
        if (r303 == null) {
            r303 = this.A02.A02();
            ImmutableList immutableList = c04103zy.A0C;
            if (immutableList == null) {
                immutableList = ImmutableList.of();
            }
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                NameValuePair nameValuePair = (NameValuePair) it.next();
                07S.A00(r303, nameValuePair.getValue(), nameValuePair.getName());
            }
        }
        07S.A00(r303, this.A00.A01(), "locale");
        Object obj = this.A01.get();
        if (obj != null) {
            07S.A00(r303, obj, "client_country_code");
        }
        return r303;
    }
}
