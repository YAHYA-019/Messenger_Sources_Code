package X;

import android.app.Activity;
import android.content.Intent;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: BS0.class */
public abstract class BS0 {
    public static final HashMap A00(Activity activity) {
        Intent intent;
        if (activity == null || (intent = activity.getIntent()) == null || !intent.hasExtra("extra_original_bundle")) {
            return null;
        }
        Serializable serializableExtra = intent.getSerializableExtra("extra_original_bundle");
        11T.A0I(serializableExtra, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        return (HashMap) serializableExtra;
    }
}
