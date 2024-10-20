package X;

import android.R;
import android.app.Service;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: C3n.class */
public final class C3n {
    public int A00;
    public int A01;
    public int A02;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.C3n, java.lang.Object] */
    public static C3n A00(Fragment fragment) {
        int i;
        int i2;
        if (AnonymousClass016.A00(fragment.getContext(), Service.class) != null) {
            Resources A0D = 7zO.A0D(fragment);
            View requireViewById = fragment.mView.getRootView().requireViewById(R.id.content);
            i = requireViewById.getWidth() - A0D.getDimensionPixelSize(2131165203);
            i2 = ((requireViewById.getHeight() - requireViewById.getPaddingTop()) - requireViewById.getPaddingBottom()) - A0D.getDimensionPixelSize(2131165194);
        } else {
            i = -1;
            i2 = -1;
        }
        ?? obj = new Object();
        obj.A02 = i;
        obj.A01 = i2;
        obj.A00 = -1;
        return obj;
    }

    public void A01(Bundle bundle) {
        bundle.putInt("arg_dialog_width", this.A02);
        bundle.putInt("arg_dialog_height", this.A01);
        bundle.putInt("arg_window_anim_style_res_id", this.A00);
    }
}
