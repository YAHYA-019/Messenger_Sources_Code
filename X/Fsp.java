package X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.common.util.TriState;

/* loaded from: Fsp.class */
public final class Fsp implements GGf {
    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        return (intent == null || TextUtils.isEmpty(intent.getAction()) || !"android.intent.action.GET_CONTENT".equals(intent.getAction()) || TextUtils.isEmpty(intent.getType()) || !intent.getType().equals("image/*")) ? TriState.UNSET : TriState.YES;
    }
}
