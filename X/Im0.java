package X;

import android.graphics.drawable.Drawable;
import com.facebook.messaging.reactions.FastMessageReactionsPanelView;

/* loaded from: Im0.class */
public final class Im0 implements 7Lc {
    public final /* synthetic */ FastMessageReactionsPanelView A00;

    public Im0(FastMessageReactionsPanelView fastMessageReactionsPanelView) {
        this.A00 = fastMessageReactionsPanelView;
    }

    public void CFT(String[] strArr) {
        boolean z;
        java.util.Map map;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= strArr.length) {
                this.A00.invalidate();
                return;
            }
            FastMessageReactionsPanelView fastMessageReactionsPanelView = this.A00;
            Gzv gzv = fastMessageReactionsPanelView.A0j[i2];
            String str = strArr[i2];
            HiK hiK = fastMessageReactionsPanelView.A0U;
            gzv.A0C = str;
            Drawable B5s = gzv.A0B.B5s(gzv.A05, str);
            gzv.A06 = B5s;
            if (B5s != null) {
                B5s.setCallback(gzv.A07);
                Drawable drawable = gzv.A06;
                int i3 = gzv.A02;
                drawable.setBounds(0, 0, i3, i3);
            }
            synchronized (hiK) {
                z = hiK.A02;
            }
            if (z) {
                synchronized (hiK) {
                    map = hiK.A01;
                }
                5Gr r0 = (5Gr) map.get(str);
                gzv.A08 = null;
                gzv.A00(r0);
            }
            Gzv gzv2 = fastMessageReactionsPanelView.A0j[i2];
            gzv2.A0D = true;
            5Gk r02 = gzv2.A08;
            if (r02 != null) {
                r02.CXT();
            }
            i = i2 + 1;
        }
    }
}
