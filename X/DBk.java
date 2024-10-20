package X;

import android.content.Context;
import com.facebook.messaging.util.launchtimeline.LaunchTimelineHelper$ProfileParam;
import kotlin.jvm.functions.Function1;

/* loaded from: DBk.class */
public final class DBk implements C00l, Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DBk(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                AcQ.A0D((Context) this.A02, (AcQ) this.A01, (String) obj, 0);
                break;
            case 1:
                CHY chy = (CHY) this.A01;
                chy.A08.A01((06Z) this.A02, new LaunchTimelineHelper$ProfileParam((String) obj, false), "timeline_interstitial");
                break;
            default:
                ((Function1) this.A02).invoke(((DKc) obj).A00.get(0));
                return null;
        }
        return 04S.A00;
    }
}
