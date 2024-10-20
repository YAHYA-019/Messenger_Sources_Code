package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLXFBMsgrSafetyInterventionComponentImageType;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9kW, reason: invalid class name */
/* loaded from: 9kW.class */
public final class C9kW {
    public static boolean A04;
    public RYj A00;
    public C2a2 A01;
    public final 1Br A03 = 1Bu.A00(81929);
    public final 1Br A02 = 1Bq.A00(83523);

    public static final String A00(FbUserSession fbUserSession, ThreadSummary threadSummary) {
        Object obj;
        UserKey A0X = 1BK.A0X(((1G1) fbUserSession).A02);
        String str = null;
        ImmutableList immutableList = threadSummary.A1L;
        if (immutableList != null) {
            ArrayList A0z = 1BL.A0z(immutableList);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                A0z.add(4YU.A0W(it).A05.A0F);
            }
            Iterator it2 = A0z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (!obj.equals(A0X)) {
                    break;
                }
            }
            UserKey userKey = (UserKey) obj;
            if (userKey != null) {
                str = userKey.id;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(06Z r301, FbUserSession fbUserSession, ThreadSummary threadSummary, AaO aaO, AnonymousClass690 anonymousClass690) {
        ImmutableList immutableList;
        94S r0 = MigBottomSheetDialogFragment.A01;
        String A0u = 4YV.A0u(anonymousClass690.A01());
        if (A0u == null) {
            A0u = "";
        }
        String str = anonymousClass690.A0M;
        if (str == null) {
            str = "";
        }
        String str2 = anonymousClass690.A0G;
        11T.A0A(str2);
        C9pw A00 = C9pw.A00(aaO, anonymousClass690, 37);
        String str3 = anonymousClass690.A0I;
        11T.A0A(str3);
        C9pq c9pq = new View.OnClickListener() { // from class: X.9pq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                0FI.A0B(-1256211767, 0FI.A05(-1899196610));
            }
        };
        C9pw A002 = C9pw.A00(aaO, anonymousClass690, 38);
        8Lu r02 = new 8Lu(GraphQLXFBMsgrSafetyInterventionComponentImageType.STOCK_IMAGE, C98h.A03);
        UserKey A0X = 1BK.A0X(((1G1) fbUserSession).A02);
        UserKey userKey = null;
        if (threadSummary != null && (immutableList = threadSummary.A1L) != null) {
            ArrayList A0z = 1BL.A0z(immutableList);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                A0z.add(4YU.A0W(it).A05.A0F);
            }
            Iterator it2 = A0z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!next.equals(A0X)) {
                    userKey = next;
                    break;
                }
            }
            userKey = userKey;
        }
        Integer num = 0S2.A01;
        String str4 = anonymousClass690.A0O;
        Integer num2 = 0S2.A0C;
        String str5 = anonymousClass690.A0Q;
        1BK.A1J(r301, 0, str2);
        4YV.A1M(str3, 6, c9pq);
        if (C0D1.A01(r301)) {
            8DG r03 = new 8DG(A00, c9pq, A002, r02, userKey, num, num2, A0u, str, str2, str3, str4, str5, false, true);
            0D2 baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
            baseMigBottomSheetDialogFragment.A01 = r03;
            baseMigBottomSheetDialogFragment.A0m(r301, "SafetyInterventionBottomSheet");
        }
        int i = anonymousClass690.A01;
        HeterogeneousMap A003 = anonymousClass690.A00();
        11T.A0A(A003);
        aaO.BML(A003, i);
    }
}
