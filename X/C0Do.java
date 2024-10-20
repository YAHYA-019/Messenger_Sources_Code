package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.0Do, reason: invalid class name */
/* loaded from: 0Do.class */
public final /* synthetic */ class C0Do implements Runnable {
    public static final String __redex_internal_original_name = "ForegroundEntityMapper$$ExternalSyntheticLambda0";
    public final /* synthetic */ 0WC A00;

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        0WC r0 = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(r0.A02);
        sb.append("_entity");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(sb.toString()));
            try {
                Properties properties = new Properties();
                synchronized (r0) {
                    properties.putAll(r0.A03);
                }
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    0Ug.A00(th, th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e = e;
            str = "ForegroundEntityMapper";
            str2 = "Error saving entity map";
            0fH.A0r(str, str2, e);
        } catch (AssertionError e2) {
            e = e2;
            str = "ForegroundEntityMapper";
            str2 = "Error storing properties";
            0fH.A0r(str, str2, e);
        }
    }
}
