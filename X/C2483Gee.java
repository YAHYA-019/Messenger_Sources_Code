package X;

import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Gee, reason: case insensitive filesystem */
/* loaded from: Gee.class */
public final class C2483Gee extends 1RM {
    public final String A00;
    public final /* synthetic */ H4x A01;

    public C2483Gee(H4x h4x, String str) {
        this.A01 = h4x;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        Integer num;
        C2636Gjo c2636Gjo = (C2636Gjo) obj;
        11T.A0F(c2636Gjo, 0);
        ImmutableList immutableList = (ImmutableList) c2636Gjo.A02;
        boolean isEmpty = immutableList.isEmpty();
        H4x h4x = this.A01;
        if (isEmpty) {
            h4x.A0a.A0Z();
            num = 0S2.A00;
        } else {
            StickerGridView stickerGridView = h4x.A0a;
            String string = h4x.getContext().getString(2131957289);
            String str = this.A00;
            GWC gwc = h4x.A0b.A05;
            gwc.getClass();
            stickerGridView.A0i(immutableList, string, str, gwc.A0A);
            num = 0S2.A0C;
        }
        H4x.A05(h4x, num);
    }

    public void A03(Throwable th) {
        H4x h4x = this.A01;
        h4x.A0a.A0Z();
        H4x.A05(h4x, 0S2.A00);
    }
}
