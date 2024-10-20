package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.7tp, reason: invalid class name */
/* loaded from: 7tp.class */
public final class C7tp {
    public final ViewGroup A00;
    public final boolean A01;
    public final boolean A02;

    public C7tp(View view) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        this.A00 = viewGroup;
        boolean z = true;
        this.A01 = viewGroup != null ? viewGroup.getClipChildren() : true;
        this.A02 = viewGroup != null ? viewGroup.getClipToPadding() : z;
    }

    public C7tp(ViewParent viewParent) {
        ViewGroup viewGroup = viewParent instanceof ViewGroup ? (ViewGroup) viewParent : null;
        this.A00 = viewGroup;
        boolean z = true;
        this.A01 = viewGroup != null ? viewGroup.getClipChildren() : true;
        this.A02 = viewGroup != null ? viewGroup.getClipToPadding() : z;
    }
}
