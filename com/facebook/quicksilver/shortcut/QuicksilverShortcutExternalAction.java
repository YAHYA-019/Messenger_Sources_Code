package com.facebook.quicksilver.shortcut;

import X.0LS;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.AbF;
import X.AbstractC00603o4;
import X.C06w;
import X.C06z;
import X.C1ic;
import X.DKF;
import X.FEP;
import X.FHN;
import X.GJL;
import android.content.Context;
import android.content.Intent;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: QuicksilverShortcutExternalAction.class */
public final class QuicksilverShortcutExternalAction {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(QuicksilverShortcutExternalAction.class, "quicksilverMobileConfig", "getQuicksilverMobileConfig()Lcom/facebook/quicksilver/config/QuicksilverMobileConfig;", 0), new C06w(QuicksilverShortcutExternalAction.class, "uriIntentMapper", "getUriIntentMapper()Lcom/facebook/common/uri/UriIntentMapper;", 0)};
    public final Context context;
    public final 1Br quicksilverMobileConfig$delegate;
    public final 1Br uriIntentMapper$delegate;

    public QuicksilverShortcutExternalAction(Context context) {
        11T.A0F(context, 1);
        this.context = context;
        this.quicksilverMobileConfig$delegate = DKF.A0N();
        this.uriIntentMapper$delegate = 1Bq.A00(84011);
    }

    private final FHN getQuicksilverMobileConfig() {
        return (FHN) 1Br.A0B(this.quicksilverMobileConfig$delegate);
    }

    private final GJL getUriIntentMapper() {
        return (GJL) 1Br.A0B(this.uriIntentMapper$delegate);
    }

    public final Context getContext() {
        return this.context;
    }

    public void handle(Intent intent) {
        Intent A00;
        11T.A0F(intent, 0);
        if (1Br.A06(getQuicksilverMobileConfig().A00).AZk(36312148896583812L)) {
            A00 = getUriIntentMapper().Ard(this.context, C1ic.A0F);
            if (A00 == null) {
                return;
            }
        } else {
            String stringExtra = intent.getStringExtra("app_id");
            long intExtra = intent.getIntExtra("game_type", -1);
            Intent className = AbF.A05().setClassName(this.context, AbstractC00603o4.A00(459));
            11T.A0A(className);
            className.putExtra("app_id", stringExtra);
            className.putExtra("game_type", intExtra);
            className.putExtra(Property.SYMBOL_Z_ORDER_SOURCE, "home_screen_shortcut");
            className.addFlags(67108864);
            A00 = FEP.A00(className, (FEP) 1Bu.A06(this.context, 83718));
        }
        0LS.A0A(this.context, A00);
    }
}
