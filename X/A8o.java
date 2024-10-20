package X;

import com.facebook.litho.LithoView;
import com.facebook.ui.emoji.model.EmojiSet;
import java.util.List;

/* loaded from: A8o.class */
public final class A8o implements AYo {
    public final /* synthetic */ LithoView A00;
    public final /* synthetic */ C9lz A01;

    public A8o(LithoView lithoView, C9lz c9lz) {
        this.A01 = c9lz;
        this.A00 = lithoView;
    }

    @Override // X.AYo
    public final void By5(List list) {
        11T.A0F(list, 0);
        C9lz c9lz = this.A01;
        LithoView lithoView = this.A00;
        EmojiSet.Metadata metadata = new EmojiSet.Metadata(3E2.A09, list);
        int i = 2131965560;
        if (list.isEmpty()) {
            i = 2131962134;
        }
        C9lz.A01(lithoView, c9lz, 7zN.A0e(new EmojiSet(metadata, 0, 0, i)));
    }
}
