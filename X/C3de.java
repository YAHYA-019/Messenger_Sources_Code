package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.UserKey;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;

/* renamed from: X.3de, reason: invalid class name */
/* loaded from: 3de.class */
public final class C3de implements Supplier {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3de(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        int i;
        ImmutableList A02;
        2TM r305;
        int i2;
        int i3 = this.A00;
        2TR r0 = (2TR) this.A01;
        Object obj = this.A02;
        if (i3 != 0) {
            FbUserSession fbUserSession = (FbUserSession) obj;
            C00j.A05("getTopRtcContacts", -1165710542);
            try {
                Bl2 bl2 = (Bl2) 1Lo.A04((Context) null, fbUserSession, r0.A02, 82165);
                2To r02 = 2To.A0N;
                2U0 r03 = (2U0) 1Br.A0B(((2Tz) bl2.A01.get()).A00);
                ((1GU) r03.A00.get()).AAr("MessagingContactsRankingStoreHelper must not be called on the main thread");
                ImmutableList immutableList = (ImmutableList) 2U0.A02(r02, r03, (String) null).A00;
                if (immutableList == null) {
                    immutableList = ImmutableList.of();
                }
                if (immutableList.isEmpty()) {
                    r305 = 2TM.A03;
                    i2 = 1792214302;
                } else {
                    r305 = 6QB.A00(fbUserSession, 2eP.A00, (6QB) r0.A0I.get(), r02, (Comparator) null, ((2Tv) r0.A0K.get()).A02(UserKey.A03(immutableList)));
                    i2 = 1395139163;
                }
                C00j.A01(i2);
                return r305;
            } catch (Throwable th) {
                th = th;
                i = 1051425692;
            }
        } else {
            java.util.Map map = (java.util.Map) obj;
            C00j.A05("getSpecificUsers", -1015759571);
            ImmutableList.Builder builder = ImmutableList.builder();
            try {
                2Tv r04 = (2Tv) r0.A0K.get();
                ImmutableList immutableList2 = r04.A00;
                if (immutableList2 == null) {
                    A02 = ImmutableList.of();
                    11T.A0D(A02);
                } else {
                    A02 = r04.A02(UserKey.A03(immutableList2));
                }
                if (A02 != null) {
                    int i4 = r0.A03.A00;
                    if (i4 == -1) {
                        i4 = 20;
                    }
                    if (A02.size() > i4) {
                        A02 = A02.subList(0, i4);
                    }
                    builder.addAll(A02);
                }
                C00j.A01(-844238599);
                return 2TR.A03(builder.build(), map, false);
            } catch (Throwable th2) {
                th = th2;
                i = 2096661216;
            }
        }
        C00j.A01(i);
        throw th;
    }
}
