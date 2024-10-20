package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Hyn.class */
public final class Hyn {
    public Object A00;
    public final 1YC A01 = 1YC.A03;
    public final Integer A02;
    public final Context A03;

    public Hyn(Context context, Integer num) {
        this.A03 = context;
        this.A02 = num;
    }

    public static boolean A00(Hyn hyn) {
        boolean booleanValue;
        if (hyn.A00 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = hyn.A01;
            r0.A0B("com.facebook.messaging.reactions.plugins.customreactions.trayactionbutton.OverreactTrayActionButton", "messaging.reactions.customreactions.trayactionbutton.OverreactTrayActionButton", "com.facebook.messaging.reactions.plugins.interfaces.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", "com.facebook.messaging.reactions.plugins.customreactions.CustomReactionsKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    int i2 = HEW.A00;
                    if (i2 == i) {
                        Boolean bool = HEW.A01;
                        if (bool != null) {
                            booleanValue = bool.booleanValue();
                            Object obj = (booleanValue || !((6qV) 1Bi.A03(67661)).A00()) ? C1Y6.A03 : C1Y6.A02;
                            hyn.A00 = obj;
                            r0.A07("messaging.reactions.customreactions.trayactionbutton.OverreactTrayActionButton", "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    if (HEW.A01 == null || i2 != i) {
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        r0.A05("com.facebook.messaging.reactions.plugins.customreactions.CustomReactionsKillSwitch", "messaging.reactions.customreactions.CustomReactionsKillSwitch", andIncrement2);
                        Exception e = null;
                        try {
                            try {
                                Boolean valueOf = Boolean.valueOf(((6qV) 1Bi.A03(67661)).A00());
                                HEW.A01 = valueOf;
                                HEW.A00 = i;
                                r0.A01(valueOf, (Exception) null, "messaging.reactions.customreactions.CustomReactionsKillSwitch", andIncrement2);
                            } catch (Exception e2) {
                                e = e2;
                                throw e;
                            }
                        } catch (Throwable th) {
                            r0.A01(HEW.A01, e, "messaging.reactions.customreactions.CustomReactionsKillSwitch", andIncrement2);
                            throw th;
                        }
                    }
                    booleanValue = HEW.A01.booleanValue();
                    if (booleanValue) {
                    }
                    hyn.A00 = obj;
                    r0.A07("messaging.reactions.customreactions.trayactionbutton.OverreactTrayActionButton", "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e3) {
                    hyn.A00 = C1Y6.A03;
                    try {
                        throw e3;
                    } catch (Throwable th2) {
                        th = th2;
                        exc = e3;
                        r0.A03(exc, "messaging.reactions.customreactions.trayactionbutton.OverreactTrayActionButton", "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", andIncrement, 1BL.A1U(hyn.A00));
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r0.A03(exc, "messaging.reactions.customreactions.trayactionbutton.OverreactTrayActionButton", "messaging.reactions.trayactionbutton.ReactionsTrayActionButtonInterfaceSpec", andIncrement, 1BL.A1U(hyn.A00));
                throw th;
            }
        }
        return 1BK.A1U(hyn.A00);
    }
}
