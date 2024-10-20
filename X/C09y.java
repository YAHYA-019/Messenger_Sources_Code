package X;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentState;

/* renamed from: X.09y, reason: invalid class name */
/* loaded from: 09y.class */
public final class C09y {
    public final Fragment A02;
    public final C06h A03;
    public final C06a A04;
    public boolean A01 = false;
    public int A00 = -1;

    public C09y(Bundle bundle, C06l c06l, C06h c06h, C06a c06a, ClassLoader classLoader) {
        this.A03 = c06h;
        this.A04 = c06a;
        Fragment A00 = ((FragmentState) bundle.getParcelable("state")).A00(c06l, classLoader);
        this.A02 = A00;
        A00.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        A00.setArguments(bundle2);
        if (06Z.A0O(2)) {
            AnonymousClass002.A0X(A00, "Instantiated fragment ", AnonymousClass001.A0k());
        }
    }

    public C09y(Bundle bundle, Fragment fragment, C06h c06h, C06a c06a) {
        this.A03 = c06h;
        this.A04 = c06a;
        this.A02 = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    public C09y(Fragment fragment, C06h c06h, C06a c06a) {
        this.A03 = c06h;
        this.A04 = c06a;
        this.A02 = fragment;
    }

    private void A00() {
        View view;
        if (06Z.A0O(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.A02);
            android.util.Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.A02;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.A03.A0D(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    private void A01() {
        Fragment fragment = this.A02;
        if (fragment.mView != null) {
            if (06Z.A0O(2)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Saving view state for fragment ");
                A0k.append(fragment);
                A0k.append(" with view ");
                A0k.append(fragment.mView);
                AnonymousClass001.A17(A0k);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            fragment.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                fragment.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            fragment.mViewLifecycleOwner.A02(bundle);
            if (bundle.isEmpty()) {
                return;
            }
            fragment.mSavedViewRegistryState = bundle;
        }
    }

    public Bundle A02() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.A02;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.A03.A04(bundle3, fragment, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.A02(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle A0V = fragment.mChildFragmentManager.A0V();
            if (!A0V.isEmpty()) {
                bundle2.putBundle("childFragmentManager", A0V);
            }
            if (fragment.mView != null) {
                A01();
            }
            SparseArray<? extends Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public Fragment.SavedState A03() {
        if (this.A02.mState > -1) {
            return new Fragment.SavedState(A02());
        }
        return null;
    }

    public Fragment A04() {
        return this.A02;
    }

    public void A05() {
        Fragment fragment = this.A02;
        Fragment A03 = 06Z.A03(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (A03 != null && !A03.equals(parentFragment)) {
            0AW.A08(fragment, A03, fragment.mContainerId);
        }
        fragment.mContainer.addView(fragment.mView, this.A04.A00(fragment));
    }

    public void A06() {
        Fragment fragment = this.A02;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (06Z.A0O(3)) {
                android.util.Log.d("FragmentManager", AnonymousClass001.A0Z(fragment, "moveto CREATE_VIEW: ", AnonymousClass001.A0k()));
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(2131364230, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.A03.A00(bundle2, fragment.mView, fragment, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:448:0x00a4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0a9a, code lost:
    
        if (r0.isInBackStack() != false) goto L576;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0077. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:450:0x076c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07() {
        /*
            Method dump skipped, instructions count: 4104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09y.A07():void");
    }

    public void A08(ClassLoader classLoader) {
        Fragment fragment = this.A02;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
                fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
                FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
                if (fragmentState != null) {
                    fragment.mTargetWho = fragmentState.A05;
                    fragment.mTargetRequestCode = fragmentState.A03;
                    Boolean bool = fragment.mSavedUserVisibleHint;
                    if (bool != null) {
                        fragment.mUserVisibleHint = bool.booleanValue();
                        fragment.mSavedUserVisibleHint = null;
                    } else {
                        fragment.mUserVisibleHint = fragmentState.A0C;
                    }
                }
                if (fragment.mUserVisibleHint) {
                    return;
                }
                fragment.mDeferStart = true;
            } catch (BadParcelableException e) {
                throw new IllegalStateException(AnonymousClass001.A0Z(fragment, "Failed to restore view hierarchy state for fragment ", AnonymousClass001.A0k()), e);
            }
        }
    }
}
