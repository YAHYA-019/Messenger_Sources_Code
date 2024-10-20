package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.76o, reason: invalid class name */
/* loaded from: 76o.class */
public final class C76o implements 6xM {
    public C00i A00;
    public HashSet A01;
    public boolean A02;
    public final 06Z A03;
    public final ThreadKey A04;
    public final C6xN A05 = new C6xN();

    public C76o(C76n c76n) {
        ThreadKey threadKey = c76n.A01;
        threadKey.getClass();
        this.A04 = threadKey;
        06Z r0 = c76n.A00;
        r0.getClass();
        this.A03 = r0;
        this.A01 = c76n.A02;
    }

    private void A00(6RU r302) {
        if (this.A02) {
            return;
        }
        this.A00 = 1Bn.A06(r302.A00, 6In.class, (Class) null);
        this.A02 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A01;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7AO.class, 7D3.class));
            this.A01 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AboveComposerBannerReportHandlerPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7AO) {
            Object obj = ((7AO) r305).A00;
            if (obj instanceof C5Sk) {
                A00(r304);
                C6xN c6xN = this.A05;
                11T.A0F(obj, 0);
                11T.A0F(c6xN, 1);
                c6xN.A00 = obj;
                return;
            }
        }
        if (r305 instanceof 7D3) {
            A00(r304);
            7D3 r0 = (7D3) r305;
            06Z r02 = this.A03;
            ThreadKey threadKey = this.A04;
            6In r03 = (6In) this.A00.get();
            C5Sk c5Sk = (C5Sk) this.A05.A00;
            11T.A0F(r0, 0);
            11T.A0F(r03, 3);
            11T.A0F(c5Sk, 4);
            if (r0.A00.AVC() == C5vv.A0v) {
                boolean A0q = ThreadKey.A0q(threadKey);
                ThreadSummary A00 = 7lH.A00(threadKey, c5Sk);
                C5yl c5yl = C5yl.A03;
                if (A0q) {
                    r03.Czv(r02, A00, c5yl);
                } else {
                    r03.Czm(r02, A00, c5yl);
                }
            }
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(r303);
    }
}
