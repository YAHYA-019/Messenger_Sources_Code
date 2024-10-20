package X;

import android.text.Editable;
import android.widget.EditText;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow;
import com.facebook.stickers.model.Sticker;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.externalmedia.ExternalMediaGraphQLResult;

/* loaded from: Ih4.class */
public final class Ih4 implements JMV {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ I8b A01;
    public final /* synthetic */ GenAiSearchSuggestedRow A02;

    public Ih4(EditText editText, I8b i8b, GenAiSearchSuggestedRow genAiSearchSuggestedRow) {
        this.A02 = genAiSearchSuggestedRow;
        this.A00 = editText;
        this.A01 = i8b;
    }

    public ThreadKey Afy() {
        return this.A02.A01;
    }

    public void C45(HBG hbg) {
        GenAiSearchSuggestedRow genAiSearchSuggestedRow = this.A02;
        GenAiSearchSuggestedRow.A02(genAiSearchSuggestedRow, false);
        GenAiSearchSuggestedRow.A01(genAiSearchSuggestedRow, 0S2.A00);
    }

    public void C4P(HBG hbg) {
        GenAiSearchSuggestedRow genAiSearchSuggestedRow = this.A02;
        GenAiSearchSuggestedRow.A02(genAiSearchSuggestedRow, true);
        GenAiSearchSuggestedRow.A01(genAiSearchSuggestedRow, 0S2.A01);
    }

    public void C4U(HBG hbg, int i) {
        Editable text;
        String obj;
        EditText editText;
        Editable text2;
        String obj2;
        GenAiSearchSuggestedRow genAiSearchSuggestedRow = this.A02;
        genAiSearchSuggestedRow.A00 = i;
        GenAiSearchSuggestedRow.A02(genAiSearchSuggestedRow, i > 0 || (GOq.A1Y((AnonymousClass842) 1Br.A0B(genAiSearchSuggestedRow.A0B)) && ((editText = this.A00) == null || (text2 = editText.getText()) == null || (obj2 = text2.toString()) == null || 0CU.A0O(obj2))));
        EditText editText2 = this.A00;
        GenAiSearchSuggestedRow.A01(genAiSearchSuggestedRow, (editText2 == null || (text = editText2.getText()) == null || (obj = text.toString()) == null || 0CU.A0O(obj)) ? 0S2.A00 : 0S2.A0C);
    }

    public void C6J(MediaResource mediaResource, ExternalMediaGraphQLResult externalMediaGraphQLResult, String str, int i) {
        if (mediaResource != null) {
            this.A01.A03(mediaResource);
        }
    }

    public void CNR(Sticker sticker, C5es c5es, HBG hbg, String str, int i) {
        11T.A0F(hbg, 3);
        I8b i8b = this.A01;
        int i2 = this.A02.A00;
        if (str == null) {
            str = "";
        }
        ((I4b) 1Br.A0B(i8b.A00.A0O)).A03(sticker, str, i2, i);
    }

    public void CNU(Sticker sticker, C5es c5es, HBG hbg, String str, int i) {
        String str2 = str;
        1BK.A1J(sticker, 0, hbg);
        GenAiSearchSuggestedRow genAiSearchSuggestedRow = this.A02;
        ThreadKey threadKey = genAiSearchSuggestedRow.A01;
        int i2 = genAiSearchSuggestedRow.A00;
        if (str == null) {
            str2 = "";
        }
        Boolean valueOf = Boolean.valueOf(genAiSearchSuggestedRow.A07);
        I8b i8b = this.A01;
        C2735Gmk c2735Gmk = i8b.A00;
        Hmj hmj = c2735Gmk.A01;
        if (hmj != null) {
            hmj.A00(sticker);
        }
        I8b.A00(i8b, c2735Gmk, sticker);
        ((I4b) 1Br.A0B(c2735Gmk.A0O)).A02(threadKey, sticker, hbg, valueOf, str2, i2, 0, i);
        c2735Gmk.A0k();
    }
}
