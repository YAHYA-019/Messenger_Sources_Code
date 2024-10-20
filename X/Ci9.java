package X;

import android.content.Context;
import com.facebook.messaging.sharedimage.SharedMedia;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Ci9.class */
public final class Ci9 implements AXc {
    public final /* synthetic */ CEO A00;
    public final /* synthetic */ ImmutableList A01;

    public Ci9(CEO ceo, ImmutableList immutableList) {
        this.A00 = ceo;
        this.A01 = immutableList;
    }

    @Override // X.AXc
    public void Bos(SharedMedia sharedMedia) {
        CEO ceo = this.A00;
        82O r0 = ceo.A01;
        Context context = ceo.A00;
        r0.A0L(context, ceo.A02).A02(BNV.A1i, "thread_settings_row");
        DKT A0P = 7zQ.A0P();
        ImmutableList.Builder A0h = 4YU.A0h();
        ImmutableList immutableList = this.A01;
        11T.A0D(immutableList);
        ArrayList A0z = 1BL.A0z(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            A0z.add(((Boj) it.next()).A02);
        }
        ImmutableList A0y = AbG.A0y(A0h, A0z);
        String str = sharedMedia.A05;
        int indexOf = A0y.indexOf(str);
        CP0 A00 = CP0.A00("com.bloks.www.bloks.bmc.ccg.photo_viewer");
        if (str == null) {
            str = "";
        }
        A00.A04(str, "photo_id");
        A00.A04(A0y, "photo_id_list");
        A00.A04(String.valueOf(sharedMedia.A02.A0D), "photo_url");
        A00.A04(Integer.valueOf(indexOf), "initial_index");
        A0P.A0A(context, A00.A03());
    }
}
