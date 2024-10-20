package X;

import com.facebook.stickers.model.StickerPack;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.6pw, reason: invalid class name */
/* loaded from: 6pw.class */
public final class C6pw implements 1Ro {
    public static final String __redex_internal_original_name = "AddStickerPackMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("pack_id", ((StickerPack) obj).A0B));
        return new C04103zy(0S2.A01, "addStickerPack", "POST", "me/stickerpacks", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
