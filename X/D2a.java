package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.common.util.TriState;

/* loaded from: D2a.class */
public final class D2a implements GGf {
    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        Uri data = intent.getData();
        return (data == null || !"smsto".equals(data.getScheme())) ? TriState.UNSET : TriState.YES;
    }
}
