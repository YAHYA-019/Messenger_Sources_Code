package com.facebook.messaging.memories.list;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Lm;
import X.1Lo;
import X.1Um;
import X.1pI;
import X.1pQ;
import X.1vD;
import X.2MX;
import X.2Op;
import X.2Ov;
import X.2UF;
import X.4YU;
import X.7zL;
import X.7zN;
import X.7zQ;
import X.9OD;
import X.9Tk;
import X.9Yf;
import X.9kY;
import X.A1e;
import X.A1f;
import X.C8yp;
import X.C8yq;
import X.C9fu;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: MemoriesListFragment.class */
public final class MemoriesListFragment extends 2Ov implements 2Op {
    public LithoView A00;
    public C9fu A01;
    public 2MX A02;
    public FbUserSession A03;
    public 1pI A04;
    public final 1Br A05 = 7zN.A0I(this);
    public final 9kY A06 = (9kY) 1Bn.A0A(68208);

    public void CpV(2MX r302) {
        this.A02 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1572365952);
        super.onCreate(bundle);
        this.A03 = 1BM.A01(this);
        0FI.A08(-548009607, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1467884422);
        11T.A0F(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(2132542538, viewGroup, false);
        this.A00 = 7zL.A0b(inflate, 2131365574);
        0FI.A08(1011346460, A02);
        return inflate;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(1676703608);
        super.onDestroyView();
        9kY r0 = this.A06;
        FbUserSession fbUserSession = this.A03;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        C8yp c8yp = r0.A00;
        if (c8yp != null) {
            c8yp.D5r();
        }
        9Tk r02 = (9Tk) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 68207);
        C8yq c8yq = r02.A00;
        if (c8yq != null) {
            c8yq.D5r();
        }
        r02.A01 = false;
        r0.A01 = false;
        this.A00 = null;
        0FI.A08(1606804823, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = 1vD.A00(view);
        FbUserSession fbUserSession = this.A03;
        String str = "fbUserSession";
        if (fbUserSession != null) {
            MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04(4YU.A08(view), fbUserSession, (1BY) null, 67249);
            1Um A0O = 1BK.A0O(mailboxFeature, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            1Um.A02(A0O, A1f.A00(mailboxFeature, A0P, 26), A0P, false);
            9kY r0 = this.A06;
            Context context = getContext();
            if (context == null) {
                throw 1BK.A0h();
            }
            FbUserSession fbUserSession2 = this.A03;
            if (fbUserSession2 != null) {
                9OD r02 = new 9OD(view, this);
                if (!r0.A01) {
                    r0.A01 = true;
                    9Tk r03 = (9Tk) 1Lo.A08(fbUserSession2, 68207);
                    9Yf r04 = new 9Yf(fbUserSession2, r02, r0);
                    FbUserSession fbUserSession3 = r03.A02;
                    1Br A01 = 1Lm.A01(fbUserSession3, 67249);
                    1Br A00 = 1Lm.A00(context, fbUserSession3, 33148);
                    if (!1pQ.A00((1pQ) 1Br.A0B(r03.A03)).AZk(2342167604926500675L)) {
                        r04.A00();
                    } else if (!r03.A01) {
                        C8yq c8yq = r03.A00;
                        if (c8yq != null) {
                            c8yq.D5r();
                        }
                        r03.A01 = false;
                        2UF r05 = (2UF) 1Br.A0B(A01);
                        1Um A0O2 = 1BK.A0O(r05, 0);
                        MailboxFutureImpl A0P2 = 1BK.A0P(A0O2);
                        1Um.A02(A0O2, new A1e(new C8yq(r05, A0O2), r05, A0P2, 27), A0P2, false);
                        A0P2.addResultCallback(new A1e(A00, r04, r03, 40));
                    }
                }
                1pI r06 = this.A04;
                if (r06 != null) {
                    this.A01 = new C9fu(view, r06, this.A02, 7zQ.A0m(this.A05));
                    return;
                }
                str = "contentViewManager";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
