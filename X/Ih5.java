package X;

import com.facebook.messaging.composer.avatar.StickerSuggestionsController;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatar.AvatarSearchSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.sticker.StickerSearchSuggestionRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.stickerhint.StickerHintSuggestedRow;
import com.facebook.stickers.model.Sticker;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.externalmedia.ExternalMediaGraphQLResult;

/* loaded from: Ih5.class */
public final class Ih5 implements JMV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Ih5(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public ThreadKey Afy() {
        switch (this.A00) {
            case 0:
                return ((AvatarSearchSuggestedRow) this.A02).A01;
            case 1:
                return ((StickerSearchSuggestionRow) this.A02).A01;
            default:
                return ((StickerHintSuggestedRow) this.A02).A01;
        }
    }

    public void C45(HBG hbg) {
    }

    public void C4P(HBG hbg) {
    }

    public void C4U(HBG hbg, int i) {
        switch (this.A00) {
            case 0:
                ((AvatarSearchSuggestedRow) this.A02).A00 = i;
                return;
            case 1:
                ((StickerSearchSuggestionRow) this.A02).A00 = i;
                return;
            default:
                ((StickerHintSuggestedRow) this.A02).A00 = i;
                return;
        }
    }

    public void C6J(MediaResource mediaResource, ExternalMediaGraphQLResult externalMediaGraphQLResult, String str, int i) {
        if (mediaResource != null) {
            ((I8b) this.A01).A03(mediaResource);
        }
    }

    public void CNR(Sticker sticker, C5es c5es, HBG hbg, String str, int i) {
        int i2;
        int i3 = this.A00;
        11T.A0F(hbg, 3);
        I8b i8b = (I8b) this.A01;
        Object obj = this.A02;
        switch (i3) {
            case 0:
                i2 = ((AvatarSearchSuggestedRow) obj).A00;
                break;
            case 1:
                i2 = ((StickerSearchSuggestionRow) obj).A00;
                break;
            default:
                i2 = ((StickerHintSuggestedRow) obj).A00;
                break;
        }
        if (str == null) {
            str = "";
        }
        ((I4b) 1Br.A0B(i8b.A00.A0O)).A03(sticker, str, i2, i);
    }

    public void CNU(Sticker sticker, C5es c5es, HBG hbg, String str, int i) {
        C2735Gmk c2735Gmk;
        String str2 = str;
        switch (this.A00) {
            case 0:
                1BL.A11(0, sticker, hbg, c5es);
                I8b i8b = (I8b) this.A01;
                AvatarSearchSuggestedRow avatarSearchSuggestedRow = (AvatarSearchSuggestedRow) this.A02;
                ThreadKey threadKey = avatarSearchSuggestedRow.A01;
                int i2 = avatarSearchSuggestedRow.A00;
                if (str == null) {
                    str2 = "";
                }
                c2735Gmk = i8b.A00;
                Hmj hmj = c2735Gmk.A01;
                if (hmj != null) {
                    hmj.A00(sticker);
                }
                if (I8b.A01(i8b, sticker)) {
                    ((Hpb) 1Br.A0B(c2735Gmk.A0L)).A00(sticker, new Igm(c2735Gmk, 0));
                }
                ((I4b) 1Br.A0B(c2735Gmk.A0O)).A02(threadKey, sticker, hbg, null, str2, i2, i2, i);
                break;
            case 1:
                1BK.A1J(sticker, 0, hbg);
                StickerSearchSuggestionRow stickerSearchSuggestionRow = (StickerSearchSuggestionRow) this.A02;
                ThreadKey threadKey2 = stickerSearchSuggestionRow.A01;
                int i3 = stickerSearchSuggestionRow.A00;
                if (str == null) {
                    str2 = "";
                }
                I8b i8b2 = (I8b) this.A01;
                c2735Gmk = i8b2.A00;
                Hmj hmj2 = c2735Gmk.A01;
                if (hmj2 != null) {
                    hmj2.A00(sticker);
                }
                I8b.A00(i8b2, c2735Gmk, sticker);
                ((I4b) 1Br.A0B(c2735Gmk.A0O)).A02(threadKey2, sticker, hbg, null, str2, i3, 0, i);
                break;
            default:
                1BL.A11(0, sticker, hbg, c5es);
                StickerHintSuggestedRow stickerHintSuggestedRow = (StickerHintSuggestedRow) this.A02;
                7My r0 = ((StickerSuggestionsController) 1Br.A0B(stickerHintSuggestedRow.A07)).A02;
                if (r0 != null) {
                    7N0 r02 = r0.A01;
                    if (r02 != null) {
                        r02.A00 = 0;
                        r02.A01 = 0;
                    }
                    r0.A00();
                }
                I8b i8b3 = (I8b) this.A01;
                ThreadKey threadKey3 = stickerHintSuggestedRow.A01;
                int i4 = stickerHintSuggestedRow.A00;
                if (str == null) {
                    str2 = "";
                }
                c2735Gmk = i8b3.A00;
                Hmj hmj3 = c2735Gmk.A01;
                if (hmj3 != null) {
                    hmj3.A00(sticker);
                }
                I8b.A00(i8b3, c2735Gmk, sticker);
                ((I4b) 1Br.A0B(c2735Gmk.A0O)).A02(threadKey3, sticker, hbg, null, str2, i4, 0, i);
                break;
        }
        c2735Gmk.A0k();
    }
}
