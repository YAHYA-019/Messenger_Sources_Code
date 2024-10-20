package X;

import android.app.Activity;
import android.widget.TextView;
import java.util.LinkedList;

/* loaded from: Kpw.class */
public final class Kpw {
    public static Kpw A03;
    public static boolean A04;
    public TextView A00;
    public LinkedList A02 = AbF.A1F();
    public StringBuilder A01 = AnonymousClass001.A0k();

    public void A00(String str) {
        if (!A04 || this.A00 == null) {
            return;
        }
        int i = 0;
        for (String str2 : 0Pz.A0W(str, "\n").split("\n")) {
            this.A02.add(str2);
        }
        StringBuilder sb = this.A01;
        sb.setLength(0);
        while (true) {
            LinkedList linkedList = this.A02;
            if (i >= linkedList.size()) {
                ((Activity) this.A00.getContext()).runOnUiThread(new SAH(this, sb.toString()));
                return;
            } else {
                sb.append((String) linkedList.get(i));
                sb.append("\n");
                i++;
            }
        }
    }
}
