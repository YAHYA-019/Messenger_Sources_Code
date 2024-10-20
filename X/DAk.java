package X;

import android.util.Pair;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.nativepagereply.savedreplies.model.SavedReplyItem;
import com.facebook.user.model.User;
import java.util.Comparator;

/* loaded from: DAk.class */
public final class DAk implements Comparator {
    public final int A00;
    public final Object A01;

    public DAk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        boolean z;
        switch (this.A00) {
            case 0:
                Object obj3 = ((Pair) obj).first;
                Object obj4 = ((Pair) obj2).first;
                if (obj3 == null) {
                    return obj4 == null ? 0 : -1;
                }
                if (obj4 != null) {
                    return ((Float) obj4).compareTo((Float) obj3);
                }
                return 1;
            case 1:
                return 7zL.A13((User) obj).compareTo(7zL.A13((User) obj2));
            case 2:
                SavedReplyItem savedReplyItem = (SavedReplyItem) obj;
                SavedReplyItem savedReplyItem2 = (SavedReplyItem) obj2;
                Long l = savedReplyItem.A01;
                z = false;
                if (l != null && 4YU.A06(System.currentTimeMillis()) - l.longValue() <= 86400) {
                    z = true;
                }
                Long l2 = savedReplyItem2.A01;
                boolean z2 = false;
                if (l2 != null && 4YU.A06(System.currentTimeMillis()) - l2.longValue() <= 86400) {
                    z2 = true;
                }
                if (!(z2 ^ z)) {
                    long j = 0;
                    long A06 = AbK.A06(savedReplyItem2.A05);
                    Long l3 = savedReplyItem.A05;
                    if (l3 != null) {
                        j = l3.longValue();
                    }
                    return (int) (A06 - j);
                }
                break;
            case 3:
                return (int) (((RLU) obj).A00 - ((RLU) obj2).A00);
            case 4:
                2JY r0 = (GNv) obj;
                2JY r02 = (GNv) obj2;
                String A0k = r0.A0k();
                if (A0k != null && A0k.equals(r02.A0k())) {
                    return 0;
                }
                CIu cIu = (CIu) this.A01;
                z = cIu.A03(r0);
                if (z == cIu.A03(r02)) {
                    return AbI.A12((TreeJNI) r02, 1932333101).compareTo(AbI.A12((TreeJNI) r0, 1932333101));
                }
                break;
            default:
                return ((String) obj2).length() - ((String) obj).length();
        }
        return z ? -1 : 1;
    }
}
