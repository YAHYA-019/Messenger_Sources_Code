package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;

/* loaded from: Km0.class */
public final class Km0 {
    public 1BY A00;
    public final Uri A01;
    public final Uri A02;
    public final LJf A03;
    public final LJg A04;
    public final String A05;
    public final Context A06;
    public final C15h A07 = new LuE(this, 7);

    public Km0(1BO r302) {
        Context A00 = FbInjector.A00();
        this.A06 = A00;
        this.A00 = 7zL.A0Q(r302);
        String A0j = 0Pz.A0j(A00.getPackageName(), ".", 1BJ.A00(474));
        this.A05 = A0j;
        Uri uri = null;
        try {
            uri = C0A2.A03(0Pz.A0W(1BJ.A00(ActionId.CONNECTIVITY_CHANGED), A0j));
        } catch (SecurityException unused) {
        }
        uri.getClass();
        this.A01 = uri;
        this.A04 = new LJg(this);
        this.A03 = new LJf(this);
        this.A02 = Uri.withAppendedPath(uri, "clear_all_data");
    }
}
