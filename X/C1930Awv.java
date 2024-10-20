package X;

import android.net.Uri;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Awv, reason: case insensitive filesystem */
/* loaded from: Awv.class */
public final class C1930Awv extends 1LH {
    public final MigColorScheme A00;
    public final List A01;

    public C1930Awv(MigColorScheme migColorScheme, List list) {
        this.A01 = list;
        this.A00 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        List<C8R> list = this.A01;
        if (list.isEmpty()) {
            return new 2AW();
        }
        ArrayList A0z = 1BL.A0z(list);
        for (C8R c8r : list) {
            2MQ r0 = c8r.A04;
            11T.A0A(r0);
            Uri uri = c8r.A02;
            int i = c8r.A01;
            MigColorScheme migColorScheme = this.A00;
            int i2 = c8r.A00;
            View.OnClickListener onClickListener = c8r.A03;
            11T.A0A(onClickListener);
            A0z.add(new 8hA(uri, onClickListener, r0, migColorScheme, i, i2, c8r.A05, c8r.A06));
        }
        return new C1932Awx(A0z, 7zL.A03());
    }
}
