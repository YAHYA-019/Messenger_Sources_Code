package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;

/* loaded from: AC2.class */
public final class AC2 implements 1K9 {
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ 6RU A01;
    public final /* synthetic */ 6RU A02;
    public final /* synthetic */ 7CK A03;
    public final /* synthetic */ 7CK A04;
    public final /* synthetic */ 2Og A05;
    public final /* synthetic */ boolean A06;

    public AC2(ThreadKey threadKey, 6RU r303, 6RU r304, 7CK r305, 7CK r306, 2Og r307, boolean z) {
        this.A01 = r303;
        this.A05 = r307;
        this.A00 = threadKey;
        this.A06 = z;
        this.A03 = r305;
        this.A02 = r304;
        this.A04 = r306;
    }

    public void onFailure(Throwable th) {
        C9mP.A02(this.A02, this.A04);
    }

    public void onSuccess(Object obj) {
        Sticker sticker = (Sticker) obj;
        if (sticker == null) {
            C9mP.A02(this.A01, this.A03);
            return;
        }
        C9mP.A01(this.A00, sticker, this.A01, this.A05, this.A06);
    }
}
