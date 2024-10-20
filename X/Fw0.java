package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.wellbeing.ixt.MessengerIXTActivity;

/* loaded from: Fw0.class */
public final class Fw0 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Fw0(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    public void onFailure(Throwable th) {
        String str;
        if (this.A00 == 0) {
            ((Etz) this.A02).A00();
            0fH.A0r("MSGBloksAsyncActionImplementation", "Failed to initFetch bloks payload from server", th);
            CCq.A00(EQc.A04, (CCq) this.A03);
            return;
        }
        3sU r0 = (3sU) this.A01;
        1BK.A0U(r0.A07).markerEnd(238958771, (short) 3);
        C01s A09 = 1BK.A09(r0.A08);
        switch (AnonymousClass001.A03(this.A02)) {
            case 0:
                str = "NETWORK_ONLY";
                break;
            case 1:
                str = "CACHE_ONLY";
                break;
            default:
                str = "FULLY_CACHED";
                break;
        }
        A09.D0y(AbstractC00603o4.A00(24), 0Pz.A0W("Error fetching ZeroRatingUI with cache policy: ", str), 1000, th);
        ((1FX) this.A03).setException(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        Object obj2;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        if (this.A00 != 0) {
            1BK.A0U(((3sU) this.A01).A07).markerEnd(238958771, (short) 2);
            ((1FX) this.A03).set(abstractC08294mh.A03);
            return;
        }
        El6 el6 = (El6) this.A01;
        if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null) {
            str = "Bloks payload is null in GraphQL response";
        } else {
            EoK A01 = FGD.A01((2JX) obj2, (50G) el6.A01.get());
            if (A01 != null) {
                CCq.A00(EQc.A03, (CCq) this.A03);
                Context context = el6.A00;
                ((Etz) this.A02).A01 = A01;
                11T.A0F(context, 0);
                Intent A0D = C3o5.A0D(context, MessengerIXTActivity.class);
                A0D.addFlags(268435456);
                0LS.A0A(context, A0D);
                return;
            }
            str = "Failed to parse bloks action";
        }
        0fH.A0k("IXTTriggerMQTTHandler", str);
        ((Etz) this.A02).A00();
        CCq.A00(EQc.A06, (CCq) this.A03);
    }
}
