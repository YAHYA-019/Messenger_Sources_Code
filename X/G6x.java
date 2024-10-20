package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.ComponentsSystrace;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: G6x.class */
public final class G6x implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ 2Jd A02;
    public final /* synthetic */ FIG A03;
    public final /* synthetic */ GL7 A04;
    public final /* synthetic */ FyG A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    public G6x(2Jd r302, FIG fig, GL7 gl7, FyG fyG, List list, List list2, int i, int i2) {
        this.A03 = fig;
        this.A04 = gl7;
        this.A05 = fyG;
        this.A06 = list;
        this.A07 = list2;
        this.A01 = i;
        this.A02 = r302;
        this.A00 = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        FIG fig = this.A03;
        GL7 gl7 = this.A04;
        FyG fyG = this.A05;
        List list = this.A06;
        List list2 = this.A07;
        int i = this.A01;
        2Jd r0 = this.A02;
        int i2 = this.A00;
        boolean BWo = ComponentsSystrace.A00.BWo();
        if (BWo) {
            50G A06 = FJ3.A06(fyG);
            String BCx = gl7.BCx(36, "");
            int indexOf = BCx.indexOf(63);
            A06.ABk(0Pz.A0W("NtAsyncActionQuery: ", indexOf >= 0 ? BCx.substring(0, indexOf) : "unknown"));
        }
        C30G A0H = AbF.A0H(91);
        DKC.A1S(r0, A0H, "params");
        A0H.A06("profile_image_size", (AbstractC01653se.A00() * 94) / ActionId.OFFLINE);
        String BCx2 = gl7.BCx(49, "");
        if (!1JF.A0B(BCx2)) {
            A0H.A03("feed_story_render_location", BCx2);
            A0H.A03("fb_shorts_location", BCx2);
        }
        A0H.A08("include_image_ranges", !1BK.A0N(fig.A08).AZk(36313622070500146L));
        A0H.A08("fetch_messenger_contact", false);
        int i3 = gl7.getInt(58, 0);
        int i4 = gl7.getInt(59, 0);
        C3sa A00 = C3sa.A00(A0H);
        String string = gl7.getString(65);
        if (string != null && string.equals("graph_query")) {
            A00.A06 = 0S2.A01;
        }
        if (i3 == 0 || i4 == 0) {
            ((C3sb) A00).A03 = 0L;
        } else {
            long j = i4;
            A00.A0A(j);
            A00.A09(j);
        }
        FJ3.A01(fyG).A00(GOH.class);
        FIG.A00(fig, gl7, "query_start", i2);
        C03713yu A04 = ((1Vd) 1Lo.A04((Context) null, EUX.A00(fyG), fig.A02, 68050)).A04(A00);
        if (BWo) {
            FJ3.A06(fyG).AQF();
        }
        1Kd.A0D(fig.A0C, new FwF(r0, fig, gl7, fyG, list2, list, i2, gl7.Acj(), i), A04);
        return A04;
    }
}
