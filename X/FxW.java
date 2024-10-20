package X;

import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: FxW.class */
public final class FxW implements GHB {
    public final Ekd A00 = new Ekd();
    public final ExecutorService A02 = Executors.newSingleThreadExecutor();
    public final java.util.Map A01 = 1BK.A1C();

    public Ek9 Cvs(FyG fyG, FHh fHh, FxZ fxZ, GDi gDi, F3b f3b) {
        11T.A0F(gDi, 2);
        String str = ((FxG) gDi).A00;
        0fH.A0j("MediaStoreDataModule", 0Pz.A0W("setUp variable_id =", str));
        java.util.Map map = this.A01;
        11T.A0D(str);
        Object obj = map.get(str);
        if (obj == null) {
            obj = AnonymousClass001.A0s();
            map.put(str, obj);
        }
        ((Collection) obj).add(7zL.A14(fxZ));
        return new Ek9(new G1j(this, str), null);
    }
}
