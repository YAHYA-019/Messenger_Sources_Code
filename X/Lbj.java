package X;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;
import java.io.InputStream;

/* loaded from: Lbj.class */
public final class Lbj implements MG4 {
    @Override // X.MG4
    public /* bridge */ /* synthetic */ Object CWe(Uri uri, InputStream inputStream) {
        return Long.valueOf(Util.A0F(JQy.A0f(inputStream).readLine()));
    }
}
