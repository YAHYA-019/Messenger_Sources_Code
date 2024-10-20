package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ayx, reason: case insensitive filesystem */
/* loaded from: Ayx.class */
public final class C2004Ayx extends C1rj {
    public ImmutableList A00;

    public C2004Ayx() {
        super("AddParticipantsListComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ImmutableList immutableList = this.A00;
        11T.A0F(r302, 0);
        C2ki A00 = C2kV.A00(r302);
        7zL.A1K(r302);
        C8q8 c8q8 = new C8q8();
        ImmutableList of = ImmutableList.of((Object) immutableList);
        if (of != null) {
            if (c8q8.A00.isEmpty()) {
                c8q8.A00 = of;
            } else {
                c8q8.A00.addAll(of);
            }
        }
        A00.A2d(c8q8);
        A00.A2j(true);
        C2kV c2kV = A00.A01;
        c2kV.A0d = false;
        A00.A2h(true);
        c2kV.A0F = 1LI.A09(r302, C2004Ayx.class, "AddParticipantsListComponent", 1296908961);
        A00.A0T();
        return A00.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        Boolean bool = null;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 1296908961) {
            3xE r0 = (3xE) obj;
            View view = r0.A01;
            MotionEvent motionEvent = r0.A00;
            int A05 = 7zP.A05(view, motionEvent, 1);
            ViewParent parent = view.getParent();
            if (parent == null) {
                throw 1BK.A0h();
            }
            if (view.canScrollVertically(-1) && (motionEvent.getAction() == 0 || motionEvent.getAction() == A05)) {
                parent.requestDisallowInterceptTouchEvent(true);
            } else {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            bool = false;
        }
        return bool;
    }
}
