package X;

import java.util.ArrayList;

/* loaded from: Ezg.class */
public final class Ezg {
    public boolean A01 = false;
    public ArrayList A00 = AnonymousClass001.A0s();

    public void A00() {
        if (this.A01) {
            int i = 0;
            while (true) {
                int i2 = i;
                ArrayList arrayList = this.A00;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((69W) arrayList.get(i2)).A04();
                i = i2 + 1;
            }
        }
        this.A00.clear();
    }

    public void A01() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        int i = 0;
        while (true) {
            int i2 = i;
            ArrayList arrayList = this.A00;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((69W) arrayList.get(i2)).A03();
            i = i2 + 1;
        }
    }

    public void A02() {
        if (!this.A01) {
            return;
        }
        int i = 0;
        this.A01 = false;
        while (true) {
            ArrayList arrayList = this.A00;
            if (i >= arrayList.size()) {
                return;
            }
            ((69W) arrayList.get(i)).A04();
            i++;
        }
    }

    public void A03(69W r302) {
        ArrayList arrayList = this.A00;
        int size = arrayList.size();
        C0By.A01(size, arrayList.size() + 1);
        arrayList.add(size, r302);
        if (this.A01) {
            r302.A03();
        }
    }
}
