package X;

import android.content.Context;
import com.facebook.browsertonativesso.BrowserToNativeSSOTokens;

/* renamed from: X.46o, reason: invalid class name */
/* loaded from: 46o.class */
public final class C46o extends 1RM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 2Vz A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C46o(Context context, 2Vz r303, Integer num, String str, String str2, boolean z, boolean z2) {
        this.A01 = r303;
        this.A00 = context;
        this.A02 = num;
        this.A06 = z;
        this.A03 = str;
        this.A05 = z2;
        this.A04 = str2;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        BrowserToNativeSSOTokens browserToNativeSSOTokens = (BrowserToNativeSSOTokens) obj;
        if (browserToNativeSSOTokens == null) {
            2Vz.A01(this.A00, this.A01);
            return;
        }
        2Vz r0 = this.A01;
        C3T0.A01((C3T0) r0.A05.get(), 1BJ.A00(1829), null);
        4DK r02 = (4DK) r0.A06.get();
        String str = browserToNativeSSOTokens.plainTextToken;
        1Ql A0V = 1BL.A0V(r02.A01);
        A0V.CaL(2W0.A09, str);
        A0V.commit();
        Context context = this.A00;
        Integer num = this.A02;
        boolean z = this.A06;
        r0.A04(context, browserToNativeSSOTokens, num, this.A03, this.A04, 201, z, this.A05);
        CfG cfG = r0.A00;
        if (cfG != null) {
            cfG.D2v();
        }
    }

    public void A03(Throwable th) {
        2Vz.A01(this.A00, this.A01);
    }
}
