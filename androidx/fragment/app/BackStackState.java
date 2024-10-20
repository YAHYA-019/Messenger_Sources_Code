package androidx.fragment.app;

import X.06Z;
import X.0qB;
import X.AnonymousClass001;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: BackStackState.class */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qB(1);
    public final List A00;
    public final List A01;

    public BackStackState(Parcel parcel) {
        this.A00 = parcel.createStringArrayList();
        this.A01 = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    public BackStackState(List list, List list2) {
        this.A00 = list;
        this.A01 = list2;
    }

    public ArrayList A00(06Z r302, Map map) {
        List list = this.A00;
        HashMap hashMap = new HashMap(list.size());
        for (Object obj : list) {
            Fragment fragment = (Fragment) map.get(obj);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                Bundle bundle = (Bundle) r302.A0T.A02.remove(obj);
                if (bundle != null) {
                    ClassLoader classLoader = r302.A05.A01.getClassLoader();
                    Fragment A00 = ((FragmentState) bundle.getParcelable("state")).A00(r302.A0d(), classLoader);
                    A00.mSavedFragmentState = bundle;
                    if (bundle.getBundle("savedInstanceState") == null) {
                        A00.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle2 = bundle.getBundle("arguments");
                    if (bundle2 != null) {
                        bundle2.setClassLoader(classLoader);
                    }
                    A00.setArguments(bundle2);
                    hashMap.put(A00.mWho, A00);
                }
            }
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            A0s.add(((BackStackRecordState) it.next()).A02(r302, hashMap));
        }
        return A0s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A00);
        parcel.writeTypedList(this.A01);
    }
}
