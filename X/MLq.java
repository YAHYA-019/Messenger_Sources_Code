package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: MLq.class */
public interface MLq {
    static void A00(Context context, ImageView imageView, MLq mLq) {
        imageView.setImageDrawable(mLq.Apb(context));
    }

    Drawable Apb(Context context);

    View.OnClickListener B06();

    Drawable B0o(Context context);

    int BD5();

    boolean BRj();

    void C9i(String str);

    boolean isEnabled();
}
