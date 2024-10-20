package X;

import android.util.Pair;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6tf, reason: invalid class name */
/* loaded from: 6tf.class */
public final class C6tf implements 5To {
    public final /* synthetic */ 6tZ A00;

    public C6tf(6tZ r302) {
        this.A00 = r302;
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public void CbI(Pair pair) {
        6tZ r0 = this.A00;
        1Iw r02 = r0.A0P;
        if (r02 == null || r02.A0D == null) {
            return;
        }
        r0.A0M.set(pair);
        Object obj = pair.first;
        Object obj2 = pair.second;
        C7oo c7oo = r0.A07;
        if (c7oo == null || !c7oo.A00) {
            r0.A01.A0O(6tZ.A00(new 1Iw(r02), r0.A08, obj, obj2));
        } else {
            1LI A00 = 6tZ.A00(new 1Iw(r02), r0.A08, obj, obj2);
            synchronized (r0.A0K) {
                if (r0.A0A) {
                    r0.A01.A0O(A00);
                } else {
                    r0.A00 = A00;
                }
            }
        }
        if (obj != null && 6tZ.A04(r0)) {
            ((QuickPerformanceLogger) r0.A0E.get()).markerPoint(r0.A0Q.A01, r0.A0Q.A00, "DATA_RECEIVED");
        }
        r0.A0J.CbJ(r0.A06, 6tZ.A04(r0) ? r0.A0Q.A05 : "");
    }

    public /* bridge */ /* synthetic */ void CbM(Object obj) {
        Object obj2;
        Object obj3;
        final Pair pair = (Pair) obj;
        6tZ r0 = this.A00;
        if (r0.A0P == null) {
            throw AnonymousClass001.A0N("Must have called DataFetchHelper.onCreate() before onCreateView()");
        }
        if (pair != null) {
            obj2 = pair.first;
            obj3 = pair.second;
        } else {
            obj2 = null;
            obj3 = r0.A09;
        }
        C7oo c7oo = r0.A07;
        if (c7oo == null || !c7oo.A00) {
            2AW A00 = 6tZ.A00(r0.A0P, r0.A08, obj2, obj3);
            C6tg c6tg = r0.A03;
            if (pair != null && pair.first != null) {
                A00 = new 2AW();
            }
            r0.A02 = c6tg.A03(A00);
        } else {
            LithoView A03 = r0.A03.A03(new 2AW());
            r0.A02 = A03;
            ComponentTree componentTree = A03.A00;
            componentTree.A0R(new C3Ym(componentTree, this, 0));
        }
        r0.A01 = r0.A02.A00;
        r0.A0J.CbN(r0.A06, 6tZ.A04(r0) ? r0.A0Q.A05 : "");
        if (pair == null || pair.first == null) {
            return;
        }
        final Pair pair2 = (Pair) r0.A0M.get();
        r0.A0I.CXv(new Runnable() { // from class: X.6ui
            public static final String __redex_internal_original_name = "DataFetchWithStateHelper$1$2";

            @Override // java.lang.Runnable
            public void run() {
                C6tf c6tf = this;
                AtomicReference atomicReference = c6tf.A00.A0M;
                Pair pair3 = pair2;
                Pair pair4 = pair;
                if (1MG.A00(atomicReference, pair3, pair4)) {
                    c6tf.CbI(pair4);
                }
            }
        }, "postToReceiveAdditional");
    }
}
