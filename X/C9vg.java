package X;

import android.content.Context;
import com.facebook.messaging.highlightstab.immersivefeatures.plugins.immersivecardviews.localevents.HTImmersiveLocalEventsCardViewImplementation;

/* renamed from: X.9vg, reason: invalid class name */
/* loaded from: 9vg.class */
public final class C9vg implements AXr {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9vg(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AXr
    public boolean BoX(Integer num) {
        boolean z;
        Context A0B;
        String str;
        switch (this.A00) {
            case 0:
                11T.A0F(num, 0);
                int intValue = num.intValue();
                z = true;
                if (intValue == 1) {
                    A0B = 7zL.A0B(this.A01);
                    str = ((C8bz) this.A02).A04.A0O;
                    if (str == null) {
                        throw 1BK.A0h();
                    }
                    9dJ.A00(A0B, C5id.A10, str);
                    return z;
                }
                if (intValue == 0 || intValue == 2) {
                    9nF.A04(7zL.A0B(this.A01), ((C8bz) this.A02).A04, (String) null);
                    return true;
                }
                if (intValue != 3) {
                    throw 1BK.A1F();
                }
                z = false;
                return z;
            case 1:
                11T.A0F(num, 0);
                int intValue2 = num.intValue();
                z = true;
                if (intValue2 != 1) {
                    if (intValue2 != 0) {
                        if (intValue2 != 2 && intValue2 != 3) {
                            throw 1BK.A1F();
                        }
                        z = false;
                    }
                    return z;
                }
                A0B = 3vP.A00((C2k6) this.A01);
                str = ((HTImmersiveLocalEventsCardViewImplementation) this.A02).A03.A0O;
                if (str == null) {
                    throw 1BK.A0h();
                }
                9dJ.A00(A0B, C5id.A10, str);
                return z;
            default:
                z = false;
                return z;
        }
    }
}
