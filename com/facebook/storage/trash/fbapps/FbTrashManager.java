package com.facebook.storage.trash.fbapps;

import X.1Bq;
import X.1Br;
import X.1M9;
import X.2HW;
import X.2Jm;
import com.facebook.inject.FbInjector;
import com.facebook.storage.trash.fbapps.FbTrashManager;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: FbTrashManager.class */
public final class FbTrashManager implements 2HW {
    public final File A03 = 1M9.A00(FbInjector.A00()).AUq((2Jm) null, 331000889);
    public final 1Br A00 = 1Bq.A00(16616);
    public final 1Br A01 = 1Bq.A00(16457);
    public final 1Br A02 = 1Bq.A00(16657);

    public final void A00() {
        ((Executor) this.A01.A00.get()).execute(new Runnable() { // from class: X.4sn
            public static final String __redex_internal_original_name = "FbTrashManager$emptyAsync$1";

            @Override // java.lang.Runnable
            public final void run() {
                C0L3.A01(FbTrashManager.this.A03);
            }
        });
    }

    public void trimToMinimum() {
        A00();
    }

    public void trimToNothing() {
        A00();
    }
}
