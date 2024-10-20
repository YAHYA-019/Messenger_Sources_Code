package X;

import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.lang.ref.Reference;
import java.util.List;

/* loaded from: ABj.class */
public final class ABj implements 1K9 {
    public final int A00;
    public final Object A01;

    public ABj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                ((C6gt) this.A01).A00++;
                return;
            case 1:
                11T.A0F(th, 0);
                ((7Vh) this.A01).onFailure(th);
                return;
            case 2:
                11T.A0F(th, 0);
                ((5Vx) this.A01).onFailure(th);
                return;
            case 9:
                5Qu.A00((5Qu) this.A01, false);
                5Qu.A02.set(false);
                return;
            case 10:
                11T.A0F(th, 0);
                0fH.A0u("EmojiPluginSpec", "Couldn't get recent emojis", th);
                return;
            case 11:
                6RU r0 = (6RU) ((Reference) this.A01).get();
                if (r0 != null) {
                    7FI.A02(r0, R40.A00(0S2.A0j, (Object) null, "sticker_search_id"));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        6RU r304;
        7BS r306;
        long A08;
        1Ql A082;
        1G9 r308;
        1Br r3062;
        2JY r0;
        2JY A0U;
        String A0r;
        String A0r2;
        String A0r3;
        switch (this.A00) {
            case 0:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                if (abstractC08294mh == null || (r0 = (2JY) abstractC08294mh.A03) == null || (A0U = r0.A0U(2JX.class, 1864782006)) == null || (A0r = A0U.A0r(509082976)) == null || (A0r2 = A0U.A0r(1902653363)) == null || (A0r3 = A0U.A0r(715085077)) == null) {
                    return;
                }
                C6gt c6gt = (C6gt) this.A01;
                c6gt.A05 = A0r;
                c6gt.A04 = A0r2;
                c6gt.A02 = A0U.A0j();
                c6gt.A03 = A0r3;
                c6gt.A00++;
                return;
            case 1:
                ThreadSummary threadSummary = (ThreadSummary) obj;
                7Vh r02 = (7Vh) this.A01;
                if (threadSummary == null) {
                    r02.onFailure(AnonymousClass001.A0T("Unexpected null"));
                    return;
                } else {
                    r02.COa(threadSummary);
                    return;
                }
            case 2:
                C2sg c2sg = (C2sg) obj;
                5Vx r03 = (5Vx) this.A01;
                if (c2sg == null) {
                    r03.onFailure(AnonymousClass001.A0T("Unexpected null"));
                    return;
                } else {
                    r03.COX(c2sg);
                    return;
                }
            case 3:
            case 5:
                return;
            case 4:
                A08 = 7zS.A08((Number) obj);
                5Nq r04 = (5Nq) this.A01;
                A082 = 1Br.A08(r04.A01);
                r308 = 1NK.A4N;
                r3062 = r04.A04;
                A082.CaH(1Br.A0A(r3062, r308), A08);
                A082.commitImmediately();
                return;
            case 6:
            case 8:
            default:
                java.util.Map map = (java.util.Map) obj;
                if (map == null || map.isEmpty()) {
                    return;
                }
                C7Nz c7Nz = (C7Nz) this.A01;
                InterstitialTrigger interstitialTrigger = 2bG.A0G;
                11T.A0B(interstitialTrigger);
                c7Nz.D59(interstitialTrigger, 0S2.A01, map);
                return;
            case 7:
                Number number = (Number) obj;
                A08 = number != null ? number.longValue() : -1;
                5Nr r05 = (5Nr) this.A01;
                A082 = 1Br.A08(r05.A01);
                r308 = 1NK.A5j;
                r3062 = r05.A03;
                A082.CaH(1Br.A0A(r3062, r308), A08);
                A082.commitImmediately();
                return;
            case 9:
                5Qu.A00((5Qu) this.A01, true);
                5Qu.A02.set(false);
                return;
            case 10:
                List list = (List) obj;
                r304 = (6RU) this.A01;
                if (list == null) {
                    list = C0ty.A00;
                }
                11T.A0F(list, 0);
                r306 = new 7BS(list);
                7FI.A02(r304, r306);
                return;
            case 11:
                r304 = (6RU) ((Reference) this.A01).get();
                if (r304 != null) {
                    r306 = R40.A00(0S2.A0j, obj, "sticker_search_id");
                    7FI.A02(r304, r306);
                    return;
                }
                return;
            case 12:
                C6va c6va = (C6va) obj;
                if (c6va != null) {
                    ((C6w4) this.A01).A09.A00(c6va);
                    return;
                }
                return;
        }
    }
}
