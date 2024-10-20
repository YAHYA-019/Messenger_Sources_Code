package com.facebook.messaging.sms;

import X.1BQ;
import X.7kF;
import X.BXs;
import X.C00i;
import X.C0et;
import X.C4zc;
import X.C4zh;
import X.C7o;
import X.CEV;
import X.CNX;
import X.CPk;
import android.database.Cursor;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: SmsBlockThreadManager.class */
public final class SmsBlockThreadManager {
    public final C00i A02 = new 1BQ(84092);
    public final C00i A05 = new 1BQ(49429);
    public final C00i A06 = new 1BQ(84393);
    public final C00i A01 = new 1BQ(49992);
    public final C00i A03 = new 1BQ(84466);
    public final C00i A04 = new 1BQ(50090);
    public final C00i A07 = new 1BQ(83604);
    public HashMap A00 = null;

    public static void A00(SmsBlockThreadManager smsBlockThreadManager) {
        if (smsBlockThreadManager.A00 == null && C0et.A0P.equals(smsBlockThreadManager.A07.get())) {
            Cursor query = ((C4zc) smsBlockThreadManager.A05.get()).A00.AUF().query("block_table", null, null, null, null, null, null);
            try {
                ArrayList arrayList = new ArrayList();
                while (query.moveToNext()) {
                    ImmutableList immutableList = C4zh.A04;
                    String string = query.getString(query.getColumnIndexOrThrow("phoneNumber"));
                    String string2 = query.getString(query.getColumnIndexOrThrow("rawPhoneNumber"));
                    arrayList.add(new C7o(query.getLong(query.getColumnIndexOrThrow(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP)), CPk.A02((CPk) smsBlockThreadManager.A06.get(), string), string2, string));
                }
                query.close();
                smsBlockThreadManager.A00 = new HashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C7o c7o = (C7o) it.next();
                    smsBlockThreadManager.A00.getClass();
                    smsBlockThreadManager.A00.put(c7o.A01, c7o);
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                        throw th;
                    } catch (Throwable th2) {
                        7kF.A00(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public boolean A01(String str, boolean z) {
        if (!z) {
            A00(this);
        }
        if (this.A00 == null) {
            return false;
        }
        CEV cev = (CEV) this.A03.get();
        if (BXs.A00(str)) {
            str = ((CNX) cev.A02.get()).A03(str);
        }
        return this.A00.containsKey(str);
    }
}
