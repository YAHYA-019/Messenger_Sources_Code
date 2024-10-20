package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Afi, reason: case insensitive filesystem */
/* loaded from: Afi.class */
public final class C1376Afi extends 2O4 {
    public final Object A02;
    public final Object A03;
    public final int A01 = 1;
    public int A00 = -1;

    public C1376Afi(C8uf c8uf, List list) {
        this.A03 = c8uf;
        this.A02 = list;
    }

    public C1376Afi(BeU beU, BlV blV) {
        this.A03 = beU;
        this.A02 = blV;
    }

    public void A06(RecyclerView recyclerView, int i) {
        int i2;
        int A1i;
        if (1 - this.A01 != 0) {
            super.A06(recyclerView, i);
            return;
        }
        11T.A0F(recyclerView, 0);
        GVb gVb = (GVb) this.A03;
        gVb.A09(i);
        if (gVb.A02 != null) {
            2XA r0 = recyclerView.A0F;
            11T.A0I(r0, 4YT.A00(43));
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r0;
            List list = (List) this.A02;
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                i2 = i3;
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (11T.A0O(((GjV) it.next()).A02, gVb.A02)) {
                    break;
                } else {
                    i3 = i2 + 1;
                }
            }
            if (((i != 0 || this.A00 == i2) && this.A00 != -1) || (A1i = linearLayoutManager.A1i()) < 0 || i2 < 0 || 11T.A0O(gVb.A02, ((GjV) list.get(A1i)).A02)) {
                return;
            }
            this.A00 = i2;
            gVb.A0A(A1i, i2);
        }
    }

    public void A07(RecyclerView recyclerView, int i, int i2) {
        int A1h;
        if (this.A01 != 0) {
            super.A07(recyclerView, i, i2);
            return;
        }
        11T.A0F(recyclerView, 0);
        if (!recyclerView.canScrollVertically(-1) && recyclerView.computeVerticalScrollRange() > recyclerView.getHeight()) {
            B5M b5m = ((BeU) this.A03).A00.A03;
            if (b5m.A01 != null) {
                1BY r0 = b5m.A00;
                6Io r02 = (6Io) 1Bn.A0E((Context) null, r0, 67893);
                FbUserSession A05 = 1Fw.A05(r0);
                FRXParams fRXParams = b5m.A01;
                ThreadKey threadKey = fRXParams.A04;
                C5yq c5yq = fRXParams.A00;
                String str = b5m.A07;
                long size = b5m.A0B.size();
                C5yl c5yl = b5m.A01.A09;
                11T.A0G(A05, 0, c5yq);
                11T.A0F(c5yl, 5);
                1UG A08 = 1BK.A08(r02.A00, "frx_messenger_feedback_select_messages_scrolled_to_top");
                if (A08.isSampled() && threadKey != null) {
                    6Io.A03(A08, r02);
                    A08.A6H("selected_message_count", Long.valueOf(size));
                    CPB.A03(A08, A05, r02, c5yq, threadKey);
                    AbM.A1H(A08, c5yl);
                    6Io.A02(A08, A05, r02, threadKey, str);
                }
            }
        }
        2XA r03 = recyclerView.A0F;
        if (!(r03 instanceof LinearLayoutManager) || this.A00 == (A1h = ((LinearLayoutManager) r03).A1h())) {
            return;
        }
        this.A00 = A1h;
        ((BlV) this.A02).A00.put("key_last_visible_item_position", Integer.valueOf(A1h));
    }
}
