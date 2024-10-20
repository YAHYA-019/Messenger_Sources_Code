package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: L8q.class */
public final class L8q {
    public int A00;
    public int A01;
    public C00i A02;
    public LithoView A03;
    public 5Tp A04;
    public int A05;
    public int A06;
    public final AtomicReference A08 = GOn.A1L((Object) null);
    public final C4h0 A07 = 5Tf.A08;

    public L8q(C00i c00i) {
        this.A02 = c00i;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.litho.LithoView A00(android.content.Context r301, X.L8q r302) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L8q.A00(android.content.Context, X.L8q):com.facebook.litho.LithoView");
    }

    public static void A01(Activity activity, L8q l8q, int i) {
        int A01 = L9J.A01(activity, l8q.A04);
        l8q.A01 = A01;
        l8q.A06 = View.MeasureSpec.makeMeasureSpec(A01, 1073741824);
        int A02 = L9J.A02(activity, l8q.A04, i);
        l8q.A00 = A02;
        l8q.A05 = View.MeasureSpec.makeMeasureSpec(A02, 1073741824);
    }

    public InterfaceC00713oe A02() {
        ComponentTree componentTree;
        LithoView lithoView = this.A03;
        InterfaceC00713oe interfaceC00713oe = null;
        if (lithoView != null && (componentTree = lithoView.A00) != null) {
            interfaceC00713oe = componentTree.A09;
        }
        return interfaceC00713oe;
    }

    public Jtt A03() {
        LYU lyu = (LYU) this.A08.get();
        if (lyu != null) {
            return lyu.A0Q.A02;
        }
        throw AnonymousClass001.A0N("mSurfaceManager is null in getContext(); did you call onDestroy() twice, or without calling onCreate()?");
    }

    public void A04(Activity activity, Bundle bundle, 5Tp r304, int i) {
        Bundle bundle2;
        2yD A0K = 1BK.A0K();
        if (A0K.AZk(36318836161786959L)) {
            Intent intent = activity.getIntent();
            if (bundle != null && (bundle2 = bundle.getBundle(4YT.A00(1511))) != null) {
                0EV r0 = new 0EV();
                r0.A01 = 02P.A00();
                String str = null;
                if (!r0.A00().A02(activity, intent, (C0w6) null)) {
                    if (A0K.AZk(36318836161852496L)) {
                        throw AnonymousClass001.A0N("Untrusted caller detected");
                    }
                    AnonymousClass047 ACu = ((AnonymousClass046) this.A02.get()).ACu("SurfaceDelegateUntrustedCaller", 817890422);
                    ACu.A8K(AnonymousClass000.A00(240), activity.getComponentName().flattenToString());
                    Iterator A0w = JR0.A0w(bundle2);
                    while (A0w.hasNext()) {
                        String A0i = AnonymousClass001.A0i(A0w);
                        Object obj = bundle2.get(A0i);
                        ACu.A8K(0Pz.A0W("surface_bundle_key_", A0i), obj != null ? obj.toString() : "null");
                    }
                    0EY A00 = C08g.A00(activity, intent);
                    if (A00 != null && A00.toString() != null) {
                        0EY A002 = C08g.A00(activity, intent);
                        if (A002 != null) {
                            str = A002.A01;
                        }
                        0EY A003 = C08g.A00(activity, intent);
                        String str2 = A003 != null ? A003.A02 : null;
                        0EY A004 = C08g.A00(activity, intent);
                        List list = A004 != null ? A004.A03 : null;
                        if (str == null) {
                            str = "";
                        }
                        ACu.A8K("domain_name", str);
                        ACu.A8K("package_names", list != null ? Arrays.toString(list.toArray()) : "");
                        if (str2 == null) {
                            str2 = "";
                        }
                        ACu.A8K(7zK.A00(455), str2);
                    }
                    ACu.report();
                }
            }
        }
        if (Boolean.TRUE.equals(r304.A03("only_prepare_data"))) {
            Intent intent2 = activity.getIntent();
            C4h0 c4h0 = 5Tf.A08;
            5iH.A00();
            5Tf.A06(5Tf.A03(activity, intent2, bundle, r304));
            5iH.A00();
            return;
        }
        AtomicReference atomicReference = this.A08;
        if (atomicReference.get() == null) {
            this.A04 = r304;
            this.A07.CMs(r304, "SurfaceDelegate", 0);
            atomicReference.set(5Tf.A01(activity, activity.getIntent(), bundle, r304));
            A01(activity, this, i);
            A00(activity, this);
        }
    }

    public void A05(Activity activity, 5Tp r303, int i) {
        A04(activity, null, r303, i);
    }
}
