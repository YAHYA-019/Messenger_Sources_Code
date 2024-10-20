package X;

import java.io.File;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: X.1b1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1b1.class */
public final class RunnableC00421b1 implements Runnable {
    public static final String __redex_internal_original_name = "DefaultUserScopePluginController$1";
    public final /* synthetic */ 1Z6 A00;
    public final /* synthetic */ 1aO A01;
    public final /* synthetic */ 1Yt A02;
    public final /* synthetic */ File A03;

    public RunnableC00421b1(1Z6 r302, 1aO r303, 1Yt r304, File file) {
        this.A01 = r303;
        this.A02 = r304;
        this.A00 = r302;
        this.A03 = file;
    }

    @Override // java.lang.Runnable
    public void run() {
        String absolutePath;
        1aO r0 = this.A01;
        1Yt r02 = this.A02;
        1Z6 r03 = this.A00;
        1Zj r305 = r03.A01;
        if (r305 == null) {
            r305 = r0.A02.A01();
        }
        1Zj A01 = 1aP.A01(r305, r02);
        File file = this.A03;
        C00571bg c00571bg = new C00571bg(A01, r02, r03.A03, System.currentTimeMillis());
        try {
            try {
                absolutePath = file.getCanonicalPath();
            } catch (IOException unused) {
                absolutePath = file.getAbsolutePath();
            }
            r0.A01.A03(absolutePath, c00571bg.D4Q());
        } catch (JSONException unused2) {
        }
    }
}
