package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: GXn.class */
public final class GXn extends C2lb {
    public Intent A00;
    public HRp A01;
    public MigColorScheme A02;
    public Integer A03;
    public final View A04;
    public final ImageView A05;
    public final TextView A06;

    public GXn(View view, MigColorScheme migColorScheme, Integer num) {
        super(view);
        this.A04 = view;
        this.A05 = GOn.A0I(view, 2131364519);
        this.A06 = AbF.A06(view, 2131363679);
        this.A02 = migColorScheme;
        this.A03 = num;
    }
}
