package X;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8hd, reason: invalid class name */
/* loaded from: 8hd.class */
public final class C8hd extends 1LH {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final ColorStateList A04;
    public final ColorStateList A05;
    public final View A06;
    public final Fragment A07;
    public final ThreadKey A08;
    public final C6wd A09;
    public final 6tM A0A;
    public final 2Of A0B;
    public final 6wX A0C;
    public final C6qq A0D;
    public final 79Q A0E;
    public final 79Q A0F;
    public final Boolean A0G;
    public final List A0H;
    public final Function1 A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final List A0N;
    public final List A0O;

    public C8hd(ColorStateList colorStateList, ColorStateList colorStateList2, View view, Fragment fragment, ThreadKey threadKey, C6wd c6wd, 6tM r308, 2Of r309, 6wX r310, C6qq c6qq, 79Q r312, 79Q r313, Boolean bool, List list, List list2, List list3, Function1 function1, float f, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        7zR.A1Q(r309, function1);
        this.A08 = threadKey;
        this.A0A = r308;
        this.A07 = fragment;
        this.A04 = colorStateList;
        this.A05 = colorStateList2;
        this.A01 = i;
        this.A00 = f;
        this.A0J = z;
        this.A0B = r309;
        this.A0I = function1;
        this.A0H = list;
        this.A0C = r310;
        this.A0F = r312;
        this.A0E = r313;
        this.A0N = list2;
        this.A02 = i2;
        this.A03 = i3;
        this.A0O = list3;
        this.A0D = c6qq;
        this.A09 = c6wd;
        this.A06 = view;
        this.A0M = z2;
        this.A0G = bool;
        this.A0L = z3;
        this.A0K = z4;
    }

    private final C1rh A01(C2k6 c2k6, String str) {
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0k(0S2.A01, 1.0f));
        long A0A = 7zP.A0A();
        long A08 = 7zQ.A08();
        long A0A2 = 7zO.A0A();
        Integer num = 0S2.A0u;
        2lO A0R = 7zT.A0R(4YV.A0K(A0g, num, A0A), A0A2, A08);
        C2sn A0L = 7zS.A0L(c2k6);
        2lO A0W = 7zS.A0W((2lO) null, new C5z8(0S2.A00, true), num, true, 1);
        long A0G = 7zP.A0G();
        int i = this.A02;
        Typeface typeface = Typeface.DEFAULT;
        long A082 = 7zP.A08();
        3yF A0v = 7zM.A0v(A0L.A00, str, 0);
        7zS.A1Q(A0L, A0v, i, A0G);
        A0v.A33(1);
        A0v.A34(typeface);
        7zU.A1H(A0L, A0v, 0, A082);
        7zU.A1L(A0v, false);
        7zS.A1V(A0v, false);
        7zS.A1B((2K8) null, A0L, A0W, A0v);
        return C2so.A0I(A0L, c2k6, A0R);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x055c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0s(X.C2k5 r302) {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8hd.A0s(X.2k5):X.1LI");
    }
}
