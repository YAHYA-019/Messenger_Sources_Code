package com.facebook.analytics;

import X.0Q8;
import X.1Bi;
import X.1C0;
import X.3jG;
import android.content.Context;

/* loaded from: AnalyticsClientModule.class */
public abstract class AnalyticsClientModule {
    public static final 1C0 A00 = new 1C0(new 3jG(0));

    /* loaded from: AnalyticsClientModule$AnalyticsClientModuleSelendroidInjector.class */
    public class AnalyticsClientModuleSelendroidInjector {
        public final Context A00;

        public AnalyticsClientModuleSelendroidInjector(Context context) {
            this.A00 = context;
        }

        public DeprecatedAnalyticsLogger getAnalyticsLogger() {
            return (DeprecatedAnalyticsLogger) 1Bi.A03(16636);
        }
    }

    public AnalyticsClientModule() {
        throw 0Q8.createAndThrow();
    }
}
