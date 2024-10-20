package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.15y, reason: invalid class name */
/* loaded from: 15y.class */
public final class C15y {
    public final C15u A00;
    public final AnonymousClass161 A01;
    public final File A02;

    public C15y(Context context, AnonymousClass161 anonymousClass161, C16f c16f, String str, String str2) {
        this.A00 = new C15u(new C15v(c16f), 0Pz.A0j("725056107548211", "|", "0e20c3123a90c76c02c901b7415ff67f"), str2);
        File A00 = 0eB.A00(context, 343672752);
        A00.mkdirs();
        File A0D = AnonymousClass001.A0D(A00, str);
        0Pz.A02("mqtt_analytics.", str, context.getFilesDir()).renameTo(A0D);
        this.A02 = A0D;
        this.A01 = anonymousClass161;
    }
}
