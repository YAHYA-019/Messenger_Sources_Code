package X;

import com.facebook.acra.constants.ActionId;
import java.util.HashMap;

/* loaded from: J36.class */
public final class J36 implements Runnable {
    public static final String __redex_internal_original_name = "VideoLoggingUtils$5";
    public final /* synthetic */ 5Kt A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public J36(5Kt r302, String str, String str2, boolean z, boolean z2) {
        this.A00 = r302;
        this.A04 = z;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        HashMap A0u = AnonymousClass001.A0u();
        boolean z = this.A04;
        String A00 = 1BJ.A00(ActionId.DATA_LOAD_START);
        if (!z) {
            Boolean valueOf = Boolean.valueOf(this.A03);
            A0u.put("suppress_obc", valueOf);
            5Kt r0 = this.A00;
            1Xo r02 = 5Kt.A12;
            ((C1is) r0.A0F.get()).A0H(this.A01, A0u);
            C00i c00i = r0.A0G;
            ((2Kv) c00i.get()).A08("suppress_obc", valueOf);
            ((2Kv) c00i.get()).A07(A00);
            return;
        }
        String str = this.A02;
        A0u.put("content_id", str);
        5Kt r03 = this.A00;
        1Xo r04 = 5Kt.A12;
        C1is c1is = (C1is) r03.A0F.get();
        String str2 = this.A01;
        c1is.A0I(str2, A0u, true);
        C00i c00i2 = r03.A0G;
        ((2Kv) c00i2.get()).A08("content_id", str);
        ((2Kv) c00i2.get()).A06((Object) null, str2, A00);
    }
}
