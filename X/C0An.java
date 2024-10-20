package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0An, reason: invalid class name */
/* loaded from: 0An.class */
public final class C0An extends C0Am {
    private final void A00(View view, java.util.Map map) {
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return;
            }
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                A00(childAt, map);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v179, types: [X.0QO, X.04r, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v183, types: [X.0QO, X.04r, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v185, types: [X.0QO, X.04r, java.util.Map] */
    @Override // X.C0Am
    public void A0H(List list, boolean z) {
        Object obj;
        Object obj2;
        StringBuilder A0m;
        String str;
        Object obj3;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            C0Ao c0Ao = (C0Ao) obj2;
            C0Ap c0Ap = C0As.A00;
            View view = c0Ao.A01().mView;
            11T.A09(view);
            Integer A01 = c0Ap.A01(view);
            Integer num = 0S2.A01;
            if (A01 == num && c0Ao.A00 != num) {
                break;
            }
        }
        C0Ao c0Ao2 = (C0Ao) obj2;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            C0Ao c0Ao3 = (C0Ao) previous;
            C0Ap c0Ap2 = C0As.A00;
            View view2 = c0Ao3.A01().mView;
            11T.A09(view2);
            Integer A012 = c0Ap2.A01(view2);
            Integer num2 = 0S2.A01;
            if (A012 != num2 && c0Ao3.A00 == num2) {
                obj = previous;
                break;
            }
        }
        C0Ao c0Ao4 = (C0Ao) obj;
        if (06Z.A0O(2)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Executing operations from ");
            A0k.append(c0Ao2);
            AnonymousClass002.A0X(c0Ao4, " to ", A0k);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Fragment A013 = ((C0Ao) 0QD.A0F(list)).A01();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C09z c09z = ((C0Ao) it2.next()).A01().mAnimationInfo;
            C09z c09z2 = A013.mAnimationInfo;
            c09z.A01 = c09z2.A01;
            c09z.A02 = c09z2.A02;
            c09z.A04 = c09z2.A04;
            c09z.A05 = c09z2.A05;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C0Ao c0Ao5 = (C0Ao) it3.next();
            arrayList.add(new 0D3(c0Ao5, z));
            arrayList2.add(new C0D5(c0Ao5, z, !z ? c0Ao5 != c0Ao4 : c0Ao5 != c0Ao2));
            c0Ao5.A09.add(new 0D6(this, c0Ao5));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((0D4) next).A01()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            if (((C0D5) obj4).A02() != null) {
                arrayList4.add(obj4);
            }
        }
        Iterator it5 = arrayList4.iterator();
        0UA r0 = null;
        while (true) {
            0UA r320 = r0;
            if (!it5.hasNext()) {
                if (r320 != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    ?? r02 = new 0QO(0);
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    ArrayList A0s4 = AnonymousClass001.A0s();
                    ?? r03 = new 0QO(0);
                    ?? r04 = new 0QO(0);
                    Iterator it6 = arrayList4.iterator();
                    loop7: while (true) {
                        obj3 = null;
                        while (it6.hasNext()) {
                            Object obj5 = ((C0D5) it6.next()).A00;
                            if (obj5 != null && c0Ao2 != null && c0Ao4 != null) {
                                obj3 = r320.A04(r320.A03(obj5));
                                Fragment A014 = c0Ao4.A01();
                                A0s4 = A014.getSharedElementSourceNames();
                                Fragment A015 = c0Ao2.A01();
                                ArrayList sharedElementSourceNames = A015.getSharedElementSourceNames();
                                ArrayList sharedElementTargetNames = A015.getSharedElementTargetNames();
                                int size = sharedElementTargetNames.size();
                                for (int i = 0; i < size; i++) {
                                    int indexOf = A0s4.indexOf(sharedElementTargetNames.get(i));
                                    if (indexOf != -1) {
                                        A0s4.set(indexOf, sharedElementSourceNames.get(i));
                                    }
                                }
                                A0s3 = A014.getSharedElementTargetNames();
                                int size2 = A0s4.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    Object obj6 = A0s4.get(i2);
                                    11T.A0A(obj6);
                                    Object obj7 = A0s3.get(i2);
                                    11T.A0A(obj7);
                                    r02.put(obj6, obj7);
                                }
                                if (06Z.A0O(2)) {
                                    android.util.Log.v("FragmentManager", ">>> entering view names <<<");
                                    Iterator it7 = A0s3.iterator();
                                    while (it7.hasNext()) {
                                        android.util.Log.v("FragmentManager", 0Pz.A0W("Name: ", (String) it7.next()));
                                    }
                                    android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
                                    Iterator it8 = A0s4.iterator();
                                    while (it8.hasNext()) {
                                        android.util.Log.v("FragmentManager", 0Pz.A0W("Name: ", AnonymousClass001.A0i(it8)));
                                    }
                                }
                                View view3 = A015.mView;
                                11T.A09(view3);
                                A00(view3, r03);
                                r03.A0A(A0s4);
                                r02.A0A(r03.keySet());
                                View view4 = A014.mView;
                                11T.A09(view4);
                                A00(view4, r04);
                                r04.A0A(A0s3);
                                r04.A0A(r02.values());
                                0UA r05 = 0U3.A01;
                                int size3 = r02.size();
                                while (true) {
                                    size3--;
                                    if (-1 >= size3) {
                                        break;
                                    } else if (!r04.containsKey(r02.A06(size3))) {
                                        r02.A05(size3);
                                    }
                                }
                                0QU.A0v(r03.entrySet(), new 0lX(r02.keySet()), false);
                                0QU.A0v(r04.entrySet(), new 0lX(r02.values()), false);
                                if (r02.isEmpty()) {
                                    break;
                                }
                            }
                        }
                        StringBuilder A0k2 = AnonymousClass001.A0k();
                        A0k2.append("Ignoring shared elements transition ");
                        A0k2.append(obj3);
                        A0k2.append(" between ");
                        A0k2.append(c0Ao2);
                        A0k2.append(" and ");
                        A0k2.append(c0Ao4);
                        android.util.Log.i("FragmentManager", AnonymousClass001.A0d(" as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.", A0k2));
                        A0s.clear();
                        A0s2.clear();
                    }
                    if (obj3 == null) {
                        if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                            Iterator it9 = arrayList4.iterator();
                            while (it9.hasNext()) {
                                if (((C0D5) it9.next()).A01 == null) {
                                }
                            }
                        }
                    }
                    0xD r06 = new 0xD((C04r) r02, (C04r) r03, (C04r) r04, r320, c0Ao2, c0Ao4, obj3, A0s, A0s2, A0s3, A0s4, arrayList4);
                    Iterator it10 = arrayList4.iterator();
                    while (it10.hasNext()) {
                        ((0D4) it10.next()).A00.A08.add(r06);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                Iterator it11 = arrayList.iterator();
                while (it11.hasNext()) {
                    0QU.A0t(((0D4) it11.next()).A00.A0A, arrayList6);
                }
                boolean z2 = !arrayList6.isEmpty();
                Iterator it12 = arrayList.iterator();
                boolean z3 = false;
                while (it12.hasNext()) {
                    0D3 r07 = (0D3) it12.next();
                    Context context = this.A02.getContext();
                    C0Ao c0Ao6 = ((0D4) r07).A00;
                    11T.A0A(context);
                    0GN A02 = r07.A02(context);
                    if (A02 != null) {
                        if (A02.A00 == null) {
                            arrayList5.add(r07);
                        } else {
                            Fragment A016 = c0Ao6.A01();
                            if (!(!c0Ao6.A0A.isEmpty())) {
                                if (c0Ao6.A00 == 0S2.A0C) {
                                    c0Ao6.A02 = false;
                                }
                                c0Ao6.A08.add(new 0xE(r07));
                                z3 = true;
                            } else if (06Z.A0O(2)) {
                                StringBuilder A0k3 = AnonymousClass001.A0k();
                                A0k3.append("Ignoring Animator set on ");
                                A0k3.append(A016);
                                AnonymousClass001.A1E(" as this Fragment was involved in a Transition.", "FragmentManager", A0k3);
                            }
                        }
                    }
                }
                Iterator it13 = arrayList5.iterator();
                while (it13.hasNext()) {
                    0D3 r08 = (0D3) it13.next();
                    C0Ao c0Ao7 = ((0D4) r08).A00;
                    Fragment A017 = c0Ao7.A01();
                    if (z2) {
                        if (06Z.A0O(2)) {
                            A0m = AnonymousClass001.A0m(A017, "Ignoring Animation set on ");
                            str = " as Animations cannot run alongside Transitions.";
                            AnonymousClass001.A1E(str, "FragmentManager", A0m);
                        }
                    } else if (!z3) {
                        c0Ao7.A08.add(new 0PB(r08));
                    } else if (06Z.A0O(2)) {
                        A0m = AnonymousClass001.A0m(A017, "Ignoring Animation set on ");
                        str = " as Animations cannot run alongside Animators.";
                        AnonymousClass001.A1E(str, "FragmentManager", A0m);
                    }
                }
                return;
            }
            C0D5 c0d5 = (C0D5) it5.next();
            0UA A022 = c0d5.A02();
            if (r320 != null && A022 != r320) {
                StringBuilder A0k4 = AnonymousClass001.A0k();
                A0k4.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                A0k4.append(((0D4) c0d5).A00.A01());
                A0k4.append(" returned Transition ");
                A0k4.append(c0d5.A01);
                throw AnonymousClass002.A0D(" which uses a different Transition type than other Fragments.", A0k4);
            }
            r0 = A022;
        }
    }
}
