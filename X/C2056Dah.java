package X;

import android.app.Activity;
import android.content.Intent;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Dah, reason: case insensitive filesystem */
/* loaded from: Dah.class */
public final class C2056Dah extends AbstractC2060Dal {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Fmh A01;
    public final /* synthetic */ SettableFuture A02;

    public C2056Dah(Fmh fmh, SettableFuture settableFuture, int i) {
        this.A01 = fmh;
        this.A00 = i;
        this.A02 = settableFuture;
    }

    public void Bhr(Activity activity, Intent intent, int i, int i2) {
        if (i == this.A00) {
            if (i != 2021 || i2 != 700) {
                this.A02.set(RYs.A00(AnonymousClass001.A1Q(i2, -1)));
                return;
            }
            SettableFuture settableFuture = this.A02;
            C00i c00i = this.A01.A03;
            settableFuture.setException(new G8K(1BL.A0B(c00i), 1BL.A0B(c00i).getString(2131967355), 1BL.A0B(c00i).getString(2131959673)));
        }
    }
}
