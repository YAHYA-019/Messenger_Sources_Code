package X;

import android.content.Context;
import android.content.DialogInterface;

/* loaded from: AF9.class */
public final class AF9 implements Runnable {
    public static final String __redex_internal_original_name = "SharedAlbumNuxHelper$maybeShowDeleteDisclosureDialog$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C9hq A01;

    public AF9(Context context, C9hq c9hq) {
        this.A01 = c9hq;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9hq c9hq = this.A01;
        1G2 r0 = C9hq.A08;
        DR6 A02 = ((C5ic) 1Br.A0B(c9hq.A01)).A02(this.A00);
        A02.A00(2131955661);
        A02.A06(2131955660);
        A02.A0D(new DialogInterface.OnClickListener() { // from class: X.9o9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }, 2131955659);
        7zN.A13(A02);
    }
}
