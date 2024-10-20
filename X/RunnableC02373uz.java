package X;

import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.3uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3uz.class */
public final class RunnableC02373uz implements Runnable {
    public static final String __redex_internal_original_name = "M4HomeNavigationUiController$scheduleMsysThreadViewPreload$1";
    public final /* synthetic */ 2Lz A00;

    public RunnableC02373uz(2Lz r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C00j.A05("M4HomeNavigationUiController.preRenderMsysThreadViewFragment", -1277462920);
        try {
            2Lz r0 = this.A00;
            2M9 r02 = r0.A0S;
            Fragment A00 = 2M9.A00(r02, 2131365870);
            2N1 A03 = r02.A03(1BJ.A00(1533));
            if (A03 == null || A00 != null) {
                i = -2092508488;
            } else {
                2Lz.A01(r0);
                2N1 r03 = A03;
                if (r03.A08 == null) {
                    11T.A0L("fragmentPresenter");
                    throw 0Q8.createAndThrow();
                }
                06Z childFragmentManager = r03.getChildFragmentManager();
                11T.A0A(childFragmentManager);
                2PI A1X = r03.A1X();
                11T.A0F(A1X, 1);
                2Rz A0b = childFragmentManager.A0b(A1X.name());
                if (A0b instanceof 2Rz) {
                    2Rz r04 = A0b;
                    if (r04 != null) {
                        2Sc r05 = r04.A0L;
                        if (r05 != null) {
                            2Sd r06 = r05.A04;
                            if (r06 != null) {
                                2Sg r07 = (2Sg) r06.getValue();
                                if (r07 != null) {
                                    ImmutableList immutableList = (ImmutableList) r07.A03.getValue();
                                    int Auy = (int) 1BL.A0Q().Auy(36606891027406403L);
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= immutableList.size() || i2 > Auy) {
                                            break;
                                        }
                                        ThreadKey threadKey = ((ThreadSummary) immutableList.get(i2)).A0n;
                                        11T.A0A(threadKey);
                                        if (((6CZ) 1Br.A0B(r04.A18)).A02(threadKey)) {
                                            2OT A002 = 2Lz.A00(r0);
                                            C6el c6el = new C6el();
                                            c6el.A00(threadKey);
                                            c6el.A02(5SW.A1R);
                                            ThreadViewParams threadViewParams = new ThreadViewParams(c6el);
                                            List list = A002.A0K;
                                            if (!(!list.isEmpty())) {
                                                Fragment A003 = A002.A0E.A00(threadViewParams);
                                                C06c c06c = A002.A05;
                                                c06c.A0L(A003, 2131365870);
                                                c06c.A0H(A003);
                                                0fH.A0j(1BJ.A00(819), "MsysThreadViewFragment preloaded");
                                                list.add(A003);
                                            }
                                            A002.A09(true);
                                            i = -1001893405;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i = -646203757;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(580436277);
            throw th;
        }
    }
}
