package X;

import android.os.Bundle;
import com.facebook.inject.FbInjector;

/* renamed from: X.Gel, reason: case insensitive filesystem */
/* loaded from: Gel.class */
public final class C2490Gel extends C49c {
    public static final String __redex_internal_original_name = "OfflineMutationsRetryJobLogic";
    public final C00i A00;
    public final C00i A01;

    public C2490Gel() {
        super(FbInjector.A00());
        this.A01 = 1BQ.A02(16449);
        this.A00 = 1BQ.A02(16698);
    }

    @Override // X.C49c
    public boolean A03(int i) {
        return true;
    }

    @Override // X.C49c
    public boolean A04(Bundle bundle, C49f c49f, int i) {
        1BK.A1E(this.A01).execute(new Izz(1Fw.A00(), c49f, this));
        return true;
    }
}
