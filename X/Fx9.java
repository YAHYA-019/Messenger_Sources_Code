package X;

import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: Fx9.class */
public final class Fx9 implements GH7 {
    public final AssetManager A00;
    public final Esi A01;

    public Fx9(AssetManager assetManager, Esi esi) {
        this.A01 = esi;
        this.A00 = assetManager;
    }

    @Override // X.GH7
    public void AS8(ELh eLh, ExN exN, String str, java.util.Map map, Executor executor) {
        EIM eim = (EIM) this.A01.A00.get(str);
        if (eim == null) {
            exN.A01(new EIE(), new Exception(0Pz.A0j("Attempting to fetch a bundle for appId: ", str, " but found no prebundled config")));
            return;
        }
        try {
            InputStream open = this.A00.open(eim.A00);
            11T.A0A(open);
            executor.execute(new SA0(exN, open));
        } catch (FileNotFoundException unused) {
            exN.A01(new EIE(), new Exception(0Pz.A0W("Could not read prebundled json file associated with appId: ", str)));
        }
    }
}
