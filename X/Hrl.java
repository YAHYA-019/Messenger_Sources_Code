package X;

import android.webkit.MimeTypeMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.RegularImmutableBiMap;

/* loaded from: Hrl.class */
public final class Hrl {
    public final MimeTypeMap A00 = MimeTypeMap.getSingleton();
    public final ImmutableBiMap A01 = new RegularImmutableBiMap(new Object[]{"audio/mp4", "m4a", "audio/mp3", "mp3", "image/webp", "webp"}, 3);

    public String A00(String str) {
        String A1C = AbF.A1C(this.A01, str);
        if (A1C == null) {
            A1C = this.A00.getExtensionFromMimeType(str);
        }
        return A1C;
    }

    public String A01(String str) {
        String A1C = AbF.A1C(((RegularImmutableBiMap) this.A01).A00, str);
        if (A1C == null) {
            A1C = this.A00.getMimeTypeFromExtension(str);
        }
        return A1C;
    }
}
