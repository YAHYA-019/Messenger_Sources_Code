package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.76g, reason: invalid class name */
/* loaded from: 76g.class */
public final class C76g implements 6xM {
    public C00i A00;
    public HashSet A01;
    public boolean A02;
    public final Fragment A03;
    public final 06Z A04;
    public final FbUserSession A05;
    public final ThreadKey A06;
    public final C6xN A07 = new C6xN();

    public C76g(C76f c76f) {
        Fragment fragment = c76f.A00;
        fragment.getClass();
        this.A03 = fragment;
        ThreadKey threadKey = c76f.A03;
        threadKey.getClass();
        this.A06 = threadKey;
        06Z r0 = c76f.A01;
        r0.getClass();
        this.A04 = r0;
        FbUserSession fbUserSession = c76f.A02;
        fbUserSession.getClass();
        this.A05 = fbUserSession;
        this.A01 = c76f.A04;
    }

    private void A00(6RU r302) {
        if (this.A02) {
            return;
        }
        this.A00 = 1Bn.A06(r302.A00, 7EM.class, (Class) null);
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
        return "AboveComposerBannerDeleteHandlerPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        Object obj;
        if (r305 instanceof 7AO) {
            Object obj2 = ((7AO) r305).A00;
            if (obj2 instanceof C5Sk) {
                A00(r304);
                C6xN c6xN = this.A07;
                11T.A0F(obj2, 0);
                11T.A0F(c6xN, 1);
                c6xN.A00 = obj2;
                return;
            }
        }
        if (r305 instanceof 7D3) {
            A00(r304);
            7D3 r0 = (7D3) r305;
            06Z r02 = this.A04;
            ThreadKey threadKey = this.A06;
            FbUserSession fbUserSession = this.A05;
            Fragment fragment = this.A03;
            7EM r03 = (7EM) this.A00.get();
            C5Sk c5Sk = (C5Sk) this.A07.A00;
            11T.A0F(r0, 0);
            11T.A0F(r304, 5);
            11T.A0F(r03, 6);
            11T.A0F(c5Sk, 7);
            if (r0.A00.AVC() == C5vv.A0I) {
                if (fragment instanceof 2Oh) {
                    final Fragment fragment2 = fragment;
                    r03.A00 = new DHl() { // from class: X.9yw
                        @Override // X.DHl
                        public void Bt7() {
                            Fragment.this.CfF();
                        }

                        @Override // X.DHl
                        public void C3V() {
                            Fragment.this.CfF();
                        }
                    };
                }
                String A0t = 1BK.A0t();
                11T.A0A(A0t);
                if (threadKey.A1H()) {
                    ThreadSummary A00 = 7lH.A00(threadKey, c5Sk);
                    Context context = r304.A00;
                    C1266Ac8 c1266Ac8 = (C1266Ac8) 1Br.A0B(r03.A05);
                    ThreadKey threadKey2 = A00.A0n;
                    11T.A0A(threadKey2);
                    c1266Ac8.A04(1F9.A0J, threadKey2, A0t, 8);
                    ((C1742Arc) 1Bn.A0E(context, (1BY) null, 82570)).A00(context, r02, fbUserSession, CallerContext.A0B("MessageRequestsActionHelper")).A00(A00, new Cn3(A00, r03, A0t), (2SI) null);
                    return;
                }
                ImmutableList immutableList = c5Sk.A04;
                11T.A0A(immutableList);
                ArrayList A0z = 1BL.A0z(immutableList);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    A0z.add(((C5fr) it.next()).A06);
                }
                Iterator it2 = A0z.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (!11T.A0O(obj, ((1G1) fbUserSession).A05)) {
                            break;
                        }
                    }
                }
                String str = (String) obj;
                if (str == null) {
                    str = ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL;
                }
                r03.A00(r304.A00, r02, fbUserSession, 1F9.A0Q, threadKey, "thread", A0t, str);
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
