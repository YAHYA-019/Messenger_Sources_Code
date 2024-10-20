package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.common.util.TriState;

/* loaded from: Fsr.class */
public final class Fsr implements GGf {
    public final C0et A00;
    public final F7c A01;

    public Fsr() {
        C0et A0E = AbJ.A0E();
        F7c f7c = (F7c) 1Bi.A03(68445);
        this.A00 = A0E;
        this.A01 = f7c;
    }

    public static final Fsr A00() {
        return new Fsr();
    }

    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        C0et c0et;
        Uri data = intent.getData();
        return (data == null || C0Aj.A06(data) || !(((c0et = this.A00) == C0et.A0C || c0et == C0et.A0P) && this.A01.A01(data))) ? TriState.UNSET : TriState.YES;
    }
}
