package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: Ho5.class */
public final class Ho5 {
    public int A00;
    public final List A01;

    public Ho5(String str, String str2, List list) {
        11T.A0F(str, 2);
        ArrayList A10 = 7zO.A10(list, 0);
        this.A01 = A10;
        0RC.A0y(A10, new SFI(str, str2));
        int size = A10.size();
        int i = size - 1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                break;
            }
            if (11T.A0O(((RT2) A10.get(i3)).A02, str)) {
                i = i3;
                break;
            }
            i2 = i3 + 1;
        }
        this.A00 = i;
    }

    public final String A00(int i) {
        List list = this.A01;
        return (i >= list.size() || i < 0) ? "off" : ((RT2) list.get(i)).A02;
    }
}
