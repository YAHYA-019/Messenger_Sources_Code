package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;

/* loaded from: Hhn.class */
public final class Hhn {
    public final Handler A00;
    public final LayoutInflater A01;
    public final J7J A02 = J7J.A02;
    public final Context A03;
    public final Handler.Callback A04;

    public Hhn(Context context) {
        IHU ihu = new IHU(this, 2);
        this.A04 = ihu;
        Context applicationContext = context.getApplicationContext();
        Resources.Theme theme = context.getTheme();
        ContextWrapper contextWrapper = new ContextWrapper(applicationContext);
        ((6FW) contextWrapper).A02 = theme;
        this.A03 = contextWrapper;
        this.A01 = new GTq(contextWrapper);
        this.A00 = new Handler(Looper.getMainLooper(), ihu);
    }
}
