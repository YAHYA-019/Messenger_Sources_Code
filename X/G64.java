package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: G64.class */
public final class G64 implements Runnable {
    public static final String __redex_internal_original_name = "CDSBloksBottomSheetController$openBottomSheet$1";
    public final /* synthetic */ 0D2 A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ GKu A02;
    public final /* synthetic */ FHf A03;
    public final /* synthetic */ GDj A04;
    public final /* synthetic */ EIs A05;
    public final /* synthetic */ String A06;

    public G64(0D2 r302, FragmentActivity fragmentActivity, GKu gKu, FHf fHf, GDj gDj, EIs eIs, String str) {
        this.A00 = r302;
        this.A01 = fragmentActivity;
        this.A06 = str;
        this.A02 = gKu;
        this.A04 = gDj;
        this.A03 = fHf;
        this.A05 = eIs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GLd gLd = this.A00;
        GLe A01 = FIw.A01(gLd);
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A06;
        gLd.CVS(FIw.A02(fragmentActivity, A01, this.A02, this.A03, this.A04, str), this.A05);
    }
}
