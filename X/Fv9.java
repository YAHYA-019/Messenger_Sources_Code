package X;

import android.content.Context;
import java.util.List;

/* loaded from: Fv9.class */
public final class Fv9 implements GIy {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ GIy A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ java.util.Map A06;

    public Fv9(Context context, GIy gIy, String str, String str2, List list, List list2, java.util.Map map) {
        this.A00 = context;
        this.A04 = list;
        this.A02 = str;
        this.A06 = map;
        this.A05 = list2;
        this.A03 = str2;
        this.A01 = gIy;
    }

    @Override // X.GIy
    public void CEX(Boolean bool, Integer num, Throwable th) {
        this.A01.CEX(bool, num, th);
    }

    @Override // X.GIy
    public void CEY(String str) {
        try {
            Context context = this.A00;
            List list = this.A04;
            String str2 = this.A02;
            java.util.Map map = this.A06;
            List list2 = this.A05;
            FGM.A02(context, this.A01, false, "SMS_OTP", "VERIFY_FACTOR", str2, this.A03, list, list2, map);
        } catch (ERa e) {
            this.A01.CEX(false, 7zN.A0h(), e);
        }
    }
}
