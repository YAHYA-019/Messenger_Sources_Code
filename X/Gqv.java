package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import com.facebook.auth.usersession.FbUserSession;
import java.util.HashSet;

/* loaded from: Gqv.class */
public final class Gqv extends GS2 {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final HGB A03;
    public final HFr A04;
    public final Ht3 A05;
    public final 2Qn A06;
    public final HFc A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gqv(Context context, FbUserSession fbUserSession) {
        super("RtcMediaGridParticipantContainerPresenter");
        int A05 = 7zP.A05(context, fbUserSession, 1);
        this.A02 = 1Lm.A00(context, fbUserSession, 114852);
        this.A03 = new Gpl(this, 10);
        this.A04 = new Gq0(this, A05);
        this.A06 = IYv.A00(this, 24);
        this.A07 = new GqF(this, 3);
        this.A05 = new Gq8(this, 6);
        this.A01 = fbUserSession;
        this.A00 = context;
    }

    /* JADX WARN: Type inference failed for: r312v3, types: [X.HjT, java.lang.Object] */
    public static final void A00(Gqv gqv) {
        HjT hjT;
        Point point = GOp.A0Y(gqv.A02).A01;
        if (point.x == 0 || point.y == 0) {
            return;
        }
        JFq jFq = ((GS2) gqv).A00;
        boolean z = true;
        if (AbM.A1a(jFq) && GOq.A0A((JPB) AbM.A0r(jFq)) != 1) {
            z = false;
        }
        Rect rect = null;
        FbUserSession fbUserSession = gqv.A01;
        Context context = gqv.A00;
        HDa hDa = ((I4j) 1Lm.A05(context, fbUserSession, 114859)).A00;
        if ((hDa instanceof Gpw) && z) {
            rect = ((Gpw) hDa).A00.AZy();
        }
        IMK imk = (IMK) 1Lm.A05(context, fbUserSession, 98492);
        2Qa A0d = GOp.A0d(context, fbUserSession);
        FAb fAb = (FAb) 1Lm.A05(context, fbUserSession, 99472);
        JDB jdb = ((GS2) gqv).A01;
        if (AbM.A1a(jdb)) {
            IZq iZq = (IZq) AbM.A0r(jdb);
            ?? obj = new Object();
            ((HjT) obj).A04 = AnonymousClass001.A0v();
            iZq.getClass();
            ((HjT) obj).A02 = iZq.A02;
            ((HjT) obj).A05 = iZq.A05;
            ((HjT) obj).A06 = iZq.A06;
            ((HjT) obj).A07 = iZq.A07;
            ((HjT) obj).A01 = iZq.A01;
            ((HjT) obj).A00 = iZq.A00;
            ((HjT) obj).A03 = iZq.A03;
            ((HjT) obj).A04 = AbF.A1E(iZq.A04);
            hjT = obj;
        } else {
            hjT = new HjT();
        }
        Rect rect2 = imk.A07;
        hjT.A03 = rect2;
        C1pq.A08("windowInsetsPadding", rect2);
        if (!hjT.A04.contains("windowInsetsPadding")) {
            HashSet A1E = AbF.A1E(hjT.A04);
            hjT.A04 = A1E;
            A1E.add("windowInsetsPadding");
        }
        hjT.A06 = A0d.A05();
        hjT.A05 = fAb.A08;
        hjT.A00 = ((JOM) 1Lm.A05(context, fbUserSession, 114856)).A07;
        hjT.A01 = point;
        if (!hjT.A04.contains("mediaGridSize")) {
            HashSet A1E2 = AbF.A1E(hjT.A04);
            hjT.A04 = A1E2;
            A1E2.add("mediaGridSize");
        }
        hjT.A07 = z;
        hjT.A02 = rect;
        gqv.A0Z(new IZq(hjT));
    }
}
