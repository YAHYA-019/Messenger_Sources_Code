package X;

import java.util.ArrayList;
import org.webrtc.legacy.EglBase;

/* loaded from: Hoi.class */
public final class Hoi {
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public int[] A00() {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass001.A1J(A0s, 12324);
        A0s.add(8);
        AnonymousClass001.A1J(A0s, 12323);
        A0s.add(8);
        AnonymousClass001.A1J(A0s, 12322);
        A0s.add(8);
        if (this.A00) {
            AnonymousClass001.A1J(A0s, 12321);
            A0s.add(8);
        }
        AnonymousClass001.A1J(A0s, 12352);
        AnonymousClass001.A1J(A0s, 4);
        if (this.A02) {
            AnonymousClass001.A1J(A0s, 12339);
            AnonymousClass001.A1J(A0s, 1);
        }
        if (this.A01) {
            AnonymousClass001.A1J(A0s, EglBase.EGL_RECORDABLE_ANDROID);
            AnonymousClass001.A1J(A0s, 1);
        }
        AnonymousClass001.A1J(A0s, 12344);
        int[] iArr = new int[A0s.size()];
        for (int i = 0; i < A0s.size(); i++) {
            iArr[i] = AnonymousClass001.A03(A0s.get(i));
        }
        return iArr;
    }
}
