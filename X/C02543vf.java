package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vf.class */
public final class C02543vf {
    public InterfaceC02533ve A00;
    public final C15h A01;

    public C02543vf(InterfaceC02533ve interfaceC02533ve, C15h c15h) {
        this.A01 = c15h;
        this.A00 = interfaceC02533ve;
    }

    public void A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            4oJ r0 = (4oJ) it.next();
            0D7 r02 = (0D7) this.A01.get();
            if (r02.A00.isSampled()) {
                ArrayList arrayList = new ArrayList();
                for (5Qg r03 : r0.A01) {
                    0DA r04 = new 0DA();
                    ArrayList arrayList2 = new ArrayList();
                    String[] strArr = r03.A09;
                    String[] strArr2 = r03.A08;
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= strArr.length) {
                            break;
                        }
                        0DA r05 = new 0DA();
                        r05.A07(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, strArr[i2]);
                        String str = strArr2[i2];
                        0DA r06 = new 0DA();
                        r06.A07("string_value", str);
                        r05.A02(r06, "value");
                        arrayList2.add(r05);
                        i = i2 + 1;
                    }
                    String[] strArr3 = r03.A06;
                    long[] jArr = r03.A02;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= strArr3.length) {
                            break;
                        }
                        0DA r07 = new 0DA();
                        r07.A07(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, strArr3[i4]);
                        long j = jArr[i4];
                        0DA r08 = new 0DA();
                        r08.A06("int_value", Long.valueOf(j));
                        r07.A02(r08, "value");
                        arrayList2.add(r07);
                        i3 = i4 + 1;
                    }
                    r04.A08("dimensions", arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    String[] strArr4 = r03.A07;
                    String[] strArr5 = r03.A0A;
                    int i5 = 0;
                    while (true) {
                        int i6 = i5;
                        if (i6 >= strArr4.length) {
                            break;
                        }
                        0DA r09 = new 0DA();
                        r09.A07("metric", strArr4[i6]);
                        String str2 = strArr5[i6];
                        0DA r010 = new 0DA();
                        r010.A07("string_value", str2);
                        r09.A02(r010, "value");
                        arrayList3.add(r09);
                        i5 = i6 + 1;
                    }
                    String[] strArr6 = r03.A05;
                    long[] jArr2 = r03.A03;
                    int i7 = 0;
                    while (true) {
                        int i8 = i7;
                        if (i8 >= strArr6.length) {
                            break;
                        }
                        0DA r011 = new 0DA();
                        r011.A07("metric", strArr6[i8]);
                        long j2 = jArr2[i8];
                        0DA r012 = new 0DA();
                        r012.A06("int_value", Long.valueOf(j2));
                        r011.A02(r012, "value");
                        arrayList3.add(r011);
                        i7 = i8 + 1;
                    }
                    String[] strArr7 = r03.A04;
                    double[] dArr = r03.A01;
                    int i9 = 0;
                    while (true) {
                        int i10 = i9;
                        if (i10 < strArr7.length) {
                            0DA r013 = new 0DA();
                            r013.A07("metric", strArr7[i10]);
                            double d = dArr[i10];
                            0DA r014 = new 0DA();
                            r014.A04("double_value", Double.valueOf(d));
                            r013.A02(r014, "value");
                            arrayList3.add(r013);
                            i9 = i10 + 1;
                        }
                    }
                    r04.A08("aggregations", arrayList3);
                    r04.A06("count", Long.valueOf(r03.A00));
                    arrayList.add(r04);
                }
                r02.A0E("scenario", r0.A00);
                r02.A0F("summaries", arrayList);
                r02.BZL();
            }
        }
    }
}
