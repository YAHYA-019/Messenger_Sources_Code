package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.util.TriState;
import com.facebook.stickers.model.StickerPack;
import com.facebook.stickers.service.models.FetchStickerPacksByIdParams;
import com.google.common.util.concurrent.SettableFuture;
import kotlin.jvm.functions.Function1;

/* renamed from: X.6z1, reason: invalid class name */
/* loaded from: 6z1.class */
public final class C6z1 implements 6yL {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C6z1(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 50147);
        this.A00 = 1Bu.A03(r0, 100212);
    }

    public void ASE(String str, Function1 function1) {
        C00i c00i = this.A01.A00;
        ((C6ox) c00i.get()).A01 = new IQM(this, function1, 1);
        ((C6ox) c00i.get()).A00(new C7om(str));
    }

    public void ASF(String str, Function1 function1) {
        C00i c00i = this.A00.A00;
        ((Fcv) c00i.get()).A01 = new IQM(this, function1, 2);
        Fcv fcv = (Fcv) c00i.get();
        C7ol c7ol = new C7ol(str);
        if (fcv.A01 != null) {
            1BY r0 = fcv.A02;
            69H r02 = (69H) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 49969);
            String str2 = c7ol.A00;
            StickerPack A03 = r02.A03(str2);
            TriState A01 = r02.A01(str2);
            if (A03 != null && A01.isSet()) {
                fcv.A01.C4X(c7ol, new E9p(A03, A01.asBoolean() ? H9k.DOWNLOADED : H9k.IN_STORE));
                return;
            }
            2TV r03 = fcv.A01;
            SettableFuture A0j = 4YU.A0j();
            FetchStickerPacksByIdParams fetchStickerPacksByIdParams = new FetchStickerPacksByIdParams(1JW.A03(new String[]{str2}));
            Bundle A05 = 1BK.A05();
            A05.putParcelable("fetchStickerPacksByIdParams", fetchStickerPacksByIdParams);
            1IB A0M = 4YU.A0M(A05, CallerContext.A06(fcv.getClass()), 4YU.A0L(fcv.A03), 1BJ.A00(92), true);
            DeK deK = new DeK(0, c7ol, fcv, A0j);
            1Kd.A0D(fcv.A04, deK, A0M);
            fcv.A00 = new 2eS(deK, A0M);
            r03.C4n(A0M, c7ol);
        }
    }
}
