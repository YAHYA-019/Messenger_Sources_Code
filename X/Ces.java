package X;

import android.database.Cursor;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: Ces.class */
public final class Ces implements C4Av {
    public static final Uri A05 = AbM.A0A(IJ3.A00.buildUpon(), "simple", "true");
    public static final String[] A06 = {"_id", "date", "recipient_ids"};
    public final C00i A00 = FbInjector.A00;
    public final C00i A01 = 1BQ.A02(84993);
    public final C00i A02 = 1BQ.A02(84466);
    public final 6Pl A04 = (6Pl) 1Bi.A03(50090);
    public final C00i A03 = 1BQ.A02(84992);

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        ArrayList A0t;
        int i;
        int i2;
        if (!r302.A01()) {
            return false;
        }
        FbUserSession A00 = r302.A00();
        C1637Aof c1637Aof = new C1637Aof("message_count", ConstantsKt.CAMERA_ID_FRONT);
        Cursor A01 = 0L0.A01(1BK.A04(this.A00).getContentResolver(), A05, c1637Aof.A02(), "date DESC LIMIT 200", A06, c1637Aof.A03(), 2000445353);
        1Hz A10 = AbF.A10();
        if (A01 != null) {
            while (A01.moveToNext()) {
                try {
                    String A18 = AbH.A18(A01, "recipient_ids");
                    CEV cev = (CEV) this.A02.get();
                    if (1JF.A0B(A18)) {
                        A0t = AnonymousClass001.A0s();
                    } else {
                        java.util.Map map = cev.A03;
                        if (map.isEmpty()) {
                            C00j.A05("SmsRecipientUtil.primeCache", 1461785460);
                            Cursor cursor = null;
                            try {
                                Cursor A012 = 0L0.A01(cev.A01, CEV.A05, (String) null, "_id limit 100", CEV.A06, (String[]) null, -1269755122);
                                if (A012 == null) {
                                    i2 = 378534453;
                                } else {
                                    int columnIndexOrThrow = A012.getColumnIndexOrThrow("_id");
                                    while (A012.moveToNext()) {
                                        String A182 = AbH.A18(A012, "address");
                                        if (!Platform.stringIsNullOrEmpty(A182)) {
                                            map.put(Long.valueOf(A012.getLong(columnIndexOrThrow)), A182);
                                        }
                                    }
                                    A012.close();
                                    i2 = 1295663423;
                                }
                                C00j.A01(i2);
                            } catch (Throwable th) {
                                th = th;
                                if (0 != 0) {
                                    cursor.close();
                                }
                                C00j.A01(-1915555888);
                                throw th;
                            }
                        }
                        List asList = Arrays.asList(A18.split(" "));
                        0WH A07 = AbI.A07();
                        if (asList != null) {
                            A07.addAll(asList);
                        }
                        A07.removeAll(Collections.singletonList(""));
                        int size = A07.size();
                        ArrayList A0t2 = AnonymousClass001.A0t(size);
                        A0t = AnonymousClass001.A0t(size);
                        Iterator it = A07.iterator();
                        while (it.hasNext()) {
                            try {
                                Long A0n = 1BK.A0n(AnonymousClass001.A0i(it));
                                if (!map.containsKey(A0n)) {
                                    A0t2.add(A0n);
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (!A0t2.isEmpty()) {
                            C00j.A05("SmsRecipientUtil.getAddressesFromDb", -1713418377);
                            try {
                                ArrayList A102 = 1BL.A10(A0t2);
                                4sQ r0 = new 4sQ("_id", A0t2);
                                Cursor cursor2 = null;
                                try {
                                    Cursor A013 = 0L0.A01(cev.A01, CEV.A05, r0.A02(), (String) null, CEV.A06, r0.A03(), -592054098);
                                    if (A013 == null) {
                                        i = -304768697;
                                    } else {
                                        int columnIndexOrThrow2 = A013.getColumnIndexOrThrow("_id");
                                        while (A013.moveToNext()) {
                                            String A183 = AbH.A18(A013, "address");
                                            if (!Platform.stringIsNullOrEmpty(A183)) {
                                                map.put(Long.valueOf(A013.getLong(columnIndexOrThrow2)), A183);
                                                A102.add(A183);
                                            }
                                        }
                                        A013.close();
                                        i = -235646884;
                                    }
                                    C00j.A01(i);
                                } catch (Throwable th2) {
                                    if (0 != 0) {
                                        cursor2.close();
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                C00j.A01(-116064184);
                                throw th;
                            }
                        }
                        Iterator it2 = A07.iterator();
                        while (it2.hasNext()) {
                            try {
                                Long A0n2 = 1BK.A0n(AnonymousClass001.A0i(it2));
                                if (map.containsKey(A0n2)) {
                                    A0t.add(map.get(A0n2));
                                }
                            } catch (NumberFormatException unused2) {
                            }
                        }
                    }
                    if (A0t.size() == 1) {
                        String str = (String) A0t.get(0);
                        if (((CH5) this.A01.get()).A01(A00, str)) {
                            A10.A05(str);
                        }
                    }
                } finally {
                    A01.close();
                }
            }
        }
        ImmutableSet A072 = A10.A07();
        6Pl.A01(this.A04, AbG.A10(1BK.A0c(), "num_addresses_added", String.valueOf(A072.size())), "sms_takeover_business_worker_run");
        if (A072.isEmpty()) {
            return true;
        }
        ((CN3) this.A03.get()).A01(A072);
        return true;
    }
}
