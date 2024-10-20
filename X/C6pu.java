package X;

import com.facebook.stickers.model.StickerPack;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.6pu, reason: invalid class name */
/* loaded from: 6pu.class */
public final class C6pu implements 1Ro {
    public static final String __redex_internal_original_name = "SetDownloadedStickerPacksMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        List list = (List) obj;
        C03353xs c03353xs = new C03353xs(C26T.A00);
        for (int i = 0; i < list.size(); i++) {
            c03353xs.A0e(((StickerPack) list.get(i)).A0B);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("pack_ids", c03353xs.toString()));
        return new C04103zy(0S2.A01, "setDownloadedStickerPacks", "POST", "me/sticker_tray_packs", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
