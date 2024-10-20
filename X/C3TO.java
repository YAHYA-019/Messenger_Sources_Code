package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.3TO, reason: invalid class name */
/* loaded from: 3TO.class */
public final class C3TO {
    public static final C3TO A00 = new Object();

    public static final void A00(06Z r301, C3TO c3to, List list) {
        for (Fragment fragment : r301.A0T.A0A()) {
            if (fragment != null && fragment.isResumed() && fragment.mUserVisibleHint && !fragment.isHidden()) {
                list.add(fragment);
                06Z childFragmentManager = fragment.getChildFragmentManager();
                11T.A0A(childFragmentManager);
                A00(childFragmentManager, c3to, list);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    public static final void A01(C3TO c3to, List list, List list2) {
        C0ty c0ty;
        if (list.isEmpty()) {
            return;
        }
        int A04 = AnonymousClass001.A04(list);
        if (A04 < 0) {
            return;
        }
        while (true) {
            int i = A04 - 1;
            Fragment fragment = (Fragment) list.get(A04);
            if (fragment != null && fragment.isResumed() && fragment.mUserVisibleHint && !fragment.isHidden()) {
                list2.add(fragment);
                if (fragment.isAdded()) {
                    c0ty = fragment.getChildFragmentManager().A0T.A0A();
                    11T.A0D(c0ty);
                } else {
                    c0ty = C0ty.A00;
                }
                A01(c3to, c0ty, list2);
                return;
            }
            if (i < 0) {
                return;
            } else {
                A04 = i;
            }
        }
    }
}
