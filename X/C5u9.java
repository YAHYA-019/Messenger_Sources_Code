package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.xapp.messaging.threadview.model.attribution.AttributionApp;
import com.facebook.xapp.messaging.threadview.model.groupedmessages.GroupedMessageForwardMetadata;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.5u9, reason: invalid class name */
/* loaded from: 5u9.class */
public final class C5u9 {
    public static final C5u9 A00 = new Object();

    public static final 5wW A00(C5pu c5pu, C5l5 c5l5, Integer num, int i, boolean z) {
        String string;
        String Axh = c5l5.Axh(c5pu, i);
        if (Axh == null) {
            Axh = "image/*";
        }
        5wW r0 = new 5wW();
        1qX r02 = (1qX) c5pu;
        r0.A01(r02.mResultSet.getString(i, ActionId.VIDEO_DISPLAYED));
        r0.A0H = 5wV.A00(Axh);
        r0.A02(Axh);
        Integer nullableInteger = r02.mResultSet.getNullableInteger(i, 30);
        if (nullableInteger == null) {
            nullableInteger = r02.mResultSet.getNullableInteger(i, 32);
            if (nullableInteger == null) {
                nullableInteger = 0;
            }
        }
        r0.A01 = nullableInteger.intValue();
        Integer nullableInteger2 = r02.mResultSet.getNullableInteger(i, 31);
        if (nullableInteger2 == null) {
            nullableInteger2 = r02.mResultSet.getNullableInteger(i, 33);
            if (nullableInteger2 == null) {
                nullableInteger2 = 0;
            }
        }
        r0.A00 = nullableInteger2.intValue();
        String B2p = c5l5.B2p(c5pu, i);
        if (B2p == null) {
            return null;
        }
        r0.A03(B2p);
        Integer nullableInteger3 = r02.mResultSet.getNullableInteger(i, 32);
        if (nullableInteger3 == null) {
            nullableInteger3 = 0;
        }
        r0.A03 = nullableInteger3.intValue();
        Integer nullableInteger4 = r02.mResultSet.getNullableInteger(i, 33);
        if (nullableInteger4 == null) {
            nullableInteger4 = 0;
        }
        r0.A02 = nullableInteger4.intValue();
        String BFe = c5l5.BFe(c5pu, i);
        if (BFe == null) {
            return null;
        }
        r0.A04(BFe);
        r0.A0G = z;
        Long nullableLong = r02.mResultSet.getNullableLong(i, 85);
        AttributionApp attributionApp = null;
        if (nullableLong != null) {
            long longValue = nullableLong.longValue();
            String string2 = r02.mResultSet.getString(i, 86);
            if (string2 != null && (string = r02.mResultSet.getString(i, 87)) != null) {
                String valueOf = String.valueOf(longValue);
                C1pq.A08("appId", valueOf);
                attributionApp = new AttributionApp(valueOf, string2, string);
            }
        }
        r0.A06 = attributionApp;
        r0.A0I = 11T.A0O(r02.mResultSet.getNullableBoolean(i, 204), true);
        r0.A09 = num;
        r0.A08 = r02.mResultSet.getNullableInteger(i, 216);
        return r0;
    }

    public final C5fp A01(C5pu c5pu, C5l5 c5l5, Boolean bool, Integer num, String str, boolean z) {
        GroupedMessageForwardMetadata groupedMessageForwardMetadata;
        C82f c82f = null;
        if (c5pu == null) {
            return null;
        }
        1qX r0 = (1qX) c5pu;
        if (r0.mResultSet.getCount() == 0) {
            return null;
        }
        int AXc = c5pu.AXc(0);
        if (AXc != 2 && AXc != 3) {
            return null;
        }
        C5fp c5fp = new C5fp();
        07E A07 = 07C.A07(0, r0.mResultSet.getCount());
        ArrayList arrayList = new ArrayList();
        07I it = A07.iterator();
        while (it.hasNext()) {
            5wW A002 = A00(c5pu, c5l5, num, it.A00(), z);
            if (A002 != null) {
                arrayList.add(new Photo(A002));
            }
        }
        c5fp.A00 = 0DW.A00(arrayList);
        C5wa c5wa = C5wa.A00;
        if (!11T.A0O(bool, true) || r0.mResultSet.getCount() <= 1) {
            groupedMessageForwardMetadata = null;
        } else {
            07E A072 = 07C.A07(0, r0.mResultSet.getCount());
            ArrayList arrayList2 = new ArrayList();
            07I it2 = A072.iterator();
            while (it2.hasNext()) {
                String string = r0.mResultSet.getString(it2.A00(), 0);
                if (string != null) {
                    arrayList2.add(string);
                }
            }
            ImmutableList A003 = 0DW.A00(arrayList2);
            07E A073 = 07C.A07(0, r0.mResultSet.getCount());
            ArrayList arrayList3 = new ArrayList();
            07I it3 = A073.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Long.valueOf(r0.mResultSet.getLong(it3.A00(), 5)));
            }
            groupedMessageForwardMetadata = new GroupedMessageForwardMetadata(str, A003, 0DW.A00(arrayList3));
        }
        c5fp.A02(c5wa, groupedMessageForwardMetadata);
        C5wb c5wb = C5wb.A00;
        if (11T.A0O(bool, true) && str != null && num != null) {
            c82f = new C82f(str, num.intValue(), 1);
        }
        c5fp.A02(c5wb, c82f);
        return c5fp;
    }
}
