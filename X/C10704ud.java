package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.4ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ud.class */
public final class C10704ud {
    public static final String[] A08;
    public static final String[] A09;
    public static final String[] A0A;
    public static final String[] A0B;
    public final C15h A04;
    public final C15h A05;
    public final 82O A02 = (82O) 1Bn.A0A(324);
    public final 82O A00 = (82O) 1Bn.A0A(330);
    public final 82O A06 = (82O) 1Bn.A0A(329);
    public final 82O A01 = (82O) 1Bn.A0A(331);
    public final C10844ur A03 = (C10844ur) 1Bi.A03(49355);
    public final C00i A07 = new 1BQ(66265);

    static {
        String[] strArr = C10714ue.A04;
        int length = strArr.length;
        int i = length + 1;
        Object[] copyOf = Arrays.copyOf(strArr, i);
        copyOf[length] = "timestamp_in_folder_ms";
        String[] strArr2 = (String[]) copyOf;
        A08 = strArr2;
        Object[] copyOf2 = Arrays.copyOf(strArr, i);
        copyOf2[length] = "timestamp_in_virtual_folder_ms";
        A0B = (String[]) copyOf2;
        String[] strArr3 = C10814uo.A04;
        int length2 = strArr3.length;
        Object[] copyOf3 = Arrays.copyOf(strArr3, length2 + 1);
        copyOf3[length2] = "timestamp_in_folder_ms";
        A09 = (String[]) copyOf3;
        A0A = (String[]) 1Dz.A02(strArr2, strArr3);
    }

    public C10704ud() {
        Object A0A2 = 1Bn.A0A(16428);
        this.A04 = new DBR(A0A2, this, 4);
        this.A05 = new DBR(A0A2, this, 5);
    }

    public static 4cN A00(1F9 r301, C1yg c1yg) {
        4cN r0 = new 4cN();
        r0.A04(new 2Uy("folder", r301.dbName));
        r0.A04(new C1638Aog("thread_key", 0Pz.A0W(c1yg.name(), "%")));
        return r0;
    }

    public static InterfaceC10724uf A01(2V0 r301, C10704ud c10704ud, String str) {
        SQLiteDatabase A01 = C10654u8.A01(c10704ud.A04);
        if (A01.isOpen()) {
            Cursor A07 = ((C7d2) c10704ud.A05.get()).A07(A01, r301.A02(), str, CkD.A05, r301.A03());
            if (A07 != null) {
                return c10704ud.A06.A08(A07, (String) null);
            }
        }
        return InterfaceC10724uf.A00;
    }

    public InterfaceC10724uf A02(4cO r302, 1Hk r303, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(r303.dbName);
        Collections.addAll(A0s, r302.A03());
        SQLiteDatabase A01 = C10654u8.A01(this.A04);
        if (A01.isOpen()) {
            Cursor A07 = ((C7d2) this.A05.get()).A07(A01, r302.A02(), str, A0B, (String[]) A0s.toArray(new String[0]));
            if (A07 != null) {
                return this.A02.A0A(A07, "timestamp_in_virtual_folder_ms");
            }
        }
        return InterfaceC10724uf.A00;
    }

    public InterfaceC10724uf A03(String str) {
        Cursor A00;
        return (((1PG) this.A07.get()).A07() || (A00 = this.A03.A00(str, false)) == null) ? InterfaceC10724uf.A00 : this.A01.A09(A00);
    }

    public InterfaceC10724uf A04(String str) {
        Cursor A07;
        4cN r0 = new 4cN();
        4cO.A00(r0, "folder", 1F9.A0I.dbName);
        r0.A04(4cM.A01(new 2V0[]{new C1638Aog(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 0Pz.A0W(str, "%")), new C1638Aog(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 0Pz.A0j("% ", str, "%"))}));
        0fH.A07(C10704ud.class, r0.A02(), "selection: %s");
        SQLiteDatabase A01 = C10654u8.A01(this.A04);
        return (!A01.isOpen() || (A07 = ((C7d2) this.A05.get()).A07(A01, r0.A02(), "timestamp_in_folder_ms DESC", A0A, r0.A03())) == null) ? InterfaceC10724uf.A00 : this.A06.A08(A07, "timestamp_in_folder_ms");
    }
}
