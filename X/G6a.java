package X;

import android.content.pm.PackageItemInfo;
import java.text.Collator;
import java.util.Comparator;

/* loaded from: G6a.class */
public final class G6a implements Comparator {
    public final java.util.Map A00;

    public G6a() {
        0QO r0 = new 0QO(3);
        this.A00 = r0;
        r0.put("com.facebook.orca", -16);
        r0.put("com.facebook.katana", -8);
        r0.put("com.facebook.wakizashi", -4);
        r0.put("com.whatsapp", -2);
        r0.put("com.instagram.android", 7zN.A0h());
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        EmK emK = (EmK) obj;
        EmK emK2 = (EmK) obj2;
        String str = ((PackageItemInfo) emK.A00).packageName;
        String str2 = ((PackageItemInfo) emK2.A00).packageName;
        java.util.Map map = this.A00;
        boolean containsKey = map.containsKey(str);
        boolean containsKey2 = map.containsKey(str2);
        if (!containsKey) {
            return containsKey2 ? -AnonymousClass001.A03(map.get(str2)) : Collator.getInstance().compare(emK.A02, emK2.A02);
        }
        int A03 = AnonymousClass001.A03(map.get(str));
        if (containsKey2) {
            A03 -= AnonymousClass001.A03(map.get(str2));
        }
        return A03;
    }
}
