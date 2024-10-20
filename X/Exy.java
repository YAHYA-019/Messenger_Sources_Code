package X;

import android.view.View;
import com.facebook.widget.loadingindicator.LoadingIndicatorView;
import com.google.common.base.Preconditions;

/* loaded from: Exy.class */
public final class Exy {
    public final View A00;
    public final LoadingIndicatorView A01;

    public Exy(View view, LoadingIndicatorView loadingIndicatorView) {
        this.A01 = loadingIndicatorView;
        this.A00 = view;
    }

    public void A00() {
        LoadingIndicatorView.A01(this.A01, 0S2.A0C, false);
        View view = this.A00;
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    public void A01() {
        this.A01.A0V();
        View view = this.A00;
        view.setVisibility(4);
        view.setAlpha(0.2f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.widget.loadingindicator.LoadingIndicatorState, java.lang.Object] */
    public void A02(GDV gdv) {
        Integer num = 0S2.A01;
        String string = this.A00.getContext().getString(2131957317);
        Preconditions.checkNotNull(string, "Error message cannot be null.");
        ?? obj = new Object();
        obj.A01 = num;
        obj.A02 = string;
        obj.A03 = null;
        obj.A00 = 0;
        this.A01.A0W(gdv, obj);
    }
}
