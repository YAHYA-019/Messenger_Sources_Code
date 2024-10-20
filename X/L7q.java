package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.dialog.MenuDialogParams;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.reactions.plugins.reactionsactionsdrawer.contextmenu.ReactionsContextMenuPresenter;
import com.facebook.messaging.reactions.plugins.reactionsactionsdrawer.themed.ThemedReactionsActionDrawerPresenter;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: L7q.class */
public final class L7q {
    public ReactionsContextMenuPresenter A00;
    public ThemedReactionsActionDrawerPresenter A01;
    public Object A02;
    public Object A03;
    public final 1YC A04 = 1YC.A03;
    public final int A05;
    public final Context A06;
    public final MenuDialogParams A07;
    public final ThreadSummary A08;
    public final 9KE A09;
    public final boolean A0A;

    public L7q(Context context, MenuDialogParams menuDialogParams, ThreadSummary threadSummary, 9KE r305, int i, boolean z) {
        this.A06 = context;
        this.A07 = menuDialogParams;
        this.A08 = threadSummary;
        this.A0A = z;
        this.A05 = i;
        this.A09 = r305;
    }

    public static boolean A00(L7q l7q) {
        boolean A00;
        Object obj;
        boolean z = true;
        if (l7q.A02 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = l7q.A04;
            String A002 = 4YT.A00(302);
            String A003 = 4YT.A00(384);
            String A004 = 4YT.A00(ActionId.RTMP_CONNECTION_INTERCEPTED);
            String A005 = 4YT.A00(ActionId.SERVICE_ON_START_COMMAND);
            r0.A0B(A002, A003, A004, A005, 4YT.A00(35), andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    if (Kbz.A00 == i) {
                        Boolean bool = Kbz.A01;
                        if (bool != null) {
                            A00 = bool.booleanValue();
                            if (A00 || !((HmW) 1Bi.A03(114701)).A00()) {
                                obj = C1Y6.A03;
                            } else {
                                l7q.A00 = new ReactionsContextMenuPresenter(l7q.A06, l7q.A07, l7q.A08, l7q.A09, l7q.A05, l7q.A0A);
                                obj = C1Y6.A02;
                            }
                            l7q.A02 = obj;
                            r0.A07(A003, A005, andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A00 = Kbz.A00(r0, atomicInteger, i);
                    if (A00) {
                    }
                    obj = C1Y6.A03;
                    l7q.A02 = obj;
                    r0.A07(A003, A005, andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    l7q.A02 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, A003, A005, andIncrement, 1BL.A1U(l7q.A02));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, A003, A005, andIncrement, 1BL.A1U(l7q.A02));
                throw th;
            }
        }
        if (l7q.A02 == C1Y6.A03) {
            z = false;
        }
        return z;
    }

    public static boolean A01(L7q l7q) {
        boolean A00;
        Object obj;
        boolean z = true;
        if (l7q.A03 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = l7q.A04;
            String A002 = 4YT.A00(303);
            String A003 = 4YT.A00(385);
            String A004 = 4YT.A00(ActionId.RTMP_CONNECTION_INTERCEPTED);
            String A005 = 4YT.A00(ActionId.SERVICE_ON_START_COMMAND);
            r0.A0B(A002, A003, A004, A005, 4YT.A00(35), andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    if (Kbz.A00 == i) {
                        Boolean bool = Kbz.A01;
                        if (bool != null) {
                            A00 = bool.booleanValue();
                            if (A00 || !(!((HmW) 1Bi.A03(114701)).A00())) {
                                obj = C1Y6.A03;
                            } else {
                                l7q.A01 = new ThemedReactionsActionDrawerPresenter(l7q.A06, l7q.A07, l7q.A08, l7q.A09);
                                obj = C1Y6.A02;
                            }
                            l7q.A03 = obj;
                            r0.A07(A003, A005, andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A00 = Kbz.A00(r0, atomicInteger, i);
                    if (A00) {
                    }
                    obj = C1Y6.A03;
                    l7q.A03 = obj;
                    r0.A07(A003, A005, andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    l7q.A03 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, A003, A005, andIncrement, 1BL.A1U(l7q.A03));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, A003, A005, andIncrement, 1BL.A1U(l7q.A03));
                throw th;
            }
        }
        if (l7q.A03 == C1Y6.A03) {
            z = false;
        }
        return z;
    }
}
