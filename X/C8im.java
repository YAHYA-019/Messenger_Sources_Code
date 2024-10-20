package X;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.8im, reason: invalid class name */
/* loaded from: 8im.class */
public final class C8im extends 2Kb {
    public final 8LA A00;
    public final 9Ac A01;
    public final MigColorScheme A02;

    public C8im(8LA r302, 9Ac r303, MigColorScheme migColorScheme) {
        7zR.A1O(migColorScheme, r303);
        this.A00 = r302;
        this.A02 = migColorScheme;
        this.A01 = r303;
    }

    /* JADX WARN: Type inference failed for: r0v65, types: [X.78B, java.lang.Object] */
    public static final C2hl A00(Drawable drawable, C1790AsO c1790AsO, C2k6 c2k6, C8im c8im, float[] fArr) {
        8CB r0 = new 8CB((JXT) null, (DefaultConstructorMarker) null, 1);
        C2hj A0m = 7zL.A0m();
        C1ro c1ro = C1ro.CENTER;
        C1rp c1rp = C1rp.CENTER;
        1Iw AeS = c2k6.AeS();
        ArrayList A0s = AnonymousClass001.A0s();
        11T.A0F(AeS, 1);
        long doubleToRawLongBits = Double.doubleToRawLongBits(50.0d);
        final AW4 aw4 = new AW4(r0, 30);
        Dud A01 = Dzc.A01(AeS);
        C85d A00 = 7Gw.A00(AeS);
        2lQ r02 = 2lO.A02;
        7zS.A1M(A00, 4YV.A0L((2lO) null, 0S2.A15, drawable, 1), 0S2.A03, AVH.A00(c1790AsO, c8im, 40), 1);
        A00.A2Y(fArr);
        MigColorScheme migColorScheme = c8im.A02;
        int AUz = migColorScheme.AUz();
        C1qb c1qb = new C1qb(AeS);
        7Gp r03 = new 7Gp();
        C1rs c1rs = new C1rs(r03, AeS, 0, 0);
        ((7Gq) c1rs).A01 = r03;
        ((7Gq) c1rs).A00 = AeS;
        String str = c1790AsO.A02;
        r03.A0G = str;
        int BKh = migColorScheme.BKh();
        7Gp r04 = ((7Gq) c1rs).A01;
        r04.A01 = BKh;
        r04.A04 = 7zL.A05(c1rs, 2132279352);
        ((7Gq) c1rs).A01.A03 = 2132279492;
        c1rs.A0J();
        7Gp r05 = ((7Gq) c1rs).A01;
        11T.A0A(r05);
        A00.A2X(new 7Gs(r05, c1qb, (78B) new Object(), String.valueOf(str.hashCode()), C0ty.A00, AUz, 255));
        A01.A2c(A00.A2V());
        C1qo c1qo = AeS.A0E;
        11T.A0A(c1qo);
        A01.A2a(C2lu.A00());
        A01.A2g(false);
        A01.A2X();
        A01.A2h(true);
        A01.A2f(false);
        7zU.A1M(A01, c1qo, doubleToRawLongBits, false);
        A01.A2d(new GEy() { // from class: X.9sz
            @Override // X.GEy
            public final /* synthetic */ boolean C25(MotionEvent motionEvent, NestedScrollView nestedScrollView) {
                return AnonymousClass001.A1V(Function2.this.invoke(nestedScrollView, motionEvent));
            }
        });
        Dzc A2V = A01.A2V();
        11T.A0D(A2V);
        A0s.add(A2V);
        return 7zM.A0t(new C1rh(null, c1ro, c1rp, null, A0s, false), A0m);
    }

    public C2lt A0s(2lX r302) {
        Object A00 = 2rO.A00(r302, new AQa(r302, 46), 7zL.A1Z(r302));
        Object A002 = 2rO.A00(r302, new AKX(A00, this, 7), new Object[0]);
        Object A003 = 2rO.A00(r302, new AQa(r302, 45), new Object[0]);
        2lQ r0 = 2lO.A02;
        return new C2lt(C82m.A06(0S2.A01, 100.0f, 0), new A2t(0, 0), 7zQ.A0r(r302, 7zQ.A0s(new A2L(this), false), new ARW(10, A002, A003, A00, r302, this)));
    }
}
