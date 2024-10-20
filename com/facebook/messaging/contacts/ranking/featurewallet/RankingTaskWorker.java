package com.facebook.messaging.contacts.ranking.featurewallet;

import X.0Pz;
import X.0S2;
import X.0fH;
import X.1BJ;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1G1;
import X.1Lo;
import X.4IU;
import X.7US;
import X.AnonymousClass001;
import X.C1gb;
import X.C1iw;
import X.C4Kq;
import X.C4Kr;
import X.C4P3;
import X.Hst;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.msys.mci.Execution;

/* loaded from: RankingTaskWorker.class */
public class RankingTaskWorker extends Worker {
    public final Context A00;

    public RankingTaskWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = context;
    }

    private void A00(Integer num) {
        String str;
        4IU A00 = 4IU.A00(this.mAppContext);
        String A002 = 1BJ.A00(846);
        switch (num.intValue()) {
            case 0:
                str = "UNDEFINED";
                break;
            case 1:
                str = "CONTACT_SEARCH_NULL_STATE";
                break;
            case 2:
                str = "CONTACT_SEARCH_KEY_PRESS";
                break;
            case 3:
                str = "ARMADILLO_SEARCH_KEY_PRESS";
                break;
            default:
                str = "ACTIVE_NOW";
                break;
        }
        A00.A03(0Pz.A0W(A002, str));
    }

    @Override // androidx.work.Worker
    public C4Kr doWork() {
        Integer num;
        String str;
        String str2;
        String A02 = this.mWorkerParams.A02.A02(1BJ.A00(222));
        if (A02 == null) {
            0fH.A0n("OdmlTaskRankingTaskWorker", "Score type is empty!");
            return new C4Kq();
        }
        if (A02.equals("UNDEFINED")) {
            num = 0S2.A00;
        } else if (A02.equals("CONTACT_SEARCH_NULL_STATE")) {
            num = 0S2.A01;
        } else if (A02.equals("CONTACT_SEARCH_KEY_PRESS")) {
            num = 0S2.A0C;
        } else if (A02.equals("ARMADILLO_SEARCH_KEY_PRESS")) {
            num = 0S2.A0N;
        } else {
            if (!A02.equals("ACTIVE_NOW")) {
                throw AnonymousClass001.A0L(A02);
            }
            num = 0S2.A0Y;
        }
        1G1 A0F = 1BL.A0F();
        String str3 = A0F.A02;
        String A022 = this.mWorkerParams.A02.A02("user_id");
        if (A022 == null || !A022.equals(str3)) {
            A00(num);
            str = "OdmlTaskRankingTaskWorker";
            str2 = "Cancelling current task due to changed user";
        } else {
            if (((C1gb) 1Bi.A03(66630)).A0C()) {
                0fH.A0l("OdmlTaskRankingTaskWorker", "Calling MessengerMantleManager getAndInitializeMantle().");
                Context context = this.A00;
                ((7US) 1Lo.A04(context, A0F, (1BY) null, 67830)).A00();
                Hst hst = (Hst) 1Bn.A0E(context, (1BY) null, 115430);
                0fH.A0l("OdmlTaskRankingTaskWorker", "Calling initPpml");
                synchronized (this) {
                    hst.A00();
                    0fH.A0l("OdmlTaskPpmlInitializer", "Notifying inbox load complete");
                    C1iw c1iw = hst.A09;
                    Execution.initialize();
                    Execution.executePossiblySync(c1iw, null, 1);
                    hst.A01(num);
                }
                return new C4P3();
            }
            A00(num);
            str = "OdmlTaskRankingTaskWorker";
            str2 = "Cancelling current task due to changed gating";
        }
        0fH.A0l(str, str2);
        return new C4P3();
    }
}
