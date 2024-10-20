package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hov.class */
public final class Hov {
    public final PackageManager A00;
    public final Context A01;
    public final boolean A02;
    public final boolean A03;

    public Hov(Context context, PackageManager packageManager, boolean z, boolean z2) {
        11T.A0F(packageManager, 2);
        this.A01 = context;
        this.A00 = packageManager;
        this.A02 = z;
        this.A03 = z2;
    }

    public final List A00() {
        ArrayList A0s = AnonymousClass001.A0s();
        if (1XU.A00(this.A01)) {
            return C0ty.A00;
        }
        Intent intent = new Intent(4YT.A00(255), MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        intent.setType(this.A03 ? "*/*" : this.A02 ? "image/*" : "image/jpeg");
        PackageManager packageManager = this.A00;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        11T.A0A(queryIntentActivities);
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            ActivityInfo activityInfo = next.activityInfo;
            String str = ((PackageItemInfo) activityInfo).packageName;
            if ("com.google.android.apps.photos".equals(str)) {
                intent.setComponent(new ComponentName(str, ((PackageItemInfo) activityInfo).name));
                Drawable loadIcon = next.loadIcon(packageManager);
                11T.A0A(loadIcon);
                A0s.add(new Hcj(intent, loadIcon));
                break;
            }
        }
        return 0QD.A0V(A0s);
    }
}
