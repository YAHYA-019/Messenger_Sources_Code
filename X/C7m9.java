package X;

import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.7m9, reason: invalid class name */
/* loaded from: 7m9.class */
public abstract class C7m9 {
    public static final void A00(1LI r301, LithoView lithoView, InterfaceC00713oe interfaceC00713oe) {
        ComponentTree componentTree = lithoView.A00;
        if (componentTree == null) {
            lithoView.A0z(ComponentTree.A01(r301, lithoView.A09, interfaceC00713oe).A00());
        } else {
            componentTree.A0O(r301);
        }
    }
}
