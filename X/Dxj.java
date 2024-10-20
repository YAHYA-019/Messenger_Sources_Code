package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: Dxj.class */
public final class Dxj extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxj() {
        super("FBMessengerCallToActionButtonContainerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QO7 A0P = 4YU.A0P(r302);
        Integer num = A0P.A00;
        List list = A0P.A01;
        boolean z = A0P.A02;
        if (list.isEmpty()) {
            return null;
        }
        C1rq A01 = C1rg.A01(r302, null, 0);
        QDi qDi = new QDi(r302, new QJ6());
        QJ6 qj6 = qDi.A01;
        qj6.A03 = list;
        BitSet bitSet = qDi.A02;
        bitSet.set(3);
        qj6.A04 = z;
        bitSet.set(4);
        C1qo c1qo = qDi.A02;
        qj6.A01 = c1qo.A02(8.0f);
        bitSet.set(1);
        qj6.A00 = c1qo.A02(12.0f);
        bitSet.set(0);
        qj6.A02 = num.intValue();
        bitSet.set(2);
        A01.A2e(qDi);
        return A01.A00;
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    /* JADX WARN: Type inference failed for: r0v81, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        List emptyList;
        boolean z;
        Message message;
        QO7 qo7 = (QO7) r303;
        Integer num = null;
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        AnonymousClass651 anonymousClass651 = (AnonymousClass651) 1Bn.A0A(68057);
        FbUserSession A00 = C54z.A00(r302);
        Context context = r302.A0D;
        60P r0 = (60P) 1Lo.A04(context, A00, (1BY) null, 49926);
        List A0A = GL7.A0A(gl7);
        Boolean bool = true;
        if (A0A == null || A0A.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            boolean z2 = gl7.getBoolean(56, true);
            ArrayList A1B = AbJ.A1B(A0A);
            for (int i = 0; i < A0A.size(); i++) {
                A1B.add(FJ9.A01(r302, DKC.A0n(A0A, i), fyG));
            }
            11T.A0F(fyG, 0);
            FkT A002 = FJ3.A01(fyG).A00(FkT.class);
            int A003 = anonymousClass651.A00(context, (A002 == null || (message = A002.A01) == null) ? false : r0.A00(message));
            num = Integer.valueOf(A003);
            emptyList = A1B;
            if (z2) {
                int size = A1B.size();
                emptyList = A1B;
                if (size == 2) {
                    C1qo c1qo = r302.A0E;
                    int A02 = ((A003 - (c1qo.A02(12.0f) * 2)) / A1B.size()) - c1qo.A02(8.0f);
                    ?? obj = new Object();
                    Iterator it = A1B.iterator();
                    while (true) {
                        z = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        ((1LI) it.next()).A0c(r302, (C23P) obj, 0, 0);
                        if (obj.A01 > A02) {
                            z = true;
                            break;
                        }
                    }
                    bool = Boolean.valueOf(z);
                    emptyList = A1B;
                }
            }
        }
        qo7.A00 = num;
        qo7.A01 = emptyList;
        qo7.A02 = bool.booleanValue();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
