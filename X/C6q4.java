package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.6q4, reason: invalid class name */
/* loaded from: 6q4.class */
public final class C6q4 implements CallerContextable {
    public static final String __redex_internal_original_name = "FrescoWebpTranscoder";
    public final AnonymousClass536 A00;
    public final CallerContext A01 = CallerContext.A06(C6q4.class);
    public final 2Ff A02;

    public C6q4() {
        AnonymousClass536 anonymousClass536 = (AnonymousClass536) 1Bi.A05(AnonymousClass536.class, (Class) null);
        this.A02 = (2Ff) 1Bi.A05(2Ff.class, (Class) null);
        this.A00 = anonymousClass536;
    }

    public static void A00(File file, InputStream inputStream) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                1MY.A00(inputStream, bufferedOutputStream);
                bufferedOutputStream.flush();
                1Cu.A00(bufferedOutputStream, false);
            } catch (Throwable th) {
                th = th;
                try {
                    bufferedOutputStream.close();
                    throw th;
                } catch (IOException unused) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void A01(BufferedInputStream bufferedInputStream, File file, Integer num) {
        IOException th;
        2GE A01 = ((2GX) 2GX.A04.getValue()).A01(bufferedInputStream);
        if (A01 == AbstractC05294de.A0B || !((A01 == AbstractC05294de.A0A || A01 == AbstractC05294de.A08 || A01 == AbstractC05294de.A09) && (!AbstractC05274dc.A01))) {
            A00(file, bufferedInputStream);
            return;
        }
        File A0A = this.A00.A0A(num, "twebp", "tmp");
        if (A0A == null) {
            throw AnonymousClass001.A0G("Input file null");
        }
        A00(A0A, bufferedInputStream);
        Uri uri = 0CO.A00;
        2Dp A00 = 2Dp.A00(Uri.fromFile(A0A));
        if (A00 == null) {
            throw AnonymousClass001.A0G("Could not create image request");
        }
        1OV A08 = this.A02.A08((2IE) null, A00, this.A01);
        try {
            try {
                2EU r0 = (2EU) HH8.A00(A08);
                if (r0 == null || !r0.A0A()) {
                    th = AnonymousClass001.A0G("Returned result is not valid");
                } else {
                    C05264db c05264db = null;
                    try {
                        C05264db c05264db2 = new C05264db((4dR) r0.A09());
                        try {
                            A00(file, c05264db2);
                            1Cu.A01(c05264db2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            c05264db = c05264db2;
                            1Cu.A01(c05264db);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Throwable th4) {
                new IOException("Data source failed", th4);
            }
            throw th;
        } finally {
            A08.AGD();
            A0A.delete();
        }
    }
}
