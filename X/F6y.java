package X;

import android.os.Bundle;

/* loaded from: F6y.class */
public final class F6y {
    public static final FZn A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("key_screen_container_props_bundle");
        if (bundle2 == null) {
            return null;
        }
        boolean z = bundle2.getBoolean("key_from_config_change");
        Integer A0l = DKD.A0l(bundle2, "key_content_parse_result");
        FHf fHf = (FHf) FGX.A01(FHf.class, A0l);
        if (fHf == null) {
            throw AnonymousClass001.A0N("Must have a non-null content ParseResult");
        }
        Integer A0l2 = DKD.A0l(bundle2, "key_tree_params");
        java.util.Map map = (java.util.Map) FGX.A01(java.util.Map.class, A0l2);
        if (map == null) {
            throw AnonymousClass001.A0N("Must have non-null tree params");
        }
        String string = bundle2.getString("key_analytics_module");
        Integer A0l3 = DKD.A0l(bundle2, "key_analytics_extras");
        java.util.Map map2 = (java.util.Map) FGX.A01(java.util.Map.class, A0l3);
        boolean z2 = bundle2.getBoolean("key_animate_on_navigation");
        Integer A0l4 = DKD.A0l(bundle2, "key_container_config");
        return new FZn((GHQ) FGX.A01(GHQ.class, A0l4), fHf, Boolean.valueOf(z2), string, C0s8.A14(A0l, A0l2, A0l3, A0l4), map, map2, true, z);
    }

    public final FZn A01(Bundle bundle) {
        try {
            FZn A00 = A00(bundle);
            if (A00 != null) {
                return A00;
            }
            throw AnonymousClass001.A0N("args Bundle must contain ScreenContainerProps");
        } catch (RuntimeException e) {
            throw new Exception(e);
        }
    }
}
