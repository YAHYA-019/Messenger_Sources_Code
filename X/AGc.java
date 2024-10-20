package X;

import android.view.View;

/* loaded from: AGc.class */
public final /* synthetic */ class AGc implements Runnable {
    public static final String __redex_internal_original_name = "SoftInputDetectorNoDi$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 6Nr A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AGc(View view, 6Nr r303, int i, boolean z) {
        this.A02 = r303;
        this.A01 = view;
        this.A00 = i;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            6Nr.A00(this.A01, this.A02, this.A00, this.A03);
        } catch (Throwable unused) {
        }
    }
}
