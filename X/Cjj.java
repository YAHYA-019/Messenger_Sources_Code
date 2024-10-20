package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.msys.advancedcrypto.threadsettings.AdvancedCryptoThreadOpener;
import com.facebook.user.model.UserKey;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Cjj.class */
public final class Cjj implements C5xz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Cjj(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    @Override // X.C5xz
    public final void CHX(ThreadSummary threadSummary) {
        switch (this.A00) {
            case 0:
                6Im r0 = (6Im) this.A03;
                C5ym c5ym = (C5ym) 1De.A00(r0.A01, 68427);
                FbUserSession A0I = 4YU.A0I(r0);
                C5yq A00 = c5ym.A00(A0I, threadSummary, 0S2.A00);
                if (threadSummary == null || A00 == null) {
                    return;
                }
                ThreadKey threadKey = (ThreadKey) this.A02;
                String A0N = ThreadKey.A0N(threadKey);
                11T.A0A(A0N);
                UserKey A0L = ThreadKey.A0L(threadKey);
                C8i A0P = 4YV.A0P(r0);
                A0P.A08 = C5yl.A0L;
                A0P.A00 = C5yq.A0c;
                A0P.A0B = A0N;
                A0P.A05 = threadSummary;
                A0P.A04 = threadKey;
                A0P.A07 = A0L;
                A0P.A0D = true;
                r0.A05.A00((06Z) this.A01, A0I, new FRXParams(A0P));
                return;
            case 1:
                if (threadSummary != null) {
                    5Xv A02 = ((5Xu) ((C00i) this.A02).get()).A02(threadSummary);
                    View view = (BIf) this.A03;
                    1GU r02 = ((BIf) view).A02;
                    if (r02 == null) {
                        11T.A0L("androidThreadUtil");
                        throw 0Q8.createAndThrow();
                    }
                    r02.Ciz(new D8f(view, A02));
                    ((HqW) this.A01).A07.addView(view);
                    return;
                }
                return;
            case 2:
                if (threadSummary == null) {
                    threadSummary = (ThreadSummary) this.A03;
                }
                FbUserSession A04 = 7zQ.A0N().A04();
                Context context = (Context) this.A01;
                AdvancedCryptoThreadOpener advancedCryptoThreadOpener = (AdvancedCryptoThreadOpener) 1Lm.A05(context, A04, 83489);
                ImmutableList immutableList = threadSummary.A1L;
                11T.A0A(immutableList);
                ArrayList A0z = 1BL.A0z(immutableList);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    ParticipantInfo A0j = AbH.A0j(it);
                    String A002 = A0j.A00();
                    if (A002 == null) {
                        throw AnonymousClass001.A0N("userFbid must not be null");
                    }
                    1Kh A0l = AbM.A0l(A002);
                    A0l.A0t = A0j.A09.A00;
                    A0z.add(AbF.A0w(A0l));
                }
                ImmutableList A0a = 1BL.A0a(A0z);
                String str = threadSummary.A20;
                if (Platform.stringIsNullOrEmpty(str)) {
                    str = null;
                }
                advancedCryptoThreadOpener.A05(context, 5SW.A1s, A0a, str);
                ((DHc) this.A02).C3T();
                return;
            default:
                if (threadSummary != null) {
                    ((C72) 1Bu.A06((Context) this.A02, 82502)).A01(((C2050DaD) ((Fwk) this.A01)).A02, (ThreadKey) this.A03, threadSummary);
                    return;
                }
                return;
        }
    }
}
