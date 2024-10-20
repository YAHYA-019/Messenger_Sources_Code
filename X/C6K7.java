package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* renamed from: X.6K7, reason: invalid class name */
/* loaded from: 6K7.class */
public final class C6K7 {
    public final 6K8 A00 = (6K8) 1Bn.A0A(67938);
    public final 6K3 A01;

    public C6K7() {
        final int i = 0;
        this.A01 = new 6K3(this, i) { // from class: X.858
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = this;
            }

            public /* bridge */ /* synthetic */ void C6n(Object obj) {
                ThreadKey threadKey;
                6Ay BCm;
                ImmutableList BDF;
                switch (this.A00) {
                    case 0:
                        Message message = (Message) obj;
                        if (message != null) {
                            C6K7 c6k7 = (C6K7) this.A01;
                            Context A00 = FbInjector.A00();
                            11T.A0A(A00);
                            Set<C6K9> A04 = 1Hv.A04(A00, ActionId.VIEW_DID_APPEAR_BEGIN);
                            11T.A0A(A04);
                            for (C6K9 c6k9 : A04) {
                                if (c6k9.Cy0(message)) {
                                    c6k9.Bbm(message);
                                }
                            }
                            6K8 r0 = c6k7.A00;
                            if (r0.Cy0(message)) {
                                r0.Bbm(message);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Message message2 = (Message) obj;
                        if (message2 != null) {
                            6K4 r02 = (6K4) this.A01;
                            ThreadKey threadKey2 = r02.A00;
                            if (threadKey2 == null || ((threadKey = message2.A0V) != null && !threadKey2.equals(threadKey))) {
                                r02.A06.clear();
                                r02.A00 = message2.A0V;
                            }
                            if (C1q7.A0R(message2) || "GAME".equals(62Z.A01(message2))) {
                                r02.A06.add(message2);
                            }
                            Handler handler = r02.A02;
                            handler.removeCallbacksAndMessages(null);
                            handler.postDelayed(r02.A05, 500L);
                            return;
                        }
                        return;
                    case 2:
                        Message message3 = (Message) obj;
                        if (message3 != null) {
                            FbUserSession A042 = 1Fw.A04((1EZ) 1Bn.A0A(16428));
                            6KB r03 = (6KB) this.A01;
                            if (message3.A1V != null) {
                                ThreadKey threadKey3 = message3.A0V;
                                String valueOf = threadKey3 != null ? String.valueOf(threadKey3.A0r()) : null;
                                r03.A01.A00.get();
                                if (2pJ.A00(valueOf)) {
                                    4YV.A11(r03.A00).execute(new AGt(A042, message3, r03, valueOf));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        Message message4 = (Message) obj;
                        11T.A0F(message4, 0);
                        5Pm r04 = message4.A08;
                        if (r04 == null || (BCm = r04.BCm()) == null || (BDF = BCm.BDF()) == null || BDF.isEmpty()) {
                            return;
                        }
                        6KA r05 = (6KA) this.A01;
                        1Du it = BDF.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            ImmutableMap immutableMap = r05.A01;
                            if (immutableMap.containsKey(next)) {
                                C00i c00i = (C00i) immutableMap.get(next);
                                if (c00i != null) {
                                    c00i.get();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        ImmutableList immutableList = C1q7.A07;
                        C1q8 c1q8 = C1q8.A0A;
                        return;
                }
            }
        };
    }
}
