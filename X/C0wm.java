package X;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0wm, reason: invalid class name */
/* loaded from: 0wm.class */
public final class C0wm extends 0UA {
    public Object A03(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object A04(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public Object A05(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition == null) {
            transition = null;
            if (transition2 != null) {
                transition = transition2;
            }
        } else if (transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public Object A06(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    public void A07(Rect rect, Object obj) {
        ((Transition) obj).setEpicenterCallback(new 0U8(rect, this));
    }

    public void A08(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    public void A09(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            0UA.A00(view, rect);
            ((Transition) obj).setEpicenterCallback(new 0U4(rect, this));
        }
    }

    public void A0A(View view, Object obj, ArrayList arrayList) {
        ((Transition) obj).addListener(new 0U5(view, this, arrayList));
    }

    public void A0B(View view, Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        List<View> targets = transition.getTargets();
        targets.clear();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                targets.add(view);
                arrayList.add(view);
                A0I(transition, arrayList);
                return;
            }
            0UA.A01((View) arrayList.get(i2), targets);
            i = i2 + 1;
        }
    }

    public void A0C(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public void A0D(0R3 r302, Fragment fragment, Object obj, Runnable runnable) {
        ((Transition) obj).addListener(new 0U7(this, runnable));
    }

    public void A0H(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((Transition) obj).addListener(new 0U6(this, obj2, obj4, arrayList, arrayList3));
    }

    public void A0I(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    A0I(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
                return;
            }
            List<Integer> targetIds = transition.getTargetIds();
            if (targetIds == null || targetIds.isEmpty()) {
                List<String> targetNames = transition.getTargetNames();
                if (targetNames == null || targetNames.isEmpty()) {
                    List<Class> targetTypes = transition.getTargetTypes();
                    if (targetTypes == null || targetTypes.isEmpty()) {
                        List<View> targets = transition.getTargets();
                        if (targets == null || targets.isEmpty()) {
                            int size = arrayList.size();
                            while (i < size) {
                                transition.addTarget((View) arrayList.get(i));
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    public void A0J(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            transition.getTargets().clear();
            transition.getTargets().addAll(arrayList2);
            A0O(transition, arrayList, arrayList2);
        }
    }

    public boolean A0L() {
        if (!06Z.A0O(4)) {
            return false;
        }
        android.util.Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean A0M(Object obj) {
        return obj instanceof Transition;
    }

    public boolean A0N(Object obj) {
        if (!06Z.A0N()) {
            return false;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Predictive back not available for framework transition ");
        A0k.append(obj);
        A0k.append(". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        AnonymousClass001.A17(A0k);
        return false;
    }

    public void A0O(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                A0O(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        List<Integer> targetIds = transition.getTargetIds();
        if (targetIds != null && !targetIds.isEmpty()) {
            return;
        }
        List<String> targetNames = transition.getTargetNames();
        if (targetNames != null && !targetNames.isEmpty()) {
            return;
        }
        List<Class> targetTypes = transition.getTargetTypes();
        if ((targetTypes != null && !targetTypes.isEmpty()) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        if (arrayList2 != null) {
            int size = arrayList2.size();
            while (i < size) {
                transition.addTarget((View) arrayList2.get(i));
                i++;
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }
}
