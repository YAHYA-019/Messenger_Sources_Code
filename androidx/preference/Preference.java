package androidx.preference;

import X.06Z;
import X.1BK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06c;
import X.JQx;
import X.JR1;
import X.Kqc;
import X.LGo;
import X.LK1;
import X.MEa;
import X.MEb;
import X.MEc;
import X.MI7;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.List;

/* loaded from: Preference.class */
public class Preference implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Intent A05;
    public Drawable A06;
    public Bundle A07;
    public MI7 A08;
    public MEa A09;
    public MEb A0A;
    public PreferenceGroup A0B;
    public Kqc A0C;
    public CharSequence A0D;
    public Object A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public List A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public LK1 A0T;
    public CharSequence A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final Context A0b;
    public final View.OnClickListener A0c;

    /* loaded from: Preference$BaseSavedState.class */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = LGo.A00(23);

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JR1.A0Y(context, 2130971378).resourceId != 0 ? 2130971378 : 16842894);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0226, code lost:
    
        if (r0.hasValue(11) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r313v0 */
    /* JADX WARN: Type inference failed for: r313v1 */
    /* JADX WARN: Type inference failed for: r313v2, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r313v3 */
    /* JADX WARN: Type inference failed for: r313v4 */
    /* JADX WARN: Type inference failed for: r313v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Preference(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A01(View view, boolean z) {
        view.setEnabled(z);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                A01(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public static void A02(Preference preference) {
        Object obj;
        Object obj2;
        if (preference.A0J() && preference.A0R) {
            if (preference instanceof TwoStatePreference) {
                ((TwoStatePreference) preference).A0P(!r0.A02);
            } else if (preference instanceof PreferenceScreen) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                if (((Preference) preferenceGroup).A05 == null && preferenceGroup.A0G == null && preferenceGroup.A05.size() != 0 && (obj = preferenceGroup.A0C.A03) != null) {
                    Fragment fragment = (Fragment) obj;
                    Fragment fragment2 = fragment;
                    do {
                        fragment2 = fragment2.mParentFragment;
                    } while (fragment2 != null);
                    fragment.getContext();
                }
            } else if (preference instanceof DialogPreference) {
                DialogPreference dialogPreference = (DialogPreference) preference;
                if (dialogPreference instanceof DropDownPreference) {
                    ((DropDownPreference) dialogPreference).A00.performClick();
                } else {
                    MEc mEc = dialogPreference.A0C.A02;
                    if (mEc != null) {
                        mEc.BuP(dialogPreference);
                    }
                }
            }
            MEa mEa = preference.A09;
            if (mEa == null || !mEa.CDA(preference)) {
                Kqc kqc = preference.A0C;
                if (kqc != null && (obj2 = kqc.A04) != null) {
                    Fragment fragment3 = (Fragment) obj2;
                    String str = preference.A0G;
                    if (str != null) {
                        Fragment fragment4 = fragment3;
                        do {
                            fragment4 = fragment4.mParentFragment;
                        } while (fragment4 != null);
                        fragment3.getContext();
                        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                        06Z parentFragmentManager = fragment3.getParentFragmentManager();
                        Bundle bundle = preference.A07;
                        if (bundle == null) {
                            bundle = 1BK.A05();
                            preference.A07 = bundle;
                        }
                        Fragment A02 = parentFragmentManager.A0d().A02(fragment3.requireActivity().getClassLoader(), str);
                        A02.setArguments(bundle);
                        A02.setTargetFragment(fragment3, 0);
                        C06c c06c = new C06c(parentFragmentManager);
                        c06c.A0M(A02, ((View) fragment3.requireView().getParent()).getId());
                        c06c.A0V(null);
                        c06c.A04();
                        return;
                    }
                }
                Intent intent = preference.A05;
                if (intent != null) {
                    preference.A0b.startActivity(intent);
                }
            }
        }
    }

    public static void A03(Preference preference) {
        Kqc kqc;
        PreferenceScreen preferenceScreen;
        Preference A0O;
        List list;
        String str = preference.A0F;
        if (str == null || (kqc = preference.A0C) == null || (preferenceScreen = kqc.A05) == null || (A0O = preferenceScreen.A0O(str)) == null || (list = A0O.A0I) == null) {
            return;
        }
        list.remove(preference);
    }

    public long A04() {
        return this.A04;
    }

    public CharSequence A05() {
        MEb mEb = this.A0A;
        return mEb != null ? mEb.CZk(this) : this.A0U;
    }

    public void A06() {
        MI7 mi7 = this.A08;
        if (mi7 != null) {
            mi7.CD9(this);
        }
    }

    public void A07() {
        PreferenceScreen preferenceScreen;
        Preference A0O;
        String str = this.A0F;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Kqc kqc = this.A0C;
        if (kqc == null || (preferenceScreen = kqc.A05) == null || (A0O = preferenceScreen.A0O(str)) == null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Dependency \"");
            A0k.append(str);
            A0k.append("\" not found for preference \"");
            A0k.append(this.A0H);
            A0k.append("\" (title: \"");
            A0k.append((Object) this.A0D);
            throw AnonymousClass002.A0F("\"", A0k);
        }
        List list = A0O.A0I;
        if (list == null) {
            list = AnonymousClass001.A0s();
            A0O.A0I = list;
        }
        list.add(this);
        boolean A0K = A0O.A0K();
        if (this.A0L == A0K) {
            this.A0L = !A0K;
            A0I(A0K());
            A06();
        }
    }

    public void A08() {
        if (!(this instanceof PreferenceGroup)) {
            A03(this);
            return;
        }
        PreferenceGroup preferenceGroup = (PreferenceGroup) this;
        A03(preferenceGroup);
        preferenceGroup.A01 = false;
        List list = preferenceGroup.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A08();
        }
    }

    public void A09(Bundle bundle) {
        Parcelable parcelable;
        if (!JQx.A1V(this.A0H) || (parcelable = bundle.getParcelable(this.A0H)) == null) {
            return;
        }
        this.A0J = false;
        A0B(parcelable);
        if (!this.A0J) {
            throw AnonymousClass001.A0N("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d1  */
    /* JADX WARN: Type inference failed for: r306v4, types: [androidx.preference.PreferenceGroup$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARN: Type inference failed for: r307v0, types: [androidx.preference.EditTextPreference$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARN: Type inference failed for: r307v1, types: [androidx.preference.Preference$BaseSavedState, androidx.preference.ListPreference$SavedState] */
    /* JADX WARN: Type inference failed for: r307v2, types: [androidx.preference.Preference$BaseSavedState, androidx.preference.MultiSelectListPreference$SavedState] */
    /* JADX WARN: Type inference failed for: r307v4, types: [androidx.preference.SeekBarPreference$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARN: Type inference failed for: r307v6, types: [androidx.preference.TwoStatePreference$SavedState, androidx.preference.Preference$BaseSavedState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0A(android.os.Bundle):void");
    }

    public void A0B(Parcelable parcelable) {
        this.A0J = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw AnonymousClass001.A0L("Wrong state class -- expecting Preference State");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0C(X.Kqc r302) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0C(X.Kqc):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x014a, code lost:
    
        if (r308 != null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0D(X.JiB r302) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0D(X.JiB):void");
    }

    public void A0E(CharSequence charSequence) {
        if (this.A0A != null) {
            throw AnonymousClass001.A0N("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.A0U, charSequence)) {
            return;
        }
        this.A0U = charSequence;
        A06();
    }

    public void A0F(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.A0D)) {
            return;
        }
        this.A0D = charSequence;
        A06();
    }

    public void A0G(String str) {
        this.A0H = str;
        if (!this.A0Q || JQx.A1V(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.A0H)) {
            throw AnonymousClass001.A0N("Preference does not have a key assigned.");
        }
        this.A0Q = true;
    }

    public void A0H(String str) {
        if (A0L()) {
            String str2 = null;
            if (A0L()) {
                str2 = this.A0C.A00().getString(this.A0H, null);
            }
            if (TextUtils.equals(str, str2)) {
                return;
            }
            SharedPreferences.Editor edit = this.A0C.A00().edit();
            edit.putString(this.A0H, str);
            edit.apply();
        }
    }

    public void A0I(boolean z) {
        List list = this.A0I;
        if (list == null) {
            return;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            Preference preference = (Preference) list.get(i2);
            if (preference.A0L == z) {
                preference.A0L = !z;
                preference.A0I(preference.A0K());
                preference.A06();
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r301.A0O == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0J() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0M
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            boolean r0 = r0.A0L
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            boolean r0 = r0.A0O
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L1f
        L1d:
            r0 = 0
            r302 = r0
        L1f:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0J():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r0 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0K() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof androidx.preference.TwoStatePreference
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L40
            r0 = r301
            r303 = r0
            r0 = r301
            androidx.preference.TwoStatePreference r0 = (androidx.preference.TwoStatePreference) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A03
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            boolean r0 = r0.A02
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r302
            if (r0 != 0) goto L36
        L25:
            r0 = r303
            boolean r0 = r0.A0J()
            r1 = 1
            r0 = r0 ^ r1
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L36
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L36:
            r0 = r305
            return r0
        L39:
            r0 = r302
            if (r0 != 0) goto L25
            r0 = r305
            return r0
        L40:
            r0 = r301
            boolean r0 = r0 instanceof androidx.preference.EditTextPreference
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L77
            r0 = r301
            r306 = r0
            r0 = r301
            androidx.preference.EditTextPreference r0 = (androidx.preference.EditTextPreference) r0
            r306 = r0
            r0 = r306
            java.lang.String r0 = r0.A00
            r307 = r0
            r0 = r307
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L75
            r0 = r306
            boolean r0 = r0.A0J()
            r1 = 1
            r0 = r0 ^ r1
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            if (r0 == 0) goto L36
        L75:
            r0 = 1
            return r0
        L77:
            r0 = r301
            boolean r0 = r0.A0J()
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0K():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (X.JQx.A1V(r301.A0H) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0L() {
        /*
            r301 = this;
            r0 = r301
            X.Kqc r0 = r0.A0C
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            r0 = r301
            boolean r0 = r0.A0P
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r301
            java.lang.String r0 = r0.A0H
            r302 = r0
            r0 = r302
            boolean r0 = X.JQx.A1V(r0)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L26
        L22:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L26:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0L():boolean");
    }

    public boolean A0M(boolean z) {
        if (A0L()) {
            z = this.A0C.A00().getBoolean(this.A0H, z);
        }
        return z;
    }

    public boolean A0N(boolean z) {
        boolean z2;
        if (A0L()) {
            z2 = true;
            if (z != A0M(!z)) {
                SharedPreferences.Editor edit = this.A0C.A00().edit();
                edit.putBoolean(this.A0H, z);
                edit.apply();
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.A02;
        int i2 = preference.A02;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.A0D;
        CharSequence charSequence2 = preference.A0D;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.A0D.toString());
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        CharSequence charSequence = this.A0D;
        if (!TextUtils.isEmpty(charSequence)) {
            A0k.append(charSequence);
            A0k.append(' ');
        }
        CharSequence A05 = A05();
        if (!TextUtils.isEmpty(A05)) {
            A0k.append(A05);
            A0k.append(' ');
        }
        if (A0k.length() > 0) {
            A0k.setLength(A0k.length() - 1);
        }
        return A0k.toString();
    }
}
