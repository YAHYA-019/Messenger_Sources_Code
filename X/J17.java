package X;

import android.util.LongSparseArray;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: J17.class */
public final class J17 implements Runnable {
    public static final String __redex_internal_original_name = "RtcExpressionCircularEffectsAdapter$recordEffectTappedEvent$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ EffectItem A01;
    public final /* synthetic */ GWo A02;

    public J17(FbUserSession fbUserSession, EffectItem effectItem, GWo gWo) {
        this.A00 = fbUserSession;
        this.A02 = gWo;
        this.A01 = effectItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FbUserSession fbUserSession = this.A00;
        GWo gWo = this.A02;
        IPz iPz = (IPz) 1Lm.A05(gWo.A05, fbUserSession, 114831);
        I88 i88 = (I88) 1Br.A0B(gWo.A0C);
        EffectItem effectItem = this.A01;
        long A03 = effectItem.A03();
        boolean A0D = iPz.A0D(effectItem);
        if (AbstractC2326GOr.A1V()) {
            return;
        }
        LongSparseArray longSparseArray = i88.A00;
        Number number = (Number) longSparseArray.get(A03);
        if (number == null) {
            number = 1BK.A0j(Long.valueOf(A03));
            longSparseArray.put(A03, number);
        }
        int intValue = number.intValue();
        I88.A00(i88, 51970050, intValue, A03);
        int i = 51970055;
        if (A0D) {
            i = 51970054;
        }
        I88.A00(i88, i, intValue, A03);
    }
}
