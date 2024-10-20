package X;

import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.MontageBucketInfo;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: D5u.class */
public final /* synthetic */ class D5u implements Runnable {
    public static final String __redex_internal_original_name = "MontageOmnistoreCacheExpirationCoordinator$$ExternalSyntheticLambda0";
    public final /* synthetic */ ByE A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v170, types: [java.lang.Object, X.C7z] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.4dd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r312v1 */
    /* JADX WARN: Type inference failed for: r312v13, types: [java.lang.Object, com.facebook.messaging.model.messages.Message] */
    /* JADX WARN: Type inference failed for: r312v5, types: [X.2j0] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        Throwable th2;
        ByE byE = this.A00;
        String str = byE.A01;
        0fH.A0n(str, "removing expired stories");
        6uX r0 = byE.A06;
        C00i c00i = r0.A03;
        ACc A0T = 4YV.A0T(c00i);
        try {
            try {
                0WH A07 = AbI.A07();
                java.util.Map map = r0.A05;
                Iterator A1A = 1BK.A1A(map);
                while (A1A.hasNext()) {
                    th = 4YU.A0V(A1A);
                    if (((60V) r0.A04.get()).A0G((Message) th)) {
                        A07.add((Object) th);
                    }
                }
                if (A0T != null) {
                    A0T.close();
                }
                1Hz A10 = AbF.A10();
                if (A07.isEmpty()) {
                    return;
                }
                Iterator it = A07.iterator();
                while (it.hasNext()) {
                    ThreadKey threadKey = 4YU.A0V(it).A0V;
                    if (threadKey != null) {
                        A10.A05(AbF.A14(threadKey));
                    }
                }
                1Hz A102 = AbF.A10();
                1Du it2 = A10.A07().iterator();
                while (it2.hasNext()) {
                    BuZ A04 = r0.A04(AnonymousClass001.A05(it2.next()));
                    if (A04 != null) {
                        MontageBucketInfo montageBucketInfo = A04.A01;
                        ImmutableList A00 = D3Y.A00(byE.A08, montageBucketInfo.A02, 10);
                        11T.A0A(A00);
                        C5b0 c5b0 = new C5b0(montageBucketInfo);
                        c5b0.A02 = A00;
                        MontageBucketInfo montageBucketInfo2 = new MontageBucketInfo(c5b0);
                        ?? obj = new Object();
                        obj.A01(A04);
                        obj.A01 = montageBucketInfo2;
                        A102.A05(obj.A00());
                    }
                }
                1Du it3 = A102.A07().iterator();
                while (it3.hasNext()) {
                    BuZ buZ = (BuZ) it3.next();
                    if (C4V8.A01(buZ.A01.A02).isEmpty()) {
                        r0.A06(buZ.A00);
                    } else {
                        r0.A08(buZ);
                    }
                }
                Iterator it4 = A07.iterator();
                while (it4.hasNext()) {
                    String str2 = 4YU.A0V(it4).A1V;
                    str2.getClass();
                    r0.A07((Message) null, str2);
                    byE.A07.A00(str2);
                }
                th = (C2j0) byE.A05.get();
                11T.A0F(str, 1);
                ?? obj2 = new Object();
                obj2.A00 = str;
                th.A01(obj2);
                ACc A0T2 = 4YV.A0T(c00i);
                try {
                    Iterator A1A2 = 1BK.A1A(map);
                    long j = 0;
                    while (A1A2.hasNext()) {
                        Message A0V = 4YU.A0V(A1A2);
                        long j2 = A0V.A05;
                        r0.A04.get();
                        long A002 = j2 + 60V.A00(A0V);
                        if (A002 > 1BL.A08(r0.A01) && (j == 0 || A002 < j)) {
                            j = A002;
                        }
                    }
                    byE.A00 = j;
                    1vU r02 = byE.A03;
                    Runnable runnable = byE.A09;
                    r02.A02(runnable);
                    long j3 = byE.A00;
                    if (j3 != 0) {
                        4YU.A0G(r02.A00).postAtTime(C0jy.A02(runnable, "HandlerBackgroundHandler", ReqContextTypeResolver.resolveName("handler_background_handler")), runnable, j3);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (A0T2 != null) {
                        A0T2.close();
                        throw th3;
                    }
                    throw th2;
                }
            } finally {
                th2 = th;
                if (A0T != null) {
                    A0T.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            7kF.A00(th, th4);
            th2 = th;
        }
    }
}
