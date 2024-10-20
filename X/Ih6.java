package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatar.AvatarSearchSuggestedRow;
import com.facebook.stickers.model.Sticker;

/* loaded from: Ih6.class */
public final class Ih6 implements JGc {
    public final /* synthetic */ I8b A00;
    public final /* synthetic */ AvatarSearchSuggestedRow A01;

    public Ih6(I8b i8b, AvatarSearchSuggestedRow avatarSearchSuggestedRow) {
        this.A00 = i8b;
        this.A01 = avatarSearchSuggestedRow;
    }

    @Override // X.JGc
    public void CNb(Sticker sticker, C5es c5es, HBG hbg, String str, int i) {
        String str2 = str;
        11T.A0F(hbg, 3);
        I8b i8b = this.A00;
        AvatarSearchSuggestedRow avatarSearchSuggestedRow = this.A01;
        ThreadKey threadKey = avatarSearchSuggestedRow.A01;
        int i2 = avatarSearchSuggestedRow.A00;
        if (str == null) {
            str2 = "";
        }
        ((I4b) 1Br.A0B(i8b.A00.A0O)).A01(threadKey, sticker, hbg, null, str2, i2, i2, i);
    }
}
