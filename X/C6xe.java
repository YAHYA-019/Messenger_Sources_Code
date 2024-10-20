package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.stickers.model.Sticker;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6xe, reason: invalid class name */
/* loaded from: 6xe.class */
public final class C6xe implements C6wv {
    public final Context A00;
    public final ThreadKey A01;

    public C6xe(Context context, ThreadKey threadKey) {
        this.A00 = context;
        this.A01 = threadKey;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    @Override // X.C6ws
    public ListenableFuture AUS(Bundle bundle) {
        long j;
        Integer num;
        ?? A0j = 4YU.A0j();
        HfN hfN = (HfN) 1Bu.A06(this.A00, 114788);
        ThreadKey threadKey = this.A01;
        HZ7 hz7 = new HZ7(A0j);
        MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0n(1Br.A03(hfN.A02), hfN.A00, 68390);
        if (threadKey != null) {
            j = threadKey.A01;
            if (threadKey.A0z()) {
                num = Integer.valueOf(RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
                1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0P = 1BK.A0P(AQV);
                1Um.A02(AQV, new Iay(4, j, A0P, mailboxFeature, num), A0P, false);
                A0P.addResultCallback(new Iah(hz7, hfN, 9));
                return A0j;
            }
        } else {
            j = 0;
        }
        num = null;
        1Um AQV2 = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P2 = 1BK.A0P(AQV2);
        1Um.A02(AQV2, new Iay(4, j, A0P2, mailboxFeature, num), A0P2, false);
        A0P2.addResultCallback(new Iah(hz7, hfN, 9));
        return A0j;
    }

    @Override // X.C6wv
    public /* bridge */ /* synthetic */ void Cdm(Object obj) {
    }

    @Override // X.C6wv
    public /* bridge */ /* synthetic */ void add(Object obj) {
        Sticker sticker = (Sticker) obj;
        11T.A0F(sticker, 0);
        ((Hs7) 1Bu.A06(this.A00, 82019)).A00(null, sticker.A0F, C7ln.A00(sticker));
    }
}
