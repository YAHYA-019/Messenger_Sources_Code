package com.google.android.gms.auth.api.signin;

import X.1BK;
import X.1BL;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.AnonymousClass289;
import X.JQx;
import X.L2d;
import X.LGn;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: GoogleSignInOptions.class */
public class GoogleSignInOptions extends AbstractSafeParcelable implements AnonymousClass289, ReflectedParcelable {
    public static final GoogleSignInOptions A0B;
    public static final GoogleSignInOptions A0C;
    public static final Scope A0D = new Scope(1, "profile");
    public static final Scope A0E = new Scope(1, "email");
    public static final Scope A0F = new Scope(1, "openid");
    public static final Scope A0G;
    public static final Scope A0H;
    public static final Comparator A0I;
    public static final Parcelable.Creator CREATOR;
    public Account A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;
    public boolean A05;
    public Map A06;
    public final int A07;
    public final ArrayList A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Comparator] */
    static {
        Scope scope = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        A0G = scope;
        A0H = new Scope(1, "https://www.googleapis.com/auth/games");
        L2d l2d = new L2d();
        Set set = l2d.A03;
        set.add(A0F);
        set.add(A0D);
        A0C = l2d.A00();
        L2d l2d2 = new L2d();
        Set set2 = l2d2.A03;
        set2.add(scope);
        set2.addAll(Arrays.asList(new Scope[0]));
        A0B = l2d2.A00();
        CREATOR = LGn.A00(72);
        A0I = new Object();
    }

    public GoogleSignInOptions(Account account, String str, String str2, String str3, ArrayList arrayList, Map map, int i, boolean z, boolean z2, boolean z3) {
        this.A07 = i;
        this.A08 = arrayList;
        this.A00 = account;
        this.A05 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = 1BK.A17(map.values());
        this.A06 = map;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (!this.A04.isEmpty() || !googleSignInOptions.A04.isEmpty()) {
                return false;
            }
            ArrayList arrayList = this.A08;
            int size = arrayList.size();
            ArrayList arrayList2 = googleSignInOptions.A08;
            if (size != 1BK.A17(arrayList2).size() || !arrayList.containsAll(1BK.A17(arrayList2))) {
                return false;
            }
            Account account = this.A00;
            if (account == null) {
                if (googleSignInOptions.A00 != null) {
                    return false;
                }
            } else if (!account.equals(googleSignInOptions.A00)) {
                return false;
            }
            String str = this.A01;
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(googleSignInOptions.A01)) {
                    return false;
                }
            } else if (!str.equals(googleSignInOptions.A01)) {
                return false;
            }
            if (this.A0A == googleSignInOptions.A0A && this.A05 == googleSignInOptions.A05 && this.A09 == googleSignInOptions.A09) {
                return TextUtils.equals(this.A03, googleSignInOptions.A03);
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                Collections.sort(A0s);
                return ((((((((((((A0s.hashCode() + 31) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 1BL.A05(this.A01)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + 1BL.A05(this.A03);
            }
            A0s.add(((Scope) arrayList.get(i2)).A01);
            i = i2 + 1;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A07;
        int A0E2 = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, i2);
        AbstractC01153q8.A0A(parcel, 1BK.A17(this.A08), 2);
        AbstractC01153q8.A07(parcel, this.A00, 3, i);
        AbstractC01153q8.A06(parcel, 4, this.A05);
        AbstractC01153q8.A06(parcel, 5, this.A09);
        AbstractC01153q8.A06(parcel, 6, this.A0A);
        AbstractC01153q8.A08(parcel, this.A01, 7);
        AbstractC01153q8.A08(parcel, this.A02, 8);
        AbstractC01153q8.A0A(parcel, this.A04, 9);
        AbstractC01153q8.A08(parcel, this.A03, 10);
        AbstractC01153q8.A03(parcel, A0E2);
    }
}
