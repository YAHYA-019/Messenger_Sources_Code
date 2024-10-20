package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.zero.common.ZeroToken;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3dr, reason: invalid class name */
/* loaded from: 3dr.class */
public final class C3dr implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3dr(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                final 7Yx r0 = (7Yx) this.A01;
                Looper mainLooper = Looper.getMainLooper();
                if (11T.A0O(mainLooper.getThread(), Thread.currentThread())) {
                    r0.CHY((User) null);
                    return;
                } else {
                    new Handler(mainLooper).post(new Runnable() { // from class: X.3f7
                        public static final String __redex_internal_original_name = "OpFetchUserByKeyBuilder$callbackOrNull$1$onFailure$$inlined$onMainThread$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            r0.CHY((User) null);
                        }
                    });
                    return;
                }
            case 1:
                11T.A0F(th, 0);
                0fH.A0v("FriendsInboxUnitItemListener", "Failed to fetch the thread key.", th);
                return;
            case 2:
                return;
            default:
                1BK.A09(((3sU) this.A01).A08).D0y(AbstractC00603o4.A00(24), "Error executing FetchZeroTokenQuery", 1000, th);
                ((1FX) this.A02).setException(th);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        1FX r309;
        ZeroToken zeroToken;
        Object obj2;
        2JY A0P;
        switch (this.A00) {
            case 0:
                User user = (User) obj;
                7Yx r0 = (7Yx) this.A01;
                Looper mainLooper = Looper.getMainLooper();
                if (11T.A0O(mainLooper.getThread(), Thread.currentThread())) {
                    r0.CHY(user);
                    return;
                } else {
                    new Handler(mainLooper).post(new 32O(r0, user));
                    return;
                }
            case 1:
                final ThreadKey threadKey = (ThreadKey) obj;
                if (threadKey != null) {
                    final C2i8 c2i8 = (C2i8) this.A02;
                    1GU r02 = (1GU) 1Br.A0B(c2i8.A04);
                    final 2tH r03 = (2tH) this.A01;
                    r02.Ciz(new Runnable() { // from class: X.3hh
                        public static final String __redex_internal_original_name = "FriendsInboxUnitItemListener$onCloseConnectionItemClicked$1$onSuccess$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C2i8 c2i82 = C2i8.this;
                            ThreadKey threadKey2 = threadKey;
                            2tH r04 = r03;
                            C2i8.A08(c2i82, threadKey2, 7ND.A01(r04, 3TZ.A01(r04), "thread_list"));
                        }
                    });
                    return;
                }
                return;
            case 2:
                List list = (List) obj;
                3yY r04 = (3yY) this.A02;
                if (list == null) {
                    list = C0ty.A00;
                }
                11T.A0F(list, 0);
                r04.A02 = list;
                2TR r05 = (2TR) this.A01;
                r05.A0A(ImmutableList.copyOf((Collection) list));
                r05.A09(r04.A03);
                1SG.A03((1SG) 1Br.A0B(r04.A05), "inbox_tray/fetch_cc_start/fetch_rs_end/", r04.A02.size());
                0fH.A0j(AbstractC00603o4.A00(340), "fetching contacts after fetching ranking scores");
                return;
            default:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                if (abstractC08294mh != null && (obj2 = abstractC08294mh.A03) != null && (A0P = ((2JY) obj2).A0P(2JX.class, 1704977238)) != null) {
                    2JY A0B = 1BK.A0B(A0P, 2JX.class, 685661281, 690701490);
                    2JY A0B2 = 1BK.A0B(A0P, 2JX.class, -993231454, -1558650506);
                    if (A0B != null && A0B2 != null) {
                        r309 = (1FX) this.A02;
                        zeroToken = 3sU.A01(1BL.A0M(A0B, -2075953448, -1857807958), 1BL.A0M(A0B2, 80988633, 1167748985), 1BK.A0N(((3sU) this.A01).A06).BCy(36886957255886537L));
                        r309.set(zeroToken);
                        return;
                    }
                }
                r309 = (1FX) this.A02;
                zeroToken = ZeroToken.A0N;
                r309.set(zeroToken);
                return;
        }
    }
}
