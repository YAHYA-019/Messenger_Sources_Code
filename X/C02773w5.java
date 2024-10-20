package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;

/* renamed from: X.3w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3w5.class */
public final class C02773w5 extends C08k {
    public final /* synthetic */ 1yL A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C02773w5(final 1yL r302) {
        super(new C08j() { // from class: X.3w6
            @Override // X.C08j
            public ArrayList Ara() {
                ArrayList arrayList = new ArrayList();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addDataScheme("package");
                arrayList.add(intentFilter);
                return arrayList;
            }

            @Override // X.C08j
            public void CFb(Context context, Intent intent, C01q c01q) {
                String schemeSpecificPart;
                11T.A0F(intent, 1);
                Uri data = intent.getData();
                if (data == null || (schemeSpecificPart = data.getSchemeSpecificPart()) == null || !schemeSpecificPart.equals("com.facebook.orca")) {
                    return;
                }
                r302.A02 = null;
            }
        });
        this.A00 = r302;
    }
}
