package X;

import android.content.Context;
import com.facebook.deadcode.DeadCodeConfigSync;
import java.io.File;

/* renamed from: X.4Ba, reason: invalid class name */
/* loaded from: 4Ba.class */
public final class C4Ba implements C4Ah {
    public static final String __redex_internal_original_name = "DeadCodeUploadConditionalWorkerInfo";
    public 1BY A00;
    public final C15h A04 = new C4Xg(this, 6);
    public final C00i A02 = new 1BQ(49264);
    public final C00i A03 = new 1BQ(16385);
    public final C00i A01 = new 1BV((1BY) null, 83719);

    public C4Ba(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A04;
    }

    @Override // X.C4Ah
    public long Aro() {
        C00i c00i = this.A03;
        2yD r0 = (2yD) c00i.get();
        1GD r02 = 1GD.A07;
        if (r0.AZr(r02, 36311384392272673L)) {
            return 7200000L;
        }
        return ((2yD) c00i.get()).Av9(r02, 36592146404737477L) * 60000;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(264489761323070L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        C00i c00i = this.A03;
        C4Am c4Am = (((2yD) c00i.get()).AZr(1GD.A07, 36311384392272673L) && 1BK.A0N(c00i).AZk(36311384393124643L)) ? C4Am.FOREGROUND_OR_BACKGROUND : C4Am.BACKGROUND;
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, c4Am);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        C4Ak.A00(c4Ak, C4Ax.A01);
        return c4Ak.A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        C00i c00i = this.A03;
        return (((2yD) c00i.get()).AZr(1GD.A07, 36311384392272673L) && 1BK.A0N(c00i).AZk(36311384393124643L)) ? 4CA.A01 : 4CA.A04;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        boolean z;
        boolean z2;
        boolean z3;
        File A00;
        String[] list;
        C00i c00i = this.A02;
        DeadCodeConfigSync deadCodeConfigSync = (DeadCodeConfigSync) c00i.get();
        synchronized (deadCodeConfigSync) {
            try {
                z = deadCodeConfigSync.A00;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return true;
        }
        DeadCodeConfigSync deadCodeConfigSync2 = (DeadCodeConfigSync) c00i.get();
        synchronized (deadCodeConfigSync2) {
            z2 = deadCodeConfigSync2.A02;
        }
        if (z2) {
            return true;
        }
        deadCodeConfigSync = (DeadCodeConfigSync) c00i.get();
        synchronized (deadCodeConfigSync) {
            z3 = deadCodeConfigSync.A01;
        }
        if (z3) {
            return true;
        }
        Context context = (Context) this.A01.get();
        return 0Ky.A02(context) && (A00 = 0Ky.A00(context)) != null && (list = A00.list()) != null && list.length > 0;
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}
