package X;

import android.util.SparseArray;
import androidx.lifecycle.LiveData;
import com.facebook.common.locale.Country;
import com.facebook.smartcapture.logging.MC;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: JxF.class */
public final class JxF extends JxG {
    public JxE A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AddressFormFieldsConfig A0A;
    public final LoggingContext A0B;
    public final boolean A0C;
    public final int A0D;
    public final SparseArray A0E;
    public final String A0F;
    public final List A0G;
    public final java.util.Map A0H;
    public final Set A0I;
    public final Set A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JxF(Country country, AddressFormFieldsConfig addressFormFieldsConfig, LoggingContext loggingContext, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, java.util.Map map, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        super(i, z, z2);
        Country country2 = country;
        String str10 = str4;
        String str11 = str3;
        String str12 = str2;
        String str13 = str;
        int i13 = i4;
        int i14 = i5;
        int i15 = i6;
        int i16 = i7;
        String str14 = str5;
        int i17 = i8;
        String str15 = str6;
        int i18 = i9;
        String str16 = str7;
        int i19 = i10;
        String str17 = str8;
        int i20 = i11;
        11T.A0F(addressFormFieldsConfig, 13);
        HashSet A0v = AnonymousClass001.A0v();
        this.A0J = A0v;
        HashSet A0v2 = AnonymousClass001.A0v();
        this.A0I = A0v2;
        this.A0E = DKC.A0E();
        this.A0O = z3;
        this.A0R = z4;
        this.A0N = z5;
        this.A0M = z7;
        this.A0F = str9;
        this.A0P = z8;
        this.A0Q = z9;
        this.A03 = i3 == 0 ? 2131364263 : i3;
        this.A06 = i3 == 0 ? 2131367690 : i13;
        this.A07 = i3 == 0 ? 2131367691 : i14;
        this.A04 = i3 == 0 ? 2131365957 : i15;
        this.A08 = i3 == 0 ? 2131367706 : i16;
        this.A01 = i3 == 0 ? 2131363025 : i17;
        this.A05 = i3 == 0 ? 2131367551 : i18;
        this.A09 = i3 == 0 ? 2131368516 : i19;
        this.A02 = i3 == 0 ? 2131363415 : i20;
        this.A0H = map;
        this.A0B = loggingContext;
        this.A0G = list;
        this.A0L = z10;
        this.A0D = i12;
        this.A0K = z11;
        this.A0C = z12;
        if (z4) {
            ((L93) this).A03.put(29, Boolean.valueOf(z6));
        }
        if (z8 && list != null && !list.isEmpty()) {
            SparseArray sparseArray = ((L93) this).A03;
            sparseArray.put(34, false);
            sparseArray.put(33, list.get(0));
        }
        SparseArray sparseArray2 = ((L93) this).A03;
        sparseArray2.put(2, str == null ? "" : str13);
        sparseArray2.put(5, str2 == null ? "" : str12);
        sparseArray2.put(6, str3 == null ? "" : str11);
        sparseArray2.put(30, str4 == null ? "" : str10);
        sparseArray2.put(31, str5 == null ? "" : str14);
        sparseArray2.put(7, str6 == null ? "" : str15);
        sparseArray2.put(9, str7 == null ? "" : str16);
        sparseArray2.put(8, str8 == null ? "" : str17);
        sparseArray2.put(24, Integer.valueOf(i2));
        sparseArray2.put(10, country == null ? Country.A00(null, addressFormFieldsConfig.A00.A00.getCountry()) : country2);
        if (immutableList != null && !immutableList.isEmpty()) {
            A0v.addAll(immutableList);
        }
        if (immutableList2 != null && !immutableList2.isEmpty()) {
            A0v2.addAll(immutableList2);
        }
        super.A04.setValue(sparseArray2.clone());
        this.A0A = addressFormFieldsConfig;
        if (!DLb.A00().AZk(MC.android_payment.ecp_enable_address_typeahead) || this.A0B == null) {
            A0I();
            return;
        }
        new LiveData();
        new LiveData();
        C06014fk.A0A();
        4ZI.A00();
        C06014fk.A0H();
        throw null;
    }

    private final FormCellLoggingEvents A00(int i) {
        java.util.Map map = this.A0H;
        if (map != null) {
            return (FormCellLoggingEvents) 7zN.A0r(map, i);
        }
        return null;
    }

    public static Object A01(SparseArray sparseArray, L93 l93, int i) {
        Object obj = sparseArray.get(i);
        if (obj == null) {
            obj = l93.A03.get(i);
        }
        return obj;
    }

    public static void A02(Kle kle, JxF jxF, int i) {
        kle.A02 = jxF.A00(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        if (r0 == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.addresslist.AddressListCellParams] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A03(android.util.SparseArray r302, com.google.common.collect.ImmutableList.Builder r303) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxF.A03(android.util.SparseArray, com.google.common.collect.ImmutableList$Builder):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.facebookpay.form.cell.CellParams, com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams, java.lang.Object] */
    private final boolean A04(SparseArray sparseArray, ImmutableList.Builder builder) {
        List list;
        boolean z;
        Integer num;
        boolean z2 = false;
        if (!this.A0P || (list = this.A0G) == null || list.isEmpty()) {
            return false;
        }
        if (list.size() > 2) {
            z = true;
            num = Integer.valueOf(GOn.A0A(list, 2));
        } else {
            z = false;
            num = null;
        }
        if (sparseArray.get(34) != null) {
            Object obj = sparseArray.get(34);
            11T.A0I(obj, "null cannot be cast to non-null type kotlin.Boolean");
            z2 = AnonymousClass001.A1V(obj);
        }
        int i = 2131951738;
        if (list.size() == 1) {
            i = 2131951739;
        }
        ?? cellParams = new CellParams(null, 1.0f, 34, 0, true, true);
        cellParams.A03 = z2;
        cellParams.A04 = z;
        cellParams.A01 = 2131951735;
        cellParams.A00 = i;
        cellParams.A02 = num;
        builder.m11011add((Object) cellParams);
        return true;
    }

    private final boolean A05(SparseArray sparseArray, ImmutableList.Builder builder) {
        List list;
        boolean z = false;
        if (sparseArray.get(24) == null) {
            return false;
        }
        Object obj = sparseArray.get(24);
        if (obj == null) {
            throw 1BK.A0h();
        }
        int A03 = AnonymousClass001.A03(obj);
        if (A03 == 0) {
            return false;
        }
        if (this.A0P && (list = this.A0G) != null && !list.isEmpty()) {
            z = true;
        }
        Jx7 jx7 = new Jx7(24);
        jx7.A03 = A03;
        jx7.A07 = true;
        int i = 2130969581;
        if (z) {
            i = 2130969583;
        }
        jx7.A04 = i;
        builder.m11011add((Object) jx7.A00());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.facebookpay.form.cell.CellParams, java.lang.Object, com.facebookpay.form.cell.checkbox.CheckboxCellParams] */
    private final boolean A06(SparseArray sparseArray, ImmutableList.Builder builder) {
        boolean A1V;
        if (!this.A0R) {
            return false;
        }
        if (sparseArray.get(29) == null) {
            A1V = false;
        } else {
            Object obj = sparseArray.get(29);
            11T.A0I(obj, "null cannot be cast to non-null type kotlin.Boolean");
            A1V = AnonymousClass001.A1V(obj);
        }
        boolean z = this.A0L;
        String str = this.A0F;
        ?? cellParams = new CellParams(null, 1.0f, 29, 0, true, true);
        cellParams.A03 = A1V;
        cellParams.A01 = 2131951740;
        cellParams.A00 = 2131953939;
        cellParams.A04 = z;
        cellParams.A02 = str;
        builder.m11011add((Object) cellParams);
        return true;
    }

    @Override // X.JxG, X.L93
    public void A0A() {
        super.A0A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x053d, code lost:
    
        if (r327 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x07cf, code lost:
    
        if (r301.A0I.contains(r0) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x08d0, code lost:
    
        if (r301.A0I.contains(r0) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0a2a, code lost:
    
        if (r301.A0I.contains(9) != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0220, code lost:
    
        if (r0.A05 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ef, code lost:
    
        if (r0.A05 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0281, code lost:
    
        if (r326 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02af, code lost:
    
        if (X.JQx.A1Y(r301.A0J, 28) == false) goto L69;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x02eb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0949  */
    /* JADX WARN: Type inference failed for: r0v171, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v250, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v747, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v916, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v166, types: [com.facebookpay.form.cell.text.formatter.TextFormatter] */
    @Override // X.JxG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList A0H() {
        /*
            Method dump skipped, instructions count: 4191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxF.A0H():com.google.common.collect.ImmutableList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.L93] */
    @Override // X.JxG
    public void A0I() {
        JxF jxF;
        JxE jxE;
        super.A0I();
        int i = 0;
        while (true) {
            int i2 = i;
            SparseArray sparseArray = ((JxG) this).A00;
            if (i2 < sparseArray.size()) {
                jxF = (L93) sparseArray.valueAt(i2);
                if (((L93) jxF).A02 == 5) {
                    break;
                } else {
                    i = i2 + 1;
                }
            } else {
                jxF = this;
                if (((L93) this).A02 != 5) {
                    jxF = null;
                }
            }
        }
        if (!(jxF instanceof JxE) || (jxE = (JxE) jxF) == null) {
            return;
        }
        this.A00 = jxE;
    }

    @Override // X.JxG
    public void A0J(L93 l93, Object obj, Object obj2) {
        LoggingContext loggingContext;
        Boolean bool;
        if ((!(l93 instanceof QX6) && !(l93 instanceof QX7) && !(l93 instanceof QX4) && !(l93 instanceof QX8)) || 11T.A0O(obj, obj2) || obj2 == null) {
            return;
        }
        if ((l93 instanceof QX7) && (loggingContext = this.A0B) != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            LZv.A03(AbF.A08(1BK.A08(7zU.A0b().A00, "user_click_shippingasbilling_atomic"), 315), loggingContext, new GAk(null, loggingContext, "checkbox", 5, bool.booleanValue()));
        }
        A0I();
    }
}
