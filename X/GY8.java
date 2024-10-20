package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.montage.model.MontageBucket;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageNoteBucketPreview;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: GY8.class */
public abstract class GY8 extends 0NL {
    public final 06Z A04;
    public final ArrayList A05 = AnonymousClass001.A0s();
    public ArrayList A03 = AnonymousClass001.A0s();
    public C06c A01 = null;
    public 0AE A00 = new 0AE();
    public Fragment A02 = null;

    public GY8(06Z r302) {
        this.A04 = r302;
    }

    public static Fragment A00(GY8 gy8, int i) {
        return (Fragment) C0Ak.A00(gy8.A00, i);
    }

    public static void A01(ArrayList arrayList, int i) {
        while (arrayList.size() <= i) {
            arrayList.add(null);
        }
    }

    public Parcelable A07() {
        Bundle bundle;
        if (this.A03.size() > 0) {
            bundle = 1BK.A05();
            ArrayList arrayList = this.A03;
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            0AE r0 = this.A00;
            if (i2 >= r0.A00()) {
                return bundle;
            }
            Fragment fragment = (Fragment) C0Ak.A00(r0, i2);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = 1BK.A05();
                }
                this.A04.A11(bundle, fragment, 0Pz.A0T("f", i2));
            }
            i = i2 + 1;
        }
    }

    public void A09() {
        0AE r0 = new 0AE(A0C());
        ArrayList A0s = AnonymousClass001.A0s();
        A01(A0s, A0C());
        A01(this.A03, A0C());
        int i = 0;
        while (true) {
            int i2 = i;
            0AE r02 = this.A00;
            if (i2 >= r02.A00()) {
                this.A00 = r0;
                this.A03 = A0s;
                super.A09();
                return;
            }
            int A02 = r02.A02(i2);
            Object A05 = r02.A05(i2);
            int A0D = A0D(A05);
            Object obj = this.A03.get(i2);
            if (A0D != -2) {
                if (A0D >= 0) {
                    A02 = A0D;
                }
                r0.A09(A02, A05);
                A0s.set(A02, obj);
            } else {
                A0s.set(i2, null);
            }
            i = i2 + 1;
        }
    }

    public void A0A(Parcelable parcelable, ClassLoader classLoader) {
        if ((this instanceof C2794GoU) || parcelable == null) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(classLoader);
        this.A00.A06();
        Parcelable[] parcelableArray = bundle.getParcelableArray("states");
        ArrayList arrayList = this.A03;
        arrayList.clear();
        if (parcelableArray != null) {
            A01(arrayList, parcelableArray.length);
            for (Parcelable parcelable2 : parcelableArray) {
                arrayList.add(parcelable2);
            }
        }
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (A0i.startsWith("f")) {
                int parseInt = Integer.parseInt(A0i.substring(1));
                Fragment A0Z = this.A04.A0Z(bundle, A0i);
                if (A0Z != null) {
                    A0Z.setMenuVisibility(false);
                    A0Z.setUserVisibleHint(false);
                    this.A00.A09(parseInt, A0Z);
                } else {
                    android.util.Log.w("FSPA", 0Pz.A0W("Bad fragment at key ", A0i));
                }
            }
        }
    }

    public void A0B(ViewGroup viewGroup) {
        C06c c06c = this.A01;
        if (c06c != null) {
            c06c.A05();
            this.A01 = null;
            06Z r0 = this.A04;
            if (r0.A0B || C0D1.A00(r0)) {
                return;
            }
            r0.A0t();
        }
    }

    public Object A0E(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Object A00;
        0AE r0 = this.A00;
        if (r0.A00() > i && (A00 = C0Ak.A00(r0, i)) != null) {
            return A00;
        }
        if (this.A01 == null) {
            this.A01 = new C06c(this.A04);
        }
        Fragment A0I = A0I(i);
        ArrayList arrayList = this.A05;
        A01(arrayList, i + 1);
        if (this.A03.size() > i && TextUtils.equals(null, (String) arrayList.get(i)) && (savedState = (Fragment.SavedState) this.A03.get(i)) != null) {
            A0I.setInitialSavedState(savedState);
        }
        if (A0I != this.A02) {
            A0I.setMenuVisibility(false);
            A0I.setUserVisibleHint(false);
        }
        this.A00.A09(i, A0I);
        this.A01.A0P(A0I, null, viewGroup.getId());
        return A0I;
    }

    public void A0F(ViewGroup viewGroup, Object obj, int i) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.A02;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                fragment2.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.A02 = fragment;
        }
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        Fragment fragment = (Fragment) obj;
        if (this.A01 == null) {
            this.A01 = new C06c(this.A04);
        }
        if (A0D(obj) >= 0) {
            i = A0D(obj);
        }
        ArrayList arrayList = this.A03;
        int i2 = i + 1;
        A01(arrayList, i2);
        ArrayList arrayList2 = this.A05;
        A01(arrayList2, i2);
        arrayList.set(i, this.A04.A0W(fragment));
        arrayList2.set(i, fragment.mTag);
        this.A00.A07(i);
        this.A01.A0I(fragment);
    }

    public boolean A0H(View view, Object obj) {
        return AnonymousClass001.A1W(((Fragment) obj).mView, view);
    }

    public Fragment A0I(int i) {
        8uM c2397Gbz;
        Bundle A05;
        Parcelable parcelable;
        String str;
        if (!(this instanceof C2794GoU)) {
            MontageCard montageCard = ((C2793GoT) this).A00;
            2Ob c2397Gbz2 = new C2397Gbz();
            Bundle A052 = 1BK.A05();
            A052.putParcelable("archived_messages", montageCard);
            c2397Gbz2.setArguments(A052);
            return c2397Gbz2;
        }
        C2794GoU c2794GoU = (C2794GoU) this;
        int i2 = i - c2794GoU.A02;
        ICk iCk = c2794GoU.A04;
        boolean A1Q = AnonymousClass001.A1Q(iCk.A03() - 1, i);
        Preconditions.checkElementIndex(i, iCk.A03());
        IAR A06 = iCk.A06(i);
        A06.getClass();
        int i3 = A06.A00;
        if (i3 != 1) {
            if (i3 == 2) {
                parcelable = A06.A01;
                c2397Gbz = new C2398Gc0();
                A05 = 1BK.A05();
                str = "single_montage_ad";
            } else if (i3 == 4) {
                7Mg r0 = c2794GoU.A03;
                c2397Gbz = new C2396Gby();
                A05 = 1BK.A05();
                A05.putInt("position_arg", i2);
                A05.putBoolean("is_end_card_arg", A1Q);
                A05.putString("montage_viewer_launch_source_arg", r0.toString());
            } else {
                if (i3 == 5) {
                    return new C2803Gog();
                }
                if (i3 == 6) {
                    c2397Gbz = new 8uN();
                    A05 = 1BK.A05();
                    A05.putInt("position_arg", i2);
                    A05.putBoolean("is_end_card_arg", A1Q);
                } else {
                    if (i3 != 7) {
                        throw 4YV.A0h("Unknown page item mode: ", i3);
                    }
                    MontageNoteBucketPreview montageNoteBucketPreview = A06.A03;
                    if (montageNoteBucketPreview == null) {
                        throw AnonymousClass001.A0N("Montage Note Bucket Preview is null");
                    }
                    RichStatus richStatus = montageNoteBucketPreview.A00;
                    User user = montageNoteBucketPreview.A01;
                    C2fd c2fd = montageNoteBucketPreview.A02;
                    NavigationTrigger A00 = NavigationTrigger.A00(AnonymousClass539.A6J, c2794GoU.A03.toString());
                    11T.A0F(richStatus, 0);
                    1BL.A1F(user, c2fd);
                    c2397Gbz = new 8uM();
                    A05 = 1BK.A05();
                    A05.putParcelable(7zK.A00(14), new OpaqueParcelable(richStatus));
                    A05.putParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER, new OpaqueParcelable(user));
                    A05.putSerializable("tile_badge", c2fd);
                    parcelable = 0Gm.A00(A00);
                    str = "navigation_trigger";
                }
            }
            A05.putParcelable(str, parcelable);
        } else {
            MontageBucket montageBucket = A06.A02;
            int i4 = c2794GoU.A01;
            c2397Gbz = new C2397Gbz();
            A05 = 1BK.A05();
            A05.putParcelable("montage_message_info", montageBucket);
            A05.putInt("extra_render_destination", i4);
        }
        c2397Gbz.setArguments(A05);
        return c2397Gbz;
    }
}
