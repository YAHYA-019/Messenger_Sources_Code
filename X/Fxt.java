package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: Fxt.class */
public final class Fxt implements GHJ {
    public final int A00;
    public final Object A01;

    public Fxt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final void Cim(int i) {
        C00m c00m;
        switch (this.A00) {
            case 0:
                c00m = (C00m) this.A01;
                c00m.invoke();
                return;
            case 1:
                ((Btn) this.A01).A04.set(false);
                return;
            case 2:
                Context context = (Context) this.A01;
                if (context instanceof FragmentActivity) {
                    ((Activity) context).finish();
                    return;
                }
                return;
            case 3:
                ((FbFragmentActivity) this.A01).finish();
                return;
            default:
                c00m = ((Egt) this.A01).A00.A04;
                c00m.invoke();
                return;
        }
    }
}
