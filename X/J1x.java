package X;

import android.content.Context;

/* loaded from: J1x.class */
public final class J1x implements Runnable {
    public static final String __redex_internal_original_name = "MessageReactionMutationsHelper$5";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ I09 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public J1x(Context context, I09 i09, String str, String str2) {
        this.A01 = i09;
        this.A00 = context;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5ic c5ic = (C5ic) this.A01.A03.get();
        Context context = this.A00;
        DR6 A02 = c5ic.A02(context);
        A02.A03(this.A03);
        A02.A0J(this.A02);
        A02.A0G(IGS.A00(this, 20), context.getString(2131955719));
        A02.A0K(true);
        A02.A05();
    }
}
