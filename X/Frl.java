package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.DexOptimizationControl;
import com.facebook.common.dextricks.LogcatReader;
import java.util.Iterator;

/* loaded from: Frl.class */
public final class Frl implements C14l {
    public final /* synthetic */ DL1 A00;

    public Frl(DL1 dl1) {
        this.A00 = dl1;
    }

    @Override // X.C14l
    public Intent Cie(Context context, Intent intent) {
        DexOptimizationControl.pauseOptimization(context, LogcatReader.DEFAULT_WAIT_TIME);
        Iterator it = this.A00.A04.iterator();
        while (it.hasNext()) {
            it.next();
            CM1.A00(intent);
        }
        return intent;
    }
}
