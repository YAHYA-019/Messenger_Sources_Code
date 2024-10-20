package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: AGf.class */
public final class AGf implements Runnable {
    public static final String __redex_internal_original_name = "AvatarHotLikeStickerFetcher$fetchForEmojiInternal$1$1";
    public final /* synthetic */ AYi A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public AGf(AYi aYi, List list, List list2, boolean z) {
        this.A00 = aYi;
        this.A01 = list;
        this.A02 = list2;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AYi aYi = this.A00;
        List list = this.A01;
        boolean isEmpty = list.isEmpty();
        List list2 = this.A02;
        if (!isEmpty) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj : list2) {
                if (list.contains(((8O0) obj).emoji.A07())) {
                    A0s.add(obj);
                }
            }
            list2 = A0s;
        }
        aYi.BkT(list2, this.A03);
    }
}
