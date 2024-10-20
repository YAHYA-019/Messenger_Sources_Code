package X;

import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* renamed from: X.6I0, reason: invalid class name */
/* loaded from: 6I0.class */
public final class C6I0 extends 6Fg implements C62t {
    public final C6G4 A00;
    public final Set A01 = new 0WH(0);
    public final Set A03 = new 0WH(0);
    public final Handler A02 = new Handler(Looper.getMainLooper());

    public C6I0(C6G2 c6g2, C6G4 c6g4) {
        c6g2.Cc6(this);
        this.A00 = c6g4;
    }

    public static final ImmutableList A00(C6I0 c6i0) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(c6i0.A03);
        ImmutableList build = builder.build();
        11T.A0A(build);
        return build;
    }

    @Override // X.C62t
    public void CUR(Hnn hnn) {
        this.A03.remove(hnn);
    }

    @Override // X.C62t
    public void CUS(Hnn hnn) {
        this.A03.add(hnn);
    }

    @Override // X.C62t
    public void CUT(String str) {
        this.A01.remove(str);
    }

    @Override // X.C62t
    public void CUU(String str) {
        this.A02.post(new AFB(this, str));
    }

    @Override // X.C62t
    public void CUW(String str) {
        this.A01.add(str);
    }
}
