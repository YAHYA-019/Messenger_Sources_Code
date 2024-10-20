package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Azq, reason: case insensitive filesystem */
/* loaded from: Azq.class */
public final class C2029Azq extends C1rj {
    public static final CallerContext A02 = CallerContext.A0B("ProfilePicTileLayoutSpec");
    public int A00;
    public C58t A01;

    public C2029Azq() {
        super("ProfilePicTileLayout");
    }

    public final Object[] A0k() {
        return AnonymousClass001.A1b(this.A01, this.A00);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C58t c58t = this.A01;
        int i = this.A00;
        String str = c58t.A00.A00(i).url;
        5BH A01 = 5BG.A01(r302);
        C07004ik A00 = 5BI.A00(C06974ih.A0Q);
        ((C07014il) A00).A04 = 5BK.A05;
        A00.A03(2132213982);
        C06984ii.A01(A01, A00);
        A01.A2b(A02);
        Uri uri = null;
        try {
            uri = C0A2.A03(str);
        } catch (SecurityException unused) {
        }
        A01.A2X(uri);
        A01.A0C(i);
        A01.A1L(i);
        A01.A0J();
        return A01.A00;
    }
}
