package X;

import com.facebook.messaging.sharing.broadcastflow.model.LoadMoreState;
import com.google.common.collect.ImmutableList;

/* loaded from: C6r.class */
public final class C6r {
    public final /* synthetic */ CtJ A00;

    public C6r(CtJ ctJ) {
        this.A00 = ctJ;
    }

    public void A00(ImmutableList immutableList) {
        String str;
        11T.A0F(immutableList, 0);
        CtJ ctJ = this.A00;
        DJZ djz = ctJ.A07;
        Bz9 Ay4 = djz.Ay4();
        Ay4.A0P = immutableList;
        CLz cLz = (CLz) immutableList.get(immutableList.size() - 1);
        if (((C1j) 1Br.A0B(ctJ.A02)).A00() && (str = cLz.A02) != null && str.equals("suggested_top")) {
            Ay4.A0D = LoadMoreState.HAS_MORE_TO_LOAD;
        }
        DJZ.A00(Ay4, djz);
        BzA Ay1 = djz.Ay1();
        11T.A0A(Ay1);
        if (Ay1.A0G.A0F) {
            ctJ.A08.D7P(BKo.A01, "SHARE_ROOM_TO_FACEBOOK_ID");
        }
    }

    public void A01(Throwable th) {
        String str;
        CtJ ctJ = this.A00;
        AnonymousClass047 ACu = ((AnonymousClass046) 1De.A00(ctJ.A01, 16669)).ACu("section_load_error", 794502924);
        ACu.Cmr(th);
        ACu.report();
        3QF.A00((3QF) ctJ.A0B.get(), (short) 3);
        str = "ERROR_FAILED_TO_LOAD_CONTACTS";
        ctJ.A06.CoW(str);
        1SG r0 = (1SG) 1Br.A0B(ctJ.A05);
        String message = th.getMessage();
        r0.A0J(message != null ? message : "ERROR_FAILED_TO_LOAD_CONTACTS");
    }
}
