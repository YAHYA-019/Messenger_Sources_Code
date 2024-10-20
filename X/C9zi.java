package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.pausechat.fragment.PauseReasonController;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.translation.nux.bottomsheetnux.TranslationNuxFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9zi, reason: invalid class name */
/* loaded from: 9zi.class */
public final class C9zi implements C5xv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9zi(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.C5xv
    public final void CSR() {
        DLQ dlq;
        GJj gJj;
        switch (this.A00) {
            case 0:
                8JZ r0 = ((Dq1) this.A02).A00;
                dlq = r0.A00;
                gJj = r0.A01;
                break;
            case 1:
                8Ld r02 = (8Ld) this.A02;
                dlq = (DLQ) r02.A02;
                gJj = (GJj) r02.A03;
                break;
            case 2:
                AlU alU = (AlU) this.A02;
                int i = alU.A00;
                AbstractList abstractList = (AbstractList) this.A01;
                if (i < abstractList.size()) {
                    CQ4 cq4 = (CQ4) 1Br.A0B(alU.A0Y);
                    List subList = abstractList.subList(alU.A00, abstractList.size());
                    11T.A0A(subList);
                    ArrayList A0z = 1BL.A0z(subList);
                    Iterator it = subList.iterator();
                    while (it.hasNext()) {
                        A0z.add(((D55) it.next()).A04.A13);
                    }
                    cq4.A09(A0z, alU.A00);
                }
                AlU.A08(alU);
                return;
            case 3:
                8gX r03 = (8gX) this.A02;
                PauseReasonController pauseReasonController = r03.A00;
                Object obj = ((C2lh) this.A01).A02;
                11T.A0F(obj, 0);
                Function1 function1 = pauseReasonController.A00;
                if (function1 != null) {
                    function1.invoke(obj);
                }
                r03.A03.invoke();
                return;
            case 4:
                9XA r04 = ((8XA) this.A02).A00;
                7zL.A1L(((C2sn) this.A01).A00);
                r04.A00();
                return;
            default:
                TranslationNuxFragment translationNuxFragment = (TranslationNuxFragment) this.A02;
                translationNuxFragment.A0o();
                94S r05 = MigBottomSheetDialogFragment.A01;
                ThreadKey threadKey = translationNuxFragment.A01;
                if (threadKey != null) {
                    9cS r06 = (9cS) this.A01;
                    FbUserSession fbUserSession = translationNuxFragment.A00;
                    if (fbUserSession == null) {
                        7zL.A1C();
                        throw 0Q8.createAndThrow();
                    }
                    r06.A00(fbUserSession, threadKey, 0S2.A03);
                    return;
                }
                return;
        }
        DKM dkm = new DKM();
        FyG fyG = (FyG) this.A01;
        dkm.A0H(fyG);
        FAv.A01(dlq, fyG, new DKc(dkm.A00), gJj);
    }
}
