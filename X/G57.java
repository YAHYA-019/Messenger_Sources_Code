package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: G57.class */
public final class G57 implements Runnable {
    public static final String __redex_internal_original_name = "JewelCounters$OnJewelCountChangeListener$onSharedPreferenceChanged$1$1";
    public final /* synthetic */ EnumC06514h4 A00;
    public final /* synthetic */ 4Zq A01;
    public final /* synthetic */ FbSharedPreferences A02;
    public final /* synthetic */ 1G2 A03;

    public G57(EnumC06514h4 enumC06514h4, 4Zq r303, FbSharedPreferences fbSharedPreferences, 1G2 r305) {
        this.A01 = r303;
        this.A00 = enumC06514h4;
        this.A02 = fbSharedPreferences;
        this.A03 = r305;
    }

    @Override // java.lang.Runnable
    public final void run() {
        4Zq r0 = this.A01;
        EnumC06514h4 enumC06514h4 = this.A00;
        FbSharedPreferences fbSharedPreferences = this.A02;
        r0.A00(enumC06514h4, fbSharedPreferences.ArU(enumC06514h4.A01(), 0), fbSharedPreferences.ArU(this.A03, 0));
    }
}
