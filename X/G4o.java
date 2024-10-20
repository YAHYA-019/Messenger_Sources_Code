package X;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: G4o.class */
public final class G4o implements Runnable {
    public static final String __redex_internal_original_name = "AppCompatTextHelper$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Typeface A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ DLV A03;

    public G4o(Typeface typeface, TextView textView, DLV dlv, int i) {
        this.A03 = dlv;
        this.A02 = textView;
        this.A01 = typeface;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A02.setTypeface(this.A01, this.A00);
    }
}
