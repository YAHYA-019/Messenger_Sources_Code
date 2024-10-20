package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow;
import com.facebook.stickers.model.Sticker;

/* loaded from: Ih7.class */
public final class Ih7 implements JGc {
    public final /* synthetic */ I8b A00;
    public final /* synthetic */ GenAiSearchSuggestedRow A01;

    public Ih7(I8b i8b, GenAiSearchSuggestedRow genAiSearchSuggestedRow) {
        this.A00 = i8b;
        this.A01 = genAiSearchSuggestedRow;
    }

    @Override // X.JGc
    public void CNb(Sticker sticker, C5es c5es, HBG hbg, String str, int i) {
        String str2 = str;
        11T.A0F(hbg, 3);
        I8b i8b = this.A00;
        GenAiSearchSuggestedRow genAiSearchSuggestedRow = this.A01;
        ThreadKey threadKey = genAiSearchSuggestedRow.A01;
        int i2 = genAiSearchSuggestedRow.A00;
        if (str == null) {
            str2 = "";
        }
        ((I4b) 1Br.A0B(i8b.A00.A0O)).A01(threadKey, sticker, hbg, Boolean.valueOf(genAiSearchSuggestedRow.A07), str2, i2, 0, i);
    }
}
