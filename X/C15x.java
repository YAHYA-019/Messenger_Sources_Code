package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.15x, reason: invalid class name */
/* loaded from: 15x.class */
public final class C15x {
    public final AnonymousClass161 A00;
    public final File A01;

    public C15x(Context context, AnonymousClass161 anonymousClass161, String str) {
        File A00 = 0eB.A00(context, 343672752);
        A00.mkdirs();
        File A0D = AnonymousClass001.A0D(A00, str);
        0Pz.A02("mqtt_analytics.", str, context.getFilesDir()).renameTo(A0D);
        this.A01 = A0D;
        this.A00 = anonymousClass161;
    }
}
