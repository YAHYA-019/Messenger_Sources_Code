package X;

import com.facebook.xapp.messaging.threadlist.events.OnThreadListRendered;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2je, reason: invalid class name */
/* loaded from: 2je.class */
public final class C2je implements 1Vf {
    public final 1Br A00 = 1Bq.A00(67266);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r302v0 */
    /* JADX WARN: Type inference failed for: r302v1 */
    /* JADX WARN: Type inference failed for: r302v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List A00(List list) {
        List list2;
        C2hi c2hi;
        if (list != null) {
            list2 = new ArrayList();
            for (Object obj : list) {
                2UR r306 = null;
                if ((obj instanceof C2hi) && (c2hi = (C2hi) obj) != null) {
                    r306 = c2hi.A00;
                }
                if ((r306 instanceof C2gi) && r306 != null) {
                    list2.add(r306);
                }
            }
        } else {
            list2 = C0ty.A00;
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r301v1 */
    /* JADX WARN: Type inference failed for: r301v2 */
    /* JADX WARN: Type inference failed for: r301v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List A01(List list) {
        List list2;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C2hi) {
                    arrayList.add(obj);
                }
            }
            list2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((C2hi) obj2).A00.AsW() == 2hJ.A13) {
                    list2.add(obj2);
                }
            }
        } else {
            list2 = C0ty.A00;
        }
        return list2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        1SG r307;
        String str2;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        switch (str.hashCode()) {
            case -2099842703:
                if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnPause")) {
                    r307 = (1SG) this.A00.A00.get();
                    str2 = "on_pause";
                    break;
                }
                throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
            case -812952152:
                if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnInvisible")) {
                    r307 = (1SG) this.A00.A00.get();
                    str2 = "on_thread_list_invisible";
                    break;
                }
                throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
            case 744943903:
                if (str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadListRendered")) {
                    OnThreadListRendered onThreadListRendered = (OnThreadListRendered) r302;
                    11T.A0F(onThreadListRendered, 0);
                    C00i c00i = this.A00.A00;
                    2Wm r0 = (2Wm) c00i.get();
                    List<C2hp> list = onThreadListRendered.A00.A00;
                    11T.A0A(list);
                    boolean z = false;
                    if (!list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
                        for (C2hp c2hp : list) {
                            List A00 = A00(c2hp.A06);
                            List A002 = A00(c2hp.A05);
                            if ((!A002.isEmpty()) && (A00.size() != A002.size() || !A00.equals(A002))) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        if (r0.A00 == 1Hb.A02) {
                            r0.A0P("thread_list_rendered");
                        }
                        r0.A0M("thread_list");
                        r0.A01 = true;
                    } else if (r0.A01) {
                        r0.A0N("thread_list");
                    }
                    r0.A0P("on_thread_list_rendered_end");
                    for (C2hp c2hp2 : list) {
                        11T.A0D(c2hp2);
                        11T.A0F(c2hp2, 0);
                        if (!11T.A0O(A01(c2hp2.A06), A01(c2hp2.A05))) {
                            ((1SG) c00i.get()).A0M("chats_you_should_join_list");
                        }
                    }
                    return;
                }
                throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
            case 2098069214:
                if (str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadListOpenThread")) {
                    r307 = (1SG) this.A00.A00.get();
                    str2 = "open_thread";
                    break;
                }
                throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
            default:
                throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
        }
        r307.A0R(str2);
    }
}
