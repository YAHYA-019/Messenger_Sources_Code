package com.facebook.gk.sessionless;

import X.11T;
import X.1Bn;
import android.content.Context;
import com.facebook.gk.store.GatekeeperWriter;

/* loaded from: GkSessionlessModule.class */
public final class GkSessionlessModule {

    /* loaded from: GkSessionlessModule$GkSessionlessModuleSelendroidInjector.class */
    public final class GkSessionlessModuleSelendroidInjector {
        public final Context A00;

        public GkSessionlessModuleSelendroidInjector(Context context) {
            11T.A0F(context, 1);
            this.A00 = context;
        }

        public final GatekeeperWriter getGatekeeperWriter() {
            return (GatekeeperWriter) 1Bn.A0A(131259);
        }
    }
}
