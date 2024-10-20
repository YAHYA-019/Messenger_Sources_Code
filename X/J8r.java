package X;

import com.facebook.messaging.analytics.perf.efficiency.connection.MessagingConnectionBlackoutLogger;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment;
import com.facebook.stickers.model.Sticker;

/* loaded from: J8r.class */
public final class J8r extends C00q implements C00m {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8r(Object obj, Object obj2, String str, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = obj2;
        this.A04 = str;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            GeneratedStickerSearchFragment generatedStickerSearchFragment = (GeneratedStickerSearchFragment) this.A03;
            ID8 id8 = (ID8) 1Br.A0B(generatedStickerSearchFragment.A0R);
            ThreadKey threadKey = generatedStickerSearchFragment.A04;
            long j = this.A01;
            Sticker sticker = (Sticker) this.A02;
            String str = this.A04;
            String A00 = ((Ho2) 1Br.A0B(generatedStickerSearchFragment.A0P)).A00(sticker);
            Boolean valueOf = Boolean.valueOf(generatedStickerSearchFragment.A0K);
            Boolean valueOf2 = Boolean.valueOf(6Bl.A03(sticker));
            11T.A0F(sticker, 2);
            1UG A08 = 1BK.A08(1Br.A02(id8.A00), 1BJ.A00(488));
            if (A08.isSampled()) {
                ID8.A03(A08, id8, j);
                AbstractC2327GOs.A0o(A08, valueOf, ID8.A00(threadKey, id8));
                A08.A7R("search_query", str);
                A08.A7R("item_id", sticker.A0F);
                ID8.A02(A08, threadKey, sticker, A00);
                A08.A5H("is_animated", valueOf2);
                A08.BZL();
            }
        } else {
            MessagingConnectionBlackoutLogger.A02((MessagingConnectionBlackoutLogger) this.A03).markerAnnotate(729356106, this.A01, 0Pz.A0T("kick_caller_", ((C1h6) this.A02).A00), this.A04);
        }
        return 04S.A00;
    }
}
