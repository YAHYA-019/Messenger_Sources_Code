package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Adq, reason: case insensitive filesystem */
/* loaded from: Adq.class */
public final class C1312Adq {
    public final 1Br A01 = 1BK.A0E();
    public final 1Br A00 = AbG.A0b();

    public final void A00(ThreadSummary threadSummary, List list) {
        C00j.A05("GroupThreadBlockWarningCardDismissalController.setBlockWarningCardDismissed", -1851732727);
        try {
            1Ql A08 = 1Br.A08(this.A01);
            1G2 r0 = 1NK.A06;
            A08.CaL(AbstractC03303xn.A07(4YU.A0y(threadSummary.A0n)), 4YV.A0t(".", list, (Function1) null));
            A08.commit();
            C00j.A01(-264685724);
        } catch (Throwable th) {
            C00j.A01(-34249119);
            throw th;
        }
    }

    public final boolean A01(ThreadSummary threadSummary, List list) {
        int i;
        int i2;
        boolean z = true;
        C00j.A05("GroupThreadBlockWarningCardDismissalController.isBlockWarningCardDismissed", 1095191149);
        try {
            ThreadKey threadKey = threadSummary.A0n;
            if (threadKey.A1D() || 2oI.A06(threadSummary)) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj : list) {
                    if (((C60b) 1Br.A0B(this.A00)).A01(threadSummary, ((User) obj).A0k) != C1zL.A04) {
                        A0s.add(obj);
                    }
                }
            }
            if (list.isEmpty()) {
                C00j.A05("GroupThreadBlockWarningCardDismissalController.removeBlockWarningCardDismissed", -112227707);
                try {
                    1Ql A08 = 1Br.A08(this.A01);
                    1G2 r0 = 1NK.A06;
                    A08.Cdj(AbstractC03303xn.A07(4YU.A0y(threadKey)));
                    A08.commit();
                    C00j.A01(-1801969294);
                    i2 = -351929622;
                } catch (Throwable th) {
                    th = th;
                    i = 1098270737;
                    C00j.A01(i);
                    throw th;
                }
            } else {
                ArrayList A0z = 1BL.A0z(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0z.add(((User) it.next()).A0k.id);
                }
                C00j.A05("GroupThreadBlockWarningCardDismissalController.getDismissedBlockWarningUserIds", 1605781570);
                try {
                    FbSharedPreferences A09 = 1Br.A09(this.A01);
                    1G2 r02 = 1NK.A06;
                    HashSet A0Q = 0QD.A0Q(0CU.A0M(4YV.A0r(A09, AbstractC03303xn.A07(4YU.A0y(threadKey))), new String[]{"."}, 0));
                    C00j.A01(-744368788);
                    z = A0Q.containsAll(A0z);
                    if (z && A0Q.size() != A0z.size()) {
                        A00(threadSummary, A0z);
                    }
                    i2 = -24824490;
                } catch (Throwable th2) {
                    th = th2;
                    i = 572684076;
                    C00j.A01(i);
                    throw th;
                }
            }
            C00j.A01(i2);
            return z;
        } catch (Throwable th3) {
            C00j.A01(-2033860048);
            throw th3;
        }
    }
}
