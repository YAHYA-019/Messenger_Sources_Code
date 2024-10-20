package X;

import com.facebook.pando.PandoError;
import com.facebook.pando.Summary;
import java.lang.ref.WeakReference;

/* loaded from: Fks.class */
public final class Fks implements GI4 {
    public final WeakReference A00;

    public Fks(GI4 gi4) {
        this.A00 = 7zL.A14(gi4);
    }

    @Override // X.GI4
    public void BwM(PandoError pandoError) {
        GI4 gi4 = (GI4) this.A00.get();
        if (gi4 != null) {
            gi4.BwM(pandoError);
        }
    }

    @Override // X.GI4
    public void CSa(Summary summary, Object obj) {
        GI4 gi4 = (GI4) this.A00.get();
        if (gi4 != null) {
            gi4.CSa(summary, obj);
        }
    }
}
