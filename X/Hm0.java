package X;

import com.facebook.messaging.montage.model.art.CompositionInfo;
import com.facebook.messaging.photos.editing.EmojiLayer;
import com.facebook.ui.emoji.model.Emoji;

/* loaded from: Hm0.class */
public final class Hm0 {
    public final /* synthetic */ IFl A00;

    public Hm0(IFl iFl) {
        this.A00 = iFl;
    }

    public void A00(Emoji emoji, String str) {
        IFl iFl = this.A00;
        Hm9 hm9 = iFl.A09;
        Integer num = hm9 == null ? 0S2.A0N : JOC.A00(hm9.A00) ? 0S2.A01 : 0S2.A00;
        I2u i2u = new I2u();
        i2u.A0D = emoji.A07();
        i2u.A0B = iFl.A0N();
        i2u.A0C = num;
        i2u.A0I = str;
        CompositionInfo compositionInfo = new CompositionInfo(i2u);
        EmojiLayer emojiLayer = new EmojiLayer(emoji);
        emojiLayer.A07 = compositionInfo;
        iFl.A0I.A05(emojiLayer);
    }
}
