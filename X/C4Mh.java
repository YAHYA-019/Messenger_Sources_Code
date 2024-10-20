package X;

import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.List;

/* renamed from: X.4Mh, reason: invalid class name */
/* loaded from: 4Mh.class */
public final class C4Mh extends C04v {
    public final C4Mg A00;
    public final 4MI A01;
    public final DrawerFolderKey A02;
    public final HeterogeneousMap A03;
    public final Integer A04;
    public final String A05;
    public final List A06;

    public C4Mh(C4Mg c4Mg, 4MI r303, DrawerFolderKey drawerFolderKey, HeterogeneousMap heterogeneousMap, Integer num, String str, List list) {
        11T.A0F(str, 3);
        11T.A0F(heterogeneousMap, 4);
        this.A02 = drawerFolderKey;
        this.A01 = r303;
        this.A05 = str;
        this.A03 = heterogeneousMap;
        this.A04 = num;
        this.A06 = list;
        this.A00 = c4Mg;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4Mh)) {
                return false;
            }
            C4Mh c4Mh = (C4Mh) obj;
            if (!11T.A0O(this.A02, c4Mh.A02) || !11T.A0O(this.A01, c4Mh.A01) || !11T.A0O(this.A05, c4Mh.A05) || !11T.A0O(this.A03, c4Mh.A03) || !11T.A0O(this.A04, c4Mh.A04) || !11T.A0O(this.A06, c4Mh.A06) || this.A00 != c4Mh.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A05 = (((AnonymousClass002.A05(this.A03, AnonymousClass002.A07(this.A05, ((this.A02.hashCode() * 31) + AnonymousClass001.A02(this.A01)) * 31)) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A06)) * 31;
        C4Mg c4Mg = this.A00;
        if (c4Mg != null) {
            i = c4Mg.hashCode();
        }
        return A05 + i;
    }
}
