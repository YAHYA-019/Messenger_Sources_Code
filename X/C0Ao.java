package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.acra.util.JavaProcFileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Ao, reason: invalid class name */
/* loaded from: 0Ao.class */
public final class C0Ao {
    public Integer A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Fragment A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final C09y A0B;

    public C0Ao(C09y c09y, Integer num, Integer num2) {
        Fragment A04 = c09y.A04();
        this.A00 = num;
        this.A01 = num2;
        this.A07 = A04;
        this.A09 = new ArrayList();
        this.A02 = true;
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        this.A0A = arrayList;
        this.A0B = c09y;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NONE";
            case 1:
                return "ADDING";
            default:
                return "REMOVING";
        }
    }

    public final Fragment A01() {
        return this.A07;
    }

    public void A02() {
        this.A06 = false;
        if (!this.A04) {
            if (06Z.A0O(2)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("SpecialEffectsController: ");
                A0k.append(this);
                A0k.append(" has called complete.");
                AnonymousClass001.A17(A0k);
            }
            this.A04 = true;
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.A07.mTransitioning = false;
        this.A0B.A07();
    }

    public void A03() {
        if (this.A06) {
            return;
        }
        this.A06 = true;
        Integer num = this.A01;
        if (num != 0S2.A01) {
            if (num == 0S2.A0C) {
                Fragment A04 = this.A0B.A04();
                View requireView = A04.requireView();
                if (06Z.A0O(2)) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Clearing focus ");
                    A0k.append(requireView.findFocus());
                    A0k.append(" on view ");
                    A0k.append(requireView);
                    AnonymousClass002.A0V(A04, " for Fragment ", "FragmentManager", A0k);
                }
                requireView.clearFocus();
                return;
            }
            return;
        }
        C09y c09y = this.A0B;
        Fragment A042 = c09y.A04();
        View findFocus = A042.mView.findFocus();
        if (findFocus != null) {
            A042.setFocusedView(findFocus);
            if (06Z.A0O(2)) {
                StringBuilder A0k2 = AnonymousClass001.A0k();
                A0k2.append("requestFocus: Saved focused view ");
                A0k2.append(findFocus);
                AnonymousClass002.A0V(A042, " for Fragment ", "FragmentManager", A0k2);
            }
        }
        View requireView2 = this.A07.requireView();
        if (requireView2.getParent() == null) {
            c09y.A05();
            requireView2.setAlpha(0.0f);
        }
        if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
            requireView2.setVisibility(4);
        }
        requireView2.setAlpha(A042.getPostOnViewCreatedAlpha());
    }

    public final void A04(ViewGroup viewGroup) {
        this.A06 = false;
        if (this.A03) {
            return;
        }
        this.A03 = true;
        if (this.A08.isEmpty()) {
            A02();
            return;
        }
        for (0PC r0 : 0QD.A0V(this.A0A)) {
            if (!r0.A00) {
                r0.A05(viewGroup);
            }
            r0.A00 = true;
        }
    }

    public final void A05(0PC r302) {
        List list = this.A08;
        if (list.remove(r302) && list.isEmpty()) {
            A02();
        }
    }

    public final void A06(Integer num, Integer num2) {
        Integer num3;
        11T.A0F(num, 0);
        int intValue = num2.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 0 || this.A00 == 0S2.A00) {
                    return;
                }
                if (06Z.A0O(2)) {
                    StringBuilder A0n = AnonymousClass001.A0n("SpecialEffectsController: For fragment ");
                    A0n.append(this.A07);
                    A0n.append(" mFinalState = ");
                    A0n.append(C0As.A00(this.A00));
                    A0n.append(JavaProcFileReader.LS_SYMLINK_ARROW);
                    A0n.append(C0As.A00(num));
                    android.util.Log.v("FragmentManager", AnonymousClass001.A0g(A0n, '.'));
                }
                this.A00 = num;
                return;
            }
            if (06Z.A0O(2)) {
                StringBuilder A0n2 = AnonymousClass001.A0n("SpecialEffectsController: For fragment ");
                A0n2.append(this.A07);
                A0n2.append(" mFinalState = ");
                A0n2.append(C0As.A00(this.A00));
                A0n2.append(" -> REMOVED. mLifecycleImpact  = ");
                A0n2.append(A00(this.A01));
                AnonymousClass001.A1E(" to REMOVING.", "FragmentManager", A0n2);
            }
            this.A00 = 0S2.A00;
            num3 = 0S2.A0C;
        } else {
            if (this.A00 != 0S2.A00) {
                return;
            }
            if (06Z.A0O(2)) {
                StringBuilder A0n3 = AnonymousClass001.A0n("SpecialEffectsController: For fragment ");
                A0n3.append(this.A07);
                A0n3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                A0n3.append(A00(this.A01));
                AnonymousClass001.A1E(" to ADDING.", "FragmentManager", A0n3);
            }
            num3 = 0S2.A01;
            this.A00 = num3;
        }
        this.A01 = num3;
        this.A02 = true;
    }

    public String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Operation {");
        A0k.append(hexString);
        A0k.append("} {finalState = ");
        A0k.append(C0As.A00(this.A00));
        A0k.append(" lifecycleImpact = ");
        A0k.append(A00(this.A01));
        A0k.append(" fragment = ");
        A0k.append(this.A07);
        return AnonymousClass001.A0f(A0k);
    }
}
