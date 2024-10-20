package X;

import android.database.CursorWindow;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* loaded from: K2t.class */
public final class K2t extends Lcm implements 28W {
    public ArrayList A00;
    public boolean A01;
    public final Status A02;

    public K2t(DataHolder dataHolder) {
        super(dataHolder);
        this.A01 = false;
        this.A02 = new Status(dataHolder.A05, null);
    }

    public static final void A00(K2t k2t) {
        synchronized (k2t) {
            if (!k2t.A01) {
                DataHolder dataHolder = ((Lcm) k2t).A00;
                AbstractC00481b7.A02(dataHolder);
                int i = dataHolder.A00;
                ArrayList A0s = AnonymousClass001.A0s();
                k2t.A00 = A0s;
                if (i > 0) {
                    AnonymousClass001.A1J(A0s, 0);
                    int A01 = dataHolder.A01(0);
                    DataHolder.A00(dataHolder, "path", 0);
                    CursorWindow[] cursorWindowArr = dataHolder.A07;
                    String string = cursorWindowArr[A01].getString(0, dataHolder.A01.getInt("path"));
                    int i2 = 1;
                    while (true) {
                        int i3 = i2;
                        if (i3 >= i) {
                            break;
                        }
                        int A012 = dataHolder.A01(i3);
                        DataHolder.A00(dataHolder, "path", i3);
                        String string2 = cursorWindowArr[A012].getString(i3, dataHolder.A01.getInt("path"));
                        if (string2 == null) {
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("Missing value for markerColumn: ");
                            A0k.append("path");
                            A0k.append(", at row: ");
                            A0k.append(i3);
                            throw AnonymousClass001.A0Q(AnonymousClass001.A0e(", for window: ", A0k, A012));
                        }
                        if (!string2.equals(string)) {
                            AnonymousClass001.A1J(k2t.A00, i3);
                            string = string2;
                        }
                        i2 = i3 + 1;
                    }
                }
                k2t.A01 = true;
            }
        }
    }

    public Status BCJ() {
        return this.A02;
    }
}
