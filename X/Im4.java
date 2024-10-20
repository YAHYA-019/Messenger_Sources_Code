package X;

import android.content.Context;
import android.view.View;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: Im4.class */
public final class Im4 implements C6wg {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Im4(GeneratedStickerSearchFragment generatedStickerSearchFragment, String str, int i) {
        this.A00 = i;
        this.A01 = generatedStickerSearchFragment;
        this.A02 = str;
    }

    @Override // X.C6wg
    public void C6f(Context context, View view, 06Z r304, Sticker sticker, 6tM r306) {
        if (this.A00 != 0) {
            11T.A0F(sticker, 0);
            GeneratedStickerSearchFragment generatedStickerSearchFragment = (GeneratedStickerSearchFragment) this.A01;
            StickerGridView stickerGridView = generatedStickerSearchFragment.A0B;
            if (stickerGridView == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            String str = sticker.A0F;
            int A0V = stickerGridView.A0V(str);
            if (A0V >= 0) {
                ID8 id8 = (ID8) 1Br.A0B(generatedStickerSearchFragment.A0R);
                ThreadKey threadKey = generatedStickerSearchFragment.A04;
                long j = A0V;
                String str2 = this.A02;
                String A00 = ((Ho2) 1Br.A0B(generatedStickerSearchFragment.A0P)).A00(sticker);
                Boolean valueOf = Boolean.valueOf(generatedStickerSearchFragment.A0K);
                1UG A08 = 1BK.A08(1Br.A02(id8.A00), 1BJ.A00(490));
                if (A08.isSampled()) {
                    ID8.A03(A08, id8, j);
                    AbstractC2327GOs.A0o(A08, valueOf, ID8.A00(threadKey, id8));
                    A08.A7R("search_query", str2);
                    A08.A7R("item_id", str);
                    ID8.A02(A08, threadKey, sticker, A00);
                    A08.A09("is_animated");
                    A08.BZL();
                }
                StickerGridView stickerGridView2 = generatedStickerSearchFragment.A0B;
                if (stickerGridView2 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                GWC gwc = stickerGridView2.A05;
                gwc.getClass();
                List list = ((GWI) gwc).A00.A02;
                if (list == null || A0V >= list.size()) {
                    return;
                }
                ((HpA) list.get(A0V)).A01 = false;
                gwc.A08(A0V);
                return;
            }
            return;
        }
        boolean z = false;
        11T.A0F(sticker, 0);
        GeneratedStickerSearchFragment generatedStickerSearchFragment2 = (GeneratedStickerSearchFragment) this.A01;
        StickerGridView stickerGridView3 = generatedStickerSearchFragment2.A0B;
        if (stickerGridView3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String str3 = sticker.A0F;
        int A0V2 = stickerGridView3.A0V(str3);
        if (A0V2 >= 0) {
            ID8 id82 = (ID8) 1Br.A0B(generatedStickerSearchFragment2.A0R);
            ThreadKey threadKey2 = generatedStickerSearchFragment2.A04;
            long j2 = A0V2;
            String str4 = this.A02;
            String A002 = ((Ho2) 1Br.A0B(generatedStickerSearchFragment2.A0P)).A00(sticker);
            Boolean valueOf2 = Boolean.valueOf(generatedStickerSearchFragment2.A0K);
            1UG A082 = 1BK.A08(1Br.A02(id82.A00), 1BJ.A00(489));
            if (A082.isSampled()) {
                ID8.A03(A082, id82, j2);
                AbstractC2327GOs.A0o(A082, valueOf2, ID8.A00(threadKey2, id82));
                A082.A7R("search_query", str4);
                A082.A7R("item_id", str3);
                ID8.A02(A082, threadKey2, sticker, A002);
                A082.A0A("is_animated");
                A082.BZL();
            }
            StickerGridView stickerGridView4 = generatedStickerSearchFragment2.A0B;
            if (stickerGridView4 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            GWC gwc2 = stickerGridView4.A05;
            gwc2.getClass();
            List list2 = ((GWI) gwc2).A00.A02;
            if (list2 != null && A0V2 < list2.size()) {
                if (((HpA) list2.get(A0V2)).A00 != null) {
                    z = true;
                }
                if (7zO.A1Y(z)) {
                    StickerGridView stickerGridView5 = generatedStickerSearchFragment2.A0B;
                    if (stickerGridView5 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    stickerGridView5.A0g(null, A0V2);
                    return;
                }
            }
            StickerGridView stickerGridView6 = generatedStickerSearchFragment2.A0B;
            if (stickerGridView6 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            stickerGridView6.A0a(A0V2, true);
            2FT A03 = ((I5H) 1Br.A0B(generatedStickerSearchFragment2.A0Q)).A03(ImmutableList.of((Object) str3), str4, true);
            generatedStickerSearchFragment2.A0G = A03;
            1Br.A0D(generatedStickerSearchFragment2.A0V, Inf.A00(generatedStickerSearchFragment2, sticker, 38), A03);
        }
    }
}
