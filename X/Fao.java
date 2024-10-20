package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.stickers.model.StickerPack;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: Fao.class */
public final class Fao implements 1UN, CallerContextable {
    public static final CallerContext A0A = CallerContext.A08(Fao.class, "sticker_download_manager");
    public static final String __redex_internal_original_name = "StickerDownloadManager";
    public Context A00;
    public final 1I7 A01;
    public final HashMap A04;
    public final HashMap A05;
    public final C15h A06;
    public final C15h A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A03 = 1BV.A00(33031);
    public final C00i A02 = AbH.A0H();

    public Fao() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A01 = DKD.A0H(A00);
        this.A09 = AbH.A0S();
        this.A06 = G7K.A01(this, ActionId.CARD_DATA_LOADED);
        this.A07 = G7K.A01(this, ActionId.VIEW_WILL_APPEAR_BEGIN);
        this.A08 = 1BV.A00(100162);
        ((1UP) 1Bi.A03(66348)).A00(this);
        this.A04 = AnonymousClass001.A0u();
        this.A05 = AnonymousClass001.A0u();
    }

    public static void A00(FbUserSession fbUserSession, Fao fao, StickerPack stickerPack, boolean z) {
        Intent A0A2;
        AbK.A1O(1BL.A0V(fao.A09), C4By.A02);
        String str = stickerPack.A0B;
        fao.A04.remove(str);
        fao.A05.remove(str);
        if (z) {
            A0A2 = 4YU.A0A("com.facebook.orca.stickers.DOWNLOAD_SUCCESS");
            if (1BL.A1a(fao.A06)) {
                Eg3 eg3 = (Eg3) fao.A08.get();
                5Qx r0 = 5Qx.A04;
                69H r02 = (69H) 1Lo.A06(fbUserSession, 49969);
                if (r02.A0D(r0)) {
                    r02.A09(stickerPack, r0);
                }
                5Qx r03 = 5Qx.A03;
                69H r04 = (69H) 1Lo.A06(fbUserSession, 49969);
                if (r04.A0D(r03)) {
                    r04.A09(stickerPack, r03);
                }
                ((C6pz) eg3.A00.get()).A00();
            }
        } else {
            A0A2 = 4YU.A0A("com.facebook.orca.stickers.DOWNLOAD_FAILURE");
        }
        A0A2.putExtra("stickerPack", stickerPack);
        fao.A01.CkS(A0A2);
    }

    public void A01(FbUserSession fbUserSession, StickerPack stickerPack) {
        if (A02(stickerPack)) {
            0fH.A0E(Fao.class, "Can't start download--download for this pack is already in progress.");
            return;
        }
        1Bn.A0A(348);
        Intent A0A2 = 4YU.A0A("com.facebook.orca.stickers.DOWNLOAD_QUEUED");
        A0A2.putExtra("stickerPack", stickerPack);
        this.A01.CkS(A0A2);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("stickerPack", stickerPack);
        if (1BL.A1a(this.A06)) {
            A05.putParcelable(1BJ.A00(21), (Parcelable) this.A07.get());
        }
        1IB A00 = 1Ho.A00(4YU.A0L(this.A03).newInstance(1BJ.A00(327), A05, 1, A0A, fbUserSession), true);
        C2081Db6 c2081Db6 = new C2081Db6(15, fbUserSession, stickerPack, this);
        1Kd.A0D(this.A02, c2081Db6, A00);
        this.A04.put(stickerPack.A0B, new 2eS(c2081Db6, A00));
    }

    public boolean A02(StickerPack stickerPack) {
        return AnonymousClass001.A1T(this.A04.get(stickerPack.A0B));
    }

    public void AFz() {
        HashMap hashMap = this.A04;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((2eS) it.next()).A00(true);
        }
        hashMap.clear();
        this.A05.clear();
    }
}
