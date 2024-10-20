package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.messaging.stickers.keyboardopenparams.StickerLSKeyboardOpenParams;
import com.facebook.messaging.stickers.keyboardopenparams.StickerPackOpenParams;
import com.facebook.stickers.model.StickerPack;
import com.facebook.stickers.store.StickerStoreActivity;

/* loaded from: G54.class */
public final class G54 implements Runnable {
    public static final String __redex_internal_original_name = "ViewStickerPackHandlerImpl$viewStickerPack$1$onLoadSucceeded$1";
    public final /* synthetic */ 7lT A00;
    public final /* synthetic */ 6Gh A01;
    public final /* synthetic */ ES0 A02;
    public final /* synthetic */ boolean A03;

    public G54(7lT r302, 6Gh r303, ES0 es0, boolean z) {
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = es0;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3R9 c3r9;
        Parcelable stickerPackOpenParams;
        6Gh r0 = this.A01;
        CfG cfG = r0.A00;
        if (cfG != null) {
            cfG.D2v();
        }
        ES0 es0 = this.A02;
        if (es0 instanceof E9n) {
            if (!1Br.A07(R4W.A00).AZk(72339111964508248L)) {
                6HM r02 = (6HM) r0.A0D.get();
                C8S c8s = new C8S(AbJ.A06());
                c8s.A00(2131966340);
                COW.A01(c8s, r02);
                return;
            }
            boolean z = this.A03;
            ((9YN) 1Br.A0B(r0.A04)).A00(7zL.A09(), r0.A01, (Boolean) null, (Integer) null, (Long) null, false);
            C15h c15h = r0.A0C;
            FIl fIl = (FIl) c15h.get();
            if (z) {
                fIl.A0E(true);
                c15h.get();
            } else {
                fIl.A0E(false);
            }
            ((9Wp) 1De.A00(r0.A03, 68696)).A00(r0.A0A);
            return;
        }
        if (es0 instanceof E9p) {
            E9p e9p = (E9p) es0;
            StickerPack stickerPack = e9p.A00;
            if (stickerPack.A0H) {
                c3r9 = new C3R9();
                stickerPackOpenParams = new StickerLSKeyboardOpenParams(0S2.A0C);
            } else {
                H9k h9k = e9p.A01;
                if (h9k != null) {
                    int ordinal = h9k.ordinal();
                    if (ordinal == 0) {
                        String str = stickerPack.A0B;
                        c3r9 = new C3R9();
                        c3r9.A01(new StickerLSKeyboardOpenParams(0S2.A0Y));
                        C1pq.A08(4YT.A00(444), str);
                        stickerPackOpenParams = new StickerPackOpenParams(str);
                    } else if (ordinal == 1 || ordinal == 2) {
                        1Br.A0C(r0.A07);
                        Context context = r0.A0B.getContext();
                        Intent A0D = C3o5.A0D(context, StickerStoreActivity.class);
                        A0D.putExtra("stickerPack", stickerPack);
                        A0D.putExtra("startDownload", false);
                        A0D.putExtra("stickerContext", C6xd.A06);
                        DKE.A1C(context, A0D);
                    }
                }
            }
            c3r9.A01(stickerPackOpenParams);
            r0.A0A.BdS(c3r9.A00(), 4YT.A00(183));
        }
        if (es0 instanceof E9o) {
            C3R9 c3r92 = new C3R9();
            c3r92.A01(new StickerLSKeyboardOpenParams(0S2.A0C));
            r0.A0A.BdS(c3r92.A00(), 4YT.A00(183));
        }
    }
}
