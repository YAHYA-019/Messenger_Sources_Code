package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.stickers.model.Sticker;

/* loaded from: Ils.class */
public final class Ils implements JJQ {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ Sticker A01;
    public final /* synthetic */ HqM A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C2s8 A04;
    public final /* synthetic */ boolean A05;

    public Ils(Uri uri, Sticker sticker, HqM hqM, String str, C2s8 c2s8, boolean z) {
        this.A01 = sticker;
        this.A02 = hqM;
        this.A05 = z;
        this.A00 = uri;
        this.A03 = str;
        this.A04 = c2s8;
    }

    public void BM3(Throwable th) {
        this.A04.resumeWith((Object) null);
    }

    public void BMj(Bitmap bitmap, 2EU r303, String str) {
        String str2 = str;
        Sticker sticker = this.A01;
        String str3 = sticker.A0F;
        if (6Bl.A00(sticker) && sticker.A02 != null && 1Br.A07(this.A02.A00).AZk(72340168526662905L)) {
            str2 = "image/webp";
        } else {
            HqM hqM = this.A02;
            if (this.A05 && ((69I) 1Br.A0B(hqM.A04)).A04(sticker) != null) {
                str2 = "text/json";
            }
        }
        this.A04.resumeWith(new DqK(bitmap, this.A00, r303, str3, str2, sticker.A0B == GraphQLStickerType.REGULAR ? "fb_regular_sticker" : "fb_sticker", this.A03));
    }
}
