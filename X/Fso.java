package X;

import android.content.Intent;
import com.facebook.common.util.TriState;

/* loaded from: Fso.class */
public final class Fso implements GGf {
    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        return (intent == null || intent.getCategories() == null || !intent.getCategories().contains("android.intent.category.HOME") || intent.getAction() != "android.intent.action.MAIN") ? TriState.UNSET : TriState.YES;
    }
}
