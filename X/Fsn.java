package X;

import android.content.Intent;
import com.facebook.common.util.TriState;

/* loaded from: Fsn.class */
public final class Fsn implements GGf {
    @Override // X.GGf
    public TriState BTZ(Intent intent) {
        String str = intent.getPackage();
        return (str == null || !str.equals("com.freebasics")) ? TriState.UNSET : TriState.YES;
    }
}
