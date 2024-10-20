package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.writewithai.fragment.WriteWithAiDialogFragment;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.86d, reason: invalid class name */
/* loaded from: 86d.class */
public final class C86d implements 6xM {
    public C00i A00;
    public C00i A01;
    public HashSet A02;
    public boolean A03;
    public final FbUserSession A04;
    public final ThreadKey A05;
    public final 6wV A06;
    public final 2Og A07;
    public final Function1 A08;

    public C86d(FbUserSession fbUserSession, ThreadKey threadKey, 6wV r304, 2Og r305, Function1 function1) {
        this.A05 = threadKey;
        this.A07 = r305;
        function1.getClass();
        this.A08 = function1;
        this.A06 = r304;
        this.A04 = fbUserSession;
        this.A02 = null;
    }

    private void A00(6RU r302) {
        if (this.A03) {
            return;
        }
        Context context = r302.A00;
        this.A00 = 1Bn.A06(context, C9ks.class, (Class) null);
        this.A01 = 1Bn.A06(context, 6qL.class, (Class) null);
        this.A03 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A02;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{A5y.class, 7B2.class, 7Ae.class, A5t.class});
            this.A02 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "WriteWithAiPlugin";
    }

    /* JADX WARN: Type inference failed for: r0v101, types: [com.facebook.messaging.msys.thread.writewithai.fragment.WriteWithAiDialogFragment, androidx.fragment.app.Fragment] */
    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        C78d c78d;
        AZT c9wr;
        if (r305 instanceof A5t) {
            A00(r304);
            2Og r0 = this.A07;
            A5t a5t = (A5t) r305;
            C9ks c9ks = (C9ks) this.A00.get();
            ThreadKey threadKey = this.A05;
            1BL.A1F(a5t, c9ks);
            boolean z = a5t.A01;
            if (z) {
                C95n c95n = a5t.A02 ? C95n.A04 : C95n.A02;
                06Z BdK = r0.BdK();
                if (BdK != null) {
                    9Cr.A00(BdK, threadKey, c95n, (User) null, a5t.A00);
                }
            }
            c9ks.A02(threadKey, z, a5t.A02);
            return;
        }
        if (r305 instanceof 7B2) {
            A00(r304);
            final FbUserSession fbUserSession = this.A04;
            final Function1 function1 = this.A08;
            6wV r02 = this.A06;
            7B2 r03 = (7B2) r305;
            11T.A0F(r304, 0);
            11T.A0F(r03, 4);
            Object obj = r03.A00;
            if (obj instanceof WriteWithAiDialogFragment) {
                ?? r04 = (WriteWithAiDialogFragment) obj;
                if (7zS.A0u((Fragment) r04) == C95n.A03) {
                    final Context context = r304.A00;
                    c9wr = new AZT(context, fbUserSession, function1) { // from class: X.9wq
                        public C00m A00 = AND.A00;
                        public final Context A01;
                        public final FbUserSession A02;
                        public final Function1 A03;

                        {
                            this.A01 = context;
                            this.A02 = fbUserSession;
                            this.A03 = function1;
                        }

                        /* JADX WARN: Type inference failed for: r0v12, types: [X.5fq, X.5qu] */
                        @Override // X.AZT
                        public void BLZ(View view, User user, String str, boolean z2) {
                            11T.A0F(str, 0);
                            Context context2 = this.A01;
                            FbUserSession fbUserSession2 = this.A02;
                            Function1 function12 = this.A03;
                            if (user != null && view != null) {
                                ?? c5fq = new C5fq();
                                c5fq.A02 = str;
                                c5fq.A04("");
                                5gC r05 = new 5gC((C5qu) c5fq);
                                1Kd.A0F(new FwC(0, context2, view, user, r05, function12), ((CNa) 1Bn.A0E(context2, (1BY) null, 82461)).A03(fbUserSession2, user, false), 7zQ.A15());
                            }
                            this.A00.invoke();
                        }

                        @Override // X.AZT
                        public void Crt(C00m c00m) {
                            this.A00 = c00m;
                        }
                    };
                } else {
                    c9wr = new C9wr(r02);
                }
                AZT azt = c9wr;
                11T.A0F(azt, 0);
                r04.A03 = azt;
                azt.Crt(new AKO(r304, 3));
                return;
            }
            return;
        }
        if (r305 instanceof 7Ae) {
            A00(r304);
            6wV r05 = this.A06;
            ThreadKey threadKey2 = this.A05;
            6qL r06 = (6qL) this.A01.get();
            C78d c78d2 = (C78d) c77n.AUP(C78d.class);
            7zR.A1O(r06, c78d2);
            String obj2 = r05.getText().toString();
            7Sg[] A1a = 7zT.A1a(r05.getText());
            11T.A0F(obj2, 1);
            int length = A1a.length;
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    7Sg r07 = A1a[i];
                    if (r07.A00 == C6qi.A03 || r07.A00 == C6qi.A02) {
                        break;
                    } else {
                        i++;
                    }
                } else if (!threadKey2.A0y() && ((6qR) 1Br.A0B(r06.A01)).A01(threadKey2)) {
                    z2 = 6qL.A00(r06, obj2);
                }
            }
            c78d = new C78d(z2, c78d2.A00);
        } else {
            if (!(r305 instanceof A5y)) {
                return;
            }
            A00(r304);
            C78d c78d3 = (C78d) c77n.AUP(C78d.class);
            11T.A0F(c78d3, 0);
            c78d = new C78d(c78d3.A01, true);
        }
        c77n.ClL(c78d);
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(r303);
    }
}
