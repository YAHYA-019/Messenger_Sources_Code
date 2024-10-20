package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.safetywarning.BlockedParticipantAddedDialogFragment;
import java.util.Iterator;

/* loaded from: JC9.class */
public final class JC9 extends C17m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JC9(I2V i2v, final Object obj, int i) {
        new 0G2(obj) { // from class: X.17m
            public Object A00;

            {
                this.A00 = obj;
            }

            public abstract void A01(Object obj2, Object obj3, C06z c06z);

            public Object BIk(Object obj2, C06z c06z) {
                return this.A00;
            }

            public void Cvy(Object obj2, Object obj3, C06z c06z) {
                11T.A0F(c06z, 1);
                Object obj4 = this.A00;
                this.A00 = obj3;
                A01(obj4, obj3, c06z);
            }

            public String toString() {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("ObservableProperty(value=");
                return AnonymousClass002.A0K(this.A00, A0k);
            }
        };
        this.A00 = i;
        this.A01 = i2v;
    }

    @Override // X.C17m
    public void A01(Object obj, Object obj2, C06z c06z) {
        int i = this.A00;
        boolean A1V = AnonymousClass001.A1V(obj2);
        boolean A1V2 = AnonymousClass001.A1V(obj);
        if (2 - i != 0) {
            if (A1V2 != A1V) {
                I2V i2v = (I2V) this.A01;
                ((2JN) 4YU.A0n(i2v.A00, i2v.A01, 33088)).A04(HAp.A0N);
                Iterator it = i2v.A02.iterator();
                while (it.hasNext()) {
                    GrS grS = ((HVX) it.next()).A00;
                    if (((I2V) 1Br.A0B(grS.A0m)).A00()) {
                        Hke A00 = GrS.A00(grS);
                        A00.A03 = 9;
                        grS.A0Z(new IYw(A00));
                    } else {
                        GrS.A09(grS);
                    }
                }
                return;
            }
            return;
        }
        if (A1V2 != A1V) {
            I2V i2v2 = (I2V) this.A01;
            ((2JN) 4YU.A0n(i2v2.A00, i2v2.A01, 33088)).A04(HAp.A0N);
            Iterator it2 = i2v2.A02.iterator();
            while (it2.hasNext()) {
                GrS grS2 = ((HVX) it2.next()).A00;
                I2V i2v3 = (I2V) 1Br.A0B(grS2.A0m);
                if (AnonymousClass001.A1V(i2v3.A03.BIk(i2v3, I2V.A06[2]))) {
                    CEI cei = (CEI) 1Br.A0B(grS2.A0l);
                    FbUserSession fbUserSession = grS2.A06;
                    Bundle A09 = AbN.A09(fbUserSession);
                    0D2 blockedParticipantAddedDialogFragment = new BlockedParticipantAddedDialogFragment();
                    blockedParticipantAddedDialogFragment.setArguments(A09);
                    cei.A00 = blockedParticipantAddedDialogFragment;
                    blockedParticipantAddedDialogFragment.A00 = new CpF(fbUserSession, cei);
                    IZI izi = (JOJ) 4YU.A0o(fbUserSession, cei.A01, 83902);
                    AbN.A0X(izi).A04(izi.A01, "SAFETY_WARNING_ELIGIBLE_PARTICIPANT_ADDED_DIALOG_SHOWN", "CALL_UI");
                    ((HuL) 1Br.A0B(cei.A02)).A01(blockedParticipantAddedDialogFragment, "BlockedParticipantAddedDialogFragment");
                }
            }
        }
    }
}
