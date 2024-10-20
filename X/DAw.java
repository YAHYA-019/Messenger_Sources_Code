package X;

import android.database.Cursor;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: DAw.class */
public final class DAw implements Callable {
    public final int A00;
    public final Object A01;

    public DAw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        switch (this.A00) {
            case 0:
                Object obj = null;
                try {
                    OperationResult operationResult = (OperationResult) AbK.A0H(1BK.A05(), (CallerContext) null, 4YU.A0L(((BoB) this.A01).A01), 1BJ.A00(ActionId.NOTIFY_SUBSCRIBERS)).get();
                    if (operationResult != null) {
                        obj = operationResult.A07();
                    }
                } catch (Exception unused) {
                }
                return obj;
            case 1:
                2Tz r0 = (2Tz) ((C3R3) this.A01).A04.get();
                2To r02 = 2To.A0A;
                2U0 r03 = (2U0) 1Br.A0B(r0.A00);
                AbG.A0B(r03.A00).AAr(1BJ.A00(293));
                return 2U0.A02(r02, r03, String.valueOf(20)).A00;
            default:
                CbL cbL = (CbL) this.A01;
                C4yz c4yz = cbL.A03;
                ArrayList A0s = AnonymousClass001.A0s();
                Cursor A07 = ((C7d2) c4yz.A0C.get()).A07(C10654u8.A00(c4yz.A0B), "group_thread_offline_threading_id!=? AND optimistic_group_state!=?", "timestamp_ms", CkD.A05, new String[]{"null", Integer.toString(AnonymousClass214.A03.dbValue)});
                if (A07 != null) {
                    CkD A08 = c4yz.A03.A08(A07, (String) null);
                    while (true) {
                        try {
                            ThreadSummary BfR = A08.BfR();
                            if (BfR != null) {
                                A0s.add(BfR);
                            } else {
                                A08.close();
                            }
                        } catch (Throwable th) {
                            try {
                                A08.close();
                                throw th;
                            } catch (Throwable th2) {
                                7kF.A00(th, th2);
                                throw th;
                            }
                        }
                    }
                }
                if (A0s.isEmpty()) {
                    return A0s;
                }
                long now = cbL.A05.now() - 604800000;
                ArrayList A0s2 = AnonymousClass001.A0s();
                ArrayList A0s3 = AnonymousClass001.A0s();
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    ThreadSummary A0j = AbF.A0j(it);
                    if (A0j.A0N < now) {
                        A0s3.add(A0j);
                    } else {
                        A0s2.add(A0j);
                    }
                }
                if (A0s3.isEmpty()) {
                    CbL.A00(cbL, A0s3);
                    return A0s2;
                }
                CbL.A00(cbL, A0s);
                return Collections.emptyList();
        }
    }
}
