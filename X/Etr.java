package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequest;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Etr.class */
public final class Etr {
    public Ei4 A00;
    public final 1Br A01;
    public final String A02;

    public Etr(Context context, Ei4 ei4) {
        11T.A0F(ei4, 1);
        this.A00 = ei4;
        this.A01 = DKC.A0X();
        String packageName = context.getPackageName();
        11T.A0A(packageName);
        this.A02 = packageName;
    }

    public Bundle A00(Bundle bundle, String str) {
        Integer num;
        int i;
        String str2 = ENq.A01.mPackageName;
        String str3 = this.A02;
        boolean z = ((11T.A0O(str2, str3) || 11T.A0O(ENq.A02.mPackageName, str3)) && 1Br.A07(this.A01).AZk(18302324527147474L)) || (11T.A0O(ENq.A04.mPackageName, str3) && 1Br.A07(this.A01).AZk(18302324527278547L));
        Bundle A05 = 1BK.A05();
        if (z) {
            if (str.equals("SAVE")) {
                num = 0S2.A00;
            } else {
                if (!str.equals("DELETE")) {
                    throw AnonymousClass001.A0L(str);
                }
                num = 0S2.A01;
            }
            try {
            } catch (JSONException unused) {
                i = -1;
            }
            if (num.intValue() != 0) {
                ClassLoader classLoader = FXAccessLibraryDeviceRequest.class.getClassLoader();
                if (classLoader != null) {
                    bundle.setClassLoader(classLoader);
                    FXAccessLibraryDeviceRequest fXAccessLibraryDeviceRequest = (FXAccessLibraryDeviceRequest) bundle.getParcelable("device_request");
                    Ei4 ei4 = this.A00;
                    if (fXAccessLibraryDeviceRequest != null) {
                        GCE gce = (GCE) 1Br.A0B(ei4.A00);
                        new ArrayList();
                        ArrayList A0s = AnonymousClass001.A0s();
                        Iterator it = 1BK.A17(fXAccessLibraryDeviceRequest.A00).iterator();
                        while (it.hasNext()) {
                            FXAccessLibraryDeviceRequestItem fXAccessLibraryDeviceRequestItem = (FXAccessLibraryDeviceRequestItem) it.next();
                            A0s.add(0Pz.A0W(fXAccessLibraryDeviceRequestItem.A00.mPrefPrefix, fXAccessLibraryDeviceRequestItem.A01.mPrefPrefix));
                        }
                        Iterator it2 = A0s.iterator();
                        while (it2.hasNext()) {
                            String A0i = AnonymousClass001.A0i(it2);
                            1Ql A08 = 1Br.A08(gce.A00);
                            1G9 r0 = EZx.A00;
                            11T.A0F(A0i, 0);
                            A08.CfI(r0.A0F(A0i));
                            A08.commit();
                        }
                        i = 1;
                        A05.putInt("device_result", i);
                    }
                }
                i = 0;
                A05.putInt("device_result", i);
            } else {
                ClassLoader classLoader2 = FXDeviceItem.class.getClassLoader();
                if (classLoader2 != null) {
                    bundle.setClassLoader(classLoader2);
                    Parcelable[] parcelableArray = bundle.getParcelableArray("device_items");
                    if (parcelableArray != null) {
                        int length = parcelableArray.length;
                        if (length > 0) {
                            FXDeviceItem[] fXDeviceItemArr = new FXDeviceItem[length];
                            for (int i2 = 0; i2 < length; i2++) {
                                fXDeviceItemArr[i2] = (FXDeviceItem) parcelableArray[i2];
                            }
                            Ei4 ei42 = this.A00;
                            int i3 = 0;
                            i = 1;
                            do {
                                FXDeviceItem fXDeviceItem = fXDeviceItemArr[i3];
                                if (fXDeviceItem != null) {
                                    EdK edK = (EdK) 1Br.A0B(ei42.A01);
                                    int i4 = 0;
                                    C67Z c67z = fXDeviceItem.A00;
                                    if (c67z != null) {
                                        EMS ems = fXDeviceItem.A03;
                                        if (ems != null) {
                                            String str4 = fXDeviceItem.A02;
                                            if (str4 != null) {
                                                1G9 A0F = EZx.A00.A0F(c67z.mPrefPrefix).A0F(ems.mPrefPrefix);
                                                1Ql A082 = 1Br.A08(edK.A00);
                                                JSONObject A12 = AnonymousClass001.A12();
                                                A12.put("app_source", fXDeviceItem.A00);
                                                A12.put("id_type", ems);
                                                A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4);
                                                A12.put(JQw.A00(265), fXDeviceItem.A01);
                                                A082.CaL(A0F, A12.toString());
                                                A082.commit();
                                                i4 = 1;
                                            }
                                        }
                                    }
                                    i &= i4;
                                }
                                i3++;
                            } while (i3 < length);
                            A05.putInt("device_result", i);
                        }
                    }
                }
                i = 0;
                A05.putInt("device_result", i);
            }
        }
        return A05;
    }
}
