package X;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Cnk.class */
public final class Cnk implements C5pz {
    public final /* synthetic */ SettableFuture A00;

    public Cnk(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    @Override // X.C5pz
    public void Blg() {
        this.A00.set((Object) null);
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        11T.A0F(r302, 0);
        try {
            2EY r0 = (2Ea) r302.A09();
            if (r0 instanceof 2EY) {
                Bitmap bitmap = r0.A04;
                11T.A0A(bitmap);
                Bitmap.Config config = bitmap.getConfig();
                11T.A0D(config);
                this.A00.set(bitmap.copy(config, bitmap.isMutable()));
            }
        } finally {
            r302.close();
        }
    }
}
