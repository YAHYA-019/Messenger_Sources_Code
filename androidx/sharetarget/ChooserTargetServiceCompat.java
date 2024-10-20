package androidx.sharetarget;

import X.0Pz;
import X.1BK;
import X.4YU;
import X.4iO;
import X.4iX;
import X.4jV;
import X.AbE;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.Ke0;
import X.Kif;
import X.KyB;
import X.Lik;
import X.LtP;
import X.Ltd;
import X.Ltl;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.resources.compat.RedexResourcesCompat;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: ChooserTargetServiceCompat.class */
public class ChooserTargetServiceCompat extends ChooserTargetService {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r314v0 */
    /* JADX WARN: Type inference failed for: r314v1 */
    /* JADX WARN: Type inference failed for: r314v2, types: [java.util.AbstractCollection] */
    @Override // android.service.chooser.ChooserTargetService
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        List emptyList;
        IconCompat iconCompat;
        boolean z;
        Context applicationContext = getApplicationContext();
        if (KyB.A01 == null) {
            synchronized (KyB.A00) {
                if (KyB.A01 == null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Intent A0A = 4YU.A0A(AnonymousClass000.A00(44));
                    A0A.addCategory(AnonymousClass000.A00(89));
                    A0A.setPackage(applicationContext.getPackageName());
                    List<ResolveInfo> queryIntentActivities = applicationContext.getPackageManager().queryIntentActivities(A0A, 128);
                    if (queryIntentActivities != null) {
                        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                        while (it.hasNext()) {
                            ActivityInfo activityInfo = it.next().activityInfo;
                            Bundle bundle = ((PackageItemInfo) activityInfo).metaData;
                            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                                ArrayList A0s2 = AnonymousClass001.A0s();
                                XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(applicationContext.getPackageManager(), "android.app.shortcuts");
                                if (loadXmlMetaData == null) {
                                    throw 0Pz.A05("Failed to open android.app.shortcuts meta-data resource of ", ((PackageItemInfo) activityInfo).name);
                                }
                                while (true) {
                                    try {
                                        int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break;
                                        }
                                        if (next == 2 && loadXmlMetaData.getName().equals("share-target")) {
                                            String A00 = KyB.A00(loadXmlMetaData, AnonymousClass000.A00(ActionId.CARD_DATA_LOADED));
                                            ArrayList A0s3 = AnonymousClass001.A0s();
                                            ArrayList A0s4 = AnonymousClass001.A0s();
                                            while (true) {
                                                int next2 = loadXmlMetaData.next();
                                                if (next2 == 1) {
                                                    break;
                                                }
                                                if (next2 == 2) {
                                                    String name = loadXmlMetaData.getName();
                                                    if (name.equals("data")) {
                                                        KyB.A00(loadXmlMetaData, "scheme");
                                                        KyB.A00(loadXmlMetaData, ConstantsKt.DEVICE_ID_HOST);
                                                        KyB.A00(loadXmlMetaData, TraceFieldType.Port);
                                                        KyB.A00(loadXmlMetaData, "path");
                                                        KyB.A00(loadXmlMetaData, "pathPattern");
                                                        KyB.A00(loadXmlMetaData, "pathPrefix");
                                                        A0s3.add(new Ke0(KyB.A00(loadXmlMetaData, "mimeType")));
                                                    } else if (name.equals("category")) {
                                                        A0s4.add(KyB.A00(loadXmlMetaData, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                                                    }
                                                } else if (next2 == 3 && loadXmlMetaData.getName().equals("share-target")) {
                                                    break;
                                                }
                                            }
                                            if (A0s3.isEmpty() || A00 == null || A0s4.isEmpty()) {
                                                z = false;
                                            } else {
                                                new Kif(A00, (Ke0[]) A0s3.toArray(new Ke0[A0s3.size()]), AnonymousClass002.A0b(A0s4));
                                            }
                                            if (z) {
                                                A0s2.add(z);
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                                    }
                                }
                                loadXmlMetaData.close();
                                A0s.addAll(A0s2);
                            }
                        }
                    }
                    KyB.A01 = A0s;
                }
            }
        }
        ArrayList arrayList = KyB.A01;
        ArrayList A0s5 = AnonymousClass001.A0s();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Kif kif = (Kif) it2.next();
            if (kif.A00.equals(componentName.getClassName())) {
                Ke0[] ke0Arr = kif.A01;
                int length = ke0Arr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(ke0Arr[i].A00)) {
                        A0s5.add(kif);
                        break;
                    }
                    i++;
                }
            }
        }
        if (!A0s5.isEmpty()) {
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.getInstance(applicationContext);
            try {
                ArrayList<4iO> A0s6 = shortcutInfoCompatSaverImpl != null ? (List) shortcutInfoCompatSaverImpl.A05.submit((Callable) new LtP(shortcutInfoCompatSaverImpl)).get() : AnonymousClass001.A0s();
                if (A0s6 != null && !A0s6.isEmpty()) {
                    ArrayList A0s7 = AnonymousClass001.A0s();
                    for (4iO r0 : A0s6) {
                        Iterator it3 = A0s5.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Kif kif2 = (Kif) it3.next();
                                if (r0.A0F.containsAll(Arrays.asList(kif2.A02))) {
                                    A0s7.add(new Lik(new ComponentName(applicationContext.getPackageName(), kif2.A00), r0));
                                    break;
                                }
                            }
                        }
                    }
                    if (A0s7.isEmpty()) {
                        return AnonymousClass001.A0s();
                    }
                    Collections.sort(A0s7);
                    emptyList = AnonymousClass001.A0s();
                    float f = 1.0f;
                    int i2 = ((Lik) A0s7.get(0)).A01.A02;
                    Iterator it4 = A0s7.iterator();
                    while (it4.hasNext()) {
                        Lik lik = (Lik) it4.next();
                        4iO r02 = lik.A01;
                        Icon icon = null;
                        try {
                            4jV r03 = (4jV) shortcutInfoCompatSaverImpl.A05.submit(new Ltd(r02.A0D, shortcutInfoCompatSaverImpl, 0)).get();
                            iconCompat = null;
                            if (r03 != null) {
                                String str = r03.A02;
                                if (!TextUtils.isEmpty(str)) {
                                    int i3 = 0;
                                    try {
                                        i3 = RedexResourcesCompat.getIdentifier(shortcutInfoCompatSaverImpl.A00.getResources(), str, null, null);
                                    } catch (Exception unused) {
                                    }
                                    if (i3 != 0) {
                                        Context context = shortcutInfoCompatSaverImpl.A00;
                                        context.getClass();
                                        iconCompat = IconCompat.A00(context.getResources(), context.getPackageName(), i3);
                                    }
                                }
                                if (!TextUtils.isEmpty(r03.A01)) {
                                    Bitmap bitmap = (Bitmap) shortcutInfoCompatSaverImpl.A06.submit(new Ltl(r03, shortcutInfoCompatSaverImpl, 0)).get();
                                    if (bitmap != null) {
                                        iconCompat = IconCompat.A01(bitmap);
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e2);
                            iconCompat = null;
                        }
                        Bundle A05 = 1BK.A05();
                        A05.putString(AbE.A00(ActionId.VIEW_WILL_APPEAR_BEGIN), r02.A0D);
                        int i4 = r02.A02;
                        if (i2 != i4) {
                            f -= 0.01f;
                            i2 = i4;
                        }
                        CharSequence charSequence = r02.A0B;
                        if (iconCompat != null) {
                            icon = 4iX.A00((Context) null, iconCompat);
                        }
                        emptyList.add(new ChooserTarget(charSequence, icon, f, lik.A00, A05));
                    }
                    return emptyList;
                }
            } catch (Exception e3) {
                Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e3);
                return Collections.emptyList();
            }
        }
        emptyList = Collections.emptyList();
        return emptyList;
    }
}
