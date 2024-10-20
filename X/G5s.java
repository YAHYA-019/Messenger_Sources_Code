package X;

import android.content.Context;

/* loaded from: G5s.class */
public final class G5s implements Runnable {
    public static final String __redex_internal_original_name = "ZeroNativeTemplateDialogController$8";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 2JX A01;
    public final /* synthetic */ FIP A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ boolean A04;

    public G5s(Context context, 2JX r303, FIP fip, Long l, boolean z) {
        this.A02 = fip;
        this.A00 = context;
        this.A01 = r303;
        this.A04 = z;
        this.A03 = l;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context = this.A00;
        DuS A00 = DzF.A00(7zL.A0W(context));
        A00.A2X(1BL.A0L(AbF.A0K(this.A01, 2JX.class, -1812184760), -422593238, -476973279).A21());
        DzF A2W = A00.A2W();
        FIP fip = this.A02;
        FIP.A02(context, A2W, fip, this.A04);
        DKF.A0j(fip.A09).A03("zero_balance_dialog_impression", this.A03);
    }
}
