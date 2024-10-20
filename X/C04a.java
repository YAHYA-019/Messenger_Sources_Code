package X;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.io.IOException;

/* renamed from: X.04a, reason: invalid class name */
/* loaded from: 04a.class */
public final class C04a {
    public 04Z A00;
    public final Context A01;
    public final Handler A02;
    public final 04W A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C04a(Context context, Handler handler, 04Z r304, 04W r305, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = context;
        this.A04 = str;
        this.A03 = r305;
        this.A00 = r304;
        this.A02 = handler;
        this.A0A = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A09 = z4;
        this.A05 = str2;
        this.A06 = z5;
    }

    public String A00() {
        File A00 = 0eB.A00(this.A01, 194178138);
        A00.mkdirs();
        try {
            return new File(A00, this.A04.replace('.', '_').replace(':', '_')).getCanonicalPath();
        } catch (IOException e) {
            C0iy.A00().Bwu("SigquitTimeFilePath", e, null);
            return null;
        }
    }
}
